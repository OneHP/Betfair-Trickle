
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelBetsByMarketReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelBetsByMarketReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="markets" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfInt"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelBetsByMarketReq", propOrder = {
    "markets"
})
public class CancelBetsByMarketReq
    extends APIRequest
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt markets;

    /**
     * Gets the value of the markets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getMarkets() {
        return markets;
    }

    /**
     * Sets the value of the markets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setMarkets(ArrayOfInt value) {
        this.markets = value;
    }

}
