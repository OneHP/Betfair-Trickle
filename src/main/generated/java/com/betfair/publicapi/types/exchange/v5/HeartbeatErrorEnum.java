
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeartbeatErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HeartbeatErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="NO_BETS_CANCELLED"/>
 *     &lt;enumeration value="BETS_CANCELLED"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeartbeatErrorEnum")
@XmlEnum
public enum HeartbeatErrorEnum {

    OK,
    NO_BETS_CANCELLED,
    BETS_CANCELLED,
    API_ERROR;

    public String value() {
        return name();
    }

    public static HeartbeatErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
