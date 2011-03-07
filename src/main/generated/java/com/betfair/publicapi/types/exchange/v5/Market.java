
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Market complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Market">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryISO3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discountAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="eventTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastRefresh" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="marketBaseRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="marketDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketDescriptionHasDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="marketDisplayTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketStatusEnum"/>
 *         &lt;element name="marketSuspendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="marketTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="marketType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketTypeEnum"/>
 *         &lt;element name="marketTypeVariant" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketTypeVariantEnum"/>
 *         &lt;element name="menuPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventHierarchy" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfEventId"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numberOfWinners" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parentEventId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="runners" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfRunner"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxUnitValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minUnitValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="runnersMayBeAdded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="licenceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="couponLinks" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfCouponLinks"/>
 *         &lt;element name="bspMarket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Market", propOrder = {
    "countryISO3",
    "discountAllowed",
    "eventTypeId",
    "lastRefresh",
    "marketBaseRate",
    "marketDescription",
    "marketDescriptionHasDate",
    "marketDisplayTime",
    "marketId",
    "marketStatus",
    "marketSuspendTime",
    "marketTime",
    "marketType",
    "marketTypeVariant",
    "menuPath",
    "eventHierarchy",
    "name",
    "numberOfWinners",
    "parentEventId",
    "runners",
    "unit",
    "maxUnitValue",
    "minUnitValue",
    "interval",
    "runnersMayBeAdded",
    "timezone",
    "licenceId",
    "couponLinks",
    "bspMarket"
})
public class Market {

    @XmlElement(required = true, nillable = true)
    protected String countryISO3;
    protected boolean discountAllowed;
    protected int eventTypeId;
    protected long lastRefresh;
    protected float marketBaseRate;
    @XmlElement(required = true, nillable = true)
    protected String marketDescription;
    protected boolean marketDescriptionHasDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar marketDisplayTime;
    protected int marketId;
    @XmlElement(required = true)
    protected MarketStatusEnum marketStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar marketSuspendTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar marketTime;
    @XmlElement(required = true)
    protected MarketTypeEnum marketType;
    @XmlElement(required = true)
    protected MarketTypeVariantEnum marketTypeVariant;
    @XmlElement(required = true, nillable = true)
    protected String menuPath;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfEventId eventHierarchy;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected int numberOfWinners;
    protected int parentEventId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRunner runners;
    @XmlElement(required = true, nillable = true)
    protected String unit;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double maxUnitValue;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double minUnitValue;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double interval;
    protected boolean runnersMayBeAdded;
    @XmlElement(required = true, nillable = true)
    protected String timezone;
    protected int licenceId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCouponLinks couponLinks;
    protected boolean bspMarket;

    /**
     * Gets the value of the countryISO3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISO3() {
        return countryISO3;
    }

    /**
     * Sets the value of the countryISO3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISO3(String value) {
        this.countryISO3 = value;
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
     * Gets the value of the marketDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketDescription() {
        return marketDescription;
    }

    /**
     * Sets the value of the marketDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketDescription(String value) {
        this.marketDescription = value;
    }

    /**
     * Gets the value of the marketDescriptionHasDate property.
     * 
     */
    public boolean isMarketDescriptionHasDate() {
        return marketDescriptionHasDate;
    }

    /**
     * Sets the value of the marketDescriptionHasDate property.
     * 
     */
    public void setMarketDescriptionHasDate(boolean value) {
        this.marketDescriptionHasDate = value;
    }

    /**
     * Gets the value of the marketDisplayTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarketDisplayTime() {
        return marketDisplayTime;
    }

    /**
     * Sets the value of the marketDisplayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarketDisplayTime(XMLGregorianCalendar value) {
        this.marketDisplayTime = value;
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
     * Gets the value of the menuPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuPath() {
        return menuPath;
    }

    /**
     * Sets the value of the menuPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuPath(String value) {
        this.menuPath = value;
    }

    /**
     * Gets the value of the eventHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventId }
     *     
     */
    public ArrayOfEventId getEventHierarchy() {
        return eventHierarchy;
    }

    /**
     * Sets the value of the eventHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventId }
     *     
     */
    public void setEventHierarchy(ArrayOfEventId value) {
        this.eventHierarchy = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the parentEventId property.
     * 
     */
    public int getParentEventId() {
        return parentEventId;
    }

    /**
     * Sets the value of the parentEventId property.
     * 
     */
    public void setParentEventId(int value) {
        this.parentEventId = value;
    }

    /**
     * Gets the value of the runners property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRunner }
     *     
     */
    public ArrayOfRunner getRunners() {
        return runners;
    }

    /**
     * Sets the value of the runners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRunner }
     *     
     */
    public void setRunners(ArrayOfRunner value) {
        this.runners = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the maxUnitValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxUnitValue() {
        return maxUnitValue;
    }

    /**
     * Sets the value of the maxUnitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxUnitValue(Double value) {
        this.maxUnitValue = value;
    }

    /**
     * Gets the value of the minUnitValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinUnitValue() {
        return minUnitValue;
    }

    /**
     * Sets the value of the minUnitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinUnitValue(Double value) {
        this.minUnitValue = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInterval(Double value) {
        this.interval = value;
    }

    /**
     * Gets the value of the runnersMayBeAdded property.
     * 
     */
    public boolean isRunnersMayBeAdded() {
        return runnersMayBeAdded;
    }

    /**
     * Sets the value of the runnersMayBeAdded property.
     * 
     */
    public void setRunnersMayBeAdded(boolean value) {
        this.runnersMayBeAdded = value;
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
     * Gets the value of the licenceId property.
     * 
     */
    public int getLicenceId() {
        return licenceId;
    }

    /**
     * Sets the value of the licenceId property.
     * 
     */
    public void setLicenceId(int value) {
        this.licenceId = value;
    }

    /**
     * Gets the value of the couponLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCouponLinks }
     *     
     */
    public ArrayOfCouponLinks getCouponLinks() {
        return couponLinks;
    }

    /**
     * Sets the value of the couponLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCouponLinks }
     *     
     */
    public void setCouponLinks(ArrayOfCouponLinks value) {
        this.couponLinks = value;
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

}
