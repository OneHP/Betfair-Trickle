
package com.betfair.publicapi.types.exchange.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRacingSilk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRacingSilk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RacingSilk" type="{http://www.betfair.com/publicapi/types/exchange/v5/}RacingSilk" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRacingSilk", propOrder = {
    "racingSilk"
})
public class ArrayOfRacingSilk {

    @XmlElement(name = "RacingSilk", namespace = "http://www.betfair.com/publicapi/types/exchange/v5/", nillable = true)
    protected List<RacingSilk> racingSilk;

    /**
     * Gets the value of the racingSilk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the racingSilk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRacingSilk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RacingSilk }
     * 
     * 
     */
    public List<RacingSilk> getRacingSilk() {
        if (racingSilk == null) {
            racingSilk = new ArrayList<RacingSilk>();
        }
        return this.racingSilk;
    }

}
