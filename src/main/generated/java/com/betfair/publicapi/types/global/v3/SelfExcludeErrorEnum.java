
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelfExcludeErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SelfExcludeErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="ACCOUNT_CLOSED"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="INVALID_SELF_EXCLUDE_VALUE"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SelfExcludeErrorEnum")
@XmlEnum
public enum SelfExcludeErrorEnum {

    OK,
    ACCOUNT_CLOSED,
    INVALID_PASSWORD,
    INVALID_SELF_EXCLUDE_VALUE,
    API_ERROR;

    public String value() {
        return name();
    }

    public static SelfExcludeErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
