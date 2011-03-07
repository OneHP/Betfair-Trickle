
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEventsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEventsResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/global/v3/}GetEventsErrorEnum"/>
 *         &lt;element name="eventItems" type="{http://www.betfair.com/publicapi/types/global/v3/}ArrayOfBFEvent"/>
 *         &lt;element name="eventParentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketItems" type="{http://www.betfair.com/publicapi/types/global/v3/}ArrayOfMarketSummary"/>
 *         &lt;element name="couponLinks" type="{http://www.betfair.com/publicapi/types/global/v3/}ArrayOfCouponLinks"/>
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
@XmlType(name = "GetEventsResp", propOrder = {
    "errorCode",
    "eventItems",
    "eventParentId",
    "marketItems",
    "couponLinks",
    "minorErrorCode"
})
public class GetEventsResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected GetEventsErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfBFEvent eventItems;
    protected int eventParentId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMarketSummary marketItems;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCouponLinks couponLinks;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetEventsErrorEnum }
     *     
     */
    public GetEventsErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEventsErrorEnum }
     *     
     */
    public void setErrorCode(GetEventsErrorEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the eventItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBFEvent }
     *     
     */
    public ArrayOfBFEvent getEventItems() {
        return eventItems;
    }

    /**
     * Sets the value of the eventItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBFEvent }
     *     
     */
    public void setEventItems(ArrayOfBFEvent value) {
        this.eventItems = value;
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
     * Gets the value of the marketItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarketSummary }
     *     
     */
    public ArrayOfMarketSummary getMarketItems() {
        return marketItems;
    }

    /**
     * Sets the value of the marketItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarketSummary }
     *     
     */
    public void setMarketItems(ArrayOfMarketSummary value) {
        this.marketItems = value;
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
