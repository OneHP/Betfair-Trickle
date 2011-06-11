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

import java.util.Collections;
import java.util.Comparator;
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
	private static final String [] INCOMPLETE_BETS_COLUMNS = {"Meeting","Time","Race", "Horse", "Strategy"};

	@Autowired
	private DomainController domainController;

	private HorizontalLayout mainLayout;
	private List<Meeting> meetings;
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
				final Bet bet = new Bet((Horse)BetView.this.meetingsTree.getContainerProperty(BetView.this.meetingsTree.getValue(), "Horse").getValue()
						, (Strategy)BetView.this.strategy.getContainerProperty(BetView.this.strategy.getValue(), "Strategy").getValue());
				BetView.this.domainController.saveBet(bet);
				addBetToTableContainer(BetView.this.incompleteBetsTable.getContainerDataSource(), bet);
				getWindow().showNotification("Bet Saved", Notification.TYPE_HUMANIZED_MESSAGE);
			}
		}
	};

	private final ClickListener deleteBetListener = new ClickListener() {
		private static final long serialVersionUID = 3652412596841159881L;
		@Override
		public void buttonClick(ClickEvent event) {
			if(null!= BetView.this.incompleteBetsTable.getValue()){
				Bet bet = (Bet)BetView.this.incompleteBetsTable.getContainerProperty(BetView.this.incompleteBetsTable.getValue(), "Bet").getValue();
				BetView.this.domainController.deleteBet(bet);
				BetView.this.incompleteBetsTable.setValue(null);
				populateIncompleteBetsTable();
				getWindow().showNotification("Bet Deleted", Notification.TYPE_HUMANIZED_MESSAGE);
			}
		}
	};

	private final ClickListener clearAllBetsListener = new ClickListener() {
		private static final long serialVersionUID = 3652412596841159881L;
		@Override
		public void buttonClick(ClickEvent event) {
			BetView.this.domainController.deleteIncompleteBets();
			BetView.this.incompleteBetsTable.setValue(null);
			populateIncompleteBetsTable();
			getWindow().showNotification("All Bets Cleared", Notification.TYPE_HUMANIZED_MESSAGE);
		}
	};

	public BetView(){
		this.meetings = this.domainController.getAllMeetings();
		this.strategies = this.domainController.getAllStrategies();
		this.incompleteBets = this.domainController.getIncompleteBets();
		this.completeBets = this.domainController.getCompleteBets();
		buildView();
		setCompositionRoot(this.mainLayout);
	}

	private void buildView(){
		this.mainLayout = new HorizontalLayout();
		this.mainLayout.setSpacing(true);
		this.mainLayout.setMargin(true);

		this.formSection = new VerticalLayout();
		this.formSection.setSpacing(true);

		this.incompleteBetsSection = new VerticalLayout();
		this.incompleteBetsSection.setSpacing(true);

		this.completeBetsSection = new VerticalLayout();
		this.completeBetsSection.setSpacing(true);

		this.meetingsTreePanel = new Panel();
		this.meetingsTreePanel.setHeight("350px");

		this.completeBetsTreePanel = new Panel();
		this.completeBetsTreePanel.setHeight("350px");

		this.meetingsTree = new Tree("Races", createTreeContainerFromMeetings());

		this.completeBetsTree = new Tree("Complete Bets", createTreeContainerFromCompleteBets());

		this.strategy = new ComboBox("Strategy", createDropdownContainerFromStrategies());

		this.incompleteBetsTable = new Table("Bets", createTableContainerFromIncompleteBets());
		this.incompleteBetsTable.setSelectable(true);
		this.incompleteBetsTable.setVisibleColumns(INCOMPLETE_BETS_COLUMNS);
		this.incompleteBetsTable.setWidth("100%");
		this.incompleteBetsTable.setHeight("350px");

		this.saveBetButton = new Button("Save Bet", this.saveBetListener);
		this.saveBetButton.setStyleName(BaseTheme.BUTTON_LINK);

		this.deleteBetButton = new Button("Delete Bet", this.deleteBetListener);
		this.deleteBetButton.setStyleName(BaseTheme.BUTTON_LINK);

		this.clearAllBetsButton = new Button("Clear All Bets", this.clearAllBetsListener);
		this.clearAllBetsButton.setStyleName(BaseTheme.BUTTON_LINK);

		this.meetingsTreePanel.addComponent(this.meetingsTree);

		this.completeBetsTreePanel.addComponent(this.completeBetsTree);

		setupFormFields();

		this.formSection.addComponent(this.formTitle);
		this.formSection.addComponent(this.meetingsTreePanel);
		this.formSection.addComponent(this.strategy);
		this.formSection.addComponent(this.saveBetButton);

		this.incompleteBetsSection.addComponent(this.incompleteBetsTable);
		this.incompleteBetsSection.addComponent(this.deleteBetButton);
		this.incompleteBetsSection.addComponent(this.clearAllBetsButton);

		this.completeBetsSection.addComponent(this.completeBetsTreePanel);

		this.mainLayout.addComponent(this.incompleteBetsSection);
		this.mainLayout.addComponent(this.formSection);
		this.mainLayout.addComponent(this.completeBetsSection);

	}

	public void populateMeetingsTree(){
		this.meetings = this.domainController.getAllMeetings();
		this.meetingsTree.setContainerDataSource(createTreeContainerFromMeetings());
	}

	public void populateIncompleteBetsTable(){
		this.incompleteBets = this.domainController.getIncompleteBets();
		this.incompleteBetsTable.setContainerDataSource(createTableContainerFromIncompleteBets());
		this.incompleteBetsTable.setVisibleColumns(INCOMPLETE_BETS_COLUMNS);
	}

	public void populateCompleteBetsTree(){
		this.completeBets = this.domainController.getCompleteBets();
		this.completeBetsTree.setContainerDataSource(createTreeContainerFromCompleteBets());
	}

	public void populateStrategyDropDown(){
		this.strategies = this.domainController.getAllStrategies();
		Collections.sort(this.strategies, new Comparator<Strategy>() {
			@Override
			public int compare(Strategy o1, Strategy o2) {
				return o1.getDescription().compareTo(o2.getDescription());
			}
		});
		this.strategy.setContainerDataSource(createDropdownContainerFromStrategies());
	}

	private void setupFormFields() {
		this.meetingsTree.setItemCaptionPropertyId("Name");
		this.meetingsTree.setWidth("100%");
		this.meetingsTree.setHeight("100%");
		this.meetingsTree.setNullSelectionAllowed(false);
		this.meetingsTree.setRequired(true);
		this.meetingsTree.setMultiSelect(false);

		this.completeBetsTree.setItemCaptionPropertyId("Detail");
		this.completeBetsTree.setWidth("100%");
		this.completeBetsTree.setHeight("100%");
		this.completeBetsTree.setSelectable(false);

		this.strategy.setItemCaptionPropertyId("Description");
		this.strategy.setNullSelectionAllowed(false);
		this.strategy.setRequired(true);
	}

	private boolean validateForm(){
		return this.strategy.isValid() && this.meetingsTree.isValid() && null != this.meetingsTree.getContainerProperty(this.meetingsTree.getValue(), "Horse").getValue();
	}

	private Container createTreeContainerFromCompleteBets(){
		HierarchicalContainer container = new HierarchicalContainer();
		container.addContainerProperty("Detail", String.class, "");
		for(Bet bet : this.completeBets){
			Object betId = addBetToTreeContainer(container, bet);
			for(BetLog betLog : bet.getBetLogs()) {
				addBetLogToTreeContainer(container, betLog, betId);
			}
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
		for(Meeting meeting : this.meetings){
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
		for(Strategy strategy : this.strategies){
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

		for(Bet bet : this.incompleteBets){
			addBetToTableContainer(container, bet);
		}

		return container;
	}

	private void addBetToTableContainer(Container container, Bet addition) {
		Object id = container.addItem();

		container.getContainerProperty(id, "Meeting").setValue(addition.getHorse().getRace().getMeetingName());
		container.getContainerProperty(id, "Race").setValue(addition.getHorse().getRace().getName());
		container.getContainerProperty(id, "Time").setValue(DateUtil.toShortString(addition.getHorse().getRace().getStartTime()));
		container.getContainerProperty(id, "Horse").setValue(addition.getHorse().getName());
		container.getContainerProperty(id, "Strategy").setValue(addition.getStrategy().getDescription());
		container.getContainerProperty(id, "Bet").setValue(addition);
	}
}
