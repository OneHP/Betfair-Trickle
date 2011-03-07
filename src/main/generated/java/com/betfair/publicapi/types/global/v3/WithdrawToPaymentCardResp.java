
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WithdrawToPaymentCardResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WithdrawToPaymentCardResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="amountWithdrawn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/global/v3/}PaymentsErrorEnum"/>
 *         &lt;element name="maxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithdrawToPaymentCardResp", propOrder = {
    "amountWithdrawn",
    "errorCode",
    "maxAmount",
    "minorErrorCode"
})
public class WithdrawToPaymentCardResp
    extends APIResponse
{

    protected double amountWithdrawn;
    @XmlElement(required = true)
    protected PaymentsErrorEnum errorCode;
    protected double maxAmount;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;

    /**
     * Gets the value of the amountWithdrawn property.
     * 
     */
    public double getAmountWithdrawn() {
        return amountWithdrawn;
    }

    /**
     * Sets the value of the amountWithdrawn property.
     * 
     */
    public void setAmountWithdrawn(double value) {
        this.amountWithdrawn = value;
    }

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

}
