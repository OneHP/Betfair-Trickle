
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivateMarket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivateMarket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="menuPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventHierarchy" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfEventId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateMarket", propOrder = {
    "name",
    "marketId",
    "menuPath",
    "eventHierarchy"
})
public class PrivateMarket {

    @XmlElement(required = true, nillable = true)
    protected String name;
    protected int marketId;
    @XmlElement(required = true, nillable = true)
    protected String menuPath;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfEventId eventHierarchy;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the marketId property.
     * 
     */
    public int getMarketId() {
        return marketId;
    }

    /**
     * Sets the value of the marketId property.
     * 
     */
    public void setMarketId(int value) {
        this.marketId = value;
    }

    /**
     * Gets the value of the menuPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuPath() {
        return menuPath;
    }

    /**
     * Sets the value of the menuPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuPath(String value) {
        this.menuPath = value;
    }

    /**
     * Gets the value of the eventHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventId }
     *     
     */
    public ArrayOfEventId getEventHierarchy() {
        return eventHierarchy;
    }

    /**
     * Sets the value of the eventHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventId }
     *     
     */
    public void setEventHierarchy(ArrayOfEventId value) {
        this.eventHierarchy = value;
    }

}
