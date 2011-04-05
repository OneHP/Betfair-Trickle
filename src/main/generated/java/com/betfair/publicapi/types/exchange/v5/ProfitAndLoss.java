
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfitAndLoss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfitAndLoss">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="futureIfWin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ifWin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="selectionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="selectionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="worstcaseIfWin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfitAndLoss", propOrder = {
    "futureIfWin",
    "ifWin",
    "selectionId",
    "selectionName",
    "worstcaseIfWin"
})
@XmlSeeAlso({
    HandicapLine.class,
    MultiWinnerOddsLine.class
})
public class ProfitAndLoss {

    protected double futureIfWin;
    protected double ifWin;
    protected int selectionId;
    @XmlElement(required = true, nillable = true)
    protected String selectionName;
    protected double worstcaseIfWin;

    /**
     * Gets the value of the futureIfWin property.
     * 
     */
    public double getFutureIfWin() {
        return futureIfWin;
    }

    /**
     * Sets the value of the futureIfWin property.
     * 
     */
    public void setFutureIfWin(double value) {
        this.futureIfWin = value;
    }

    /**
     * Gets the value of the ifWin property.
     * 
     */
    public double getIfWin() {
        return ifWin;
    }

    /**
     * Sets the value of the ifWin property.
     * 
     */
    public void setIfWin(double value) {
        this.ifWin = value;
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
     * Gets the value of the selectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionName() {
        return selectionName;
    }

    /**
     * Sets the value of the selectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionName(String value) {
        this.selectionName = value;
    }

    /**
     * Gets the value of the worstcaseIfWin property.
     * 
     */
    public double getWorstcaseIfWin() {
        return worstcaseIfWin;
    }

    /**
     * Sets the value of the worstcaseIfWin property.
     * 
     */
    public void setWorstcaseIfWin(double value) {
        this.worstcaseIfWin = value;
    }

}
