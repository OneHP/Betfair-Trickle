
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitChatNameChangeLIMBMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitChatNameChangeLIMBMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="newChatName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitChatNameChangeLIMBMessage", propOrder = {
    "messageId",
    "newChatName"
})
public class SubmitChatNameChangeLIMBMessage {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer messageId;
    @XmlElement(required = true, nillable = true)
    protected String newChatName;

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
     * Gets the value of the newChatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewChatName() {
        return newChatName;
    }

    /**
     * Sets the value of the newChatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewChatName(String value) {
        this.newChatName = value;
    }

}
