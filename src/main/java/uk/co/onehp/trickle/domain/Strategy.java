/*
 * Betfair Trickle. Automatic bet placement application. Copyright (C) 2010
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

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.Type;

@Entity
@NamedQuery(name="ALL_STRATEGIES", query="FROM Strategy")
public class Strategy extends BaseDomainObject {
	
	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	private int id;
	private String description;
	private BigDecimal liability;
	private BigDecimal minOdds;
	private BigDecimal maxOdds;
	private BettingAspect aspect;
	@Type(type="boolean")
	private boolean useStartingPrice;
	private int chasePriceByTick;
	@CollectionOfElements(fetch=FetchType.EAGER)
	private List<Integer> betSecondsBeforeStartTime;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public BigDecimal getLiability() {
		return liability;
	}

	public void setLiability(BigDecimal liability) {
		this.liability = liability;
	}

	public BettingAspect getAspect() {
		return aspect;
	}

	public void setAspect(BettingAspect aspect) {
		this.aspect = aspect;
	}

	public Boolean getUseStartingPrice() {
		return useStartingPrice;
	}

	public void setUseStartingPrice(Boolean useStartingPrice) {
		this.useStartingPrice = useStartingPrice;
	}

	public void setChasePriceByTick(int chasePriceByTick) {
		this.chasePriceByTick = chasePriceByTick;
	}

	public int getChasePriceByTick() {
		return chasePriceByTick;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getMinOdds() {
		return minOdds;
	}

	public void setMinOdds(BigDecimal minOdds) {
		this.minOdds = minOdds;
	}

	public BigDecimal getMaxOdds() {
		return maxOdds;
	}

	public void setMaxOdds(BigDecimal maxOdds) {
		this.maxOdds = maxOdds;
	}

	public List<Integer> getBetSecondsBeforeStartTime() {
		return betSecondsBeforeStartTime;
	}

	public void setBetSecondsBeforeStartTime(List<Integer> betSecondsBeforeStartTime) {
		this.betSecondsBeforeStartTime = betSecondsBeforeStartTime;
	}
}
