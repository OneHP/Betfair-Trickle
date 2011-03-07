
package com.betfair.publicapi.types.exchange.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMUBet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMUBet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MUBet" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MUBet" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMUBet", propOrder = {
    "muBet"
})
public class ArrayOfMUBet {

    @XmlElement(name = "MUBet", namespace = "http://www.betfair.com/publicapi/types/exchange/v5/", nillable = true)
    protected List<MUBet> muBet;

    /**
     * Gets the value of the muBet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the muBet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMUBet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MUBet }
     * 
     * 
     */
    public List<MUBet> getMUBet() {
        if (muBet == null) {
            muBet = new ArrayList<MUBet>();
        }
        return this.muBet;
    }

}
