/*
 * Betfair Trickle. Automatic bet placement aimport org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.onehp.trickle.repository.SessionTokenRepository;
import uk.co.onehp.trickle.domain.SessionToken;
import uk.co.onehp.trickle.domain.SessionType;
eful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details. You should have received a copy of the GNU
 * General Public License along with this program; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package uk.co.onehp.trickle.services.session;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.onehp.trickle.domain.SessionToken;
import uk.co.onehp.trickle.domain.SessionType;
import uk.co.onehp.trickle.repository.SessionTokenRepository;

@Service("sessionService")
public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionTokenRepository sessionTokenRepository;

	@Override
	@Transactional
	public void updateGlobalSession(String token) {
		updateSession(token,SessionType.GLOBAL);
	}

	@Override
	@Transactional
	public void updateExchangeSession(String token) {
		updateSession(token,SessionType.EXCHANGE);
	}

	private void updateSession(String token, SessionType sessionType) {
		SessionToken sessionToken = this.sessionTokenRepository.getSessionToken(sessionType);
		if(null == sessionToken){
			sessionToken = new SessionToken();
			sessionToken.setSessionType(sessionType);
			sessionToken.updateToken(token);
			this.sessionTokenRepository.saveOrUpdate(sessionToken);
		}else if(!sessionToken.getToken().equals(token)){
			sessionToken.updateToken(token);
			this.sessionTokenRepository.saveOrUpdate(sessionToken);
		}
	}

	@Override
	@Transactional
	public String getGlobalSessionToken() {
		return this.sessionTokenRepository.getSessionToken(SessionType.GLOBAL).getToken();
	}

	@Override
	@Transactional
	public String getExchangeSessionToken() {
		return this.sessionTokenRepository.getSessionToken(SessionType.EXCHANGE).getToken();
	}

	@Override
	public LocalDateTime getGlobalSessionTokenUpdateDateTime() {
		return this.sessionTokenRepository.getSessionToken(SessionType.GLOBAL).getUpdatedDateTime();
	}

	@Override
	public LocalDateTime getExchangeSessionTokenUpdateDateTime() {
		return this.sessionTokenRepository.getSessionToken(SessionType.EXCHANGE).getUpdatedDateTime();
	}

}
