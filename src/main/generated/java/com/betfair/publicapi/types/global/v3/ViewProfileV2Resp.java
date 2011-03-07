
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewProfileV2Resp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewProfileV2Resp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}ViewProfileResp">
 *       &lt;sequence>
 *         &lt;element name="tAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referAndEarnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="earthportID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kYCStatus" type="{http://www.betfair.com/publicapi/types/global/v3/}KYCStatusEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewProfileV2Resp", propOrder = {
    "tan",
    "referAndEarnCode",
    "earthportID",
    "kycStatus"
})
public class ViewProfileV2Resp
    extends ViewProfileResp
{

    @XmlElement(name = "tAN", required = true, nillable = true)
    protected String tan;
    @XmlElement(required = true, nillable = true)
    protected String referAndEarnCode;
    @XmlElement(required = true, nillable = true)
    protected String earthportID;
    @XmlElement(name = "kYCStatus", required = true)
    protected KYCStatusEnum kycStatus;

    /**
     * Gets the value of the tan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAN() {
        return tan;
    }

    /**
     * Sets the value of the tan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAN(String value) {
        this.tan = value;
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

    /**
     * Gets the value of the earthportID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarthportID() {
        return earthportID;
    }

    /**
     * Sets the value of the earthportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarthportID(String value) {
        this.earthportID = value;
    }

    /**
     * Gets the value of the kycStatus property.
     * 
     * @return
     *     possible object is
     *     {@link KYCStatusEnum }
     *     
     */
    public KYCStatusEnum getKYCStatus() {
        return kycStatus;
    }

    /**
     * Sets the value of the kycStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link KYCStatusEnum }
     *     
     */
    public void setKYCStatus(KYCStatusEnum value) {
        this.kycStatus = value;
    }

}
