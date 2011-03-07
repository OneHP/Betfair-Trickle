
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TitleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dr"/>
 *     &lt;enumeration value="Mr"/>
 *     &lt;enumeration value="Miss"/>
 *     &lt;enumeration value="Mrs"/>
 *     &lt;enumeration value="Ms"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TitleEnum")
@XmlEnum
public enum TitleEnum {

    @XmlEnumValue("Dr")
    DR("Dr"),
    @XmlEnumValue("Mr")
    MR("Mr"),
    @XmlEnumValue("Miss")
    MISS("Miss"),
    @XmlEnumValue("Mrs")
    MRS("Mrs"),
    @XmlEnumValue("Ms")
    MS("Ms");
    private final String value;

    TitleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TitleEnum fromValue(String v) {
        for (TitleEnum c: TitleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
