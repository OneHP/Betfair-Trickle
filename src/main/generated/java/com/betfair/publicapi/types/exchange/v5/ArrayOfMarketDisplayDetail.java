
package com.betfair.publicapi.types.exchange.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMarketDisplayDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMarketDisplayDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketDisplayDetail" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketDisplayDetail" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMarketDisplayDetail", propOrder = {
    "marketDisplayDetail"
})
public class ArrayOfMarketDisplayDetail {

    @XmlElement(name = "MarketDisplayDetail", namespace = "http://www.betfair.com/publicapi/types/exchange/v5/", nillable = true)
    protected List<MarketDisplayDetail> marketDisplayDetail;

    /**
     * Gets the value of the marketDisplayDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketDisplayDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketDisplayDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketDisplayDetail }
     * 
     * 
     */
    public List<MarketDisplayDetail> getMarketDisplayDetail() {
        if (marketDisplayDetail == null) {
            marketDisplayDetail = new ArrayList<MarketDisplayDetail>();
        }
        return this.marketDisplayDetail;
    }

}
