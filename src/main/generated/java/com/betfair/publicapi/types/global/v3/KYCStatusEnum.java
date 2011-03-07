
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KYCStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KYCStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="AGE_VERIFIED"/>
 *     &lt;enumeration value="KYC"/>
 *     &lt;enumeration value="KYC_NON_AUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KYCStatusEnum")
@XmlEnum
public enum KYCStatusEnum {

    DEFAULT,
    AGE_VERIFIED,
    KYC,
    KYC_NON_AUS;

    public String value() {
        return name();
    }

    public static KYCStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
