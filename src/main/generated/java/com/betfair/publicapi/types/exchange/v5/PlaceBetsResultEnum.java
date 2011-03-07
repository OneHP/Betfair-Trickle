
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceBetsResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlaceBetsResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="BET_IN_PROGRESS"/>
 *     &lt;enumeration value="BBM_DAEMON_NOT_AVAILABLE"/>
 *     &lt;enumeration value="ACCOUNT_CLOSED"/>
 *     &lt;enumeration value="ACCOUNT_IS_EXCLUDED"/>
 *     &lt;enumeration value="ACCOUNT_SUSPENDED"/>
 *     &lt;enumeration value="CANNOT_ACCEPT_BET"/>
 *     &lt;enumeration value="EXPOSURE_CALCULATION_IN_PROGRESS"/>
 *     &lt;enumeration value="EXPOSURE_OR_AVAILABLE_BALANCE_EXCEEDED"/>
 *     &lt;enumeration value="FROM_COUNTRY_ON_EVENT_FORBIDDEN"/>
 *     &lt;enumeration value="INPLAY_FROM_COUNTRY_FORBIDDEN"/>
 *     &lt;enumeration value="INSUFFICIENT_BALANCE"/>
 *     &lt;enumeration value="INVALID_ASIAN_LINE_ID"/>
 *     &lt;enumeration value="INVALID_BET_TYPE"/>
 *     &lt;enumeration value="INVALID_INCREMENT"/>
 *     &lt;enumeration value="INVALID_MARKET"/>
 *     &lt;enumeration value="INVALID_PRICE"/>
 *     &lt;enumeration value="INVALID_SELECTION"/>
 *     &lt;enumeration value="INVALID_SIZE"/>
 *     &lt;enumeration value="LINES_OUT_OF_RANGE"/>
 *     &lt;enumeration value="LOSS_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="SELECTION_REMOVED"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *     &lt;enumeration value="VACANT_TRAP"/>
 *     &lt;enumeration value="EVENT_CLOSED"/>
 *     &lt;enumeration value="AUTHORISATION_PENDING"/>
 *     &lt;enumeration value="BSP_BETTING_NOT_ALLOWED"/>
 *     &lt;enumeration value="BSP_BETTING_NOT_SUPPORTED"/>
 *     &lt;enumeration value="BSP_MULTIPLE_BETS_NOT_ALLOWED"/>
 *     &lt;enumeration value="EVENT_RECONCILED"/>
 *     &lt;enumeration value="INVALID_PERSISTENCE"/>
 *     &lt;enumeration value="ACCOUNT_LOCKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlaceBetsResultEnum")
@XmlEnum
public enum PlaceBetsResultEnum {

    OK,
    BET_IN_PROGRESS,
    BBM_DAEMON_NOT_AVAILABLE,
    ACCOUNT_CLOSED,
    ACCOUNT_IS_EXCLUDED,
    ACCOUNT_SUSPENDED,
    CANNOT_ACCEPT_BET,
    EXPOSURE_CALCULATION_IN_PROGRESS,
    EXPOSURE_OR_AVAILABLE_BALANCE_EXCEEDED,
    FROM_COUNTRY_ON_EVENT_FORBIDDEN,
    INPLAY_FROM_COUNTRY_FORBIDDEN,
    INSUFFICIENT_BALANCE,
    INVALID_ASIAN_LINE_ID,
    INVALID_BET_TYPE,
    INVALID_INCREMENT,
    INVALID_MARKET,
    INVALID_PRICE,
    INVALID_SELECTION,
    INVALID_SIZE,
    LINES_OUT_OF_RANGE,
    LOSS_LIMIT_EXCEEDED,
    SELECTION_REMOVED,
    UNKNOWN_ERROR,
    VACANT_TRAP,
    EVENT_CLOSED,
    AUTHORISATION_PENDING,
    BSP_BETTING_NOT_ALLOWED,
    BSP_BETTING_NOT_SUPPORTED,
    BSP_MULTIPLE_BETS_NOT_ALLOWED,
    EVENT_RECONCILED,
    INVALID_PERSISTENCE,
    ACCOUNT_LOCKED;

    public String value() {
        return name();
    }

    public static PlaceBetsResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
