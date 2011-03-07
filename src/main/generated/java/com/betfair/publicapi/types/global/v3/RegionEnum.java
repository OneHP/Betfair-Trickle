
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZAF"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NORD"/>
 *     &lt;enumeration value="GBR"/>
 *     &lt;enumeration value="IRL"/>
 *     &lt;enumeration value="AUS_NZL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegionEnum")
@XmlEnum
public enum RegionEnum {

    ZAF,
    NA,
    NORD,
    GBR,
    IRL,
    AUS_NZL;

    public String value() {
        return name();
    }

    public static RegionEnum fromValue(String v) {
        return valueOf(v);
    }

}
