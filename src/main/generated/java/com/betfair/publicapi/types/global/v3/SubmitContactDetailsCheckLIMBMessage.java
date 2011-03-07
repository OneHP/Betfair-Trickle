
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitContactDetailsCheckLIMBMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitContactDetailsCheckLIMBMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="detailsCorrect" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newHomeTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newWorkTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newMobileTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitContactDetailsCheckLIMBMessage", propOrder = {
    "messageId",
    "detailsCorrect",
    "newHomeTelephone",
    "newWorkTelephone",
    "newMobileTelephone",
    "newEmailAddress"
})
public class SubmitContactDetailsCheckLIMBMessage {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer messageId;
    @XmlElement(required = true, nillable = true)
    protected String detailsCorrect;
    @XmlElement(required = true, nillable = true)
    protected String newHomeTelephone;
    @XmlElement(required = true, nillable = true)
    protected String newWorkTelephone;
    @XmlElement(required = true, nillable = true)
    protected String newMobileTelephone;
    @XmlElement(required = true, nillable = true)
    protected String newEmailAddress;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMessageId(Integer value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the detailsCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsCorrect() {
        return detailsCorrect;
    }

    /**
     * Sets the value of the detailsCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsCorrect(String value) {
        this.detailsCorrect = value;
    }

    /**
     * Gets the value of the newHomeTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewHomeTelephone() {
        return newHomeTelephone;
    }

    /**
     * Sets the value of the newHomeTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewHomeTelephone(String value) {
        this.newHomeTelephone = value;
    }

    /**
     * Gets the value of the newWorkTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewWorkTelephone() {
        return newWorkTelephone;
    }

    /**
     * Sets the value of the newWorkTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewWorkTelephone(String value) {
        this.newWorkTelephone = value;
    }

    /**
     * Gets the value of the newMobileTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMobileTelephone() {
        return newMobileTelephone;
    }

    /**
     * Sets the value of the newMobileTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMobileTelephone(String value) {
        this.newMobileTelephone = value;
    }

    /**
     * Gets the value of the newEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmailAddress() {
        return newEmailAddress;
    }

    /**
     * Sets the value of the newEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmailAddress(String value) {
        this.newEmailAddress = value;
    }

}
