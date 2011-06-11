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
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.IndexColumn;

import com.google.common.collect.Lists;

@Entity
public class Market extends BaseDomainObject {
	@Id
	private final int id;
	private final String name;
	@OneToMany(fetch=FetchType.EAGER)
	@Cascade(CascadeType.SAVE_UPDATE)
	@IndexColumn(name="MEETINGS")
	@Filter(name="incompleteMeetings", condition="complete = 'false'")
	private List<Meeting> meetings;

	public Market(){
		this.id = 0;
		this.name = "";
	}

	public Market(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public List<Meeting> getMeetings() {
		return this.meetings;
	}

	public void addMeeting(Meeting meeting){
		if(null == this.meetings){
			this.meetings = Lists.newArrayList();
		}
		this.meetings.add(meeting);
	}

}
