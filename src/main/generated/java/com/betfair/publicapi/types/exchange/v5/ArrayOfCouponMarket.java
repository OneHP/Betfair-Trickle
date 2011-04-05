
package com.betfair.publicapi.types.exchange.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCouponMarket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCouponMarket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CouponMarket" type="{http://www.betfair.com/publicapi/types/exchange/v5/}CouponMarket" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCouponMarket", propOrder = {
    "couponMarket"
})
public class ArrayOfCouponMarket {

    @XmlElement(name = "CouponMarket", namespace = "http://www.betfair.com/publicapi/types/exchange/v5/", nillable = true)
    protected List<CouponMarket> couponMarket;

    /**
     * Gets the value of the couponMarket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponMarket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponMarket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponMarket }
     * 
     * 
     */
    public List<CouponMarket> getCouponMarket() {
        if (couponMarket == null) {
            couponMarket = new ArrayList<CouponMarket>();
        }
        return this.couponMarket;
    }

}
