
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateBetsResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateBetsResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="BET_IN_PROGRESS"/>
 *     &lt;enumeration value="BBM_DAEMON_NOT_AVAILABLE"/>
 *     &lt;enumeration value="BET_CANCELLED_REMAINING_UNMATCHED"/>
 *     &lt;enumeration value="BET_CANNOT_BE_ACCEPTED"/>
 *     &lt;enumeration value="BET_NOT_CANCELLED"/>
 *     &lt;enumeration value="BET_TAKEN_OR_LAPSED"/>
 *     &lt;enumeration value="CANCELLED_NOT_PLACED"/>
 *     &lt;enumeration value="ERROR_LINE_EXPO_BET_CANCELLED_NOT_PLACED"/>
 *     &lt;enumeration value="EVENT_CLOSED_CANNOT_MODIFY_BET"/>
 *     &lt;enumeration value="EXCEEDED_EXPOSURE_OR_AVAILABLE_TO_BET_BALANCE"/>
 *     &lt;enumeration value="EXPOSURE_CALCULATION_ERROR"/>
 *     &lt;enumeration value="EXPOSURE_CALCULATION_IN_PROGRESS"/>
 *     &lt;enumeration value="FROM_COUNTRY_ON_EVENT_FORBIDDEN"/>
 *     &lt;enumeration value="INPLAY_FROM_COUNTRY_FORBIDDEN"/>
 *     &lt;enumeration value="INSUFFICIENT_BALANCE"/>
 *     &lt;enumeration value="INVALID_BET_ID"/>
 *     &lt;enumeration value="INVALID_OLD_PRICE"/>
 *     &lt;enumeration value="INVALID_OLD_SIZE"/>
 *     &lt;enumeration value="INVALID_PRICE"/>
 *     &lt;enumeration value="INVALID_PRICE_AND_SIZE"/>
 *     &lt;enumeration value="INVALID_SIZE"/>
 *     &lt;enumeration value="LOSS_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="NEW_BET_SUBMITTED_SUCCESSFULLY"/>
 *     &lt;enumeration value="NOT_PLACED_EXPOSURE_EXCEEDED"/>
 *     &lt;enumeration value="NOT_PLACED_REMAINING_CANCELLED"/>
 *     &lt;enumeration value="OK_REMAINING_CANCELLED"/>
 *     &lt;enumeration value="PARTIAL_CANCELLATION"/>
 *     &lt;enumeration value="REMAINING_SIZE_CANCELLED"/>
 *     &lt;enumeration value="RUNNER_REMOVED"/>
 *     &lt;enumeration value="SITE_UPGRADE"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *     &lt;enumeration value="VACANT_TRAP"/>
 *     &lt;enumeration value="WRONG_MININUM_PERMITTED_BET_SIZE"/>
 *     &lt;enumeration value="BSP_BETS_CANNOT_BE_CANCELLED"/>
 *     &lt;enumeration value="BSP_BETTING_NOT_ALLOWED"/>
 *     &lt;enumeration value="BSP_BETTING_NOT_SUPPORTED"/>
 *     &lt;enumeration value="BSP_INVALID_PRICE_LIMIT"/>
 *     &lt;enumeration value="BSP_MOC_BETS_EDITING_NOT_PERMITTED"/>
 *     &lt;enumeration value="INVALID_BSP_BET_UPDATE"/>
 *     &lt;enumeration value="INVALID_INPUTS"/>
 *     &lt;enumeration value="PERSISTENCE_MODIFICATION_SUCCESS"/>
 *     &lt;enumeration value="INVALID_NEW_PRICE_LIMIT"/>
 *     &lt;enumeration value="BSP_INVALID_PERSISTENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateBetsResultEnum")
@XmlEnum
public enum UpdateBetsResultEnum {

    OK,
    BET_IN_PROGRESS,
    BBM_DAEMON_NOT_AVAILABLE,
    BET_CANCELLED_REMAINING_UNMATCHED,
    BET_CANNOT_BE_ACCEPTED,
    BET_NOT_CANCELLED,
    BET_TAKEN_OR_LAPSED,
    CANCELLED_NOT_PLACED,
    ERROR_LINE_EXPO_BET_CANCELLED_NOT_PLACED,
    EVENT_CLOSED_CANNOT_MODIFY_BET,
    EXCEEDED_EXPOSURE_OR_AVAILABLE_TO_BET_BALANCE,
    EXPOSURE_CALCULATION_ERROR,
    EXPOSURE_CALCULATION_IN_PROGRESS,
    FROM_COUNTRY_ON_EVENT_FORBIDDEN,
    INPLAY_FROM_COUNTRY_FORBIDDEN,
    INSUFFICIENT_BALANCE,
    INVALID_BET_ID,
    INVALID_OLD_PRICE,
    INVALID_OLD_SIZE,
    INVALID_PRICE,
    INVALID_PRICE_AND_SIZE,
    INVALID_SIZE,
    LOSS_LIMIT_EXCEEDED,
    NEW_BET_SUBMITTED_SUCCESSFULLY,
    NOT_PLACED_EXPOSURE_EXCEEDED,
    NOT_PLACED_REMAINING_CANCELLED,
    OK_REMAINING_CANCELLED,
    PARTIAL_CANCELLATION,
    REMAINING_SIZE_CANCELLED,
    RUNNER_REMOVED,
    SITE_UPGRADE,
    UNKNOWN_ERROR,
    VACANT_TRAP,
    WRONG_MININUM_PERMITTED_BET_SIZE,
    BSP_BETS_CANNOT_BE_CANCELLED,
    BSP_BETTING_NOT_ALLOWED,
    BSP_BETTING_NOT_SUPPORTED,
    BSP_INVALID_PRICE_LIMIT,
    BSP_MOC_BETS_EDITING_NOT_PERMITTED,
    INVALID_BSP_BET_UPDATE,
    INVALID_INPUTS,
    PERSISTENCE_MODIFICATION_SUCCESS,
    INVALID_NEW_PRICE_LIMIT,
    BSP_INVALID_PERSISTENCE;

    public String value() {
        return name();
    }

    public static UpdateBetsResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
