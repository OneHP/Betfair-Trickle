
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewReferAndEarnErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ViewReferAndEarnErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="NO_RESULTS"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ViewReferAndEarnErrorEnum")
@XmlEnum
public enum ViewReferAndEarnErrorEnum {

    OK,
    NO_RESULTS,
    API_ERROR;

    public String value() {
        return name();
    }

    public static ViewReferAndEarnErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
