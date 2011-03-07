
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitTCPrivacyPolicyChangeLIMBMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitTCPrivacyPolicyChangeLIMBMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tCPrivacyPolicyChangeAcceptance" type="{http://www.betfair.com/publicapi/types/global/v3/}PrivacyPolicyChangeResponseEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitTCPrivacyPolicyChangeLIMBMessage", propOrder = {
    "tcPrivacyPolicyChangeAcceptance"
})
public class SubmitTCPrivacyPolicyChangeLIMBMessage {

    @XmlElement(name = "tCPrivacyPolicyChangeAcceptance", required = true)
    protected PrivacyPolicyChangeResponseEnum tcPrivacyPolicyChangeAcceptance;

    /**
     * Gets the value of the tcPrivacyPolicyChangeAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link PrivacyPolicyChangeResponseEnum }
     *     
     */
    public PrivacyPolicyChangeResponseEnum getTCPrivacyPolicyChangeAcceptance() {
        return tcPrivacyPolicyChangeAcceptance;
    }

    /**
     * Sets the value of the tcPrivacyPolicyChangeAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivacyPolicyChangeResponseEnum }
     *     
     */
    public void setTCPrivacyPolicyChangeAcceptance(PrivacyPolicyChangeResponseEnum value) {
        this.tcPrivacyPolicyChangeAcceptance = value;
    }

}
