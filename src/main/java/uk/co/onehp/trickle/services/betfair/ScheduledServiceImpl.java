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

import java.util.List;

import org.apache.log4j.Logger;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.services.domain.DomainService;

@Service("scheduledService")
public class ScheduledServiceImpl implements ScheduledService {

	private String nextBetSchedule;
	
	@Autowired
	BetfairService betfairService;
	
	@Autowired
	DomainService domainService;
	
	Logger log = Logger.getLogger(ScheduledServiceImpl.class);
	
	@Override
	@Scheduled(cron="0 0 0 * * *")
	public void login(){
		betfairService.login();
	}
	
	@Override
	@Scheduled(cron="0 1 0 * * *")
	public void getUkMarket() {
		betfairService.getUkMarket();
	}

	@Override
	@Scheduled(cron="0 2 0 * * *")
	public void getAllMeetings() {
		for(Meeting meeting : domainService.getAllMeetings()){
			if(meeting.getRaces() == null || meeting.getRaces().size() == 0){
				betfairService.getMeeting(meeting.getEventId());
			}
		}
	}

	@Override
	@Scheduled(cron="0 5 0 * * *")
	public void getAllRaces() {
		LocalDateTime now = new LocalDateTime();
		for(Race race : domainService.getAllRaces()){
			if(race.getStartTime().isAfter(now)){
				betfairService.getRace(race.getEventId());
			}
		}
	}

	@Override
	@Scheduled(cron="0 45 0 * * *")
	public void getAllRacePrices() {
		LocalDateTime now = new LocalDateTime();
		for(Race race : domainService.getAllRaces()){
			if(race.getStartTime().isAfter(now)){
				betfairService.getRacePrices(race.getEventId());
			}
		}
	}

	@Override
	public void refreshNextBetSchedule() {
		LocalDateTime nextBetTime = domainService.getNextBetTime();
		nextBetSchedule = String.format("%s %s %s %s %s %s", nextBetTime.getSecondOfMinute(), nextBetTime.getMinuteOfHour()
				, nextBetTime.getHourOfDay(), nextBetTime.getDayOfMonth(), nextBetTime.getMonthOfYear(), nextBetTime.getYear());
		log.debug(nextBetSchedule);
	}

	@Override
	@Scheduled(cron="* * 7-21 * * * ")
	@Transactional
	public void placeBets() {
		List<Bet> bets = domainService.getBetsToPlace();
		final LocalDateTime now = new LocalDateTime();
		for(Bet bet : bets){
			for(Integer secondsBeforeOff : bet.getUnprocessedTimings()){
				if(now.isAfter(bet.getHorse().getRace().getStartTime().minusSeconds(secondsBeforeOff))){
					bet.markTimingProcessed(secondsBeforeOff);
					domainService.updateBet(bet);
					betfairService.placeBet(bet);
				}
			}
		}
	}

	@Override
	@Scheduled(cron="*/5 * 7-21 * * * ")
	public void getPricesForUpcomingBets() {
		List<Bet> bets = domainService.getUpcomingBetsToPlace();
		for(Bet bet : bets){
			betfairService.getRacePrices(bet.getHorse().getRaceId());
		}
	}
}
