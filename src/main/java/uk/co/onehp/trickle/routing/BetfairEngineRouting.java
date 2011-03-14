/*
 * Betfair Trickle. Automatic bet placement application. Copyright (C) 2011
 * Thomas Inman. This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version. This program is distributed in the hope that it
 * will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details. You should have received a copy of the GNU
 * General Public License along with this program; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
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
