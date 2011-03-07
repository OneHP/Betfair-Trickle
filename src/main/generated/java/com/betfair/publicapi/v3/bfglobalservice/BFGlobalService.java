package com.betfair.publicapi.v3.bfglobalservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Wed Mar 02 19:14:27 GMT 2011
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", name = "BFGlobalService")
@XmlSeeAlso({ObjectFactory.class,com.betfair.publicapi.types.global.v3.ObjectFactory.class})
public interface BFGlobalService {

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "viewReferAndEarn", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ViewReferAndEarn")
    @ResponseWrapper(localName = "viewReferAndEarnResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ViewReferAndEarnResponse")
    @WebMethod(action = "viewReferAndEarn")
    public com.betfair.publicapi.types.global.v3.ViewReferAndEarnResp viewReferAndEarn(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.ViewReferAndEarnReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "viewProfileV2", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ViewProfileV2")
    @ResponseWrapper(localName = "viewProfileV2Response", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ViewProfileV2Response")
    @WebMethod(action = "viewProfileV2")
    public com.betfair.publicapi.types.global.v3.ViewProfileV2Resp viewProfileV2(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.ViewProfileV2Req request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "getPaymentCard", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetPaymentCard")
    @ResponseWrapper(localName = "getPaymentCardResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetPaymentCardResponse")
    @WebMethod(action = "getPaymentCard")
    public com.betfair.publicapi.types.global.v3.GetPaymentCardResp getPaymentCard(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.GetPaymentCardReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "logout", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.LogoutResponse")
    @WebMethod(action = "logout")
    public com.betfair.publicapi.types.global.v3.LogoutResp logout(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.LogoutReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "retrieveLIMBMessage", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.RetrieveLIMBMessage")
    @ResponseWrapper(localName = "retrieveLIMBMessageResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.RetrieveLIMBMessageResponse")
    @WebMethod(action = "retrieveLIMBMessage")
    public com.betfair.publicapi.types.global.v3.RetrieveLIMBMessageResp retrieveLIMBMessage(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.RetrieveLIMBMessageReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "login", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.LoginResponse")
    @WebMethod(action = "login")
    public com.betfair.publicapi.types.global.v3.LoginResp login(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.LoginReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "updatePaymentCard", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.UpdatePaymentCard")
    @ResponseWrapper(localName = "updatePaymentCardResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.UpdatePaymentCardResponse")
    @WebMethod(action = "updatePaymentCard")
    public com.betfair.publicapi.types.global.v3.UpdatePaymentCardResp updatePaymentCard(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.UpdatePaymentCardReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "selfExclude", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.SelfExclude")
    @ResponseWrapper(localName = "selfExcludeResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.SelfExcludeResponse")
    @WebMethod(action = "selfExclude")
    public com.betfair.publicapi.types.global.v3.SelfExcludeResp selfExclude(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.SelfExcludeReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "getAllEventTypes", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetAllEventTypes")
    @ResponseWrapper(localName = "getAllEventTypesResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetAllEventTypesResponse")
    @WebMethod(action = "getAllEventTypes")
    public com.betfair.publicapi.types.global.v3.GetEventTypesResp getAllEventTypes(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.GetEventTypesReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "transferFunds", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.TransferFunds")
    @ResponseWrapper(localName = "transferFundsResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.TransferFundsResponse")
    @WebMethod(action = "transferFunds")
    public com.betfair.publicapi.types.global.v3.TransferFundsResp transferFunds(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.TransferFundsReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "addPaymentCard", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.AddPaymentCard")
    @ResponseWrapper(localName = "addPaymentCardResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.AddPaymentCardResponse")
    @WebMethod(action = "addPaymentCard")
    public com.betfair.publicapi.types.global.v3.AddPaymentCardResp addPaymentCard(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.AddPaymentCardReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "setChatName", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.SetChatName")
    @ResponseWrapper(localName = "setChatNameResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.SetChatNameResponse")
    @WebMethod(action = "setChatName")
    public com.betfair.publicapi.types.global.v3.SetChatNameResp setChatName(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.SetChatNameReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "getActiveEventTypes", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetActiveEventTypes")
    @ResponseWrapper(localName = "getActiveEventTypesResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetActiveEventTypesResponse")
    @WebMethod(action = "getActiveEventTypes")
    public com.betfair.publicapi.types.global.v3.GetEventTypesResp getActiveEventTypes(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.GetEventTypesReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "convertCurrency", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ConvertCurrency")
    @ResponseWrapper(localName = "convertCurrencyResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ConvertCurrencyResponse")
    @WebMethod(action = "convertCurrency")
    public com.betfair.publicapi.types.global.v3.ConvertCurrencyResp convertCurrency(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.ConvertCurrencyReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "submitLIMBMessage", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.SubmitLIMBMessage")
    @ResponseWrapper(localName = "submitLIMBMessageResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.SubmitLIMBMessageResponse")
    @WebMethod(action = "submitLIMBMessage")
    public com.betfair.publicapi.types.global.v3.SubmitLIMBMessageResp submitLIMBMessage(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.SubmitLIMBMessageReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "modifyProfile", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ModifyProfile")
    @ResponseWrapper(localName = "modifyProfileResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ModifyProfileResponse")
    @WebMethod(action = "modifyProfile")
    public com.betfair.publicapi.types.global.v3.ModifyProfileResp modifyProfile(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.ModifyProfileReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "depositFromPaymentCard", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.DepositFromPaymentCard")
    @ResponseWrapper(localName = "depositFromPaymentCardResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.DepositFromPaymentCardResponse")
    @WebMethod(action = "depositFromPaymentCard")
    public com.betfair.publicapi.types.global.v3.DepositFromPaymentCardResp depositFromPaymentCard(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.DepositFromPaymentCardReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "viewProfile", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ViewProfile")
    @ResponseWrapper(localName = "viewProfileResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ViewProfileResponse")
    @WebMethod(action = "viewProfile")
    public com.betfair.publicapi.types.global.v3.ViewProfileResp viewProfile(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.ViewProfileReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "modifyPassword", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ModifyPassword")
    @ResponseWrapper(localName = "modifyPasswordResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ModifyPasswordResponse")
    @WebMethod(action = "modifyPassword")
    public com.betfair.publicapi.types.global.v3.ModifyPasswordResp modifyPassword(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.ModifyPasswordReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "keepAlive", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.KeepAlive")
    @ResponseWrapper(localName = "keepAliveResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.KeepAliveResponse")
    @WebMethod(action = "keepAlive")
    public com.betfair.publicapi.types.global.v3.KeepAliveResp keepAlive(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.KeepAliveReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "getSubscriptionInfo", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetSubscriptionInfo")
    @ResponseWrapper(localName = "getSubscriptionInfoResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetSubscriptionInfoResponse")
    @WebMethod(action = "getSubscriptionInfo")
    public com.betfair.publicapi.types.global.v3.GetSubscriptionInfoResp getSubscriptionInfo(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.GetSubscriptionInfoReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "getAllCurrenciesV2", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetAllCurrenciesV2")
    @ResponseWrapper(localName = "getAllCurrenciesV2Response", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetAllCurrenciesV2Response")
    @WebMethod(action = "getAllCurrenciesV2")
    public com.betfair.publicapi.types.global.v3.GetCurrenciesV2Resp getAllCurrenciesV2(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.GetCurrenciesV2Req request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "getEvents", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetEvents")
    @ResponseWrapper(localName = "getEventsResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetEventsResponse")
    @WebMethod(action = "getEvents")
    public com.betfair.publicapi.types.global.v3.GetEventsResp getEvents(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.GetEventsReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "forgotPassword", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ForgotPassword")
    @ResponseWrapper(localName = "forgotPasswordResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.ForgotPasswordResponse")
    @WebMethod(action = "forgotPassword")
    public com.betfair.publicapi.types.global.v3.ForgotPasswordResp forgotPassword(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.ForgotPasswordReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "withdrawToPaymentCard", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.WithdrawToPaymentCard")
    @ResponseWrapper(localName = "withdrawToPaymentCardResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.WithdrawToPaymentCardResponse")
    @WebMethod(action = "withdrawToPaymentCard")
    public com.betfair.publicapi.types.global.v3.WithdrawToPaymentCardResp withdrawToPaymentCard(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.WithdrawToPaymentCardReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "deletePaymentCard", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.DeletePaymentCard")
    @ResponseWrapper(localName = "deletePaymentCardResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.DeletePaymentCardResponse")
    @WebMethod(action = "deletePaymentCard")
    public com.betfair.publicapi.types.global.v3.DeletePaymentCardResp deletePaymentCard(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.DeletePaymentCardReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "createAccount", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.CreateAccount")
    @ResponseWrapper(localName = "createAccountResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.CreateAccountResponse")
    @WebMethod(action = "createAccount")
    public com.betfair.publicapi.types.global.v3.CreateAccountResp createAccount(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.CreateAccountReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
    @RequestWrapper(localName = "getAllCurrencies", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetAllCurrencies")
    @ResponseWrapper(localName = "getAllCurrenciesResponse", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/", className = "com.betfair.publicapi.v3.bfglobalservice.GetAllCurrenciesResponse")
    @WebMethod(action = "getAllCurrencies")
    public com.betfair.publicapi.types.global.v3.GetCurrenciesResp getAllCurrencies(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v3/BFGlobalService/")
        com.betfair.publicapi.types.global.v3.GetCurrenciesReq request
    );
}
