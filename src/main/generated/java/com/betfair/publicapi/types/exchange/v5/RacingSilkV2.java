
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RacingSilkV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RacingSilkV2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}RacingSilk">
 *       &lt;sequence>
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jockeyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="colour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bred" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forecastPriceNumerator" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="forecastPriceDenominator" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="officialRating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sire" type="{http://www.betfair.com/publicapi/types/exchange/v5/}Breeding"/>
 *         &lt;element name="dam" type="{http://www.betfair.com/publicapi/types/exchange/v5/}Breeding"/>
 *         &lt;element name="damSire" type="{http://www.betfair.com/publicapi/types/exchange/v5/}Breeding"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RacingSilkV2", propOrder = {
    "ownerName",
    "jockeyName",
    "colour",
    "sex",
    "bred",
    "forecastPriceNumerator",
    "forecastPriceDenominator",
    "officialRating",
    "sire",
    "dam",
    "damSire"
})
public class RacingSilkV2
    extends RacingSilk
{

    @XmlElement(required = true, nillable = true)
    protected String ownerName;
    @XmlElement(required = true, nillable = true)
    protected String jockeyName;
    @XmlElement(required = true, nillable = true)
    protected String colour;
    @XmlElement(required = true, nillable = true)
    protected String sex;
    @XmlElement(required = true, nillable = true)
    protected String bred;
    protected int forecastPriceNumerator;
    protected int forecastPriceDenominator;
    protected int officialRating;
    @XmlElement(required = true, nillable = true)
    protected Breeding sire;
    @XmlElement(required = true, nillable = true)
    protected Breeding dam;
    @XmlElement(required = true, nillable = true)
    protected Breeding damSire;

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the jockeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJockeyName() {
        return jockeyName;
    }

    /**
     * Sets the value of the jockeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJockeyName(String value) {
        this.jockeyName = value;
    }

    /**
     * Gets the value of the colour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColour(String value) {
        this.colour = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
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
     * Gets the value of the forecastPriceNumerator property.
     * 
     */
    public int getForecastPriceNumerator() {
        return forecastPriceNumerator;
    }

    /**
     * Sets the value of the forecastPriceNumerator property.
     * 
     */
    public void setForecastPriceNumerator(int value) {
        this.forecastPriceNumerator = value;
    }

    /**
     * Gets the value of the forecastPriceDenominator property.
     * 
     */
    public int getForecastPriceDenominator() {
        return forecastPriceDenominator;
    }

    /**
     * Sets the value of the forecastPriceDenominator property.
     * 
     */
    public void setForecastPriceDenominator(int value) {
        this.forecastPriceDenominator = value;
    }

    /**
     * Gets the value of the officialRating property.
     * 
     */
    public int getOfficialRating() {
        return officialRating;
    }

    /**
     * Sets the value of the officialRating property.
     * 
     */
    public void setOfficialRating(int value) {
        this.officialRating = value;
    }

    /**
     * Gets the value of the sire property.
     * 
     * @return
     *     possible object is
     *     {@link Breeding }
     *     
     */
    public Breeding getSire() {
        return sire;
    }

    /**
     * Sets the value of the sire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breeding }
     *     
     */
    public void setSire(Breeding value) {
        this.sire = value;
    }

    /**
     * Gets the value of the dam property.
     * 
     * @return
     *     possible object is
     *     {@link Breeding }
     *     
     */
    public Breeding getDam() {
        return dam;
    }

    /**
     * Sets the value of the dam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breeding }
     *     
     */
    public void setDam(Breeding value) {
        this.dam = value;
    }

    /**
     * Gets the value of the damSire property.
     * 
     * @return
     *     possible object is
     *     {@link Breeding }
     *     
     */
    public Breeding getDamSire() {
        return damSire;
    }

    /**
     * Sets the value of the damSire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breeding }
     *     
     */
    public void setDamSire(Breeding value) {
        this.damSire = value;
    }

}
