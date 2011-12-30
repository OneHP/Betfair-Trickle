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

import org.joda.time.LocalDateTime;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.Horse;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.domain.Strategy;
import uk.co.onehp.trickle.repository.BetRepository;
import uk.co.onehp.trickle.repository.RaceRepository;

import com.google.common.collect.Lists;

public class HibernateBetDaoCustomT {

	@Ignore
	public static void main(final String[] args) {
		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
		"classpath:/spring-trickle.xml");
		final BetRepository betDao = (BetRepository) applicationContext
		.getBean("betDao");

		final RaceRepository raceDao = (RaceRepository) applicationContext
		.getBean("raceDao");

		final Race race = new Race(867, "Race", new LocalDateTime(2012,2,22,19,19,0), "meeting");

		final Horse horse = new Horse();
		horse.setRunnerId(441);
		horse.setRaceId(867);

		horse.setRace(race);
		race.addHorse(horse);

		final Strategy strategy1 = new Strategy();
		strategy1.setBetSecondsBeforeStartTime(Lists.newArrayList(120,270,600));

		final Strategy strategy2 = new Strategy();
		strategy2.setBetSecondsBeforeStartTime(Lists.newArrayList(120,270,700));

		raceDao.saveOrUpdate(race);

		final Bet bet1 = new Bet(horse, strategy1);
		betDao.saveOrUpdate(bet1);

		final Bet bet2 = new Bet(horse, strategy2);
		betDao.saveOrUpdate(bet2);

		System.out.println(betDao.getBetsToPlace());
	}


}
