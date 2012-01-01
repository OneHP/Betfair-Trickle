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

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;

@Entity
public class Horse extends MongoDomainObject {

	private int runnerId;
	private String name;
	@Embedded
	private List<Pricing> prices;
	@Embedded
	private BasicRace race;

	public Horse() {
	}

	public int getRunnerId() {
		return this.runnerId;
	}

	public void setRunnerId(final int runnerId) {
		this.runnerId = runnerId;
	}

	public int getRaceId() {
		return this.race.getEventId();
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public List<Pricing> getPrices() {
		return this.prices;
	}

	public void setPrices(final List<Pricing> prices) {
		this.prices = prices;
	}

	public void setRace(BasicRace race) {
		this.race = race;
	}

	public BasicRace getRace() {
		return this.race;
	}
}

