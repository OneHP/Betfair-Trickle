package uk.co.onehp.trickle.services.betfair;

public interface ScheduledService {
	void login();
	void getUkMarket();
	void getAllMeetings();
	void getAllRaces();
	void getAllRacePrices();
	void refreshNextBetSchedule();
	void placeBets();
	void getPricesForUpcomingBets();
}
