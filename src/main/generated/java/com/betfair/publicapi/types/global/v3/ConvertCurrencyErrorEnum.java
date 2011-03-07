
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConvertCurrencyErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConvertCurrencyErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_AMOUNT"/>
 *     &lt;enumeration value="INVALID_FROM_CURRENCY"/>
 *     &lt;enumeration value="INVALID_TO_CURRENCY"/>
 *     &lt;enumeration value="CANNOT_CONVERT"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConvertCurrencyErrorEnum")
@XmlEnum
public enum ConvertCurrencyErrorEnum {

    OK,
    INVALID_AMOUNT,
    INVALID_FROM_CURRENCY,
    INVALID_TO_CURRENCY,
    CANNOT_CONVERT,
    API_ERROR;

    public String value() {
        return name();
    }

    public static ConvertCurrencyErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
