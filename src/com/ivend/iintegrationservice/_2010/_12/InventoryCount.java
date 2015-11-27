
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryCount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InventoryCountDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfInventoryCountDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryCount", propOrder = {
    "id",
    "warehouseId",
    "countedBy",
    "inventoryCountDetailList"
})
public class InventoryCount
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "WarehouseId", required = true, nillable = true)
    protected String warehouseId;
    @XmlElement(name = "CountedBy", required = true, nillable = true)
    protected String countedBy;
    @XmlElementRef(name = "InventoryCountDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInventoryCountDetail> inventoryCountDetailList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the warehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseId() {
        return warehouseId;
    }

    /**
     * Sets the value of the warehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseId(String value) {
        this.warehouseId = value;
    }

    /**
     * Gets the value of the countedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountedBy() {
        return countedBy;
    }

    /**
     * Sets the value of the countedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountedBy(String value) {
        this.countedBy = value;
    }

    /**
     * Gets the value of the inventoryCountDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventoryCountDetail> getInventoryCountDetailList() {
        return inventoryCountDetailList;
    }

    /**
     * Sets the value of the inventoryCountDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountDetail }{@code >}
     *     
     */
    public void setInventoryCountDetailList(JAXBElement<ArrayOfInventoryCountDetail> value) {
        this.inventoryCountDetailList = value;
    }

}
