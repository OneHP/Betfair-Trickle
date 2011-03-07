
package com.betfair.publicapi.types.global.v3;

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
 *         &lt;element name="header" type="{http://www.betfair.com/publicapi/types/global/v3/}APIRequestHeader"/>
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
    GetCurrenciesReq.class,
    GetPaymentCardReq.class,
    ModifyProfileReq.class,
    AddPaymentCardReq.class,
    GetCurrenciesV2Req.class,
    SelfExcludeReq.class,
    SubmitLIMBMessageReq.class,
    GetSubscriptionInfoReq.class,
    KeepAliveReq.class,
    DeletePaymentCardReq.class,
    ConvertCurrencyReq.class,
    GetEventsReq.class,
    GetEventTypesReq.class,
    CreateAccountReq.class,
    RetrieveLIMBMessageReq.class,
    ViewReferAndEarnReq.class,
    SetChatNameReq.class,
    ViewProfileReq.class,
    UpdatePaymentCardReq.class,
    TransferFundsReq.class,
    DepositFromPaymentCardReq.class,
    ViewProfileV2Req.class,
    ModifyPasswordReq.class,
    ForgotPasswordReq.class,
    LogoutReq.class,
    WithdrawToPaymentCardReq.class
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
