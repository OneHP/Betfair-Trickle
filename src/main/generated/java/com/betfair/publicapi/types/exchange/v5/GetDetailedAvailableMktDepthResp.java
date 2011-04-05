
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDetailedAvailableMktDepthResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDetailedAvailableMktDepthResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetDetailedAvailMktDepthErrorEnum"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priceItems" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfAvailabilityInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDetailedAvailableMktDepthResp", propOrder = {
    "errorCode",
    "minorErrorCode",
    "priceItems"
})
public class GetDetailedAvailableMktDepthResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected GetDetailedAvailMktDepthErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAvailabilityInfo priceItems;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetDetailedAvailMktDepthErrorEnum }
     *     
     */
    public GetDetailedAvailMktDepthErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDetailedAvailMktDepthErrorEnum }
     *     
     */
    public void setErrorCode(GetDetailedAvailMktDepthErrorEnum value) {
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

    /**
     * Gets the value of the priceItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailabilityInfo }
     *     
     */
    public ArrayOfAvailabilityInfo getPriceItems() {
        return priceItems;
    }

    /**
     * Sets the value of the priceItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailabilityInfo }
     *     
     */
    public void setPriceItems(ArrayOfAvailabilityInfo value) {
        this.priceItems = value;
    }

}
