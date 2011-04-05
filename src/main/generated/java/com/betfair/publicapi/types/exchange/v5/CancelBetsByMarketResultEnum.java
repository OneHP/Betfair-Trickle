
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelBetsByMarketResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelBetsByMarketResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="MARKET_STATUS_INVALID"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *     &lt;enumeration value="INVALID_MARKET"/>
 *     &lt;enumeration value="NO_UNMATCHED_BETS"/>
 *     &lt;enumeration value="INPLAY_FORBIDDEN"/>
 *     &lt;enumeration value="FROM_COUNTRY_FORBIDDEN"/>
 *     &lt;enumeration value="INPLAY_FROM_COUNTRY_FORBIDDEN"/>
 *     &lt;enumeration value="SITE_UPGRADE"/>
 *     &lt;enumeration value="BET_NOT_CANCELLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CancelBetsByMarketResultEnum")
@XmlEnum
public enum CancelBetsByMarketResultEnum {

    OK,
    MARKET_STATUS_INVALID,
    UNKNOWN_ERROR,
    INVALID_MARKET,
    NO_UNMATCHED_BETS,
    INPLAY_FORBIDDEN,
    FROM_COUNTRY_FORBIDDEN,
    INPLAY_FROM_COUNTRY_FORBIDDEN,
    SITE_UPGRADE,
    BET_NOT_CANCELLED;

    public String value() {
        return name();
    }

    public static CancelBetsByMarketResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
