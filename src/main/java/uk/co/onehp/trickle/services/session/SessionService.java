package uk.co.onehp.trickle.services.session;

import org.joda.time.LocalDateTime;

public interface SessionService {
	void updateGlobalSession(String token);
	void updateExchangeSession(String token);
	String getGlobalSessionToken();
	String getExchangeSessionToken();
	LocalDateTime getGlobalSessionTokenUpdateDateTime();
	LocalDateTime getExchangeSessionTokenUpdateDateTime();
}
