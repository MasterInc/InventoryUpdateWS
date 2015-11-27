
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_platform.DiscountType;


/**
 * <p>Java class for PostTransactionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostTransactionItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}DiscountType" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ProductDetailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurchargeTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OriginalDocumentKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OriginalDetailKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SurchargeList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionSurcharge" minOccurs="0"/>
 *         &lt;element name="ManualDiscountType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}DiscountType" minOccurs="0"/>
 *         &lt;element name="ManualDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ManualDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CouponDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PromotionalDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesPerson" type="{http://www.iVend.com/IIntegrationService/2010/12}TransactionSalesPerson" minOccurs="0"/>
 *         &lt;element name="UOMQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UOMBaseQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UOMId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GiftCertificateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransactionLineItemAttributes" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionLineItemAttribute" minOccurs="0"/>
 *         &lt;element name="CouponId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iVendTransactionItemKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TransactionItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductReturnDetailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostTransactionItem", propOrder = {
    "productId",
    "description",
    "taxCodeId",
    "quantity",
    "taxRate",
    "tax",
    "subTotal",
    "total",
    "discountType",
    "discountAmount",
    "discountPercent",
    "price",
    "productDetailNumber",
    "originalDocumentId",
    "surchargeTotal",
    "originalDocumentKey",
    "originalDetailKey",
    "surchargeList",
    "manualDiscountType",
    "manualDiscountAmount",
    "manualDiscountPercent",
    "couponDiscountAmount",
    "promotionalDiscountAmount",
    "salesPerson",
    "uomQuantity",
    "uomBaseQuantity",
    "uomId",
    "originalPrice",
    "giftCertificateType",
    "transactionLineItemAttributes",
    "couponId",
    "iVendTransactionItemKey",
    "transactionItemId",
    "couponSerialNumber",
    "productReturnDetailNumber"
})
public class PostTransactionItem
    extends BaseWrapper
{

    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "TaxCodeId", required = true, nillable = true)
    protected String taxCodeId;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlElement(name = "Tax")
    protected BigDecimal tax;
    @XmlElement(name = "SubTotal")
    protected BigDecimal subTotal;
    @XmlElement(name = "Total")
    protected BigDecimal total;
    @XmlElement(name = "DiscountType")
    protected DiscountType discountType;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;
    @XmlElementRef(name = "ProductDetailNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productDetailNumber;
    @XmlElementRef(name = "OriginalDocumentId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalDocumentId;
    @XmlElement(name = "SurchargeTotal")
    protected BigDecimal surchargeTotal;
    @XmlElement(name = "OriginalDocumentKey")
    protected Long originalDocumentKey;
    @XmlElement(name = "OriginalDetailKey")
    protected Long originalDetailKey;
    @XmlElementRef(name = "SurchargeList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionSurcharge> surchargeList;
    @XmlElement(name = "ManualDiscountType")
    protected DiscountType manualDiscountType;
    @XmlElement(name = "ManualDiscountAmount")
    protected BigDecimal manualDiscountAmount;
    @XmlElement(name = "ManualDiscountPercent")
    protected BigDecimal manualDiscountPercent;
    @XmlElement(name = "CouponDiscountAmount")
    protected BigDecimal couponDiscountAmount;
    @XmlElement(name = "PromotionalDiscountAmount")
    protected BigDecimal promotionalDiscountAmount;
    @XmlElementRef(name = "SalesPerson", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionSalesPerson> salesPerson;
    @XmlElement(name = "UOMQuantity")
    protected BigDecimal uomQuantity;
    @XmlElement(name = "UOMBaseQuantity")
    protected BigDecimal uomBaseQuantity;
    @XmlElementRef(name = "UOMId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uomId;
    @XmlElement(name = "OriginalPrice", required = true)
    protected BigDecimal originalPrice;
    @XmlElement(name = "GiftCertificateType")
    protected Integer giftCertificateType;
    @XmlElementRef(name = "TransactionLineItemAttributes", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionLineItemAttribute> transactionLineItemAttributes;
    @XmlElementRef(name = "CouponId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> couponId;
    protected Long iVendTransactionItemKey;
    @XmlElementRef(name = "TransactionItemId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionItemId;
    @XmlElementRef(name = "CouponSerialNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> couponSerialNumber;
    @XmlElementRef(name = "ProductReturnDetailNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productReturnDetailNumber;

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
     * Gets the value of the taxCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCodeId() {
        return taxCodeId;
    }

    /**
     * Sets the value of the taxCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCodeId(String value) {
        this.taxCodeId = value;
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
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public void setDiscountType(DiscountType value) {
        this.discountType = value;
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
     * Gets the value of the surchargeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionSurcharge }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionSurcharge> getSurchargeList() {
        return surchargeList;
    }

    /**
     * Sets the value of the surchargeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionSurcharge }{@code >}
     *     
     */
    public void setSurchargeList(JAXBElement<ArrayOfTransactionSurcharge> value) {
        this.surchargeList = value;
    }

    /**
     * Gets the value of the manualDiscountType property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getManualDiscountType() {
        return manualDiscountType;
    }

    /**
     * Sets the value of the manualDiscountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public void setManualDiscountType(DiscountType value) {
        this.manualDiscountType = value;
    }

    /**
     * Gets the value of the manualDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getManualDiscountAmount() {
        return manualDiscountAmount;
    }

    /**
     * Sets the value of the manualDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setManualDiscountAmount(BigDecimal value) {
        this.manualDiscountAmount = value;
    }

    /**
     * Gets the value of the manualDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getManualDiscountPercent() {
        return manualDiscountPercent;
    }

    /**
     * Sets the value of the manualDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setManualDiscountPercent(BigDecimal value) {
        this.manualDiscountPercent = value;
    }

    /**
     * Gets the value of the couponDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponDiscountAmount() {
        return couponDiscountAmount;
    }

    /**
     * Sets the value of the couponDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponDiscountAmount(BigDecimal value) {
        this.couponDiscountAmount = value;
    }

    /**
     * Gets the value of the promotionalDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromotionalDiscountAmount() {
        return promotionalDiscountAmount;
    }

    /**
     * Sets the value of the promotionalDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromotionalDiscountAmount(BigDecimal value) {
        this.promotionalDiscountAmount = value;
    }

    /**
     * Gets the value of the salesPerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransactionSalesPerson }{@code >}
     *     
     */
    public JAXBElement<TransactionSalesPerson> getSalesPerson() {
        return salesPerson;
    }

    /**
     * Sets the value of the salesPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransactionSalesPerson }{@code >}
     *     
     */
    public void setSalesPerson(JAXBElement<TransactionSalesPerson> value) {
        this.salesPerson = value;
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
     * Gets the value of the giftCertificateType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGiftCertificateType() {
        return giftCertificateType;
    }

    /**
     * Sets the value of the giftCertificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGiftCertificateType(Integer value) {
        this.giftCertificateType = value;
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
     * Gets the value of the couponId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCouponId() {
        return couponId;
    }

    /**
     * Sets the value of the couponId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCouponId(JAXBElement<String> value) {
        this.couponId = value;
    }

    /**
     * Gets the value of the iVendTransactionItemKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIVendTransactionItemKey() {
        return iVendTransactionItemKey;
    }

    /**
     * Sets the value of the iVendTransactionItemKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIVendTransactionItemKey(Long value) {
        this.iVendTransactionItemKey = value;
    }

    /**
     * Gets the value of the transactionItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionItemId() {
        return transactionItemId;
    }

    /**
     * Sets the value of the transactionItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionItemId(JAXBElement<String> value) {
        this.transactionItemId = value;
    }

    /**
     * Gets the value of the couponSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCouponSerialNumber() {
        return couponSerialNumber;
    }

    /**
     * Sets the value of the couponSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCouponSerialNumber(JAXBElement<String> value) {
        this.couponSerialNumber = value;
    }

    /**
     * Gets the value of the productReturnDetailNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductReturnDetailNumber() {
        return productReturnDetailNumber;
    }

    /**
     * Sets the value of the productReturnDetailNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductReturnDetailNumber(JAXBElement<String> value) {
        this.productReturnDetailNumber = value;
    }

}
