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

import org.joda.time.LocalDateTime;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Reference;
import com.google.code.morphia.annotations.Serialized;
import com.google.common.collect.Lists;

@Entity
public class Race extends BaseDomainObject {

	private int eventId;
	private final String name;
	@Serialized
	private final LocalDateTime startTime;
	@Reference
	private List<Horse> runners;
	private String meetingName;
	private boolean complete;

	public Race(){
		this.eventId = 0;
		this.name = "";
		this.startTime = new LocalDateTime(0);
		this.meetingName = "";
		this.setComplete(false);
	}

	public Race(int eventId, String name, LocalDateTime startTime, String meetingName) {
		this.eventId = eventId;
		this.name = name;
		this.startTime = startTime;
		this.meetingName = meetingName;
		this.setComplete(false);
	}

	public void markAsComplete(){
		this.setComplete(true);
	}

	public int getEventId() {
		return this.eventId;
	}

	public String getName() {
		return this.name;
	}

	public LocalDateTime getStartTime() {
		return this.startTime;
	}

	public List<Horse> getRunners() {
		return this.runners;
	}

	public void addHorse(Horse horse){
		if(null == this.runners){
			this.runners = Lists.newArrayList();
		}
		this.runners.add(horse);
	}

	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}

	public String getMeetingName() {
		return this.meetingName;
	}

	public void setEventId(int raceId) {
		this.eventId = raceId;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public boolean isComplete() {
		return complete;
	}
}
