
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountStatementErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetAccountStatementErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_START_RECORD"/>
 *     &lt;enumeration value="INVALID_RECORD_COUNT"/>
 *     &lt;enumeration value="INVALID_END_DATE"/>
 *     &lt;enumeration value="INVALID_START_DATE"/>
 *     &lt;enumeration value="NO_RESULTS"/>
 *     &lt;enumeration value="API_ERROR"/>
 *     &lt;enumeration value="INVALID_LOCALE_DEFAULTING_TO_ENGLISH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetAccountStatementErrorEnum")
@XmlEnum
public enum GetAccountStatementErrorEnum {

    OK,
    INVALID_START_RECORD,
    INVALID_RECORD_COUNT,
    INVALID_END_DATE,
    INVALID_START_DATE,
    NO_RESULTS,
    API_ERROR,
    INVALID_LOCALE_DEFAULTING_TO_ENGLISH;

    public String value() {
        return name();
    }

    public static GetAccountStatementErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
