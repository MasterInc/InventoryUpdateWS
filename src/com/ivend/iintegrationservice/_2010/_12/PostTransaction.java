
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_platform.DiscountType;


/**
 * <p>Java class for PostTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostTransaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="StoreId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POSId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}DiscountType" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Validate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LayawayPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LayawayAdvanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalTaxableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleItemList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionItem" minOccurs="0"/>
 *         &lt;element name="RefundItemList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionItem" minOccurs="0"/>
 *         &lt;element name="SalesOrderList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionItem" minOccurs="0"/>
 *         &lt;element name="LayawayItemList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionItem" minOccurs="0"/>
 *         &lt;element name="SurchargeList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionSurcharge" minOccurs="0"/>
 *         &lt;element name="Payments" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionPayment" minOccurs="0"/>
 *         &lt;element name="POSDocumentNumberSeriesKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CurrentNumberOfSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateCurrentNumberOfSeries" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GiftCertificateList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionItem" minOccurs="0"/>
 *         &lt;element name="HasDiscountOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesOrderAdvanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LoyaltyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesPerson" type="{http://www.iVend.com/IIntegrationService/2010/12}TransactionSalesPerson" minOccurs="0"/>
 *         &lt;element name="iVendTransactionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HasPromotionDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TransactionSaleAttributes" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionSaleAttribute" minOccurs="0"/>
 *         &lt;element name="Quotation" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionItem" minOccurs="0"/>
 *         &lt;element name="CouponIssueList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionItem" minOccurs="0"/>
 *         &lt;element name="CouponSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeItemList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionItem" minOccurs="0"/>
 *         &lt;element name="DeliveryItemList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionItem" minOccurs="0"/>
 *         &lt;element name="ARPaymentsList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfARPaymentItem" minOccurs="0"/>
 *         &lt;element name="SuspendedTransactionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IsOrderEdited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostTransaction", propOrder = {
    "storeId",
    "posId",
    "userId",
    "transactionDate",
    "businessDate",
    "transactionId",
    "customerRefNumber",
    "customerId",
    "contactId",
    "discountType",
    "discountAmount",
    "discountPercent",
    "subTotal",
    "total",
    "comment",
    "isSuspended",
    "validate",
    "layawayPlanId",
    "layawayAdvanceAmount",
    "payableAmount",
    "totalTaxableAmount",
    "saleItemList",
    "refundItemList",
    "salesOrderList",
    "layawayItemList",
    "surchargeList",
    "payments",
    "posDocumentNumberSeriesKey",
    "currentNumberOfSeries",
    "updateCurrentNumberOfSeries",
    "giftCertificateList",
    "hasDiscountOverride",
    "salesOrderAdvanceAmount",
    "loyaltyId",
    "couponId",
    "tax",
    "salesPerson",
    "iVendTransactionKey",
    "hasPromotionDiscount",
    "transactionSaleAttributes",
    "quotation",
    "couponIssueList",
    "couponSerialNumber",
    "deliveryLocation",
    "exchangeItemList",
    "deliveryItemList",
    "arPaymentsList",
    "suspendedTransactionKey",
    "isOrderEdited"
})
public class PostTransaction
    extends BaseWrapper
{

    @XmlElement(name = "StoreId", required = true, nillable = true)
    protected String storeId;
    @XmlElement(name = "POSId", required = true, nillable = true)
    protected String posId;
    @XmlElement(name = "UserId", required = true, nillable = true)
    protected String userId;
    @XmlElement(name = "TransactionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "BusinessDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar businessDate;
    @XmlElementRef(name = "TransactionId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionId;
    @XmlElementRef(name = "CustomerRefNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerRefNumber;
    @XmlElement(name = "CustomerId", required = true, nillable = true)
    protected String customerId;
    @XmlElementRef(name = "ContactId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactId;
    @XmlElement(name = "DiscountType")
    protected DiscountType discountType;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "SubTotal")
    protected BigDecimal subTotal;
    @XmlElement(name = "Total")
    protected BigDecimal total;
    @XmlElementRef(name = "Comment", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(name = "IsSuspended")
    protected Boolean isSuspended;
    @XmlElement(name = "Validate")
    protected Boolean validate;
    @XmlElementRef(name = "LayawayPlanId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> layawayPlanId;
    @XmlElement(name = "LayawayAdvanceAmount")
    protected BigDecimal layawayAdvanceAmount;
    @XmlElement(name = "PayableAmount")
    protected BigDecimal payableAmount;
    @XmlElement(name = "TotalTaxableAmount")
    protected BigDecimal totalTaxableAmount;
    @XmlElementRef(name = "SaleItemList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionItem> saleItemList;
    @XmlElementRef(name = "RefundItemList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionItem> refundItemList;
    @XmlElementRef(name = "SalesOrderList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionItem> salesOrderList;
    @XmlElementRef(name = "LayawayItemList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionItem> layawayItemList;
    @XmlElementRef(name = "SurchargeList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionSurcharge> surchargeList;
    @XmlElementRef(name = "Payments", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionPayment> payments;
    @XmlElement(name = "POSDocumentNumberSeriesKey")
    protected Long posDocumentNumberSeriesKey;
    @XmlElementRef(name = "CurrentNumberOfSeries", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentNumberOfSeries;
    @XmlElement(name = "UpdateCurrentNumberOfSeries")
    protected Boolean updateCurrentNumberOfSeries;
    @XmlElementRef(name = "GiftCertificateList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionItem> giftCertificateList;
    @XmlElement(name = "HasDiscountOverride")
    protected Boolean hasDiscountOverride;
    @XmlElement(name = "SalesOrderAdvanceAmount")
    protected BigDecimal salesOrderAdvanceAmount;
    @XmlElementRef(name = "LoyaltyId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loyaltyId;
    @XmlElementRef(name = "CouponId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> couponId;
    @XmlElement(name = "Tax")
    protected BigDecimal tax;
    @XmlElementRef(name = "SalesPerson", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionSalesPerson> salesPerson;
    protected Long iVendTransactionKey;
    @XmlElement(name = "HasPromotionDiscount")
    protected Boolean hasPromotionDiscount;
    @XmlElementRef(name = "TransactionSaleAttributes", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionSaleAttribute> transactionSaleAttributes;
    @XmlElementRef(name = "Quotation", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionItem> quotation;
    @XmlElementRef(name = "CouponIssueList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionItem> couponIssueList;
    @XmlElementRef(name = "CouponSerialNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> couponSerialNumber;
    @XmlElementRef(name = "DeliveryLocation", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryLocation;
    @XmlElementRef(name = "ExchangeItemList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionItem> exchangeItemList;
    @XmlElementRef(name = "DeliveryItemList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionItem> deliveryItemList;
    @XmlElementRef(name = "ARPaymentsList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfARPaymentItem> arPaymentsList;
    @XmlElement(name = "SuspendedTransactionKey")
    protected Long suspendedTransactionKey;
    @XmlElement(name = "IsOrderEdited")
    protected Boolean isOrderEdited;

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
     * Gets the value of the posId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSId() {
        return posId;
    }

    /**
     * Sets the value of the posId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSId(String value) {
        this.posId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
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
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionId(JAXBElement<String> value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the customerRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerRefNumber() {
        return customerRefNumber;
    }

    /**
     * Sets the value of the customerRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerRefNumber(JAXBElement<String> value) {
        this.customerRefNumber = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactId(JAXBElement<String> value) {
        this.contactId = value;
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
     * Gets the value of the isSuspended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSuspended() {
        return isSuspended;
    }

    /**
     * Sets the value of the isSuspended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSuspended(Boolean value) {
        this.isSuspended = value;
    }

    /**
     * Gets the value of the validate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidate() {
        return validate;
    }

    /**
     * Sets the value of the validate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidate(Boolean value) {
        this.validate = value;
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
     * Gets the value of the layawayAdvanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLayawayAdvanceAmount() {
        return layawayAdvanceAmount;
    }

    /**
     * Sets the value of the layawayAdvanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLayawayAdvanceAmount(BigDecimal value) {
        this.layawayAdvanceAmount = value;
    }

    /**
     * Gets the value of the payableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    /**
     * Sets the value of the payableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayableAmount(BigDecimal value) {
        this.payableAmount = value;
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
     * Gets the value of the saleItemList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPostTransactionItem> getSaleItemList() {
        return saleItemList;
    }

    /**
     * Sets the value of the saleItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public void setSaleItemList(JAXBElement<ArrayOfPostTransactionItem> value) {
        this.saleItemList = value;
    }

    /**
     * Gets the value of the refundItemList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPostTransactionItem> getRefundItemList() {
        return refundItemList;
    }

    /**
     * Sets the value of the refundItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public void setRefundItemList(JAXBElement<ArrayOfPostTransactionItem> value) {
        this.refundItemList = value;
    }

    /**
     * Gets the value of the salesOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPostTransactionItem> getSalesOrderList() {
        return salesOrderList;
    }

    /**
     * Sets the value of the salesOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public void setSalesOrderList(JAXBElement<ArrayOfPostTransactionItem> value) {
        this.salesOrderList = value;
    }

    /**
     * Gets the value of the layawayItemList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPostTransactionItem> getLayawayItemList() {
        return layawayItemList;
    }

    /**
     * Sets the value of the layawayItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public void setLayawayItemList(JAXBElement<ArrayOfPostTransactionItem> value) {
        this.layawayItemList = value;
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
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionPayment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionPayment> getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionPayment }{@code >}
     *     
     */
    public void setPayments(JAXBElement<ArrayOfTransactionPayment> value) {
        this.payments = value;
    }

    /**
     * Gets the value of the posDocumentNumberSeriesKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPOSDocumentNumberSeriesKey() {
        return posDocumentNumberSeriesKey;
    }

    /**
     * Sets the value of the posDocumentNumberSeriesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPOSDocumentNumberSeriesKey(Long value) {
        this.posDocumentNumberSeriesKey = value;
    }

    /**
     * Gets the value of the currentNumberOfSeries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentNumberOfSeries() {
        return currentNumberOfSeries;
    }

    /**
     * Sets the value of the currentNumberOfSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentNumberOfSeries(JAXBElement<String> value) {
        this.currentNumberOfSeries = value;
    }

    /**
     * Gets the value of the updateCurrentNumberOfSeries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateCurrentNumberOfSeries() {
        return updateCurrentNumberOfSeries;
    }

    /**
     * Sets the value of the updateCurrentNumberOfSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateCurrentNumberOfSeries(Boolean value) {
        this.updateCurrentNumberOfSeries = value;
    }

    /**
     * Gets the value of the giftCertificateList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPostTransactionItem> getGiftCertificateList() {
        return giftCertificateList;
    }

    /**
     * Sets the value of the giftCertificateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public void setGiftCertificateList(JAXBElement<ArrayOfPostTransactionItem> value) {
        this.giftCertificateList = value;
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
     * Gets the value of the salesOrderAdvanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesOrderAdvanceAmount() {
        return salesOrderAdvanceAmount;
    }

    /**
     * Sets the value of the salesOrderAdvanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesOrderAdvanceAmount(BigDecimal value) {
        this.salesOrderAdvanceAmount = value;
    }

    /**
     * Gets the value of the loyaltyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoyaltyId() {
        return loyaltyId;
    }

    /**
     * Sets the value of the loyaltyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoyaltyId(JAXBElement<String> value) {
        this.loyaltyId = value;
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
     * Gets the value of the iVendTransactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIVendTransactionKey() {
        return iVendTransactionKey;
    }

    /**
     * Sets the value of the iVendTransactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIVendTransactionKey(Long value) {
        this.iVendTransactionKey = value;
    }

    /**
     * Gets the value of the hasPromotionDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPromotionDiscount() {
        return hasPromotionDiscount;
    }

    /**
     * Sets the value of the hasPromotionDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPromotionDiscount(Boolean value) {
        this.hasPromotionDiscount = value;
    }

    /**
     * Gets the value of the transactionSaleAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionSaleAttribute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPostTransactionSaleAttribute> getTransactionSaleAttributes() {
        return transactionSaleAttributes;
    }

    /**
     * Sets the value of the transactionSaleAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionSaleAttribute }{@code >}
     *     
     */
    public void setTransactionSaleAttributes(JAXBElement<ArrayOfPostTransactionSaleAttribute> value) {
        this.transactionSaleAttributes = value;
    }

    /**
     * Gets the value of the quotation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPostTransactionItem> getQuotation() {
        return quotation;
    }

    /**
     * Sets the value of the quotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public void setQuotation(JAXBElement<ArrayOfPostTransactionItem> value) {
        this.quotation = value;
    }

    /**
     * Gets the value of the couponIssueList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPostTransactionItem> getCouponIssueList() {
        return couponIssueList;
    }

    /**
     * Sets the value of the couponIssueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public void setCouponIssueList(JAXBElement<ArrayOfPostTransactionItem> value) {
        this.couponIssueList = value;
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
     * Gets the value of the deliveryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * Sets the value of the deliveryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryLocation(JAXBElement<String> value) {
        this.deliveryLocation = value;
    }

    /**
     * Gets the value of the exchangeItemList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPostTransactionItem> getExchangeItemList() {
        return exchangeItemList;
    }

    /**
     * Sets the value of the exchangeItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public void setExchangeItemList(JAXBElement<ArrayOfPostTransactionItem> value) {
        this.exchangeItemList = value;
    }

    /**
     * Gets the value of the deliveryItemList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPostTransactionItem> getDeliveryItemList() {
        return deliveryItemList;
    }

    /**
     * Sets the value of the deliveryItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}
     *     
     */
    public void setDeliveryItemList(JAXBElement<ArrayOfPostTransactionItem> value) {
        this.deliveryItemList = value;
    }

    /**
     * Gets the value of the arPaymentsList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfARPaymentItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfARPaymentItem> getARPaymentsList() {
        return arPaymentsList;
    }

    /**
     * Sets the value of the arPaymentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfARPaymentItem }{@code >}
     *     
     */
    public void setARPaymentsList(JAXBElement<ArrayOfARPaymentItem> value) {
        this.arPaymentsList = value;
    }

    /**
     * Gets the value of the suspendedTransactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSuspendedTransactionKey() {
        return suspendedTransactionKey;
    }

    /**
     * Sets the value of the suspendedTransactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSuspendedTransactionKey(Long value) {
        this.suspendedTransactionKey = value;
    }

    /**
     * Gets the value of the isOrderEdited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOrderEdited() {
        return isOrderEdited;
    }

    /**
     * Sets the value of the isOrderEdited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOrderEdited(Boolean value) {
        this.isOrderEdited = value;
    }

}
