
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingPeriodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingPeriodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="QUARTERLY"/>
 *     &lt;enumeration value="ANNUALLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingPeriodEnum")
@XmlEnum
public enum BillingPeriodEnum {

    WEEKLY,
    MONTHLY,
    QUARTERLY,
    ANNUALLY;

    public String value() {
        return name();
    }

    public static BillingPeriodEnum fromValue(String v) {
        return valueOf(v);
    }

}
