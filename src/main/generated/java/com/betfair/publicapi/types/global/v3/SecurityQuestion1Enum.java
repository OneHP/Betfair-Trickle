
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityQuestion1Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityQuestion1Enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SQ1A"/>
 *     &lt;enumeration value="SQ1B"/>
 *     &lt;enumeration value="SQ1C"/>
 *     &lt;enumeration value="SQ1D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityQuestion1Enum")
@XmlEnum
public enum SecurityQuestion1Enum {

    @XmlEnumValue("SQ1A")
    SQ_1_A("SQ1A"),
    @XmlEnumValue("SQ1B")
    SQ_1_B("SQ1B"),
    @XmlEnumValue("SQ1C")
    SQ_1_C("SQ1C"),
    @XmlEnumValue("SQ1D")
    SQ_1_D("SQ1D");
    private final String value;

    SecurityQuestion1Enum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityQuestion1Enum fromValue(String v) {
        for (SecurityQuestion1Enum c: SecurityQuestion1Enum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
