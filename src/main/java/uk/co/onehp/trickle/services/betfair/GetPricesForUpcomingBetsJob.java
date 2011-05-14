package uk.co.onehp.trickle.services.betfair;

import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.quartz.QuartzJobBean;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.services.domain.DomainService;

@Configurable(preConstruction=true)
public class GetPricesForUpcomingBetsJob extends QuartzJobBean{

	@Autowired
	BetfairService betfairService;

	@Autowired
	DomainService domainService;

	Logger log = Logger.getLogger(GetPricesForUpcomingBetsJob.class);

	@Override
	protected void executeInternal(JobExecutionContext arg0)
	throws JobExecutionException {
		List<Bet> bets = this.domainService.getUpcomingBetsToPlace();
		for(Bet bet : bets){
			this.betfairService.getRacePrices(bet.getHorse().getRaceId());
		}
	}
}
