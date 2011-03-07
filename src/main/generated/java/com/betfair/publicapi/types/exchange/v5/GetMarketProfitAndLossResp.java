
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketProfitAndLossResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMarketProfitAndLossResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="annotations" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfProfitAndLoss"/>
 *         &lt;element name="commissionApplied" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetMarketProfitAndLossErrorEnum"/>
 *         &lt;element name="includesSettledBets" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includesBspBets" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketStatusEnum"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMarketProfitAndLossResp", propOrder = {
    "annotations",
    "commissionApplied",
    "currencyCode",
    "errorCode",
    "includesSettledBets",
    "includesBspBets",
    "marketId",
    "marketName",
    "marketStatus",
    "minorErrorCode",
    "unit"
})
public class GetMarketProfitAndLossResp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProfitAndLoss annotations;
    protected double commissionApplied;
    @XmlElement(required = true, nillable = true)
    protected String currencyCode;
    @XmlElement(required = true)
    protected GetMarketProfitAndLossErrorEnum errorCode;
    protected boolean includesSettledBets;
    protected boolean includesBspBets;
    protected int marketId;
    @XmlElement(required = true, nillable = true)
    protected String marketName;
    @XmlElement(required = true)
    protected MarketStatusEnum marketStatus;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    @XmlElement(required = true, nillable = true)
    protected String unit;

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfitAndLoss }
     *     
     */
    public ArrayOfProfitAndLoss getAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfitAndLoss }
     *     
     */
    public void setAnnotations(ArrayOfProfitAndLoss value) {
        this.annotations = value;
    }

    /**
     * Gets the value of the commissionApplied property.
     * 
     */
    public double getCommissionApplied() {
        return commissionApplied;
    }

    /**
     * Sets the value of the commissionApplied property.
     * 
     */
    public void setCommissionApplied(double value) {
        this.commissionApplied = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetMarketProfitAndLossErrorEnum }
     *     
     */
    public GetMarketProfitAndLossErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMarketProfitAndLossErrorEnum }
     *     
     */
    public void setErrorCode(GetMarketProfitAndLossErrorEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the includesSettledBets property.
     * 
     */
    public boolean isIncludesSettledBets() {
        return includesSettledBets;
    }

    /**
     * Sets the value of the includesSettledBets property.
     * 
     */
    public void setIncludesSettledBets(boolean value) {
        this.includesSettledBets = value;
    }

    /**
     * Gets the value of the includesBspBets property.
     * 
     */
    public boolean isIncludesBspBets() {
        return includesBspBets;
    }

    /**
     * Sets the value of the includesBspBets property.
     * 
     */
    public void setIncludesBspBets(boolean value) {
        this.includesBspBets = value;
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
     * Gets the value of the marketName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * Sets the value of the marketName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketName(String value) {
        this.marketName = value;
    }

    /**
     * Gets the value of the marketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MarketStatusEnum }
     *     
     */
    public MarketStatusEnum getMarketStatus() {
        return marketStatus;
    }

    /**
     * Sets the value of the marketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketStatusEnum }
     *     
     */
    public void setMarketStatus(MarketStatusEnum value) {
        this.marketStatus = value;
    }

    /**
     * Gets the value of the minorErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorErrorCode() {
        return minorErrorCode;
    }

    /**
     * Sets the value of the minorErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorErrorCode(String value) {
        this.minorErrorCode = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
