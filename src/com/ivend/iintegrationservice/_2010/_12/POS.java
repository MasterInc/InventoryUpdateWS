
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.POSType;


/**
 * <p>Java class for POS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepartmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HardwareProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetailProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerStartNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="POSType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}POSType"/>
 *         &lt;element name="HardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POS", propOrder = {
    "id",
    "description",
    "storeId",
    "departmentId",
    "isEnabled",
    "hardwareProfileId",
    "retailProfileId",
    "printProfileId",
    "customerLength",
    "customerPrefix",
    "customerStartNumber",
    "posType",
    "hardwareId"
})
public class POS
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "StoreId", required = true, nillable = true)
    protected String storeId;
    @XmlElementRef(name = "DepartmentId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentId;
    @XmlElement(name = "IsEnabled")
    protected boolean isEnabled;
    @XmlElementRef(name = "HardwareProfileId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hardwareProfileId;
    @XmlElementRef(name = "RetailProfileId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailProfileId;
    @XmlElementRef(name = "PrintProfileId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> printProfileId;
    @XmlElement(name = "CustomerLength")
    protected Integer customerLength;
    @XmlElementRef(name = "CustomerPrefix", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerPrefix;
    @XmlElement(name = "CustomerStartNumber")
    protected Integer customerStartNumber;
    @XmlElement(name = "POSType", required = true)
    protected POSType posType;
    @XmlElementRef(name = "HardwareId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hardwareId;

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
     * Gets the value of the storeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreId(String value) {
        this.storeId = value;
    }

    /**
     * Gets the value of the departmentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the value of the departmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentId(JAXBElement<String> value) {
        this.departmentId = value;
    }

    /**
     * Gets the value of the isEnabled property.
     * 
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     * 
     */
    public void setIsEnabled(boolean value) {
        this.isEnabled = value;
    }

    /**
     * Gets the value of the hardwareProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHardwareProfileId() {
        return hardwareProfileId;
    }

    /**
     * Sets the value of the hardwareProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHardwareProfileId(JAXBElement<String> value) {
        this.hardwareProfileId = value;
    }

    /**
     * Gets the value of the retailProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailProfileId() {
        return retailProfileId;
    }

    /**
     * Sets the value of the retailProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailProfileId(JAXBElement<String> value) {
        this.retailProfileId = value;
    }

    /**
     * Gets the value of the printProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrintProfileId() {
        return printProfileId;
    }

    /**
     * Sets the value of the printProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrintProfileId(JAXBElement<String> value) {
        this.printProfileId = value;
    }

    /**
     * Gets the value of the customerLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerLength() {
        return customerLength;
    }

    /**
     * Sets the value of the customerLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerLength(Integer value) {
        this.customerLength = value;
    }

    /**
     * Gets the value of the customerPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerPrefix() {
        return customerPrefix;
    }

    /**
     * Sets the value of the customerPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerPrefix(JAXBElement<String> value) {
        this.customerPrefix = value;
    }

    /**
     * Gets the value of the customerStartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerStartNumber() {
        return customerStartNumber;
    }

    /**
     * Sets the value of the customerStartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerStartNumber(Integer value) {
        this.customerStartNumber = value;
    }

    /**
     * Gets the value of the posType property.
     * 
     * @return
     *     possible object is
     *     {@link POSType }
     *     
     */
    public POSType getPOSType() {
        return posType;
    }

    /**
     * Sets the value of the posType property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSType }
     *     
     */
    public void setPOSType(POSType value) {
        this.posType = value;
    }

    /**
     * Gets the value of the hardwareId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHardwareId() {
        return hardwareId;
    }

    /**
     * Sets the value of the hardwareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHardwareId(JAXBElement<String> value) {
        this.hardwareId = value;
    }

}
