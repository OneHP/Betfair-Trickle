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
package uk.co.onehp.trickle.services.domain;

import java.util.List;

import org.apache.log4j.Logger;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.domain.Strategy;
import uk.co.onehp.trickle.repository.BetRepository;
import uk.co.onehp.trickle.repository.MarketRepository;
import uk.co.onehp.trickle.repository.MeetingRepository;
import uk.co.onehp.trickle.repository.RaceRepository;
import uk.co.onehp.trickle.repository.StrategyRepository;
import uk.co.onehp.trickle.services.betfair.ScheduledService;
import uk.co.onehp.trickle.util.DateUtil;

import com.google.common.collect.Lists;

@Service("domainService")
public class DomainServiceImpl implements DomainService {

	@Autowired
	private ScheduledService scheduledService;

	@Autowired
	private MeetingRepository meetingDao;

	@Autowired
	private RaceRepository raceDao;

	@Autowired
	private BetRepository betDao;

	@Autowired
	private MarketRepository marketDao;

	@Autowired
	private StrategyRepository strategyRepository;

	Logger log = Logger.getLogger(DomainServiceImpl.class);

	@Override
	@Transactional
	public List<Meeting> getAllMeetings() {
		return this.meetingDao.getAllMeetings();
	}

	@Override
	@Transactional
	public List<Race> getAllRaces() {
		return this.raceDao.getAllRaces();
	}

	@Override
	@Transactional
	public LocalDateTime getNextBetTime() {
		final Bet nextBet = this.betDao.getNextBet();
		return null == nextBet ? null: nextBet.getHorse().getRace().getStartTime().minusSeconds(DateUtil.getMostSeconds(nextBet.getUnprocessedTimings()));
	}

	@Override
	@Transactional
	public List<Bet> getBetsToPlace() {
		return this.betDao.getBetsToPlace();
	}

	@Override
	@Transactional
	public void updateBet(Bet bet) {
		this.betDao.saveOrUpdate(bet);
		this.scheduledService.scheduleNextBet();
	}

	@Override
	@Transactional
	public List<Bet> getUpcomingBetsToPlace() {
		return this.betDao.getUpcomingBetsToPlace();
	}

	@Override
	@Transactional
	public List<Strategy> getAllStrategies() {
		return this.strategyRepository.findAllStrategies();
	}

	@Override
	@Transactional
	public void saveStrategy(Strategy strategy) {
		this.strategyRepository.saveOrUpdate(strategy);
	}

	@Override
	@Transactional
	public List<Bet> getIncompleteBets() {
		return this.betDao.getIncompleteBets();
	}

	@Override
	@Transactional
	public boolean deleteStrategy(Strategy strategy) {
		if(!strategyInUse(strategy)){
			this.strategyRepository.deleteStrategy(strategy);
			return true;
		}
		return false;

	}

	@Override
	@Transactional
	public void deleteBet(Bet bet) {
		this.betDao.deleteBet(bet);
		this.scheduledService.scheduleNextBet();
	}

	@Override
	@Transactional
	public void deleteIncompleteBets() {
		this.betDao.deleteIncompleteBets();
		this.scheduledService.scheduleNextBet();
	}

	@Override
	@Transactional
	public List<Bet> getCompleteBets() {
		return this.betDao.getCompleteBets();
	}

	@Override
	@Transactional
	public void archiveMeetings() {
		List<Meeting> allMeetings = this.meetingDao.getAllMeetings();
		for(Meeting meeting : allMeetings){
			if(meeting.getRaces().get(0).getStartTime().isBefore(new LocalDateTime().withHourOfDay(0).withMinuteOfHour(0))){
				for(Race race : meeting.getRaces()){
					race.markAsComplete();
					this.raceDao.saveOrUpdate(race);
				}
				meeting.markAsComplete();
				this.meetingDao.saveOrUpdate(meeting);
			}
		}
	}

	@Override
	@Transactional
	public void removeProblemMeetings() {
		List<Meeting> allMeetings = this.meetingDao.getAllMeetings();
		for(Meeting meeting : allMeetings){
			try{
				meeting.getRaces().get(0).getRunners().get(0).getName();
			}catch (NullPointerException nullPointer) {
				this.meetingDao.delete(meeting);
			}catch (IndexOutOfBoundsException indexOutOfBounds){
				this.meetingDao.delete(meeting);
			}
		}
	}

	@Override
	@Transactional
	public boolean strategyInUse(Strategy strategy) {
		List<Bet> incompleteBets = this.betDao.getIncompleteBets();
		List<Strategy> strategiesInUse = Lists.newArrayList();
		for(Bet bet : incompleteBets){
			if(!strategiesInUse.contains(bet.getStrategy())){
				strategiesInUse.add(bet.getStrategy());
			}
		}
		for(Strategy strategyInUse : strategiesInUse){
			if(strategyInUse.getId().equals(strategy.getId())){
				return true;
			}
		}
		return false;
	}

	@Override
	@Transactional
	public void wipeDatabase() {
		this.betDao.wipeBets();
		this.marketDao.wipeMarkets();
	}

	@Override
	@Transactional
	public void rebuildDatabase() {
		try {
			this.scheduledService.login();
			Thread.sleep(5*1000);
			this.scheduledService.getUkMarket();
			Thread.sleep(60*1000);
			this.scheduledService.getAllMeetings();
			Thread.sleep(5*60*1000);
			this.scheduledService.getAllRaces();
			Thread.sleep(25*60*1000);
			this.scheduledService.getAllRacePrices();
		} catch (InterruptedException e) {
			this.log.error(e);
		}
	}

	@Override
	@Transactional
	public void updatePrices() {
		this.scheduledService.getAllRacePrices();
	}

}
