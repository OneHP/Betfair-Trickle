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
		return meetingDao.getAllMeetings();
	}

	@Override
	@Transactional
	public List<Race> getAllRaces() {
		return raceDao.getAllRaces();
	}

	@Override
	@Transactional
	public LocalDateTime getNextBetTime() {
		final Bet nextBet = betDao.getNextBet();
		return nextBet.getHorse().getRace().getStartTime().minusSeconds(DateUtil.getMostSeconds(nextBet.getStrategy().getBetSecondsBeforeStartTime()));
	}

	@Override
	@Transactional
	public List<Bet> getBetsToPlace() {
		return betDao.getBetsToPlace();
	}

	@Override
	@Transactional
	public void updateBet(Bet bet) {
		betDao.saveOrUpdate(bet);
	}

	@Override
	@Transactional
	public List<Bet> getUpcomingBetsToPlace() {
		return betDao.getUpcomingBetsToPlace();
	}

	@Override
	public List<Strategy> getAllStrategies() {
		return strategyDao.findAllStrategies();
	}

	@Override
	public void saveStrategy(Strategy strategy) {
		strategyDao.saveOrUpdate(strategy);
	}

	@Override
	public List<Bet> getIncompleteBets() {
		return betDao.getIncompleteBets();
	}

	@Override
	public void deleteStrategy(Strategy strategy) {
		strategyDao.deleteStrategy(strategy);
	}

	@Override
	public void deleteBet(Bet bet) {
		betDao.deleteBet(bet);
	}
	

}
