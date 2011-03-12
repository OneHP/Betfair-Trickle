/*
 * Betfair Trickle. Automatic bet placement application. Copyright (C) 2010
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
package uk.co.onehp.trickle.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import uk.co.onehp.trickle.controller.user.UserContoller;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;
import com.vaadin.ui.themes.BaseTheme;

@Configurable(preConstruction=true)
public class LoginView extends CustomComponent implements ClickListener {

	private static final long serialVersionUID = 890481842663699765L;
	
	@Autowired
	private UserContoller userController;
	
	private VerticalLayout mainLayout;
	
	private TextField username;
	private TextField password;
	private Button login;
	
	public LoginView(){
    	buildView();
    	setCompositionRoot(mainLayout);
        
	}
	
	private void buildView(){
		mainLayout = new VerticalLayout();
		mainLayout.setSpacing(true);
		username = new TextField("Username");
        
        password = new TextField("Password");
        password.setSecret(true);
        
        login = new Button("Login");
        login.setStyleName(BaseTheme.BUTTON_LINK);
		login.addListener(this);
		
		
        mainLayout.addComponent(username);
        mainLayout.addComponent(password);
        mainLayout.addComponent(login);
	}
	
	public void buttonClick(ClickEvent event) {
		boolean success = null != userController.login(username.getValue().toString(), password.getValue().toString());
		getWindow().showNotification(success ? "Login Success" : "Login Failed", Notification.TYPE_HUMANIZED_MESSAGE);
		fireEvent(new LoginEvent(this, success ? LoginEvent.LOGIN_SUCCESS_EVENT : LoginEvent.LOGIN_FAILURE_EVENT));
	}

}
