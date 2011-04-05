
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BetStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="MU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BetStatusEnum")
@XmlEnum
public enum BetStatusEnum {

    U,
    M,
    S,
    C,
    V,
    L,
    MU;

    public String value() {
        return name();
    }

    public static BetStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
