package com.betfair.publicapi.v5.bfexchangeservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Fri Dec 30 13:14:58 GMT 2011
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", name = "BFExchangeService")
@XmlSeeAlso({com.betfair.publicapi.types.exchange.v5.ObjectFactory.class,ObjectFactory.class})
public interface BFExchangeService {

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getInPlayMarkets", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetInPlayMarkets")
    @ResponseWrapper(localName = "getInPlayMarketsResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetInPlayMarketsResponse")
    @WebMethod(action = "getInPlayMarkets")
    public com.betfair.publicapi.types.exchange.v5.GetInPlayMarketsResp getInPlayMarkets(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetInPlayMarketsReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getBetLite", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetBetLite")
    @ResponseWrapper(localName = "getBetLiteResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetBetLiteResponse")
    @WebMethod(action = "getBetLite")
    public com.betfair.publicapi.types.exchange.v5.GetBetLiteResp getBetLite(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetBetLiteReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getSilksV2", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetSilksV2")
    @ResponseWrapper(localName = "getSilksV2Response", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetSilksV2Response")
    @WebMethod(action = "getSilksV2")
    public com.betfair.publicapi.types.exchange.v5.GetSilksV2Resp getSilksV2(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetSilksV2Req request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getMarketPrices", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketPrices")
    @ResponseWrapper(localName = "getMarketPricesResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketPricesResponse")
    @WebMethod(action = "getMarketPrices")
    public com.betfair.publicapi.types.exchange.v5.GetMarketPricesResp getMarketPrices(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetMarketPricesReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "cancelBetsByMarket", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.CancelBetsByMarket")
    @ResponseWrapper(localName = "cancelBetsByMarketResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.CancelBetsByMarketResponse")
    @WebMethod(action = "cancelBetsByMarket")
    public com.betfair.publicapi.types.exchange.v5.CancelBetsByMarketResp cancelBetsByMarket(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.CancelBetsByMarketReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getAccountStatement", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetAccountStatement")
    @ResponseWrapper(localName = "getAccountStatementResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetAccountStatementResponse")
    @WebMethod(action = "getAccountStatement")
    public com.betfair.publicapi.types.exchange.v5.GetAccountStatementResp getAccountStatement(
        @WebParam(name = "req", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetAccountStatementReq req
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getMarket", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarket")
    @ResponseWrapper(localName = "getMarketResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketResponse")
    @WebMethod(action = "getMarket")
    public com.betfair.publicapi.types.exchange.v5.GetMarketResp getMarket(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetMarketReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getMarketPricesCompressed", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketPricesCompressed")
    @ResponseWrapper(localName = "getMarketPricesCompressedResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketPricesCompressedResponse")
    @WebMethod(action = "getMarketPricesCompressed")
    public com.betfair.publicapi.types.exchange.v5.GetMarketPricesCompressedResp getMarketPricesCompressed(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetMarketPricesCompressedReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getBetHistory", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetBetHistory")
    @ResponseWrapper(localName = "getBetHistoryResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetBetHistoryResponse")
    @WebMethod(action = "getBetHistory")
    public com.betfair.publicapi.types.exchange.v5.GetBetHistoryResp getBetHistory(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetBetHistoryReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getCompleteMarketPricesCompressed", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetCompleteMarketPricesCompressed")
    @ResponseWrapper(localName = "getCompleteMarketPricesCompressedResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetCompleteMarketPricesCompressedResponse")
    @WebMethod(action = "getCompleteMarketPricesCompressed")
    public com.betfair.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedResp getCompleteMarketPricesCompressed(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getMarketInfo", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketInfo")
    @ResponseWrapper(localName = "getMarketInfoResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketInfoResponse")
    @WebMethod(action = "getMarketInfo")
    public com.betfair.publicapi.types.exchange.v5.GetMarketInfoResp getMarketInfo(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetMarketInfoReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "updateBets", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.UpdateBets")
    @ResponseWrapper(localName = "updateBetsResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.UpdateBetsResponse")
    @WebMethod(action = "updateBets")
    public com.betfair.publicapi.types.exchange.v5.UpdateBetsResp updateBets(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.UpdateBetsReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getMarketProfitAndLoss", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketProfitAndLoss")
    @ResponseWrapper(localName = "getMarketProfitAndLossResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketProfitAndLossResponse")
    @WebMethod(action = "getMarketProfitAndLoss")
    public com.betfair.publicapi.types.exchange.v5.GetMarketProfitAndLossResp getMarketProfitAndLoss(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetMarketProfitAndLossReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "cancelBets", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.CancelBets")
    @ResponseWrapper(localName = "cancelBetsResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.CancelBetsResponse")
    @WebMethod(action = "cancelBets")
    public com.betfair.publicapi.types.exchange.v5.CancelBetsResp cancelBets(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.CancelBetsReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getAllMarkets", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetAllMarkets")
    @ResponseWrapper(localName = "getAllMarketsResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetAllMarketsResponse")
    @WebMethod(action = "getAllMarkets")
    public com.betfair.publicapi.types.exchange.v5.GetAllMarketsResp getAllMarkets(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetAllMarketsReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getPrivateMarkets", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetPrivateMarkets")
    @ResponseWrapper(localName = "getPrivateMarketsResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetPrivateMarketsResponse")
    @WebMethod(action = "getPrivateMarkets")
    public com.betfair.publicapi.types.exchange.v5.GetPrivateMarketsResp getPrivateMarkets(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetPrivateMarketsReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getCurrentBets", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetCurrentBets")
    @ResponseWrapper(localName = "getCurrentBetsResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetCurrentBetsResponse")
    @WebMethod(action = "getCurrentBets")
    public com.betfair.publicapi.types.exchange.v5.GetCurrentBetsResp getCurrentBets(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetCurrentBetsReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getMUBetsLite", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMUBetsLite")
    @ResponseWrapper(localName = "getMUBetsLiteResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMUBetsLiteResponse")
    @WebMethod(action = "getMUBetsLite")
    public com.betfair.publicapi.types.exchange.v5.GetMUBetsLiteResp getMUBetsLite(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetMUBetsLiteReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getMarketTradedVolumeCompressed", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketTradedVolumeCompressed")
    @ResponseWrapper(localName = "getMarketTradedVolumeCompressedResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketTradedVolumeCompressedResponse")
    @WebMethod(action = "getMarketTradedVolumeCompressed")
    public com.betfair.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedResp getMarketTradedVolumeCompressed(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getMUBets", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMUBets")
    @ResponseWrapper(localName = "getMUBetsResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMUBetsResponse")
    @WebMethod(action = "getMUBets")
    public com.betfair.publicapi.types.exchange.v5.GetMUBetsResp getMUBets(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetMUBetsReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getBetMatchesLite", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetBetMatchesLite")
    @ResponseWrapper(localName = "getBetMatchesLiteResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetBetMatchesLiteResponse")
    @WebMethod(action = "getBetMatchesLite")
    public com.betfair.publicapi.types.exchange.v5.GetBetMatchesLiteResp getBetMatchesLite(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetBetMatchesLiteReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getCurrentBetsLite", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetCurrentBetsLite")
    @ResponseWrapper(localName = "getCurrentBetsLiteResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetCurrentBetsLiteResponse")
    @WebMethod(action = "getCurrentBetsLite")
    public com.betfair.publicapi.types.exchange.v5.GetCurrentBetsLiteResp getCurrentBetsLite(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetCurrentBetsLiteReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getSilks", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetSilks")
    @ResponseWrapper(localName = "getSilksResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetSilksResponse")
    @WebMethod(action = "getSilks")
    public com.betfair.publicapi.types.exchange.v5.GetSilksResp getSilks(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetSilksReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "heartbeat", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.Heartbeat")
    @ResponseWrapper(localName = "heartbeatResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.HeartbeatResponse")
    @WebMethod(action = "heartbeat")
    public com.betfair.publicapi.types.exchange.v5.HeartbeatResp heartbeat(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.HeartbeatReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getMarketTradedVolume", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketTradedVolume")
    @ResponseWrapper(localName = "getMarketTradedVolumeResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetMarketTradedVolumeResponse")
    @WebMethod(action = "getMarketTradedVolume")
    public com.betfair.publicapi.types.exchange.v5.GetMarketTradedVolumeResp getMarketTradedVolume(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetMarketTradedVolumeReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getCoupon", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetCoupon")
    @ResponseWrapper(localName = "getCouponResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetCouponResponse")
    @WebMethod(action = "getCoupon")
    public com.betfair.publicapi.types.exchange.v5.GetCouponResp getCoupon(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetCouponReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "placeBets", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.PlaceBets")
    @ResponseWrapper(localName = "placeBetsResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.PlaceBetsResponse")
    @WebMethod(action = "placeBets")
    public com.betfair.publicapi.types.exchange.v5.PlaceBetsResp placeBets(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.PlaceBetsReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getBet", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetBet")
    @ResponseWrapper(localName = "getBetResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetBetResponse")
    @WebMethod(action = "getBet")
    public com.betfair.publicapi.types.exchange.v5.GetBetResp getBet(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetBetReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getAccountFunds", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetAccountFunds")
    @ResponseWrapper(localName = "getAccountFundsResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetAccountFundsResponse")
    @WebMethod(action = "getAccountFunds")
    public com.betfair.publicapi.types.exchange.v5.GetAccountFundsResp getAccountFunds(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetAccountFundsReq request
    );

    @WebResult(name = "Result", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
    @RequestWrapper(localName = "getDetailAvailableMktDepth", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetDetailAvailableMktDepth")
    @ResponseWrapper(localName = "getDetailAvailableMktDepthResponse", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/", className = "com.betfair.publicapi.v5.bfexchangeservice.GetDetailAvailableMktDepthResponse")
    @WebMethod(action = "getDetailAvailableMktDepth")
    public com.betfair.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthResp getDetailAvailableMktDepth(
        @WebParam(name = "request", targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/")
        com.betfair.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthReq request
    );
}
