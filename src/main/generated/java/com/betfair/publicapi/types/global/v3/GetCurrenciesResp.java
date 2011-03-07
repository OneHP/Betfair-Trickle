
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCurrenciesResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCurrenciesResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="currencyItems" type="{http://www.betfair.com/publicapi/types/global/v3/}ArrayOfCurrency"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrenciesResp", propOrder = {
    "currencyItems"
})
public class GetCurrenciesResp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCurrency currencyItems;

    /**
     * Gets the value of the currencyItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrency }
     *     
     */
    public ArrayOfCurrency getCurrencyItems() {
        return currencyItems;
    }

    /**
     * Sets the value of the currencyItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrency }
     *     
     */
    public void setCurrencyItems(ArrayOfCurrency value) {
        this.currencyItems = value;
    }

}
