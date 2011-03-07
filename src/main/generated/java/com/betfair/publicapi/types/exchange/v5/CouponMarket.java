
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CouponMarket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponMarket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exchangeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parentEventName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketStatusEnum"/>
 *         &lt;element name="marketType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketTypeEnum"/>
 *         &lt;element name="marketTypeVariant" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketTypeVariantEnum"/>
 *         &lt;element name="marketInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="betDelay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="couponSelectionItems" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfCouponSelection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponMarket", propOrder = {
    "marketId",
    "marketName",
    "exchangeId",
    "parentEventName",
    "marketStatus",
    "marketType",
    "marketTypeVariant",
    "marketInfo",
    "startTime",
    "betDelay",
    "couponSelectionItems"
})
public class CouponMarket {

    protected int marketId;
    @XmlElement(required = true, nillable = true)
    protected String marketName;
    protected int exchangeId;
    @XmlElement(required = true, nillable = true)
    protected String parentEventName;
    @XmlElement(required = true)
    protected MarketStatusEnum marketStatus;
    @XmlElement(required = true)
    protected MarketTypeEnum marketType;
    @XmlElement(required = true)
    protected MarketTypeVariantEnum marketTypeVariant;
    @XmlElement(required = true, nillable = true)
    protected String marketInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected int betDelay;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCouponSelection couponSelectionItems;

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

    /**
     * Gets the value of the parentEventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentEventName() {
        return parentEventName;
    }

    /**
     * Sets the value of the parentEventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentEventName(String value) {
        this.parentEventName = value;
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
     * Gets the value of the couponSelectionItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCouponSelection }
     *     
     */
    public ArrayOfCouponSelection getCouponSelectionItems() {
        return couponSelectionItems;
    }

    /**
     * Sets the value of the couponSelectionItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCouponSelection }
     *     
     */
    public void setCouponSelectionItems(ArrayOfCouponSelection value) {
        this.couponSelectionItems = value;
    }

}
