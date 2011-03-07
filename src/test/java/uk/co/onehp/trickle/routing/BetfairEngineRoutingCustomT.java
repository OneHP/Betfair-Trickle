package uk.co.onehp.trickle.routing;

import org.apache.camel.CamelExecutionException;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.co.onehp.trickle.services.betfair.BetfairService;

@Ignore
public class BetfairEngineRoutingCustomT {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws CamelExecutionException 
	 */
	public static void main(String[] args) throws CamelExecutionException, Exception {
		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
		"classpath:/spring-trickle.xml");
		final BetfairService betfairService = (BetfairService) applicationContext
		.getBean("betfairService");
		betfairService.login();
//		betfairService.getUkMarket();
//		betfairService.getMeeting(26676407);
//		betfairService.getRace(102267423);
//		betfairService.getRacePrices(102267423);
	}

}
