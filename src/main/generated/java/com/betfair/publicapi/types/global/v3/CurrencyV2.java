
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyV2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}Currency">
 *       &lt;sequence>
 *         &lt;element name="minimumStake" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minimumRangeStake" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minimumBSPLayLiability" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyV2", propOrder = {
    "minimumStake",
    "minimumRangeStake",
    "minimumBSPLayLiability"
})
public class CurrencyV2
    extends Currency
{

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double minimumStake;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double minimumRangeStake;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double minimumBSPLayLiability;

    /**
     * Gets the value of the minimumStake property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumStake() {
        return minimumStake;
    }

    /**
     * Sets the value of the minimumStake property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumStake(Double value) {
        this.minimumStake = value;
    }

    /**
     * Gets the value of the minimumRangeStake property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumRangeStake() {
        return minimumRangeStake;
    }

    /**
     * Sets the value of the minimumRangeStake property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumRangeStake(Double value) {
        this.minimumRangeStake = value;
    }

    /**
     * Gets the value of the minimumBSPLayLiability property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumBSPLayLiability() {
        return minimumBSPLayLiability;
    }

    /**
     * Sets the value of the minimumBSPLayLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumBSPLayLiability(Double value) {
        this.minimumBSPLayLiability = value;
    }

}
