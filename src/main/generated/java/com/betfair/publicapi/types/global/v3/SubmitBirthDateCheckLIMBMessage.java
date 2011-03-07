
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubmitBirthDateCheckLIMBMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitBirthDateCheckLIMBMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="detailsCorrect" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="correctBirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitBirthDateCheckLIMBMessage", propOrder = {
    "messageId",
    "detailsCorrect",
    "correctBirthDate"
})
public class SubmitBirthDateCheckLIMBMessage {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer messageId;
    @XmlElement(required = true, nillable = true)
    protected String detailsCorrect;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar correctBirthDate;

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
     * Gets the value of the correctBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCorrectBirthDate() {
        return correctBirthDate;
    }

    /**
     * Sets the value of the correctBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCorrectBirthDate(XMLGregorianCalendar value) {
        this.correctBirthDate = value;
    }

}
