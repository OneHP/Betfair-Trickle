
package com.betfair.publicapi.v5.bfexchangeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.betfair.publicapi.types.exchange.v5.GetMarketProfitAndLossResp;


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
 *         &lt;element name="Result" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetMarketProfitAndLossResp"/>
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
    "result"
})
@XmlRootElement(name = "getMarketProfitAndLossResponse")
public class GetMarketProfitAndLossResponse {

    @XmlElement(name = "Result", required = true, nillable = true)
    protected GetMarketProfitAndLossResp result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link GetMarketProfitAndLossResp }
     *     
     */
    public GetMarketProfitAndLossResp getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMarketProfitAndLossResp }
     *     
     */
    public void setResult(GetMarketProfitAndLossResp value) {
        this.result = value;
    }

}
