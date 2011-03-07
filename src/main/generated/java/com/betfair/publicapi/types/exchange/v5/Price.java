
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Price complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Price">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountAvailable" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="betType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetTypeEnum"/>
 *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price", propOrder = {
    "amountAvailable",
    "betType",
    "depth",
    "price"
})
public class Price {

    protected double amountAvailable;
    @XmlElement(required = true)
    protected BetTypeEnum betType;
    protected int depth;
    protected double price;

    /**
     * Gets the value of the amountAvailable property.
     * 
     */
    public double getAmountAvailable() {
        return amountAvailable;
    }

    /**
     * Sets the value of the amountAvailable property.
     * 
     */
    public void setAmountAvailable(double value) {
        this.amountAvailable = value;
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
     * Gets the value of the depth property.
     * 
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     */
    public void setDepth(int value) {
        this.depth = value;
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

}
