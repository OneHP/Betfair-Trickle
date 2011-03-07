
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetsOrderByEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BetsOrderByEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="BET_ID"/>
 *     &lt;enumeration value="MARKET_NAME"/>
 *     &lt;enumeration value="PLACED_DATE"/>
 *     &lt;enumeration value="MATCHED_DATE"/>
 *     &lt;enumeration value="CANCELLED_DATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BetsOrderByEnum")
@XmlEnum
public enum BetsOrderByEnum {

    NONE,
    BET_ID,
    MARKET_NAME,
    PLACED_DATE,
    MATCHED_DATE,
    CANCELLED_DATE;

    public String value() {
        return name();
    }

    public static BetsOrderByEnum fromValue(String v) {
        return valueOf(v);
    }

}
