
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatementEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatementEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="RESULT_WON"/>
 *     &lt;enumeration value="RESULT_LOST"/>
 *     &lt;enumeration value="RESULT_ERR"/>
 *     &lt;enumeration value="RESULT_FIX"/>
 *     &lt;enumeration value="RESULT_NOT_APPLICABLE"/>
 *     &lt;enumeration value="ACCOUNT_CREDIT"/>
 *     &lt;enumeration value="ACCOUNT_DEBIT"/>
 *     &lt;enumeration value="COMMISSION_REVERSAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountStatementEnum")
@XmlEnum
public enum AccountStatementEnum {

    OK,
    RESULT_WON,
    RESULT_LOST,
    RESULT_ERR,
    RESULT_FIX,
    RESULT_NOT_APPLICABLE,
    ACCOUNT_CREDIT,
    ACCOUNT_DEBIT,
    COMMISSION_REVERSAL;

    public String value() {
        return name();
    }

    public static AccountStatementEnum fromValue(String v) {
        return valueOf(v);
    }

}
