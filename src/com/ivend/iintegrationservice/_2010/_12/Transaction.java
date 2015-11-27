
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


/**
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ARPaymentItems" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfARPaymentItem" minOccurs="0"/>
 *         &lt;element name="BalanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryItems" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionItem" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GiftCertificates" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionItem" minOccurs="0"/>
 *         &lt;element name="HasARPayments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasDeliveries" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasFulFillments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasGiftCertificates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasLayaways" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasLayawaysCancellations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasLostSaleItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasQuotations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasRefunds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasSaleExchanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasSales" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasSurcharges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Layaways" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionItem" minOccurs="0"/>
 *         &lt;element name="LayawaysCancellation" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionItem" minOccurs="0"/>
 *         &lt;element name="OrderItems" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionItem" minOccurs="0"/>
 *         &lt;element name="POSId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Payments" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionPayment" minOccurs="0"/>
 *         &lt;element name="QuotationItems" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionItem" minOccurs="0"/>
 *         &lt;element name="RefundItems" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionItem" minOccurs="0"/>
 *         &lt;element name="SaleExchangeItems" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionItem" minOccurs="0"/>
 *         &lt;element name="SaleItems" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionItem" minOccurs="0"/>
 *         &lt;element name="SalesPersons" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionSalesPerson" minOccurs="0"/>
 *         &lt;element name="StoreId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Surcharges" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionSurcharge" minOccurs="0"/>
 *         &lt;element name="SurchargesTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalTaxableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionPrintingInformation" type="{http://www.iVend.com/IIntegrationService/2010/12}TransactionPrinting" minOccurs="0"/>
 *         &lt;element name="TransactionSaleAttributes" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPostTransactionSaleAttribute" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Transaction", propOrder = {
    "arPaymentItems",
    "balanceAmount",
    "businessDate",
    "comment",
    "contactId",
    "customerId",
    "customerRefNumber",
    "deliveryItems",
    "discountAmount",
    "discountPercent",
    "giftCertificates",
    "hasARPayments",
    "hasDeliveries",
    "hasFulFillments",
    "hasGiftCertificates",
    "hasLayaways",
    "hasLayawaysCancellations",
    "hasLostSaleItems",
    "hasOrders",
    "hasQuotations",
    "hasRefunds",
    "hasSaleExchanges",
    "hasSales",
    "hasSurcharges",
    "isSuspended",
    "isTaxExempt",
    "key",
    "layaways",
    "layawaysCancellation",
    "orderItems",
    "posId",
    "payableAmount",
    "payments",
    "quotationItems",
    "refundItems",
    "saleExchangeItems",
    "saleItems",
    "salesPersons",
    "storeId",
    "subTotal",
    "surcharges",
    "surchargesTotal",
    "tax",
    "tillId",
    "total",
    "totalTaxableAmount",
    "transactionDate",
    "transactionId",
    "transactionPrintingInformation",
    "transactionSaleAttributes",
    "userId",
    "warehouseId"
})
public class Transaction
    extends BaseWrapper
{

    @XmlElementRef(name = "ARPaymentItems", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfARPaymentItem> arPaymentItems;
    @XmlElement(name = "BalanceAmount")
    protected BigDecimal balanceAmount;
    @XmlElement(name = "BusinessDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar businessDate;
    @XmlElementRef(name = "Comment", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "ContactId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactId;
    @XmlElementRef(name = "CustomerId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerId;
    @XmlElementRef(name = "CustomerRefNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerRefNumber;
    @XmlElementRef(name = "DeliveryItems", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionItem> deliveryItems;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElementRef(name = "GiftCertificates", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionItem> giftCertificates;
    @XmlElement(name = "HasARPayments")
    protected Boolean hasARPayments;
    @XmlElement(name = "HasDeliveries")
    protected Boolean hasDeliveries;
    @XmlElement(name = "HasFulFillments")
    protected Boolean hasFulFillments;
    @XmlElement(name = "HasGiftCertificates")
    protected Boolean hasGiftCertificates;
    @XmlElement(name = "HasLayaways")
    protected Boolean hasLayaways;
    @XmlElement(name = "HasLayawaysCancellations")
    protected Boolean hasLayawaysCancellations;
    @XmlElement(name = "HasLostSaleItems")
    protected Boolean hasLostSaleItems;
    @XmlElement(name = "HasOrders")
    protected Boolean hasOrders;
    @XmlElement(name = "HasQuotations")
    protected Boolean hasQuotations;
    @XmlElement(name = "HasRefunds")
    protected Boolean hasRefunds;
    @XmlElement(name = "HasSaleExchanges")
    protected Boolean hasSaleExchanges;
    @XmlElement(name = "HasSales")
    protected Boolean hasSales;
    @XmlElement(name = "HasSurcharges")
    protected Boolean hasSurcharges;
    @XmlElement(name = "IsSuspended")
    protected Boolean isSuspended;
    @XmlElement(name = "IsTaxExempt")
    protected Boolean isTaxExempt;
    @XmlElementRef(name = "Key", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> key;
    @XmlElementRef(name = "Layaways", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionItem> layaways;
    @XmlElementRef(name = "LayawaysCancellation", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionItem> layawaysCancellation;
    @XmlElementRef(name = "OrderItems", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionItem> orderItems;
    @XmlElementRef(name = "POSId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posId;
    @XmlElement(name = "PayableAmount")
    protected BigDecimal payableAmount;
    @XmlElementRef(name = "Payments", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionPayment> payments;
    @XmlElementRef(name = "QuotationItems", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionItem> quotationItems;
    @XmlElementRef(name = "RefundItems", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionItem> refundItems;
    @XmlElementRef(name = "SaleExchangeItems", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionItem> saleExchangeItems;
    @XmlElementRef(name = "SaleItems", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionItem> saleItems;
    @XmlElementRef(name = "SalesPersons", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionSalesPerson> salesPersons;
    @XmlElementRef(name = "StoreId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> storeId;
    @XmlElement(name = "SubTotal")
    protected BigDecimal subTotal;
    @XmlElementRef(name = "Surcharges", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionSurcharge> surcharges;
    @XmlElement(name = "SurchargesTotal")
    protected BigDecimal surchargesTotal;
    @XmlElement(name = "Tax")
    protected BigDecimal tax;
    @XmlElementRef(name = "TillId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tillId;
    @XmlElement(name = "Total")
    protected BigDecimal total;
    @XmlElement(name = "TotalTaxableAmount")
    protected BigDecimal totalTaxableAmount;
    @XmlElement(name = "TransactionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElementRef(name = "TransactionId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionId;
    @XmlElementRef(name = "TransactionPrintingInformation", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionPrinting> transactionPrintingInformation;
    @XmlElementRef(name = "TransactionSaleAttributes", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPostTransactionSaleAttribute> transactionSaleAttributes;
    @XmlElementRef(name = "UserId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userId;
    @XmlElementRef(name = "WarehouseId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warehouseId;

    /**
     * Gets the value of the arPaymentItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfARPaymentItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfARPaymentItem> getARPaymentItems() {
        return arPaymentItems;
    }

    /**
     * Sets the value of the arPaymentItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfARPaymentItem }{@code >}
     *     
     */
    public void setARPaymentItems(JAXBElement<ArrayOfARPaymentItem> value) {
        this.arPaymentItems = value;
    }

    /**
     * Gets the value of the balanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Sets the value of the balanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceAmount(BigDecimal value) {
        this.balanceAmount = value;
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
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerId(JAXBElement<String> value) {
        this.customerId = value;
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
     * Gets the value of the deliveryItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionItem> getDeliveryItems() {
        return deliveryItems;
    }

    /**
     * Sets the value of the deliveryItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public void setDeliveryItems(JAXBElement<ArrayOfTransactionItem> value) {
        this.deliveryItems = value;
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
     * Gets the value of the giftCertificates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionItem> getGiftCertificates() {
        return giftCertificates;
    }

    /**
     * Sets the value of the giftCertificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public void setGiftCertificates(JAXBElement<ArrayOfTransactionItem> value) {
        this.giftCertificates = value;
    }

    /**
     * Gets the value of the hasARPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasARPayments() {
        return hasARPayments;
    }

    /**
     * Sets the value of the hasARPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasARPayments(Boolean value) {
        this.hasARPayments = value;
    }

    /**
     * Gets the value of the hasDeliveries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDeliveries() {
        return hasDeliveries;
    }

    /**
     * Sets the value of the hasDeliveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDeliveries(Boolean value) {
        this.hasDeliveries = value;
    }

    /**
     * Gets the value of the hasFulFillments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFulFillments() {
        return hasFulFillments;
    }

    /**
     * Sets the value of the hasFulFillments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFulFillments(Boolean value) {
        this.hasFulFillments = value;
    }

    /**
     * Gets the value of the hasGiftCertificates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasGiftCertificates() {
        return hasGiftCertificates;
    }

    /**
     * Sets the value of the hasGiftCertificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasGiftCertificates(Boolean value) {
        this.hasGiftCertificates = value;
    }

    /**
     * Gets the value of the hasLayaways property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLayaways() {
        return hasLayaways;
    }

    /**
     * Sets the value of the hasLayaways property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLayaways(Boolean value) {
        this.hasLayaways = value;
    }

    /**
     * Gets the value of the hasLayawaysCancellations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLayawaysCancellations() {
        return hasLayawaysCancellations;
    }

    /**
     * Sets the value of the hasLayawaysCancellations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLayawaysCancellations(Boolean value) {
        this.hasLayawaysCancellations = value;
    }

    /**
     * Gets the value of the hasLostSaleItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLostSaleItems() {
        return hasLostSaleItems;
    }

    /**
     * Sets the value of the hasLostSaleItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLostSaleItems(Boolean value) {
        this.hasLostSaleItems = value;
    }

    /**
     * Gets the value of the hasOrders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOrders() {
        return hasOrders;
    }

    /**
     * Sets the value of the hasOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOrders(Boolean value) {
        this.hasOrders = value;
    }

    /**
     * Gets the value of the hasQuotations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasQuotations() {
        return hasQuotations;
    }

    /**
     * Sets the value of the hasQuotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasQuotations(Boolean value) {
        this.hasQuotations = value;
    }

    /**
     * Gets the value of the hasRefunds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRefunds() {
        return hasRefunds;
    }

    /**
     * Sets the value of the hasRefunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRefunds(Boolean value) {
        this.hasRefunds = value;
    }

    /**
     * Gets the value of the hasSaleExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSaleExchanges() {
        return hasSaleExchanges;
    }

    /**
     * Sets the value of the hasSaleExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSaleExchanges(Boolean value) {
        this.hasSaleExchanges = value;
    }

    /**
     * Gets the value of the hasSales property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSales() {
        return hasSales;
    }

    /**
     * Sets the value of the hasSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSales(Boolean value) {
        this.hasSales = value;
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
     * Gets the value of the layaways property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionItem> getLayaways() {
        return layaways;
    }

    /**
     * Sets the value of the layaways property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public void setLayaways(JAXBElement<ArrayOfTransactionItem> value) {
        this.layaways = value;
    }

    /**
     * Gets the value of the layawaysCancellation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionItem> getLayawaysCancellation() {
        return layawaysCancellation;
    }

    /**
     * Sets the value of the layawaysCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public void setLayawaysCancellation(JAXBElement<ArrayOfTransactionItem> value) {
        this.layawaysCancellation = value;
    }

    /**
     * Gets the value of the orderItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionItem> getOrderItems() {
        return orderItems;
    }

    /**
     * Sets the value of the orderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public void setOrderItems(JAXBElement<ArrayOfTransactionItem> value) {
        this.orderItems = value;
    }

    /**
     * Gets the value of the posId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOSId() {
        return posId;
    }

    /**
     * Sets the value of the posId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOSId(JAXBElement<String> value) {
        this.posId = value;
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
     * Gets the value of the quotationItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionItem> getQuotationItems() {
        return quotationItems;
    }

    /**
     * Sets the value of the quotationItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public void setQuotationItems(JAXBElement<ArrayOfTransactionItem> value) {
        this.quotationItems = value;
    }

    /**
     * Gets the value of the refundItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionItem> getRefundItems() {
        return refundItems;
    }

    /**
     * Sets the value of the refundItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public void setRefundItems(JAXBElement<ArrayOfTransactionItem> value) {
        this.refundItems = value;
    }

    /**
     * Gets the value of the saleExchangeItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionItem> getSaleExchangeItems() {
        return saleExchangeItems;
    }

    /**
     * Sets the value of the saleExchangeItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public void setSaleExchangeItems(JAXBElement<ArrayOfTransactionItem> value) {
        this.saleExchangeItems = value;
    }

    /**
     * Gets the value of the saleItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionItem> getSaleItems() {
        return saleItems;
    }

    /**
     * Sets the value of the saleItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}
     *     
     */
    public void setSaleItems(JAXBElement<ArrayOfTransactionItem> value) {
        this.saleItems = value;
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
     * Gets the value of the storeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStoreId(JAXBElement<String> value) {
        this.storeId = value;
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
     * Gets the value of the surchargesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurchargesTotal() {
        return surchargesTotal;
    }

    /**
     * Sets the value of the surchargesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurchargesTotal(BigDecimal value) {
        this.surchargesTotal = value;
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
     * Gets the value of the tillId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTillId() {
        return tillId;
    }

    /**
     * Sets the value of the tillId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTillId(JAXBElement<String> value) {
        this.tillId = value;
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
     * Gets the value of the transactionPrintingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransactionPrinting }{@code >}
     *     
     */
    public JAXBElement<TransactionPrinting> getTransactionPrintingInformation() {
        return transactionPrintingInformation;
    }

    /**
     * Sets the value of the transactionPrintingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransactionPrinting }{@code >}
     *     
     */
    public void setTransactionPrintingInformation(JAXBElement<TransactionPrinting> value) {
        this.transactionPrintingInformation = value;
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
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserId(JAXBElement<String> value) {
        this.userId = value;
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
