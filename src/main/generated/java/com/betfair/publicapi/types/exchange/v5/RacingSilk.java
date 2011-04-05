
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RacingSilk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RacingSilk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="silksURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="silksText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ageWeight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="form" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="daysSince" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jockeyClaim" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wearing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saddleCloth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stallDraw" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RacingSilk", propOrder = {
    "selectionId",
    "silksURL",
    "silksText",
    "trainerName",
    "ageWeight",
    "form",
    "daysSince",
    "jockeyClaim",
    "wearing",
    "saddleCloth",
    "stallDraw"
})
@XmlSeeAlso({
    RacingSilkV2 .class
})
public class RacingSilk {

    protected int selectionId;
    @XmlElement(required = true, nillable = true)
    protected String silksURL;
    @XmlElement(required = true, nillable = true)
    protected String silksText;
    @XmlElement(required = true, nillable = true)
    protected String trainerName;
    @XmlElement(required = true, nillable = true)
    protected String ageWeight;
    @XmlElement(required = true, nillable = true)
    protected String form;
    protected int daysSince;
    protected int jockeyClaim;
    @XmlElement(required = true, nillable = true)
    protected String wearing;
    protected int saddleCloth;
    protected int stallDraw;

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

    /**
     * Gets the value of the silksURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilksURL() {
        return silksURL;
    }

    /**
     * Sets the value of the silksURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilksURL(String value) {
        this.silksURL = value;
    }

    /**
     * Gets the value of the silksText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilksText() {
        return silksText;
    }

    /**
     * Sets the value of the silksText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilksText(String value) {
        this.silksText = value;
    }

    /**
     * Gets the value of the trainerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainerName() {
        return trainerName;
    }

    /**
     * Sets the value of the trainerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainerName(String value) {
        this.trainerName = value;
    }

    /**
     * Gets the value of the ageWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeWeight() {
        return ageWeight;
    }

    /**
     * Sets the value of the ageWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeWeight(String value) {
        this.ageWeight = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm(String value) {
        this.form = value;
    }

    /**
     * Gets the value of the daysSince property.
     * 
     */
    public int getDaysSince() {
        return daysSince;
    }

    /**
     * Sets the value of the daysSince property.
     * 
     */
    public void setDaysSince(int value) {
        this.daysSince = value;
    }

    /**
     * Gets the value of the jockeyClaim property.
     * 
     */
    public int getJockeyClaim() {
        return jockeyClaim;
    }

    /**
     * Sets the value of the jockeyClaim property.
     * 
     */
    public void setJockeyClaim(int value) {
        this.jockeyClaim = value;
    }

    /**
     * Gets the value of the wearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWearing() {
        return wearing;
    }

    /**
     * Sets the value of the wearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWearing(String value) {
        this.wearing = value;
    }

    /**
     * Gets the value of the saddleCloth property.
     * 
     */
    public int getSaddleCloth() {
        return saddleCloth;
    }

    /**
     * Sets the value of the saddleCloth property.
     * 
     */
    public void setSaddleCloth(int value) {
        this.saddleCloth = value;
    }

    /**
     * Gets the value of the stallDraw property.
     * 
     */
    public int getStallDraw() {
        return stallDraw;
    }

    /**
     * Sets the value of the stallDraw property.
     * 
     */
    public void setStallDraw(int value) {
        this.stallDraw = value;
    }

}
