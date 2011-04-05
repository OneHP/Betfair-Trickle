
package com.betfair.publicapi.types.exchange.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCancelBetsByMarketResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCancelBetsByMarketResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelBetsByMarketResult" type="{http://www.betfair.com/publicapi/types/exchange/v5/}CancelBetsByMarketResult" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCancelBetsByMarketResult", propOrder = {
    "cancelBetsByMarketResult"
})
public class ArrayOfCancelBetsByMarketResult {

    @XmlElement(name = "CancelBetsByMarketResult", namespace = "http://www.betfair.com/publicapi/types/exchange/v5/", nillable = true)
    protected List<CancelBetsByMarketResult> cancelBetsByMarketResult;

    /**
     * Gets the value of the cancelBetsByMarketResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelBetsByMarketResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelBetsByMarketResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelBetsByMarketResult }
     * 
     * 
     */
    public List<CancelBetsByMarketResult> getCancelBetsByMarketResult() {
        if (cancelBetsByMarketResult == null) {
            cancelBetsByMarketResult = new ArrayList<CancelBetsByMarketResult>();
        }
        return this.cancelBetsByMarketResult;
    }

}
