
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSilksResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSilksResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetSilksErrorEnum"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketDisplayDetails" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfMarketDisplayDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSilksResp", propOrder = {
    "errorCode",
    "minorErrorCode",
    "marketDisplayDetails"
})
public class GetSilksResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected GetSilksErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMarketDisplayDetail marketDisplayDetails;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetSilksErrorEnum }
     *     
     */
    public GetSilksErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSilksErrorEnum }
     *     
     */
    public void setErrorCode(GetSilksErrorEnum value) {
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
     * Gets the value of the marketDisplayDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarketDisplayDetail }
     *     
     */
    public ArrayOfMarketDisplayDetail getMarketDisplayDetails() {
        return marketDisplayDetails;
    }

    /**
     * Sets the value of the marketDisplayDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarketDisplayDetail }
     *     
     */
    public void setMarketDisplayDetails(ArrayOfMarketDisplayDetail value) {
        this.marketDisplayDetails = value;
    }

}
