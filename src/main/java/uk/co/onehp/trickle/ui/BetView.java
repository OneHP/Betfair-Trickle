package uk.co.onehp.trickle.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import uk.co.onehp.trickle.controller.domain.DomainController;
import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.BettingAspect;
import uk.co.onehp.trickle.domain.Horse;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.domain.Strategy;
import uk.co.onehp.trickle.util.BettingUtil;

import com.google.common.collect.Lists;
import com.vaadin.data.Container;
import com.vaadin.data.util.HierarchicalContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;
import com.vaadin.ui.themes.BaseTheme;

@Configurable(preConstruction=true)
public class BetView extends CustomComponent {
	private static final long serialVersionUID = 37912938374833758L;
	private static final String [] COLUMNS = {"Race", "Horse", "Strategy"};

	@Autowired
	private DomainController domainController;
	
	private HorizontalLayout mainLayout;
	private final List<Meeting> meetings;
	private List<Strategy> strategies;
	private List<Bet> bets;
	private Table betsTable;
	private Button deleteBetButton;
	private Tree meetingsTree;
	private VerticalLayout tableSection;
	private VerticalLayout formSection;
	private Panel meetingsTreePanel;
	private ComboBox strategy;
	private final Label formTitle = new Label("New Bet");
	private Button saveBetButton;
	
	private final ClickListener saveBetListener = new ClickListener() {
		private static final long serialVersionUID = 3652412596841159881L;
		@Override
		public void buttonClick(ClickEvent event) {
			if(validateForm()){
				final Bet bet = new Bet((Horse)meetingsTree.getContainerProperty(meetingsTree.getValue(), "Horse").getValue()
						, (Strategy)strategy.getContainerProperty(strategy.getValue(), "Strategy").getValue());
				domainController.saveBet(bet);
				addBetToContainer(betsTable.getContainerDataSource(), bet);
				getWindow().showNotification("Bet Saved", Notification.TYPE_HUMANIZED_MESSAGE);
			}
		}
	};
	
	private final ClickListener deleteBetListener = new ClickListener() {
		private static final long serialVersionUID = 3652412596841159881L;
		@Override
		public void buttonClick(ClickEvent event) {
			if(null!= betsTable.getValue()){
				Bet bet = (Bet)betsTable.getContainerProperty(betsTable.getValue(), "Bet").getValue();
				domainController.deleteBet(bet);
				betsTable.setValue(null);
				populateBetsTable();
				getWindow().showNotification("Bet Deleted", Notification.TYPE_HUMANIZED_MESSAGE);
			}
		}
	};
	
	public BetView(){
		meetings = domainController.getAllMeetings();
		strategies = domainController.getAllStrategies();
		bets = domainController.getIncompleteBets();
		buildView();
    	setCompositionRoot(mainLayout);
	}
	
	private void buildView(){
		mainLayout = new HorizontalLayout();
		mainLayout.setSpacing(true);
		mainLayout.setMargin(true);
		
		formSection = new VerticalLayout();
		formSection.setSpacing(true);
		
		tableSection = new VerticalLayout();
		tableSection.setSpacing(true);
		
		meetingsTreePanel = new Panel();
		meetingsTreePanel.setHeight("500px");
		
		meetingsTree = new Tree("Races", createContainerFromMeetings());
		
		strategy = new ComboBox("Strategy", createContainerFromStrategies());
		
		betsTable = new Table("Bets", createContainerFromBets());
		betsTable.setSelectable(true);
		betsTable.setVisibleColumns(COLUMNS);
		betsTable.setWidth("100%");
		betsTable.setHeight("250px");
		
		saveBetButton = new Button("Save Bet", saveBetListener);
		saveBetButton.setStyleName(BaseTheme.BUTTON_LINK);
		
		deleteBetButton = new Button("Delete Bet", deleteBetListener);
		deleteBetButton.setStyleName(BaseTheme.BUTTON_LINK);
		
		meetingsTreePanel.addComponent(meetingsTree);
		
		setupFormFields();
		
		formSection.addComponent(formTitle);
		formSection.addComponent(meetingsTreePanel);
		formSection.addComponent(strategy);
		formSection.addComponent(saveBetButton);
		
		tableSection.addComponent(betsTable);
		tableSection.addComponent(deleteBetButton);
		
		mainLayout.addComponent(tableSection);
		mainLayout.addComponent(formSection);
		
	}
	
	public void populateBetsTable(){
		bets = domainController.getIncompleteBets();
		betsTable.setContainerDataSource(createContainerFromBets());
		betsTable.setVisibleColumns(COLUMNS);
	}
	
	public void populateStrategyDropDown(){
		strategies = domainController.getAllStrategies();
		strategy.setContainerDataSource(createContainerFromStrategies());
	}
	
	private void setupFormFields() {
		meetingsTree.setItemCaptionPropertyId("Name");
		meetingsTree.setWidth("100%");
		meetingsTree.setHeight("100%");
		meetingsTree.setNullSelectionAllowed(false);
		meetingsTree.setRequired(true);
		meetingsTree.setMultiSelect(false);
		
		strategy.setItemCaptionPropertyId("Description");
		strategy.setNullSelectionAllowed(false);
		strategy.setRequired(true);
	}
	
	private boolean validateForm(){
		return strategy.isValid() && meetingsTree.isValid() && null != meetingsTree.getContainerProperty(meetingsTree.getValue(), "Horse").getValue();
	}
	
	private Container createContainerFromMeetings(){
		HierarchicalContainer container = new HierarchicalContainer();
		container.addContainerProperty("Name", String.class, "");
		container.addContainerProperty("Horse", Horse.class, null);
		for(Meeting meeting : meetings){
			Object meetingId = addMeetingToContainer(container, meeting);
			for(Race race : meeting.getRaces()){
				Object raceId = addRaceToContainer(container, race, meetingId);
				for(Horse horse : race.getRunners()){
					addHorseToContainer(container, horse, raceId);
				}
			}
		}
		return container;
	}

	private Object addMeetingToContainer(HierarchicalContainer container, Meeting addition) {
		Object id = container.addItem();
		container.getContainerProperty(id, "Name").setValue(addition.getName());
		return id;
	}
	
	private Object addRaceToContainer(HierarchicalContainer container, Race addition, Object parent) {
		Object id = container.addItem();
		container.getContainerProperty(id, "Name").setValue(addition.getName() + " - " + addition.getStartTime());
		container.setParent(id, parent);
		container.setChildrenAllowed(parent, true);
		return id;
	}
	
	private Object addHorseToContainer(HierarchicalContainer container, Horse addition, Object parent) {
		Object id = container.addItem();
		container.getContainerProperty(id, "Name").setValue(addition.getName() 
				+ " - B" + BettingUtil.bestPrice(addition.getPrices(), BettingAspect.BACK).getPrice() 
				+ " - L" + BettingUtil.bestPrice(addition.getPrices(), BettingAspect.LAY).getPrice());
		container.getContainerProperty(id, "Horse").setValue(addition);
		container.setParent(id, parent);
		container.setChildrenAllowed(parent, true);
		container.setChildrenAllowed(id, false);
		return id;
	}
	
	private Container createContainerFromStrategies(){
		Container container = new IndexedContainer();
		container.addContainerProperty("Description", String.class, "");
		container.addContainerProperty("Strategy", Strategy.class, null);
		for(Strategy strategy : strategies){
			addStrategyToContainer(container, strategy);
		}
		return container;
	}

	private void addStrategyToContainer(Container container, Strategy addition) {
		Object id = container.addItem();
		container.getContainerProperty(id, "Description").setValue(addition.getDescription());
		container.getContainerProperty(id, "Strategy").setValue(addition);
	}
	
	private Container createContainerFromBets(){
		Container container = new IndexedContainer();
		List<String> headers = Lists.newArrayList(COLUMNS);
		for(String header : headers){
			container.addContainerProperty(header, String.class, "");
		}
		container.addContainerProperty("Bet", Bet.class, null);
		
		for(Bet bet : bets){
			addBetToContainer(container, bet);
		}
		
		return container;
	}

	private void addBetToContainer(Container container, Bet addition) {
		Object id = container.addItem();
		
		container.getContainerProperty(id, "Race").setValue(addition.getHorse().getRace().getName());
		container.getContainerProperty(id, "Horse").setValue(addition.getHorse().getName());
		container.getContainerProperty(id, "Strategy").setValue(addition.getStrategy().getDescription());
		container.getContainerProperty(id, "Bet").setValue(addition);
	}
}
