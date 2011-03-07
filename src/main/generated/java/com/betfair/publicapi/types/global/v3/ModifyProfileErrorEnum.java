
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyProfileErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModifyProfileErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="VALIDATION_ERRORS"/>
 *     &lt;enumeration value="PROFILE_MODIFICATION_ERROR"/>
 *     &lt;enumeration value="UNAUTHORIZED"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="ACCOUNT_INACTIVE"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModifyProfileErrorEnum")
@XmlEnum
public enum ModifyProfileErrorEnum {

    OK,
    VALIDATION_ERRORS,
    PROFILE_MODIFICATION_ERROR,
    UNAUTHORIZED,
    INVALID_PASSWORD,
    ACCOUNT_INACTIVE,
    API_ERROR;

    public String value() {
        return name();
    }

    public static ModifyProfileErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
