
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.AutoSelectSerialBatchType;
import org.datacontract.schemas._2004._07.cxs_subsystem.CostingMethod;
import org.datacontract.schemas._2004._07.cxs_subsystem.CostingSubMethod;
import org.datacontract.schemas._2004._07.cxs_subsystem.GiftCertificateType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductGroupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferedVendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowFractionalQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DiscountsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsBatchTracked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsExchangable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNonStock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSaleable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSerialTracked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWeighed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsKit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAssembly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanLayaway" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsOnHold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsOpenPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsOpenDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInclusiveTaxed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DefaultQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequireAgeVerification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ManufacturerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsZeroValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPurchasable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PriceOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImageLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanSellExpiredItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanRefundExpiredItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LoyaltyPointsRedeemable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssemblyComponents" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfProductBOM" minOccurs="0"/>
 *         &lt;element name="KitComponents" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfProductBOM" minOccurs="0"/>
 *         &lt;element name="MaximumOpenPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IgnoreDiscountItemsForSaleDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SaleDiscountsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductInventoryList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfInventoryItem" minOccurs="0"/>
 *         &lt;element name="ProductClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasPackageGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PackageGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsGiftCertificate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GiftCertificateType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}GiftCertificateType" minOccurs="0"/>
 *         &lt;element name="AutoSelectSerialBatchType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}AutoSelectSerialBatchType" minOccurs="0"/>
 *         &lt;element name="UOMGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BarCodeMaskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductMerchandiseHierarchyDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfProductMerchandiseHierarchyDetail" minOccurs="0"/>
 *         &lt;element name="MerchandiseHierarchyDetailKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasAlternateProducts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasUpsells" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMatrixItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEBTItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AlternateUPCCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsTwoDimensionalMatrixItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoGenerateChildItemDefinition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CostingMethod" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}CostingMethod" minOccurs="0"/>
 *         &lt;element name="CostingSubMethod" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}CostingSubMethod" minOccurs="0"/>
 *         &lt;element name="IsMatrixChildItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParentProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "id",
    "description",
    "productGroupId",
    "shortDescription",
    "longDescription",
    "preferedVendorId",
    "salesTaxCodeId",
    "purchaseTaxCodeId",
    "allowFractionalQuantity",
    "discountsAllowed",
    "isBatchTracked",
    "isExchangable",
    "isNonStock",
    "isRefundable",
    "isSaleable",
    "isSerialTracked",
    "isWeighed",
    "isKit",
    "isAssembly",
    "canLayaway",
    "canOrder",
    "isValid",
    "isOnHold",
    "isTaxExempt",
    "isOpenPrice",
    "isOpenDescription",
    "isInclusiveTaxed",
    "defaultQuantity",
    "basePrice",
    "upc",
    "requireAgeVerification",
    "minAge",
    "manufacturerId",
    "leadTime",
    "isZeroValue",
    "isPurchasable",
    "priceOverrideAllowed",
    "imageLocation",
    "canSellExpiredItem",
    "canRefundExpiredItem",
    "loyaltyPointsRedeemable",
    "assemblyComponents",
    "kitComponents",
    "maximumOpenPrice",
    "ignoreDiscountItemsForSaleDiscount",
    "saleDiscountsAllowed",
    "productInventoryList",
    "productClassId",
    "hasPackageGroup",
    "packageGroupId",
    "isGiftCertificate",
    "giftCertificateType",
    "autoSelectSerialBatchType",
    "uomGroupId",
    "barCodeMaskId",
    "externalLink",
    "comment",
    "productMerchandiseHierarchyDetailList",
    "merchandiseHierarchyDetailKey",
    "hasAlternateProducts",
    "hasUpsells",
    "isMatrixItem",
    "isEBTItem",
    "alternateUPCCodes",
    "returnDays",
    "isTwoDimensionalMatrixItem",
    "attributes",
    "autoGenerateChildItemDefinition",
    "costingMethod",
    "costingSubMethod",
    "isMatrixChildItem",
    "parentProductId",
    "attributeList"
})
public class Product
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "ProductGroupId", required = true, nillable = true)
    protected String productGroupId;
    @XmlElementRef(name = "ShortDescription", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shortDescription;
    @XmlElementRef(name = "LongDescription", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longDescription;
    @XmlElementRef(name = "PreferedVendorId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferedVendorId;
    @XmlElementRef(name = "SalesTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesTaxCodeId;
    @XmlElementRef(name = "PurchaseTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseTaxCodeId;
    @XmlElement(name = "AllowFractionalQuantity")
    protected Boolean allowFractionalQuantity;
    @XmlElement(name = "DiscountsAllowed")
    protected Boolean discountsAllowed;
    @XmlElement(name = "IsBatchTracked")
    protected Boolean isBatchTracked;
    @XmlElement(name = "IsExchangable")
    protected Boolean isExchangable;
    @XmlElement(name = "IsNonStock")
    protected Boolean isNonStock;
    @XmlElement(name = "IsRefundable")
    protected Boolean isRefundable;
    @XmlElement(name = "IsSaleable")
    protected Boolean isSaleable;
    @XmlElement(name = "IsSerialTracked")
    protected Boolean isSerialTracked;
    @XmlElement(name = "IsWeighed")
    protected Boolean isWeighed;
    @XmlElement(name = "IsKit")
    protected Boolean isKit;
    @XmlElement(name = "IsAssembly")
    protected Boolean isAssembly;
    @XmlElement(name = "CanLayaway")
    protected Boolean canLayaway;
    @XmlElement(name = "CanOrder")
    protected Boolean canOrder;
    @XmlElement(name = "IsValid")
    protected Boolean isValid;
    @XmlElement(name = "IsOnHold")
    protected Boolean isOnHold;
    @XmlElement(name = "IsTaxExempt")
    protected Boolean isTaxExempt;
    @XmlElement(name = "IsOpenPrice")
    protected Boolean isOpenPrice;
    @XmlElement(name = "IsOpenDescription")
    protected Boolean isOpenDescription;
    @XmlElement(name = "IsInclusiveTaxed")
    protected Boolean isInclusiveTaxed;
    @XmlElement(name = "DefaultQuantity")
    protected BigDecimal defaultQuantity;
    @XmlElement(name = "BasePrice")
    protected BigDecimal basePrice;
    @XmlElementRef(name = "UPC", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> upc;
    @XmlElement(name = "RequireAgeVerification")
    protected Boolean requireAgeVerification;
    @XmlElement(name = "MinAge")
    protected Integer minAge;
    @XmlElementRef(name = "ManufacturerId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufacturerId;
    @XmlElement(name = "LeadTime")
    protected Integer leadTime;
    @XmlElement(name = "IsZeroValue")
    protected Boolean isZeroValue;
    @XmlElement(name = "IsPurchasable")
    protected Boolean isPurchasable;
    @XmlElement(name = "PriceOverrideAllowed")
    protected Boolean priceOverrideAllowed;
    @XmlElementRef(name = "ImageLocation", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imageLocation;
    @XmlElement(name = "CanSellExpiredItem")
    protected Boolean canSellExpiredItem;
    @XmlElement(name = "CanRefundExpiredItem")
    protected Boolean canRefundExpiredItem;
    @XmlElement(name = "LoyaltyPointsRedeemable")
    protected Boolean loyaltyPointsRedeemable;
    @XmlElementRef(name = "AssemblyComponents", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductBOM> assemblyComponents;
    @XmlElementRef(name = "KitComponents", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductBOM> kitComponents;
    @XmlElement(name = "MaximumOpenPrice")
    protected BigDecimal maximumOpenPrice;
    @XmlElement(name = "IgnoreDiscountItemsForSaleDiscount")
    protected Boolean ignoreDiscountItemsForSaleDiscount;
    @XmlElement(name = "SaleDiscountsAllowed")
    protected Boolean saleDiscountsAllowed;
    @XmlElementRef(name = "ProductInventoryList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInventoryItem> productInventoryList;
    @XmlElementRef(name = "ProductClassId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productClassId;
    @XmlElement(name = "HasPackageGroup")
    protected Boolean hasPackageGroup;
    @XmlElementRef(name = "PackageGroupId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageGroupId;
    @XmlElement(name = "IsGiftCertificate")
    protected Boolean isGiftCertificate;
    @XmlElement(name = "GiftCertificateType")
    protected GiftCertificateType giftCertificateType;
    @XmlElement(name = "AutoSelectSerialBatchType")
    protected AutoSelectSerialBatchType autoSelectSerialBatchType;
    @XmlElementRef(name = "UOMGroupId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uomGroupId;
    @XmlElementRef(name = "BarCodeMaskId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> barCodeMaskId;
    @XmlElementRef(name = "ExternalLink", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalLink;
    @XmlElementRef(name = "Comment", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "ProductMerchandiseHierarchyDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductMerchandiseHierarchyDetail> productMerchandiseHierarchyDetailList;
    @XmlElementRef(name = "MerchandiseHierarchyDetailKey", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchandiseHierarchyDetailKey;
    @XmlElement(name = "HasAlternateProducts")
    protected Boolean hasAlternateProducts;
    @XmlElement(name = "HasUpsells")
    protected Boolean hasUpsells;
    @XmlElement(name = "IsMatrixItem")
    protected Boolean isMatrixItem;
    @XmlElement(name = "IsEBTItem")
    protected Boolean isEBTItem;
    @XmlElementRef(name = "AlternateUPCCodes", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternateUPCCodes;
    @XmlElement(name = "ReturnDays")
    protected Integer returnDays;
    @XmlElement(name = "IsTwoDimensionalMatrixItem")
    protected Boolean isTwoDimensionalMatrixItem;
    @XmlElementRef(name = "Attributes", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributes;
    @XmlElement(name = "AutoGenerateChildItemDefinition")
    protected Boolean autoGenerateChildItemDefinition;
    @XmlElement(name = "CostingMethod")
    protected CostingMethod costingMethod;
    @XmlElement(name = "CostingSubMethod")
    protected CostingSubMethod costingSubMethod;
    @XmlElement(name = "IsMatrixChildItem")
    protected Boolean isMatrixChildItem;
    @XmlElementRef(name = "ParentProductId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentProductId;
    @XmlElementRef(name = "AttributeList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAttributes> attributeList;

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
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the productGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroupId() {
        return productGroupId;
    }

    /**
     * Sets the value of the productGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroupId(String value) {
        this.productGroupId = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShortDescription(JAXBElement<String> value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongDescription(JAXBElement<String> value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the preferedVendorId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferedVendorId() {
        return preferedVendorId;
    }

    /**
     * Sets the value of the preferedVendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferedVendorId(JAXBElement<String> value) {
        this.preferedVendorId = value;
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
     * Gets the value of the allowFractionalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowFractionalQuantity() {
        return allowFractionalQuantity;
    }

    /**
     * Sets the value of the allowFractionalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowFractionalQuantity(Boolean value) {
        this.allowFractionalQuantity = value;
    }

    /**
     * Gets the value of the discountsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscountsAllowed() {
        return discountsAllowed;
    }

    /**
     * Sets the value of the discountsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountsAllowed(Boolean value) {
        this.discountsAllowed = value;
    }

    /**
     * Gets the value of the isBatchTracked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBatchTracked() {
        return isBatchTracked;
    }

    /**
     * Sets the value of the isBatchTracked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBatchTracked(Boolean value) {
        this.isBatchTracked = value;
    }

    /**
     * Gets the value of the isExchangable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExchangable() {
        return isExchangable;
    }

    /**
     * Sets the value of the isExchangable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExchangable(Boolean value) {
        this.isExchangable = value;
    }

    /**
     * Gets the value of the isNonStock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNonStock() {
        return isNonStock;
    }

    /**
     * Sets the value of the isNonStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonStock(Boolean value) {
        this.isNonStock = value;
    }

    /**
     * Gets the value of the isRefundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRefundable() {
        return isRefundable;
    }

    /**
     * Sets the value of the isRefundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRefundable(Boolean value) {
        this.isRefundable = value;
    }

    /**
     * Gets the value of the isSaleable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSaleable() {
        return isSaleable;
    }

    /**
     * Sets the value of the isSaleable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSaleable(Boolean value) {
        this.isSaleable = value;
    }

    /**
     * Gets the value of the isSerialTracked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSerialTracked() {
        return isSerialTracked;
    }

    /**
     * Sets the value of the isSerialTracked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSerialTracked(Boolean value) {
        this.isSerialTracked = value;
    }

    /**
     * Gets the value of the isWeighed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWeighed() {
        return isWeighed;
    }

    /**
     * Sets the value of the isWeighed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWeighed(Boolean value) {
        this.isWeighed = value;
    }

    /**
     * Gets the value of the isKit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsKit() {
        return isKit;
    }

    /**
     * Sets the value of the isKit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsKit(Boolean value) {
        this.isKit = value;
    }

    /**
     * Gets the value of the isAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAssembly() {
        return isAssembly;
    }

    /**
     * Sets the value of the isAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAssembly(Boolean value) {
        this.isAssembly = value;
    }

    /**
     * Gets the value of the canLayaway property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanLayaway() {
        return canLayaway;
    }

    /**
     * Sets the value of the canLayaway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanLayaway(Boolean value) {
        this.canLayaway = value;
    }

    /**
     * Gets the value of the canOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanOrder() {
        return canOrder;
    }

    /**
     * Sets the value of the canOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanOrder(Boolean value) {
        this.canOrder = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValid(Boolean value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the isOnHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnHold() {
        return isOnHold;
    }

    /**
     * Sets the value of the isOnHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnHold(Boolean value) {
        this.isOnHold = value;
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
     * Gets the value of the isOpenPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOpenPrice() {
        return isOpenPrice;
    }

    /**
     * Sets the value of the isOpenPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOpenPrice(Boolean value) {
        this.isOpenPrice = value;
    }

    /**
     * Gets the value of the isOpenDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOpenDescription() {
        return isOpenDescription;
    }

    /**
     * Sets the value of the isOpenDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOpenDescription(Boolean value) {
        this.isOpenDescription = value;
    }

    /**
     * Gets the value of the isInclusiveTaxed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInclusiveTaxed() {
        return isInclusiveTaxed;
    }

    /**
     * Sets the value of the isInclusiveTaxed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInclusiveTaxed(Boolean value) {
        this.isInclusiveTaxed = value;
    }

    /**
     * Gets the value of the defaultQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultQuantity() {
        return defaultQuantity;
    }

    /**
     * Sets the value of the defaultQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultQuantity(BigDecimal value) {
        this.defaultQuantity = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasePrice(BigDecimal value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUPC(JAXBElement<String> value) {
        this.upc = value;
    }

    /**
     * Gets the value of the requireAgeVerification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireAgeVerification() {
        return requireAgeVerification;
    }

    /**
     * Sets the value of the requireAgeVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireAgeVerification(Boolean value) {
        this.requireAgeVerification = value;
    }

    /**
     * Gets the value of the minAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAge() {
        return minAge;
    }

    /**
     * Sets the value of the minAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAge(Integer value) {
        this.minAge = value;
    }

    /**
     * Gets the value of the manufacturerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufacturerId() {
        return manufacturerId;
    }

    /**
     * Sets the value of the manufacturerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufacturerId(JAXBElement<String> value) {
        this.manufacturerId = value;
    }

    /**
     * Gets the value of the leadTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeadTime() {
        return leadTime;
    }

    /**
     * Sets the value of the leadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeadTime(Integer value) {
        this.leadTime = value;
    }

    /**
     * Gets the value of the isZeroValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsZeroValue() {
        return isZeroValue;
    }

    /**
     * Sets the value of the isZeroValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsZeroValue(Boolean value) {
        this.isZeroValue = value;
    }

    /**
     * Gets the value of the isPurchasable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPurchasable() {
        return isPurchasable;
    }

    /**
     * Sets the value of the isPurchasable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPurchasable(Boolean value) {
        this.isPurchasable = value;
    }

    /**
     * Gets the value of the priceOverrideAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceOverrideAllowed() {
        return priceOverrideAllowed;
    }

    /**
     * Sets the value of the priceOverrideAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceOverrideAllowed(Boolean value) {
        this.priceOverrideAllowed = value;
    }

    /**
     * Gets the value of the imageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImageLocation() {
        return imageLocation;
    }

    /**
     * Sets the value of the imageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImageLocation(JAXBElement<String> value) {
        this.imageLocation = value;
    }

    /**
     * Gets the value of the canSellExpiredItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSellExpiredItem() {
        return canSellExpiredItem;
    }

    /**
     * Sets the value of the canSellExpiredItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSellExpiredItem(Boolean value) {
        this.canSellExpiredItem = value;
    }

    /**
     * Gets the value of the canRefundExpiredItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanRefundExpiredItem() {
        return canRefundExpiredItem;
    }

    /**
     * Sets the value of the canRefundExpiredItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanRefundExpiredItem(Boolean value) {
        this.canRefundExpiredItem = value;
    }

    /**
     * Gets the value of the loyaltyPointsRedeemable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoyaltyPointsRedeemable() {
        return loyaltyPointsRedeemable;
    }

    /**
     * Sets the value of the loyaltyPointsRedeemable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoyaltyPointsRedeemable(Boolean value) {
        this.loyaltyPointsRedeemable = value;
    }

    /**
     * Gets the value of the assemblyComponents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductBOM }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductBOM> getAssemblyComponents() {
        return assemblyComponents;
    }

    /**
     * Sets the value of the assemblyComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductBOM }{@code >}
     *     
     */
    public void setAssemblyComponents(JAXBElement<ArrayOfProductBOM> value) {
        this.assemblyComponents = value;
    }

    /**
     * Gets the value of the kitComponents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductBOM }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductBOM> getKitComponents() {
        return kitComponents;
    }

    /**
     * Sets the value of the kitComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductBOM }{@code >}
     *     
     */
    public void setKitComponents(JAXBElement<ArrayOfProductBOM> value) {
        this.kitComponents = value;
    }

    /**
     * Gets the value of the maximumOpenPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumOpenPrice() {
        return maximumOpenPrice;
    }

    /**
     * Sets the value of the maximumOpenPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumOpenPrice(BigDecimal value) {
        this.maximumOpenPrice = value;
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
     * Gets the value of the saleDiscountsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaleDiscountsAllowed() {
        return saleDiscountsAllowed;
    }

    /**
     * Sets the value of the saleDiscountsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaleDiscountsAllowed(Boolean value) {
        this.saleDiscountsAllowed = value;
    }

    /**
     * Gets the value of the productInventoryList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventoryItem> getProductInventoryList() {
        return productInventoryList;
    }

    /**
     * Sets the value of the productInventoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryItem }{@code >}
     *     
     */
    public void setProductInventoryList(JAXBElement<ArrayOfInventoryItem> value) {
        this.productInventoryList = value;
    }

    /**
     * Gets the value of the productClassId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductClassId() {
        return productClassId;
    }

    /**
     * Sets the value of the productClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductClassId(JAXBElement<String> value) {
        this.productClassId = value;
    }

    /**
     * Gets the value of the hasPackageGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPackageGroup() {
        return hasPackageGroup;
    }

    /**
     * Sets the value of the hasPackageGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPackageGroup(Boolean value) {
        this.hasPackageGroup = value;
    }

    /**
     * Gets the value of the packageGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackageGroupId() {
        return packageGroupId;
    }

    /**
     * Sets the value of the packageGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackageGroupId(JAXBElement<String> value) {
        this.packageGroupId = value;
    }

    /**
     * Gets the value of the isGiftCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGiftCertificate() {
        return isGiftCertificate;
    }

    /**
     * Sets the value of the isGiftCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGiftCertificate(Boolean value) {
        this.isGiftCertificate = value;
    }

    /**
     * Gets the value of the giftCertificateType property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCertificateType }
     *     
     */
    public GiftCertificateType getGiftCertificateType() {
        return giftCertificateType;
    }

    /**
     * Sets the value of the giftCertificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCertificateType }
     *     
     */
    public void setGiftCertificateType(GiftCertificateType value) {
        this.giftCertificateType = value;
    }

    /**
     * Gets the value of the autoSelectSerialBatchType property.
     * 
     * @return
     *     possible object is
     *     {@link AutoSelectSerialBatchType }
     *     
     */
    public AutoSelectSerialBatchType getAutoSelectSerialBatchType() {
        return autoSelectSerialBatchType;
    }

    /**
     * Sets the value of the autoSelectSerialBatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoSelectSerialBatchType }
     *     
     */
    public void setAutoSelectSerialBatchType(AutoSelectSerialBatchType value) {
        this.autoSelectSerialBatchType = value;
    }

    /**
     * Gets the value of the uomGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUOMGroupId() {
        return uomGroupId;
    }

    /**
     * Sets the value of the uomGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUOMGroupId(JAXBElement<String> value) {
        this.uomGroupId = value;
    }

    /**
     * Gets the value of the barCodeMaskId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBarCodeMaskId() {
        return barCodeMaskId;
    }

    /**
     * Sets the value of the barCodeMaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBarCodeMaskId(JAXBElement<String> value) {
        this.barCodeMaskId = value;
    }

    /**
     * Gets the value of the externalLink property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalLink() {
        return externalLink;
    }

    /**
     * Sets the value of the externalLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalLink(JAXBElement<String> value) {
        this.externalLink = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Gets the value of the productMerchandiseHierarchyDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductMerchandiseHierarchyDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductMerchandiseHierarchyDetail> getProductMerchandiseHierarchyDetailList() {
        return productMerchandiseHierarchyDetailList;
    }

    /**
     * Sets the value of the productMerchandiseHierarchyDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductMerchandiseHierarchyDetail }{@code >}
     *     
     */
    public void setProductMerchandiseHierarchyDetailList(JAXBElement<ArrayOfProductMerchandiseHierarchyDetail> value) {
        this.productMerchandiseHierarchyDetailList = value;
    }

    /**
     * Gets the value of the merchandiseHierarchyDetailKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchandiseHierarchyDetailKey() {
        return merchandiseHierarchyDetailKey;
    }

    /**
     * Sets the value of the merchandiseHierarchyDetailKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchandiseHierarchyDetailKey(JAXBElement<String> value) {
        this.merchandiseHierarchyDetailKey = value;
    }

    /**
     * Gets the value of the hasAlternateProducts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAlternateProducts() {
        return hasAlternateProducts;
    }

    /**
     * Sets the value of the hasAlternateProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAlternateProducts(Boolean value) {
        this.hasAlternateProducts = value;
    }

    /**
     * Gets the value of the hasUpsells property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasUpsells() {
        return hasUpsells;
    }

    /**
     * Sets the value of the hasUpsells property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasUpsells(Boolean value) {
        this.hasUpsells = value;
    }

    /**
     * Gets the value of the isMatrixItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMatrixItem() {
        return isMatrixItem;
    }

    /**
     * Sets the value of the isMatrixItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMatrixItem(Boolean value) {
        this.isMatrixItem = value;
    }

    /**
     * Gets the value of the isEBTItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEBTItem() {
        return isEBTItem;
    }

    /**
     * Sets the value of the isEBTItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEBTItem(Boolean value) {
        this.isEBTItem = value;
    }

    /**
     * Gets the value of the alternateUPCCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternateUPCCodes() {
        return alternateUPCCodes;
    }

    /**
     * Sets the value of the alternateUPCCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternateUPCCodes(JAXBElement<String> value) {
        this.alternateUPCCodes = value;
    }

    /**
     * Gets the value of the returnDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnDays() {
        return returnDays;
    }

    /**
     * Sets the value of the returnDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnDays(Integer value) {
        this.returnDays = value;
    }

    /**
     * Gets the value of the isTwoDimensionalMatrixItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTwoDimensionalMatrixItem() {
        return isTwoDimensionalMatrixItem;
    }

    /**
     * Sets the value of the isTwoDimensionalMatrixItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTwoDimensionalMatrixItem(Boolean value) {
        this.isTwoDimensionalMatrixItem = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributes(JAXBElement<String> value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the autoGenerateChildItemDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoGenerateChildItemDefinition() {
        return autoGenerateChildItemDefinition;
    }

    /**
     * Sets the value of the autoGenerateChildItemDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoGenerateChildItemDefinition(Boolean value) {
        this.autoGenerateChildItemDefinition = value;
    }

    /**
     * Gets the value of the costingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CostingMethod }
     *     
     */
    public CostingMethod getCostingMethod() {
        return costingMethod;
    }

    /**
     * Sets the value of the costingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostingMethod }
     *     
     */
    public void setCostingMethod(CostingMethod value) {
        this.costingMethod = value;
    }

    /**
     * Gets the value of the costingSubMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CostingSubMethod }
     *     
     */
    public CostingSubMethod getCostingSubMethod() {
        return costingSubMethod;
    }

    /**
     * Sets the value of the costingSubMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostingSubMethod }
     *     
     */
    public void setCostingSubMethod(CostingSubMethod value) {
        this.costingSubMethod = value;
    }

    /**
     * Gets the value of the isMatrixChildItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMatrixChildItem() {
        return isMatrixChildItem;
    }

    /**
     * Sets the value of the isMatrixChildItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMatrixChildItem(Boolean value) {
        this.isMatrixChildItem = value;
    }

    /**
     * Gets the value of the parentProductId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentProductId() {
        return parentProductId;
    }

    /**
     * Sets the value of the parentProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentProductId(JAXBElement<String> value) {
        this.parentProductId = value;
    }

    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttributes }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAttributes> getAttributeList() {
        return attributeList;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttributes }{@code >}
     *     
     */
    public void setAttributeList(JAXBElement<ArrayOfAttributes> value) {
        this.attributeList = value;
    }

}
