
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBetMatchesLiteResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBetMatchesLiteResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="matchLites" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfMatchLite"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetBetErrorEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBetMatchesLiteResp", propOrder = {
    "matchLites",
    "errorCode"
})
public class GetBetMatchesLiteResp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfMatchLite matchLites;
    @XmlElement(required = true)
    protected GetBetErrorEnum errorCode;

    /**
     * Gets the value of the matchLites property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatchLite }
     *     
     */
    public ArrayOfMatchLite getMatchLites() {
        return matchLites;
    }

    /**
     * Sets the value of the matchLites property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatchLite }
     *     
     */
    public void setMatchLites(ArrayOfMatchLite value) {
        this.matchLites = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetBetErrorEnum }
     *     
     */
    public GetBetErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBetErrorEnum }
     *     
     */
    public void setErrorCode(GetBetErrorEnum value) {
        this.errorCode = value;
    }

}
