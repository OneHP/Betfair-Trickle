
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunnerPrices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunnerPrices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asianLineId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bestPricesToBack" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfPrice"/>
 *         &lt;element name="bestPricesToLay" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfPrice"/>
 *         &lt;element name="handicap" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lastPriceMatched" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reductionFactor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="selectionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sortOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalAmountMatched" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vacant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="farBSP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nearBSP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="actualBSP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunnerPrices", propOrder = {
    "asianLineId",
    "bestPricesToBack",
    "bestPricesToLay",
    "handicap",
    "lastPriceMatched",
    "reductionFactor",
    "selectionId",
    "sortOrder",
    "totalAmountMatched",
    "vacant",
    "farBSP",
    "nearBSP",
    "actualBSP"
})
public class RunnerPrices {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer asianLineId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrice bestPricesToBack;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrice bestPricesToLay;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double handicap;
    protected double lastPriceMatched;
    protected double reductionFactor;
    protected int selectionId;
    protected int sortOrder;
    protected double totalAmountMatched;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean vacant;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double farBSP;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double nearBSP;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double actualBSP;

    /**
     * Gets the value of the asianLineId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAsianLineId() {
        return asianLineId;
    }

    /**
     * Sets the value of the asianLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAsianLineId(Integer value) {
        this.asianLineId = value;
    }

    /**
     * Gets the value of the bestPricesToBack property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrice }
     *     
     */
    public ArrayOfPrice getBestPricesToBack() {
        return bestPricesToBack;
    }

    /**
     * Sets the value of the bestPricesToBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrice }
     *     
     */
    public void setBestPricesToBack(ArrayOfPrice value) {
        this.bestPricesToBack = value;
    }

    /**
     * Gets the value of the bestPricesToLay property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrice }
     *     
     */
    public ArrayOfPrice getBestPricesToLay() {
        return bestPricesToLay;
    }

    /**
     * Sets the value of the bestPricesToLay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrice }
     *     
     */
    public void setBestPricesToLay(ArrayOfPrice value) {
        this.bestPricesToLay = value;
    }

    /**
     * Gets the value of the handicap property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandicap() {
        return handicap;
    }

    /**
     * Sets the value of the handicap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandicap(Double value) {
        this.handicap = value;
    }

    /**
     * Gets the value of the lastPriceMatched property.
     * 
     */
    public double getLastPriceMatched() {
        return lastPriceMatched;
    }

    /**
     * Sets the value of the lastPriceMatched property.
     * 
     */
    public void setLastPriceMatched(double value) {
        this.lastPriceMatched = value;
    }

    /**
     * Gets the value of the reductionFactor property.
     * 
     */
    public double getReductionFactor() {
        return reductionFactor;
    }

    /**
     * Sets the value of the reductionFactor property.
     * 
     */
    public void setReductionFactor(double value) {
        this.reductionFactor = value;
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
     * Gets the value of the sortOrder property.
     * 
     */
    public int getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     */
    public void setSortOrder(int value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the totalAmountMatched property.
     * 
     */
    public double getTotalAmountMatched() {
        return totalAmountMatched;
    }

    /**
     * Sets the value of the totalAmountMatched property.
     * 
     */
    public void setTotalAmountMatched(double value) {
        this.totalAmountMatched = value;
    }

    /**
     * Gets the value of the vacant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVacant() {
        return vacant;
    }

    /**
     * Sets the value of the vacant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVacant(Boolean value) {
        this.vacant = value;
    }

    /**
     * Gets the value of the farBSP property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFarBSP() {
        return farBSP;
    }

    /**
     * Sets the value of the farBSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFarBSP(Double value) {
        this.farBSP = value;
    }

    /**
     * Gets the value of the nearBSP property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNearBSP() {
        return nearBSP;
    }

    /**
     * Sets the value of the nearBSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNearBSP(Double value) {
        this.nearBSP = value;
    }

    /**
     * Gets the value of the actualBSP property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualBSP() {
        return actualBSP;
    }

    /**
     * Sets the value of the actualBSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualBSP(Double value) {
        this.actualBSP = value;
    }

}
