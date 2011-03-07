package uk.co.onehp.trickle.services.domain;

import java.util.List;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.onehp.trickle.dao.BetDao;
import uk.co.onehp.trickle.dao.MeetingDao;
import uk.co.onehp.trickle.dao.RaceDao;
import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.util.DateUtil;

@Service("domainService")
public class DomainServiceImpl implements DomainService {

	@Autowired
	MeetingDao meetingDao;
	
	@Autowired
	RaceDao raceDao;
	
	@Autowired
	BetDao betDao;
	
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
	

}
