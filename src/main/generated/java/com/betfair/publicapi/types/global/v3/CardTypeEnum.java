
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MASTERCARD"/>
 *     &lt;enumeration value="VISADELTA"/>
 *     &lt;enumeration value="SWITCH"/>
 *     &lt;enumeration value="SOLO"/>
 *     &lt;enumeration value="ELECTRON"/>
 *     &lt;enumeration value="LASER"/>
 *     &lt;enumeration value="MAESTRO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardTypeEnum")
@XmlEnum
public enum CardTypeEnum {

    VISA,
    MASTERCARD,
    VISADELTA,
    SWITCH,
    SOLO,
    ELECTRON,
    LASER,
    MAESTRO;

    public String value() {
        return name();
    }

    public static CardTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
