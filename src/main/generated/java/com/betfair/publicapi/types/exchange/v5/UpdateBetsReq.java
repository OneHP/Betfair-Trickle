
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateBetsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateBetsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="bets" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfUpdateBets"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBetsReq", propOrder = {
    "bets"
})
public class UpdateBetsReq
    extends APIRequest
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfUpdateBets bets;

    /**
     * Gets the value of the bets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdateBets }
     *     
     */
    public ArrayOfUpdateBets getBets() {
        return bets;
    }

    /**
     * Sets the value of the bets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdateBets }
     *     
     */
    public void setBets(ArrayOfUpdateBets value) {
        this.bets = value;
    }

}
