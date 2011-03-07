
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="townCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countyState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="homeTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobileTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="depositLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="depositLimitFrequency" type="{http://www.betfair.com/publicapi/types/global/v3/}GamcareLimitFreqEnum"/>
 *         &lt;element name="lossLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lossLimitFrequency" type="{http://www.betfair.com/publicapi/types/global/v3/}GamcareLimitFreqEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyProfileReq", propOrder = {
    "password",
    "address1",
    "address2",
    "address3",
    "townCity",
    "countyState",
    "postCode",
    "countryOfResidence",
    "homeTelephone",
    "workTelephone",
    "mobileTelephone",
    "emailAddress",
    "timeZone",
    "depositLimit",
    "depositLimitFrequency",
    "lossLimit",
    "lossLimitFrequency"
})
public class ModifyProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String address1;
    @XmlElement(required = true, nillable = true)
    protected String address2;
    @XmlElement(required = true, nillable = true)
    protected String address3;
    @XmlElement(required = true, nillable = true)
    protected String townCity;
    @XmlElement(required = true, nillable = true)
    protected String countyState;
    @XmlElement(required = true, nillable = true)
    protected String postCode;
    @XmlElement(required = true, nillable = true)
    protected String countryOfResidence;
    @XmlElement(required = true, nillable = true)
    protected String homeTelephone;
    @XmlElement(required = true, nillable = true)
    protected String workTelephone;
    @XmlElement(required = true, nillable = true)
    protected String mobileTelephone;
    @XmlElement(required = true, nillable = true)
    protected String emailAddress;
    @XmlElement(required = true, nillable = true)
    protected String timeZone;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer depositLimit;
    @XmlElement(required = true)
    protected GamcareLimitFreqEnum depositLimitFrequency;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer lossLimit;
    @XmlElement(required = true)
    protected GamcareLimitFreqEnum lossLimitFrequency;

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
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the townCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownCity() {
        return townCity;
    }

    /**
     * Sets the value of the townCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownCity(String value) {
        this.townCity = value;
    }

    /**
     * Gets the value of the countyState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyState() {
        return countyState;
    }

    /**
     * Sets the value of the countyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyState(String value) {
        this.countyState = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
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
     * Gets the value of the homeTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeTelephone() {
        return homeTelephone;
    }

    /**
     * Sets the value of the homeTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeTelephone(String value) {
        this.homeTelephone = value;
    }

    /**
     * Gets the value of the workTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTelephone() {
        return workTelephone;
    }

    /**
     * Sets the value of the workTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTelephone(String value) {
        this.workTelephone = value;
    }

    /**
     * Gets the value of the mobileTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileTelephone() {
        return mobileTelephone;
    }

    /**
     * Sets the value of the mobileTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileTelephone(String value) {
        this.mobileTelephone = value;
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
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the depositLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepositLimit() {
        return depositLimit;
    }

    /**
     * Sets the value of the depositLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepositLimit(Integer value) {
        this.depositLimit = value;
    }

    /**
     * Gets the value of the depositLimitFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link GamcareLimitFreqEnum }
     *     
     */
    public GamcareLimitFreqEnum getDepositLimitFrequency() {
        return depositLimitFrequency;
    }

    /**
     * Sets the value of the depositLimitFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link GamcareLimitFreqEnum }
     *     
     */
    public void setDepositLimitFrequency(GamcareLimitFreqEnum value) {
        this.depositLimitFrequency = value;
    }

    /**
     * Gets the value of the lossLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLossLimit() {
        return lossLimit;
    }

    /**
     * Sets the value of the lossLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLossLimit(Integer value) {
        this.lossLimit = value;
    }

    /**
     * Gets the value of the lossLimitFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link GamcareLimitFreqEnum }
     *     
     */
    public GamcareLimitFreqEnum getLossLimitFrequency() {
        return lossLimitFrequency;
    }

    /**
     * Sets the value of the lossLimitFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link GamcareLimitFreqEnum }
     *     
     */
    public void setLossLimitFrequency(GamcareLimitFreqEnum value) {
        this.lossLimitFrequency = value;
    }

}
