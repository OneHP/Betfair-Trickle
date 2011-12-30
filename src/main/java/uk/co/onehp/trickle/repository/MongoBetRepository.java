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

@Repository("betRepository")
public class MongoBetRepository extends AbstractMongoRepository implements BetRepository {

	@Value("${upcomingBetsSeconds}")
	private int upcomingBetsSeconds;

	@Override
	public void saveOrUpdate(Bet bet) {
		this.datastore.save(bet);
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
				return new LocalDateTime().isAfter(bet.getHorse().getRace().getStartTime().minusSeconds(DateUtil.getMostSeconds(bet.getUnprocessedTimings()) + MongoBetRepository.this.upcomingBetsSeconds));
			}
		}));
		return filteredBets;
	}

	@Override
	public List<Bet> getIncompleteBets() {
		return incompleteBets();
	}

	@Override
	public List<Bet> getCompleteBets() {
		return completeBets();
	}

	@Override
	public void deleteBet(Bet bet) {
		this.datastore.delete(bet);
	}

	@Override
	public void deleteIncompleteBets() {
		this.datastore.delete(incompleteBets());
	}

	@Override
	public void wipeBets() {
		this.datastore.delete(allBets());
	}

	private List<Bet> allBets(){
		return this.datastore.find(Bet.class).asList();
	}

	private List<Bet> completeBets(){
		return this.datastore.find(Bet.class).field("complete").equal(true).asList();
	}

	private List<Bet> incompleteBets(){
		return this.datastore.find(Bet.class).field("complete").equal(false).asList();
	}

}
