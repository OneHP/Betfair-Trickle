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

import uk.co.onehp.trickle.domain.BettingAspect;

import com.google.common.collect.Lists;
import com.vaadin.data.Item;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.ui.AbstractComponent.ComponentErrorEvent;
import com.vaadin.ui.AbstractComponent.ComponentErrorHandler;
import com.vaadin.ui.Component;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.TextField;
import com.vaadin.ui.TwinColSelect;

class StrategyFieldFactory extends DefaultFieldFactory {

	private static final long serialVersionUID = -2089269259422864788L;
	
	private static final String COMMON_FIELD_WIDTH = "12em";
	private static final String DOUBLE_FIELD_WIDTH = "24em";
	
	final OptionGroup actions = new OptionGroup("Action", Lists.newArrayList(BettingAspect.BACK, BettingAspect.LAY));
	final TwinColSelect secondsBeforeStart =  new TwinColSelect("Place bets __ seconds before start", 
			Lists.newArrayList(30,60,90,120,150,180,210,240,270,300,360,420,480,540,600));

    public StrategyFieldFactory() {
        actions.setNullSelectionAllowed(false);
        actions.setImmediate(true);
        actions.setWidth(COMMON_FIELD_WIDTH);
        actions.setRequired(true);
        
        secondsBeforeStart.setRows(8);
        secondsBeforeStart.setNullSelectionAllowed(false);
        secondsBeforeStart.setWidth(COMMON_FIELD_WIDTH);
        secondsBeforeStart.setMultiSelect(true);
        secondsBeforeStart.setRequired(true);
        secondsBeforeStart.setErrorHandler(new ComponentErrorHandler() {
			private static final long serialVersionUID = -5252184191956773593L;
			@Override
			public boolean handleComponentError(ComponentErrorEvent event) {
				return true;
			}
		});
    }

    @Override
    public Field createField(Item item, Object propertyId,
            Component uiContext) {
        if ("aspect".equals(propertyId)) {
            return actions;
        }
        if("betSecondsBeforeStartTime".equals(propertyId)){
        	return secondsBeforeStart;
        }
        TextField f = (TextField) super.createField(item, propertyId, uiContext);
        f.setRequired(true);
        f.setImmediate(true);
        f.setWidth(COMMON_FIELD_WIDTH);
        f.setNullRepresentation("");
        if ("description".equals(propertyId)) {
            f.addValidator(new StringLengthValidator("Decription must be 3-255 characters", 3, 255, false));
            f.setWidth(DOUBLE_FIELD_WIDTH);
        } else if ("liability".equals(propertyId)) {
            f.addValidator(new RegexpValidator("[1-9][0-9]*(\\.[0-9]{1,2}){0,1}", "Libility must be a decimal up to two places precision"));
        } else if ("minOdds".equals(propertyId)) {
            f.addValidator(new RegexpValidator("[1-9][0-9]*(\\.[0-9]{1,2}){0,1}", "Min Odds must be a decimal up to two places precision"));
        } else if ("maxOdds".equals(propertyId)) {
            f.addValidator(new RegexpValidator("[1-9][0-9]*(\\.[0-9]{1,2}){0,1}", "Max Odds must be a decimal up to two places precision"));
        }

        return f;
    }
}