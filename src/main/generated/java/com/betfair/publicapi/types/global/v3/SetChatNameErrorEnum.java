
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetChatNameErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetChatNameErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="ACCOUNT_SUSPENDED"/>
 *     &lt;enumeration value="ACCOUNT_NOT_FUNDED"/>
 *     &lt;enumeration value="CHAT_NAME_UNAVAILABLE"/>
 *     &lt;enumeration value="CANNOT_CHANGE_CHAT_NAME"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetChatNameErrorEnum")
@XmlEnum
public enum SetChatNameErrorEnum {

    OK,
    INVALID_PASSWORD,
    ACCOUNT_SUSPENDED,
    ACCOUNT_NOT_FUNDED,
    CHAT_NAME_UNAVAILABLE,
    CANNOT_CHANGE_CHAT_NAME,
    API_ERROR;

    public String value() {
        return name();
    }

    public static SetChatNameErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
