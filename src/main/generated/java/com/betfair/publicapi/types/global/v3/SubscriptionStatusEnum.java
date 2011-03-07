
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionStatusEnum")
@XmlEnum
public enum SubscriptionStatusEnum {

    ACTIVE,
    INACTIVE,
    SUSPENDED;

    public String value() {
        return name();
    }

    public static SubscriptionStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
