
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Match complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Match">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="betStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetStatusEnum"/>
 *         &lt;element name="matchedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="priceMatched" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="profitLoss" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="settledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sizeMatched" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="voidedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Match", propOrder = {
    "betStatus",
    "matchedDate",
    "priceMatched",
    "profitLoss",
    "settledDate",
    "sizeMatched",
    "transactionId",
    "voidedDate"
})
public class Match {

    @XmlElement(required = true)
    protected BetStatusEnum betStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matchedDate;
    protected double priceMatched;
    protected double profitLoss;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settledDate;
    protected double sizeMatched;
    protected long transactionId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voidedDate;

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
     * Gets the value of the matchedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatchedDate() {
        return matchedDate;
    }

    /**
     * Sets the value of the matchedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatchedDate(XMLGregorianCalendar value) {
        this.matchedDate = value;
    }

    /**
     * Gets the value of the priceMatched property.
     * 
     */
    public double getPriceMatched() {
        return priceMatched;
    }

    /**
     * Sets the value of the priceMatched property.
     * 
     */
    public void setPriceMatched(double value) {
        this.priceMatched = value;
    }

    /**
     * Gets the value of the profitLoss property.
     * 
     */
    public double getProfitLoss() {
        return profitLoss;
    }

    /**
     * Sets the value of the profitLoss property.
     * 
     */
    public void setProfitLoss(double value) {
        this.profitLoss = value;
    }

    /**
     * Gets the value of the settledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettledDate() {
        return settledDate;
    }

    /**
     * Sets the value of the settledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettledDate(XMLGregorianCalendar value) {
        this.settledDate = value;
    }

    /**
     * Gets the value of the sizeMatched property.
     * 
     */
    public double getSizeMatched() {
        return sizeMatched;
    }

    /**
     * Sets the value of the sizeMatched property.
     * 
     */
    public void setSizeMatched(double value) {
        this.sizeMatched = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(long value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the voidedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVoidedDate() {
        return voidedDate;
    }

    /**
     * Sets the value of the voidedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVoidedDate(XMLGregorianCalendar value) {
        this.voidedDate = value;
    }

}
