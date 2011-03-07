
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEventTypesResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEventTypesResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="eventTypeItems" type="{http://www.betfair.com/publicapi/types/global/v3/}ArrayOfEventType"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/global/v3/}GetEventsErrorEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEventTypesResp", propOrder = {
    "eventTypeItems",
    "minorErrorCode",
    "errorCode"
})
public class GetEventTypesResp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfEventType eventTypeItems;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    @XmlElement(required = true)
    protected GetEventsErrorEnum errorCode;

    /**
     * Gets the value of the eventTypeItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventType }
     *     
     */
    public ArrayOfEventType getEventTypeItems() {
        return eventTypeItems;
    }

    /**
     * Sets the value of the eventTypeItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventType }
     *     
     */
    public void setEventTypeItems(ArrayOfEventType value) {
        this.eventTypeItems = value;
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
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetEventsErrorEnum }
     *     
     */
    public GetEventsErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEventsErrorEnum }
     *     
     */
    public void setErrorCode(GetEventsErrorEnum value) {
        this.errorCode = value;
    }

}
