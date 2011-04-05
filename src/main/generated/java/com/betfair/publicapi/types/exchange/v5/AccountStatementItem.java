
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountStatementItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountStatementItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="avgPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="betId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="betSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="betType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetTypeEnum"/>
 *         &lt;element name="betCategoryType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetCategoryTypeEnum"/>
 *         &lt;element name="commissionRate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eventTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fullMarketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grossBetAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="marketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketTypeEnum"/>
 *         &lt;element name="placedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="selectionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="selectionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="settledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="transactionType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}AccountStatementEnum"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="winLose" type="{http://www.betfair.com/publicapi/types/exchange/v5/}AccountStatementEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatementItem", propOrder = {
    "accountBalance",
    "amount",
    "avgPrice",
    "betId",
    "betSize",
    "betType",
    "betCategoryType",
    "commissionRate",
    "eventId",
    "eventTypeId",
    "fullMarketName",
    "grossBetAmount",
    "marketName",
    "marketType",
    "placedDate",
    "selectionId",
    "selectionName",
    "settledDate",
    "startDate",
    "transactionType",
    "transactionId",
    "winLose"
})
public class AccountStatementItem {

    protected double accountBalance;
    protected double amount;
    protected double avgPrice;
    protected long betId;
    protected double betSize;
    @XmlElement(required = true)
    protected BetTypeEnum betType;
    @XmlElement(required = true)
    protected BetCategoryTypeEnum betCategoryType;
    @XmlElement(required = true, nillable = true)
    protected String commissionRate;
    protected int eventId;
    protected int eventTypeId;
    @XmlElement(required = true, nillable = true)
    protected String fullMarketName;
    protected double grossBetAmount;
    @XmlElement(required = true, nillable = true)
    protected String marketName;
    @XmlElement(required = true)
    protected MarketTypeEnum marketType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar placedDate;
    protected int selectionId;
    @XmlElement(required = true, nillable = true)
    protected String selectionName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settledDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    protected AccountStatementEnum transactionType;
    protected long transactionId;
    @XmlElement(required = true)
    protected AccountStatementEnum winLose;

    /**
     * Gets the value of the accountBalance property.
     * 
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     */
    public void setAccountBalance(double value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the avgPrice property.
     * 
     */
    public double getAvgPrice() {
        return avgPrice;
    }

    /**
     * Sets the value of the avgPrice property.
     * 
     */
    public void setAvgPrice(double value) {
        this.avgPrice = value;
    }

    /**
     * Gets the value of the betId property.
     * 
     */
    public long getBetId() {
        return betId;
    }

    /**
     * Sets the value of the betId property.
     * 
     */
    public void setBetId(long value) {
        this.betId = value;
    }

    /**
     * Gets the value of the betSize property.
     * 
     */
    public double getBetSize() {
        return betSize;
    }

    /**
     * Sets the value of the betSize property.
     * 
     */
    public void setBetSize(double value) {
        this.betSize = value;
    }

    /**
     * Gets the value of the betType property.
     * 
     * @return
     *     possible object is
     *     {@link BetTypeEnum }
     *     
     */
    public BetTypeEnum getBetType() {
        return betType;
    }

    /**
     * Sets the value of the betType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetTypeEnum }
     *     
     */
    public void setBetType(BetTypeEnum value) {
        this.betType = value;
    }

    /**
     * Gets the value of the betCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link BetCategoryTypeEnum }
     *     
     */
    public BetCategoryTypeEnum getBetCategoryType() {
        return betCategoryType;
    }

    /**
     * Sets the value of the betCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetCategoryTypeEnum }
     *     
     */
    public void setBetCategoryType(BetCategoryTypeEnum value) {
        this.betCategoryType = value;
    }

    /**
     * Gets the value of the commissionRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionRate() {
        return commissionRate;
    }

    /**
     * Sets the value of the commissionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionRate(String value) {
        this.commissionRate = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     */
    public int getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     */
    public void setEventId(int value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventTypeId property.
     * 
     */
    public int getEventTypeId() {
        return eventTypeId;
    }

    /**
     * Sets the value of the eventTypeId property.
     * 
     */
    public void setEventTypeId(int value) {
        this.eventTypeId = value;
    }

    /**
     * Gets the value of the fullMarketName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullMarketName() {
        return fullMarketName;
    }

    /**
     * Sets the value of the fullMarketName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullMarketName(String value) {
        this.fullMarketName = value;
    }

    /**
     * Gets the value of the grossBetAmount property.
     * 
     */
    public double getGrossBetAmount() {
        return grossBetAmount;
    }

    /**
     * Sets the value of the grossBetAmount property.
     * 
     */
    public void setGrossBetAmount(double value) {
        this.grossBetAmount = value;
    }

    /**
     * Gets the value of the marketName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * Sets the value of the marketName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketName(String value) {
        this.marketName = value;
    }

    /**
     * Gets the value of the marketType property.
     * 
     * @return
     *     possible object is
     *     {@link MarketTypeEnum }
     *     
     */
    public MarketTypeEnum getMarketType() {
        return marketType;
    }

    /**
     * Sets the value of the marketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketTypeEnum }
     *     
     */
    public void setMarketType(MarketTypeEnum value) {
        this.marketType = value;
    }

    /**
     * Gets the value of the placedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlacedDate() {
        return placedDate;
    }

    /**
     * Sets the value of the placedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlacedDate(XMLGregorianCalendar value) {
        this.placedDate = value;
    }

    /**
     * Gets the value of the selectionId property.
     * 
     */
    public int getSelectionId() {
        return selectionId;
    }

    /**
     * Sets the value of the selectionId property.
     * 
     */
    public void setSelectionId(int value) {
        this.selectionId = value;
    }

    /**
     * Gets the value of the selectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionName() {
        return selectionName;
    }

    /**
     * Sets the value of the selectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionName(String value) {
        this.selectionName = value;
    }

    /**
     * Gets the value of the settledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettledDate() {
        return settledDate;
    }

    /**
     * Sets the value of the settledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettledDate(XMLGregorianCalendar value) {
        this.settledDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatementEnum }
     *     
     */
    public AccountStatementEnum getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatementEnum }
     *     
     */
    public void setTransactionType(AccountStatementEnum value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(long value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the winLose property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatementEnum }
     *     
     */
    public AccountStatementEnum getWinLose() {
        return winLose;
    }

    /**
     * Sets the value of the winLose property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatementEnum }
     *     
     */
    public void setWinLose(AccountStatementEnum value) {
        this.winLose = value;
    }

}
