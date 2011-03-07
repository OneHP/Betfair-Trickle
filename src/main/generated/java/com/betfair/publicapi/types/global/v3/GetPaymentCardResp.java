
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPaymentCardResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPaymentCardResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/global/v3/}GetPaymentCardErrorEnum"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentCardItems" type="{http://www.betfair.com/publicapi/types/global/v3/}ArrayOfPaymentCard"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPaymentCardResp", propOrder = {
    "errorCode",
    "minorErrorCode",
    "paymentCardItems"
})
public class GetPaymentCardResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected GetPaymentCardErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPaymentCard paymentCardItems;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetPaymentCardErrorEnum }
     *     
     */
    public GetPaymentCardErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPaymentCardErrorEnum }
     *     
     */
    public void setErrorCode(GetPaymentCardErrorEnum value) {
        this.errorCode = value;
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
     * Gets the value of the paymentCardItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentCard }
     *     
     */
    public ArrayOfPaymentCard getPaymentCardItems() {
        return paymentCardItems;
    }

    /**
     * Sets the value of the paymentCardItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentCard }
     *     
     */
    public void setPaymentCardItems(ArrayOfPaymentCard value) {
        this.paymentCardItems = value;
    }

}
