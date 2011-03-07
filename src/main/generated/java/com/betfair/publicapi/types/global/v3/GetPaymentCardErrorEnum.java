
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPaymentCardErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetPaymentCardErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="ACCOUNT_INACTIVE"/>
 *     &lt;enumeration value="UNAUTHORIZED"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetPaymentCardErrorEnum")
@XmlEnum
public enum GetPaymentCardErrorEnum {

    OK,
    INVALID_PASSWORD,
    ACCOUNT_INACTIVE,
    UNAUTHORIZED,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetPaymentCardErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
