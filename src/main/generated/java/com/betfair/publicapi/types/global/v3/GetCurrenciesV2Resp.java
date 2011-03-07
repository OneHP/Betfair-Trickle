
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCurrenciesV2Resp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCurrenciesV2Resp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="currencyItems" type="{http://www.betfair.com/publicapi/types/global/v3/}ArrayOfCurrencyV2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrenciesV2Resp", propOrder = {
    "currencyItems"
})
public class GetCurrenciesV2Resp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCurrencyV2 currencyItems;

    /**
     * Gets the value of the currencyItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrencyV2 }
     *     
     */
    public ArrayOfCurrencyV2 getCurrencyItems() {
        return currencyItems;
    }

    /**
     * Sets the value of the currencyItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrencyV2 }
     *     
     */
    public void setCurrencyItems(ArrayOfCurrencyV2 value) {
        this.currencyItems = value;
    }

}
