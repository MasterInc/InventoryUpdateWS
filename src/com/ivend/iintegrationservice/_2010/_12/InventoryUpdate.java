
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryUpdate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfInventoryUpdateSerial" minOccurs="0"/>
 *         &lt;element name="BatchDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfInventoryUpdateBatch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryUpdate", propOrder = {
    "productId",
    "inQuantity",
    "outQuantity",
    "warehouseCode",
    "branchCode",
    "transactionNumber",
    "transactionType",
    "baseReference",
    "location",
    "serialDetailList",
    "batchDetailList"
})
public class InventoryUpdate
    extends BaseWrapper
{

    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElement(name = "InQuantity", required = true)
    protected BigDecimal inQuantity;
    @XmlElement(name = "OutQuantity", required = true)
    protected BigDecimal outQuantity;
    @XmlElement(name = "WarehouseCode", required = true, nillable = true)
    protected String warehouseCode;
    @XmlElement(name = "BranchCode", required = true, nillable = true)
    protected String branchCode;
    @XmlElementRef(name = "TransactionNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionNumber;
    @XmlElementRef(name = "TransactionType", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionType;
    @XmlElementRef(name = "BaseReference", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseReference;
    @XmlElementRef(name = "Location", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "SerialDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInventoryUpdateSerial> serialDetailList;
    @XmlElementRef(name = "BatchDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInventoryUpdateBatch> batchDetailList;

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
     * Gets the value of the inQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInQuantity() {
        return inQuantity;
    }

    /**
     * Sets the value of the inQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInQuantity(BigDecimal value) {
        this.inQuantity = value;
    }

    /**
     * Gets the value of the outQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutQuantity() {
        return outQuantity;
    }

    /**
     * Sets the value of the outQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutQuantity(BigDecimal value) {
        this.outQuantity = value;
    }

    /**
     * Gets the value of the warehouseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * Sets the value of the warehouseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseCode(String value) {
        this.warehouseCode = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the transactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionNumber(JAXBElement<String> value) {
        this.transactionNumber = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionType(JAXBElement<String> value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the baseReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseReference() {
        return baseReference;
    }

    /**
     * Sets the value of the baseReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseReference(JAXBElement<String> value) {
        this.baseReference = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
    }

    /**
     * Gets the value of the serialDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdateSerial }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventoryUpdateSerial> getSerialDetailList() {
        return serialDetailList;
    }

    /**
     * Sets the value of the serialDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdateSerial }{@code >}
     *     
     */
    public void setSerialDetailList(JAXBElement<ArrayOfInventoryUpdateSerial> value) {
        this.serialDetailList = value;
    }

    /**
     * Gets the value of the batchDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdateBatch }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventoryUpdateBatch> getBatchDetailList() {
        return batchDetailList;
    }

    /**
     * Sets the value of the batchDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdateBatch }{@code >}
     *     
     */
    public void setBatchDetailList(JAXBElement<ArrayOfInventoryUpdateBatch> value) {
        this.batchDetailList = value;
    }

}
