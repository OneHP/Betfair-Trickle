
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="couponId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="couponName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponLink", propOrder = {
    "couponId",
    "couponName"
})
public class CouponLink {

    protected int couponId;
    @XmlElement(required = true, nillable = true)
    protected String couponName;

    /**
     * Gets the value of the couponId property.
     * 
     */
    public int getCouponId() {
        return couponId;
    }

    /**
     * Sets the value of the couponId property.
     * 
     */
    public void setCouponId(int value) {
        this.couponId = value;
    }

    /**
     * Gets the value of the couponName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * Sets the value of the couponName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponName(String value) {
        this.couponName = value;
    }

}
