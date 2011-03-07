
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForgotPasswordResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForgotPasswordResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/global/v3/}ForgotPasswordErrorEnum"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="question1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="question2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForgotPasswordResp", propOrder = {
    "errorCode",
    "minorErrorCode",
    "question1",
    "question2"
})
public class ForgotPasswordResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected ForgotPasswordErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    @XmlElement(required = true, nillable = true)
    protected String question1;
    @XmlElement(required = true, nillable = true)
    protected String question2;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ForgotPasswordErrorEnum }
     *     
     */
    public ForgotPasswordErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForgotPasswordErrorEnum }
     *     
     */
    public void setErrorCode(ForgotPasswordErrorEnum value) {
        this.errorCode = value;
    }

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
     * Gets the value of the question1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion1() {
        return question1;
    }

    /**
     * Sets the value of the question1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion1(String value) {
        this.question1 = value;
    }

    /**
     * Gets the value of the question2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion2() {
        return question2;
    }

    /**
     * Sets the value of the question2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion2(String value) {
        this.question2 = value;
    }

}
