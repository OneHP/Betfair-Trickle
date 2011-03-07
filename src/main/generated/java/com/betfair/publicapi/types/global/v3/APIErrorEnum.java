
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="APIErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="EXCEEDED_THROTTLE"/>
 *     &lt;enumeration value="USER_NOT_SUBSCRIBED_TO_PRODUCT"/>
 *     &lt;enumeration value="SUBSCRIPTION_INACTIVE_OR_SUSPENDED"/>
 *     &lt;enumeration value="VENDOR_SOFTWARE_INACTIVE"/>
 *     &lt;enumeration value="VENDOR_SOFTWARE_INVALID"/>
 *     &lt;enumeration value="SERVICE_NOT_AVAILABLE_IN_PRODUCT"/>
 *     &lt;enumeration value="NO_SESSION"/>
 *     &lt;enumeration value="TOO_MANY_REQUESTS"/>
 *     &lt;enumeration value="PRODUCT_REQUIRES_FUNDED_ACCOUNT"/>
 *     &lt;enumeration value="SERVICE_NOT_AVAILABLE_FOR_LOGIN_STATUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APIErrorEnum")
@XmlEnum
public enum APIErrorEnum {

    OK,
    INTERNAL_ERROR,
    EXCEEDED_THROTTLE,
    USER_NOT_SUBSCRIBED_TO_PRODUCT,
    SUBSCRIPTION_INACTIVE_OR_SUSPENDED,
    VENDOR_SOFTWARE_INACTIVE,
    VENDOR_SOFTWARE_INVALID,
    SERVICE_NOT_AVAILABLE_IN_PRODUCT,
    NO_SESSION,
    TOO_MANY_REQUESTS,
    PRODUCT_REQUIRES_FUNDED_ACCOUNT,
    SERVICE_NOT_AVAILABLE_FOR_LOGIN_STATUS;

    public String value() {
        return name();
    }

    public static APIErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
