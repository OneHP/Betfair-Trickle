
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelBetsErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelBetsErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="BET_IN_PROGRESS"/>
 *     &lt;enumeration value="BBM_DAEMON_NOT_AVAILABLE"/>
 *     &lt;enumeration value="INVALID_NUMER_OF_CANCELLATIONS"/>
 *     &lt;enumeration value="MARKET_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="MARKET_STATUS_INVALID"/>
 *     &lt;enumeration value="MARKET_IDS_DONT_MATCH"/>
 *     &lt;enumeration value="INVALID_MARKET_ID"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CancelBetsErrorEnum")
@XmlEnum
public enum CancelBetsErrorEnum {

    OK,
    BET_IN_PROGRESS,
    BBM_DAEMON_NOT_AVAILABLE,
    INVALID_NUMER_OF_CANCELLATIONS,
    MARKET_TYPE_NOT_SUPPORTED,
    MARKET_STATUS_INVALID,
    MARKET_IDS_DONT_MATCH,
    INVALID_MARKET_ID,
    API_ERROR;

    public String value() {
        return name();
    }

    public static CancelBetsErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
