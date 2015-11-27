
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductMerchandiseHierarchyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMerchandiseHierarchyDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HierarchyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HierarchyDetailKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HierarchyDetailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMerchandiseHierarchyDetail", propOrder = {
    "productId",
    "hierarchyId",
    "hierarchyDetailKey",
    "isActive",
    "hierarchyDetailId"
})
public class ProductMerchandiseHierarchyDetail
    extends BaseWrapper
{

    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElement(name = "HierarchyId", required = true, nillable = true)
    protected String hierarchyId;
    @XmlElementRef(name = "HierarchyDetailKey", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hierarchyDetailKey;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElementRef(name = "HierarchyDetailId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hierarchyDetailId;

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
     * Gets the value of the hierarchyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyId() {
        return hierarchyId;
    }

    /**
     * Sets the value of the hierarchyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyId(String value) {
        this.hierarchyId = value;
    }

    /**
     * Gets the value of the hierarchyDetailKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHierarchyDetailKey() {
        return hierarchyDetailKey;
    }

    /**
     * Sets the value of the hierarchyDetailKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHierarchyDetailKey(JAXBElement<String> value) {
        this.hierarchyDetailKey = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the hierarchyDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHierarchyDetailId() {
        return hierarchyDetailId;
    }

    /**
     * Sets the value of the hierarchyDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHierarchyDetailId(JAXBElement<String> value) {
        this.hierarchyDetailId = value;
    }

}
