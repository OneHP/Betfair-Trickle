package uk.co.onehp.trickle.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import uk.co.onehp.trickle.controller.domain.DomainController;
import uk.co.onehp.trickle.domain.Bet;
import uk.co.onehp.trickle.domain.BetLog;
import uk.co.onehp.trickle.domain.BetType;
import uk.co.onehp.trickle.domain.BettingAspect;
import uk.co.onehp.trickle.domain.Horse;
import uk.co.onehp.trickle.domain.Meeting;
import uk.co.onehp.trickle.domain.Race;
import uk.co.onehp.trickle.domain.Strategy;
import uk.co.onehp.trickle.util.BettingUtil;
import uk.co.onehp.trickle.util.DateUtil;

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
	private static final String [] INCOMPLETE_BETS_COLUMNS = {"Race", "Horse", "Strategy"};

	@Autowired
	private DomainController domainController;
	
	private HorizontalLayout mainLayout;
	private final List<Meeting> meetings;
	private List<Strategy> strategies;
	private List<Bet> incompleteBets;
	private List<Bet> completeBets;
	private Table incompleteBetsTable;
	private Button deleteBetButton;
	private Button clearAllBetsButton;
	private Tree meetingsTree;
	private Tree completeBetsTree;
	private VerticalLayout incompleteBetsSection;
	private VerticalLayout formSection;
	private VerticalLayout completeBetsSection;
	private Panel meetingsTreePanel;
	private Panel completeBetsTreePanel;
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
				addBetToTableContainer(incompleteBetsTable.getContainerDataSource(), bet);
				getWindow().showNotification("Bet Saved", Notification.TYPE_HUMANIZED_MESSAGE);
			}
		}
	};
	
	private final ClickListener deleteBetListener = new ClickListener() {
		private static final long serialVersionUID = 3652412596841159881L;
		@Override
		public void buttonClick(ClickEvent event) {
			if(null!= incompleteBetsTable.getValue()){
				Bet bet = (Bet)incompleteBetsTable.getContainerProperty(incompleteBetsTable.getValue(), "Bet").getValue();
				domainController.deleteBet(bet);
				incompleteBetsTable.setValue(null);
				populateIncompleteBetsTable();
				getWindow().showNotification("Bet Deleted", Notification.TYPE_HUMANIZED_MESSAGE);
			}
		}
	};
	
	private final ClickListener clearAllBetsListener = new ClickListener() {
		private static final long serialVersionUID = 3652412596841159881L;
		@Override
		public void buttonClick(ClickEvent event) {
			domainController.deleteIncompleteBets();
			incompleteBetsTable.setValue(null);
			populateIncompleteBetsTable();
			getWindow().showNotification("All Bets Cleared", Notification.TYPE_HUMANIZED_MESSAGE);
		}
	};
	
	public BetView(){
		meetings = domainController.getAllMeetings();
		strategies = domainController.getAllStrategies();
		incompleteBets = domainController.getIncompleteBets();
		completeBets = domainController.getCompleteBets();
		buildView();
    	setCompositionRoot(mainLayout);
	}
	
	private void buildView(){
		mainLayout = new HorizontalLayout();
		mainLayout.setSpacing(true);
		mainLayout.setMargin(true);
		
		formSection = new VerticalLayout();
		formSection.setSpacing(true);
		
		incompleteBetsSection = new VerticalLayout();
		incompleteBetsSection.setSpacing(true);
		
		completeBetsSection = new VerticalLayout();
		completeBetsSection.setSpacing(true);
		
		meetingsTreePanel = new Panel();
		meetingsTreePanel.setHeight("500px");
		
		completeBetsTreePanel = new Panel();
		completeBetsTreePanel.setHeight("500px");
		
		meetingsTree = new Tree("Races", createTreeContainerFromMeetings());
		
		completeBetsTree = new Tree("Complete Bets", createTreeContainerFromCompleteBets());
		
		strategy = new ComboBox("Strategy", createDropdownContainerFromStrategies());
		
		incompleteBetsTable = new Table("Bets", createTableContainerFromIncompleteBets());
		incompleteBetsTable.setSelectable(true);
		incompleteBetsTable.setVisibleColumns(INCOMPLETE_BETS_COLUMNS);
		incompleteBetsTable.setWidth("100%");
		incompleteBetsTable.setHeight("250px");
		
		saveBetButton = new Button("Save Bet", saveBetListener);
		saveBetButton.setStyleName(BaseTheme.BUTTON_LINK);
		
		deleteBetButton = new Button("Delete Bet", deleteBetListener);
		deleteBetButton.setStyleName(BaseTheme.BUTTON_LINK);
		
		clearAllBetsButton = new Button("Clear All Bets", clearAllBetsListener);
		clearAllBetsButton.setStyleName(BaseTheme.BUTTON_LINK);
		
		meetingsTreePanel.addComponent(meetingsTree);
		
		completeBetsTreePanel.addComponent(completeBetsTree);
		
		setupFormFields();
		
		formSection.addComponent(formTitle);
		formSection.addComponent(meetingsTreePanel);
		formSection.addComponent(strategy);
		formSection.addComponent(saveBetButton);
		
		incompleteBetsSection.addComponent(incompleteBetsTable);
		incompleteBetsSection.addComponent(deleteBetButton);
		incompleteBetsSection.addComponent(clearAllBetsButton);
		
		completeBetsSection.addComponent(completeBetsTreePanel);
		
		mainLayout.addComponent(incompleteBetsSection);
		mainLayout.addComponent(formSection);
		mainLayout.addComponent(completeBetsSection);
		
	}
	
	public void populateIncompleteBetsTable(){
		incompleteBets = domainController.getIncompleteBets();
		incompleteBetsTable.setContainerDataSource(createTableContainerFromIncompleteBets());
		incompleteBetsTable.setVisibleColumns(INCOMPLETE_BETS_COLUMNS);
	}
	
	public void populateCompleteBetsTree(){
		completeBets = domainController.getCompleteBets();
		completeBetsTree.setContainerDataSource(createTreeContainerFromCompleteBets());
	}
	
	public void populateStrategyDropDown(){
		strategies = domainController.getAllStrategies();
		strategy.setContainerDataSource(createDropdownContainerFromStrategies());
	}
	
	private void setupFormFields() {
		meetingsTree.setItemCaptionPropertyId("Name");
		meetingsTree.setWidth("100%");
		meetingsTree.setHeight("100%");
		meetingsTree.setNullSelectionAllowed(false);
		meetingsTree.setRequired(true);
		meetingsTree.setMultiSelect(false);
		
		completeBetsTree.setItemCaptionPropertyId("Detail");
		completeBetsTree.setWidth("100%");
		completeBetsTree.setHeight("100%");
		completeBetsTree.setSelectable(false);
		
		strategy.setItemCaptionPropertyId("Description");
		strategy.setNullSelectionAllowed(false);
		strategy.setRequired(true);
	}
	
	private boolean validateForm(){
		return strategy.isValid() && meetingsTree.isValid() && null != meetingsTree.getContainerProperty(meetingsTree.getValue(), "Horse").getValue();
	}
	
	private Container createTreeContainerFromCompleteBets(){
		HierarchicalContainer container = new HierarchicalContainer();
		container.addContainerProperty("Detail", String.class, "");
		for(Bet bet : completeBets){
			Object betId = addBetToTreeContainer(container, bet);
			for(BetLog betLog : bet.getBetLogs())
			addBetLogToTreeContainer(container, betLog, betId);
		}
		return container;
	}
	
	private Object addBetToTreeContainer(HierarchicalContainer container, Bet addition) {
		Object id = container.addItem();
		container.getContainerProperty(id, "Detail").setValue(addition.getHorse().getRace().getName() 
				+ " - " + addition.getHorse().getName() + " - " + addition.getStrategy().getDescription());
		return id;
	}
	
	private Object addBetLogToTreeContainer(HierarchicalContainer container, BetLog addition, Object parent) {
		Object id = container.addItem();
		container.getContainerProperty(id, "Detail").setValue(DateUtil.toShortString(addition.getPlacedDateTime()) 
				+ " - £" + addition.getLiability() + " - " + addition.getPrice() + " - " 
				+ (addition.getBetType() == BetType.MOC_EXCHANGE ? "Exchange" : "SP"));
		container.setParent(id, parent);
		container.setChildrenAllowed(parent, true);
		container.setChildrenAllowed(id, false);
		return id;
	}
	
	private Container createTreeContainerFromMeetings(){
		HierarchicalContainer container = new HierarchicalContainer();
		container.addContainerProperty("Name", String.class, "");
		container.addContainerProperty("Horse", Horse.class, null);
		for(Meeting meeting : meetings){
			Object meetingId = addMeetingToTreeContainer(container, meeting);
			for(Race race : meeting.getRaces()){
				Object raceId = addRaceToTreeContainer(container, race, meetingId);
				for(Horse horse : race.getRunners()){
					addHorseToTreeContainer(container, horse, raceId);
				}
			}
		}
		return container;
	}

	private Object addMeetingToTreeContainer(HierarchicalContainer container, Meeting addition) {
		Object id = container.addItem();
		container.getContainerProperty(id, "Name").setValue(addition.getName());
		return id;
	}
	
	private Object addRaceToTreeContainer(HierarchicalContainer container, Race addition, Object parent) {
		Object id = container.addItem();
		container.getContainerProperty(id, "Name").setValue(addition.getName() + " - " + DateUtil.toShortString(addition.getStartTime()));
		container.setParent(id, parent);
		container.setChildrenAllowed(parent, true);
		return id;
	}
	
	private Object addHorseToTreeContainer(HierarchicalContainer container, Horse addition, Object parent) {
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
	
	private Container createDropdownContainerFromStrategies(){
		Container container = new IndexedContainer();
		container.addContainerProperty("Description", String.class, "");
		container.addContainerProperty("Strategy", Strategy.class, null);
		for(Strategy strategy : strategies){
			addStrategyToDropdownContainer(container, strategy);
		}
		return container;
	}

	private void addStrategyToDropdownContainer(Container container, Strategy addition) {
		Object id = container.addItem();
		container.getContainerProperty(id, "Description").setValue(addition.getDescription());
		container.getContainerProperty(id, "Strategy").setValue(addition);
	}
	
	private Container createTableContainerFromIncompleteBets(){
		Container container = new IndexedContainer();
		List<String> headers = Lists.newArrayList(INCOMPLETE_BETS_COLUMNS);
		for(String header : headers){
			container.addContainerProperty(header, String.class, "");
		}
		container.addContainerProperty("Bet", Bet.class, null);
		
		for(Bet bet : incompleteBets){
			addBetToTableContainer(container, bet);
		}
		
		return container;
	}

	private void addBetToTableContainer(Container container, Bet addition) {
		Object id = container.addItem();
		
		container.getContainerProperty(id, "Race").setValue(addition.getHorse().getRace().getName());
		container.getContainerProperty(id, "Horse").setValue(addition.getHorse().getName());
		container.getContainerProperty(id, "Strategy").setValue(addition.getStrategy().getDescription());
		container.getContainerProperty(id, "Bet").setValue(addition);
	}
}
