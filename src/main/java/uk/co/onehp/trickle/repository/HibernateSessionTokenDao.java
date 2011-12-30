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
package uk.co.onehp.trickle.repository;

import java.util.List;

import org.joda.time.LocalDateTime;
import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.SessionToken;
import uk.co.onehp.trickle.domain.SessionType;

@Repository("sessionTokenDao")
public class HibernateSessionTokenDao extends HibernateBaseDao implements
		SessionTokenRepository {

	@Override
	public void saveOrUpdate(SessionToken sessionToken) {
		super.saveOrUpdate(sessionToken);
	}

	@Override
	public SessionToken getSessionToken(SessionType sessionType) {
		@SuppressWarnings("unchecked")
		List<SessionToken> result =  super.hibernateTemplate.findByNamedQueryAndNamedParam("getSessionToken", "sessionType", sessionType);
		if(result.size() > 0){
			return result.get(0);
		}
		SessionToken token = new SessionToken();
		token.setSessionType(sessionType);
		token.setToken("");
		token.setUpdatedDateTime(new LocalDateTime(2011,1,1,0,0,0,0));
		return token;
	}

}
