
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCurrentBetsLiteReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCurrentBetsLiteReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="betStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetStatusEnum"/>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderBy" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetsOrderByEnum"/>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="noTotalRecordCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrentBetsLiteReq", propOrder = {
    "betStatus",
    "marketId",
    "orderBy",
    "recordCount",
    "startRecord",
    "noTotalRecordCount"
})
public class GetCurrentBetsLiteReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected BetStatusEnum betStatus;
    protected int marketId;
    @XmlElement(required = true)
    protected BetsOrderByEnum orderBy;
    protected int recordCount;
    protected int startRecord;
    protected boolean noTotalRecordCount;

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
     * Gets the value of the noTotalRecordCount property.
     * 
     */
    public boolean isNoTotalRecordCount() {
        return noTotalRecordCount;
    }

    /**
     * Sets the value of the noTotalRecordCount property.
     * 
     */
    public void setNoTotalRecordCount(boolean value) {
        this.noTotalRecordCount = value;
    }

}
