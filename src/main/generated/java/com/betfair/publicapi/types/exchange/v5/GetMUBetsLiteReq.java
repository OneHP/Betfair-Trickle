
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetMUBetsLiteReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMUBetsLiteReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="betStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetStatusEnum"/>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="betIds" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfBetId"/>
 *         &lt;element name="orderBy" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetsOrderByEnum"/>
 *         &lt;element name="sortOrder" type="{http://www.betfair.com/publicapi/types/exchange/v5/}SortOrderEnum"/>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matchedSince" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="excludeLastSecond" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMUBetsLiteReq", propOrder = {
    "betStatus",
    "marketId",
    "betIds",
    "orderBy",
    "sortOrder",
    "recordCount",
    "startRecord",
    "matchedSince",
    "excludeLastSecond"
})
public class GetMUBetsLiteReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected BetStatusEnum betStatus;
    protected int marketId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfBetId betIds;
    @XmlElement(required = true)
    protected BetsOrderByEnum orderBy;
    @XmlElement(required = true)
    protected SortOrderEnum sortOrder;
    protected int recordCount;
    protected int startRecord;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matchedSince;
    protected boolean excludeLastSecond;

    /**
     * Gets the value of the betStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BetStatusEnum }
     *     
     */
    public BetStatusEnum getBetStatus() {
        return betStatus;
    }

    /**
     * Sets the value of the betStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetStatusEnum }
     *     
     */
    public void setBetStatus(BetStatusEnum value) {
        this.betStatus = value;
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
     * Gets the value of the betIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBetId }
     *     
     */
    public ArrayOfBetId getBetIds() {
        return betIds;
    }

    /**
     * Sets the value of the betIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBetId }
     *     
     */
    public void setBetIds(ArrayOfBetId value) {
        this.betIds = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link BetsOrderByEnum }
     *     
     */
    public BetsOrderByEnum getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetsOrderByEnum }
     *     
     */
    public void setOrderBy(BetsOrderByEnum value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderEnum }
     *     
     */
    public SortOrderEnum getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderEnum }
     *     
     */
    public void setSortOrder(SortOrderEnum value) {
        this.sortOrder = value;
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

    /**
     * Gets the value of the matchedSince property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatchedSince() {
        return matchedSince;
    }

    /**
     * Sets the value of the matchedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatchedSince(XMLGregorianCalendar value) {
        this.matchedSince = value;
    }

    /**
     * Gets the value of the excludeLastSecond property.
     * 
     */
    public boolean isExcludeLastSecond() {
        return excludeLastSecond;
    }

    /**
     * Sets the value of the excludeLastSecond property.
     * 
     */
    public void setExcludeLastSecond(boolean value) {
        this.excludeLastSecond = value;
    }

}
