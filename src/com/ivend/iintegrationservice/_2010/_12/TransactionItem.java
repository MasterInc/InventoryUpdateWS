
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BookingStoreId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingWarehouseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DeliveryWarehouseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExclusiveDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FulfillmentSurcharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FullfilledQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HasBatchNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasDiscountOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasDiscounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasFulfillment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasSerialNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasSurcharges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OriginalDetailKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OriginalDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalDocumentKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OriginalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProductDetailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductUPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RefundedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesPersons" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionSalesPerson" minOccurs="0"/>
 *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SurchargeTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Surcharges" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionSurcharge" minOccurs="0"/>
 *         &lt;element name="SystemDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalBeforeSaleDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalPostSaleDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalTaxableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalTaxableAmountAfterSaleDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TransactionLineItemAttributes" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionLineItemAttribute" minOccurs="0"/>
 *         &lt;element name="UOMBaseQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UOMId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOMQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WarehouseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionItem", propOrder = {
    "basePrice",
    "bookingStoreId",
    "bookingWarehouseId",
    "commentKey",
    "deliveryWarehouseId",
    "description",
    "discountAmount",
    "discountPercent",
    "exclusiveDiscountPercent",
    "fulfillmentSurcharges",
    "fullfilledQuantity",
    "hasBatchNumber",
    "hasDiscountOverride",
    "hasDiscounts",
    "hasFulfillment",
    "hasSerialNumber",
    "hasSurcharges",
    "key",
    "openQuantity",
    "originalDetailKey",
    "originalDocumentId",
    "originalDocumentKey",
    "originalPrice",
    "price",
    "productDetailNumber",
    "productId",
    "productUPC",
    "quantity",
    "refundedQuantity",
    "saleDiscountAmount",
    "saleItemType",
    "salesPersons",
    "subTotal",
    "surchargeTotal",
    "surcharges",
    "systemDiscount",
    "tax",
    "taxCodeId",
    "taxRate",
    "total",
    "totalBeforeSaleDiscount",
    "totalPostSaleDiscount",
    "totalTaxableAmount",
    "totalTaxableAmountAfterSaleDiscount",
    "transactionLineItemAttributes",
    "uomBaseQuantity",
    "uomId",
    "uomQuantity",
    "warehouseId"
})
public class TransactionItem
    extends BaseWrapper
{

    @XmlElement(name = "BasePrice")
    protected BigDecimal basePrice;
    @XmlElementRef(name = "BookingStoreId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingStoreId;
    @XmlElementRef(name = "BookingWarehouseId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingWarehouseId;
    @XmlElement(name = "CommentKey")
    protected Long commentKey;
    @XmlElementRef(name = "DeliveryWarehouseId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryWarehouseId;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "ExclusiveDiscountPercent")
    protected BigDecimal exclusiveDiscountPercent;
    @XmlElement(name = "FulfillmentSurcharges")
    protected BigDecimal fulfillmentSurcharges;
    @XmlElement(name = "FullfilledQuantity")
    protected BigDecimal fullfilledQuantity;
    @XmlElement(name = "HasBatchNumber")
    protected Boolean hasBatchNumber;
    @XmlElement(name = "HasDiscountOverride")
    protected Boolean hasDiscountOverride;
    @XmlElement(name = "HasDiscounts")
    protected Boolean hasDiscounts;
    @XmlElement(name = "HasFulfillment")
    protected Boolean hasFulfillment;
    @XmlElement(name = "HasSerialNumber")
    protected Boolean hasSerialNumber;
    @XmlElement(name = "HasSurcharges")
    protected Boolean hasSurcharges;
    @XmlElementRef(name = "Key", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> key;
    @XmlElement(name = "OpenQuantity")
    protected BigDecimal openQuantity;
    @XmlElement(name = "OriginalDetailKey")
    protected Long originalDetailKey;
    @XmlElementRef(name = "OriginalDocumentId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalDocumentId;
    @XmlElement(name = "OriginalDocumentKey")
    protected Long originalDocumentKey;
    @XmlElement(name = "OriginalPrice")
    protected BigDecimal originalPrice;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElementRef(name = "ProductDetailNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productDetailNumber;
    @XmlElementRef(name = "ProductId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productId;
    @XmlElementRef(name = "ProductUPC", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productUPC;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "RefundedQuantity")
    protected BigDecimal refundedQuantity;
    @XmlElement(name = "SaleDiscountAmount")
    protected BigDecimal saleDiscountAmount;
    @XmlElementRef(name = "SaleItemType", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saleItemType;
    @XmlElementRef(name = "SalesPersons", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionSalesPerson> salesPersons;
    @XmlElement(name = "SubTotal")
    protected BigDecimal subTotal;
    @XmlElement(name = "SurchargeTotal")
    protected BigDecimal surchargeTotal;
    @XmlElementRef(name = "Surcharges", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionSurcharge> surcharges;
    @XmlElement(name = "SystemDiscount")
    protected BigDecimal systemDiscount;
    @XmlElement(name = "Tax")
    protected BigDecimal tax;
    @XmlElementRef(name = "TaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxCodeId;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlElement(name = "Total")
    protected BigDecimal total;
    @XmlElement(name = "TotalBeforeSaleDiscount")
    protected BigDecimal totalBeforeSaleDiscount;
    @XmlElement(name = "TotalPostSaleDiscount")
    protected BigDecimal totalPostSaleDiscount;
    @XmlElement(name = "TotalTaxableAmount")
    protected BigDecimal totalTaxableAmount;
    @XmlElement(name = "TotalTaxableAmountAfterSaleDiscount")
    protected BigDecimal totalTaxableAmountAfterSaleDiscount;
    @XmlElementRef(name = "TransactionLineItemAttributes", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionLineItemAttribute> transactionLineItemAttributes;
    @XmlElement(name = "UOMBaseQuantity")
    protected BigDecimal uomBaseQuantity;
    @XmlElementRef(name = "UOMId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uomId;
    @XmlElement(name = "UOMQuantity")
    protected BigDecimal uomQuantity;
    @XmlElementRef(name = "WarehouseId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warehouseId;

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
     * Gets the value of the bookingStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingStoreId() {
        return bookingStoreId;
    }

    /**
     * Sets the value of the bookingStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingStoreId(JAXBElement<String> value) {
        this.bookingStoreId = value;
    }

    /**
     * Gets the value of the bookingWarehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingWarehouseId() {
        return bookingWarehouseId;
    }

    /**
     * Sets the value of the bookingWarehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingWarehouseId(JAXBElement<String> value) {
        this.bookingWarehouseId = value;
    }

    /**
     * Gets the value of the commentKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCommentKey() {
        return commentKey;
    }

    /**
     * Sets the value of the commentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCommentKey(Long value) {
        this.commentKey = value;
    }

    /**
     * Gets the value of the deliveryWarehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryWarehouseId() {
        return deliveryWarehouseId;
    }

    /**
     * Sets the value of the deliveryWarehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryWarehouseId(JAXBElement<String> value) {
        this.deliveryWarehouseId = value;
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
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the exclusiveDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExclusiveDiscountPercent() {
        return exclusiveDiscountPercent;
    }

    /**
     * Sets the value of the exclusiveDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExclusiveDiscountPercent(BigDecimal value) {
        this.exclusiveDiscountPercent = value;
    }

    /**
     * Gets the value of the fulfillmentSurcharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFulfillmentSurcharges() {
        return fulfillmentSurcharges;
    }

    /**
     * Sets the value of the fulfillmentSurcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFulfillmentSurcharges(BigDecimal value) {
        this.fulfillmentSurcharges = value;
    }

    /**
     * Gets the value of the fullfilledQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFullfilledQuantity() {
        return fullfilledQuantity;
    }

    /**
     * Sets the value of the fullfilledQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFullfilledQuantity(BigDecimal value) {
        this.fullfilledQuantity = value;
    }

    /**
     * Gets the value of the hasBatchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBatchNumber() {
        return hasBatchNumber;
    }

    /**
     * Sets the value of the hasBatchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBatchNumber(Boolean value) {
        this.hasBatchNumber = value;
    }

    /**
     * Gets the value of the hasDiscountOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDiscountOverride() {
        return hasDiscountOverride;
    }

    /**
     * Sets the value of the hasDiscountOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDiscountOverride(Boolean value) {
        this.hasDiscountOverride = value;
    }

    /**
     * Gets the value of the hasDiscounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDiscounts() {
        return hasDiscounts;
    }

    /**
     * Sets the value of the hasDiscounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDiscounts(Boolean value) {
        this.hasDiscounts = value;
    }

    /**
     * Gets the value of the hasFulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFulfillment() {
        return hasFulfillment;
    }

    /**
     * Sets the value of the hasFulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFulfillment(Boolean value) {
        this.hasFulfillment = value;
    }

    /**
     * Gets the value of the hasSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSerialNumber() {
        return hasSerialNumber;
    }

    /**
     * Sets the value of the hasSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSerialNumber(Boolean value) {
        this.hasSerialNumber = value;
    }

    /**
     * Gets the value of the hasSurcharges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSurcharges() {
        return hasSurcharges;
    }

    /**
     * Sets the value of the hasSurcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSurcharges(Boolean value) {
        this.hasSurcharges = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKey(JAXBElement<String> value) {
        this.key = value;
    }

    /**
     * Gets the value of the openQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenQuantity() {
        return openQuantity;
    }

    /**
     * Sets the value of the openQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenQuantity(BigDecimal value) {
        this.openQuantity = value;
    }

    /**
     * Gets the value of the originalDetailKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalDetailKey() {
        return originalDetailKey;
    }

    /**
     * Sets the value of the originalDetailKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalDetailKey(Long value) {
        this.originalDetailKey = value;
    }

    /**
     * Gets the value of the originalDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalDocumentId() {
        return originalDocumentId;
    }

    /**
     * Sets the value of the originalDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalDocumentId(JAXBElement<String> value) {
        this.originalDocumentId = value;
    }

    /**
     * Gets the value of the originalDocumentKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalDocumentKey() {
        return originalDocumentKey;
    }

    /**
     * Sets the value of the originalDocumentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalDocumentKey(Long value) {
        this.originalDocumentKey = value;
    }

    /**
     * Gets the value of the originalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Sets the value of the originalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalPrice(BigDecimal value) {
        this.originalPrice = value;
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
     * Gets the value of the productDetailNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductDetailNumber() {
        return productDetailNumber;
    }

    /**
     * Sets the value of the productDetailNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductDetailNumber(JAXBElement<String> value) {
        this.productDetailNumber = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductId(JAXBElement<String> value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productUPC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductUPC() {
        return productUPC;
    }

    /**
     * Sets the value of the productUPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductUPC(JAXBElement<String> value) {
        this.productUPC = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the refundedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundedQuantity() {
        return refundedQuantity;
    }

    /**
     * Sets the value of the refundedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundedQuantity(BigDecimal value) {
        this.refundedQuantity = value;
    }

    /**
     * Gets the value of the saleDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaleDiscountAmount() {
        return saleDiscountAmount;
    }

    /**
     * Sets the value of the saleDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaleDiscountAmount(BigDecimal value) {
        this.saleDiscountAmount = value;
    }

    /**
     * Gets the value of the saleItemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaleItemType() {
        return saleItemType;
    }

    /**
     * Sets the value of the saleItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaleItemType(JAXBElement<String> value) {
        this.saleItemType = value;
    }

    /**
     * Gets the value of the salesPersons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionSalesPerson }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionSalesPerson> getSalesPersons() {
        return salesPersons;
    }

    /**
     * Sets the value of the salesPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionSalesPerson }{@code >}
     *     
     */
    public void setSalesPersons(JAXBElement<ArrayOfTransactionSalesPerson> value) {
        this.salesPersons = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubTotal(BigDecimal value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the surchargeTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurchargeTotal() {
        return surchargeTotal;
    }

    /**
     * Sets the value of the surchargeTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurchargeTotal(BigDecimal value) {
        this.surchargeTotal = value;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionSurcharge }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionSurcharge> getSurcharges() {
        return surcharges;
    }

    /**
     * Sets the value of the surcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionSurcharge }{@code >}
     *     
     */
    public void setSurcharges(JAXBElement<ArrayOfTransactionSurcharge> value) {
        this.surcharges = value;
    }

    /**
     * Gets the value of the systemDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSystemDiscount() {
        return systemDiscount;
    }

    /**
     * Sets the value of the systemDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSystemDiscount(BigDecimal value) {
        this.systemDiscount = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the taxCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxCodeId() {
        return taxCodeId;
    }

    /**
     * Sets the value of the taxCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxCodeId(JAXBElement<String> value) {
        this.taxCodeId = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the totalBeforeSaleDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalBeforeSaleDiscount() {
        return totalBeforeSaleDiscount;
    }

    /**
     * Sets the value of the totalBeforeSaleDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalBeforeSaleDiscount(BigDecimal value) {
        this.totalBeforeSaleDiscount = value;
    }

    /**
     * Gets the value of the totalPostSaleDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPostSaleDiscount() {
        return totalPostSaleDiscount;
    }

    /**
     * Sets the value of the totalPostSaleDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPostSaleDiscount(BigDecimal value) {
        this.totalPostSaleDiscount = value;
    }

    /**
     * Gets the value of the totalTaxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxableAmount() {
        return totalTaxableAmount;
    }

    /**
     * Sets the value of the totalTaxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxableAmount(BigDecimal value) {
        this.totalTaxableAmount = value;
    }

    /**
     * Gets the value of the totalTaxableAmountAfterSaleDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxableAmountAfterSaleDiscount() {
        return totalTaxableAmountAfterSaleDiscount;
    }

    /**
     * Sets the value of the totalTaxableAmountAfterSaleDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxableAmountAfterSaleDiscount(BigDecimal value) {
        this.totalTaxableAmountAfterSaleDiscount = value;
    }

    /**
     * Gets the value of the transactionLineItemAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionLineItemAttribute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPostTransactionLineItemAttribute> getTransactionLineItemAttributes() {
        return transactionLineItemAttributes;
    }

    /**
     * Sets the value of the transactionLineItemAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionLineItemAttribute }{@code >}
     *     
     */
    public void setTransactionLineItemAttributes(JAXBElement<ArrayOfPostTransactionLineItemAttribute> value) {
        this.transactionLineItemAttributes = value;
    }

    /**
     * Gets the value of the uomBaseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUOMBaseQuantity() {
        return uomBaseQuantity;
    }

    /**
     * Sets the value of the uomBaseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUOMBaseQuantity(BigDecimal value) {
        this.uomBaseQuantity = value;
    }

    /**
     * Gets the value of the uomId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUOMId() {
        return uomId;
    }

    /**
     * Sets the value of the uomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUOMId(JAXBElement<String> value) {
        this.uomId = value;
    }

    /**
     * Gets the value of the uomQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUOMQuantity() {
        return uomQuantity;
    }

    /**
     * Sets the value of the uomQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUOMQuantity(BigDecimal value) {
        this.uomQuantity = value;
    }

    /**
     * Gets the value of the warehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarehouseId() {
        return warehouseId;
    }

    /**
     * Sets the value of the warehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarehouseId(JAXBElement<String> value) {
        this.warehouseId = value;
    }

}
