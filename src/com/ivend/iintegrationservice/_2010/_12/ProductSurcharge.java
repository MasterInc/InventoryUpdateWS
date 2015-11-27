
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.ProductSurchargeType;


/**
 * <p>Java class for ProductSurcharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSurcharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ParentProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SurchargeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductSurchargeType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}ProductSurchargeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSurcharge", propOrder = {
    "parentProductId",
    "surchargeId",
    "productSurchargeType"
})
public class ProductSurcharge
    extends BaseWrapper
{

    @XmlElement(name = "ParentProductId", required = true, nillable = true)
    protected String parentProductId;
    @XmlElement(name = "SurchargeId", required = true, nillable = true)
    protected String surchargeId;
    @XmlElement(name = "ProductSurchargeType")
    protected ProductSurchargeType productSurchargeType;

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
     * Gets the value of the surchargeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeId() {
        return surchargeId;
    }

    /**
     * Sets the value of the surchargeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeId(String value) {
        this.surchargeId = value;
    }

    /**
     * Gets the value of the productSurchargeType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSurchargeType }
     *     
     */
    public ProductSurchargeType getProductSurchargeType() {
        return productSurchargeType;
    }

    /**
     * Sets the value of the productSurchargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSurchargeType }
     *     
     */
    public void setProductSurchargeType(ProductSurchargeType value) {
        this.productSurchargeType = value;
    }

}
