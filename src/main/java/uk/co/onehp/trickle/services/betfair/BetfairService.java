package uk.co.onehp.trickle.services.betfair;

import uk.co.onehp.trickle.domain.Bet;


public interface BetfairService {

	void login();
	void viewProfile();
	void getUkMarket();
	void getMeeting(int meetingId);
	void getRace(int raceId);
	void getRacePrices(int raceId);
	void placeBet(Bet bet);
}
