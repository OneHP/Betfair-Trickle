
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDetailedAvailMktDepthErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetDetailedAvailMktDepthErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="NO_RESULTS"/>
 *     &lt;enumeration value="SUSPENDED_MARKET"/>
 *     &lt;enumeration value="INVALID_MARKET"/>
 *     &lt;enumeration value="INVALID_RUNNER"/>
 *     &lt;enumeration value="INVALID_ASIAN_LINE"/>
 *     &lt;enumeration value="INVALID_CURRENCY"/>
 *     &lt;enumeration value="MARKET_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetDetailedAvailMktDepthErrorEnum")
@XmlEnum
public enum GetDetailedAvailMktDepthErrorEnum {

    OK,
    NO_RESULTS,
    SUSPENDED_MARKET,
    INVALID_MARKET,
    INVALID_RUNNER,
    INVALID_ASIAN_LINE,
    INVALID_CURRENCY,
    MARKET_TYPE_NOT_SUPPORTED,
    API_ERROR;

    public String value() {
        return name();
    }

    public static GetDetailedAvailMktDepthErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
