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
