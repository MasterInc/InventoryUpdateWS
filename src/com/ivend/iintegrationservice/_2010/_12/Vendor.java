
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.CompanyType;


/**
 * <p>Java class for Vendor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vendor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OnHold" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternatePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.iVend.com/IIntegrationService/2010/12}Address" minOccurs="0"/>
 *         &lt;element name="ShippingAddresses" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfAddress" minOccurs="0"/>
 *         &lt;element name="BillingAddresses" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfAddress" minOccurs="0"/>
 *         &lt;element name="TaxCompanyType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core}CompanyType" minOccurs="0"/>
 *         &lt;element name="VendorProductList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfVendorProductMapping" minOccurs="0"/>
 *         &lt;element name="IsMultiCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VendorGroupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vendor", propOrder = {
    "id",
    "companyName",
    "isActive",
    "onHold",
    "priceListId",
    "email",
    "webPage",
    "isTaxExempt",
    "taxNumber",
    "purchaseTaxCodeId",
    "phoneNumber",
    "alternatePhoneNumber",
    "mobilePhone",
    "faxNumber",
    "address",
    "shippingAddresses",
    "billingAddresses",
    "taxCompanyType",
    "vendorProductList",
    "isMultiCurrency",
    "vendorGroupId"
})
public class Vendor
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "CompanyName", required = true, nillable = true)
    protected String companyName;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "OnHold")
    protected boolean onHold;
    @XmlElementRef(name = "PriceListId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceListId;
    @XmlElementRef(name = "Email", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "WebPage", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webPage;
    @XmlElement(name = "IsTaxExempt")
    protected Boolean isTaxExempt;
    @XmlElementRef(name = "TaxNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxNumber;
    @XmlElementRef(name = "PurchaseTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseTaxCodeId;
    @XmlElementRef(name = "PhoneNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumber;
    @XmlElementRef(name = "AlternatePhoneNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternatePhoneNumber;
    @XmlElementRef(name = "MobilePhone", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobilePhone;
    @XmlElementRef(name = "FaxNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxNumber;
    @XmlElementRef(name = "Address", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> address;
    @XmlElementRef(name = "ShippingAddresses", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddress> shippingAddresses;
    @XmlElementRef(name = "BillingAddresses", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddress> billingAddresses;
    @XmlElement(name = "TaxCompanyType")
    protected CompanyType taxCompanyType;
    @XmlElementRef(name = "VendorProductList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVendorProductMapping> vendorProductList;
    @XmlElement(name = "IsMultiCurrency")
    protected Boolean isMultiCurrency;
    @XmlElement(name = "VendorGroupId", required = true, nillable = true)
    protected String vendorGroupId;

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
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * Gets the value of the onHold property.
     * 
     */
    public boolean isOnHold() {
        return onHold;
    }

    /**
     * Sets the value of the onHold property.
     * 
     */
    public void setOnHold(boolean value) {
        this.onHold = value;
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
     * Gets the value of the webPage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebPage() {
        return webPage;
    }

    /**
     * Sets the value of the webPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebPage(JAXBElement<String> value) {
        this.webPage = value;
    }

    /**
     * Gets the value of the isTaxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTaxExempt() {
        return isTaxExempt;
    }

    /**
     * Sets the value of the isTaxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTaxExempt(Boolean value) {
        this.isTaxExempt = value;
    }

    /**
     * Gets the value of the taxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxNumber() {
        return taxNumber;
    }

    /**
     * Sets the value of the taxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxNumber(JAXBElement<String> value) {
        this.taxNumber = value;
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
     * Gets the value of the alternatePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternatePhoneNumber() {
        return alternatePhoneNumber;
    }

    /**
     * Sets the value of the alternatePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternatePhoneNumber(JAXBElement<String> value) {
        this.alternatePhoneNumber = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobilePhone(JAXBElement<String> value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxNumber(JAXBElement<String> value) {
        this.faxNumber = value;
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
     * Gets the value of the shippingAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddress> getShippingAddresses() {
        return shippingAddresses;
    }

    /**
     * Sets the value of the shippingAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     *     
     */
    public void setShippingAddresses(JAXBElement<ArrayOfAddress> value) {
        this.shippingAddresses = value;
    }

    /**
     * Gets the value of the billingAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddress> getBillingAddresses() {
        return billingAddresses;
    }

    /**
     * Sets the value of the billingAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     *     
     */
    public void setBillingAddresses(JAXBElement<ArrayOfAddress> value) {
        this.billingAddresses = value;
    }

    /**
     * Gets the value of the taxCompanyType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getTaxCompanyType() {
        return taxCompanyType;
    }

    /**
     * Sets the value of the taxCompanyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setTaxCompanyType(CompanyType value) {
        this.taxCompanyType = value;
    }

    /**
     * Gets the value of the vendorProductList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVendorProductMapping }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVendorProductMapping> getVendorProductList() {
        return vendorProductList;
    }

    /**
     * Sets the value of the vendorProductList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVendorProductMapping }{@code >}
     *     
     */
    public void setVendorProductList(JAXBElement<ArrayOfVendorProductMapping> value) {
        this.vendorProductList = value;
    }

    /**
     * Gets the value of the isMultiCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiCurrency() {
        return isMultiCurrency;
    }

    /**
     * Sets the value of the isMultiCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiCurrency(Boolean value) {
        this.isMultiCurrency = value;
    }

    /**
     * Gets the value of the vendorGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorGroupId() {
        return vendorGroupId;
    }

    /**
     * Sets the value of the vendorGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorGroupId(String value) {
        this.vendorGroupId = value;
    }

}
