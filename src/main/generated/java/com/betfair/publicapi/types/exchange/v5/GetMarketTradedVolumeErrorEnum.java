
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketTradedVolumeErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetMarketTradedVolumeErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="NO_RESULTS"/>
 *     &lt;enumeration value="INVALID_MARKET"/>
 *     &lt;enumeration value="INVALID_RUNNER"/>
 *     &lt;enumeration value="INVALID_ASIAN_LINE"/>
 *     &lt;enumeration value="MARKET_CLOSED"/>
 *     &lt;enumeration value="MARKET_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_CURRENCY"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetMarketTradedVolumeErrorEnum")
@XmlEnum
public enum GetMarketTradedVolumeErrorEnum {

    OK,
    NO_RESULTS,
    INVALID_MARKET,
    INVALID_RUNNER,
    INVALID_ASIAN_LINE,
    MARKET_CLOSED,
    MARKET_TYPE_NOT_SUPPORTED,
    INVALID_CURRENCY,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetMarketTradedVolumeErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
