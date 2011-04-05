
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceBetsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceBetsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="bets" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfPlaceBets"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceBetsReq", propOrder = {
    "bets"
})
public class PlaceBetsReq
    extends APIRequest
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPlaceBets bets;

    /**
     * Gets the value of the bets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPlaceBets }
     *     
     */
    public ArrayOfPlaceBets getBets() {
        return bets;
    }

    /**
     * Sets the value of the bets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPlaceBets }
     *     
     */
    public void setBets(ArrayOfPlaceBets value) {
        this.bets = value;
    }

}
