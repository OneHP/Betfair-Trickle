
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Bet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asianLineId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="avgPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="betId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="betStatus" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetStatusEnum"/>
 *         &lt;element name="betType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetTypeEnum"/>
 *         &lt;element name="betCategoryType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetCategoryTypeEnum"/>
 *         &lt;element name="betPersistenceType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}BetPersistenceTypeEnum"/>
 *         &lt;element name="cancelledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lapsedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="marketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullMarketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketType" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketTypeEnum"/>
 *         &lt;element name="marketTypeVariant" type="{http://www.betfair.com/publicapi/types/exchange/v5/}MarketTypeVariantEnum"/>
 *         &lt;element name="matchedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="matchedSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="matches" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfMatch"/>
 *         &lt;element name="placedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bspLiability" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="profitAndLoss" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="selectionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="selectionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="settledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="remainingSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="requestedSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="voidedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="handicap" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bet", propOrder = {
    "asianLineId",
    "avgPrice",
    "betId",
    "betStatus",
    "betType",
    "betCategoryType",
    "betPersistenceType",
    "cancelledDate",
    "lapsedDate",
    "marketId",
    "marketName",
    "fullMarketName",
    "marketType",
    "marketTypeVariant",
    "matchedDate",
    "matchedSize",
    "matches",
    "placedDate",
    "price",
    "bspLiability",
    "profitAndLoss",
    "selectionId",
    "selectionName",
    "settledDate",
    "remainingSize",
    "requestedSize",
    "voidedDate",
    "handicap"
})
public class Bet {

    protected int asianLineId;
    protected double avgPrice;
    protected long betId;
    @XmlElement(required = true)
    protected BetStatusEnum betStatus;
    @XmlElement(required = true)
    protected BetTypeEnum betType;
    @XmlElement(required = true)
    protected BetCategoryTypeEnum betCategoryType;
    @XmlElement(required = true)
    protected BetPersistenceTypeEnum betPersistenceType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelledDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lapsedDate;
    protected int marketId;
    @XmlElement(required = true, nillable = true)
    protected String marketName;
    @XmlElement(required = true, nillable = true)
    protected String fullMarketName;
    @XmlElement(required = true)
    protected MarketTypeEnum marketType;
    @XmlElement(required = true)
    protected MarketTypeVariantEnum marketTypeVariant;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matchedDate;
    protected double matchedSize;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMatch matches;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar placedDate;
    protected double price;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double bspLiability;
    protected double profitAndLoss;
    protected int selectionId;
    @XmlElement(required = true, nillable = true)
    protected String selectionName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settledDate;
    protected double remainingSize;
    protected double requestedSize;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voidedDate;
    protected double handicap;

    /**
     * Gets the value of the asianLineId property.
     * 
     */
    public int getAsianLineId() {
        return asianLineId;
    }

    /**
     * Sets the value of the asianLineId property.
     * 
     */
    public void setAsianLineId(int value) {
        this.asianLineId = value;
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
     * Gets the value of the betPersistenceType property.
     * 
     * @return
     *     possible object is
     *     {@link BetPersistenceTypeEnum }
     *     
     */
    public BetPersistenceTypeEnum getBetPersistenceType() {
        return betPersistenceType;
    }

    /**
     * Sets the value of the betPersistenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetPersistenceTypeEnum }
     *     
     */
    public void setBetPersistenceType(BetPersistenceTypeEnum value) {
        this.betPersistenceType = value;
    }

    /**
     * Gets the value of the cancelledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelledDate() {
        return cancelledDate;
    }

    /**
     * Sets the value of the cancelledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelledDate(XMLGregorianCalendar value) {
        this.cancelledDate = value;
    }

    /**
     * Gets the value of the lapsedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLapsedDate() {
        return lapsedDate;
    }

    /**
     * Sets the value of the lapsedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLapsedDate(XMLGregorianCalendar value) {
        this.lapsedDate = value;
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
     * Gets the value of the marketTypeVariant property.
     * 
     * @return
     *     possible object is
     *     {@link MarketTypeVariantEnum }
     *     
     */
    public MarketTypeVariantEnum getMarketTypeVariant() {
        return marketTypeVariant;
    }

    /**
     * Sets the value of the marketTypeVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketTypeVariantEnum }
     *     
     */
    public void setMarketTypeVariant(MarketTypeVariantEnum value) {
        this.marketTypeVariant = value;
    }

    /**
     * Gets the value of the matchedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatchedDate() {
        return matchedDate;
    }

    /**
     * Sets the value of the matchedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatchedDate(XMLGregorianCalendar value) {
        this.matchedDate = value;
    }

    /**
     * Gets the value of the matchedSize property.
     * 
     */
    public double getMatchedSize() {
        return matchedSize;
    }

    /**
     * Sets the value of the matchedSize property.
     * 
     */
    public void setMatchedSize(double value) {
        this.matchedSize = value;
    }

    /**
     * Gets the value of the matches property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatch }
     *     
     */
    public ArrayOfMatch getMatches() {
        return matches;
    }

    /**
     * Sets the value of the matches property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatch }
     *     
     */
    public void setMatches(ArrayOfMatch value) {
        this.matches = value;
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
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the bspLiability property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBspLiability() {
        return bspLiability;
    }

    /**
     * Sets the value of the bspLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBspLiability(Double value) {
        this.bspLiability = value;
    }

    /**
     * Gets the value of the profitAndLoss property.
     * 
     */
    public double getProfitAndLoss() {
        return profitAndLoss;
    }

    /**
     * Sets the value of the profitAndLoss property.
     * 
     */
    public void setProfitAndLoss(double value) {
        this.profitAndLoss = value;
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
     * Gets the value of the remainingSize property.
     * 
     */
    public double getRemainingSize() {
        return remainingSize;
    }

    /**
     * Sets the value of the remainingSize property.
     * 
     */
    public void setRemainingSize(double value) {
        this.remainingSize = value;
    }

    /**
     * Gets the value of the requestedSize property.
     * 
     */
    public double getRequestedSize() {
        return requestedSize;
    }

    /**
     * Sets the value of the requestedSize property.
     * 
     */
    public void setRequestedSize(double value) {
        this.requestedSize = value;
    }

    /**
     * Gets the value of the voidedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVoidedDate() {
        return voidedDate;
    }

    /**
     * Sets the value of the voidedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVoidedDate(XMLGregorianCalendar value) {
        this.voidedDate = value;
    }

    /**
     * Gets the value of the handicap property.
     * 
     */
    public double getHandicap() {
        return handicap;
    }

    /**
     * Sets the value of the handicap property.
     * 
     */
    public void setHandicap(double value) {
        this.handicap = value;
    }

}
