
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_platform.RoundingType;
import org.datacontract.schemas._2004._07.cxs_subsystem.ERPSystemType;
import org.datacontract.schemas._2004._07.cxs_subsystem.LocalizationType;
import org.datacontract.schemas._2004._07.cxs_subsystem.PricingResolution;
import org.datacontract.schemas._2004._07.cxs_subsystem.RollupIntervalType;


/**
 * <p>Java class for Enterprise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Enterprise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="AddressKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AllowGiftCertificateSaleRedemption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowMultipleSalesPersonOnItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowMultipleTransactionMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowNegativeInventory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowPartialReceivingOfInventory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyLayawayOnSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanDeliverFromGeneralWarehouse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckCustomerCreditLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubServiceEndPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectSaleOrderAdvance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ERPSystemType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core}ERPSystemType" minOccurs="0"/>
 *         &lt;element name="EnableLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FederalTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IgnoreDiscountItemsForSaleDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsClubEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsLoyaltyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPassbookIntegrated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTrxServerIntegrated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalizationType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core}LocalizationType" minOccurs="0"/>
 *         &lt;element name="LoyaltyServiceEndPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenSalesAttributeAutomatically" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParticipateInUserExperience" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PricingResolution" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}PricingResolution" minOccurs="0"/>
 *         &lt;element name="PurchaseTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseTaxCodeKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RetailProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetailProfileKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RollupInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RollupIntervalType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}RollupIntervalType" minOccurs="0"/>
 *         &lt;element name="RollupOnlyCashCustomerInvoices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RoundAmountInInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RoundingType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}RoundingType" minOccurs="0"/>
 *         &lt;element name="SaleDiscountAfterTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SellTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellTaxCodeKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ShowProductListByVendor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseCashCustomerForConsolidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseInterstoreTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseSerialBasedPricing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseTransactionConsolidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseTransactionConsolidationOriginal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enterprise", propOrder = {
    "addressKey",
    "allowGiftCertificateSaleRedemption",
    "allowMultipleSalesPersonOnItem",
    "allowMultipleTransactionMode",
    "allowNegativeInventory",
    "allowPartialReceivingOfInventory",
    "applyLayawayOnSale",
    "canDeliverFromGeneralWarehouse",
    "checkCustomerCreditLimit",
    "clubPassword",
    "clubServiceEndPoint",
    "clubUserId",
    "collectSaleOrderAdvance",
    "companyName",
    "erpSystemType",
    "enableLocation",
    "federalTaxId",
    "ignoreDiscountItemsForSaleDiscount",
    "isClubEnabled",
    "isLoyaltyEnabled",
    "isPassbookIntegrated",
    "isTrxServerIntegrated",
    "localizationType",
    "loyaltyServiceEndPoint",
    "openSalesAttributeAutomatically",
    "participateInUserExperience",
    "pricingResolution",
    "purchaseTaxCodeId",
    "purchaseTaxCodeKey",
    "retailProfileId",
    "retailProfileKey",
    "rollupInterval",
    "rollupIntervalType",
    "rollupOnlyCashCustomerInvoices",
    "roundAmountInInvoice",
    "roundingType",
    "saleDiscountAfterTax",
    "sellTaxCodeId",
    "sellTaxCodeKey",
    "showProductListByVendor",
    "useCashCustomerForConsolidation",
    "useInterstoreTransaction",
    "useSerialBasedPricing",
    "useTransactionConsolidation",
    "useTransactionConsolidationOriginal",
    "id"
})
public class Enterprise
    extends BaseWrapper
{

    @XmlElement(name = "AddressKey")
    protected Long addressKey;
    @XmlElement(name = "AllowGiftCertificateSaleRedemption")
    protected Boolean allowGiftCertificateSaleRedemption;
    @XmlElement(name = "AllowMultipleSalesPersonOnItem")
    protected Boolean allowMultipleSalesPersonOnItem;
    @XmlElement(name = "AllowMultipleTransactionMode")
    protected Boolean allowMultipleTransactionMode;
    @XmlElement(name = "AllowNegativeInventory")
    protected Boolean allowNegativeInventory;
    @XmlElement(name = "AllowPartialReceivingOfInventory")
    protected Boolean allowPartialReceivingOfInventory;
    @XmlElement(name = "ApplyLayawayOnSale")
    protected Boolean applyLayawayOnSale;
    @XmlElement(name = "CanDeliverFromGeneralWarehouse")
    protected Boolean canDeliverFromGeneralWarehouse;
    @XmlElement(name = "CheckCustomerCreditLimit")
    protected Boolean checkCustomerCreditLimit;
    @XmlElementRef(name = "ClubPassword", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clubPassword;
    @XmlElementRef(name = "ClubServiceEndPoint", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clubServiceEndPoint;
    @XmlElementRef(name = "ClubUserId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clubUserId;
    @XmlElement(name = "CollectSaleOrderAdvance")
    protected Boolean collectSaleOrderAdvance;
    @XmlElementRef(name = "CompanyName", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyName;
    @XmlElement(name = "ERPSystemType")
    protected ERPSystemType erpSystemType;
    @XmlElement(name = "EnableLocation")
    protected Boolean enableLocation;
    @XmlElementRef(name = "FederalTaxId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> federalTaxId;
    @XmlElement(name = "IgnoreDiscountItemsForSaleDiscount")
    protected Boolean ignoreDiscountItemsForSaleDiscount;
    @XmlElement(name = "IsClubEnabled")
    protected Boolean isClubEnabled;
    @XmlElement(name = "IsLoyaltyEnabled")
    protected Boolean isLoyaltyEnabled;
    @XmlElement(name = "IsPassbookIntegrated")
    protected Boolean isPassbookIntegrated;
    @XmlElement(name = "IsTrxServerIntegrated")
    protected Boolean isTrxServerIntegrated;
    @XmlElement(name = "LocalizationType")
    protected LocalizationType localizationType;
    @XmlElementRef(name = "LoyaltyServiceEndPoint", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loyaltyServiceEndPoint;
    @XmlElement(name = "OpenSalesAttributeAutomatically")
    protected Boolean openSalesAttributeAutomatically;
    @XmlElement(name = "ParticipateInUserExperience")
    protected Boolean participateInUserExperience;
    @XmlElement(name = "PricingResolution")
    protected PricingResolution pricingResolution;
    @XmlElementRef(name = "PurchaseTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseTaxCodeId;
    @XmlElement(name = "PurchaseTaxCodeKey")
    protected Long purchaseTaxCodeKey;
    @XmlElementRef(name = "RetailProfileId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailProfileId;
    @XmlElement(name = "RetailProfileKey")
    protected Long retailProfileKey;
    @XmlElement(name = "RollupInterval")
    protected Integer rollupInterval;
    @XmlElement(name = "RollupIntervalType")
    protected RollupIntervalType rollupIntervalType;
    @XmlElement(name = "RollupOnlyCashCustomerInvoices")
    protected Boolean rollupOnlyCashCustomerInvoices;
    @XmlElement(name = "RoundAmountInInvoice")
    protected Boolean roundAmountInInvoice;
    @XmlElement(name = "RoundingType")
    protected RoundingType roundingType;
    @XmlElement(name = "SaleDiscountAfterTax")
    protected Boolean saleDiscountAfterTax;
    @XmlElementRef(name = "SellTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sellTaxCodeId;
    @XmlElement(name = "SellTaxCodeKey")
    protected Long sellTaxCodeKey;
    @XmlElement(name = "ShowProductListByVendor")
    protected Boolean showProductListByVendor;
    @XmlElement(name = "UseCashCustomerForConsolidation")
    protected Boolean useCashCustomerForConsolidation;
    @XmlElement(name = "UseInterstoreTransaction")
    protected Boolean useInterstoreTransaction;
    @XmlElement(name = "UseSerialBasedPricing")
    protected Boolean useSerialBasedPricing;
    @XmlElement(name = "UseTransactionConsolidation")
    protected Boolean useTransactionConsolidation;
    @XmlElementRef(name = "UseTransactionConsolidationOriginal", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useTransactionConsolidationOriginal;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;

    /**
     * Gets the value of the addressKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddressKey() {
        return addressKey;
    }

    /**
     * Sets the value of the addressKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddressKey(Long value) {
        this.addressKey = value;
    }

    /**
     * Gets the value of the allowGiftCertificateSaleRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowGiftCertificateSaleRedemption() {
        return allowGiftCertificateSaleRedemption;
    }

    /**
     * Sets the value of the allowGiftCertificateSaleRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowGiftCertificateSaleRedemption(Boolean value) {
        this.allowGiftCertificateSaleRedemption = value;
    }

    /**
     * Gets the value of the allowMultipleSalesPersonOnItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMultipleSalesPersonOnItem() {
        return allowMultipleSalesPersonOnItem;
    }

    /**
     * Sets the value of the allowMultipleSalesPersonOnItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMultipleSalesPersonOnItem(Boolean value) {
        this.allowMultipleSalesPersonOnItem = value;
    }

    /**
     * Gets the value of the allowMultipleTransactionMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMultipleTransactionMode() {
        return allowMultipleTransactionMode;
    }

    /**
     * Sets the value of the allowMultipleTransactionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMultipleTransactionMode(Boolean value) {
        this.allowMultipleTransactionMode = value;
    }

    /**
     * Gets the value of the allowNegativeInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowNegativeInventory() {
        return allowNegativeInventory;
    }

    /**
     * Sets the value of the allowNegativeInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowNegativeInventory(Boolean value) {
        this.allowNegativeInventory = value;
    }

    /**
     * Gets the value of the allowPartialReceivingOfInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPartialReceivingOfInventory() {
        return allowPartialReceivingOfInventory;
    }

    /**
     * Sets the value of the allowPartialReceivingOfInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPartialReceivingOfInventory(Boolean value) {
        this.allowPartialReceivingOfInventory = value;
    }

    /**
     * Gets the value of the applyLayawayOnSale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyLayawayOnSale() {
        return applyLayawayOnSale;
    }

    /**
     * Sets the value of the applyLayawayOnSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyLayawayOnSale(Boolean value) {
        this.applyLayawayOnSale = value;
    }

    /**
     * Gets the value of the canDeliverFromGeneralWarehouse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDeliverFromGeneralWarehouse() {
        return canDeliverFromGeneralWarehouse;
    }

    /**
     * Sets the value of the canDeliverFromGeneralWarehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDeliverFromGeneralWarehouse(Boolean value) {
        this.canDeliverFromGeneralWarehouse = value;
    }

    /**
     * Gets the value of the checkCustomerCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckCustomerCreditLimit() {
        return checkCustomerCreditLimit;
    }

    /**
     * Sets the value of the checkCustomerCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckCustomerCreditLimit(Boolean value) {
        this.checkCustomerCreditLimit = value;
    }

    /**
     * Gets the value of the clubPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClubPassword() {
        return clubPassword;
    }

    /**
     * Sets the value of the clubPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClubPassword(JAXBElement<String> value) {
        this.clubPassword = value;
    }

    /**
     * Gets the value of the clubServiceEndPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClubServiceEndPoint() {
        return clubServiceEndPoint;
    }

    /**
     * Sets the value of the clubServiceEndPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClubServiceEndPoint(JAXBElement<String> value) {
        this.clubServiceEndPoint = value;
    }

    /**
     * Gets the value of the clubUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClubUserId() {
        return clubUserId;
    }

    /**
     * Sets the value of the clubUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClubUserId(JAXBElement<String> value) {
        this.clubUserId = value;
    }

    /**
     * Gets the value of the collectSaleOrderAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectSaleOrderAdvance() {
        return collectSaleOrderAdvance;
    }

    /**
     * Sets the value of the collectSaleOrderAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollectSaleOrderAdvance(Boolean value) {
        this.collectSaleOrderAdvance = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyName(JAXBElement<String> value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the erpSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link ERPSystemType }
     *     
     */
    public ERPSystemType getERPSystemType() {
        return erpSystemType;
    }

    /**
     * Sets the value of the erpSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ERPSystemType }
     *     
     */
    public void setERPSystemType(ERPSystemType value) {
        this.erpSystemType = value;
    }

    /**
     * Gets the value of the enableLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableLocation() {
        return enableLocation;
    }

    /**
     * Sets the value of the enableLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableLocation(Boolean value) {
        this.enableLocation = value;
    }

    /**
     * Gets the value of the federalTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFederalTaxId() {
        return federalTaxId;
    }

    /**
     * Sets the value of the federalTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFederalTaxId(JAXBElement<String> value) {
        this.federalTaxId = value;
    }

    /**
     * Gets the value of the ignoreDiscountItemsForSaleDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreDiscountItemsForSaleDiscount() {
        return ignoreDiscountItemsForSaleDiscount;
    }

    /**
     * Sets the value of the ignoreDiscountItemsForSaleDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreDiscountItemsForSaleDiscount(Boolean value) {
        this.ignoreDiscountItemsForSaleDiscount = value;
    }

    /**
     * Gets the value of the isClubEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClubEnabled() {
        return isClubEnabled;
    }

    /**
     * Sets the value of the isClubEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClubEnabled(Boolean value) {
        this.isClubEnabled = value;
    }

    /**
     * Gets the value of the isLoyaltyEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoyaltyEnabled() {
        return isLoyaltyEnabled;
    }

    /**
     * Sets the value of the isLoyaltyEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoyaltyEnabled(Boolean value) {
        this.isLoyaltyEnabled = value;
    }

    /**
     * Gets the value of the isPassbookIntegrated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPassbookIntegrated() {
        return isPassbookIntegrated;
    }

    /**
     * Sets the value of the isPassbookIntegrated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPassbookIntegrated(Boolean value) {
        this.isPassbookIntegrated = value;
    }

    /**
     * Gets the value of the isTrxServerIntegrated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTrxServerIntegrated() {
        return isTrxServerIntegrated;
    }

    /**
     * Sets the value of the isTrxServerIntegrated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTrxServerIntegrated(Boolean value) {
        this.isTrxServerIntegrated = value;
    }

    /**
     * Gets the value of the localizationType property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizationType }
     *     
     */
    public LocalizationType getLocalizationType() {
        return localizationType;
    }

    /**
     * Sets the value of the localizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizationType }
     *     
     */
    public void setLocalizationType(LocalizationType value) {
        this.localizationType = value;
    }

    /**
     * Gets the value of the loyaltyServiceEndPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoyaltyServiceEndPoint() {
        return loyaltyServiceEndPoint;
    }

    /**
     * Sets the value of the loyaltyServiceEndPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoyaltyServiceEndPoint(JAXBElement<String> value) {
        this.loyaltyServiceEndPoint = value;
    }

    /**
     * Gets the value of the openSalesAttributeAutomatically property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenSalesAttributeAutomatically() {
        return openSalesAttributeAutomatically;
    }

    /**
     * Sets the value of the openSalesAttributeAutomatically property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenSalesAttributeAutomatically(Boolean value) {
        this.openSalesAttributeAutomatically = value;
    }

    /**
     * Gets the value of the participateInUserExperience property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParticipateInUserExperience() {
        return participateInUserExperience;
    }

    /**
     * Sets the value of the participateInUserExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParticipateInUserExperience(Boolean value) {
        this.participateInUserExperience = value;
    }

    /**
     * Gets the value of the pricingResolution property.
     * 
     * @return
     *     possible object is
     *     {@link PricingResolution }
     *     
     */
    public PricingResolution getPricingResolution() {
        return pricingResolution;
    }

    /**
     * Sets the value of the pricingResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingResolution }
     *     
     */
    public void setPricingResolution(PricingResolution value) {
        this.pricingResolution = value;
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
     * Gets the value of the purchaseTaxCodeKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseTaxCodeKey() {
        return purchaseTaxCodeKey;
    }

    /**
     * Sets the value of the purchaseTaxCodeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseTaxCodeKey(Long value) {
        this.purchaseTaxCodeKey = value;
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
     * Gets the value of the retailProfileKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetailProfileKey() {
        return retailProfileKey;
    }

    /**
     * Sets the value of the retailProfileKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetailProfileKey(Long value) {
        this.retailProfileKey = value;
    }

    /**
     * Gets the value of the rollupInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRollupInterval() {
        return rollupInterval;
    }

    /**
     * Sets the value of the rollupInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRollupInterval(Integer value) {
        this.rollupInterval = value;
    }

    /**
     * Gets the value of the rollupIntervalType property.
     * 
     * @return
     *     possible object is
     *     {@link RollupIntervalType }
     *     
     */
    public RollupIntervalType getRollupIntervalType() {
        return rollupIntervalType;
    }

    /**
     * Sets the value of the rollupIntervalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RollupIntervalType }
     *     
     */
    public void setRollupIntervalType(RollupIntervalType value) {
        this.rollupIntervalType = value;
    }

    /**
     * Gets the value of the rollupOnlyCashCustomerInvoices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollupOnlyCashCustomerInvoices() {
        return rollupOnlyCashCustomerInvoices;
    }

    /**
     * Sets the value of the rollupOnlyCashCustomerInvoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollupOnlyCashCustomerInvoices(Boolean value) {
        this.rollupOnlyCashCustomerInvoices = value;
    }

    /**
     * Gets the value of the roundAmountInInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoundAmountInInvoice() {
        return roundAmountInInvoice;
    }

    /**
     * Sets the value of the roundAmountInInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoundAmountInInvoice(Boolean value) {
        this.roundAmountInInvoice = value;
    }

    /**
     * Gets the value of the roundingType property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingType }
     *     
     */
    public RoundingType getRoundingType() {
        return roundingType;
    }

    /**
     * Sets the value of the roundingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingType }
     *     
     */
    public void setRoundingType(RoundingType value) {
        this.roundingType = value;
    }

    /**
     * Gets the value of the saleDiscountAfterTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaleDiscountAfterTax() {
        return saleDiscountAfterTax;
    }

    /**
     * Sets the value of the saleDiscountAfterTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaleDiscountAfterTax(Boolean value) {
        this.saleDiscountAfterTax = value;
    }

    /**
     * Gets the value of the sellTaxCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSellTaxCodeId() {
        return sellTaxCodeId;
    }

    /**
     * Sets the value of the sellTaxCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSellTaxCodeId(JAXBElement<String> value) {
        this.sellTaxCodeId = value;
    }

    /**
     * Gets the value of the sellTaxCodeKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSellTaxCodeKey() {
        return sellTaxCodeKey;
    }

    /**
     * Sets the value of the sellTaxCodeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSellTaxCodeKey(Long value) {
        this.sellTaxCodeKey = value;
    }

    /**
     * Gets the value of the showProductListByVendor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowProductListByVendor() {
        return showProductListByVendor;
    }

    /**
     * Sets the value of the showProductListByVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowProductListByVendor(Boolean value) {
        this.showProductListByVendor = value;
    }

    /**
     * Gets the value of the useCashCustomerForConsolidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCashCustomerForConsolidation() {
        return useCashCustomerForConsolidation;
    }

    /**
     * Sets the value of the useCashCustomerForConsolidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCashCustomerForConsolidation(Boolean value) {
        this.useCashCustomerForConsolidation = value;
    }

    /**
     * Gets the value of the useInterstoreTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInterstoreTransaction() {
        return useInterstoreTransaction;
    }

    /**
     * Sets the value of the useInterstoreTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInterstoreTransaction(Boolean value) {
        this.useInterstoreTransaction = value;
    }

    /**
     * Gets the value of the useSerialBasedPricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSerialBasedPricing() {
        return useSerialBasedPricing;
    }

    /**
     * Sets the value of the useSerialBasedPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSerialBasedPricing(Boolean value) {
        this.useSerialBasedPricing = value;
    }

    /**
     * Gets the value of the useTransactionConsolidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTransactionConsolidation() {
        return useTransactionConsolidation;
    }

    /**
     * Sets the value of the useTransactionConsolidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTransactionConsolidation(Boolean value) {
        this.useTransactionConsolidation = value;
    }

    /**
     * Gets the value of the useTransactionConsolidationOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseTransactionConsolidationOriginal() {
        return useTransactionConsolidationOriginal;
    }

    /**
     * Sets the value of the useTransactionConsolidationOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseTransactionConsolidationOriginal(JAXBElement<Boolean> value) {
        this.useTransactionConsolidationOriginal = value;
    }

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

}
