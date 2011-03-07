
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Subscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="billingPeriod" type="{http://www.betfair.com/publicapi/types/global/v3/}BillingPeriodEnum"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="services" type="{http://www.betfair.com/publicapi/types/global/v3/}ArrayOfServiceCall"/>
 *         &lt;element name="setupCharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="setupChargeActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="status" type="{http://www.betfair.com/publicapi/types/global/v3/}SubscriptionStatusEnum"/>
 *         &lt;element name="subscribedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="vatEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "billingAmount",
    "billingDate",
    "billingPeriod",
    "productId",
    "productName",
    "services",
    "setupCharge",
    "setupChargeActive",
    "status",
    "subscribedDate",
    "vatEnabled"
})
public class Subscription {

    protected double billingAmount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billingDate;
    @XmlElement(required = true)
    protected BillingPeriodEnum billingPeriod;
    protected int productId;
    @XmlElement(required = true, nillable = true)
    protected String productName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfServiceCall services;
    protected double setupCharge;
    protected boolean setupChargeActive;
    @XmlElement(required = true)
    protected SubscriptionStatusEnum status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subscribedDate;
    protected boolean vatEnabled;

    /**
     * Gets the value of the billingAmount property.
     * 
     */
    public double getBillingAmount() {
        return billingAmount;
    }

    /**
     * Sets the value of the billingAmount property.
     * 
     */
    public void setBillingAmount(double value) {
        this.billingAmount = value;
    }

    /**
     * Gets the value of the billingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillingDate(XMLGregorianCalendar value) {
        this.billingDate = value;
    }

    /**
     * Gets the value of the billingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BillingPeriodEnum }
     *     
     */
    public BillingPeriodEnum getBillingPeriod() {
        return billingPeriod;
    }

    /**
     * Sets the value of the billingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPeriodEnum }
     *     
     */
    public void setBillingPeriod(BillingPeriodEnum value) {
        this.billingPeriod = value;
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
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceCall }
     *     
     */
    public ArrayOfServiceCall getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceCall }
     *     
     */
    public void setServices(ArrayOfServiceCall value) {
        this.services = value;
    }

    /**
     * Gets the value of the setupCharge property.
     * 
     */
    public double getSetupCharge() {
        return setupCharge;
    }

    /**
     * Sets the value of the setupCharge property.
     * 
     */
    public void setSetupCharge(double value) {
        this.setupCharge = value;
    }

    /**
     * Gets the value of the setupChargeActive property.
     * 
     */
    public boolean isSetupChargeActive() {
        return setupChargeActive;
    }

    /**
     * Sets the value of the setupChargeActive property.
     * 
     */
    public void setSetupChargeActive(boolean value) {
        this.setupChargeActive = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionStatusEnum }
     *     
     */
    public SubscriptionStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionStatusEnum }
     *     
     */
    public void setStatus(SubscriptionStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the subscribedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscribedDate() {
        return subscribedDate;
    }

    /**
     * Sets the value of the subscribedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscribedDate(XMLGregorianCalendar value) {
        this.subscribedDate = value;
    }

    /**
     * Gets the value of the vatEnabled property.
     * 
     */
    public boolean isVatEnabled() {
        return vatEnabled;
    }

    /**
     * Sets the value of the vatEnabled property.
     * 
     */
    public void setVatEnabled(boolean value) {
        this.vatEnabled = value;
    }

}
