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

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import uk.co.onehp.trickle.controller.domain.DomainController;
import uk.co.onehp.trickle.domain.Strategy;

import com.google.common.collect.Lists;
import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.BaseTheme;

@Configurable(preConstruction=true)
public class StrategyView extends CustomComponent{
	
	private static final long serialVersionUID = -5241205137895068157L;
	
	private HorizontalLayout mainLayout;
	
	@Autowired
	private DomainController domainController;
	
	private final List<Strategy> strategies;

	private Table strategiesTable;
	
	private VerticalLayout formSection;
	
	private Form strategyForm;
	
	private Button saveStrategyButton; 
	
	private Strategy addition;

	private final ClickListener saveStrategyListener = new ClickListener() {
		
		private static final long serialVersionUID = 3652412596841159881L;

		@SuppressWarnings("unchecked")
		@Override
		public void buttonClick(ClickEvent event) {
			if(strategyForm.isValid()){
				System.out.println(strategyForm.getField("betSecondsBeforeStartTime"));
				addition.setBetSecondsBeforeStartTime(Lists.newArrayList((Collection<Integer>) strategyForm.getField("betSecondsBeforeStartTime").getValue()));
				domainController.saveStrategy(addition);
				addition = new Strategy();
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
		
		addition = new Strategy();
		BeanItem<Strategy> strategyItem = new BeanItem<Strategy>(addition);
		
		strategyForm = new Form();
		strategyForm.setWidth("100%");
		strategyForm.setCaption("New Strategy");
		strategyForm.setWriteThrough(true);
		strategyForm.setInvalidCommitted(false);
		strategyForm.setFormFieldFactory(new StrategyFieldFactory());
		strategyForm.setItemDataSource(strategyItem);
		strategyForm.setVisibleItemProperties(Lists.newArrayList("description", "aspect", "liability", "minOdds", "maxOdds", "betSecondsBeforeStartTime"));
		
		saveStrategyButton = new Button("Save Strategy", saveStrategyListener);
		saveStrategyButton.setStyleName(BaseTheme.BUTTON_LINK);
		
		formSection.addComponent(strategyForm);
		formSection.addComponent(saveStrategyButton);

		mainLayout.addComponent(strategiesTable);
		mainLayout.addComponent(formSection);
	}
	
	private Container createContainerFromStrategies(){
		Container container = new IndexedContainer();
		
		List<String> headers = Lists.newArrayList("Description", "Action", "Liability", "Min Odds", "Max Odds");
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
		container.getContainerProperty(id, "Action").setValue(addition.getAspect().toString());
		container.getContainerProperty(id, "Liability").setValue(addition.getLiability().toString());
		container.getContainerProperty(id, "Min Odds").setValue(addition.getMinOdds().toString());
		container.getContainerProperty(id, "Max Odds").setValue(addition.getMaxOdds().toString());
	}
}
