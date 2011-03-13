package uk.co.onehp.trickle.dao;

import java.util.List;

import uk.co.onehp.trickle.domain.Bet;

public interface BetDao {

	void saveOrUpdate(Bet bet);
	Bet getNextBet();
	List<Bet> getBetsToPlace();
	List<Bet> getUpcomingBetsToPlace();
	List<Bet> getIncompleteBets();
	void deleteBet(Bet bet);
}
