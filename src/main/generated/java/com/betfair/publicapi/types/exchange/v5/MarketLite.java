
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MarketLite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketLite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketStatusEnum"/>
 *         &lt;element name="marketSuspendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="marketTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="numberOfRunners" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="delay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reconciled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openForBspBetting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketLite", propOrder = {
    "marketStatus",
    "marketSuspendTime",
    "marketTime",
    "numberOfRunners",
    "delay",
    "reconciled",
    "openForBspBetting"
})
public class MarketLite {

    @XmlElement(required = true)
    protected MarketStatusEnum marketStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar marketSuspendTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar marketTime;
    protected int numberOfRunners;
    protected int delay;
    protected boolean reconciled;
    protected boolean openForBspBetting;

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
     * Gets the value of the marketSuspendTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarketSuspendTime() {
        return marketSuspendTime;
    }

    /**
     * Sets the value of the marketSuspendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarketSuspendTime(XMLGregorianCalendar value) {
        this.marketSuspendTime = value;
    }

    /**
     * Gets the value of the marketTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarketTime() {
        return marketTime;
    }

    /**
     * Sets the value of the marketTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarketTime(XMLGregorianCalendar value) {
        this.marketTime = value;
    }

    /**
     * Gets the value of the numberOfRunners property.
     * 
     */
    public int getNumberOfRunners() {
        return numberOfRunners;
    }

    /**
     * Sets the value of the numberOfRunners property.
     * 
     */
    public void setNumberOfRunners(int value) {
        this.numberOfRunners = value;
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
     * Gets the value of the reconciled property.
     * 
     */
    public boolean isReconciled() {
        return reconciled;
    }

    /**
     * Sets the value of the reconciled property.
     * 
     */
    public void setReconciled(boolean value) {
        this.reconciled = value;
    }

    /**
     * Gets the value of the openForBspBetting property.
     * 
     */
    public boolean isOpenForBspBetting() {
        return openForBspBetting;
    }

    /**
     * Sets the value of the openForBspBetting property.
     * 
     */
    public void setOpenForBspBetting(boolean value) {
        this.openForBspBetting = value;
    }

}
