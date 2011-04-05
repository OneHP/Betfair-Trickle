
package com.betfair.publicapi.types.exchange.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMatchLite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMatchLite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchLite" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MatchLite" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMatchLite", propOrder = {
    "matchLite"
})
public class ArrayOfMatchLite {

    @XmlElement(name = "MatchLite", namespace = "http://www.betfair.com/publicapi/types/exchange/v5/", nillable = true)
    protected List<MatchLite> matchLite;

    /**
     * Gets the value of the matchLite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchLite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchLite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchLite }
     * 
     * 
     */
    public List<MatchLite> getMatchLite() {
        if (matchLite == null) {
            matchLite = new ArrayList<MatchLite>();
        }
        return this.matchLite;
    }

}
