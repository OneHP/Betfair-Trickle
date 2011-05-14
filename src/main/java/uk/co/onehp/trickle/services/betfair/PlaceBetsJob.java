package uk.co.onehp.trickle.services.betfair;

import java.util.List;

import org.apache.log4j.Logger;
import org.joda.time.LocalDateTime;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.quartz.QuartzJobBean;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.services.domain.DomainService;

@Configurable(preConstruction=true)
public class PlaceBetsJob extends QuartzJobBean{

	@Autowired
	BetfairService betfairService;

	@Autowired
	DomainService domainService;

	Logger log = Logger.getLogger(PlaceBetsJob.class);

	@Override
	protected void executeInternal(JobExecutionContext arg0)
	throws JobExecutionException {
		List<Bet> bets = this.domainService.getBetsToPlace();
		final LocalDateTime now = new LocalDateTime();
		for(Bet bet : bets){
			for(Integer secondsBeforeOff : bet.getUnprocessedTimings()){
				if(now.isAfter(bet.getHorse().getRace().getStartTime().minusSeconds(secondsBeforeOff))){
					bet.markTimingProcessed(secondsBeforeOff);
					this.domainService.updateBet(bet);
					this.betfairService.placeBet(bet);
				}
			}
		}
	}
}
