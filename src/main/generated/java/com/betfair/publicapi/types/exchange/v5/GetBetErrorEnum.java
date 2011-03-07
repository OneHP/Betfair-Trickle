
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBetErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetBetErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="MARKET_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="BET_ID_INVALID"/>
 *     &lt;enumeration value="NO_RESULTS"/>
 *     &lt;enumeration value="API_ERROR"/>
 *     &lt;enumeration value="INVALID_LOCALE_DEFAULTING_TO_ENGLISH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetBetErrorEnum")
@XmlEnum
public enum GetBetErrorEnum {

    OK,
    MARKET_TYPE_NOT_SUPPORTED,
    BET_ID_INVALID,
    NO_RESULTS,
    API_ERROR,
    INVALID_LOCALE_DEFAULTING_TO_ENGLISH;

    public String value() {
        return name();
    }

    public static GetBetErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
