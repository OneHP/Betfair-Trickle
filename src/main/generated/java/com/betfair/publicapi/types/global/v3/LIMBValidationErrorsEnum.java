
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIMBValidationErrorsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LIMBValidationErrorsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_DOB"/>
 *     &lt;enumeration value="INVALID_ADDRESS_LINE1"/>
 *     &lt;enumeration value="INVALID_ADDRESS_LINE2"/>
 *     &lt;enumeration value="INVALID_ADDRESS_LINE3"/>
 *     &lt;enumeration value="INVALID_CITY"/>
 *     &lt;enumeration value="INVALID_COUNTY_STATE"/>
 *     &lt;enumeration value="INVALID_COUNTRY_OF_RESIDENCE"/>
 *     &lt;enumeration value="INVALID_POSTCODE"/>
 *     &lt;enumeration value="INVALID_HOME_PHONE"/>
 *     &lt;enumeration value="INVALID_WORK_PHONE"/>
 *     &lt;enumeration value="INVALID_MOBILE_PHONE"/>
 *     &lt;enumeration value="INVALID_EMAIL"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="RESERVED_PASSWORD"/>
 *     &lt;enumeration value="INVALID_NEW_PASSWORD"/>
 *     &lt;enumeration value="INVALID_TC_VERSION"/>
 *     &lt;enumeration value="INVALID_PRIVICY_VERSION"/>
 *     &lt;enumeration value="INVALID_CHATNAME"/>
 *     &lt;enumeration value="CHATNAME_ALREADY_TAKEN"/>
 *     &lt;enumeration value="INVALID_CARD_BILLING_ADDRESS_LINE_1"/>
 *     &lt;enumeration value="INVALID_CARD_BILLING_ADDRESS_LINE_2"/>
 *     &lt;enumeration value="INVALID_CARD_BILLING_ADDRESS_LINE_3"/>
 *     &lt;enumeration value="INVALID_CARD_BILLING_CITY"/>
 *     &lt;enumeration value="INVALID_CARD_BILLING_COUNTY_STATE"/>
 *     &lt;enumeration value="INVALID_CARD_BILLING_ZIP_CODE"/>
 *     &lt;enumeration value="INVALID_CARD_BILLING_COUNTRY_OF_RESIDENCE"/>
 *     &lt;enumeration value="NO_SUCH_PERSONAL_MESSAGE"/>
 *     &lt;enumeration value="NO_SUCH_TC_PRIVACY_POLICY_MESSAGE"/>
 *     &lt;enumeration value="NO_SUCH_PASSWORD_CHANGE_MESSAGE"/>
 *     &lt;enumeration value="NO_SUCH_BIRTH_DATE_CHECK_MESSAGE"/>
 *     &lt;enumeration value="NO_SUCH_ADDRESS_CHECK_MESSAGE"/>
 *     &lt;enumeration value="NO_SUCH_CONTACT_DETAILS_CHECK_MESSAGE"/>
 *     &lt;enumeration value="NO_SUCH_CHATNAME_CHENGE_MESSAGE"/>
 *     &lt;enumeration value="NO_SUCH_CARD_BILLING_ADDRESS_CHECK_MESSAGE"/>
 *     &lt;enumeration value="INVALID_PERSONAL_MESSAGE_ACKNOWLEDGMENT"/>
 *     &lt;enumeration value="INVALID_TC_PRIVACY_POLICY_MESSAGE_ACKNOWLEDGMENT"/>
 *     &lt;enumeration value="INVALID_BIRTH_DATE_CHECK_MESSAGE"/>
 *     &lt;enumeration value="INVALID_ADDRESS_CHECK_MESSAGE"/>
 *     &lt;enumeration value="INVALID_CONTACT_DETAILS_CHECK_MESSAGE"/>
 *     &lt;enumeration value="INVALID_CARD_BILLING_ADDRESS_CHECK_MESSAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LIMBValidationErrorsEnum")
@XmlEnum
public enum LIMBValidationErrorsEnum {

    INVALID_DOB("INVALID_DOB"),
    @XmlEnumValue("INVALID_ADDRESS_LINE1")
    INVALID_ADDRESS_LINE_1("INVALID_ADDRESS_LINE1"),
    @XmlEnumValue("INVALID_ADDRESS_LINE2")
    INVALID_ADDRESS_LINE_2("INVALID_ADDRESS_LINE2"),
    @XmlEnumValue("INVALID_ADDRESS_LINE3")
    INVALID_ADDRESS_LINE_3("INVALID_ADDRESS_LINE3"),
    INVALID_CITY("INVALID_CITY"),
    INVALID_COUNTY_STATE("INVALID_COUNTY_STATE"),
    INVALID_COUNTRY_OF_RESIDENCE("INVALID_COUNTRY_OF_RESIDENCE"),
    INVALID_POSTCODE("INVALID_POSTCODE"),
    INVALID_HOME_PHONE("INVALID_HOME_PHONE"),
    INVALID_WORK_PHONE("INVALID_WORK_PHONE"),
    INVALID_MOBILE_PHONE("INVALID_MOBILE_PHONE"),
    INVALID_EMAIL("INVALID_EMAIL"),
    INVALID_PASSWORD("INVALID_PASSWORD"),
    RESERVED_PASSWORD("RESERVED_PASSWORD"),
    INVALID_NEW_PASSWORD("INVALID_NEW_PASSWORD"),
    INVALID_TC_VERSION("INVALID_TC_VERSION"),
    INVALID_PRIVICY_VERSION("INVALID_PRIVICY_VERSION"),
    INVALID_CHATNAME("INVALID_CHATNAME"),
    CHATNAME_ALREADY_TAKEN("CHATNAME_ALREADY_TAKEN"),
    INVALID_CARD_BILLING_ADDRESS_LINE_1("INVALID_CARD_BILLING_ADDRESS_LINE_1"),
    INVALID_CARD_BILLING_ADDRESS_LINE_2("INVALID_CARD_BILLING_ADDRESS_LINE_2"),
    INVALID_CARD_BILLING_ADDRESS_LINE_3("INVALID_CARD_BILLING_ADDRESS_LINE_3"),
    INVALID_CARD_BILLING_CITY("INVALID_CARD_BILLING_CITY"),
    INVALID_CARD_BILLING_COUNTY_STATE("INVALID_CARD_BILLING_COUNTY_STATE"),
    INVALID_CARD_BILLING_ZIP_CODE("INVALID_CARD_BILLING_ZIP_CODE"),
    INVALID_CARD_BILLING_COUNTRY_OF_RESIDENCE("INVALID_CARD_BILLING_COUNTRY_OF_RESIDENCE"),
    NO_SUCH_PERSONAL_MESSAGE("NO_SUCH_PERSONAL_MESSAGE"),
    NO_SUCH_TC_PRIVACY_POLICY_MESSAGE("NO_SUCH_TC_PRIVACY_POLICY_MESSAGE"),
    NO_SUCH_PASSWORD_CHANGE_MESSAGE("NO_SUCH_PASSWORD_CHANGE_MESSAGE"),
    NO_SUCH_BIRTH_DATE_CHECK_MESSAGE("NO_SUCH_BIRTH_DATE_CHECK_MESSAGE"),
    NO_SUCH_ADDRESS_CHECK_MESSAGE("NO_SUCH_ADDRESS_CHECK_MESSAGE"),
    NO_SUCH_CONTACT_DETAILS_CHECK_MESSAGE("NO_SUCH_CONTACT_DETAILS_CHECK_MESSAGE"),
    NO_SUCH_CHATNAME_CHENGE_MESSAGE("NO_SUCH_CHATNAME_CHENGE_MESSAGE"),
    NO_SUCH_CARD_BILLING_ADDRESS_CHECK_MESSAGE("NO_SUCH_CARD_BILLING_ADDRESS_CHECK_MESSAGE"),
    INVALID_PERSONAL_MESSAGE_ACKNOWLEDGMENT("INVALID_PERSONAL_MESSAGE_ACKNOWLEDGMENT"),
    INVALID_TC_PRIVACY_POLICY_MESSAGE_ACKNOWLEDGMENT("INVALID_TC_PRIVACY_POLICY_MESSAGE_ACKNOWLEDGMENT"),
    INVALID_BIRTH_DATE_CHECK_MESSAGE("INVALID_BIRTH_DATE_CHECK_MESSAGE"),
    INVALID_ADDRESS_CHECK_MESSAGE("INVALID_ADDRESS_CHECK_MESSAGE"),
    INVALID_CONTACT_DETAILS_CHECK_MESSAGE("INVALID_CONTACT_DETAILS_CHECK_MESSAGE"),
    INVALID_CARD_BILLING_ADDRESS_CHECK_MESSAGE("INVALID_CARD_BILLING_ADDRESS_CHECK_MESSAGE");
    private final String value;

    LIMBValidationErrorsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LIMBValidationErrorsEnum fromValue(String v) {
        for (LIMBValidationErrorsEnum c: LIMBValidationErrorsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
