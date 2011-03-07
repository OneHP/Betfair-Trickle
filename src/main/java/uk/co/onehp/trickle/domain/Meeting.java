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

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.NamedQuery;

import com.google.common.collect.Lists;

@Entity
@NamedQuery(name="ALL_MEETINGS", query="FROM Meeting")
public class Meeting extends BaseDomainObject {

	@Id
	private final int eventId;
	private final String name;
	@OneToMany(fetch=FetchType.EAGER)
	@Cascade(CascadeType.SAVE_UPDATE)
	@IndexColumn(name="RACES")
	private List<Race> races;
	@ManyToOne
	private Market market;

	public Meeting(){
		eventId = 0;
		name = "";
	}
	
	public Meeting(int eventId, String name){
		this.eventId = eventId;
		this.name = name;
	}
	
	public int getEventId() {
		return eventId;
	}


	public String getName() {
		return name;
	}

	public List<Race> getRaces() {
		return races;
	}
	
	public void addRace(Race race){
		if(null == races){
			races = Lists.newArrayList();
		}
		races.add(race);
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public Market getMarket() {
		return market;
	}
}
