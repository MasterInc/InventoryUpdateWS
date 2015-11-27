
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_subsystem.BatchStatus;


/**
 * <p>Java class for Batch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Batch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ProductKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AdmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ManufacturingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InStockQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CommittedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OnOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OnRentQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LostQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InReturnQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OnLayawayQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReleasedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}BatchStatus"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Batch", propOrder = {
    "id",
    "description",
    "batchNumber",
    "warehouseKey",
    "productKey",
    "admissionDate",
    "expirationDate",
    "manufacturingDate",
    "inStockQuantity",
    "committedQuantity",
    "onOrderQuantity",
    "onRentQuantity",
    "lostQuantity",
    "inReturnQuantity",
    "availableQuantity",
    "onLayawayQuantity",
    "releasedQuantity",
    "status",
    "price",
    "warehouseId",
    "productId"
})
public class Batch
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "BatchNumber", required = true, nillable = true)
    protected String batchNumber;
    @XmlElement(name = "WarehouseKey")
    protected long warehouseKey;
    @XmlElement(name = "ProductKey")
    protected long productKey;
    @XmlElementRef(name = "AdmissionDate", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> admissionDate;
    @XmlElementRef(name = "ExpirationDate", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expirationDate;
    @XmlElementRef(name = "ManufacturingDate", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> manufacturingDate;
    @XmlElement(name = "InStockQuantity", required = true)
    protected BigDecimal inStockQuantity;
    @XmlElement(name = "CommittedQuantity")
    protected BigDecimal committedQuantity;
    @XmlElement(name = "OnOrderQuantity")
    protected BigDecimal onOrderQuantity;
    @XmlElement(name = "OnRentQuantity")
    protected BigDecimal onRentQuantity;
    @XmlElement(name = "LostQuantity")
    protected BigDecimal lostQuantity;
    @XmlElement(name = "InReturnQuantity")
    protected BigDecimal inReturnQuantity;
    @XmlElement(name = "AvailableQuantity", required = true)
    protected BigDecimal availableQuantity;
    @XmlElement(name = "OnLayawayQuantity")
    protected BigDecimal onLayawayQuantity;
    @XmlElement(name = "ReleasedQuantity")
    protected BigDecimal releasedQuantity;
    @XmlElement(name = "Status", required = true)
    protected BatchStatus status;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "WarehouseId", required = true, nillable = true)
    protected String warehouseId;
    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the batchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNumber(String value) {
        this.batchNumber = value;
    }

    /**
     * Gets the value of the warehouseKey property.
     * 
     */
    public long getWarehouseKey() {
        return warehouseKey;
    }

    /**
     * Sets the value of the warehouseKey property.
     * 
     */
    public void setWarehouseKey(long value) {
        this.warehouseKey = value;
    }

    /**
     * Gets the value of the productKey property.
     * 
     */
    public long getProductKey() {
        return productKey;
    }

    /**
     * Sets the value of the productKey property.
     * 
     */
    public void setProductKey(long value) {
        this.productKey = value;
    }

    /**
     * Gets the value of the admissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAdmissionDate() {
        return admissionDate;
    }

    /**
     * Sets the value of the admissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAdmissionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.admissionDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the manufacturingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getManufacturingDate() {
        return manufacturingDate;
    }

    /**
     * Sets the value of the manufacturingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setManufacturingDate(JAXBElement<XMLGregorianCalendar> value) {
        this.manufacturingDate = value;
    }

    /**
     * Gets the value of the inStockQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInStockQuantity() {
        return inStockQuantity;
    }

    /**
     * Sets the value of the inStockQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInStockQuantity(BigDecimal value) {
        this.inStockQuantity = value;
    }

    /**
     * Gets the value of the committedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommittedQuantity() {
        return committedQuantity;
    }

    /**
     * Sets the value of the committedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommittedQuantity(BigDecimal value) {
        this.committedQuantity = value;
    }

    /**
     * Gets the value of the onOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnOrderQuantity() {
        return onOrderQuantity;
    }

    /**
     * Sets the value of the onOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnOrderQuantity(BigDecimal value) {
        this.onOrderQuantity = value;
    }

    /**
     * Gets the value of the onRentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnRentQuantity() {
        return onRentQuantity;
    }

    /**
     * Sets the value of the onRentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnRentQuantity(BigDecimal value) {
        this.onRentQuantity = value;
    }

    /**
     * Gets the value of the lostQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLostQuantity() {
        return lostQuantity;
    }

    /**
     * Sets the value of the lostQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLostQuantity(BigDecimal value) {
        this.lostQuantity = value;
    }

    /**
     * Gets the value of the inReturnQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInReturnQuantity() {
        return inReturnQuantity;
    }

    /**
     * Sets the value of the inReturnQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInReturnQuantity(BigDecimal value) {
        this.inReturnQuantity = value;
    }

    /**
     * Gets the value of the availableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableQuantity(BigDecimal value) {
        this.availableQuantity = value;
    }

    /**
     * Gets the value of the onLayawayQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnLayawayQuantity() {
        return onLayawayQuantity;
    }

    /**
     * Sets the value of the onLayawayQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnLayawayQuantity(BigDecimal value) {
        this.onLayawayQuantity = value;
    }

    /**
     * Gets the value of the releasedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReleasedQuantity() {
        return releasedQuantity;
    }

    /**
     * Sets the value of the releasedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReleasedQuantity(BigDecimal value) {
        this.releasedQuantity = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BatchStatus }
     *     
     */
    public BatchStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchStatus }
     *     
     */
    public void setStatus(BatchStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
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

}
