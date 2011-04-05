
package com.betfair.publicapi.v5.bfexchangeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.betfair.publicapi.types.exchange.v5.CancelBetsByMarketReq;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://www.betfair.com/publicapi/types/exchange/v5/}CancelBetsByMarketReq"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "cancelBetsByMarket")
public class CancelBetsByMarket {

    @XmlElement(required = true)
    protected CancelBetsByMarketReq request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CancelBetsByMarketReq }
     *     
     */
    public CancelBetsByMarketReq getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelBetsByMarketReq }
     *     
     */
    public void setRequest(CancelBetsByMarketReq value) {
        this.request = value;
    }

}
