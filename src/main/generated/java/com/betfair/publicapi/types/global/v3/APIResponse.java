
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://www.betfair.com/publicapi/types/global/v3/}APIResponseHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIResponse", propOrder = {
    "header"
})
@XmlSeeAlso({
    WithdrawToPaymentCardResp.class,
    SubmitLIMBMessageResp.class,
    ViewReferAndEarnResp.class,
    GetEventsResp.class,
    ModifyProfileResp.class,
    DepositFromPaymentCardResp.class,
    CreateAccountResp.class,
    GetEventTypesResp.class,
    GetSubscriptionInfoResp.class,
    LogoutResp.class,
    GetCurrenciesResp.class,
    SetChatNameResp.class,
    TransferFundsResp.class,
    UpdatePaymentCardResp.class,
    GetPaymentCardResp.class,
    ModifyPasswordResp.class,
    KeepAliveResp.class,
    ForgotPasswordResp.class,
    DeletePaymentCardResp.class,
    RetrieveLIMBMessageResp.class,
    SelfExcludeResp.class,
    ViewProfileResp.class,
    AddPaymentCardResp.class,
    LoginResp.class,
    GetCurrenciesV2Resp.class,
    ConvertCurrencyResp.class
})
public abstract class APIResponse {

    @XmlElement(required = true, nillable = true)
    protected APIResponseHeader header;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link APIResponseHeader }
     *     
     */
    public APIResponseHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIResponseHeader }
     *     
     */
    public void setHeader(APIResponseHeader value) {
        this.header = value;
    }

}
