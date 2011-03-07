
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADD_PAYMENT_CARD"/>
 *     &lt;enumeration value="DELETE_PAYMENT_CARD"/>
 *     &lt;enumeration value="GET_PAYMENT_CARD"/>
 *     &lt;enumeration value="UPDATE_PAYMENT_CARD"/>
 *     &lt;enumeration value="LOGIN"/>
 *     &lt;enumeration value="GET_BET"/>
 *     &lt;enumeration value="PLACE_BETS"/>
 *     &lt;enumeration value="WITHDRAW_TO_PAYMENT_CARD"/>
 *     &lt;enumeration value="EDIT_BETS"/>
 *     &lt;enumeration value="DEPOSIT_FROM_PAYMENT_CARD"/>
 *     &lt;enumeration value="CANCEL_BETS"/>
 *     &lt;enumeration value="DO_KEEP_ALIVE"/>
 *     &lt;enumeration value="GET_ACCOUNT_STATEMENT"/>
 *     &lt;enumeration value="LOAD_MARKET_PROFIT_LOSS"/>
 *     &lt;enumeration value="GET_CURRENT_BETS"/>
 *     &lt;enumeration value="LOAD_ACCOUNT_FUNDS"/>
 *     &lt;enumeration value="LOAD_BET_HISTORY"/>
 *     &lt;enumeration value="LOAD_DETAILED_AVAIL_MKT_DEPTH"/>
 *     &lt;enumeration value="GET_MARKET_TRADED_VOLUME"/>
 *     &lt;enumeration value="LOAD_EVENTS"/>
 *     &lt;enumeration value="LOAD_EVENT_TYPES"/>
 *     &lt;enumeration value="LOAD_MARKET"/>
 *     &lt;enumeration value="LOAD_MARKET_PRICES"/>
 *     &lt;enumeration value="LOAD_MARKET_PRICES_COMPRESSED"/>
 *     &lt;enumeration value="LOAD_SERVICE_ANNOUNCEMENTS"/>
 *     &lt;enumeration value="LOAD_SUBSCRIPTION_INFO"/>
 *     &lt;enumeration value="CREATE_ACCOUNT"/>
 *     &lt;enumeration value="CONVERT_CURRENCY"/>
 *     &lt;enumeration value="GET_CURRENCIES"/>
 *     &lt;enumeration value="FORGOT_PASSWORD"/>
 *     &lt;enumeration value="MODIFY_PASSWORD"/>
 *     &lt;enumeration value="VIEW_PROFILE"/>
 *     &lt;enumeration value="MODIFY_PROFILE"/>
 *     &lt;enumeration value="LOGOUT"/>
 *     &lt;enumeration value="RETRIEVE_LIMB_MESSAGE"/>
 *     &lt;enumeration value="SUBMIT_LIMB_MESSAGE"/>
 *     &lt;enumeration value="GET_MARGIN_MARKET_PRICES"/>
 *     &lt;enumeration value="GET_MARGIN_MARKET_PRICES_COMPRESSED"/>
 *     &lt;enumeration value="GENERATE_REGISTERED_MARGIN_PRICES"/>
 *     &lt;enumeration value="MARGINLOGIN"/>
 *     &lt;enumeration value="TRANSFER_FUNDS"/>
 *     &lt;enumeration value="ADD_VENDORSUBSCRIPTION"/>
 *     &lt;enumeration value="UPDATE_VENDORSUBSCRIPTION"/>
 *     &lt;enumeration value="CANCEL_VENDORSUBSCRIPTION"/>
 *     &lt;enumeration value="GET_VENDOR_USERS"/>
 *     &lt;enumeration value="GET_VENDORSUBSCRIPTION_INFO"/>
 *     &lt;enumeration value="GET_VENDOR_INFO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceEnum")
@XmlEnum
public enum ServiceEnum {

    ADD_PAYMENT_CARD,
    DELETE_PAYMENT_CARD,
    GET_PAYMENT_CARD,
    UPDATE_PAYMENT_CARD,
    LOGIN,
    GET_BET,
    PLACE_BETS,
    WITHDRAW_TO_PAYMENT_CARD,
    EDIT_BETS,
    DEPOSIT_FROM_PAYMENT_CARD,
    CANCEL_BETS,
    DO_KEEP_ALIVE,
    GET_ACCOUNT_STATEMENT,
    LOAD_MARKET_PROFIT_LOSS,
    GET_CURRENT_BETS,
    LOAD_ACCOUNT_FUNDS,
    LOAD_BET_HISTORY,
    LOAD_DETAILED_AVAIL_MKT_DEPTH,
    GET_MARKET_TRADED_VOLUME,
    LOAD_EVENTS,
    LOAD_EVENT_TYPES,
    LOAD_MARKET,
    LOAD_MARKET_PRICES,
    LOAD_MARKET_PRICES_COMPRESSED,
    LOAD_SERVICE_ANNOUNCEMENTS,
    LOAD_SUBSCRIPTION_INFO,
    CREATE_ACCOUNT,
    CONVERT_CURRENCY,
    GET_CURRENCIES,
    FORGOT_PASSWORD,
    MODIFY_PASSWORD,
    VIEW_PROFILE,
    MODIFY_PROFILE,
    LOGOUT,
    RETRIEVE_LIMB_MESSAGE,
    SUBMIT_LIMB_MESSAGE,
    GET_MARGIN_MARKET_PRICES,
    GET_MARGIN_MARKET_PRICES_COMPRESSED,
    GENERATE_REGISTERED_MARGIN_PRICES,
    MARGINLOGIN,
    TRANSFER_FUNDS,
    ADD_VENDORSUBSCRIPTION,
    UPDATE_VENDORSUBSCRIPTION,
    CANCEL_VENDORSUBSCRIPTION,
    GET_VENDOR_USERS,
    GET_VENDORSUBSCRIPTION_INFO,
    GET_VENDOR_INFO;

    public String value() {
        return name();
    }

    public static ServiceEnum fromValue(String v) {
        return valueOf(v);
    }

}
