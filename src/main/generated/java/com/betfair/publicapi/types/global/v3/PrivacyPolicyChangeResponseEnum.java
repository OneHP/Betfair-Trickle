
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivacyPolicyChangeResponseEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrivacyPolicyChangeResponseEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_REPLY"/>
 *     &lt;enumeration value="ACCEPT"/>
 *     &lt;enumeration value="REJECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrivacyPolicyChangeResponseEnum")
@XmlEnum
public enum PrivacyPolicyChangeResponseEnum {

    NO_REPLY,
    ACCEPT,
    REJECT;

    public String value() {
        return name();
    }

    public static PrivacyPolicyChangeResponseEnum fromValue(String v) {
        return valueOf(v);
    }

}
