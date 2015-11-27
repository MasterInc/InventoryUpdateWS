
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_subsystem.StoreType;


/**
 * <p>Java class for Store complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Store">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetailProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FulfillmentPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerStartNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VendorLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VendorPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VendorStartNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductStartNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LayawayPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingStoreGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DefaultNumberSeriesId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StoreType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core}StoreType"/>
 *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TaxationStoreGroupKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LayawayFulfillmentPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseCurrencyKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounrtyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Store", propOrder = {
    "id",
    "description",
    "retailProfileId",
    "cashCustomerId",
    "purchaseTaxCodeId",
    "salesTaxCodeId",
    "warehouseId",
    "email",
    "bankAccount",
    "bank",
    "fulfillmentPlanId",
    "address1",
    "address2",
    "address3",
    "city",
    "zipCode",
    "phoneNumber",
    "customerLength",
    "customerPrefix",
    "customerStartNumber",
    "vendorLength",
    "vendorPrefix",
    "vendorStartNumber",
    "productLength",
    "productPrefix",
    "productStartNumber",
    "layawayPlanId",
    "salesPersonId",
    "pricingStoreGroupId",
    "priceListId",
    "defaultNumberSeriesId",
    "siteId",
    "storeType",
    "businessDate",
    "taxationStoreGroupKey",
    "layawayFulfillmentPlanId",
    "baseCurrencyKey",
    "stateId",
    "counrtyId"
})
public class Store
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "RetailProfileId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailProfileId;
    @XmlElementRef(name = "CashCustomerId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cashCustomerId;
    @XmlElementRef(name = "PurchaseTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseTaxCodeId;
    @XmlElementRef(name = "SalesTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesTaxCodeId;
    @XmlElement(name = "WarehouseId", required = true, nillable = true)
    protected String warehouseId;
    @XmlElementRef(name = "Email", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "BankAccount", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankAccount;
    @XmlElementRef(name = "Bank", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bank;
    @XmlElementRef(name = "FulfillmentPlanId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fulfillmentPlanId;
    @XmlElementRef(name = "Address1", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address1;
    @XmlElementRef(name = "Address2", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address2;
    @XmlElementRef(name = "Address3", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address3;
    @XmlElementRef(name = "City", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "ZipCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zipCode;
    @XmlElementRef(name = "PhoneNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumber;
    @XmlElement(name = "CustomerLength")
    protected int customerLength;
    @XmlElement(name = "CustomerPrefix", required = true, nillable = true)
    protected String customerPrefix;
    @XmlElement(name = "CustomerStartNumber")
    protected int customerStartNumber;
    @XmlElement(name = "VendorLength")
    protected int vendorLength;
    @XmlElement(name = "VendorPrefix", required = true, nillable = true)
    protected String vendorPrefix;
    @XmlElement(name = "VendorStartNumber")
    protected int vendorStartNumber;
    @XmlElement(name = "ProductLength")
    protected int productLength;
    @XmlElement(name = "ProductPrefix", required = true, nillable = true)
    protected String productPrefix;
    @XmlElement(name = "ProductStartNumber")
    protected int productStartNumber;
    @XmlElementRef(name = "LayawayPlanId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> layawayPlanId;
    @XmlElementRef(name = "SalesPersonId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesPersonId;
    @XmlElementRef(name = "PricingStoreGroupId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pricingStoreGroupId;
    @XmlElement(name = "PriceListId", required = true, nillable = true)
    protected String priceListId;
    @XmlElementRef(name = "DefaultNumberSeriesId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultNumberSeriesId;
    @XmlElement(name = "SiteId")
    protected Integer siteId;
    @XmlElement(name = "StoreType", required = true)
    protected StoreType storeType;
    @XmlElement(name = "BusinessDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar businessDate;
    @XmlElement(name = "TaxationStoreGroupKey")
    protected Long taxationStoreGroupKey;
    @XmlElementRef(name = "LayawayFulfillmentPlanId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> layawayFulfillmentPlanId;
    @XmlElement(name = "BaseCurrencyKey")
    protected Long baseCurrencyKey;
    @XmlElementRef(name = "StateId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateId;
    @XmlElementRef(name = "CounrtyId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> counrtyId;

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
     * Gets the value of the cashCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashCustomerId() {
        return cashCustomerId;
    }

    /**
     * Sets the value of the cashCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashCustomerId(JAXBElement<String> value) {
        this.cashCustomerId = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAccount(JAXBElement<String> value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBank(JAXBElement<String> value) {
        this.bank = value;
    }

    /**
     * Gets the value of the fulfillmentPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFulfillmentPlanId() {
        return fulfillmentPlanId;
    }

    /**
     * Sets the value of the fulfillmentPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFulfillmentPlanId(JAXBElement<String> value) {
        this.fulfillmentPlanId = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress1(JAXBElement<String> value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress2(JAXBElement<String> value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress3(JAXBElement<String> value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZipCode(JAXBElement<String> value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the customerLength property.
     * 
     */
    public int getCustomerLength() {
        return customerLength;
    }

    /**
     * Sets the value of the customerLength property.
     * 
     */
    public void setCustomerLength(int value) {
        this.customerLength = value;
    }

    /**
     * Gets the value of the customerPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPrefix() {
        return customerPrefix;
    }

    /**
     * Sets the value of the customerPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPrefix(String value) {
        this.customerPrefix = value;
    }

    /**
     * Gets the value of the customerStartNumber property.
     * 
     */
    public int getCustomerStartNumber() {
        return customerStartNumber;
    }

    /**
     * Sets the value of the customerStartNumber property.
     * 
     */
    public void setCustomerStartNumber(int value) {
        this.customerStartNumber = value;
    }

    /**
     * Gets the value of the vendorLength property.
     * 
     */
    public int getVendorLength() {
        return vendorLength;
    }

    /**
     * Sets the value of the vendorLength property.
     * 
     */
    public void setVendorLength(int value) {
        this.vendorLength = value;
    }

    /**
     * Gets the value of the vendorPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorPrefix() {
        return vendorPrefix;
    }

    /**
     * Sets the value of the vendorPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorPrefix(String value) {
        this.vendorPrefix = value;
    }

    /**
     * Gets the value of the vendorStartNumber property.
     * 
     */
    public int getVendorStartNumber() {
        return vendorStartNumber;
    }

    /**
     * Sets the value of the vendorStartNumber property.
     * 
     */
    public void setVendorStartNumber(int value) {
        this.vendorStartNumber = value;
    }

    /**
     * Gets the value of the productLength property.
     * 
     */
    public int getProductLength() {
        return productLength;
    }

    /**
     * Sets the value of the productLength property.
     * 
     */
    public void setProductLength(int value) {
        this.productLength = value;
    }

    /**
     * Gets the value of the productPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPrefix() {
        return productPrefix;
    }

    /**
     * Sets the value of the productPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPrefix(String value) {
        this.productPrefix = value;
    }

    /**
     * Gets the value of the productStartNumber property.
     * 
     */
    public int getProductStartNumber() {
        return productStartNumber;
    }

    /**
     * Sets the value of the productStartNumber property.
     * 
     */
    public void setProductStartNumber(int value) {
        this.productStartNumber = value;
    }

    /**
     * Gets the value of the layawayPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLayawayPlanId() {
        return layawayPlanId;
    }

    /**
     * Sets the value of the layawayPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLayawayPlanId(JAXBElement<String> value) {
        this.layawayPlanId = value;
    }

    /**
     * Gets the value of the salesPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesPersonId() {
        return salesPersonId;
    }

    /**
     * Sets the value of the salesPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesPersonId(JAXBElement<String> value) {
        this.salesPersonId = value;
    }

    /**
     * Gets the value of the pricingStoreGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPricingStoreGroupId() {
        return pricingStoreGroupId;
    }

    /**
     * Sets the value of the pricingStoreGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPricingStoreGroupId(JAXBElement<String> value) {
        this.pricingStoreGroupId = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListId(String value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the defaultNumberSeriesId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultNumberSeriesId() {
        return defaultNumberSeriesId;
    }

    /**
     * Sets the value of the defaultNumberSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultNumberSeriesId(JAXBElement<String> value) {
        this.defaultNumberSeriesId = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSiteId(Integer value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the storeType property.
     * 
     * @return
     *     possible object is
     *     {@link StoreType }
     *     
     */
    public StoreType getStoreType() {
        return storeType;
    }

    /**
     * Sets the value of the storeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreType }
     *     
     */
    public void setStoreType(StoreType value) {
        this.storeType = value;
    }

    /**
     * Gets the value of the businessDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBusinessDate() {
        return businessDate;
    }

    /**
     * Sets the value of the businessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBusinessDate(XMLGregorianCalendar value) {
        this.businessDate = value;
    }

    /**
     * Gets the value of the taxationStoreGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxationStoreGroupKey() {
        return taxationStoreGroupKey;
    }

    /**
     * Sets the value of the taxationStoreGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxationStoreGroupKey(Long value) {
        this.taxationStoreGroupKey = value;
    }

    /**
     * Gets the value of the layawayFulfillmentPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLayawayFulfillmentPlanId() {
        return layawayFulfillmentPlanId;
    }

    /**
     * Sets the value of the layawayFulfillmentPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLayawayFulfillmentPlanId(JAXBElement<String> value) {
        this.layawayFulfillmentPlanId = value;
    }

    /**
     * Gets the value of the baseCurrencyKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBaseCurrencyKey() {
        return baseCurrencyKey;
    }

    /**
     * Sets the value of the baseCurrencyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBaseCurrencyKey(Long value) {
        this.baseCurrencyKey = value;
    }

    /**
     * Gets the value of the stateId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateId() {
        return stateId;
    }

    /**
     * Sets the value of the stateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateId(JAXBElement<String> value) {
        this.stateId = value;
    }

    /**
     * Gets the value of the counrtyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounrtyId() {
        return counrtyId;
    }

    /**
     * Sets the value of the counrtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounrtyId(JAXBElement<String> value) {
        this.counrtyId = value;
    }

}
