
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEventsErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetEventsErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_EVENT_ID"/>
 *     &lt;enumeration value="NO_RESULTS"/>
 *     &lt;enumeration value="INVALID_LOCALE_DEFAULTING_TO_ENGLISH"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetEventsErrorEnum")
@XmlEnum
public enum GetEventsErrorEnum {

    OK,
    INVALID_EVENT_ID,
    NO_RESULTS,
    INVALID_LOCALE_DEFAULTING_TO_ENGLISH,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetEventsErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
