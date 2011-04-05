
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolumeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="odds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalMatchedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalBspBackMatchedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalBspLiabilityMatchedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeInfo", propOrder = {
    "odds",
    "totalMatchedAmount",
    "totalBspBackMatchedAmount",
    "totalBspLiabilityMatchedAmount"
})
public class VolumeInfo {

    protected double odds;
    protected double totalMatchedAmount;
    protected double totalBspBackMatchedAmount;
    protected double totalBspLiabilityMatchedAmount;

    /**
     * Gets the value of the odds property.
     * 
     */
    public double getOdds() {
        return odds;
    }

    /**
     * Sets the value of the odds property.
     * 
     */
    public void setOdds(double value) {
        this.odds = value;
    }

    /**
     * Gets the value of the totalMatchedAmount property.
     * 
     */
    public double getTotalMatchedAmount() {
        return totalMatchedAmount;
    }

    /**
     * Sets the value of the totalMatchedAmount property.
     * 
     */
    public void setTotalMatchedAmount(double value) {
        this.totalMatchedAmount = value;
    }

    /**
     * Gets the value of the totalBspBackMatchedAmount property.
     * 
     */
    public double getTotalBspBackMatchedAmount() {
        return totalBspBackMatchedAmount;
    }

    /**
     * Sets the value of the totalBspBackMatchedAmount property.
     * 
     */
    public void setTotalBspBackMatchedAmount(double value) {
        this.totalBspBackMatchedAmount = value;
    }

    /**
     * Gets the value of the totalBspLiabilityMatchedAmount property.
     * 
     */
    public double getTotalBspLiabilityMatchedAmount() {
        return totalBspLiabilityMatchedAmount;
    }

    /**
     * Sets the value of the totalBspLiabilityMatchedAmount property.
     * 
     */
    public void setTotalBspLiabilityMatchedAmount(double value) {
        this.totalBspLiabilityMatchedAmount = value;
    }

}
