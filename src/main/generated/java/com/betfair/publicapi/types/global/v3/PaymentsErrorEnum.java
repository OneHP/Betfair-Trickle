
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentsErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentsErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="ACCOUNT_SUSPENDED"/>
 *     &lt;enumeration value="API_ERROR"/>
 *     &lt;enumeration value="CARD_AMOUNT_OUTSIDE_LIMIT"/>
 *     &lt;enumeration value="CARD_EXPIRED"/>
 *     &lt;enumeration value="CARD_LOCKED"/>
 *     &lt;enumeration value="CARD_NOT_FOUND"/>
 *     &lt;enumeration value="DEPOSIT_DECLINED"/>
 *     &lt;enumeration value="DEPOSIT_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="EXCEEDS_BALANCE"/>
 *     &lt;enumeration value="CARD_NOT_VALIDATED"/>
 *     &lt;enumeration value="INVALID_AMOUNT"/>
 *     &lt;enumeration value="INVALID_CARD_CV2"/>
 *     &lt;enumeration value="INVALID_CARD_DETAILS"/>
 *     &lt;enumeration value="INVALID_EXPIRY_DATE"/>
 *     &lt;enumeration value="INVALID_MASTERCARD"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="CFT_MAX_WITHDRAWAL_LIMIT"/>
 *     &lt;enumeration value="NEGATIVE_NET_DEPOSITS"/>
 *     &lt;enumeration value="NON_STERLING_TO_UK_MASTERCARD"/>
 *     &lt;enumeration value="NON_ZERO_NON_NEG_NET_DEPOSITS"/>
 *     &lt;enumeration value="UNAUTHORIZED"/>
 *     &lt;enumeration value="VISA_WITHDRAWAL_NOT_POSSIBLE"/>
 *     &lt;enumeration value="DUPLICATE_WITHDRAWAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentsErrorEnum")
@XmlEnum
public enum PaymentsErrorEnum {

    OK("OK"),
    ACCOUNT_SUSPENDED("ACCOUNT_SUSPENDED"),
    API_ERROR("API_ERROR"),
    CARD_AMOUNT_OUTSIDE_LIMIT("CARD_AMOUNT_OUTSIDE_LIMIT"),
    CARD_EXPIRED("CARD_EXPIRED"),
    CARD_LOCKED("CARD_LOCKED"),
    CARD_NOT_FOUND("CARD_NOT_FOUND"),
    DEPOSIT_DECLINED("DEPOSIT_DECLINED"),
    DEPOSIT_LIMIT_EXCEEDED("DEPOSIT_LIMIT_EXCEEDED"),
    EXCEEDS_BALANCE("EXCEEDS_BALANCE"),
    CARD_NOT_VALIDATED("CARD_NOT_VALIDATED"),
    INVALID_AMOUNT("INVALID_AMOUNT"),
    @XmlEnumValue("INVALID_CARD_CV2")
    INVALID_CARD_CV_2("INVALID_CARD_CV2"),
    INVALID_CARD_DETAILS("INVALID_CARD_DETAILS"),
    INVALID_EXPIRY_DATE("INVALID_EXPIRY_DATE"),
    INVALID_MASTERCARD("INVALID_MASTERCARD"),
    INVALID_PASSWORD("INVALID_PASSWORD"),
    CFT_MAX_WITHDRAWAL_LIMIT("CFT_MAX_WITHDRAWAL_LIMIT"),
    NEGATIVE_NET_DEPOSITS("NEGATIVE_NET_DEPOSITS"),
    NON_STERLING_TO_UK_MASTERCARD("NON_STERLING_TO_UK_MASTERCARD"),
    NON_ZERO_NON_NEG_NET_DEPOSITS("NON_ZERO_NON_NEG_NET_DEPOSITS"),
    UNAUTHORIZED("UNAUTHORIZED"),
    VISA_WITHDRAWAL_NOT_POSSIBLE("VISA_WITHDRAWAL_NOT_POSSIBLE"),
    DUPLICATE_WITHDRAWAL("DUPLICATE_WITHDRAWAL");
    private final String value;

    PaymentsErrorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentsErrorEnum fromValue(String v) {
        for (PaymentsErrorEnum c: PaymentsErrorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
