
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPrivateMarketsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPrivateMarketsResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetPrivateMarketsErrorEnum"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="privateMarkets" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfPrivateMarket"/>
 *         &lt;element name="lastRefresh" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPrivateMarketsResp", propOrder = {
    "errorCode",
    "minorErrorCode",
    "privateMarkets",
    "lastRefresh"
})
public class GetPrivateMarketsResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected GetPrivateMarketsErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrivateMarket privateMarkets;
    protected long lastRefresh;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetPrivateMarketsErrorEnum }
     *     
     */
    public GetPrivateMarketsErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPrivateMarketsErrorEnum }
     *     
     */
    public void setErrorCode(GetPrivateMarketsErrorEnum value) {
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

    /**
     * Gets the value of the privateMarkets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrivateMarket }
     *     
     */
    public ArrayOfPrivateMarket getPrivateMarkets() {
        return privateMarkets;
    }

    /**
     * Sets the value of the privateMarkets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrivateMarket }
     *     
     */
    public void setPrivateMarkets(ArrayOfPrivateMarket value) {
        this.privateMarkets = value;
    }

    /**
     * Gets the value of the lastRefresh property.
     * 
     */
    public long getLastRefresh() {
        return lastRefresh;
    }

    /**
     * Sets the value of the lastRefresh property.
     * 
     */
    public void setLastRefresh(long value) {
        this.lastRefresh = value;
    }

}
