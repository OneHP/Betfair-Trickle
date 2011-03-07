
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MatchLite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchLite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="betStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetStatusEnum"/>
 *         &lt;element name="matchedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="priceMatched" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sizeMatched" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchLite", propOrder = {
    "betStatus",
    "matchedDate",
    "priceMatched",
    "sizeMatched",
    "transactionId"
})
public class MatchLite {

    @XmlElement(required = true)
    protected BetStatusEnum betStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matchedDate;
    protected double priceMatched;
    protected double sizeMatched;
    protected long transactionId;

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

}
