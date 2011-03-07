
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateBetsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateBetsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="betId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="newBetId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sizeCancelled" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="newSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="newPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="resultCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}UpdateBetsResultEnum"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBetsResult", propOrder = {
    "betId",
    "newBetId",
    "sizeCancelled",
    "newSize",
    "newPrice",
    "resultCode",
    "success"
})
public class UpdateBetsResult {

    protected long betId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long newBetId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double sizeCancelled;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double newSize;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double newPrice;
    @XmlElement(required = true)
    protected UpdateBetsResultEnum resultCode;
    protected boolean success;

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
     * Gets the value of the newBetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewBetId() {
        return newBetId;
    }

    /**
     * Sets the value of the newBetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewBetId(Long value) {
        this.newBetId = value;
    }

    /**
     * Gets the value of the sizeCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSizeCancelled() {
        return sizeCancelled;
    }

    /**
     * Sets the value of the sizeCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSizeCancelled(Double value) {
        this.sizeCancelled = value;
    }

    /**
     * Gets the value of the newSize property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNewSize() {
        return newSize;
    }

    /**
     * Sets the value of the newSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNewSize(Double value) {
        this.newSize = value;
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
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateBetsResultEnum }
     *     
     */
    public UpdateBetsResultEnum getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateBetsResultEnum }
     *     
     */
    public void setResultCode(UpdateBetsResultEnum value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

}
