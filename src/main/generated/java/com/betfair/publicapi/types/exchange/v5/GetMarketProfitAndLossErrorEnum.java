
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketProfitAndLossErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetMarketProfitAndLossErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_MARKET"/>
 *     &lt;enumeration value="UNSUPPORTED_MARKET_TYPE"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="MARKET_CLOSED"/>
 *     &lt;enumeration value="INVALID_LOCALE_DEFAULTING_TO_ENGLISH"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetMarketProfitAndLossErrorEnum")
@XmlEnum
public enum GetMarketProfitAndLossErrorEnum {

    INVALID_MARKET,
    UNSUPPORTED_MARKET_TYPE,
    OK,
    MARKET_CLOSED,
    INVALID_LOCALE_DEFAULTING_TO_ENGLISH,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetMarketProfitAndLossErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
