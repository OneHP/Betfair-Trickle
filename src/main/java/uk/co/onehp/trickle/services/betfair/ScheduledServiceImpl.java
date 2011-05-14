/*
 * Betfair Trickle. Automatic bet placement application. Copyright (C) 2011
 * Thomas Inman. This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version. This program is distributed in the hope that it
 * will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details. You should have received a copy of the GNU
 * General Public License along with this program; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package uk.co.onehp.trickle.services.betfair;

import java.text.ParseException;
import java.util.Date;

import org.apache.log4j.Logger;
import org.joda.time.LocalDateTime;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.quartz.CronTriggerBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;

import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.services.domain.DomainService;

@Service("scheduledService")
public class ScheduledServiceImpl implements ScheduledService {

	@Autowired
	BetfairService betfairService;

	@Autowired
	DomainService domainService;

	@Autowired
	SchedulerFactoryBean quartzScheduler;

	@Autowired
	CronTriggerBean placeBetsTrigger;

	@Autowired
	CronTriggerBean getPricesForUpcomingBetsTrigger;

	@Value("${upcomingBetsSeconds}")
	private int upcomingBetsSeconds;

	Logger log = Logger.getLogger(ScheduledServiceImpl.class);


	@Override
	@Scheduled(cron="0 30 0 * * *")
	public void archiveMeetings() {
		this.domainService.archiveMeetings();
	}

	@Override
	@Scheduled(cron="0 0 5 * * *")
	public void login(){
		this.betfairService.login();
	}

	@Override
	@Scheduled(cron="0 1 5 * * *")
	public void getUkMarket() {
		this.betfairService.getUkMarket();
	}

	@Override
	@Scheduled(cron="0 2 5 * * *")
	public void getAllMeetings() {
		for(Meeting meeting : this.domainService.getAllMeetings()){
			if(meeting.getRaces() == null || meeting.getRaces().size() == 0){
				this.betfairService.getMeeting(meeting.getEventId());
			}
		}
	}

	@Override
	@Scheduled(cron="0 5 5 * * *")
	public void getAllRaces() {
		LocalDateTime now = new LocalDateTime();
		for(Race race : this.domainService.getAllRaces()){
			if(race.getStartTime().isAfter(now)){
				this.betfairService.getRace(race.getEventId());
			}
		}
	}

	@Override
	@Scheduled(cron="0 0 6 * * *")
	public void getAllRacePrices() {
		LocalDateTime now = new LocalDateTime();
		for(Race race : this.domainService.getAllRaces()){
			if(race.getStartTime().isAfter(now)){
				this.betfairService.getRacePrices(race.getEventId());
			}
		}
	}

	@Override
	@Scheduled(cron="0 0 8 * * *")
	public void removeProblemMeetings(){
		this.domainService.removeProblemMeetings();
	}

	@Override
	public void scheduleNextBet() {
		Scheduler scheduler = this.quartzScheduler.getObject();
		try {
			this.placeBetsTrigger.setCronExpression(nextBetSchedule());
			Date date = scheduler.rescheduleJob(this.placeBetsTrigger.getName(),this.placeBetsTrigger.getGroup(),this.placeBetsTrigger);
			this.log.debug(date.toString());
		} catch (SchedulerException e) {
			this.log.error(e);
		} catch (ParseException e) {
			this.log.error(e);
		}
		try {
			this.getPricesForUpcomingBetsTrigger.setCronExpression(nextBetPriceSchedule());
			Date date = scheduler.rescheduleJob(this.getPricesForUpcomingBetsTrigger.getName(),this.getPricesForUpcomingBetsTrigger.getGroup(),this.getPricesForUpcomingBetsTrigger);
			this.log.debug(date.toString());
		} catch (SchedulerException e) {
			this.log.error(e);
		} catch (ParseException e) {
			this.log.error(e);
		}
	}

	private String nextBetSchedule() {
		LocalDateTime nextBetTime = this.domainService.getNextBetTime();
		if(null == nextBetTime){
			nextBetTime = new LocalDateTime().plusMinutes(1);
		}
		String cron = String.format("%s %s %s %s %s ?", nextBetTime.getSecondOfMinute(), nextBetTime.getMinuteOfHour()
				, nextBetTime.getHourOfDay(), nextBetTime.getDayOfMonth(), nextBetTime.getMonthOfYear());
		return cron;
	}

	private String nextBetPriceSchedule() {
		LocalDateTime nextBetTime = this.domainService.getNextBetTime();
		if(null == nextBetTime){
			nextBetTime = new LocalDateTime().plusMinutes(1);
		}else{
			nextBetTime = nextBetTime.minusSeconds(this.upcomingBetsSeconds);
		}
		String cron = String.format("%s %s %s %s %s ?", nextBetTime.getSecondOfMinute(), nextBetTime.getMinuteOfHour()
				, nextBetTime.getHourOfDay(), nextBetTime.getDayOfMonth(), nextBetTime.getMonthOfYear());
		return cron;
	}

}
