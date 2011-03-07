
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceBetsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceBetsResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="betResults" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfPlaceBetsResult"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}PlaceBetsErrorEnum"/>
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
@XmlType(name = "PlaceBetsResp", propOrder = {
    "betResults",
    "errorCode",
    "minorErrorCode"
})
public class PlaceBetsResp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPlaceBetsResult betResults;
    @XmlElement(required = true)
    protected PlaceBetsErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;

    /**
     * Gets the value of the betResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPlaceBetsResult }
     *     
     */
    public ArrayOfPlaceBetsResult getBetResults() {
        return betResults;
    }

    /**
     * Sets the value of the betResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPlaceBetsResult }
     *     
     */
    public void setBetResults(ArrayOfPlaceBetsResult value) {
        this.betResults = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceBetsErrorEnum }
     *     
     */
    public PlaceBetsErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceBetsErrorEnum }
     *     
     */
    public void setErrorCode(PlaceBetsErrorEnum value) {
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
