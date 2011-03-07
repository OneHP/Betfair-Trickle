
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketProfitAndLossReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMarketProfitAndLossReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="includeSettledBets" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeBspBets" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="netOfCommission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMarketProfitAndLossReq", propOrder = {
    "locale",
    "includeSettledBets",
    "includeBspBets",
    "marketID",
    "netOfCommission"
})
public class GetMarketProfitAndLossReq
    extends APIRequest
{

    @XmlElement(required = true, nillable = true)
    protected String locale;
    protected boolean includeSettledBets;
    protected boolean includeBspBets;
    protected int marketID;
    protected boolean netOfCommission;

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the includeSettledBets property.
     * 
     */
    public boolean isIncludeSettledBets() {
        return includeSettledBets;
    }

    /**
     * Sets the value of the includeSettledBets property.
     * 
     */
    public void setIncludeSettledBets(boolean value) {
        this.includeSettledBets = value;
    }

    /**
     * Gets the value of the includeBspBets property.
     * 
     */
    public boolean isIncludeBspBets() {
        return includeBspBets;
    }

    /**
     * Sets the value of the includeBspBets property.
     * 
     */
    public void setIncludeBspBets(boolean value) {
        this.includeBspBets = value;
    }

    /**
     * Gets the value of the marketID property.
     * 
     */
    public int getMarketID() {
        return marketID;
    }

    /**
     * Sets the value of the marketID property.
     * 
     */
    public void setMarketID(int value) {
        this.marketID = value;
    }

    /**
     * Gets the value of the netOfCommission property.
     * 
     */
    public boolean isNetOfCommission() {
        return netOfCommission;
    }

    /**
     * Sets the value of the netOfCommission property.
     * 
     */
    public void setNetOfCommission(boolean value) {
        this.netOfCommission = value;
    }

}
