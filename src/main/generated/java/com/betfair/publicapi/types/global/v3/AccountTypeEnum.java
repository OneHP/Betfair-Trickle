
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="MARGIN"/>
 *     &lt;enumeration value="TRADING"/>
 *     &lt;enumeration value="AGENT_CLIENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountTypeEnum")
@XmlEnum
public enum AccountTypeEnum {

    STANDARD,
    MARGIN,
    TRADING,
    AGENT_CLIENT;

    public String value() {
        return name();
    }

    public static AccountTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
