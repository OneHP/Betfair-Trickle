
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferFundsErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferFundsErrorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_AMOUNT"/>
 *     &lt;enumeration value="TRANSFER_FAILED"/>
 *     &lt;enumeration value="OVER_BALANCE"/>
 *     &lt;enumeration value="WALLETS_MUST_BE_DIFFERENT"/>
 *     &lt;enumeration value="SOURCE_WALLET_UNKNOWN"/>
 *     &lt;enumeration value="SOURCE_WALLET_SUSPENDED"/>
 *     &lt;enumeration value="SOURCE_WALLET_SUSPENDED_KYC"/>
 *     &lt;enumeration value="SOURCE_WALLET_KYC_WITHDRAWAL"/>
 *     &lt;enumeration value="SOURCE_WALLET_KYC_DEPOSIT_TOTAL"/>
 *     &lt;enumeration value="SOURCE_WALLET_KYC_DEPOSIT_MONTH"/>
 *     &lt;enumeration value="TARGET_WALLET_UNKNOWN"/>
 *     &lt;enumeration value="TARGET_WALLET_SUSPENDED"/>
 *     &lt;enumeration value="TARGET_WALLET_SUSPENDED_KYC"/>
 *     &lt;enumeration value="TARGET_WALLET_KYC_WITHDRAWAL"/>
 *     &lt;enumeration value="TARGET_WALLET_KYC_DEPOSIT_TOTAL"/>
 *     &lt;enumeration value="TARGET_WALLET_KYC_DEPOSIT_MONTH"/>
 *     &lt;enumeration value="API_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransferFundsErrorEnum")
@XmlEnum
public enum TransferFundsErrorEnum {

    OK,
    INVALID_AMOUNT,
    TRANSFER_FAILED,
    OVER_BALANCE,
    WALLETS_MUST_BE_DIFFERENT,
    SOURCE_WALLET_UNKNOWN,
    SOURCE_WALLET_SUSPENDED,
    SOURCE_WALLET_SUSPENDED_KYC,
    SOURCE_WALLET_KYC_WITHDRAWAL,
    SOURCE_WALLET_KYC_DEPOSIT_TOTAL,
    SOURCE_WALLET_KYC_DEPOSIT_MONTH,
    TARGET_WALLET_UNKNOWN,
    TARGET_WALLET_SUSPENDED,
    TARGET_WALLET_SUSPENDED_KYC,
    TARGET_WALLET_KYC_WITHDRAWAL,
    TARGET_WALLET_KYC_DEPOSIT_TOTAL,
    TARGET_WALLET_KYC_DEPOSIT_MONTH,
    API_ERROR;

    public String value() {
        return name();
    }

    public static TransferFundsErrorEnum fromValue(String v) {
        return valueOf(v);
    }

}
