
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetPersistenceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BetPersistenceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="IP"/>
 *     &lt;enumeration value="SP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BetPersistenceTypeEnum")
@XmlEnum
public enum BetPersistenceTypeEnum {

    NONE,
    IP,
    SP;

    public String value() {
        return name();
    }

    public static BetPersistenceTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
