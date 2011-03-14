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
package uk.co.onehp.trickle;

import uk.co.onehp.trickle.ui.LoginEvent;
import uk.co.onehp.trickle.ui.LoginView;
import uk.co.onehp.trickle.ui.MenuContainer;

import com.vaadin.Application;
import com.vaadin.ui.Component.Event;
import com.vaadin.ui.Component.Listener;
import com.vaadin.ui.Window;

public class Trickle extends Application implements Listener
{
	private static final long serialVersionUID = -6377365310082423772L;
	
	private Window window;
	private LoginView loginView;

    @Override
    public void init()
    {
    	window = new Window("Betfair Trickle");
        setMainWindow(window);
        loginView = new LoginView();
        loginView.addListener(this);
		
        window.addComponent(loginView);
    }

	@Override
	public void componentEvent(Event event) {
		if(event instanceof LoginEvent){
			if(((LoginEvent)event).getType() == LoginEvent.LOGIN_SUCCESS_EVENT){
				window.removeComponent(loginView);
				window.addComponent(new MenuContainer());
			}
		} else {
			System.out.println("Unknown event: " +  event.getClass().getSimpleName() + " " + event.toString());
		}
		
		
	}
}
