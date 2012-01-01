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

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Serialized;

@Embedded
public class Pricing extends MongoDomainObject {

	@Serialized
	private BigDecimal price;
	@Serialized
	private BigDecimal amountAvailable;
	@Serialized
	private BettingAspect bettingAspect;

	public Pricing(){

	}

	public Pricing(BigDecimal price, BigDecimal amountAvailable, BettingAspect bettingAspect){
		this.price = price;
		this.amountAvailable = amountAvailable;
		this.bettingAspect = bettingAspect;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setAmountAvailable(BigDecimal amountAvailable) {
		this.amountAvailable = amountAvailable;
	}

	public BigDecimal getAmountAvailable() {
		return this.amountAvailable;
	}

	public void setBettingAspect(BettingAspect bettingAspect) {
		this.bettingAspect = bettingAspect;
	}

	public BettingAspect getBettingAspect() {
		return this.bettingAspect;
	}
}
