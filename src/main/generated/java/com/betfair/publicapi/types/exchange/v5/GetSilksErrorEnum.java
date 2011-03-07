
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSilksErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetSilksErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_LOCALE"/>
 *     &lt;enumeration value="INVALID_NUMBER_OF_MARKETS"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetSilksErrorEnum")
@XmlEnum
public enum GetSilksErrorEnum {

    OK,
    INVALID_LOCALE,
    INVALID_NUMBER_OF_MARKETS,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetSilksErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
