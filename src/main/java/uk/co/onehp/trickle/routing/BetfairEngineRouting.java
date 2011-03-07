package uk.co.onehp.trickle.routing;

import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.betfair.publicapi.types.exchange.v5.GetMarketPricesReq;
import com.betfair.publicapi.types.exchange.v5.GetMarketReq;
import com.betfair.publicapi.types.exchange.v5.PlaceBetsReq;
import com.betfair.publicapi.types.global.v3.GetEventsReq;
import com.betfair.publicapi.types.global.v3.LoginReq;
import com.betfair.publicapi.types.global.v3.ViewProfileReq;

@Component("betfairEngineRouting")
public class BetfairEngineRouting extends RouteBuilder{

	@Value("${loginThrottle}")
	private int loginThrottle; 
	
	@Value("${viewProfileThrottle}")
	private int viewProfileThrottle;
	
	@Value("${getEventsThrottle}")
	private int getEventsThrottle;
	
	@Value("${getMarketThrottle}")
	private int getMarketThrottle;
	
	@Value("${getMarketPricesThrottle}")
	private int getMarketPricesThrottle;
	
	@Value("${placeBetsThrottle}")
	private int placeBetsThrottle;
	
	@Override
	public void configure() throws Exception {
		from("jms:betfair").setHeader("JMSXGroupID", new Expression() {
			@Override
			public <T> T evaluate(Exchange arg0, Class<T> arg1) {
				return null;
			}
		}).choice()
			.when(header("requestType").isEqualTo(LoginReq.class.toString()))
				.to("jms:login")
			.when(header("requestType").isEqualTo(ViewProfileReq.class.toString()))
				.to("jms:viewProfile")
			.when(header("requestType").isEqualTo(GetEventsReq.class.toString()))
				.to("jms:getEvents")
			.when(header("requestType").isEqualTo(GetMarketReq.class.toString()))
				.to("jms:getMarket")
			.when(header("requestType").isEqualTo(GetMarketPricesReq.class.toString()))
				.to("jms:getMarketPrices")
			.when(header("requestType").isEqualTo(PlaceBetsReq.class.toString()))
				.to("jms:placeBets")
			.otherwise()
				.to("jms:dead")
			.end();
		from("jms:login").throttle(loginThrottle).timePeriodMillis(60000).beanRef("loginService", "login").end();
		from("jms:viewProfile").throttle(viewProfileThrottle).timePeriodMillis(60000).beanRef("profileService", "viewProfile").end();
		from("jms:getEvents").throttle(getEventsThrottle).timePeriodMillis(60000).beanRef("eventsService", "getEvents").end();
		from("jms:getMarket").throttle(getMarketThrottle).timePeriodMillis(60000).beanRef("marketService", "getMarket").end();
		from("jms:getMarketPrices").throttle(getMarketPricesThrottle).timePeriodMillis(60000).beanRef("marketPricesService", "getMarketPrices").end();
		from("jms:placeBets").throttle(placeBetsThrottle).timePeriodMillis(60000).beanRef("placeBetsService", "placeBets").end();
	}
}
