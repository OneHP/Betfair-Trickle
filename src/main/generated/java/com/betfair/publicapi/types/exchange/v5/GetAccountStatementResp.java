
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountStatementResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountStatementResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetAccountStatementErrorEnum"/>
 *         &lt;element name="items" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfAccountStatementItem"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalRecordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountStatementResp", propOrder = {
    "errorCode",
    "items",
    "minorErrorCode",
    "totalRecordCount"
})
public class GetAccountStatementResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected GetAccountStatementErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAccountStatementItem items;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    protected int totalRecordCount;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountStatementErrorEnum }
     *     
     */
    public GetAccountStatementErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountStatementErrorEnum }
     *     
     */
    public void setErrorCode(GetAccountStatementErrorEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountStatementItem }
     *     
     */
    public ArrayOfAccountStatementItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountStatementItem }
     *     
     */
    public void setItems(ArrayOfAccountStatementItem value) {
        this.items = value;
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
     * Gets the value of the totalRecordCount property.
     * 
     */
    public int getTotalRecordCount() {
        return totalRecordCount;
    }

    /**
     * Sets the value of the totalRecordCount property.
     * 
     */
    public void setTotalRecordCount(int value) {
        this.totalRecordCount = value;
    }

}
