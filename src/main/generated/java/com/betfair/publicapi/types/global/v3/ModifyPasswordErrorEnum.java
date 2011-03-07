
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyPasswordErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModifyPasswordErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="INVALID_NEW_PASSWORD"/>
 *     &lt;enumeration value="PASSWORDS_DONT_MATCH"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModifyPasswordErrorEnum")
@XmlEnum
public enum ModifyPasswordErrorEnum {

    OK,
    INVALID_PASSWORD,
    INVALID_NEW_PASSWORD,
    PASSWORDS_DONT_MATCH,
    API_ERROR;

    public String value() {
        return name();
    }

    public static ModifyPasswordErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
