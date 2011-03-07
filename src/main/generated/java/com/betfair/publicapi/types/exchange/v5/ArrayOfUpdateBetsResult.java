
package com.betfair.publicapi.types.exchange.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdateBetsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdateBetsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateBetsResult" type="{http://www.betfair.com/publicapi/types/exchange/v5/}UpdateBetsResult" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdateBetsResult", propOrder = {
    "updateBetsResult"
})
public class ArrayOfUpdateBetsResult {

    @XmlElement(name = "UpdateBetsResult", namespace = "http://www.betfair.com/publicapi/types/exchange/v5/", nillable = true)
    protected List<UpdateBetsResult> updateBetsResult;

    /**
     * Gets the value of the updateBetsResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateBetsResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateBetsResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateBetsResult }
     * 
     * 
     */
    public List<UpdateBetsResult> getUpdateBetsResult() {
        if (updateBetsResult == null) {
            updateBetsResult = new ArrayList<UpdateBetsResult>();
        }
        return this.updateBetsResult;
    }

}
