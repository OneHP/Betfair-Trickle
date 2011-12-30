package uk.co.onehp.trickle.repository;

import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.Market;

@Repository("marketRepository")
public class MongoMarketRepository extends AbstractMongoRepository implements
MarketRepository {

	@Override
	public void saveOrUpdate(Market market) {
		this.datastore.save(market);
	}

	@Override
	public Market getMarket(int marketId) {
		return this.datastore.find(Market.class).field("marketId").equal(marketId).get();
	}

	@Override
	public void wipeMarkets() {
		this.datastore.delete(this.datastore.find(Market.class));
	}

}
