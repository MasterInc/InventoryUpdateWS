
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductUpsell complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductUpsell">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ParentProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AutoAddToTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductUpsell", propOrder = {
    "parentProductId",
    "productId",
    "autoAddToTransaction"
})
public class ProductUpsell
    extends BaseWrapper
{

    @XmlElement(name = "ParentProductId", required = true, nillable = true)
    protected String parentProductId;
    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElement(name = "AutoAddToTransaction")
    protected boolean autoAddToTransaction;

    /**
     * Gets the value of the parentProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProductId() {
        return parentProductId;
    }

    /**
     * Sets the value of the parentProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProductId(String value) {
        this.parentProductId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the autoAddToTransaction property.
     * 
     */
    public boolean isAutoAddToTransaction() {
        return autoAddToTransaction;
    }

    /**
     * Sets the value of the autoAddToTransaction property.
     * 
     */
    public void setAutoAddToTransaction(boolean value) {
        this.autoAddToTransaction = value;
    }

}
