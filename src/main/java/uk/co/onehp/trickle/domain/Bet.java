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
package uk.co.onehp.trickle.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.Type;

import com.google.common.collect.Lists;

@Entity
@NamedQueries({
	@NamedQuery(name="INCOMPLETE_BETS", query="FROM Bet WHERE complete = 'false'"),
	@NamedQuery(name="COMPLETE_BETS", query="FROM Bet WHERE complete = 1"),
	@NamedQuery(name="ALL_BETS", query="FROM Bet")
})
public class Bet extends BaseDomainObject{

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	private int id;
	@OneToOne(fetch=FetchType.EAGER)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Horse horse;
	@Transient
	private Strategy strategy;
	@OneToMany(fetch=FetchType.EAGER)
	@Cascade(CascadeType.ALL)
	@IndexColumn(name="TIMINGS")
	private List<BetTiming> timings;
	@Type(type="boolean")
	private boolean complete;
	@OneToMany(fetch=FetchType.EAGER)
	@Cascade(CascadeType.ALL)
	@IndexColumn(name="LOGS")
	private List<BetLog> betLogs;

	public Bet(){

	}

	public Bet(Horse horse, Strategy strategy){
		this.horse = horse;
		this.strategy = strategy;
		setTimings(secondsToTimings(strategy.getBetSecondsBeforeStartTime()));
		this.complete = false;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public Horse getHorse() {
		return this.horse;
	}
	public void setHorse(Horse horse) {
		this.horse = horse;
	}
	public Strategy getStrategy() {
		return this.strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void setTimings(List<BetTiming> timings) {
		this.timings = timings;
	}
	public List<BetTiming> getTimings() {
		return this.timings;
	}

	private List<BetTiming> secondsToTimings(List<Integer> seconds){
		final List<BetTiming> timings = Lists.newArrayList();
		for(Integer integer : seconds){
			timings.add(new BetTiming(integer));
		}
		return timings;
	}

	public List<Integer> getUnprocessedTimings(){
		final List<Integer> seconds = Lists.newArrayList();
		for(BetTiming timing : this.timings){
			if(timing != null && !timing.isProcessed()){
				seconds.add(timing.getSecondsBeforeOff());
			}
		}
		return seconds;
	}

	public int getNumberOfSplits(){
		final List<Integer> seconds = Lists.newArrayList();
		for(BetTiming timing : this.timings){
			if(timing != null){
				seconds.add(timing.getSecondsBeforeOff());
			}
		}
		return seconds.size();
	}

	public void markTimingProcessed(int seconds){
		for(BetTiming timing : this.timings){
			if(timing != null && timing.getSecondsBeforeOff() == seconds){
				timing.markAsProcessed();
				if(getUnprocessedTimings().size() == 0){
					this.complete = true;
				}
				return;
			}
		}
	}

	public void addLog(BetLog betLog){
		if(null == this.betLogs){
			this.betLogs = Lists.newArrayList(betLog);
		}else{
			this.betLogs.add(betLog);
		}
	}

	public List<BetLog> getBetLogs(){
		return this.betLogs;
	}
}
