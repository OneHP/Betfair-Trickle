/*
 * Betfair Trickle. Automatic bet placemenimport org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
nd/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version. This program is distributed in the hope that it
 * will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details. You should have received a copy of the GNU
 * General Public License along with this program; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package uk.co.onehp.trickle.services.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserServiceImpl implements UserService {

	@Value("${bfusername}")
	private String registeredUsername;

	@Value("${bfpassword}")
	private String registeredPassword;
	
	@Override
	public boolean userIsRegistered(String username, String password) {
		return registeredUsername.equals(username) && registeredPassword.equals(password);
	}

	public void setRegisteredUsername(String registeredUsername) {
		this.registeredUsername = registeredUsername;
	}
	
	public void setRegisteredPassword(String registeredPassword) {
		this.registeredPassword = registeredPassword;
	}
}
