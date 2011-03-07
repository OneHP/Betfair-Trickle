
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitCardBillingAddressCheckLIMBMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitCardBillingAddressCheckLIMBMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="detailsCorrect" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nickName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newAddress3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newTown" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newCounty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitCardBillingAddressCheckLIMBMessage", propOrder = {
    "messageId",
    "detailsCorrect",
    "nickName",
    "newAddress1",
    "newAddress2",
    "newAddress3",
    "newTown",
    "newCounty",
    "newZipCode",
    "newCountry"
})
public class SubmitCardBillingAddressCheckLIMBMessage {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer messageId;
    @XmlElement(required = true, nillable = true)
    protected String detailsCorrect;
    @XmlElement(required = true)
    protected String nickName;
    @XmlElement(required = true, nillable = true)
    protected String newAddress1;
    @XmlElement(required = true, nillable = true)
    protected String newAddress2;
    @XmlElement(required = true, nillable = true)
    protected String newAddress3;
    @XmlElement(required = true, nillable = true)
    protected String newTown;
    @XmlElement(required = true, nillable = true)
    protected String newCounty;
    @XmlElement(required = true, nillable = true)
    protected String newZipCode;
    @XmlElement(required = true, nillable = true)
    protected String newCountry;

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
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the newAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAddress1() {
        return newAddress1;
    }

    /**
     * Sets the value of the newAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAddress1(String value) {
        this.newAddress1 = value;
    }

    /**
     * Gets the value of the newAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAddress2() {
        return newAddress2;
    }

    /**
     * Sets the value of the newAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAddress2(String value) {
        this.newAddress2 = value;
    }

    /**
     * Gets the value of the newAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAddress3() {
        return newAddress3;
    }

    /**
     * Sets the value of the newAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAddress3(String value) {
        this.newAddress3 = value;
    }

    /**
     * Gets the value of the newTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewTown() {
        return newTown;
    }

    /**
     * Sets the value of the newTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewTown(String value) {
        this.newTown = value;
    }

    /**
     * Gets the value of the newCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCounty() {
        return newCounty;
    }

    /**
     * Sets the value of the newCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCounty(String value) {
        this.newCounty = value;
    }

    /**
     * Gets the value of the newZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewZipCode() {
        return newZipCode;
    }

    /**
     * Sets the value of the newZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewZipCode(String value) {
        this.newZipCode = value;
    }

    /**
     * Gets the value of the newCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCountry() {
        return newCountry;
    }

    /**
     * Sets the value of the newCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCountry(String value) {
        this.newCountry = value;
    }

}
