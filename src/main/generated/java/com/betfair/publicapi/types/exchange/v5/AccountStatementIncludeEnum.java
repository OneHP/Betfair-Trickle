
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatementIncludeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatementIncludeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="EXCHANGE"/>
 *     &lt;enumeration value="POKER_ROOM"/>
 *     &lt;enumeration value="DEPOSITS_WITHDRAWALS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountStatementIncludeEnum")
@XmlEnum
public enum AccountStatementIncludeEnum {

    ALL,
    EXCHANGE,
    POKER_ROOM,
    DEPOSITS_WITHDRAWALS;

    public String value() {
        return name();
    }

    public static AccountStatementIncludeEnum fromValue(String v) {
        return valueOf(v);
    }

}
