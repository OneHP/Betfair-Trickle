package uk.co.onehp.trickle.services.domain;

import java.util.List;

import org.joda.time.LocalDateTime;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.domain.Strategy;

public interface DomainService {
	List<Meeting> getAllMeetings();
	List<Race> getAllRaces();
	List<Bet> getIncompleteBets();
	LocalDateTime getNextBetTime();
	List<Bet> getBetsToPlace();
	List<Bet> getUpcomingBetsToPlace();
	void updateBet(Bet bet);
	List<Strategy> getAllStrategies();
	void saveStrategy(Strategy strategy);
	void deleteStrategy(Strategy strategy);
	void deleteBet(Bet bet);
	void deleteIncompleteBets();
}
