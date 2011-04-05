
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketTradedVolumeResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMarketTradedVolumeResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetMarketTradedVolumeErrorEnum"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priceItems" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfVolumeInfo"/>
 *         &lt;element name="actualBSP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMarketTradedVolumeResp", propOrder = {
    "errorCode",
    "minorErrorCode",
    "priceItems",
    "actualBSP"
})
public class GetMarketTradedVolumeResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected GetMarketTradedVolumeErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfVolumeInfo priceItems;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double actualBSP;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetMarketTradedVolumeErrorEnum }
     *     
     */
    public GetMarketTradedVolumeErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMarketTradedVolumeErrorEnum }
     *     
     */
    public void setErrorCode(GetMarketTradedVolumeErrorEnum value) {
        this.errorCode = value;
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
     * Gets the value of the priceItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVolumeInfo }
     *     
     */
    public ArrayOfVolumeInfo getPriceItems() {
        return priceItems;
    }

    /**
     * Sets the value of the priceItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVolumeInfo }
     *     
     */
    public void setPriceItems(ArrayOfVolumeInfo value) {
        this.priceItems = value;
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
