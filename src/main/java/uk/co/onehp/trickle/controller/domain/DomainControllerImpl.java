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
package uk.co.onehp.trickle.controller.domain;

import java.util.List;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Strategy;
import uk.co.onehp.trickle.services.domain.DomainService;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

@Controller(value="domainController")
public class DomainControllerImpl implements DomainController {

	@Autowired
	private DomainService domainService;

	@Override
	public void saveStrategy(Strategy strategy) {
		this.domainService.saveStrategy(strategy);
	}

	@Override
	public List<Strategy> getAllStrategies() {
		return this.domainService.getAllStrategies();
	}

	@Override
	public List<Meeting> getAllMeetings() {
		return this.domainService.getAllMeetings();
	}

	@Override
	public void saveBet(Bet bet) {
		this.domainService.updateBet(bet);
	}

	@Override
	public List<Bet> getIncompleteBets() {
		return betsFromTodayOrLater(this.domainService.getIncompleteBets());
	}

	@Override
	public boolean deleteStrategy(Strategy strategy) {
		return this.domainService.deleteStrategy(strategy);
	}

	@Override
	public void deleteBet(Bet bet) {
		this.domainService.deleteBet(bet);
	}

	@Override
	public void deleteIncompleteBets() {
		this.domainService.deleteIncompleteBets();
	}

	@Override
	public List<Bet> getCompleteBets() {
		return betsFromTodayOrLater(this.domainService.getCompleteBets());
	}

	private List<Bet> betsFromTodayOrLater(List<Bet> bets) {
		List<Bet> filteredBets;
		filteredBets = Lists.newArrayList(Iterables.filter(bets, new Predicate<Bet>() {
			@Override
			public boolean apply(Bet bet) {
				return bet.getHorse().getRace().getStartTime().isAfter(new LocalDateTime().withHourOfDay(0).withMinuteOfHour(0).withSecondOfMinute(0));
			}
		}));
		return filteredBets;
	}

	@Override
	public void wipeDatabase() {
		this.domainService.wipeDatabase();
	}

	@Override
	public void rebuildDatabase() {
		this.domainService.rebuildDatabase();
	}

	@Override
	public void updatePrices() {
		this.domainService.updatePrices();
	}

}
