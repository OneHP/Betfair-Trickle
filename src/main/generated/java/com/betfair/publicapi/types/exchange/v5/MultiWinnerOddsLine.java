
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiWinnerOddsLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiWinnerOddsLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}ProfitAndLoss">
 *       &lt;sequence>
 *         &lt;element name="ifLoss" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiWinnerOddsLine", propOrder = {
    "ifLoss"
})
public class MultiWinnerOddsLine
    extends ProfitAndLoss
{

    protected double ifLoss;

    /**
     * Gets the value of the ifLoss property.
     * 
     */
    public double getIfLoss() {
        return ifLoss;
    }

    /**
     * Sets the value of the ifLoss property.
     * 
     */
    public void setIfLoss(double value) {
        this.ifLoss = value;
    }

}
