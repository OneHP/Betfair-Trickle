
package com.betfair.publicapi.types.exchange.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProfitAndLoss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProfitAndLoss">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfitAndLoss" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ProfitAndLoss" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfitAndLoss", propOrder = {
    "profitAndLoss"
})
public class ArrayOfProfitAndLoss {

    @XmlElement(name = "ProfitAndLoss", namespace = "http://www.betfair.com/publicapi/types/exchange/v5/", nillable = true)
    protected List<ProfitAndLoss> profitAndLoss;

    /**
     * Gets the value of the profitAndLoss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profitAndLoss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfitAndLoss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfitAndLoss }
     * 
     * 
     */
    public List<ProfitAndLoss> getProfitAndLoss() {
        if (profitAndLoss == null) {
            profitAndLoss = new ArrayList<ProfitAndLoss>();
        }
        return this.profitAndLoss;
    }

}
