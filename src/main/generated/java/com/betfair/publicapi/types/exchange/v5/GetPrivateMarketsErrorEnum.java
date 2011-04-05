
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPrivateMarketsErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetPrivateMarketsErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_LOCALE"/>
 *     &lt;enumeration value="INVALID_EVENT_TYPE_ID"/>
 *     &lt;enumeration value="INVALID_MARKET_TYPE"/>
 *     &lt;enumeration value="NO_RESULTS"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetPrivateMarketsErrorEnum")
@XmlEnum
public enum GetPrivateMarketsErrorEnum {

    OK,
    INVALID_LOCALE,
    INVALID_EVENT_TYPE_ID,
    INVALID_MARKET_TYPE,
    NO_RESULTS,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetPrivateMarketsErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
