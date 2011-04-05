
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketDisplayErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketDisplayErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_MARKET"/>
 *     &lt;enumeration value="NO_SILKS_AVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarketDisplayErrorEnum")
@XmlEnum
public enum MarketDisplayErrorEnum {

    OK,
    INVALID_MARKET,
    NO_SILKS_AVAILABLE;

    public String value() {
        return name();
    }

    public static MarketDisplayErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
