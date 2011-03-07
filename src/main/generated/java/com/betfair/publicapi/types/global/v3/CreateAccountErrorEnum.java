
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateAccountErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreateAccountErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="VALIDATION_ERRORS"/>
 *     &lt;enumeration value="ACCOUNT_CREATION_ERROR"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreateAccountErrorEnum")
@XmlEnum
public enum CreateAccountErrorEnum {

    OK,
    VALIDATION_ERRORS,
    ACCOUNT_CREATION_ERROR,
    API_ERROR;

    public String value() {
        return name();
    }

    public static CreateAccountErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
