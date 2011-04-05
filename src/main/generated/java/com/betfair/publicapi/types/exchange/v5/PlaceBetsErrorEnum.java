
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceBetsErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlaceBetsErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="BETWEEN_1_AND_60_BETS_REQUIRED"/>
 *     &lt;enumeration value="EVENT_INACTIVE"/>
 *     &lt;enumeration value="EVENT_CLOSED"/>
 *     &lt;enumeration value="EVENT_SUSPENDED"/>
 *     &lt;enumeration value="ACCOUNT_CLOSED"/>
 *     &lt;enumeration value="ACCOUNT_SUSPENDED"/>
 *     &lt;enumeration value="AUTHORISATION_PENDING"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="SITE_UPGRADE"/>
 *     &lt;enumeration value="BACK_LAY_COMBINATION"/>
 *     &lt;enumeration value="INVALID_MARKET"/>
 *     &lt;enumeration value="MARKET_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="DIFFERING_MARKETS"/>
 *     &lt;enumeration value="FROM_COUNTRY_FORBIDDEN"/>
 *     &lt;enumeration value="ACCOUNT_IS_EXCLUDED"/>
 *     &lt;enumeration value="BET_IN_PROGRESS"/>
 *     &lt;enumeration value="BBM_DAEMON_NOT_AVAILABLE"/>
 *     &lt;enumeration value="BSP_BETTING_NOT_SUPPORTED"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlaceBetsErrorEnum")
@XmlEnum
public enum PlaceBetsErrorEnum {

    OK,
    BETWEEN_1_AND_60_BETS_REQUIRED,
    EVENT_INACTIVE,
    EVENT_CLOSED,
    EVENT_SUSPENDED,
    ACCOUNT_CLOSED,
    ACCOUNT_SUSPENDED,
    AUTHORISATION_PENDING,
    INTERNAL_ERROR,
    SITE_UPGRADE,
    BACK_LAY_COMBINATION,
    INVALID_MARKET,
    MARKET_TYPE_NOT_SUPPORTED,
    DIFFERING_MARKETS,
    FROM_COUNTRY_FORBIDDEN,
    ACCOUNT_IS_EXCLUDED,
    BET_IN_PROGRESS,
    BBM_DAEMON_NOT_AVAILABLE,
    BSP_BETTING_NOT_SUPPORTED,
    API_ERROR;

    public String value() {
        return name();
    }

    public static PlaceBetsErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
