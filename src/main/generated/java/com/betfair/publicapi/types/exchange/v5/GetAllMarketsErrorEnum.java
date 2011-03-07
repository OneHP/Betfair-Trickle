
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAllMarketsErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetAllMarketsErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_COUNTRY_CODE"/>
 *     &lt;enumeration value="INVALID_LOCALE"/>
 *     &lt;enumeration value="INVALID_EVENT_TYPE_ID"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetAllMarketsErrorEnum")
@XmlEnum
public enum GetAllMarketsErrorEnum {

    OK,
    INVALID_COUNTRY_CODE,
    INVALID_LOCALE,
    INVALID_EVENT_TYPE_ID,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetAllMarketsErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
