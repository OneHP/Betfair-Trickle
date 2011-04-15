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

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.onehp.trickle.dao.BetDao;
import uk.co.onehp.trickle.dao.MeetingDao;
import uk.co.onehp.trickle.dao.RaceDao;
import uk.co.onehp.trickle.dao.StrategyDao;
import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.domain.Strategy;
import uk.co.onehp.trickle.util.DateUtil;

@Service("domainService")
public class DomainServiceImpl implements DomainService {

	@Autowired
	private MeetingDao meetingDao;

	@Autowired
	private RaceDao raceDao;

	@Autowired
	private BetDao betDao;

	@Autowired
	private StrategyDao strategyDao;

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
		return nextBet.getHorse().getRace().getStartTime().minusSeconds(DateUtil.getMostSeconds(nextBet.getStrategy().getBetSecondsBeforeStartTime()));
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
	}

	@Override
	@Transactional
	public List<Bet> getUpcomingBetsToPlace() {
		return this.betDao.getUpcomingBetsToPlace();
	}

	@Override
	@Transactional
	public List<Strategy> getAllStrategies() {
		return this.strategyDao.findAllStrategies();
	}

	@Override
	@Transactional
	public void saveStrategy(Strategy strategy) {
		this.strategyDao.saveOrUpdate(strategy);
	}

	@Override
	@Transactional
	public List<Bet> getIncompleteBets() {
		return this.betDao.getIncompleteBets();
	}

	@Override
	@Transactional
	public void deleteStrategy(Strategy strategy) {
		this.strategyDao.deleteStrategy(strategy);
	}

	@Override
	@Transactional
	public void deleteBet(Bet bet) {
		this.betDao.deleteBet(bet);
	}

	@Override
	@Transactional
	public void deleteIncompleteBets() {
		this.betDao.deleteIncompleteBets();
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

}
