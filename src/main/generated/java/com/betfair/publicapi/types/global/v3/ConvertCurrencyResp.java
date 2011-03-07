
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConvertCurrencyResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvertCurrencyResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="convertedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/global/v3/}ConvertCurrencyErrorEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertCurrencyResp", propOrder = {
    "convertedAmount",
    "errorCode"
})
public class ConvertCurrencyResp
    extends APIResponse
{

    protected double convertedAmount;
    @XmlElement(required = true)
    protected ConvertCurrencyErrorEnum errorCode;

    /**
     * Gets the value of the convertedAmount property.
     * 
     */
    public double getConvertedAmount() {
        return convertedAmount;
    }

    /**
     * Sets the value of the convertedAmount property.
     * 
     */
    public void setConvertedAmount(double value) {
        this.convertedAmount = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConvertCurrencyErrorEnum }
     *     
     */
    public ConvertCurrencyErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConvertCurrencyErrorEnum }
     *     
     */
    public void setErrorCode(ConvertCurrencyErrorEnum value) {
        this.errorCode = value;
    }

}
