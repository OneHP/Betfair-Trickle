package uk.co.onehp.trickle.dao;

import uk.co.onehp.trickle.domain.SessionToken;
import uk.co.onehp.trickle.domain.SessionType;

public interface SessionTokenDao {

	void saveOrUpdate(SessionToken sessionToken);
	
	SessionToken getSessionToken(SessionType sessionType);
}
