
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateBetsErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateBetsErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="BET_IN_PROGRESS"/>
 *     &lt;enumeration value="BBM_DAEMON_NOT_AVAILABLE"/>
 *     &lt;enumeration value="ACCOUNT_PENDING"/>
 *     &lt;enumeration value="ACCOUNT_SUSPENDED"/>
 *     &lt;enumeration value="ACCOUNT_CLOSED"/>
 *     &lt;enumeration value="INVALID_NUMBER_OF_BETS"/>
 *     &lt;enumeration value="INVALID_MARKET_ID"/>
 *     &lt;enumeration value="MARKET_STATUS_INVALID"/>
 *     &lt;enumeration value="FROM_COUNTRY_FORBIDDEN"/>
 *     &lt;enumeration value="API_ERROR"/>
 *     &lt;enumeration value="MARKET_TYPE_NOT_SUPPORTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateBetsErrorEnum")
@XmlEnum
public enum UpdateBetsErrorEnum {

    OK,
    BET_IN_PROGRESS,
    BBM_DAEMON_NOT_AVAILABLE,
    ACCOUNT_PENDING,
    ACCOUNT_SUSPENDED,
    ACCOUNT_CLOSED,
    INVALID_NUMBER_OF_BETS,
    INVALID_MARKET_ID,
    MARKET_STATUS_INVALID,
    FROM_COUNTRY_FORBIDDEN,
    API_ERROR,
    MARKET_TYPE_NOT_SUPPORTED;

    public String value() {
        return name();
    }

    public static UpdateBetsErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
