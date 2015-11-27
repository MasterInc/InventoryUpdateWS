
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_subsystem.SerialStatus;


/**
 * <p>Java class for Serial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Serial">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ProductKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AdmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ManufacturingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}SerialStatus"/>
 *         &lt;element name="SystemNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalSerialKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "Serial", propOrder = {
    "id",
    "description",
    "serialNumber",
    "warehouseKey",
    "productKey",
    "admissionDate",
    "expirationDate",
    "manufacturingDate",
    "status",
    "systemNumber",
    "manufacturerSerialNumber",
    "originalSerialKey",
    "price",
    "warehouseId",
    "productId"
})
public class Serial
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "SerialNumber", required = true, nillable = true)
    protected String serialNumber;
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
    @XmlElement(name = "Status", required = true)
    protected SerialStatus status;
    @XmlElementRef(name = "SystemNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> systemNumber;
    @XmlElementRef(name = "ManufacturerSerialNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufacturerSerialNumber;
    @XmlElement(name = "OriginalSerialKey")
    protected Long originalSerialKey;
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
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SerialStatus }
     *     
     */
    public SerialStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialStatus }
     *     
     */
    public void setStatus(SerialStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the systemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSystemNumber() {
        return systemNumber;
    }

    /**
     * Sets the value of the systemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSystemNumber(JAXBElement<Integer> value) {
        this.systemNumber = value;
    }

    /**
     * Gets the value of the manufacturerSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufacturerSerialNumber() {
        return manufacturerSerialNumber;
    }

    /**
     * Sets the value of the manufacturerSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufacturerSerialNumber(JAXBElement<String> value) {
        this.manufacturerSerialNumber = value;
    }

    /**
     * Gets the value of the originalSerialKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalSerialKey() {
        return originalSerialKey;
    }

    /**
     * Sets the value of the originalSerialKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalSerialKey(Long value) {
        this.originalSerialKey = value;
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
