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
package uk.co.onehp.trickle.dao;

import java.math.BigDecimal;

import org.joda.time.LocalDateTime;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.co.onehp.trickle.domain.BettingAspect;
import uk.co.onehp.trickle.domain.Horse;
import uk.co.onehp.trickle.domain.Market;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Pricing;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.repository.HorseRepository;
import uk.co.onehp.trickle.repository.MarketRepository;

import com.google.common.collect.Lists;


public class MongoMarketDaoCustomT {

	@Ignore
	public static void main(final String[] args) {
		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
		"classpath:/spring-trickle.xml");
		final MarketRepository marketRepository = (MarketRepository) applicationContext
		.getBean("marketRepository");
		final HorseRepository horseRepository = (HorseRepository) applicationContext
		.getBean("horseRepository");

		final Market market = new Market(7483, "Market");
		final Meeting meeting = new Meeting(234, "Meeting");
		final Race race = new Race(867, "Race", new LocalDateTime(), "meeting");
		final Horse horse = new Horse();
		final Pricing pricing = new Pricing(new BigDecimal("3.45"), new BigDecimal("3090.96"), BettingAspect.BACK);

		horse.setRunnerId(441);
		horse.setRace(race);
		horse.setPrices(Lists.newArrayList(pricing));

		race.addHorse(horse);

		meeting.addRace(race);

		market.addMeeting(meeting);

		marketRepository.saveOrUpdate(market);
		System.out.println(marketRepository.getMarket(7483));
	}

}
