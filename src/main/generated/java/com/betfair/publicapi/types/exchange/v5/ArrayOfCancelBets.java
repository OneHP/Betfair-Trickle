
package com.betfair.publicapi.types.exchange.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCancelBets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCancelBets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelBets" type="{http://www.betfair.com/publicapi/types/exchange/v5/}CancelBets" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCancelBets", propOrder = {
    "cancelBets"
})
public class ArrayOfCancelBets {

    @XmlElement(name = "CancelBets", namespace = "http://www.betfair.com/publicapi/types/exchange/v5/", nillable = true)
    protected List<CancelBets> cancelBets;

    /**
     * Gets the value of the cancelBets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelBets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelBets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelBets }
     * 
     * 
     */
    public List<CancelBets> getCancelBets() {
        if (cancelBets == null) {
            cancelBets = new ArrayList<CancelBets>();
        }
        return this.cancelBets;
    }

}
