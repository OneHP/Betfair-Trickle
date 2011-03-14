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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class BetTiming extends BaseDomainObject {

	
	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	private int id;
	private int secondsBeforeOff;
	@Type(type="boolean")
	private boolean processed;
	
	public BetTiming(){
		
	}
	
	public BetTiming(int secondsBeforeOff){
		this.secondsBeforeOff = secondsBeforeOff;
		processed = false;
	}
	
	public int getId() {
		return id;
	}
	public int getSecondsBeforeOff() {
		return secondsBeforeOff;
	}
	public boolean isProcessed() {
		return processed;
	}
	public void markAsProcessed(){
		processed = true;
	}
}
