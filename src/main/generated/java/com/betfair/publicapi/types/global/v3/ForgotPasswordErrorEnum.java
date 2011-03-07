
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForgotPasswordErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForgotPasswordErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_USERNAME"/>
 *     &lt;enumeration value="INVALID_COUNTRY_OF_RESIDENCE"/>
 *     &lt;enumeration value="INVALID_EMAIL"/>
 *     &lt;enumeration value="INVALID_ANSWER"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="TOO_MANY_ATTEMPTS_ACCOUNT_SUSPENDED"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForgotPasswordErrorEnum")
@XmlEnum
public enum ForgotPasswordErrorEnum {

    OK,
    INVALID_USERNAME,
    INVALID_COUNTRY_OF_RESIDENCE,
    INVALID_EMAIL,
    INVALID_ANSWER,
    INVALID_PASSWORD,
    TOO_MANY_ATTEMPTS_ACCOUNT_SUSPENDED,
    API_ERROR;

    public String value() {
        return name();
    }

    public static ForgotPasswordErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
