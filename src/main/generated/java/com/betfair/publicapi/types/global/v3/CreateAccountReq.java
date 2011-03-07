
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreateAccountReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAccountReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="acceptedPrivicyPolicyVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="acceptedTermsAndConditionsVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accountType" type="{http://www.betfair.com/publicapi/types/global/v3/}AccountTypeEnum"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="answer1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="answer2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="browser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countyState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="depositLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="depositLimitFrequency" type="{http://www.betfair.com/publicapi/types/global/v3/}GamcareLimitFreqEnum"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{http://www.betfair.com/publicapi/types/global/v3/}GenderEnum"/>
 *         &lt;element name="homeTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informProductsServices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="informSpecialOffers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lossLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lossLimitFrequency" type="{http://www.betfair.com/publicapi/types/global/v3/}GamcareLimitFreqEnum"/>
 *         &lt;element name="manualAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mobileTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preferredName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="question1" type="{http://www.betfair.com/publicapi/types/global/v3/}SecurityQuestion1Enum"/>
 *         &lt;element name="question2" type="{http://www.betfair.com/publicapi/types/global/v3/}SecurityQuestion2Enum"/>
 *         &lt;element name="referrerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="region" type="{http://www.betfair.com/publicapi/types/global/v3/}RegionEnum"/>
 *         &lt;element name="subPartnerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="superPartnerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.betfair.com/publicapi/types/global/v3/}TitleEnum"/>
 *         &lt;element name="townCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAccountReq", propOrder = {
    "acceptedPrivicyPolicyVersion",
    "acceptedTermsAndConditionsVersion",
    "accountType",
    "address1",
    "address2",
    "address3",
    "answer1",
    "answer2",
    "browser",
    "countryOfResidence",
    "countyState",
    "currency",
    "dateOfBirth",
    "depositLimit",
    "depositLimitFrequency",
    "emailAddress",
    "firstName",
    "gender",
    "homeTelephone",
    "informProductsServices",
    "informSpecialOffers",
    "ipAddress",
    "locale",
    "lossLimit",
    "lossLimitFrequency",
    "manualAddress",
    "mobileTelephone",
    "partnerId",
    "password",
    "postCode",
    "preferredName",
    "productId",
    "question1",
    "question2",
    "referrerCode",
    "region",
    "subPartnerId",
    "superPartnerId",
    "surname",
    "timeZone",
    "title",
    "townCity",
    "username",
    "workTelephone"
})
public class CreateAccountReq
    extends APIRequest
{

    protected int acceptedPrivicyPolicyVersion;
    protected int acceptedTermsAndConditionsVersion;
    @XmlElement(required = true)
    protected AccountTypeEnum accountType;
    @XmlElement(required = true)
    protected String address1;
    @XmlElement(required = true, nillable = true)
    protected String address2;
    @XmlElement(required = true, nillable = true)
    protected String address3;
    @XmlElement(required = true)
    protected String answer1;
    @XmlElement(required = true)
    protected String answer2;
    @XmlElement(required = true, nillable = true)
    protected String browser;
    @XmlElement(required = true, nillable = true)
    protected String countryOfResidence;
    @XmlElement(required = true, nillable = true)
    protected String countyState;
    @XmlElement(required = true, nillable = true)
    protected String currency;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected double depositLimit;
    @XmlElement(required = true)
    protected GamcareLimitFreqEnum depositLimitFrequency;
    @XmlElement(required = true)
    protected String emailAddress;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected GenderEnum gender;
    @XmlElement(required = true)
    protected String homeTelephone;
    protected boolean informProductsServices;
    protected boolean informSpecialOffers;
    @XmlElement(required = true)
    protected String ipAddress;
    @XmlElement(required = true, nillable = true)
    protected String locale;
    protected double lossLimit;
    @XmlElement(required = true)
    protected GamcareLimitFreqEnum lossLimitFrequency;
    protected boolean manualAddress;
    @XmlElement(required = true)
    protected String mobileTelephone;
    protected int partnerId;
    @XmlElement(required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String postCode;
    @XmlElement(required = true, nillable = true)
    protected String preferredName;
    protected int productId;
    @XmlElement(required = true)
    protected SecurityQuestion1Enum question1;
    @XmlElement(required = true)
    protected SecurityQuestion2Enum question2;
    @XmlElement(required = true, nillable = true)
    protected String referrerCode;
    @XmlElement(required = true)
    protected RegionEnum region;
    protected int subPartnerId;
    protected int superPartnerId;
    @XmlElement(required = true)
    protected String surname;
    @XmlElement(required = true, nillable = true)
    protected String timeZone;
    @XmlElement(required = true)
    protected TitleEnum title;
    @XmlElement(required = true)
    protected String townCity;
    @XmlElement(required = true, nillable = true)
    protected String username;
    @XmlElement(required = true, nillable = true)
    protected String workTelephone;

    /**
     * Gets the value of the acceptedPrivicyPolicyVersion property.
     * 
     */
    public int getAcceptedPrivicyPolicyVersion() {
        return acceptedPrivicyPolicyVersion;
    }

    /**
     * Sets the value of the acceptedPrivicyPolicyVersion property.
     * 
     */
    public void setAcceptedPrivicyPolicyVersion(int value) {
        this.acceptedPrivicyPolicyVersion = value;
    }

    /**
     * Gets the value of the acceptedTermsAndConditionsVersion property.
     * 
     */
    public int getAcceptedTermsAndConditionsVersion() {
        return acceptedTermsAndConditionsVersion;
    }

    /**
     * Sets the value of the acceptedTermsAndConditionsVersion property.
     * 
     */
    public void setAcceptedTermsAndConditionsVersion(int value) {
        this.acceptedTermsAndConditionsVersion = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeEnum }
     *     
     */
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeEnum }
     *     
     */
    public void setAccountType(AccountTypeEnum value) {
        this.accountType = value;
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
     * Gets the value of the answer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer1() {
        return answer1;
    }

    /**
     * Sets the value of the answer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer1(String value) {
        this.answer1 = value;
    }

    /**
     * Gets the value of the answer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer2() {
        return answer2;
    }

    /**
     * Sets the value of the answer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer2(String value) {
        this.answer2 = value;
    }

    /**
     * Gets the value of the browser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * Sets the value of the browser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowser(String value) {
        this.browser = value;
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
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the depositLimit property.
     * 
     */
    public double getDepositLimit() {
        return depositLimit;
    }

    /**
     * Sets the value of the depositLimit property.
     * 
     */
    public void setDepositLimit(double value) {
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderEnum }
     *     
     */
    public GenderEnum getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderEnum }
     *     
     */
    public void setGender(GenderEnum value) {
        this.gender = value;
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
     * Gets the value of the informProductsServices property.
     * 
     */
    public boolean isInformProductsServices() {
        return informProductsServices;
    }

    /**
     * Sets the value of the informProductsServices property.
     * 
     */
    public void setInformProductsServices(boolean value) {
        this.informProductsServices = value;
    }

    /**
     * Gets the value of the informSpecialOffers property.
     * 
     */
    public boolean isInformSpecialOffers() {
        return informSpecialOffers;
    }

    /**
     * Sets the value of the informSpecialOffers property.
     * 
     */
    public void setInformSpecialOffers(boolean value) {
        this.informSpecialOffers = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the lossLimit property.
     * 
     */
    public double getLossLimit() {
        return lossLimit;
    }

    /**
     * Sets the value of the lossLimit property.
     * 
     */
    public void setLossLimit(double value) {
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

    /**
     * Gets the value of the manualAddress property.
     * 
     */
    public boolean isManualAddress() {
        return manualAddress;
    }

    /**
     * Sets the value of the manualAddress property.
     * 
     */
    public void setManualAddress(boolean value) {
        this.manualAddress = value;
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
     * Gets the value of the partnerId property.
     * 
     */
    public int getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     */
    public void setPartnerId(int value) {
        this.partnerId = value;
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
     * Gets the value of the preferredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredName() {
        return preferredName;
    }

    /**
     * Sets the value of the preferredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredName(String value) {
        this.preferredName = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(int value) {
        this.productId = value;
    }

    /**
     * Gets the value of the question1 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityQuestion1Enum }
     *     
     */
    public SecurityQuestion1Enum getQuestion1() {
        return question1;
    }

    /**
     * Sets the value of the question1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityQuestion1Enum }
     *     
     */
    public void setQuestion1(SecurityQuestion1Enum value) {
        this.question1 = value;
    }

    /**
     * Gets the value of the question2 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityQuestion2Enum }
     *     
     */
    public SecurityQuestion2Enum getQuestion2() {
        return question2;
    }

    /**
     * Sets the value of the question2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityQuestion2Enum }
     *     
     */
    public void setQuestion2(SecurityQuestion2Enum value) {
        this.question2 = value;
    }

    /**
     * Gets the value of the referrerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferrerCode() {
        return referrerCode;
    }

    /**
     * Sets the value of the referrerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferrerCode(String value) {
        this.referrerCode = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link RegionEnum }
     *     
     */
    public RegionEnum getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionEnum }
     *     
     */
    public void setRegion(RegionEnum value) {
        this.region = value;
    }

    /**
     * Gets the value of the subPartnerId property.
     * 
     */
    public int getSubPartnerId() {
        return subPartnerId;
    }

    /**
     * Sets the value of the subPartnerId property.
     * 
     */
    public void setSubPartnerId(int value) {
        this.subPartnerId = value;
    }

    /**
     * Gets the value of the superPartnerId property.
     * 
     */
    public int getSuperPartnerId() {
        return superPartnerId;
    }

    /**
     * Sets the value of the superPartnerId property.
     * 
     */
    public void setSuperPartnerId(int value) {
        this.superPartnerId = value;
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

}
