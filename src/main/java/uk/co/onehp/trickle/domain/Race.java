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
import org.joda.time.LocalDateTime;

import com.google.common.collect.Lists;

@Entity
@NamedQuery(name="ALL_RACES", query="FROM Race")
public class Race extends BaseDomainObject {

	@Id
	private final int eventId;
	private final String name;
//	@Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
	private final LocalDateTime startTime;
	@OneToMany(fetch=FetchType.EAGER)
	@Cascade(CascadeType.SAVE_UPDATE)
	@IndexColumn(name="RUNNERS")
	private List<Horse> runners;
	@ManyToOne
	private Meeting meeting;
	
	public Race(){
		eventId = 0;
		name = "";
		startTime = new LocalDateTime(0);
	}
	
	public Race(int eventId, String name, LocalDateTime startTime) {
		this.eventId = eventId;
		this.name = name;
		this.startTime = startTime;
	}

	public int getEventId() {
		return eventId;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public List<Horse> getRunners() {
		return runners;
	}
	
	public void addHorse(Horse horse){
		if(null == runners){
			runners = Lists.newArrayList();
		}
		runners.add(horse);
	}

	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}

	public Meeting getMeeting() {
		return meeting;
	}
}
