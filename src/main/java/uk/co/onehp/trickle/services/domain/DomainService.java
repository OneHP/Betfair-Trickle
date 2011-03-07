package uk.co.onehp.trickle.services.domain;

import java.util.List;

import org.joda.time.LocalDateTime;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Race;

public interface DomainService {
	List<Meeting> getAllMeetings();
	List<Race> getAllRaces();
	LocalDateTime getNextBetTime();
	List<Bet> getBetsToPlace();
	List<Bet> getUpcomingBetsToPlace();
	void updateBet(Bet bet);
}
