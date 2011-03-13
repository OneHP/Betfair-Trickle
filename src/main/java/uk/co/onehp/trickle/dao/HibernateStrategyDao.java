package uk.co.onehp.trickle.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.Strategy;

@Repository("strategyDao")
public class HibernateStrategyDao extends HibernateBaseDao implements StrategyDao{

	@Override
	public void saveOrUpdate(Strategy strategy) {
		super.saveOrUpdate(strategy);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Strategy> findAllStrategies() {
		return hibernateTemplate.findByNamedQuery("ALL_STRATEGIES");
	}

	@Override
	public void deleteStrategy(Strategy strategy) {
		super.delete(strategy);
	}
	
}
