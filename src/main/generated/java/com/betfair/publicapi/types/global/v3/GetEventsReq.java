
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEventsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEventsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="eventParentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEventsReq", propOrder = {
    "eventParentId",
    "locale"
})
public class GetEventsReq
    extends APIRequest
{

    protected int eventParentId;
    @XmlElement(required = true, nillable = true)
    protected String locale;

    /**
     * Gets the value of the eventParentId property.
     * 
     */
    public int getEventParentId() {
        return eventParentId;
    }

    /**
     * Sets the value of the eventParentId property.
     * 
     */
    public void setEventParentId(int value) {
        this.eventParentId = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

}
