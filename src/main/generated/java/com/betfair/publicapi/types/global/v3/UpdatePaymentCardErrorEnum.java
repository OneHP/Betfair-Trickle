
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePaymentCardErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdatePaymentCardErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_CARD_DETAILS"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="ACCOUNT_INACTIVE"/>
 *     &lt;enumeration value="UNAUTHORIZED"/>
 *     &lt;enumeration value="INVALID_COUNTRY_CODE"/>
 *     &lt;enumeration value="INVALID_CARD_ADDRESS"/>
 *     &lt;enumeration value="INVALID_EXPIRY_DATE"/>
 *     &lt;enumeration value="INVALID_START_DATE"/>
 *     &lt;enumeration value="INVALID_ZIP_CODE"/>
 *     &lt;enumeration value="INVALID_ISSUE_NUMBER"/>
 *     &lt;enumeration value="API_ERROR"/>
 *     &lt;enumeration value="CARD_NOT_FOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdatePaymentCardErrorEnum")
@XmlEnum
public enum UpdatePaymentCardErrorEnum {

    OK,
    INVALID_CARD_DETAILS,
    INVALID_PASSWORD,
    ACCOUNT_INACTIVE,
    UNAUTHORIZED,
    INVALID_COUNTRY_CODE,
    INVALID_CARD_ADDRESS,
    INVALID_EXPIRY_DATE,
    INVALID_START_DATE,
    INVALID_ZIP_CODE,
    INVALID_ISSUE_NUMBER,
    API_ERROR,
    CARD_NOT_FOUND;

    public String value() {
        return name();
    }

    public static UpdatePaymentCardErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
