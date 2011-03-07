package uk.co.onehp.trickle.dao;

import uk.co.onehp.trickle.domain.Market;

public interface MarketDao {

	void saveOrUpdate(Market market);
	
	Market getMarket(final int id);
}
