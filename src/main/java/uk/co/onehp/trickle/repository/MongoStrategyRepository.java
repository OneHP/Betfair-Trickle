package uk.co.onehp.trickle.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.Strategy;

@Repository("strategyRepository")
public class MongoStrategyRepository extends AbstractMongoRepository implements
StrategyRepository {

	@Override
	public void saveOrUpdate(Strategy strategy) {
		this.datastore.save(strategy);
	}

	@Override
	public void deleteStrategy(Strategy strategy) {
		strategy.markDeleted();
		this.datastore.save(strategy);
	}

	@Override
	public List<Strategy> findAllStrategies() {
		return this.datastore.find(Strategy.class).field("deleted").equal(false).asList();
	}

}
