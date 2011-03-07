
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateBets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateBets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="betId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="newPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="newSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="oldPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="oldSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="oldBetPersistenceType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetPersistenceTypeEnum"/>
 *         &lt;element name="newBetPersistenceType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetPersistenceTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBets", propOrder = {
    "betId",
    "newPrice",
    "newSize",
    "oldPrice",
    "oldSize",
    "oldBetPersistenceType",
    "newBetPersistenceType"
})
public class UpdateBets {

    protected long betId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double newPrice;
    protected double newSize;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double oldPrice;
    protected double oldSize;
    @XmlElement(required = true)
    protected BetPersistenceTypeEnum oldBetPersistenceType;
    @XmlElement(required = true)
    protected BetPersistenceTypeEnum newBetPersistenceType;

    /**
     * Gets the value of the betId property.
     * 
     */
    public long getBetId() {
        return betId;
    }

    /**
     * Sets the value of the betId property.
     * 
     */
    public void setBetId(long value) {
        this.betId = value;
    }

    /**
     * Gets the value of the newPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNewPrice() {
        return newPrice;
    }

    /**
     * Sets the value of the newPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNewPrice(Double value) {
        this.newPrice = value;
    }

    /**
     * Gets the value of the newSize property.
     * 
     */
    public double getNewSize() {
        return newSize;
    }

    /**
     * Sets the value of the newSize property.
     * 
     */
    public void setNewSize(double value) {
        this.newSize = value;
    }

    /**
     * Gets the value of the oldPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOldPrice() {
        return oldPrice;
    }

    /**
     * Sets the value of the oldPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOldPrice(Double value) {
        this.oldPrice = value;
    }

    /**
     * Gets the value of the oldSize property.
     * 
     */
    public double getOldSize() {
        return oldSize;
    }

    /**
     * Sets the value of the oldSize property.
     * 
     */
    public void setOldSize(double value) {
        this.oldSize = value;
    }

    /**
     * Gets the value of the oldBetPersistenceType property.
     * 
     * @return
     *     possible object is
     *     {@link BetPersistenceTypeEnum }
     *     
     */
    public BetPersistenceTypeEnum getOldBetPersistenceType() {
        return oldBetPersistenceType;
    }

    /**
     * Sets the value of the oldBetPersistenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetPersistenceTypeEnum }
     *     
     */
    public void setOldBetPersistenceType(BetPersistenceTypeEnum value) {
        this.oldBetPersistenceType = value;
    }

    /**
     * Gets the value of the newBetPersistenceType property.
     * 
     * @return
     *     possible object is
     *     {@link BetPersistenceTypeEnum }
     *     
     */
    public BetPersistenceTypeEnum getNewBetPersistenceType() {
        return newBetPersistenceType;
    }

    /**
     * Sets the value of the newBetPersistenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetPersistenceTypeEnum }
     *     
     */
    public void setNewBetPersistenceType(BetPersistenceTypeEnum value) {
        this.newBetPersistenceType = value;
    }

}
