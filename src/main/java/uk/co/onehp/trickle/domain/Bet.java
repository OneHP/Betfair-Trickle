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

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Reference;
import com.google.common.collect.Lists;

@Entity
public class Bet extends BaseDomainObject{

	@Reference
	private Horse horse;
	@Reference
	private Strategy strategy;
	@Reference
	private List<BetTiming> timings;
	private boolean complete;
	@Reference
	private List<BetLog> betLogs;

	public Bet(){

	}

	public Bet(Horse horse, Strategy strategy){
		this.horse = horse;
		this.strategy = strategy;
		setTimings(secondsToTimings(strategy.getBetSecondsBeforeStartTime()));
		this.setComplete(false);
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
					this.setComplete(true);
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

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public boolean isComplete() {
		return complete;
	}
}
