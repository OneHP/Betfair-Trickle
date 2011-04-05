
package com.betfair.publicapi.types.exchange.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMarketTypeEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMarketTypeEnum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketTypeEnum" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketTypeEnum" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMarketTypeEnum", propOrder = {
    "marketTypeEnum"
})
public class ArrayOfMarketTypeEnum {

    @XmlElement(name = "MarketTypeEnum", namespace = "http://www.betfair.com/publicapi/types/exchange/v5/", nillable = true)
    protected List<MarketTypeEnum> marketTypeEnum;

    /**
     * Gets the value of the marketTypeEnum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketTypeEnum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketTypeEnum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketTypeEnum }
     * 
     * 
     */
    public List<MarketTypeEnum> getMarketTypeEnum() {
        if (marketTypeEnum == null) {
            marketTypeEnum = new ArrayList<MarketTypeEnum>();
        }
        return this.marketTypeEnum;
    }

}
