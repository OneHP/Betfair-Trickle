
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetMarketErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_MARKET"/>
 *     &lt;enumeration value="MARKET_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_LOCALE_DEFAULTING_TO_ENGLISH"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetMarketErrorEnum")
@XmlEnum
public enum GetMarketErrorEnum {

    OK,
    INVALID_MARKET,
    MARKET_TYPE_NOT_SUPPORTED,
    INVALID_LOCALE_DEFAULTING_TO_ENGLISH,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetMarketErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
