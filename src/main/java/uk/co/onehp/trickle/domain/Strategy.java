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

import java.math.BigDecimal;
import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Serialized;

@Entity
public class Strategy extends BaseDomainObject {

	@Id
	private ObjectId id;
	private String description;
	@Serialized
	private BigDecimal liability;
	@Serialized
	private BigDecimal minOdds;
	@Serialized
	private BigDecimal maxOdds;
	@Embedded
	private BettingAspect aspect;
	private int chasePriceByTick;
	@Serialized
	private List<Integer> betSecondsBeforeStartTime;
	private boolean deleted;

	public void markDeleted(){
		this.setDeleted(true);
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public ObjectId getId() {
		return this.id;
	}

	public BigDecimal getLiability() {
		return this.liability;
	}

	public void setLiability(BigDecimal liability) {
		this.liability = liability;
	}

	public BettingAspect getAspect() {
		return this.aspect;
	}

	public void setAspect(BettingAspect aspect) {
		this.aspect = aspect;
	}

	public void setChasePriceByTick(int chasePriceByTick) {
		this.chasePriceByTick = chasePriceByTick;
	}

	public int getChasePriceByTick() {
		return this.chasePriceByTick;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getMinOdds() {
		return this.minOdds;
	}

	public void setMinOdds(BigDecimal minOdds) {
		this.minOdds = minOdds;
	}

	public BigDecimal getMaxOdds() {
		return this.maxOdds;
	}

	public void setMaxOdds(BigDecimal maxOdds) {
		this.maxOdds = maxOdds;
	}

	public List<Integer> getBetSecondsBeforeStartTime() {
		return this.betSecondsBeforeStartTime;
	}

	public void setBetSecondsBeforeStartTime(List<Integer> betSecondsBeforeStartTime) {
		this.betSecondsBeforeStartTime = betSecondsBeforeStartTime;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return this.deleted;
	}
}
