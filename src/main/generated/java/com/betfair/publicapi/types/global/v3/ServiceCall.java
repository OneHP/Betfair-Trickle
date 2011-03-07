
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ServiceCall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCall">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxUsages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="periodExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="serviceType" type="{http://www.betfair.com/publicapi/types/global/v3/}ServiceEnum"/>
 *         &lt;element name="usageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCall", propOrder = {
    "maxUsages",
    "period",
    "periodExpiry",
    "serviceType",
    "usageCount"
})
public class ServiceCall {

    protected int maxUsages;
    protected long period;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodExpiry;
    @XmlElement(required = true)
    protected ServiceEnum serviceType;
    protected int usageCount;

    /**
     * Gets the value of the maxUsages property.
     * 
     */
    public int getMaxUsages() {
        return maxUsages;
    }

    /**
     * Sets the value of the maxUsages property.
     * 
     */
    public void setMaxUsages(int value) {
        this.maxUsages = value;
    }

    /**
     * Gets the value of the period property.
     * 
     */
    public long getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     */
    public void setPeriod(long value) {
        this.period = value;
    }

    /**
     * Gets the value of the periodExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodExpiry() {
        return periodExpiry;
    }

    /**
     * Sets the value of the periodExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodExpiry(XMLGregorianCalendar value) {
        this.periodExpiry = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEnum }
     *     
     */
    public ServiceEnum getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEnum }
     *     
     */
    public void setServiceType(ServiceEnum value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the usageCount property.
     * 
     */
    public int getUsageCount() {
        return usageCount;
    }

    /**
     * Sets the value of the usageCount property.
     * 
     */
    public void setUsageCount(int value) {
        this.usageCount = value;
    }

}
