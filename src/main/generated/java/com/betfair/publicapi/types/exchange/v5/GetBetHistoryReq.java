
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetBetHistoryReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBetHistoryReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="betTypesIncluded" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetStatusEnum"/>
 *         &lt;element name="detailed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="eventTypeIds" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfInt"/>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketTypesIncluded" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfMarketTypeEnum"/>
 *         &lt;element name="placedDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="placedDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sortBetsBy" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetsOrderByEnum"/>
 *         &lt;element name="startRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBetHistoryReq", propOrder = {
    "betTypesIncluded",
    "detailed",
    "eventTypeIds",
    "marketId",
    "locale",
    "timezone",
    "marketTypesIncluded",
    "placedDateFrom",
    "placedDateTo",
    "recordCount",
    "sortBetsBy",
    "startRecord"
})
public class GetBetHistoryReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected BetStatusEnum betTypesIncluded;
    protected boolean detailed;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt eventTypeIds;
    protected int marketId;
    @XmlElement(required = true, nillable = true)
    protected String locale;
    @XmlElement(required = true, nillable = true)
    protected String timezone;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMarketTypeEnum marketTypesIncluded;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar placedDateFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar placedDateTo;
    protected int recordCount;
    @XmlElement(required = true)
    protected BetsOrderByEnum sortBetsBy;
    protected int startRecord;

    /**
     * Gets the value of the betTypesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link BetStatusEnum }
     *     
     */
    public BetStatusEnum getBetTypesIncluded() {
        return betTypesIncluded;
    }

    /**
     * Sets the value of the betTypesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetStatusEnum }
     *     
     */
    public void setBetTypesIncluded(BetStatusEnum value) {
        this.betTypesIncluded = value;
    }

    /**
     * Gets the value of the detailed property.
     * 
     */
    public boolean isDetailed() {
        return detailed;
    }

    /**
     * Sets the value of the detailed property.
     * 
     */
    public void setDetailed(boolean value) {
        this.detailed = value;
    }

    /**
     * Gets the value of the eventTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getEventTypeIds() {
        return eventTypeIds;
    }

    /**
     * Sets the value of the eventTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setEventTypeIds(ArrayOfInt value) {
        this.eventTypeIds = value;
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

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the marketTypesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarketTypeEnum }
     *     
     */
    public ArrayOfMarketTypeEnum getMarketTypesIncluded() {
        return marketTypesIncluded;
    }

    /**
     * Sets the value of the marketTypesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarketTypeEnum }
     *     
     */
    public void setMarketTypesIncluded(ArrayOfMarketTypeEnum value) {
        this.marketTypesIncluded = value;
    }

    /**
     * Gets the value of the placedDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlacedDateFrom() {
        return placedDateFrom;
    }

    /**
     * Sets the value of the placedDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlacedDateFrom(XMLGregorianCalendar value) {
        this.placedDateFrom = value;
    }

    /**
     * Gets the value of the placedDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlacedDateTo() {
        return placedDateTo;
    }

    /**
     * Sets the value of the placedDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlacedDateTo(XMLGregorianCalendar value) {
        this.placedDateTo = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the sortBetsBy property.
     * 
     * @return
     *     possible object is
     *     {@link BetsOrderByEnum }
     *     
     */
    public BetsOrderByEnum getSortBetsBy() {
        return sortBetsBy;
    }

    /**
     * Sets the value of the sortBetsBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetsOrderByEnum }
     *     
     */
    public void setSortBetsBy(BetsOrderByEnum value) {
        this.sortBetsBy = value;
    }

    /**
     * Gets the value of the startRecord property.
     * 
     */
    public int getStartRecord() {
        return startRecord;
    }

    /**
     * Sets the value of the startRecord property.
     * 
     */
    public void setStartRecord(int value) {
        this.startRecord = value;
    }

}
