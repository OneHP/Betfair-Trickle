
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelBetsByMarketErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelBetsByMarketErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_NUMBER_OF_MARKETS"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CancelBetsByMarketErrorEnum")
@XmlEnum
public enum CancelBetsByMarketErrorEnum {

    OK,
    INVALID_NUMBER_OF_MARKETS,
    API_ERROR;

    public String value() {
        return name();
    }

    public static CancelBetsByMarketErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
