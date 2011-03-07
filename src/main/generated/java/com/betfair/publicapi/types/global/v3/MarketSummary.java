
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MarketSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketType" type="{http://www.betfair.com/publicapi/types/global/v3/}MarketTypeEnum"/>
 *         &lt;element name="marketTypeVariant" type="{http://www.betfair.com/publicapi/types/global/v3/}MarketTypeVariantEnum"/>
 *         &lt;element name="menuLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="venue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="betDelay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfWinners" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eventParentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exchangeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketSummary", propOrder = {
    "eventTypeId",
    "marketId",
    "marketName",
    "marketType",
    "marketTypeVariant",
    "menuLevel",
    "orderIndex",
    "startTime",
    "timezone",
    "venue",
    "betDelay",
    "numberOfWinners",
    "eventParentId",
    "exchangeId"
})
public class MarketSummary {

    protected int eventTypeId;
    protected int marketId;
    @XmlElement(required = true, nillable = true)
    protected String marketName;
    @XmlElement(required = true)
    protected MarketTypeEnum marketType;
    @XmlElement(required = true)
    protected MarketTypeVariantEnum marketTypeVariant;
    protected int menuLevel;
    protected int orderIndex;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(required = true, nillable = true)
    protected String timezone;
    @XmlElement(required = true, nillable = true)
    protected String venue;
    protected int betDelay;
    protected int numberOfWinners;
    protected int eventParentId;
    protected int exchangeId;

    /**
     * Gets the value of the eventTypeId property.
     * 
     */
    public int getEventTypeId() {
        return eventTypeId;
    }

    /**
     * Sets the value of the eventTypeId property.
     * 
     */
    public void setEventTypeId(int value) {
        this.eventTypeId = value;
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
     * Gets the value of the marketName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * Sets the value of the marketName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketName(String value) {
        this.marketName = value;
    }

    /**
     * Gets the value of the marketType property.
     * 
     * @return
     *     possible object is
     *     {@link MarketTypeEnum }
     *     
     */
    public MarketTypeEnum getMarketType() {
        return marketType;
    }

    /**
     * Sets the value of the marketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketTypeEnum }
     *     
     */
    public void setMarketType(MarketTypeEnum value) {
        this.marketType = value;
    }

    /**
     * Gets the value of the marketTypeVariant property.
     * 
     * @return
     *     possible object is
     *     {@link MarketTypeVariantEnum }
     *     
     */
    public MarketTypeVariantEnum getMarketTypeVariant() {
        return marketTypeVariant;
    }

    /**
     * Sets the value of the marketTypeVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketTypeVariantEnum }
     *     
     */
    public void setMarketTypeVariant(MarketTypeVariantEnum value) {
        this.marketTypeVariant = value;
    }

    /**
     * Gets the value of the menuLevel property.
     * 
     */
    public int getMenuLevel() {
        return menuLevel;
    }

    /**
     * Sets the value of the menuLevel property.
     * 
     */
    public void setMenuLevel(int value) {
        this.menuLevel = value;
    }

    /**
     * Gets the value of the orderIndex property.
     * 
     */
    public int getOrderIndex() {
        return orderIndex;
    }

    /**
     * Sets the value of the orderIndex property.
     * 
     */
    public void setOrderIndex(int value) {
        this.orderIndex = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the venue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Sets the value of the venue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenue(String value) {
        this.venue = value;
    }

    /**
     * Gets the value of the betDelay property.
     * 
     */
    public int getBetDelay() {
        return betDelay;
    }

    /**
     * Sets the value of the betDelay property.
     * 
     */
    public void setBetDelay(int value) {
        this.betDelay = value;
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
     * Gets the value of the eventParentId property.
     * 
     */
    public int getEventParentId() {
        return eventParentId;
    }

    /**
     * Sets the value of the eventParentId property.
     * 
     */
    public void setEventParentId(int value) {
        this.eventParentId = value;
    }

    /**
     * Gets the value of the exchangeId property.
     * 
     */
    public int getExchangeId() {
        return exchangeId;
    }

    /**
     * Sets the value of the exchangeId property.
     * 
     */
    public void setExchangeId(int value) {
        this.exchangeId = value;
    }

}
