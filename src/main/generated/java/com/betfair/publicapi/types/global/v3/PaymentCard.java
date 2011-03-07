
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nickName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardShortNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="issueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardType" type="{http://www.betfair.com/publicapi/types/global/v3/}CardTypeEnum"/>
 *         &lt;element name="issuingCountryIso3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalDeposits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalWithdrawals" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="netDeposits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="validationStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingAddress3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingAddress4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="town" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingCountryIso3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardStatus" type="{http://www.betfair.com/publicapi/types/global/v3/}PaymentCardStatusEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard", propOrder = {
    "nickName",
    "cardShortNumber",
    "expiryDate",
    "startDate",
    "issueNumber",
    "cardType",
    "issuingCountryIso3",
    "totalDeposits",
    "totalWithdrawals",
    "netDeposits",
    "validationStatus",
    "billingName",
    "billingAddress1",
    "billingAddress2",
    "billingAddress3",
    "billingAddress4",
    "town",
    "county",
    "postcode",
    "billingCountryIso3",
    "cardStatus"
})
public class PaymentCard {

    @XmlElement(required = true)
    protected String nickName;
    @XmlElement(required = true)
    protected String cardShortNumber;
    @XmlElement(required = true)
    protected String expiryDate;
    @XmlElement(required = true, nillable = true)
    protected String startDate;
    @XmlElement(required = true, nillable = true)
    protected String issueNumber;
    @XmlElement(required = true)
    protected CardTypeEnum cardType;
    @XmlElement(required = true, nillable = true)
    protected String issuingCountryIso3;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double totalDeposits;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double totalWithdrawals;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double netDeposits;
    @XmlElement(required = true, nillable = true)
    protected String validationStatus;
    @XmlElement(required = true)
    protected String billingName;
    @XmlElement(required = true, nillable = true)
    protected String billingAddress1;
    @XmlElement(required = true, nillable = true)
    protected String billingAddress2;
    @XmlElement(required = true, nillable = true)
    protected String billingAddress3;
    @XmlElement(required = true, nillable = true)
    protected String billingAddress4;
    @XmlElement(required = true, nillable = true)
    protected String town;
    @XmlElement(required = true, nillable = true)
    protected String county;
    @XmlElement(required = true, nillable = true)
    protected String postcode;
    @XmlElement(required = true, nillable = true)
    protected String billingCountryIso3;
    @XmlElement(required = true)
    protected PaymentCardStatusEnum cardStatus;

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
     * Gets the value of the cardShortNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardShortNumber() {
        return cardShortNumber;
    }

    /**
     * Sets the value of the cardShortNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardShortNumber(String value) {
        this.cardShortNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link CardTypeEnum }
     *     
     */
    public CardTypeEnum getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTypeEnum }
     *     
     */
    public void setCardType(CardTypeEnum value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the issuingCountryIso3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingCountryIso3() {
        return issuingCountryIso3;
    }

    /**
     * Sets the value of the issuingCountryIso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingCountryIso3(String value) {
        this.issuingCountryIso3 = value;
    }

    /**
     * Gets the value of the totalDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalDeposits() {
        return totalDeposits;
    }

    /**
     * Sets the value of the totalDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalDeposits(Double value) {
        this.totalDeposits = value;
    }

    /**
     * Gets the value of the totalWithdrawals property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalWithdrawals() {
        return totalWithdrawals;
    }

    /**
     * Sets the value of the totalWithdrawals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalWithdrawals(Double value) {
        this.totalWithdrawals = value;
    }

    /**
     * Gets the value of the netDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetDeposits() {
        return netDeposits;
    }

    /**
     * Sets the value of the netDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetDeposits(Double value) {
        this.netDeposits = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationStatus(String value) {
        this.validationStatus = value;
    }

    /**
     * Gets the value of the billingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingName() {
        return billingName;
    }

    /**
     * Sets the value of the billingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingName(String value) {
        this.billingName = value;
    }

    /**
     * Gets the value of the billingAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress1() {
        return billingAddress1;
    }

    /**
     * Sets the value of the billingAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress1(String value) {
        this.billingAddress1 = value;
    }

    /**
     * Gets the value of the billingAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress2() {
        return billingAddress2;
    }

    /**
     * Sets the value of the billingAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress2(String value) {
        this.billingAddress2 = value;
    }

    /**
     * Gets the value of the billingAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress3() {
        return billingAddress3;
    }

    /**
     * Sets the value of the billingAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress3(String value) {
        this.billingAddress3 = value;
    }

    /**
     * Gets the value of the billingAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress4() {
        return billingAddress4;
    }

    /**
     * Sets the value of the billingAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress4(String value) {
        this.billingAddress4 = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the billingCountryIso3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCountryIso3() {
        return billingCountryIso3;
    }

    /**
     * Sets the value of the billingCountryIso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCountryIso3(String value) {
        this.billingCountryIso3 = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardStatusEnum }
     *     
     */
    public PaymentCardStatusEnum getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardStatusEnum }
     *     
     */
    public void setCardStatus(PaymentCardStatusEnum value) {
        this.cardStatus = value;
    }

}
