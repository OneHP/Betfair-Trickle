
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ViewProfileResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewProfileResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/global/v3/}ViewProfileErrorEnum"/>
 *         &lt;element name="title" type="{http://www.betfair.com/publicapi/types/global/v3/}TitleEnum"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forumName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gamcareLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gamcareFrequency" type="{http://www.betfair.com/publicapi/types/global/v3/}GamcareLimitFreqEnum"/>
 *         &lt;element name="gamcareLossLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gamcareLossLimitFrequency" type="{http://www.betfair.com/publicapi/types/global/v3/}GamcareLimitFreqEnum"/>
 *         &lt;element name="gamcareUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewProfileResp", propOrder = {
    "minorErrorCode",
    "errorCode",
    "title",
    "firstName",
    "surname",
    "userName",
    "forumName",
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
    "currency",
    "gamcareLimit",
    "gamcareFrequency",
    "gamcareLossLimit",
    "gamcareLossLimitFrequency",
    "gamcareUpdateDate"
})
@XmlSeeAlso({
    ViewProfileV2Resp.class
})
public class ViewProfileResp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    @XmlElement(required = true)
    protected ViewProfileErrorEnum errorCode;
    @XmlElement(required = true)
    protected TitleEnum title;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String surname;
    @XmlElement(required = true, nillable = true)
    protected String userName;
    @XmlElement(required = true, nillable = true)
    protected String forumName;
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
    @XmlElement(required = true, nillable = true)
    protected String currency;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer gamcareLimit;
    @XmlElement(required = true)
    protected GamcareLimitFreqEnum gamcareFrequency;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer gamcareLossLimit;
    @XmlElement(required = true)
    protected GamcareLimitFreqEnum gamcareLossLimitFrequency;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gamcareUpdateDate;

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
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ViewProfileErrorEnum }
     *     
     */
    public ViewProfileErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewProfileErrorEnum }
     *     
     */
    public void setErrorCode(ViewProfileErrorEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link TitleEnum }
     *     
     */
    public TitleEnum getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleEnum }
     *     
     */
    public void setTitle(TitleEnum value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the forumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForumName() {
        return forumName;
    }

    /**
     * Sets the value of the forumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForumName(String value) {
        this.forumName = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the gamcareLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGamcareLimit() {
        return gamcareLimit;
    }

    /**
     * Sets the value of the gamcareLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGamcareLimit(Integer value) {
        this.gamcareLimit = value;
    }

    /**
     * Gets the value of the gamcareFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link GamcareLimitFreqEnum }
     *     
     */
    public GamcareLimitFreqEnum getGamcareFrequency() {
        return gamcareFrequency;
    }

    /**
     * Sets the value of the gamcareFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link GamcareLimitFreqEnum }
     *     
     */
    public void setGamcareFrequency(GamcareLimitFreqEnum value) {
        this.gamcareFrequency = value;
    }

    /**
     * Gets the value of the gamcareLossLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGamcareLossLimit() {
        return gamcareLossLimit;
    }

    /**
     * Sets the value of the gamcareLossLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGamcareLossLimit(Integer value) {
        this.gamcareLossLimit = value;
    }

    /**
     * Gets the value of the gamcareLossLimitFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link GamcareLimitFreqEnum }
     *     
     */
    public GamcareLimitFreqEnum getGamcareLossLimitFrequency() {
        return gamcareLossLimitFrequency;
    }

    /**
     * Sets the value of the gamcareLossLimitFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link GamcareLimitFreqEnum }
     *     
     */
    public void setGamcareLossLimitFrequency(GamcareLimitFreqEnum value) {
        this.gamcareLossLimitFrequency = value;
    }

    /**
     * Gets the value of the gamcareUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGamcareUpdateDate() {
        return gamcareUpdateDate;
    }

    /**
     * Sets the value of the gamcareUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGamcareUpdateDate(XMLGregorianCalendar value) {
        this.gamcareUpdateDate = value;
    }

}
