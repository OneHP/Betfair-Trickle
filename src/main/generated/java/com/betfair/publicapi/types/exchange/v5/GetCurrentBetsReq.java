
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Obtain all bets placed on a given market.  Pass marketId = 0 to obtain bets for all markets.  If
 *                 deatiled is true then also return details of Matches when betStatus = M
 *               
 * 
 * <p>Java class for GetCurrentBetsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCurrentBetsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="betStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetStatusEnum"/>
 *         &lt;element name="detailed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "GetCurrentBetsReq", propOrder = {
    "betStatus",
    "detailed",
    "locale",
    "timezone",
    "marketId",
    "orderBy",
    "recordCount",
    "startRecord",
    "noTotalRecordCount"
})
public class GetCurrentBetsReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected BetStatusEnum betStatus;
    protected boolean detailed;
    @XmlElement(required = true, nillable = true)
    protected String locale;
    @XmlElement(required = true, nillable = true)
    protected String timezone;
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
