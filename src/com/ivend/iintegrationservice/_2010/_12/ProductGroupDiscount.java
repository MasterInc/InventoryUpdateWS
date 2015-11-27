
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductGroupDiscount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductGroupDiscount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}DiscountGroup">
 *       &lt;sequence>
 *         &lt;element name="ProductGroupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductGroupDiscount", propOrder = {
    "productGroupId"
})
public class ProductGroupDiscount
    extends DiscountGroup
{

    @XmlElement(name = "ProductGroupId", required = true, nillable = true)
    protected String productGroupId;

    /**
     * Gets the value of the productGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroupId() {
        return productGroupId;
    }

    /**
     * Sets the value of the productGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroupId(String value) {
        this.productGroupId = value;
    }

}
