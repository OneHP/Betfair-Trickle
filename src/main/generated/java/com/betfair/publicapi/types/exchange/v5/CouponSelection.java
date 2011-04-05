
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponSelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponSelection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="runner" type="{http://www.betfair.com/publicapi/types/exchange/v5/}Runner"/>
 *         &lt;element name="backOdds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="layOdds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponSelection", propOrder = {
    "runner",
    "backOdds",
    "layOdds"
})
public class CouponSelection {

    @XmlElement(required = true)
    protected Runner runner;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double backOdds;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double layOdds;

    /**
     * Gets the value of the runner property.
     * 
     * @return
     *     possible object is
     *     {@link Runner }
     *     
     */
    public Runner getRunner() {
        return runner;
    }

    /**
     * Sets the value of the runner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Runner }
     *     
     */
    public void setRunner(Runner value) {
        this.runner = value;
    }

    /**
     * Gets the value of the backOdds property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBackOdds() {
        return backOdds;
    }

    /**
     * Sets the value of the backOdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBackOdds(Double value) {
        this.backOdds = value;
    }

    /**
     * Gets the value of the layOdds property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLayOdds() {
        return layOdds;
    }

    /**
     * Sets the value of the layOdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLayOdds(Double value) {
        this.layOdds = value;
    }

}
