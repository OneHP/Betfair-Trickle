
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewReferAndEarnResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewReferAndEarnResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/global/v3/}ViewReferAndEarnErrorEnum"/>
 *         &lt;element name="referAndEarnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewReferAndEarnResp", propOrder = {
    "minorErrorCode",
    "errorCode",
    "referAndEarnCode"
})
public class ViewReferAndEarnResp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    @XmlElement(required = true)
    protected ViewReferAndEarnErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String referAndEarnCode;

    /**
     * Gets the value of the minorErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorErrorCode() {
        return minorErrorCode;
    }

    /**
     * Sets the value of the minorErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorErrorCode(String value) {
        this.minorErrorCode = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ViewReferAndEarnErrorEnum }
     *     
     */
    public ViewReferAndEarnErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewReferAndEarnErrorEnum }
     *     
     */
    public void setErrorCode(ViewReferAndEarnErrorEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the referAndEarnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferAndEarnCode() {
        return referAndEarnCode;
    }

    /**
     * Sets the value of the referAndEarnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferAndEarnCode(String value) {
        this.referAndEarnCode = value;
    }

}
