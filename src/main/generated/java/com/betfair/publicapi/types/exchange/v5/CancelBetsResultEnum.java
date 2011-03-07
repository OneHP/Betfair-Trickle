
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelBetsResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelBetsResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="BET_IN_PROGRESS"/>
 *     &lt;enumeration value="BBM_DAEMON_NOT_AVAILABLE"/>
 *     &lt;enumeration value="INVALID_BET_ID"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *     &lt;enumeration value="TAKEN_OR_LAPSED"/>
 *     &lt;enumeration value="REMAINING_CANCELLED"/>
 *     &lt;enumeration value="INPLAY_FORBIDDEN"/>
 *     &lt;enumeration value="FROM_COUNTRY_FORBIDDEN"/>
 *     &lt;enumeration value="INPLAY_FROM_COUNTRY_FORBIDDEN"/>
 *     &lt;enumeration value="SITE_UPGRADE"/>
 *     &lt;enumeration value="BET_NOT_CANCELLED"/>
 *     &lt;enumeration value="BSP_BETS_CANNOT_BE_CANCELLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CancelBetsResultEnum")
@XmlEnum
public enum CancelBetsResultEnum {

    OK,
    BET_IN_PROGRESS,
    BBM_DAEMON_NOT_AVAILABLE,
    INVALID_BET_ID,
    UNKNOWN_ERROR,
    TAKEN_OR_LAPSED,
    REMAINING_CANCELLED,
    INPLAY_FORBIDDEN,
    FROM_COUNTRY_FORBIDDEN,
    INPLAY_FROM_COUNTRY_FORBIDDEN,
    SITE_UPGRADE,
    BET_NOT_CANCELLED,
    BSP_BETS_CANNOT_BE_CANCELLED;

    public String value() {
        return name();
    }

    public static CancelBetsResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
