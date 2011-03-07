package uk.co.onehp.trickle.dao;

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
public class HibernateBetDao extends HibernateBaseDao implements BetDao {
	
	@Value("${upcomingBetsSeconds}")
	private int upcomingBetsSeconds;

	@Override
	public void saveOrUpdate(Bet bet) {
		super.saveOrUpdate(bet);
	}

	@Override
	public Bet getNextBet() {
		@SuppressWarnings("unchecked")
		List<Bet> bets = hibernateTemplate.findByNamedQuery("ALL_BETS");
		Collections.sort(bets, new Comparator<Bet>() {

			@Override
			public int compare(Bet o1, Bet o2) {
				int mostSeconds1 = DateUtil.getMostSeconds(o1.getUnprocessedTimings());
				int mostSeconds2= DateUtil.getMostSeconds(o2.getUnprocessedTimings());
				return o1.getHorse().getRace().getStartTime().minusSeconds(mostSeconds1).compareTo(o2.getHorse().getRace().getStartTime().minusSeconds(mostSeconds2));
			}
		});
		return bets.get(0);
	}

	@Override
	public List<Bet> getBetsToPlace() {
		@SuppressWarnings("unchecked")
		List<Bet> bets = hibernateTemplate.findByNamedQuery("ALL_BETS");
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
		@SuppressWarnings("unchecked")
		List<Bet> bets = hibernateTemplate.findByNamedQuery("ALL_BETS");
		List<Bet> filteredBets;
		filteredBets = Lists.newArrayList(Iterables.filter(bets, new Predicate<Bet>() {
			@Override
			public boolean apply(Bet bet) {
				return new LocalDateTime().isAfter(bet.getHorse().getRace().getStartTime().minusSeconds(DateUtil.getMostSeconds(bet.getUnprocessedTimings()) + upcomingBetsSeconds));
			}
		}));
		return filteredBets;
	}
}
