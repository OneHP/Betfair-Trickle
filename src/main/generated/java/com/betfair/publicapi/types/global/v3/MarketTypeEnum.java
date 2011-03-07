
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarketTypeEnum")
@XmlEnum
public enum MarketTypeEnum {

    O,
    L,
    R,
    A,
    NOT_APPLICABLE;

    public String value() {
        return name();
    }

    public static MarketTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
