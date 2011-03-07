
package com.betfair.publicapi.types.global.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBFEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBFEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BFEvent" type="{http://www.betfair.com/publicapi/types/global/v3/}BFEvent" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBFEvent", propOrder = {
    "bfEvent"
})
public class ArrayOfBFEvent {

    @XmlElement(name = "BFEvent", namespace = "http://www.betfair.com/publicapi/types/global/v3/", nillable = true)
    protected List<BFEvent> bfEvent;

    /**
     * Gets the value of the bfEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bfEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBFEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BFEvent }
     * 
     * 
     */
    public List<BFEvent> getBFEvent() {
        if (bfEvent == null) {
            bfEvent = new ArrayList<BFEvent>();
        }
        return this.bfEvent;
    }

}
