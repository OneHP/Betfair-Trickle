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

import org.apache.log4j.Logger;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;
import com.vaadin.ui.themes.BaseTheme;

public class MenuContainer extends CustomComponent {

	private static final long serialVersionUID = 7264850110812318726L;

	private VerticalLayout mainLayout;

	private Button strategies;
	private Button bets;
	private Button management;
	private Button reports;
	private Button accountDetails;
	private StrategyView strategyView;
	private BetView betView;
	private final ManagementView managementView = new ManagementView(MenuContainer.this);

	private final Logger log = Logger.getLogger(MenuContainer.class);

	private final ClickListener strategiesListener = new ClickListener() {

		private static final long serialVersionUID = -8583489922099752480L;

		@Override
		public void buttonClick(ClickEvent event) {
			Component newComponent;
			try{
				if(null == MenuContainer.this.strategyView){
					MenuContainer.this.strategyView = new StrategyView();
				}
				MenuContainer.this.strategyView.populateStrategiesTable();
				newComponent = MenuContainer.this.strategyView;
			}catch(Exception e){
				getWindow().showNotification("Problem with database!", Notification.TYPE_HUMANIZED_MESSAGE);
				newComponent = MenuContainer.this.managementView;
			}
			replaceMainComponentWith(newComponent);
		}
	};


	private final ClickListener betsListener =  new ClickListener() {

		private static final long serialVersionUID = 5793982187938735310L;

		@Override
		public void buttonClick(ClickEvent event) {
			Component newComponent;
			try{
				if(null == MenuContainer.this.betView){
					MenuContainer.this.betView = new BetView();
				}
				MenuContainer.this.betView.populateIncompleteBetsTable();
				MenuContainer.this.betView.populateStrategyDropDown();
				MenuContainer.this.betView.populateCompleteBetsTree();
				newComponent = MenuContainer.this.betView;
			}catch(Exception e){
				getWindow().showNotification("Problem with database!", Notification.TYPE_HUMANIZED_MESSAGE);
				newComponent = MenuContainer.this.managementView;
			}
			replaceMainComponentWith(newComponent);
		}
	};

	private final ClickListener managementListener =  new ClickListener() {

		private static final long serialVersionUID = 4342943474487276965L;

		@Override
		public void buttonClick(ClickEvent event) {
			replaceMainComponentWith(MenuContainer.this.managementView);
		}
	};

	private final ClickListener reportsListener =  new ClickListener() {

		private static final long serialVersionUID = 3555287394655342196L;

		@Override
		public void buttonClick(ClickEvent event) {
			// TODO Auto-generated method stub

		}
	};

	private final ClickListener accountDetailsListener =  new ClickListener() {

		private static final long serialVersionUID = 4899319579626249156L;

		@Override
		public void buttonClick(ClickEvent event) {
			// TODO Auto-generated method stub

		}
	};

	public MenuContainer(){
		buildView();
		setCompositionRoot(this.mainLayout);
	}

	protected void resetMeetings(){
		try{
			this.betView.populateMeetingsTree();
		}catch(Exception e){
			// do nothing
		}
	}

	private void buildView(){
		this.mainLayout = new VerticalLayout();

		HorizontalLayout menuBar = new HorizontalLayout();
		menuBar.setSpacing(true);

		this.strategies = new Button("Strategies", this.strategiesListener);
		this.strategies.setStyleName(BaseTheme.BUTTON_LINK);
		this.bets = new Button("Bets", this.betsListener);
		this.bets.setStyleName(BaseTheme.BUTTON_LINK);
		this.management = new Button("Management", this.managementListener);
		this.management.setStyleName(BaseTheme.BUTTON_LINK);
		this.reports = new Button("Reports", this.reportsListener);
		this.reports.setStyleName(BaseTheme.BUTTON_LINK);
		this.accountDetails = new Button("Account Details", this.accountDetailsListener);
		this.accountDetails.setStyleName(BaseTheme.BUTTON_LINK);

		menuBar.addComponent(this.strategies);
		menuBar.addComponent(this.bets);
		menuBar.addComponent(this.management);
		menuBar.addComponent(this.reports);
		menuBar.addComponent(this.accountDetails);

		this.mainLayout.addComponent(menuBar);
	}

	private void replaceMainComponentWith(Component newComponent){
		try{
			Component oldComponent = MenuContainer.this.mainLayout.getComponent(1);
			MenuContainer.this.mainLayout.replaceComponent(oldComponent, newComponent);
		}catch(IndexOutOfBoundsException e){
			this.log.warn("No main component, adding " + newComponent.getClass().toString() + " after menu.");
			MenuContainer.this.mainLayout.addComponent(newComponent, 1);
		}
	}
}