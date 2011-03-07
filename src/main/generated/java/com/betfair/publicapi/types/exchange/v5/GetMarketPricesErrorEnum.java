
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketPricesErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetMarketPricesErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_CURRENCY"/>
 *     &lt;enumeration value="INVALID_MARKET"/>
 *     &lt;enumeration value="MARKET_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetMarketPricesErrorEnum")
@XmlEnum
public enum GetMarketPricesErrorEnum {

    OK,
    INVALID_CURRENCY,
    INVALID_MARKET,
    MARKET_TYPE_NOT_SUPPORTED,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetMarketPricesErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
