
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveLIMBMessageResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveLIMBMessageResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/global/v3/}RetrieveLIMBMessageErrorEnum"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalMessagesCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="retrievePersonalMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}RetrievePersonalLIMBMessage"/>
 *         &lt;element name="retrieveTCPrivacyPolicyChangeMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}RetrieveTCPrivacyPolicyChangeLIMBMessage"/>
 *         &lt;element name="retrievePasswordChangeMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}RetrievePasswordChangeLIMBMessage"/>
 *         &lt;element name="retrieveBirthDateCheckMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}RetrieveBirthDateCheckLIMBMessage"/>
 *         &lt;element name="retrieveAddressCheckMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}RetrieveAddressCheckLIMBMessage"/>
 *         &lt;element name="retrieveContactDetailsCheckMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}RetrieveContactDetailsCheckLIMBMessage"/>
 *         &lt;element name="retrieveChatNameChangeMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}RetrieveChatNameChangeLIMBMessage"/>
 *         &lt;element name="retrieveCardBillingAddressCheckItems" type="{http://www.betfair.com/publicapi/types/global/v3/}ArrayOfRetrieveCardBillingAddressCheckLIMBMessage"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveLIMBMessageResp", propOrder = {
    "errorCode",
    "minorErrorCode",
    "totalMessagesCount",
    "retrievePersonalMessage",
    "retrieveTCPrivacyPolicyChangeMessage",
    "retrievePasswordChangeMessage",
    "retrieveBirthDateCheckMessage",
    "retrieveAddressCheckMessage",
    "retrieveContactDetailsCheckMessage",
    "retrieveChatNameChangeMessage",
    "retrieveCardBillingAddressCheckItems"
})
public class RetrieveLIMBMessageResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected RetrieveLIMBMessageErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    protected int totalMessagesCount;
    @XmlElement(required = true)
    protected RetrievePersonalLIMBMessage retrievePersonalMessage;
    @XmlElement(required = true)
    protected RetrieveTCPrivacyPolicyChangeLIMBMessage retrieveTCPrivacyPolicyChangeMessage;
    @XmlElement(required = true)
    protected RetrievePasswordChangeLIMBMessage retrievePasswordChangeMessage;
    @XmlElement(required = true)
    protected RetrieveBirthDateCheckLIMBMessage retrieveBirthDateCheckMessage;
    @XmlElement(required = true)
    protected RetrieveAddressCheckLIMBMessage retrieveAddressCheckMessage;
    @XmlElement(required = true)
    protected RetrieveContactDetailsCheckLIMBMessage retrieveContactDetailsCheckMessage;
    @XmlElement(required = true)
    protected RetrieveChatNameChangeLIMBMessage retrieveChatNameChangeMessage;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRetrieveCardBillingAddressCheckLIMBMessage retrieveCardBillingAddressCheckItems;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveLIMBMessageErrorEnum }
     *     
     */
    public RetrieveLIMBMessageErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveLIMBMessageErrorEnum }
     *     
     */
    public void setErrorCode(RetrieveLIMBMessageErrorEnum value) {
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
     * Gets the value of the totalMessagesCount property.
     * 
     */
    public int getTotalMessagesCount() {
        return totalMessagesCount;
    }

    /**
     * Sets the value of the totalMessagesCount property.
     * 
     */
    public void setTotalMessagesCount(int value) {
        this.totalMessagesCount = value;
    }

    /**
     * Gets the value of the retrievePersonalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievePersonalLIMBMessage }
     *     
     */
    public RetrievePersonalLIMBMessage getRetrievePersonalMessage() {
        return retrievePersonalMessage;
    }

    /**
     * Sets the value of the retrievePersonalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievePersonalLIMBMessage }
     *     
     */
    public void setRetrievePersonalMessage(RetrievePersonalLIMBMessage value) {
        this.retrievePersonalMessage = value;
    }

    /**
     * Gets the value of the retrieveTCPrivacyPolicyChangeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveTCPrivacyPolicyChangeLIMBMessage }
     *     
     */
    public RetrieveTCPrivacyPolicyChangeLIMBMessage getRetrieveTCPrivacyPolicyChangeMessage() {
        return retrieveTCPrivacyPolicyChangeMessage;
    }

    /**
     * Sets the value of the retrieveTCPrivacyPolicyChangeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveTCPrivacyPolicyChangeLIMBMessage }
     *     
     */
    public void setRetrieveTCPrivacyPolicyChangeMessage(RetrieveTCPrivacyPolicyChangeLIMBMessage value) {
        this.retrieveTCPrivacyPolicyChangeMessage = value;
    }

    /**
     * Gets the value of the retrievePasswordChangeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievePasswordChangeLIMBMessage }
     *     
     */
    public RetrievePasswordChangeLIMBMessage getRetrievePasswordChangeMessage() {
        return retrievePasswordChangeMessage;
    }

    /**
     * Sets the value of the retrievePasswordChangeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievePasswordChangeLIMBMessage }
     *     
     */
    public void setRetrievePasswordChangeMessage(RetrievePasswordChangeLIMBMessage value) {
        this.retrievePasswordChangeMessage = value;
    }

    /**
     * Gets the value of the retrieveBirthDateCheckMessage property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveBirthDateCheckLIMBMessage }
     *     
     */
    public RetrieveBirthDateCheckLIMBMessage getRetrieveBirthDateCheckMessage() {
        return retrieveBirthDateCheckMessage;
    }

    /**
     * Sets the value of the retrieveBirthDateCheckMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveBirthDateCheckLIMBMessage }
     *     
     */
    public void setRetrieveBirthDateCheckMessage(RetrieveBirthDateCheckLIMBMessage value) {
        this.retrieveBirthDateCheckMessage = value;
    }

    /**
     * Gets the value of the retrieveAddressCheckMessage property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveAddressCheckLIMBMessage }
     *     
     */
    public RetrieveAddressCheckLIMBMessage getRetrieveAddressCheckMessage() {
        return retrieveAddressCheckMessage;
    }

    /**
     * Sets the value of the retrieveAddressCheckMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveAddressCheckLIMBMessage }
     *     
     */
    public void setRetrieveAddressCheckMessage(RetrieveAddressCheckLIMBMessage value) {
        this.retrieveAddressCheckMessage = value;
    }

    /**
     * Gets the value of the retrieveContactDetailsCheckMessage property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveContactDetailsCheckLIMBMessage }
     *     
     */
    public RetrieveContactDetailsCheckLIMBMessage getRetrieveContactDetailsCheckMessage() {
        return retrieveContactDetailsCheckMessage;
    }

    /**
     * Sets the value of the retrieveContactDetailsCheckMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveContactDetailsCheckLIMBMessage }
     *     
     */
    public void setRetrieveContactDetailsCheckMessage(RetrieveContactDetailsCheckLIMBMessage value) {
        this.retrieveContactDetailsCheckMessage = value;
    }

    /**
     * Gets the value of the retrieveChatNameChangeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveChatNameChangeLIMBMessage }
     *     
     */
    public RetrieveChatNameChangeLIMBMessage getRetrieveChatNameChangeMessage() {
        return retrieveChatNameChangeMessage;
    }

    /**
     * Sets the value of the retrieveChatNameChangeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveChatNameChangeLIMBMessage }
     *     
     */
    public void setRetrieveChatNameChangeMessage(RetrieveChatNameChangeLIMBMessage value) {
        this.retrieveChatNameChangeMessage = value;
    }

    /**
     * Gets the value of the retrieveCardBillingAddressCheckItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetrieveCardBillingAddressCheckLIMBMessage }
     *     
     */
    public ArrayOfRetrieveCardBillingAddressCheckLIMBMessage getRetrieveCardBillingAddressCheckItems() {
        return retrieveCardBillingAddressCheckItems;
    }

    /**
     * Sets the value of the retrieveCardBillingAddressCheckItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetrieveCardBillingAddressCheckLIMBMessage }
     *     
     */
    public void setRetrieveCardBillingAddressCheckItems(ArrayOfRetrieveCardBillingAddressCheckLIMBMessage value) {
        this.retrieveCardBillingAddressCheckItems = value;
    }

}
