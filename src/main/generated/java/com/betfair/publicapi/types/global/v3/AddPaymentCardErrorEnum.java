
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPaymentCardErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddPaymentCardErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_CARD_DETAILS"/>
 *     &lt;enumeration value="INVALID_CARD_CV2"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="ACCOUNT_INACTIVE"/>
 *     &lt;enumeration value="UNAUTHORIZED"/>
 *     &lt;enumeration value="INVALID_EXPIRY_DATE"/>
 *     &lt;enumeration value="INVALID_START_DATE"/>
 *     &lt;enumeration value="INVALID_CARD_NUMBER"/>
 *     &lt;enumeration value="INVALID_ZIP_CODE"/>
 *     &lt;enumeration value="INVALID_COUNTRY_CODE"/>
 *     &lt;enumeration value="INVALID_BILLING_NAME"/>
 *     &lt;enumeration value="INVALID_CARD_ADDRESS"/>
 *     &lt;enumeration value="CARD_ALREADY_EXISTS"/>
 *     &lt;enumeration value="AGE_VERIFICATION_REQUIRED"/>
 *     &lt;enumeration value="NOT_FUNDED_WITH_FIRST_CARD"/>
 *     &lt;enumeration value="CARD_NOT_VALID_FOR_ACCOUNT_CURRENCY"/>
 *     &lt;enumeration value="INVALID_CARD_TYPE"/>
 *     &lt;enumeration value="MAXIMUM_NUMBER_OF_CARDS_REACHED"/>
 *     &lt;enumeration value="INVALID_ISSUE_NUMBER"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddPaymentCardErrorEnum")
@XmlEnum
public enum AddPaymentCardErrorEnum {

    OK("OK"),
    INVALID_CARD_DETAILS("INVALID_CARD_DETAILS"),
    @XmlEnumValue("INVALID_CARD_CV2")
    INVALID_CARD_CV_2("INVALID_CARD_CV2"),
    INVALID_PASSWORD("INVALID_PASSWORD"),
    ACCOUNT_INACTIVE("ACCOUNT_INACTIVE"),
    UNAUTHORIZED("UNAUTHORIZED"),
    INVALID_EXPIRY_DATE("INVALID_EXPIRY_DATE"),
    INVALID_START_DATE("INVALID_START_DATE"),
    INVALID_CARD_NUMBER("INVALID_CARD_NUMBER"),
    INVALID_ZIP_CODE("INVALID_ZIP_CODE"),
    INVALID_COUNTRY_CODE("INVALID_COUNTRY_CODE"),
    INVALID_BILLING_NAME("INVALID_BILLING_NAME"),
    INVALID_CARD_ADDRESS("INVALID_CARD_ADDRESS"),
    CARD_ALREADY_EXISTS("CARD_ALREADY_EXISTS"),
    AGE_VERIFICATION_REQUIRED("AGE_VERIFICATION_REQUIRED"),
    NOT_FUNDED_WITH_FIRST_CARD("NOT_FUNDED_WITH_FIRST_CARD"),
    CARD_NOT_VALID_FOR_ACCOUNT_CURRENCY("CARD_NOT_VALID_FOR_ACCOUNT_CURRENCY"),
    INVALID_CARD_TYPE("INVALID_CARD_TYPE"),
    MAXIMUM_NUMBER_OF_CARDS_REACHED("MAXIMUM_NUMBER_OF_CARDS_REACHED"),
    INVALID_ISSUE_NUMBER("INVALID_ISSUE_NUMBER"),
    API_ERROR("API_ERROR");
    private final String value;

    AddPaymentCardErrorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddPaymentCardErrorEnum fromValue(String v) {
        for (AddPaymentCardErrorEnum c: AddPaymentCardErrorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
