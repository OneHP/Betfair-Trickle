package uk.co.onehp.trickle.services.betfair;

import java.util.List;

import org.apache.log4j.Logger;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

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
			betfairService.getMeeting(meeting.getEventId());
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
