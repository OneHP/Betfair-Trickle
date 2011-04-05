
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketInfoResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMarketInfoResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetMarketErrorEnum"/>
 *         &lt;element name="marketLite" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketLite"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMarketInfoResp", propOrder = {
    "errorCode",
    "marketLite",
    "minorErrorCode"
})
public class GetMarketInfoResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected GetMarketErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected MarketLite marketLite;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetMarketErrorEnum }
     *     
     */
    public GetMarketErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMarketErrorEnum }
     *     
     */
    public void setErrorCode(GetMarketErrorEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the marketLite property.
     * 
     * @return
     *     possible object is
     *     {@link MarketLite }
     *     
     */
    public MarketLite getMarketLite() {
        return marketLite;
    }

    /**
     * Sets the value of the marketLite property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketLite }
     *     
     */
    public void setMarketLite(MarketLite value) {
        this.marketLite = value;
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

}
