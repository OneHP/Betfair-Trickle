
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveLIMBMessageErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetrieveLIMBMessageErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetrieveLIMBMessageErrorEnum")
@XmlEnum
public enum RetrieveLIMBMessageErrorEnum {

    OK,
    API_ERROR;

    public String value() {
        return name();
    }

    public static RetrieveLIMBMessageErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
