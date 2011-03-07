
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Breeding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Breeding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bred" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="yearBorn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Breeding", propOrder = {
    "name",
    "bred",
    "yearBorn"
})
public class Breeding {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String bred;
    @XmlElement(required = true, nillable = true)
    protected String yearBorn;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the bred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBred() {
        return bred;
    }

    /**
     * Sets the value of the bred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBred(String value) {
        this.bred = value;
    }

    /**
     * Gets the value of the yearBorn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearBorn() {
        return yearBorn;
    }

    /**
     * Sets the value of the yearBorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearBorn(String value) {
        this.yearBorn = value;
    }

}
