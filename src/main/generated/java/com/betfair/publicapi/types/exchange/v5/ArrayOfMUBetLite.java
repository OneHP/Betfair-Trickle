
package com.betfair.publicapi.types.exchange.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMUBetLite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMUBetLite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MUBetLite" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MUBetLite" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMUBetLite", propOrder = {
    "muBetLite"
})
public class ArrayOfMUBetLite {

    @XmlElement(name = "MUBetLite", namespace = "http://www.betfair.com/publicapi/types/exchange/v5/", nillable = true)
    protected List<MUBetLite> muBetLite;

    /**
     * Gets the value of the muBetLite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the muBetLite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMUBetLite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MUBetLite }
     * 
     * 
     */
    public List<MUBetLite> getMUBetLite() {
        if (muBetLite == null) {
            muBetLite = new ArrayList<MUBetLite>();
        }
        return this.muBetLite;
    }

}
