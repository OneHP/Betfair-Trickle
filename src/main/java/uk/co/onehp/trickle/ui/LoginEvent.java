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
package uk.co.onehp.trickle.ui;

import com.vaadin.ui.Component;
import com.vaadin.ui.Component.Event;

public class LoginEvent extends Event {

	private static final long serialVersionUID = 2730635445519782642L;
	
	public final static String LOGIN_SUCCESS_EVENT = "loginSuccessEvent";
	public final static String LOGIN_FAILURE_EVENT = "loginFailureEvent";
	
	private String type;
	
	public LoginEvent(Component source, String type) {
		super(source);
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	

}
