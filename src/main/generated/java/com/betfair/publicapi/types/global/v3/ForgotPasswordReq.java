
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForgotPasswordReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForgotPasswordReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forgottenPasswordAnswer1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forgottenPasswordAnswer2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newPasswordRepeat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForgotPasswordReq", propOrder = {
    "username",
    "emailAddress",
    "countryOfResidence",
    "forgottenPasswordAnswer1",
    "forgottenPasswordAnswer2",
    "newPassword",
    "newPasswordRepeat"
})
public class ForgotPasswordReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String emailAddress;
    @XmlElement(required = true)
    protected String countryOfResidence;
    @XmlElement(required = true, nillable = true)
    protected String forgottenPasswordAnswer1;
    @XmlElement(required = true, nillable = true)
    protected String forgottenPasswordAnswer2;
    @XmlElement(required = true, nillable = true)
    protected String newPassword;
    @XmlElement(required = true, nillable = true)
    protected String newPasswordRepeat;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the countryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfResidence(String value) {
        this.countryOfResidence = value;
    }

    /**
     * Gets the value of the forgottenPasswordAnswer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForgottenPasswordAnswer1() {
        return forgottenPasswordAnswer1;
    }

    /**
     * Sets the value of the forgottenPasswordAnswer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForgottenPasswordAnswer1(String value) {
        this.forgottenPasswordAnswer1 = value;
    }

    /**
     * Gets the value of the forgottenPasswordAnswer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForgottenPasswordAnswer2() {
        return forgottenPasswordAnswer2;
    }

    /**
     * Sets the value of the forgottenPasswordAnswer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForgottenPasswordAnswer2(String value) {
        this.forgottenPasswordAnswer2 = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    /**
     * Gets the value of the newPasswordRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPasswordRepeat() {
        return newPasswordRepeat;
    }

    /**
     * Sets the value of the newPasswordRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPasswordRepeat(String value) {
        this.newPasswordRepeat = value;
    }

}
