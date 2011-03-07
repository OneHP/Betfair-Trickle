
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceBets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceBets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asianLineId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="betType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetTypeEnum"/>
 *         &lt;element name="betCategoryType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetCategoryTypeEnum"/>
 *         &lt;element name="betPersistenceType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetPersistenceTypeEnum"/>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="selectionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bspLiability" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceBets", propOrder = {
    "asianLineId",
    "betType",
    "betCategoryType",
    "betPersistenceType",
    "marketId",
    "price",
    "selectionId",
    "size",
    "bspLiability"
})
public class PlaceBets {

    protected int asianLineId;
    @XmlElement(required = true)
    protected BetTypeEnum betType;
    @XmlElement(required = true)
    protected BetCategoryTypeEnum betCategoryType;
    @XmlElement(required = true)
    protected BetPersistenceTypeEnum betPersistenceType;
    protected int marketId;
    protected double price;
    protected int selectionId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double size;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double bspLiability;

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
     * Gets the value of the betType property.
     * 
     * @return
     *     possible object is
     *     {@link BetTypeEnum }
     *     
     */
    public BetTypeEnum getBetType() {
        return betType;
    }

    /**
     * Sets the value of the betType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetTypeEnum }
     *     
     */
    public void setBetType(BetTypeEnum value) {
        this.betType = value;
    }

    /**
     * Gets the value of the betCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link BetCategoryTypeEnum }
     *     
     */
    public BetCategoryTypeEnum getBetCategoryType() {
        return betCategoryType;
    }

    /**
     * Sets the value of the betCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetCategoryTypeEnum }
     *     
     */
    public void setBetCategoryType(BetCategoryTypeEnum value) {
        this.betCategoryType = value;
    }

    /**
     * Gets the value of the betPersistenceType property.
     * 
     * @return
     *     possible object is
     *     {@link BetPersistenceTypeEnum }
     *     
     */
    public BetPersistenceTypeEnum getBetPersistenceType() {
        return betPersistenceType;
    }

    /**
     * Sets the value of the betPersistenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetPersistenceTypeEnum }
     *     
     */
    public void setBetPersistenceType(BetPersistenceTypeEnum value) {
        this.betPersistenceType = value;
    }

    /**
     * Gets the value of the marketId property.
     * 
     */
    public int getMarketId() {
        return marketId;
    }

    /**
     * Sets the value of the marketId property.
     * 
     */
    public void setMarketId(int value) {
        this.marketId = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
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

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSize(Double value) {
        this.size = value;
    }

    /**
     * Gets the value of the bspLiability property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBspLiability() {
        return bspLiability;
    }

    /**
     * Sets the value of the bspLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBspLiability(Double value) {
        this.bspLiability = value;
    }

}
