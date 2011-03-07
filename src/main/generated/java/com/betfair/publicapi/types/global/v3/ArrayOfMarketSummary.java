
package com.betfair.publicapi.types.global.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMarketSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMarketSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketSummary" type="{http://www.betfair.com/publicapi/types/global/v3/}MarketSummary" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMarketSummary", propOrder = {
    "marketSummary"
})
public class ArrayOfMarketSummary {

    @XmlElement(name = "MarketSummary", namespace = "http://www.betfair.com/publicapi/types/global/v3/", nillable = true)
    protected List<MarketSummary> marketSummary;

    /**
     * Gets the value of the marketSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSummary }
     * 
     * 
     */
    public List<MarketSummary> getMarketSummary() {
        if (marketSummary == null) {
            marketSummary = new ArrayList<MarketSummary>();
        }
        return this.marketSummary;
    }

}
