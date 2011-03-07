
package com.betfair.publicapi.types.global.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSubmitCardBillingAddressCheckLIMBMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSubmitCardBillingAddressCheckLIMBMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="submitCardBillingAddressCheckLIMBMessage" type="{http://www.betfair.com/publicapi/types/global/v3/}SubmitCardBillingAddressCheckLIMBMessage" maxOccurs="3" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSubmitCardBillingAddressCheckLIMBMessage", propOrder = {
    "submitCardBillingAddressCheckLIMBMessage"
})
public class ArrayOfSubmitCardBillingAddressCheckLIMBMessage {

    @XmlElement(namespace = "http://www.betfair.com/publicapi/types/global/v3/", nillable = true)
    protected List<SubmitCardBillingAddressCheckLIMBMessage> submitCardBillingAddressCheckLIMBMessage;

    /**
     * Gets the value of the submitCardBillingAddressCheckLIMBMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submitCardBillingAddressCheckLIMBMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitCardBillingAddressCheckLIMBMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubmitCardBillingAddressCheckLIMBMessage }
     * 
     * 
     */
    public List<SubmitCardBillingAddressCheckLIMBMessage> getSubmitCardBillingAddressCheckLIMBMessage() {
        if (submitCardBillingAddressCheckLIMBMessage == null) {
            submitCardBillingAddressCheckLIMBMessage = new ArrayList<SubmitCardBillingAddressCheckLIMBMessage>();
        }
        return this.submitCardBillingAddressCheckLIMBMessage;
    }

}
