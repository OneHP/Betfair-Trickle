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
	
	@Autowired
	private DomainController domainController;
	
	private HorizontalLayout mainLayout;
	private final List<Strategy> strategies;
	private Table strategiesTable;
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
				strategy.setDescription((String) description.getValue());
				strategy.setAspect((BettingAspect) aspect.getValue());
				strategy.setChasePriceByTick(((Double)chase.getValue()).intValue());
				strategy.setLiability(new BigDecimal((String)liability.getValue()));
				strategy.setMinOdds(new BigDecimal((String)minOdds.getValue()));
				strategy.setMaxOdds(new BigDecimal((String)maxOdds.getValue()));
				strategy.setBetSecondsBeforeStartTime(Lists.newArrayList((Collection<Integer>) splits.getValue()));
				domainController.saveStrategy(strategy);
				addStrategyToContainer(strategiesTable.getContainerDataSource(), strategy);
				getWindow().showNotification("Strategy Saved", Notification.TYPE_HUMANIZED_MESSAGE);
				resetForm();
			}
		}
	};
	
	public StrategyView(){
    	strategies = domainController.getAllStrategies();
		buildView();
    	setCompositionRoot(mainLayout);
	}
	
	private void buildView(){
		
		mainLayout = new HorizontalLayout();
		mainLayout.setSpacing(true);
		mainLayout.setMargin(true);
		
		formSection = new VerticalLayout();
		formSection.setSpacing(true);
		
		strategiesTable = new Table("Strategies", createContainerFromStrategies());
		strategiesTable.setWidth("100%");
		strategiesTable.setHeight("250px");
		
		saveStrategyButton = new Button("Save Strategy", saveStrategyListener);
		saveStrategyButton.setStyleName(BaseTheme.BUTTON_LINK);
		
		setupFormFields();
		
		formSection.addComponent(formTitle);
		formSection.addComponent(description);
		formSection.addComponent(aspect);
		formSection.addComponent(liability);
		formSection.addComponent(chase);
		formSection.addComponent(minOdds);
		formSection.addComponent(maxOdds);
		formSection.addComponent(splits);
		formSection.addComponent(saveStrategyButton);

		mainLayout.addComponent(strategiesTable);
		mainLayout.addComponent(formSection);
	}
	
	private void resetForm(){
		description.setValue(null);
		aspect.setValue(null);
		liability.setValue(null);
		minOdds.setValue(null);
		maxOdds.setValue(null);
		splits.setValue(null);
	}
	
	private void setupFormFields() {
		aspect.setNullSelectionAllowed(false);
		aspect.setImmediate(true);
		aspect.setWidth(COMMON_FIELD_WIDTH);
		aspect.setRequired(true);
		
		splits.setRows(8);
		splits.setNullSelectionAllowed(false);
		splits.setWidth(DOUBLE_FIELD_WIDTH);
		splits.setMultiSelect(true);
		splits.setRequired(true);
		
		setupTextField(description);
		description.addValidator(new StringLengthValidator("Decription must be 3-255 characters", 3, 255, false));
		description.setWidth(DOUBLE_FIELD_WIDTH);
		
		setupTextField(liability);
		liability.addValidator(new RegexpValidator("[1-9][0-9]*(\\.[0-9]{1,2}){0,1}", "Libility must be a decimal up to two places precision"));
		
		chase.setWidth(COMMON_FIELD_WIDTH);
		chase.setMin(0);
		chase.setMax(2);
		try {
			chase.setValue(0);
		} catch (ValueOutOfBoundsException e) {
			//Do nothing
		}
		
		setupTextField(minOdds);
		minOdds.addValidator(new RegexpValidator("[1-9][0-9]*(\\.[0-9]{1,2}){0,1}", "Min Odds must be a decimal up to two places precision"));
		 
		setupTextField(maxOdds);
		maxOdds.addValidator(new RegexpValidator("[1-9][0-9]*(\\.[0-9]{1,2}){0,1}", "Max Odds must be a decimal up to two places precision"));
	}
	
	private boolean validateForm(){
		return aspect.isValid() && splits.isValid() && description.isValid() && liability.isValid() && minOdds.isValid() && maxOdds.isValid();
	}
	
    private void setupTextField(TextField field) {
    	field.setRequired(true);
    	field.setImmediate(true);
    	field.setWidth(COMMON_FIELD_WIDTH);
    	field.setNullRepresentation("");
    }

	private Container createContainerFromStrategies(){
		Container container = new IndexedContainer();
		
		List<String> headers = Lists.newArrayList("Description", "Aspect", "Liability", "Chase by Tick", "Min Odds", "Max Odds", "Splits");
		for(String header : headers){
			container.addContainerProperty(header, String.class, "");
		}
		
		for(Strategy strategy : strategies){
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
	}
}
