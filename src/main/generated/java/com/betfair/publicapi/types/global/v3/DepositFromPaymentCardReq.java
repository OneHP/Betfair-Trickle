
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositFromPaymentCardReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositFromPaymentCardReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cardIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cv2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositFromPaymentCardReq", propOrder = {
    "amount",
    "cardIdentifier",
    "cv2",
    "password"
})
public class DepositFromPaymentCardReq
    extends APIRequest
{

    protected double amount;
    @XmlElement(required = true, nillable = true)
    protected String cardIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String cv2;
    @XmlElement(required = true, nillable = true)
    protected String password;

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

    /**
     * Gets the value of the cardIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIdentifier() {
        return cardIdentifier;
    }

    /**
     * Sets the value of the cardIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIdentifier(String value) {
        this.cardIdentifier = value;
    }

    /**
     * Gets the value of the cv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCv2() {
        return cv2;
    }

    /**
     * Sets the value of the cv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCv2(String value) {
        this.cv2 = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
