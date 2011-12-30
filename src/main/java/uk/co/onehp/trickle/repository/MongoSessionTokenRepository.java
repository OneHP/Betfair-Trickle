package uk.co.onehp.trickle.repository;

import org.springframework.stereotype.Repository;

import uk.co.onehp.trickle.domain.SessionToken;
import uk.co.onehp.trickle.domain.SessionType;

@Repository("sessionTokenRepository")
public class MongoSessionTokenRepository extends AbstractMongoRepository implements SessionTokenRepository{

	@Override
	public void saveOrUpdate(SessionToken sessionToken) {
		super.datastore.save(sessionToken);
	}

	@Override
	public SessionToken getSessionToken(SessionType sessionType) {
		return super.datastore.find(SessionToken.class).field("sessionType").equal(sessionType).get();
	}


}
