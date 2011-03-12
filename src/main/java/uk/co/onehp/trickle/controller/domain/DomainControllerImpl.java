package uk.co.onehp.trickle.controller.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import uk.co.onehp.trickle.domain.Strategy;
import uk.co.onehp.trickle.services.domain.DomainService;

@Controller("domainController")
public class DomainControllerImpl implements DomainController {
	
	@Autowired
	private DomainService domainService;
	
	@Override
	public void saveStrategy(Strategy strategy) {
		domainService.saveStrategy(strategy);
	}

	@Override
	public List<Strategy> getAllStrategies() {
		return domainService.getAllStrategies();
	}

}
