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

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import uk.co.onehp.trickle.controller.domain.DomainController;
import uk.co.onehp.trickle.domain.BettingAspect;
import uk.co.onehp.trickle.domain.Strategy;

import com.google.common.collect.Lists;
import com.vaadin.data.Container;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.Slider;
import com.vaadin.ui.Slider.ValueOutOfBoundsException;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.TwinColSelect;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;
import com.vaadin.ui.themes.BaseTheme;

@Configurable(preConstruction=true)
public class StrategyView extends CustomComponent{
	private static final long serialVersionUID = -5241205137895068157L;
	private static final String COMMON_FIELD_WIDTH = "12em";
	private static final String DOUBLE_FIELD_WIDTH = "24em";
	private static final String [] COLUMNS = {"Description", "Aspect", "Liability", "Chase by Tick", "Min Odds", "Max Odds", "Splits"};

	@Autowired
	private DomainController domainController;

	private HorizontalLayout mainLayout;
	private List<Strategy> strategies;
	private Table strategiesTable;
	private Button deleteStrategyButton;
	private VerticalLayout tableSection;
	private VerticalLayout formSection;
	private Button saveStrategyButton;

	private final Label formTitle = new Label("New Strategy");
	private final TextField description = new TextField("Description");
	private final TextField liability = new TextField("Liability");
	private final Slider chase = new Slider("Chase by Tick");
	private final TextField minOdds = new TextField("Minimum Odds");
	private final TextField maxOdds = new TextField("Maximum Odds");
	private final OptionGroup aspect = new OptionGroup("Aspect", Lists.newArrayList(BettingAspect.BACK, BettingAspect.LAY));
	private final TwinColSelect splits =  new TwinColSelect("Place bet __ seconds before start",
			Lists.newArrayList(30,60,90,120,150,180,210,240,270,300,360,420,480,540,600));

	private final ClickListener saveStrategyListener = new ClickListener() {
		private static final long serialVersionUID = 3652412596841159881L;
		@SuppressWarnings("unchecked")
		@Override
		public void buttonClick(ClickEvent event) {
			if(validateForm()){
				Strategy strategy = new Strategy();
				strategy.setDescription((String) StrategyView.this.description.getValue());
				strategy.setAspect((BettingAspect) StrategyView.this.aspect.getValue());
				strategy.setChasePriceByTick(((Double)StrategyView.this.chase.getValue()).intValue());
				strategy.setLiability(new BigDecimal((String)StrategyView.this.liability.getValue()));
				strategy.setMinOdds(new BigDecimal((String)StrategyView.this.minOdds.getValue()));
				strategy.setMaxOdds(new BigDecimal((String)StrategyView.this.maxOdds.getValue()));
				strategy.setBetSecondsBeforeStartTime(Lists.newArrayList((Collection<Integer>) StrategyView.this.splits.getValue()));
				StrategyView.this.domainController.saveStrategy(strategy);
				populateStrategiesTable();
				getWindow().showNotification("Strategy Saved", Notification.TYPE_HUMANIZED_MESSAGE);
				resetForm();
			}
		}
	};

	private final ClickListener deleteStrategyListener = new ClickListener() {
		private static final long serialVersionUID = 3652412596841159881L;
		@Override
		public void buttonClick(ClickEvent event) {
			if(null!= StrategyView.this.strategiesTable.getValue()){
				Strategy strategy = (Strategy)StrategyView.this.strategiesTable.getContainerProperty(StrategyView.this.strategiesTable.getValue(), "Strategy").getValue();
				if(StrategyView.this.domainController.deleteStrategy(strategy)){
					StrategyView.this.strategiesTable.setValue(null);
					populateStrategiesTable();
					getWindow().showNotification("Strategy Deleted", Notification.TYPE_HUMANIZED_MESSAGE);
				}else{
					getWindow().showNotification("Strategy is currently in use, cannot delete", Notification.TYPE_WARNING_MESSAGE);
				}
			}
		}
	};

	public StrategyView(){
		this.strategies = this.domainController.getAllStrategies();
		buildView();
		setCompositionRoot(this.mainLayout);
	}

	private void buildView(){

		this.mainLayout = new HorizontalLayout();
		this.mainLayout.setSpacing(true);
		this.mainLayout.setMargin(true);

		this.formSection = new VerticalLayout();
		this.formSection.setSpacing(true);

		this.tableSection = new VerticalLayout();
		this.tableSection.setSpacing(true);

		this.strategiesTable = new Table("Strategies", createContainerFromStrategies());
		this.strategiesTable.setSelectable(true);
		this.strategiesTable.setVisibleColumns(COLUMNS);
		this.strategiesTable.setWidth("100%");
		this.strategiesTable.setHeight("250px");

		this.saveStrategyButton = new Button("Save Strategy", this.saveStrategyListener);
		this.saveStrategyButton.setStyleName(BaseTheme.BUTTON_LINK);

		this.deleteStrategyButton = new Button("Delete Strategy", this.deleteStrategyListener);
		this.deleteStrategyButton.setStyleName(BaseTheme.BUTTON_LINK);

		setupFormFields();

		this.formSection.addComponent(this.formTitle);
		this.formSection.addComponent(this.description);
		this.formSection.addComponent(this.aspect);
		this.formSection.addComponent(this.liability);
		this.formSection.addComponent(this.chase);
		this.formSection.addComponent(this.minOdds);
		this.formSection.addComponent(this.maxOdds);
		this.formSection.addComponent(this.splits);
		this.formSection.addComponent(this.saveStrategyButton);

		this.tableSection.addComponent(this.strategiesTable);
		this.tableSection.addComponent(this.deleteStrategyButton);

		this.mainLayout.addComponent(this.tableSection);
		this.mainLayout.addComponent(this.formSection);
	}

	public void populateStrategiesTable(){
		this.strategies = this.domainController.getAllStrategies();
		this.strategiesTable.setContainerDataSource(createContainerFromStrategies());
		this.strategiesTable.setVisibleColumns(COLUMNS);
	}

	private void resetForm(){
		this.description.setValue(null);
		this.aspect.setValue(null);
		this.liability.setValue(null);
		this.minOdds.setValue(null);
		this.maxOdds.setValue(null);
		this.splits.setValue(null);
	}

	private void setupFormFields() {
		this.aspect.setNullSelectionAllowed(false);
		this.aspect.setImmediate(true);
		this.aspect.setWidth(COMMON_FIELD_WIDTH);
		this.aspect.setRequired(true);

		this.splits.setRows(8);
		this.splits.setNullSelectionAllowed(false);
		this.splits.setWidth(DOUBLE_FIELD_WIDTH);
		this.splits.setMultiSelect(true);
		this.splits.setRequired(true);

		setupTextField(this.description);
		this.description.addValidator(new StringLengthValidator("Decription must be 3-255 characters", 3, 255, false));
		this.description.setWidth(DOUBLE_FIELD_WIDTH);

		setupTextField(this.liability);
		this.liability.addValidator(new RegexpValidator("[1-9][0-9]*(\\.[0-9]{1,2}){0,1}", "Libility must be a decimal up to two places precision"));

		this.chase.setWidth(COMMON_FIELD_WIDTH);
		this.chase.setMin(0);
		this.chase.setMax(2);
		try {
			this.chase.setValue(0);
		} catch (ValueOutOfBoundsException e) {
			//Do nothing
		}

		setupTextField(this.minOdds);
		this.minOdds.addValidator(new RegexpValidator("[1-9][0-9]*(\\.[0-9]{1,2}){0,1}", "Min Odds must be a decimal up to two places precision"));

		setupTextField(this.maxOdds);
		this.maxOdds.addValidator(new RegexpValidator("[1-9][0-9]*(\\.[0-9]{1,2}){0,1}", "Max Odds must be a decimal up to two places precision"));
	}

	private boolean validateForm(){
		return this.aspect.isValid() && this.splits.isValid() && this.description.isValid() && this.liability.isValid() && this.minOdds.isValid() && this.maxOdds.isValid();
	}

	private void setupTextField(TextField field) {
		field.setRequired(true);
		field.setImmediate(true);
		field.setWidth(COMMON_FIELD_WIDTH);
		field.setNullRepresentation("");
	}

	private Container createContainerFromStrategies(){
		Container container = new IndexedContainer();

		List<String> headers = Lists.newArrayList(COLUMNS);
		for(String header : headers){
			container.addContainerProperty(header, String.class, "");
		}
		container.addContainerProperty("Strategy", Strategy.class, null);

		for(Strategy strategy : this.strategies){
			addStrategyToContainer(container, strategy);
		}

		return container;
	}

	private void addStrategyToContainer(Container container, Strategy addition) {
		Object id = container.addItem();
		container.getContainerProperty(id, "Description").setValue(addition.getDescription());
		container.getContainerProperty(id, "Aspect").setValue(addition.getAspect().toString());
		container.getContainerProperty(id, "Liability").setValue(addition.getLiability().toString());
		container.getContainerProperty(id, "Chase by Tick").setValue(addition.getChasePriceByTick());
		container.getContainerProperty(id, "Min Odds").setValue(addition.getMinOdds().toString());
		container.getContainerProperty(id, "Max Odds").setValue(addition.getMaxOdds().toString());
		container.getContainerProperty(id, "Splits").setValue(addition.getBetSecondsBeforeStartTime().toString());
		container.getContainerProperty(id, "Strategy").setValue(addition);
	}
}
