
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCouponErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetCouponErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_COUPON_ID"/>
 *     &lt;enumeration value="INVALID_LOCALE_DEFAULTING_TO_ENGLISH"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetCouponErrorEnum")
@XmlEnum
public enum GetCouponErrorEnum {

    OK,
    INVALID_COUPON_ID,
    INVALID_LOCALE_DEFAULTING_TO_ENGLISH,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetCouponErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
