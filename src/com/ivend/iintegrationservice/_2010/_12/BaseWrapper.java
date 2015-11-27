
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GenerateIntegrationEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnterpriseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserFieldsList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfUserFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseWrapper", propOrder = {
    "message",
    "generateIntegrationEvent",
    "enterpriseName",
    "userFieldsList"
})
@XmlSeeAlso({
    PostDeliveryItem.class,
    TaxCode.class,
    SecurityUser.class,
    CustomerGroup.class,
    GoodsReceiptPODetail.class,
    ObjectProperty.class,
    SpecialPricingDate.class,
    ProductBOM.class,
    Manufacturer.class,
    GoodsReceiptPO.class,
    Transaction.class,
    AuthorizePaymentRequest.class,
    Surcharge.class,
    Employee.class,
    PriceList.class,
    Country.class,
    PurchaseOrder.class,
    CustomerSummery.class,
    GoodsReceiptSerialDetail.class,
    AlternateItem.class,
    Customer.class,
    Product.class,
    PostDelivery.class,
    ExchangeRate.class,
    GoodsReceipt.class,
    PostTransactionSaleAttribute.class,
    CustomerCatalog.class,
    Batch.class,
    PromotionBonusBuys.class,
    PostTransaction.class,
    StockTransfer.class,
    LoyaltyCardInformation.class,
    UserDefinedFieldsValidValue.class,
    TransactionServerParameters.class,
    Store.class,
    GiftCertificateMaster.class,
    GoodsReceiptDetail.class,
    ShippingType.class,
    VendorGroup.class,
    TransactionPayment.class,
    PaymentType.class,
    LayawayPlanSurcharge.class,
    UOMGroup.class,
    InventoryUpdateBatch.class,
    PaymentTypeDiscount.class,
    GoodsReturn.class,
    Enterprise.class,
    PaymentTypeSurcharge.class,
    BarCodeMask.class,
    LineAttribute.class,
    InventoryCount.class,
    NumberSeriesMaster.class,
    AttributeMaster.class,
    State.class,
    AccountsReceivable.class,
    GoodsReceiptBatchDetail.class,
    Vendor.class,
    Serial.class,
    PostTransactionItem.class,
    Coupon.class,
    PurchaseOrderSurchargeDTO.class,
    UOM.class,
    ProductGroup.class,
    StockTransferBatchDetail.class,
    UpdateMaster.class,
    BarcodeInformation.class,
    PromotionBuy.class,
    PurchaseOrderDetail.class,
    Address.class,
    AttributeValidValue.class,
    FulfillmentPlan.class,
    GoodsIssueDetail.class,
    GoodsReceiptPOBatchDetail.class,
    GoodsIssue.class,
    GiftCertificate.class,
    PromotionGet.class,
    GoodsIssueSerialDetail.class,
    InventoryItem.class,
    ProductUpsell.class,
    DeliveryPackageAddress.class,
    GoodsReturnDetail.class,
    SpecialPricing.class,
    LoyaltySetup.class,
    DeliveryPackage.class,
    TransactionSalesPerson.class,
    StoreExpense.class,
    InventoryCountBatchDetail.class,
    InventoryCountDetail.class,
    PostTransactionLineItemAttribute.class,
    TransactionSurcharge.class,
    TransactionPaymentAttribute.class,
    BarCodeMaskDetail.class,
    GoodsIssueBatchDetail.class,
    SecurityRights.class,
    ProductSurcharge.class,
    IntegrationQueue.class,
    PromotionExcludedItem.class,
    PromotionApplicabilityDetail.class,
    LoyaltyPrePrintedCards.class,
    ReplicationSendDump.class,
    Attributes.class,
    RetailProfile.class,
    PromotionProductDetail.class,
    CustomerCatalogDetail.class,
    TaxCodeCondition.class,
    InventoryUpdateSerial.class,
    StockTransferSerialDetail.class,
    StockTransferDetail.class,
    PriceMatrix.class,
    ProductCost.class,
    GoodsReturnBatchDetail.class,
    UPCTranslation.class,
    ProductCategory.class,
    SpecialPricingQuantity.class,
    PromotionDaysApplicability.class,
    ARPaymentItem.class,
    ProductMerchandiseHierarchyDetail.class,
    GoodsReturnSerialDetail.class,
    Warehouse.class,
    ProductImage.class,
    PaymentResponse.class,
    InventoryUpdate.class,
    Currency.class,
    POS.class,
    SaleAttribute.class,
    PaymentTypeAttribute.class,
    DiscountGroup.class,
    LayawayPlan.class,
    TransactionItem.class,
    TaxPeriodDefination.class,
    StockTransferRequisitionDetail.class,
    InventoryCountSerialDetail.class,
    PriceUOMMatrix.class,
    VendorProductMapping.class,
    FulfillmentPlanSurcharge.class,
    TransactionPrinting.class,
    SpecialPriceDiscountGroup.class,
    UserDefinedFieldsDetails.class,
    CurrencyDenomination.class,
    Contact.class,
    GoodsReceiptPOSerialDetail.class,
    StockTransferRequisition.class
})
public class BaseWrapper {

    @XmlElementRef(name = "Message", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElement(name = "GenerateIntegrationEvent")
    protected Boolean generateIntegrationEvent;
    @XmlElementRef(name = "EnterpriseName", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enterpriseName;
    @XmlElementRef(name = "UserFieldsList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUserFields> userFieldsList;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Gets the value of the generateIntegrationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateIntegrationEvent() {
        return generateIntegrationEvent;
    }

    /**
     * Sets the value of the generateIntegrationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateIntegrationEvent(Boolean value) {
        this.generateIntegrationEvent = value;
    }

    /**
     * Gets the value of the enterpriseName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * Sets the value of the enterpriseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnterpriseName(JAXBElement<String> value) {
        this.enterpriseName = value;
    }

    /**
     * Gets the value of the userFieldsList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserFields }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUserFields> getUserFieldsList() {
        return userFieldsList;
    }

    /**
     * Sets the value of the userFieldsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserFields }{@code >}
     *     
     */
    public void setUserFieldsList(JAXBElement<ArrayOfUserFields> value) {
        this.userFieldsList = value;
    }

}
