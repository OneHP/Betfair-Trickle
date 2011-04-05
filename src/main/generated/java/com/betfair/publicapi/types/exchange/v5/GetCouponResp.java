
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCouponResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCouponResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="couponId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="couponName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="couponMarketItems" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfCouponMarket"/>
 *         &lt;element name="parentEventId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetCouponErrorEnum"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCouponResp", propOrder = {
    "couponId",
    "couponName",
    "couponMarketItems",
    "parentEventId",
    "errorCode",
    "minorErrorCode"
})
public class GetCouponResp
    extends APIResponse
{

    protected int couponId;
    @XmlElement(required = true, nillable = true)
    protected String couponName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCouponMarket couponMarketItems;
    protected int parentEventId;
    @XmlElement(required = true)
    protected GetCouponErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;

    /**
     * Gets the value of the couponId property.
     * 
     */
    public int getCouponId() {
        return couponId;
    }

    /**
     * Sets the value of the couponId property.
     * 
     */
    public void setCouponId(int value) {
        this.couponId = value;
    }

    /**
     * Gets the value of the couponName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * Sets the value of the couponName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponName(String value) {
        this.couponName = value;
    }

    /**
     * Gets the value of the couponMarketItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCouponMarket }
     *     
     */
    public ArrayOfCouponMarket getCouponMarketItems() {
        return couponMarketItems;
    }

    /**
     * Sets the value of the couponMarketItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCouponMarket }
     *     
     */
    public void setCouponMarketItems(ArrayOfCouponMarket value) {
        this.couponMarketItems = value;
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
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetCouponErrorEnum }
     *     
     */
    public GetCouponErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCouponErrorEnum }
     *     
     */
    public void setErrorCode(GetCouponErrorEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the minorErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorErrorCode() {
        return minorErrorCode;
    }

    /**
     * Sets the value of the minorErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorErrorCode(String value) {
        this.minorErrorCode = value;
    }

}
