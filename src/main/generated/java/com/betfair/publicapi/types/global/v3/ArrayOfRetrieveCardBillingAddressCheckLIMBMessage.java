
package com.betfair.publicapi.types.global.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRetrieveCardBillingAddressCheckLIMBMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRetrieveCardBillingAddressCheckLIMBMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retrieveCardBillingAddressCheckLIMBMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}RetrieveCardBillingAddressCheckLIMBMessage" maxOccurs="3" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRetrieveCardBillingAddressCheckLIMBMessage", propOrder = {
    "retrieveCardBillingAddressCheckLIMBMessage"
})
public class ArrayOfRetrieveCardBillingAddressCheckLIMBMessage {

    @XmlElement(namespace = "http://www.betfair.com/publicapi/types/global/v3/", nillable = true)
    protected List<RetrieveCardBillingAddressCheckLIMBMessage> retrieveCardBillingAddressCheckLIMBMessage;

    /**
     * Gets the value of the retrieveCardBillingAddressCheckLIMBMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retrieveCardBillingAddressCheckLIMBMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetrieveCardBillingAddressCheckLIMBMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrieveCardBillingAddressCheckLIMBMessage }
     * 
     * 
     */
    public List<RetrieveCardBillingAddressCheckLIMBMessage> getRetrieveCardBillingAddressCheckLIMBMessage() {
        if (retrieveCardBillingAddressCheckLIMBMessage == null) {
            retrieveCardBillingAddressCheckLIMBMessage = new ArrayList<RetrieveCardBillingAddressCheckLIMBMessage>();
        }
        return this.retrieveCardBillingAddressCheckLIMBMessage;
    }

}
