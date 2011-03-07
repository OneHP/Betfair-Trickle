
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBetResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBetResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="bet" type="{http://www.betfair.com/publicapi/types/exchange/v5/}Bet"/>
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
@XmlType(name = "GetBetResp", propOrder = {
    "bet",
    "errorCode"
})
public class GetBetResp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected Bet bet;
    @XmlElement(required = true)
    protected GetBetErrorEnum errorCode;

    /**
     * Gets the value of the bet property.
     * 
     * @return
     *     possible object is
     *     {@link Bet }
     *     
     */
    public Bet getBet() {
        return bet;
    }

    /**
     * Sets the value of the bet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bet }
     *     
     */
    public void setBet(Bet value) {
        this.bet = value;
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
