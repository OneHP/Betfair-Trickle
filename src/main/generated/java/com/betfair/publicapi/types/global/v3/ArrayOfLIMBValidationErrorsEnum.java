
package com.betfair.publicapi.types.global.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLIMBValidationErrorsEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLIMBValidationErrorsEnum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIMBValidationErrorsEnum" type="{http://www.betfair.com/publicapi/types/global/v3/}LIMBValidationErrorsEnum" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLIMBValidationErrorsEnum", propOrder = {
    "limbValidationErrorsEnum"
})
public class ArrayOfLIMBValidationErrorsEnum {

    @XmlElement(name = "LIMBValidationErrorsEnum", namespace = "http://www.betfair.com/publicapi/types/global/v3/", nillable = true)
    protected List<LIMBValidationErrorsEnum> limbValidationErrorsEnum;

    /**
     * Gets the value of the limbValidationErrorsEnum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limbValidationErrorsEnum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLIMBValidationErrorsEnum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIMBValidationErrorsEnum }
     * 
     * 
     */
    public List<LIMBValidationErrorsEnum> getLIMBValidationErrorsEnum() {
        if (limbValidationErrorsEnum == null) {
            limbValidationErrorsEnum = new ArrayList<LIMBValidationErrorsEnum>();
        }
        return this.limbValidationErrorsEnum;
    }

}
