
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMUBetsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMUBetsResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="bets" type="{http://www.betfair.com/publicapi/types/exchange/v5/}ArrayOfMUBet"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetMUBetsErrorEnum"/>
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
@XmlType(name = "GetMUBetsResp", propOrder = {
    "bets",
    "errorCode",
    "minorErrorCode",
    "totalRecordCount"
})
public class GetMUBetsResp
    extends APIResponse
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfMUBet bets;
    @XmlElement(required = true)
    protected GetMUBetsErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    protected int totalRecordCount;

    /**
     * Gets the value of the bets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMUBet }
     *     
     */
    public ArrayOfMUBet getBets() {
        return bets;
    }

    /**
     * Sets the value of the bets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMUBet }
     *     
     */
    public void setBets(ArrayOfMUBet value) {
        this.bets = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetMUBetsErrorEnum }
     *     
     */
    public GetMUBetsErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMUBetsErrorEnum }
     *     
     */
    public void setErrorCode(GetMUBetsErrorEnum value) {
        this.errorCode = value;
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
