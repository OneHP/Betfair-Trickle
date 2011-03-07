
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://www.betfair.com/publicapi/types/exchange/v5/}APIRequestHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIRequest", propOrder = {
    "header"
})
@XmlSeeAlso({
    CancelBetsReq.class,
    GetBetHistoryReq.class,
    GetMUBetsLiteReq.class,
    GetAccountStatementReq.class,
    GetBetReq.class,
    GetSilksReq.class,
    CancelBetsByMarketReq.class,
    GetMarketProfitAndLossReq.class,
    GetMarketTradedVolumeCompressedReq.class,
    GetPrivateMarketsReq.class,
    UpdateBetsReq.class,
    PlaceBetsReq.class,
    GetBetMatchesLiteReq.class,
    GetAllMarketsReq.class,
    GetCurrentBetsLiteReq.class,
    HeartbeatReq.class,
    GetCurrentBetsReq.class,
    GetCouponReq.class,
    GetBetLiteReq.class,
    GetMarketReq.class,
    GetMarketPricesCompressedReq.class,
    GetMarketTradedVolumeReq.class,
    GetCompleteMarketPricesCompressedReq.class,
    GetDetailedAvailableMktDepthReq.class,
    GetMarketPricesReq.class,
    GetMUBetsReq.class,
    GetInPlayMarketsReq.class,
    GetMarketInfoReq.class,
    GetAccountFundsReq.class
})
public abstract class APIRequest {

    @XmlElement(required = true, nillable = true)
    protected APIRequestHeader header;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link APIRequestHeader }
     *     
     */
    public APIRequestHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIRequestHeader }
     *     
     */
    public void setHeader(APIRequestHeader value) {
        this.header = value;
    }

}
