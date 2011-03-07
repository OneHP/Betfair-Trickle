package uk.co.onehp.trickle.dao;

import java.util.List;

import org.joda.time.LocalDateTime;
import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.SessionToken;
import uk.co.onehp.trickle.domain.SessionType;

@Repository("sessionTokenDao")
public class HibernateSessionTokenDao extends HibernateBaseDao implements
		SessionTokenDao {

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
