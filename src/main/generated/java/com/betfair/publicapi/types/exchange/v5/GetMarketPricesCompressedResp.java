
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketPricesCompressedResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMarketPricesCompressedResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetMarketPricesErrorEnum"/>
 *         &lt;element name="marketPrices" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "GetMarketPricesCompressedResp", propOrder = {
    "errorCode",
    "marketPrices",
    "minorErrorCode"
})
public class GetMarketPricesCompressedResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected GetMarketPricesErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String marketPrices;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetMarketPricesErrorEnum }
     *     
     */
    public GetMarketPricesErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMarketPricesErrorEnum }
     *     
     */
    public void setErrorCode(GetMarketPricesErrorEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the marketPrices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketPrices() {
        return marketPrices;
    }

    /**
     * Sets the value of the marketPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketPrices(String value) {
        this.marketPrices = value;
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
