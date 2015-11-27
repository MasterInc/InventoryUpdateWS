
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManufacturerGroupDiscount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturerGroupDiscount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}DiscountGroup">
 *       &lt;sequence>
 *         &lt;element name="ManufacturerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturerGroupDiscount", propOrder = {
    "manufacturerId"
})
public class ManufacturerGroupDiscount
    extends DiscountGroup
{

    @XmlElement(name = "ManufacturerId", required = true, nillable = true)
    protected String manufacturerId;

    /**
     * Gets the value of the manufacturerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerId() {
        return manufacturerId;
    }

    /**
     * Sets the value of the manufacturerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerId(String value) {
        this.manufacturerId = value;
    }

}
