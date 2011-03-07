
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMUBetsErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetMUBetsErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_START_RECORD"/>
 *     &lt;enumeration value="INVALID_MARKET_ID"/>
 *     &lt;enumeration value="INVALID_RECORD_COUNT"/>
 *     &lt;enumeration value="INVALID_BET_STATUS"/>
 *     &lt;enumeration value="INVALID_ORDER_BY_FOR_STATUS"/>
 *     &lt;enumeration value="TOO_MANY_BETS_REQUESTED"/>
 *     &lt;enumeration value="NO_RESULTS"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetMUBetsErrorEnum")
@XmlEnum
public enum GetMUBetsErrorEnum {

    OK,
    INVALID_START_RECORD,
    INVALID_MARKET_ID,
    INVALID_RECORD_COUNT,
    INVALID_BET_STATUS,
    INVALID_ORDER_BY_FOR_STATUS,
    TOO_MANY_BETS_REQUESTED,
    NO_RESULTS,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetMUBetsErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
