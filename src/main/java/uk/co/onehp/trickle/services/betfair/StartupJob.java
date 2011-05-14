package uk.co.onehp.trickle.services.betfair;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.quartz.QuartzJobBean;

@Configurable(preConstruction=true)
public class StartupJob extends QuartzJobBean {

	@Autowired
	ScheduledService scheduledService;

	Logger log = Logger.getLogger(StartupJob.class);

	@Override
	protected void executeInternal(JobExecutionContext arg0)
	throws JobExecutionException {
		this.scheduledService.scheduleNextBet();
	}
}