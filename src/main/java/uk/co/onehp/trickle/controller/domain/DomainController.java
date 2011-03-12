package uk.co.onehp.trickle.controller.domain;

import java.util.List;

import uk.co.onehp.trickle.domain.Strategy;

public interface DomainController {
	void saveStrategy(Strategy strategy);
	List<Strategy> getAllStrategies();
}
