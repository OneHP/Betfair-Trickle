
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBetHistoryErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetBetHistoryErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_EVENT_TYPE_ID"/>
 *     &lt;enumeration value="NO_RESULTS"/>
 *     &lt;enumeration value="INVALID_RECORD_COUNT"/>
 *     &lt;enumeration value="INVALID_BET_STATUS"/>
 *     &lt;enumeration value="INVALID_MARKET_TYPE"/>
 *     &lt;enumeration value="INVALID_ORDER_BY"/>
 *     &lt;enumeration value="INVALID_START_RECORD"/>
 *     &lt;enumeration value="INVALID_LOCALE_DEFAULTING_TO_ENGLISH"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetBetHistoryErrorEnum")
@XmlEnum
public enum GetBetHistoryErrorEnum {

    OK,
    INVALID_EVENT_TYPE_ID,
    NO_RESULTS,
    INVALID_RECORD_COUNT,
    INVALID_BET_STATUS,
    INVALID_MARKET_TYPE,
    INVALID_ORDER_BY,
    INVALID_START_RECORD,
    INVALID_LOCALE_DEFAULTING_TO_ENGLISH,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetBetHistoryErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
