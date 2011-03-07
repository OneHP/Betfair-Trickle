
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GamcareLimitFreqEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GamcareLimitFreqEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAILY"/>
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="YEARLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GamcareLimitFreqEnum")
@XmlEnum
public enum GamcareLimitFreqEnum {

    DAILY,
    WEEKLY,
    MONTHLY,
    YEARLY;

    public String value() {
        return name();
    }

    public static GamcareLimitFreqEnum fromValue(String v) {
        return valueOf(v);
    }

}
