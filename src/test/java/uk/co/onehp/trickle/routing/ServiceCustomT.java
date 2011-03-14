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

import org.apache.camel.CamelExecutionException;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.co.onehp.trickle.services.domain.DomainService;

@Ignore
public class ServiceCustomT {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws CamelExecutionException 
	 */
	public static void main(String[] args) throws CamelExecutionException, Exception {
		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
		"classpath:/spring-trickle.xml");
//		final BetfairService betfairService = (BetfairService) applicationContext
//		.getBean("betfairService");
		
//		final ScheduledService scheduledService = (ScheduledService) applicationContext
//		.getBean("scheduledService");
		
		final DomainService domainService = (DomainService) applicationContext
		.getBean("domainService");
		
		System.out.println(domainService.getCompleteBets());
		
//		scheduledService.login();
//		scheduledService.getUkMarket();
//		scheduledService.getAllMeetings();
//		scheduledService.getAllRaces();
//		scheduledService.getAllRacePrices();
		
//		final Strategy strategy = new Strategy();
//		strategy.setAspect(BettingAspect.BACK);
//		strategy.setBetSecondsBeforeStartTime(Lists.newArrayList(60,120,180));
//		strategy.setChasePriceByTick(0);
//		strategy.setLiability(new BigDecimal("6.00"));
//		strategy.setMaxOdds(new BigDecimal("1000"));
//		strategy.setMinOdds(new BigDecimal("1.01"));
//		
//		final Race race = new Race(102325207, "kemp 4:25", new LocalDateTime(2011,2,26,14,25,0));
//		final Horse horse = new Horse();
//		horse.setRaceId(102325207);
//		horse.setRunnerId(4512035);
//		horse.setRace(race);
//		horse.setPrices(Lists.newArrayList(new Pricing(new BigDecimal("1.09"),new BigDecimal("100.50"),BettingAspect.BACK),
//											new Pricing(new BigDecimal("1.08"),new BigDecimal("100.50"),BettingAspect.BACK),
//											new Pricing(new BigDecimal("1.01"),new BigDecimal("100.50"),BettingAspect.LAY),
//											new Pricing(new BigDecimal("1.02"),new BigDecimal("100.50"),BettingAspect.LAY)));
//		horse.setName("Captain Chris");
//		
//		final Bet bet = new  Bet(horse, strategy);
//		
//		betfairService.placeBet(bet);
	}

}
