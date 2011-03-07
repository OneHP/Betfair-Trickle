
package com.betfair.publicapi.types.global.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateAccountResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAccountResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/global/v3/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accountStatus" type="{http://www.betfair.com/publicapi/types/global/v3/}AccountStatusEnum"/>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/global/v3/}CreateAccountErrorEnum"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="validationErrors" type="{http://www.betfair.com/publicapi/types/global/v3/}ArrayOfValidationErrorsEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAccountResp", propOrder = {
    "accountId",
    "accountStatus",
    "errorCode",
    "minorErrorCode",
    "tan",
    "userId",
    "validationErrors"
})
public class CreateAccountResp
    extends APIResponse
{

    protected int accountId;
    @XmlElement(required = true)
    protected AccountStatusEnum accountStatus;
    @XmlElement(required = true)
    protected CreateAccountErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;
    @XmlElement(required = true, nillable = true)
    protected String tan;
    protected int userId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfValidationErrorsEnum validationErrors;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(int value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusEnum }
     *     
     */
    public AccountStatusEnum getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusEnum }
     *     
     */
    public void setAccountStatus(AccountStatusEnum value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link CreateAccountErrorEnum }
     *     
     */
    public CreateAccountErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateAccountErrorEnum }
     *     
     */
    public void setErrorCode(CreateAccountErrorEnum value) {
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
     * Gets the value of the tan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTan() {
        return tan;
    }

    /**
     * Sets the value of the tan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTan(String value) {
        this.tan = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationErrorsEnum }
     *     
     */
    public ArrayOfValidationErrorsEnum getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationErrorsEnum }
     *     
     */
    public void setValidationErrors(ArrayOfValidationErrorsEnum value) {
        this.validationErrors = value;
    }

}
