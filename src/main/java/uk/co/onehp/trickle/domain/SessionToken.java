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

import org.bson.types.ObjectId;
import org.joda.time.LocalDateTime;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Serialized;
@Entity
public class SessionToken extends BaseDomainObject {
	@Id
	private ObjectId id;
	private String token;
	@Serialized
	private LocalDateTime updatedDateTime;
	@Embedded
	private SessionType sessionType;

	public void updateToken(String token){
		this.token = token;
		this.updatedDateTime = new LocalDateTime();
	}

	public ObjectId getId() {
		return this.id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}

	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public LocalDateTime getUpdatedDateTime() {
		return this.updatedDateTime;
	}

	public void setSessionType(SessionType sessionType) {
		this.sessionType = sessionType;
	}

	public SessionType getSessionType() {
		return this.sessionType;
	}
}
