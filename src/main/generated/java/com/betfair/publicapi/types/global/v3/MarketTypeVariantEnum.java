
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketTypeVariantEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketTypeVariantEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="ASL"/>
 *     &lt;enumeration value="ADL"/>
 *     &lt;enumeration value="COUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarketTypeVariantEnum")
@XmlEnum
public enum MarketTypeVariantEnum {

    D,
    ASL,
    ADL,
    COUP;

    public String value() {
        return name();
    }

    public static MarketTypeVariantEnum fromValue(String v) {
        return valueOf(v);
    }

}
