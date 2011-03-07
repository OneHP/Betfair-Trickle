
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketDisplayDetailV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketDisplayDetailV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="racingSilks" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfRacingSilkV2"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketDisplayErrorEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketDisplayDetailV2", propOrder = {
    "marketId",
    "racingSilks",
    "errorCode"
})
public class MarketDisplayDetailV2 {

    protected int marketId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRacingSilkV2 racingSilks;
    @XmlElement(required = true)
    protected MarketDisplayErrorEnum errorCode;

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
     * Gets the value of the racingSilks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRacingSilkV2 }
     *     
     */
    public ArrayOfRacingSilkV2 getRacingSilks() {
        return racingSilks;
    }

    /**
     * Sets the value of the racingSilks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRacingSilkV2 }
     *     
     */
    public void setRacingSilks(ArrayOfRacingSilkV2 value) {
        this.racingSilks = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link MarketDisplayErrorEnum }
     *     
     */
    public MarketDisplayErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketDisplayErrorEnum }
     *     
     */
    public void setErrorCode(MarketDisplayErrorEnum value) {
        this.errorCode = value;
    }

}
