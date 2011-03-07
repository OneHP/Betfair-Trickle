
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetLite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BetLite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="betId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matchedSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="remainingSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="betStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetStatusEnum"/>
 *         &lt;element name="betCategoryType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetCategoryTypeEnum"/>
 *         &lt;element name="betPersistenceType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetPersistenceTypeEnum"/>
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
@XmlType(name = "BetLite", propOrder = {
    "betId",
    "marketId",
    "matchedSize",
    "remainingSize",
    "betStatus",
    "betCategoryType",
    "betPersistenceType",
    "bspLiability"
})
public class BetLite {

    protected long betId;
    protected int marketId;
    protected double matchedSize;
    protected double remainingSize;
    @XmlElement(required = true)
    protected BetStatusEnum betStatus;
    @XmlElement(required = true)
    protected BetCategoryTypeEnum betCategoryType;
    @XmlElement(required = true)
    protected BetPersistenceTypeEnum betPersistenceType;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double bspLiability;

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
     * Gets the value of the matchedSize property.
     * 
     */
    public double getMatchedSize() {
        return matchedSize;
    }

    /**
     * Sets the value of the matchedSize property.
     * 
     */
    public void setMatchedSize(double value) {
        this.matchedSize = value;
    }

    /**
     * Gets the value of the remainingSize property.
     * 
     */
    public double getRemainingSize() {
        return remainingSize;
    }

    /**
     * Sets the value of the remainingSize property.
     * 
     */
    public void setRemainingSize(double value) {
        this.remainingSize = value;
    }

    /**
     * Gets the value of the betStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BetStatusEnum }
     *     
     */
    public BetStatusEnum getBetStatus() {
        return betStatus;
    }

    /**
     * Sets the value of the betStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetStatusEnum }
     *     
     */
    public void setBetStatus(BetStatusEnum value) {
        this.betStatus = value;
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
