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
package uk.co.onehp.trickle.repository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.util.DateUtil;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

@Repository("betDao")
@SuppressWarnings("unchecked")
public class HibernateBetDao extends HibernateBaseDao implements BetRepository {

	@Value("${upcomingBetsSeconds}")
	private int upcomingBetsSeconds;

	@Override
	public void saveOrUpdate(Bet bet) {
		super.saveOrUpdate(bet);
	}

	@Override
	public Bet getNextBet() {
		List<Bet> bets = incompleteBets();
		Collections.sort(bets, new Comparator<Bet>() {

			@Override
			public int compare(Bet o1, Bet o2) {
				int mostSeconds1 = DateUtil.getMostSeconds(o1.getUnprocessedTimings());
				int mostSeconds2= DateUtil.getMostSeconds(o2.getUnprocessedTimings());
				return o1.getHorse().getRace().getStartTime().minusSeconds(mostSeconds1).compareTo(o2.getHorse().getRace().getStartTime().minusSeconds(mostSeconds2));
			}
		});
		return bets.size() > 0 ? bets.get(0) : null;
	}

	@Override
	public List<Bet> getBetsToPlace() {
		List<Bet> bets = incompleteBets();
		List<Bet> filteredBets;
		filteredBets = Lists.newArrayList(Iterables.filter(bets, new Predicate<Bet>() {
			@Override
			public boolean apply(Bet bet) {
				return new LocalDateTime().isAfter(bet.getHorse().getRace().getStartTime().minusSeconds(DateUtil.getMostSeconds(bet.getUnprocessedTimings())));
			}
		}));
		return filteredBets;
	}

	@Override
	public List<Bet> getUpcomingBetsToPlace() {
		List<Bet> bets = incompleteBets();
		List<Bet> filteredBets;
		filteredBets = Lists.newArrayList(Iterables.filter(bets, new Predicate<Bet>() {
			@Override
			public boolean apply(Bet bet) {
				return new LocalDateTime().isAfter(bet.getHorse().getRace().getStartTime().minusSeconds(DateUtil.getMostSeconds(bet.getUnprocessedTimings()) + HibernateBetDao.this.upcomingBetsSeconds));
			}
		}));
		return filteredBets;
	}

	@Override
	public List<Bet> getIncompleteBets() {
		return incompleteBets();
	}

	@Override
	public void deleteBet(Bet bet) {
		super.delete(bet);
	}

	@Override
	public void deleteIncompleteBets() {
		this.hibernateTemplate.deleteAll(this.hibernateTemplate.findByNamedQuery("INCOMPLETE_BETS"));
	}

	@Override
	public List<Bet> getCompleteBets() {
		return completeBets();
	}

	@Override
	public void wipeBets() {
		this.hibernateTemplate.deleteAll(allBets());
	}

	private List<Bet> allBets(){
		return this.hibernateTemplate.findByNamedQuery("ALL_BETS");
	}

	private List<Bet> completeBets(){
		return this.hibernateTemplate.findByNamedQuery("COMPLETE_BETS");
	}

	private List<Bet> incompleteBets(){
		return this.hibernateTemplate.findByNamedQuery("INCOMPLETE_BETS");
	}

}
