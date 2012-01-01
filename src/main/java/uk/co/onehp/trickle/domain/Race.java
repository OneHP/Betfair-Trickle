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
import com.google.common.collect.Lists;

@Entity
public class Race extends BasicRace {

	@Reference
	private List<Horse> runners;

	public Race(){
		super();
	}

	public Race(int eventId, String name, LocalDateTime startTime, String meetingName) {
		super(eventId, name, startTime, meetingName);
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

	public BasicRace toBasicRace(){
		return new BasicRace(this.getEventId(), this.getName(), this.getStartTime(), this.getMeetingName());
	}
}
