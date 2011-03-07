
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketPrices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketPrices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="delay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="discountAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lastRefresh" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="marketBaseRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="removedRunners" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketStatusEnum"/>
 *         &lt;element name="numberOfWinners" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bspMarket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="runnerPrices" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfRunnerPrices"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketPrices", propOrder = {
    "currencyCode",
    "delay",
    "discountAllowed",
    "lastRefresh",
    "marketBaseRate",
    "marketId",
    "marketInfo",
    "removedRunners",
    "marketStatus",
    "numberOfWinners",
    "bspMarket",
    "runnerPrices"
})
public class MarketPrices {

    @XmlElement(required = true, nillable = true)
    protected String currencyCode;
    protected int delay;
    protected boolean discountAllowed;
    protected long lastRefresh;
    protected float marketBaseRate;
    protected int marketId;
    @XmlElement(required = true, nillable = true)
    protected String marketInfo;
    @XmlElement(required = true, nillable = true)
    protected String removedRunners;
    @XmlElement(required = true)
    protected MarketStatusEnum marketStatus;
    protected int numberOfWinners;
    protected boolean bspMarket;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRunnerPrices runnerPrices;

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     */
    public int getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     */
    public void setDelay(int value) {
        this.delay = value;
    }

    /**
     * Gets the value of the discountAllowed property.
     * 
     */
    public boolean isDiscountAllowed() {
        return discountAllowed;
    }

    /**
     * Sets the value of the discountAllowed property.
     * 
     */
    public void setDiscountAllowed(boolean value) {
        this.discountAllowed = value;
    }

    /**
     * Gets the value of the lastRefresh property.
     * 
     */
    public long getLastRefresh() {
        return lastRefresh;
    }

    /**
     * Sets the value of the lastRefresh property.
     * 
     */
    public void setLastRefresh(long value) {
        this.lastRefresh = value;
    }

    /**
     * Gets the value of the marketBaseRate property.
     * 
     */
    public float getMarketBaseRate() {
        return marketBaseRate;
    }

    /**
     * Sets the value of the marketBaseRate property.
     * 
     */
    public void setMarketBaseRate(float value) {
        this.marketBaseRate = value;
    }

    /**
     * Gets the value of the marketId property.
     * 
     */
    public int getMarketId() {
        return marketId;
    }

    /**
     * Sets the value of the marketId property.
     * 
     */
    public void setMarketId(int value) {
        this.marketId = value;
    }

    /**
     * Gets the value of the marketInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketInfo() {
        return marketInfo;
    }

    /**
     * Sets the value of the marketInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketInfo(String value) {
        this.marketInfo = value;
    }

    /**
     * Gets the value of the removedRunners property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovedRunners() {
        return removedRunners;
    }

    /**
     * Sets the value of the removedRunners property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovedRunners(String value) {
        this.removedRunners = value;
    }

    /**
     * Gets the value of the marketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MarketStatusEnum }
     *     
     */
    public MarketStatusEnum getMarketStatus() {
        return marketStatus;
    }

    /**
     * Sets the value of the marketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketStatusEnum }
     *     
     */
    public void setMarketStatus(MarketStatusEnum value) {
        this.marketStatus = value;
    }

    /**
     * Gets the value of the numberOfWinners property.
     * 
     */
    public int getNumberOfWinners() {
        return numberOfWinners;
    }

    /**
     * Sets the value of the numberOfWinners property.
     * 
     */
    public void setNumberOfWinners(int value) {
        this.numberOfWinners = value;
    }

    /**
     * Gets the value of the bspMarket property.
     * 
     */
    public boolean isBspMarket() {
        return bspMarket;
    }

    /**
     * Sets the value of the bspMarket property.
     * 
     */
    public void setBspMarket(boolean value) {
        this.bspMarket = value;
    }

    /**
     * Gets the value of the runnerPrices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRunnerPrices }
     *     
     */
    public ArrayOfRunnerPrices getRunnerPrices() {
        return runnerPrices;
    }

    /**
     * Sets the value of the runnerPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRunnerPrices }
     *     
     */
    public void setRunnerPrices(ArrayOfRunnerPrices value) {
        this.runnerPrices = value;
    }

}
