
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityQuestion2Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityQuestion2Enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SQ2A"/>
 *     &lt;enumeration value="SQ2B"/>
 *     &lt;enumeration value="SQ2C"/>
 *     &lt;enumeration value="SQ2D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityQuestion2Enum")
@XmlEnum
public enum SecurityQuestion2Enum {

    @XmlEnumValue("SQ2A")
    SQ_2_A("SQ2A"),
    @XmlEnumValue("SQ2B")
    SQ_2_B("SQ2B"),
    @XmlEnumValue("SQ2C")
    SQ_2_C("SQ2C"),
    @XmlEnumValue("SQ2D")
    SQ_2_D("SQ2D");
    private final String value;

    SecurityQuestion2Enum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityQuestion2Enum fromValue(String v) {
        for (SecurityQuestion2Enum c: SecurityQuestion2Enum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
