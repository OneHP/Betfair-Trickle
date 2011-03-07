
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  Result of a DepositFromPaymentCardReq.  If errorCode is set to CARD_AMOUNT_OUTSIDE_LIMIT then minAmount and maxAmount 
 * 			  will be set.  If errorCode is set to DEPOSIT_LIMIT_EXCEEDED then maxAmount will be set.
 * 		  
 * 
 * <p>Java class for DepositFromPaymentCardResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositFromPaymentCardResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/global/v3/}PaymentsErrorEnum"/>
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositFromPaymentCardResp", propOrder = {
    "errorCode",
    "fee",
    "maxAmount",
    "minAmount",
    "minorErrorCode",
    "netAmount",
    "transactionId"
})
public class DepositFromPaymentCardResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected PaymentsErrorEnum errorCode;
    protected double fee;
    protected double maxAmount;
    protected double minAmount;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    protected double netAmount;
    @XmlElement(required = true)
    protected String transactionId;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentsErrorEnum }
     *     
     */
    public PaymentsErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsErrorEnum }
     *     
     */
    public void setErrorCode(PaymentsErrorEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     */
    public double getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     */
    public void setFee(double value) {
        this.fee = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     */
    public double getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     */
    public void setMaxAmount(double value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     */
    public double getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     */
    public void setMinAmount(double value) {
        this.minAmount = value;
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
     * Gets the value of the netAmount property.
     * 
     */
    public double getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     */
    public void setNetAmount(double value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

}
