
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailabilityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="odds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalAvailableBackAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalAvailableLayAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalBspBackAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalBspLayAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityInfo", propOrder = {
    "odds",
    "totalAvailableBackAmount",
    "totalAvailableLayAmount",
    "totalBspBackAmount",
    "totalBspLayAmount"
})
public class AvailabilityInfo {

    protected double odds;
    protected double totalAvailableBackAmount;
    protected double totalAvailableLayAmount;
    protected double totalBspBackAmount;
    protected double totalBspLayAmount;

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
     * Gets the value of the totalAvailableBackAmount property.
     * 
     */
    public double getTotalAvailableBackAmount() {
        return totalAvailableBackAmount;
    }

    /**
     * Sets the value of the totalAvailableBackAmount property.
     * 
     */
    public void setTotalAvailableBackAmount(double value) {
        this.totalAvailableBackAmount = value;
    }

    /**
     * Gets the value of the totalAvailableLayAmount property.
     * 
     */
    public double getTotalAvailableLayAmount() {
        return totalAvailableLayAmount;
    }

    /**
     * Sets the value of the totalAvailableLayAmount property.
     * 
     */
    public void setTotalAvailableLayAmount(double value) {
        this.totalAvailableLayAmount = value;
    }

    /**
     * Gets the value of the totalBspBackAmount property.
     * 
     */
    public double getTotalBspBackAmount() {
        return totalBspBackAmount;
    }

    /**
     * Sets the value of the totalBspBackAmount property.
     * 
     */
    public void setTotalBspBackAmount(double value) {
        this.totalBspBackAmount = value;
    }

    /**
     * Gets the value of the totalBspLayAmount property.
     * 
     */
    public double getTotalBspLayAmount() {
        return totalBspLayAmount;
    }

    /**
     * Sets the value of the totalBspLayAmount property.
     * 
     */
    public void setTotalBspLayAmount(double value) {
        this.totalBspLayAmount = value;
    }

}
