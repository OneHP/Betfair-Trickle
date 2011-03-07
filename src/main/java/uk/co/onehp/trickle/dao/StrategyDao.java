package uk.co.onehp.trickle.dao;

import java.util.List;

import uk.co.onehp.trickle.domain.Strategy;

public interface StrategyDao {

	void saveOrUpdate(Strategy strategy);
	
	List<Strategy> findAllStrategies();
}
