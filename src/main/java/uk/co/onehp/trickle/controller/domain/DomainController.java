package uk.co.onehp.trickle.controller.domain;

import java.util.List;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Strategy;

public interface DomainController {
	void saveStrategy(Strategy strategy);
	void saveBet(Bet bet);
	List<Strategy> getAllStrategies();
	List<Meeting> getAllMeetings();
	List<Bet> getIncompleteBets();
	void deleteStrategy(Strategy strategy);
	void deleteBet(Bet bet);
	void deleteIncompleteBets();
}
