
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitLIMBMessageReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitLIMBMessageReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submitPersonalMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}SubmitPersonalLIMBMessage"/>
 *         &lt;element name="submitTCPrivacyPolicyChangeMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}SubmitTCPrivacyPolicyChangeLIMBMessage"/>
 *         &lt;element name="submitPasswordChangeMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}SubmitPasswordChangeLIMBMessage"/>
 *         &lt;element name="submitBirthDateCheckMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}SubmitBirthDateCheckLIMBMessage"/>
 *         &lt;element name="submitAddressCheckMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}SubmitAddressCheckLIMBMessage"/>
 *         &lt;element name="submitContactDetailsCheckMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}SubmitContactDetailsCheckLIMBMessage"/>
 *         &lt;element name="submitChatNameChangeMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}SubmitChatNameChangeLIMBMessage"/>
 *         &lt;element name="submitCardBillingAddressCheckItems" type="{http://www.betfair.com/publicapi/types/global/v3/}ArrayOfSubmitCardBillingAddressCheckLIMBMessage"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitLIMBMessageReq", propOrder = {
    "password",
    "submitPersonalMessage",
    "submitTCPrivacyPolicyChangeMessage",
    "submitPasswordChangeMessage",
    "submitBirthDateCheckMessage",
    "submitAddressCheckMessage",
    "submitContactDetailsCheckMessage",
    "submitChatNameChangeMessage",
    "submitCardBillingAddressCheckItems"
})
public class SubmitLIMBMessageReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected SubmitPersonalLIMBMessage submitPersonalMessage;
    @XmlElement(required = true)
    protected SubmitTCPrivacyPolicyChangeLIMBMessage submitTCPrivacyPolicyChangeMessage;
    @XmlElement(required = true)
    protected SubmitPasswordChangeLIMBMessage submitPasswordChangeMessage;
    @XmlElement(required = true)
    protected SubmitBirthDateCheckLIMBMessage submitBirthDateCheckMessage;
    @XmlElement(required = true)
    protected SubmitAddressCheckLIMBMessage submitAddressCheckMessage;
    @XmlElement(required = true)
    protected SubmitContactDetailsCheckLIMBMessage submitContactDetailsCheckMessage;
    @XmlElement(required = true)
    protected SubmitChatNameChangeLIMBMessage submitChatNameChangeMessage;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSubmitCardBillingAddressCheckLIMBMessage submitCardBillingAddressCheckItems;

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

    /**
     * Gets the value of the submitPersonalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitPersonalLIMBMessage }
     *     
     */
    public SubmitPersonalLIMBMessage getSubmitPersonalMessage() {
        return submitPersonalMessage;
    }

    /**
     * Sets the value of the submitPersonalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitPersonalLIMBMessage }
     *     
     */
    public void setSubmitPersonalMessage(SubmitPersonalLIMBMessage value) {
        this.submitPersonalMessage = value;
    }

    /**
     * Gets the value of the submitTCPrivacyPolicyChangeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitTCPrivacyPolicyChangeLIMBMessage }
     *     
     */
    public SubmitTCPrivacyPolicyChangeLIMBMessage getSubmitTCPrivacyPolicyChangeMessage() {
        return submitTCPrivacyPolicyChangeMessage;
    }

    /**
     * Sets the value of the submitTCPrivacyPolicyChangeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitTCPrivacyPolicyChangeLIMBMessage }
     *     
     */
    public void setSubmitTCPrivacyPolicyChangeMessage(SubmitTCPrivacyPolicyChangeLIMBMessage value) {
        this.submitTCPrivacyPolicyChangeMessage = value;
    }

    /**
     * Gets the value of the submitPasswordChangeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitPasswordChangeLIMBMessage }
     *     
     */
    public SubmitPasswordChangeLIMBMessage getSubmitPasswordChangeMessage() {
        return submitPasswordChangeMessage;
    }

    /**
     * Sets the value of the submitPasswordChangeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitPasswordChangeLIMBMessage }
     *     
     */
    public void setSubmitPasswordChangeMessage(SubmitPasswordChangeLIMBMessage value) {
        this.submitPasswordChangeMessage = value;
    }

    /**
     * Gets the value of the submitBirthDateCheckMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitBirthDateCheckLIMBMessage }
     *     
     */
    public SubmitBirthDateCheckLIMBMessage getSubmitBirthDateCheckMessage() {
        return submitBirthDateCheckMessage;
    }

    /**
     * Sets the value of the submitBirthDateCheckMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitBirthDateCheckLIMBMessage }
     *     
     */
    public void setSubmitBirthDateCheckMessage(SubmitBirthDateCheckLIMBMessage value) {
        this.submitBirthDateCheckMessage = value;
    }

    /**
     * Gets the value of the submitAddressCheckMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitAddressCheckLIMBMessage }
     *     
     */
    public SubmitAddressCheckLIMBMessage getSubmitAddressCheckMessage() {
        return submitAddressCheckMessage;
    }

    /**
     * Sets the value of the submitAddressCheckMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitAddressCheckLIMBMessage }
     *     
     */
    public void setSubmitAddressCheckMessage(SubmitAddressCheckLIMBMessage value) {
        this.submitAddressCheckMessage = value;
    }

    /**
     * Gets the value of the submitContactDetailsCheckMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitContactDetailsCheckLIMBMessage }
     *     
     */
    public SubmitContactDetailsCheckLIMBMessage getSubmitContactDetailsCheckMessage() {
        return submitContactDetailsCheckMessage;
    }

    /**
     * Sets the value of the submitContactDetailsCheckMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitContactDetailsCheckLIMBMessage }
     *     
     */
    public void setSubmitContactDetailsCheckMessage(SubmitContactDetailsCheckLIMBMessage value) {
        this.submitContactDetailsCheckMessage = value;
    }

    /**
     * Gets the value of the submitChatNameChangeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitChatNameChangeLIMBMessage }
     *     
     */
    public SubmitChatNameChangeLIMBMessage getSubmitChatNameChangeMessage() {
        return submitChatNameChangeMessage;
    }

    /**
     * Sets the value of the submitChatNameChangeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitChatNameChangeLIMBMessage }
     *     
     */
    public void setSubmitChatNameChangeMessage(SubmitChatNameChangeLIMBMessage value) {
        this.submitChatNameChangeMessage = value;
    }

    /**
     * Gets the value of the submitCardBillingAddressCheckItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubmitCardBillingAddressCheckLIMBMessage }
     *     
     */
    public ArrayOfSubmitCardBillingAddressCheckLIMBMessage getSubmitCardBillingAddressCheckItems() {
        return submitCardBillingAddressCheckItems;
    }

    /**
     * Sets the value of the submitCardBillingAddressCheckItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubmitCardBillingAddressCheckLIMBMessage }
     *     
     */
    public void setSubmitCardBillingAddressCheckItems(ArrayOfSubmitCardBillingAddressCheckLIMBMessage value) {
        this.submitCardBillingAddressCheckItems = value;
    }

}
