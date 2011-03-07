
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBetLiteResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBetLiteResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="betLite" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetLite"/>
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
@XmlType(name = "GetBetLiteResp", propOrder = {
    "betLite",
    "errorCode"
})
public class GetBetLiteResp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected BetLite betLite;
    @XmlElement(required = true)
    protected GetBetErrorEnum errorCode;

    /**
     * Gets the value of the betLite property.
     * 
     * @return
     *     possible object is
     *     {@link BetLite }
     *     
     */
    public BetLite getBetLite() {
        return betLite;
    }

    /**
     * Sets the value of the betLite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetLite }
     *     
     */
    public void setBetLite(BetLite value) {
        this.betLite = value;
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
