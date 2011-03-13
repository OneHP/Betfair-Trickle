package uk.co.onehp.trickle.ui;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.BaseTheme;

public class MenuContainer extends CustomComponent {

	private static final long serialVersionUID = 7264850110812318726L;
	
	private VerticalLayout mainLayout;
	
	private Button strategies;
	private Button bets;
	private Button status;
	private Button reports;
	private Button accountDetails;
	private final StrategyView strategyView = new StrategyView();
	private final BetView betView = new BetView();
	
	private final ClickListener strategiesListener = new ClickListener() {
		
		private static final long serialVersionUID = -8583489922099752480L;

		@Override
		public void buttonClick(ClickEvent event) {
			Component secondComponent; 
			try{
				secondComponent = mainLayout.getComponent(1);
				mainLayout.replaceComponent(secondComponent, strategyView);
				strategyView.populateStrategiesTable();
			}catch(IndexOutOfBoundsException e){
				mainLayout.addComponent(new StrategyView(), 1);
			}
		}
	};

	private final ClickListener betsListener =  new ClickListener() {
		
		private static final long serialVersionUID = 5793982187938735310L;

		@Override
		public void buttonClick(ClickEvent event) {
			Component secondComponent; 
			try{
				secondComponent = mainLayout.getComponent(1);
				mainLayout.replaceComponent(secondComponent, betView);
				betView.populateBetsTable();
			}catch(IndexOutOfBoundsException e){
				mainLayout.addComponent(new BetView(), 1);
			}
		}
	};

	private final ClickListener statusListener =  new ClickListener() {
		
		private static final long serialVersionUID = 4342943474487276965L;

		@Override
		public void buttonClick(ClickEvent event) {
			// TODO Auto-generated method stub
			
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
    	setCompositionRoot(mainLayout);
	}
	
	private void buildView(){
		mainLayout = new VerticalLayout();
		
		HorizontalLayout menuBar = new HorizontalLayout();
		menuBar.setSpacing(true);
		
		strategies = new Button("Strategies", strategiesListener);
		strategies.setStyleName(BaseTheme.BUTTON_LINK);
		bets = new Button("Bets", betsListener);
		bets.setStyleName(BaseTheme.BUTTON_LINK);
		status = new Button("Status", statusListener);
		status.setStyleName(BaseTheme.BUTTON_LINK);
		reports = new Button("Reports", reportsListener);
		reports.setStyleName(BaseTheme.BUTTON_LINK);
		accountDetails = new Button("Account Details", accountDetailsListener);
		accountDetails.setStyleName(BaseTheme.BUTTON_LINK);
		
		menuBar.addComponent(strategies);
		menuBar.addComponent(bets);
		menuBar.addComponent(status);
		menuBar.addComponent(reports);
		menuBar.addComponent(accountDetails);
		
		mainLayout.addComponent(menuBar);
	}
}