
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoginErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="OK_MESSAGES"/>
 *     &lt;enumeration value="FAILED_MESSAGE"/>
 *     &lt;enumeration value="INVALID_USERNAME_OR_PASSWORD"/>
 *     &lt;enumeration value="USER_NOT_ACCOUNT_OWNER"/>
 *     &lt;enumeration value="INVALID_VENDOR_SOFTWARE_ID"/>
 *     &lt;enumeration value="INVALID_PRODUCT"/>
 *     &lt;enumeration value="INVALID_LOCATION"/>
 *     &lt;enumeration value="LOGIN_FAILED_ACCOUNT_LOCKED"/>
 *     &lt;enumeration value="ACCOUNT_SUSPENDED"/>
 *     &lt;enumeration value="T_AND_C_ACCEPTANCE_REQUIRED"/>
 *     &lt;enumeration value="POKER_T_AND_C_ACCEPTANCE_REQUIRED"/>
 *     &lt;enumeration value="LOGIN_REQUIRE_TERMS_AND_CONDITIONS_ACCEPTANCE"/>
 *     &lt;enumeration value="LOGIN_UNAUTHORIZED"/>
 *     &lt;enumeration value="ACCOUNT_CLOSED"/>
 *     &lt;enumeration value="LOGIN_RESTRICTED_LOCATION"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoginErrorEnum")
@XmlEnum
public enum LoginErrorEnum {

    OK,
    OK_MESSAGES,
    FAILED_MESSAGE,
    INVALID_USERNAME_OR_PASSWORD,
    USER_NOT_ACCOUNT_OWNER,
    INVALID_VENDOR_SOFTWARE_ID,
    INVALID_PRODUCT,
    INVALID_LOCATION,
    LOGIN_FAILED_ACCOUNT_LOCKED,
    ACCOUNT_SUSPENDED,
    T_AND_C_ACCEPTANCE_REQUIRED,
    POKER_T_AND_C_ACCEPTANCE_REQUIRED,
    LOGIN_REQUIRE_TERMS_AND_CONDITIONS_ACCEPTANCE,
    LOGIN_UNAUTHORIZED,
    ACCOUNT_CLOSED,
    LOGIN_RESTRICTED_LOCATION,
    API_ERROR;

    public String value() {
        return name();
    }

    public static LoginErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
