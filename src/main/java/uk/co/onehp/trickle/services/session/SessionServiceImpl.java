package uk.co.onehp.trickle.services.session;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.onehp.trickle.dao.SessionTokenDao;
import uk.co.onehp.trickle.domain.SessionToken;
import uk.co.onehp.trickle.domain.SessionType;

@Service("sessionService")
public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionTokenDao sessionTokenDao;
	
	@Override
	@Transactional
	public void updateGlobalSession(String token) {
		SessionToken sessionToken = sessionTokenDao.getSessionToken(SessionType.GLOBAL);
		if(null == sessionToken){
			sessionToken = new SessionToken();
			sessionToken.setSessionType(SessionType.GLOBAL);
			sessionToken.updateToken(token);
			sessionTokenDao.saveOrUpdate(sessionToken);
		}else if(!sessionToken.getToken().equals(token)){
			sessionToken.updateToken(token);
			sessionTokenDao.saveOrUpdate(sessionToken);
		}
	}

	@Override
	@Transactional
	public void updateExchangeSession(String token) {
		SessionToken sessionToken = sessionTokenDao.getSessionToken(SessionType.EXCHANGE);
		if(null == sessionToken){
			sessionToken = new SessionToken();
			sessionToken.setSessionType(SessionType.EXCHANGE);
			sessionToken.updateToken(token);
			sessionTokenDao.saveOrUpdate(sessionToken);
		}else if(!sessionToken.getToken().equals(token)){
			sessionToken.updateToken(token);
			sessionTokenDao.saveOrUpdate(sessionToken);
		}
	}

	@Override
	@Transactional
	public String getGlobalSessionToken() {
		return sessionTokenDao.getSessionToken(SessionType.GLOBAL).getToken();
	}

	@Override
	@Transactional
	public String getExchangeSessionToken() {
		return sessionTokenDao.getSessionToken(SessionType.EXCHANGE).getToken();
	}

	@Override
	public LocalDateTime getGlobalSessionTokenUpdateDateTime() {
		return sessionTokenDao.getSessionToken(SessionType.GLOBAL).getUpdatedDateTime();
	}

	@Override
	public LocalDateTime getExchangeSessionTokenUpdateDateTime() {
		return sessionTokenDao.getSessionToken(SessionType.EXCHANGE).getUpdatedDateTime();
	}

}
