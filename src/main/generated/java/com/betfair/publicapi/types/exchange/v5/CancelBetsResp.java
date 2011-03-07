
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelBetsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelBetsResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="betResults" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfCancelBetsResult"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}CancelBetsErrorEnum"/>
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
@XmlType(name = "CancelBetsResp", propOrder = {
    "betResults",
    "errorCode",
    "minorErrorCode"
})
public class CancelBetsResp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCancelBetsResult betResults;
    @XmlElement(required = true)
    protected CancelBetsErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;

    /**
     * Gets the value of the betResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancelBetsResult }
     *     
     */
    public ArrayOfCancelBetsResult getBetResults() {
        return betResults;
    }

    /**
     * Sets the value of the betResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancelBetsResult }
     *     
     */
    public void setBetResults(ArrayOfCancelBetsResult value) {
        this.betResults = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link CancelBetsErrorEnum }
     *     
     */
    public CancelBetsErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelBetsErrorEnum }
     *     
     */
    public void setErrorCode(CancelBetsErrorEnum value) {
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
