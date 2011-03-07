
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferFundsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferFundsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="sourceWalletId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetWalletId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferFundsReq", propOrder = {
    "sourceWalletId",
    "targetWalletId",
    "amount"
})
public class TransferFundsReq
    extends APIRequest
{

    protected int sourceWalletId;
    protected int targetWalletId;
    protected double amount;

    /**
     * Gets the value of the sourceWalletId property.
     * 
     */
    public int getSourceWalletId() {
        return sourceWalletId;
    }

    /**
     * Sets the value of the sourceWalletId property.
     * 
     */
    public void setSourceWalletId(int value) {
        this.sourceWalletId = value;
    }

    /**
     * Gets the value of the targetWalletId property.
     * 
     */
    public int getTargetWalletId() {
        return targetWalletId;
    }

    /**
     * Sets the value of the targetWalletId property.
     * 
     */
    public void setTargetWalletId(int value) {
        this.targetWalletId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

}
