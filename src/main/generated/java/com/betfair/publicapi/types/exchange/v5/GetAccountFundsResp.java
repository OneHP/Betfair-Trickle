
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountFundsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountFundsResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="availBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="commissionRetain" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="currentBetfairPoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="expoLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="exposure" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="holidaysAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="withdrawBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetAccountFundsErrorEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountFundsResp", propOrder = {
    "availBalance",
    "balance",
    "commissionRetain",
    "creditLimit",
    "currentBetfairPoints",
    "expoLimit",
    "exposure",
    "holidaysAvailable",
    "minorErrorCode",
    "nextDiscount",
    "withdrawBalance",
    "errorCode"
})
public class GetAccountFundsResp
    extends APIResponse
{

    protected double availBalance;
    protected double balance;
    protected double commissionRetain;
    protected double creditLimit;
    protected int currentBetfairPoints;
    protected double expoLimit;
    protected double exposure;
    protected int holidaysAvailable;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    protected double nextDiscount;
    protected double withdrawBalance;
    @XmlElement(required = true)
    protected GetAccountFundsErrorEnum errorCode;

    /**
     * Gets the value of the availBalance property.
     * 
     */
    public double getAvailBalance() {
        return availBalance;
    }

    /**
     * Sets the value of the availBalance property.
     * 
     */
    public void setAvailBalance(double value) {
        this.availBalance = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(double value) {
        this.balance = value;
    }

    /**
     * Gets the value of the commissionRetain property.
     * 
     */
    public double getCommissionRetain() {
        return commissionRetain;
    }

    /**
     * Sets the value of the commissionRetain property.
     * 
     */
    public void setCommissionRetain(double value) {
        this.commissionRetain = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     */
    public double getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     */
    public void setCreditLimit(double value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the currentBetfairPoints property.
     * 
     */
    public int getCurrentBetfairPoints() {
        return currentBetfairPoints;
    }

    /**
     * Sets the value of the currentBetfairPoints property.
     * 
     */
    public void setCurrentBetfairPoints(int value) {
        this.currentBetfairPoints = value;
    }

    /**
     * Gets the value of the expoLimit property.
     * 
     */
    public double getExpoLimit() {
        return expoLimit;
    }

    /**
     * Sets the value of the expoLimit property.
     * 
     */
    public void setExpoLimit(double value) {
        this.expoLimit = value;
    }

    /**
     * Gets the value of the exposure property.
     * 
     */
    public double getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     */
    public void setExposure(double value) {
        this.exposure = value;
    }

    /**
     * Gets the value of the holidaysAvailable property.
     * 
     */
    public int getHolidaysAvailable() {
        return holidaysAvailable;
    }

    /**
     * Sets the value of the holidaysAvailable property.
     * 
     */
    public void setHolidaysAvailable(int value) {
        this.holidaysAvailable = value;
    }

    /**
     * Gets the value of the minorErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorErrorCode() {
        return minorErrorCode;
    }

    /**
     * Sets the value of the minorErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorErrorCode(String value) {
        this.minorErrorCode = value;
    }

    /**
     * Gets the value of the nextDiscount property.
     * 
     */
    public double getNextDiscount() {
        return nextDiscount;
    }

    /**
     * Sets the value of the nextDiscount property.
     * 
     */
    public void setNextDiscount(double value) {
        this.nextDiscount = value;
    }

    /**
     * Gets the value of the withdrawBalance property.
     * 
     */
    public double getWithdrawBalance() {
        return withdrawBalance;
    }

    /**
     * Sets the value of the withdrawBalance property.
     * 
     */
    public void setWithdrawBalance(double value) {
        this.withdrawBalance = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountFundsErrorEnum }
     *     
     */
    public GetAccountFundsErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountFundsErrorEnum }
     *     
     */
    public void setErrorCode(GetAccountFundsErrorEnum value) {
        this.errorCode = value;
    }

}
