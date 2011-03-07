
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketTradedVolumeCompressedErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetMarketTradedVolumeCompressedErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_CURRENCY"/>
 *     &lt;enumeration value="INVALID_MARKET"/>
 *     &lt;enumeration value="MARKET_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="EVENT_CLOSED"/>
 *     &lt;enumeration value="EVENT_SUSPENDED"/>
 *     &lt;enumeration value="EVENT_INACTIVE"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetMarketTradedVolumeCompressedErrorEnum")
@XmlEnum
public enum GetMarketTradedVolumeCompressedErrorEnum {

    OK,
    INVALID_CURRENCY,
    INVALID_MARKET,
    MARKET_TYPE_NOT_SUPPORTED,
    EVENT_CLOSED,
    EVENT_SUSPENDED,
    EVENT_INACTIVE,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetMarketTradedVolumeCompressedErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
