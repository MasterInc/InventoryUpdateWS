
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerGroupDiscount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerGroupDiscount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}DiscountGroup">
 *       &lt;sequence>
 *         &lt;element name="CustomerGroupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerGroupDiscount", propOrder = {
    "customerGroupId"
})
public class CustomerGroupDiscount
    extends DiscountGroup
{

    @XmlElement(name = "CustomerGroupId", required = true, nillable = true)
    protected String customerGroupId;

    /**
     * Gets the value of the customerGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGroupId() {
        return customerGroupId;
    }

    /**
     * Sets the value of the customerGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGroupId(String value) {
        this.customerGroupId = value;
    }

}
