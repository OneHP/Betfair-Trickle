
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetAccountStatementReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountStatementReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="itemsIncluded" type="{http://www.betfair.com/publicapi/types/exchange/v5/}AccountStatementIncludeEnum"/>
 *         &lt;element name="ignoreAutoTransfers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="startRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "GetAccountStatementReq", propOrder = {
    "endDate",
    "itemsIncluded",
    "ignoreAutoTransfers",
    "recordCount",
    "startDate",
    "startRecord",
    "locale"
})
public class GetAccountStatementReq
    extends APIRequest
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    protected AccountStatementIncludeEnum itemsIncluded;
    protected boolean ignoreAutoTransfers;
    protected int recordCount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected int startRecord;
    @XmlElement(required = true, nillable = true)
    protected String locale;

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the itemsIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatementIncludeEnum }
     *     
     */
    public AccountStatementIncludeEnum getItemsIncluded() {
        return itemsIncluded;
    }

    /**
     * Sets the value of the itemsIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatementIncludeEnum }
     *     
     */
    public void setItemsIncluded(AccountStatementIncludeEnum value) {
        this.itemsIncluded = value;
    }

    /**
     * Gets the value of the ignoreAutoTransfers property.
     * 
     */
    public boolean isIgnoreAutoTransfers() {
        return ignoreAutoTransfers;
    }

    /**
     * Sets the value of the ignoreAutoTransfers property.
     * 
     */
    public void setIgnoreAutoTransfers(boolean value) {
        this.ignoreAutoTransfers = value;
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
