
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.StoreOwnerShipType;
import org.datacontract.schemas._2004._07.cxs_subsystem.WarehouseType;


/**
 * <p>Java class for Warehouse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Warehouse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwnerShipType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Security}StoreOwnerShipType"/>
 *         &lt;element name="WarehouseType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}WarehouseType"/>
 *         &lt;element name="Address" type="{http://www.iVend.com/IIntegrationService/2010/12}Address" minOccurs="0"/>
 *         &lt;element name="SalesTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTransitWarehouseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Warehouse", propOrder = {
    "id",
    "description",
    "branchCode",
    "ownerShipType",
    "warehouseType",
    "address",
    "salesTaxCodeId",
    "purchaseTaxCodeId",
    "inTransitWarehouseId",
    "priceListId"
})
public class Warehouse
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "BranchCode", required = true, nillable = true)
    protected String branchCode;
    @XmlElement(name = "OwnerShipType", required = true)
    protected StoreOwnerShipType ownerShipType;
    @XmlElement(name = "WarehouseType", required = true)
    protected WarehouseType warehouseType;
    @XmlElementRef(name = "Address", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> address;
    @XmlElementRef(name = "SalesTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesTaxCodeId;
    @XmlElementRef(name = "PurchaseTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseTaxCodeId;
    @XmlElementRef(name = "InTransitWarehouseId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inTransitWarehouseId;
    @XmlElementRef(name = "PriceListId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceListId;

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
     * Gets the value of the ownerShipType property.
     * 
     * @return
     *     possible object is
     *     {@link StoreOwnerShipType }
     *     
     */
    public StoreOwnerShipType getOwnerShipType() {
        return ownerShipType;
    }

    /**
     * Sets the value of the ownerShipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreOwnerShipType }
     *     
     */
    public void setOwnerShipType(StoreOwnerShipType value) {
        this.ownerShipType = value;
    }

    /**
     * Gets the value of the warehouseType property.
     * 
     * @return
     *     possible object is
     *     {@link WarehouseType }
     *     
     */
    public WarehouseType getWarehouseType() {
        return warehouseType;
    }

    /**
     * Sets the value of the warehouseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarehouseType }
     *     
     */
    public void setWarehouseType(WarehouseType value) {
        this.warehouseType = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setAddress(JAXBElement<Address> value) {
        this.address = value;
    }

    /**
     * Gets the value of the salesTaxCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesTaxCodeId() {
        return salesTaxCodeId;
    }

    /**
     * Sets the value of the salesTaxCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesTaxCodeId(JAXBElement<String> value) {
        this.salesTaxCodeId = value;
    }

    /**
     * Gets the value of the purchaseTaxCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchaseTaxCodeId() {
        return purchaseTaxCodeId;
    }

    /**
     * Sets the value of the purchaseTaxCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchaseTaxCodeId(JAXBElement<String> value) {
        this.purchaseTaxCodeId = value;
    }

    /**
     * Gets the value of the inTransitWarehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInTransitWarehouseId() {
        return inTransitWarehouseId;
    }

    /**
     * Sets the value of the inTransitWarehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInTransitWarehouseId(JAXBElement<String> value) {
        this.inTransitWarehouseId = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriceListId(JAXBElement<String> value) {
        this.priceListId = value;
    }

}
