
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationErrorsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationErrorsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLICATE_USERNAME"/>
 *     &lt;enumeration value="FUNDS_TRANSFER_CANCEL"/>
 *     &lt;enumeration value="FUNDS_TRANSFER_CURRENCY_MISMATCH"/>
 *     &lt;enumeration value="INCOMPLETE_DETAILS"/>
 *     &lt;enumeration value="INSUFFICIENT_FUNDS"/>
 *     &lt;enumeration value="INVALID_ACCOUNT_TYPE"/>
 *     &lt;enumeration value="INVALID_ADDRESS_LINE1"/>
 *     &lt;enumeration value="INVALID_ADDRESS_LINE2"/>
 *     &lt;enumeration value="INVALID_ADDRESS_LINE3"/>
 *     &lt;enumeration value="INVALID_ANSWER1"/>
 *     &lt;enumeration value="INVALID_ANSWER2"/>
 *     &lt;enumeration value="INVALID_BROWSER"/>
 *     &lt;enumeration value="INVALID_CITY"/>
 *     &lt;enumeration value="INVALID_COUNTRY_OF_RESIDENCE"/>
 *     &lt;enumeration value="INVALID_COUNTY_STATE"/>
 *     &lt;enumeration value="INVALID_CURRENCY"/>
 *     &lt;enumeration value="INVALID_DEPOSIT_LIMIT"/>
 *     &lt;enumeration value="INVALID_DEPOSIT_LIMIT_FREQUENCY"/>
 *     &lt;enumeration value="INVALID_DETAILS"/>
 *     &lt;enumeration value="INVALID_DOB"/>
 *     &lt;enumeration value="INVALID_EMAIL"/>
 *     &lt;enumeration value="INVALID_FIRSTNAME"/>
 *     &lt;enumeration value="INVALID_GENDER"/>
 *     &lt;enumeration value="INVALID_HOME_PHONE"/>
 *     &lt;enumeration value="INVALID_IP_ADDRESS"/>
 *     &lt;enumeration value="INVALID_LANGUAGE"/>
 *     &lt;enumeration value="INVALID_LOCALE"/>
 *     &lt;enumeration value="INVALID_LOSS_LIMIT"/>
 *     &lt;enumeration value="INVALID_LOSS_LIMIT_FREQUENCY"/>
 *     &lt;enumeration value="INVALID_MASTER_ID"/>
 *     &lt;enumeration value="INVALID_MOBILE_PHONE"/>
 *     &lt;enumeration value="INVALID_PARTNERID"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="INVALID_POSTCODE"/>
 *     &lt;enumeration value="INVALID_PRIVICY_VERSION"/>
 *     &lt;enumeration value="INVALID_PRODUCT_ID"/>
 *     &lt;enumeration value="INVALID_REFERRER_CODE"/>
 *     &lt;enumeration value="INVALID_REGION"/>
 *     &lt;enumeration value="INVALID_SECURITY_QUESTION1"/>
 *     &lt;enumeration value="INVALID_SECURITY_QUESTION2"/>
 *     &lt;enumeration value="INVALID_SUBPARTNERID"/>
 *     &lt;enumeration value="INVALID_SUPERPARTNERID"/>
 *     &lt;enumeration value="INVALID_SURNAME"/>
 *     &lt;enumeration value="INVALID_TC_VERSION"/>
 *     &lt;enumeration value="INVALID_TIMEZONE"/>
 *     &lt;enumeration value="INVALID_TITLE"/>
 *     &lt;enumeration value="INVALID_USERNAME"/>
 *     &lt;enumeration value="INVALID_WORK_PHONE"/>
 *     &lt;enumeration value="RESERVED_PASSWORD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidationErrorsEnum")
@XmlEnum
public enum ValidationErrorsEnum {

    DUPLICATE_USERNAME("DUPLICATE_USERNAME"),
    FUNDS_TRANSFER_CANCEL("FUNDS_TRANSFER_CANCEL"),
    FUNDS_TRANSFER_CURRENCY_MISMATCH("FUNDS_TRANSFER_CURRENCY_MISMATCH"),
    INCOMPLETE_DETAILS("INCOMPLETE_DETAILS"),
    INSUFFICIENT_FUNDS("INSUFFICIENT_FUNDS"),
    INVALID_ACCOUNT_TYPE("INVALID_ACCOUNT_TYPE"),
    @XmlEnumValue("INVALID_ADDRESS_LINE1")
    INVALID_ADDRESS_LINE_1("INVALID_ADDRESS_LINE1"),
    @XmlEnumValue("INVALID_ADDRESS_LINE2")
    INVALID_ADDRESS_LINE_2("INVALID_ADDRESS_LINE2"),
    @XmlEnumValue("INVALID_ADDRESS_LINE3")
    INVALID_ADDRESS_LINE_3("INVALID_ADDRESS_LINE3"),
    @XmlEnumValue("INVALID_ANSWER1")
    INVALID_ANSWER_1("INVALID_ANSWER1"),
    @XmlEnumValue("INVALID_ANSWER2")
    INVALID_ANSWER_2("INVALID_ANSWER2"),
    INVALID_BROWSER("INVALID_BROWSER"),
    INVALID_CITY("INVALID_CITY"),
    INVALID_COUNTRY_OF_RESIDENCE("INVALID_COUNTRY_OF_RESIDENCE"),
    INVALID_COUNTY_STATE("INVALID_COUNTY_STATE"),
    INVALID_CURRENCY("INVALID_CURRENCY"),
    INVALID_DEPOSIT_LIMIT("INVALID_DEPOSIT_LIMIT"),
    INVALID_DEPOSIT_LIMIT_FREQUENCY("INVALID_DEPOSIT_LIMIT_FREQUENCY"),
    INVALID_DETAILS("INVALID_DETAILS"),
    INVALID_DOB("INVALID_DOB"),
    INVALID_EMAIL("INVALID_EMAIL"),
    INVALID_FIRSTNAME("INVALID_FIRSTNAME"),
    INVALID_GENDER("INVALID_GENDER"),
    INVALID_HOME_PHONE("INVALID_HOME_PHONE"),
    INVALID_IP_ADDRESS("INVALID_IP_ADDRESS"),
    INVALID_LANGUAGE("INVALID_LANGUAGE"),
    INVALID_LOCALE("INVALID_LOCALE"),
    INVALID_LOSS_LIMIT("INVALID_LOSS_LIMIT"),
    INVALID_LOSS_LIMIT_FREQUENCY("INVALID_LOSS_LIMIT_FREQUENCY"),
    INVALID_MASTER_ID("INVALID_MASTER_ID"),
    INVALID_MOBILE_PHONE("INVALID_MOBILE_PHONE"),
    INVALID_PARTNERID("INVALID_PARTNERID"),
    INVALID_PASSWORD("INVALID_PASSWORD"),
    INVALID_POSTCODE("INVALID_POSTCODE"),
    INVALID_PRIVICY_VERSION("INVALID_PRIVICY_VERSION"),
    INVALID_PRODUCT_ID("INVALID_PRODUCT_ID"),
    INVALID_REFERRER_CODE("INVALID_REFERRER_CODE"),
    INVALID_REGION("INVALID_REGION"),
    @XmlEnumValue("INVALID_SECURITY_QUESTION1")
    INVALID_SECURITY_QUESTION_1("INVALID_SECURITY_QUESTION1"),
    @XmlEnumValue("INVALID_SECURITY_QUESTION2")
    INVALID_SECURITY_QUESTION_2("INVALID_SECURITY_QUESTION2"),
    INVALID_SUBPARTNERID("INVALID_SUBPARTNERID"),
    INVALID_SUPERPARTNERID("INVALID_SUPERPARTNERID"),
    INVALID_SURNAME("INVALID_SURNAME"),
    INVALID_TC_VERSION("INVALID_TC_VERSION"),
    INVALID_TIMEZONE("INVALID_TIMEZONE"),
    INVALID_TITLE("INVALID_TITLE"),
    INVALID_USERNAME("INVALID_USERNAME"),
    INVALID_WORK_PHONE("INVALID_WORK_PHONE"),
    RESERVED_PASSWORD("RESERVED_PASSWORD");
    private final String value;

    ValidationErrorsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidationErrorsEnum fromValue(String v) {
        for (ValidationErrorsEnum c: ValidationErrorsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
