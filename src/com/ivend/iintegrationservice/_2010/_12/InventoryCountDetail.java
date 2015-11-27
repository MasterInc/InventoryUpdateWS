
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryCountDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryCountDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InventoryCountSerialDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfInventoryCountSerialDetail" minOccurs="0"/>
 *         &lt;element name="InventoryCountBatchDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfInventoryCountBatchDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryCountDetail", propOrder = {
    "productId",
    "countedQuantity",
    "inventoryCountSerialDetailList",
    "inventoryCountBatchDetailList"
})
public class InventoryCountDetail
    extends BaseWrapper
{

    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElement(name = "CountedQuantity", required = true)
    protected BigDecimal countedQuantity;
    @XmlElementRef(name = "InventoryCountSerialDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInventoryCountSerialDetail> inventoryCountSerialDetailList;
    @XmlElementRef(name = "InventoryCountBatchDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInventoryCountBatchDetail> inventoryCountBatchDetailList;

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
     * Gets the value of the countedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountedQuantity() {
        return countedQuantity;
    }

    /**
     * Sets the value of the countedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountedQuantity(BigDecimal value) {
        this.countedQuantity = value;
    }

    /**
     * Gets the value of the inventoryCountSerialDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountSerialDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventoryCountSerialDetail> getInventoryCountSerialDetailList() {
        return inventoryCountSerialDetailList;
    }

    /**
     * Sets the value of the inventoryCountSerialDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountSerialDetail }{@code >}
     *     
     */
    public void setInventoryCountSerialDetailList(JAXBElement<ArrayOfInventoryCountSerialDetail> value) {
        this.inventoryCountSerialDetailList = value;
    }

    /**
     * Gets the value of the inventoryCountBatchDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountBatchDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventoryCountBatchDetail> getInventoryCountBatchDetailList() {
        return inventoryCountBatchDetailList;
    }

    /**
     * Sets the value of the inventoryCountBatchDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountBatchDetail }{@code >}
     *     
     */
    public void setInventoryCountBatchDetailList(JAXBElement<ArrayOfInventoryCountBatchDetail> value) {
        this.inventoryCountBatchDetailList = value;
    }

}
