
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Runner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Runner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asianLineId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="handicap" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Runner", propOrder = {
    "asianLineId",
    "handicap",
    "name",
    "selectionId"
})
public class Runner {

    protected int asianLineId;
    protected double handicap;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected int selectionId;

    /**
     * Gets the value of the asianLineId property.
     * 
     */
    public int getAsianLineId() {
        return asianLineId;
    }

    /**
     * Sets the value of the asianLineId property.
     * 
     */
    public void setAsianLineId(int value) {
        this.asianLineId = value;
    }

    /**
     * Gets the value of the handicap property.
     * 
     */
    public double getHandicap() {
        return handicap;
    }

    /**
     * Sets the value of the handicap property.
     * 
     */
    public void setHandicap(double value) {
        this.handicap = value;
    }

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
     * Gets the value of the selectionId property.
     * 
     */
    public int getSelectionId() {
        return selectionId;
    }

    /**
     * Sets the value of the selectionId property.
     * 
     */
    public void setSelectionId(int value) {
        this.selectionId = value;
    }

}
