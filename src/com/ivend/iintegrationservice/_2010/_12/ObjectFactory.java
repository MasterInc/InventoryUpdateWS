
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.system.Stream;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ivend.iintegrationservice._2010._12 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProductGroupDiscount_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductGroupDiscount");
    private final static QName _ExchangeRate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ExchangeRate");
    private final static QName _ArrayOfAttributeMaster_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfAttributeMaster");
    private final static QName _PaymentType_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentType");
    private final static QName _PriceMatrix_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PriceMatrix");
    private final static QName _ProductCost_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductCost");
    private final static QName _ArrayOfPromotionGet_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPromotionGet");
    private final static QName _TaxCodeCondition_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TaxCodeCondition");
    private final static QName _CustomerGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomerGroup");
    private final static QName _GoodsReceiptDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptDetail");
    private final static QName _DiscountGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DiscountGroup");
    private final static QName _InventoryUpdateSerial_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryUpdateSerial");
    private final static QName _ArrayOfPostTransactionSaleAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPostTransactionSaleAttribute");
    private final static QName _StockTransferSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StockTransferSerialDetail");
    private final static QName _StockTransferDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StockTransferDetail");
    private final static QName _TransactionPayment_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionPayment");
    private final static QName _ShippingType_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ShippingType");
    private final static QName _TransactionServerParameters_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionServerParameters");
    private final static QName _ArrayOfStockTransferDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfStockTransferDetail");
    private final static QName _UserDefinedFieldsValidValue_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UserDefinedFieldsValidValue");
    private final static QName _CustomerCatalogDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomerCatalogDetail");
    private final static QName _ArrayOfARPaymentItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfARPaymentItem");
    private final static QName _ArrayOfExchangeRate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfExchangeRate");
    private final static QName _RetailProfile_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RetailProfile");
    private final static QName _GoodsReceipt_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceipt");
    private final static QName _LoyaltyCardInformation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LoyaltyCardInformation");
    private final static QName _Attributes_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Attributes");
    private final static QName _ArrayOfGoodsIssueSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsIssueSerialDetail");
    private final static QName _ArrayOfCurrency_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfCurrency");
    private final static QName _PromotionProductDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PromotionProductDetail");
    private final static QName _State_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "State");
    private final static QName _PaymentResponse_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentResponse");
    private final static QName _ProductImage_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductImage");
    private final static QName _PaymentTypeSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentTypeSurcharge");
    private final static QName _Enterprise_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Enterprise");
    private final static QName _InventoryCount_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryCount");
    private final static QName _ArrayOfSerial_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfSerial");
    private final static QName _ArrayOfBarCodeMaskDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfBarCodeMaskDetail");
    private final static QName _ArrayOfLayawayPlanSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfLayawayPlanSurcharge");
    private final static QName _ArrayOfVendor_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfVendor");
    private final static QName _ArrayOfProductCost_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfProductCost");
    private final static QName _UOM_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UOM");
    private final static QName _ArrayOfPromotionApplicabilityDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPromotionApplicabilityDetail");
    private final static QName _BarCodeMask_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BarCodeMask");
    private final static QName _ArrayOfCustomerGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfCustomerGroup");
    private final static QName _Transaction_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Transaction");
    private final static QName _GoodsReturnSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReturnSerialDetail");
    private final static QName _ProductMerchandiseHierarchyDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductMerchandiseHierarchyDetail");
    private final static QName _Customer_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Customer");
    private final static QName _ArrayOfDeliveryPackage_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfDeliveryPackage");
    private final static QName _CustomerGroupDiscount_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomerGroupDiscount");
    private final static QName _ArrayOfGoodsReturnSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReturnSerialDetail");
    private final static QName _ArrayOfGoodsReceiptSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReceiptSerialDetail");
    private final static QName _ArrayOfSpecialPriceDiscountGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfSpecialPriceDiscountGroup");
    private final static QName _ARPaymentItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ARPaymentItem");
    private final static QName _GoodsReturn_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReturn");
    private final static QName _ArrayOfCountry_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfCountry");
    private final static QName _APIException_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "APIException");
    private final static QName _PromotionDaysApplicability_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PromotionDaysApplicability");
    private final static QName _PaymentTypeDiscount_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentTypeDiscount");
    private final static QName _InventoryUpdateBatch_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryUpdateBatch");
    private final static QName _ArrayOfPurchaseOrder_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPurchaseOrder");
    private final static QName _ArrayOfCustomerGroupDiscount_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfCustomerGroupDiscount");
    private final static QName _UPCTranslation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UPCTranslation");
    private final static QName _LayawayPlanSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LayawayPlanSurcharge");
    private final static QName _Store_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Store");
    private final static QName _ArrayOfTaxCodeCondition_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfTaxCodeCondition");
    private final static QName _GoodsReturnBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReturnBatchDetail");
    private final static QName _ArrayOfInventoryUpdate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfInventoryUpdate");
    private final static QName _ArrayOfStore_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfStore");
    private final static QName _ArrayOfGoodsReceiptBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReceiptBatchDetail");
    private final static QName _PriceList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PriceList");
    private final static QName _SpecialPricingQuantity_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SpecialPricingQuantity");
    private final static QName _ProductCategory_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductCategory");
    private final static QName _ArrayOfBatch_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfBatch");
    private final static QName _AlternateItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AlternateItem");
    private final static QName _GoodsReceiptSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptSerialDetail");
    private final static QName _ArrayOfPromotionExcludedItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPromotionExcludedItem");
    private final static QName _ArrayOfGoodsReturn_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReturn");
    private final static QName _ArrayOfManufacturerGroupDiscount_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfManufacturerGroupDiscount");
    private final static QName _ArrayOfTransactionPaymentAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfTransactionPaymentAttribute");
    private final static QName _ArrayOfWarehouse_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfWarehouse");
    private final static QName _ArrayOfProduct_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfProduct");
    private final static QName _ArrayOfGoodsReturnBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReturnBatchDetail");
    private final static QName _PurchaseOrder_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PurchaseOrder");
    private final static QName _Country_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Country");
    private final static QName _GoodsReceiptPO_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptPO");
    private final static QName _ArrayOfCustomTransactionInfoGridDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfCustomTransactionInfoGridDetail");
    private final static QName _TransactionPaymentAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionPaymentAttribute");
    private final static QName _BarCodeMaskDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BarCodeMaskDetail");
    private final static QName _GoodsIssueBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsIssueBatchDetail");
    private final static QName _BaseWrapper_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BaseWrapper");
    private final static QName _AuthorizePaymentRequest_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AuthorizePaymentRequest");
    private final static QName _ArrayOfPaymentTypeDiscount_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPaymentTypeDiscount");
    private final static QName _ArrayOfGoodsIssueBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsIssueBatchDetail");
    private final static QName _SecurityRights_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SecurityRights");
    private final static QName _SecurityUser_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SecurityUser");
    private final static QName _ArrayOfPromotionProductDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPromotionProductDetail");
    private final static QName _ArrayOfPaymentTypeAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPaymentTypeAttribute");
    private final static QName _PostDeliveryItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PostDeliveryItem");
    private final static QName _TaxCode_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TaxCode");
    private final static QName _ArrayOfIntegrationQueue_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfIntegrationQueue");
    private final static QName _CustomerSummery_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomerSummery");
    private final static QName _ArrayOfAddress_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfAddress");
    private final static QName _InventoryCountBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryCountBatchDetail");
    private final static QName _ProductBOM_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductBOM");
    private final static QName _ObjectProperty_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ObjectProperty");
    private final static QName _SpecialPricingDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SpecialPricingDate");
    private final static QName _ArrayOfPostTransactionLineItemAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPostTransactionLineItemAttribute");
    private final static QName _ArrayOfPromotionBonusBuys_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPromotionBonusBuys");
    private final static QName _GoodsReceiptPODetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptPODetail");
    private final static QName _InventoryCountDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryCountDetail");
    private final static QName _PostTransactionLineItemAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PostTransactionLineItemAttribute");
    private final static QName _TransactionSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionSurcharge");
    private final static QName _ArrayOfAttributeValidValue_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfAttributeValidValue");
    private final static QName _ArrayOfSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfSurcharge");
    private final static QName _CustomerCatalog_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomerCatalog");
    private final static QName _LineAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LineAttribute");
    private final static QName _ArrayOfUOM_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfUOM");
    private final static QName _StockTransfer_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StockTransfer");
    private final static QName _PostTransaction_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PostTransaction");
    private final static QName _PromotionBonusBuys_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PromotionBonusBuys");
    private final static QName _ArrayOfGoodsIssue_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsIssue");
    private final static QName _PromotionApplicabilityDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PromotionApplicabilityDetail");
    private final static QName _ArrayOfAttributes_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfAttributes");
    private final static QName _ArrayOfPriceMatrix_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPriceMatrix");
    private final static QName _LoyaltyPrePrintedCards_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LoyaltyPrePrintedCards");
    private final static QName _ArrayOfProductBOM_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfProductBOM");
    private final static QName _ArrayOfCustomerCatalogDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfCustomerCatalogDetail");
    private final static QName _ArrayOfGoodsReceiptPOBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReceiptPOBatchDetail");
    private final static QName _ArrayOfSpecialPricingDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfSpecialPricingDate");
    private final static QName _ReplicationSendDump_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ReplicationSendDump");
    private final static QName _ArrayOfEmployee_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfEmployee");
    private final static QName _PostTransactionSaleAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PostTransactionSaleAttribute");
    private final static QName _Employee_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Employee");
    private final static QName _ArrayOfShippingType_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfShippingType");
    private final static QName _ArrayOfFulfillmentPlanSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfFulfillmentPlanSurcharge");
    private final static QName _CustomTransactionInfoGridDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomTransactionInfoGridDetail");
    private final static QName _IntegrationQueue_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "IntegrationQueue");
    private final static QName _ArrayOfUserFields_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfUserFields");
    private final static QName _PromotionExcludedItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PromotionExcludedItem");
    private final static QName _ArrayOfPriceUOMMatrix_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPriceUOMMatrix");
    private final static QName _ArrayOfPostDeliveryItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPostDeliveryItem");
    private final static QName _ArrayOfPurchaseOrderDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPurchaseOrderDetail");
    private final static QName _ArrayOfTaxPeriodDefination_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfTaxPeriodDefination");
    private final static QName _ArrayOfStockTransferRequisitionDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfStockTransferRequisitionDetail");
    private final static QName _ArrayOfStockTransferBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfStockTransferBatchDetail");
    private final static QName _PostDelivery_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PostDelivery");
    private final static QName _ArrayOfObjectProperty_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfObjectProperty");
    private final static QName _ProductSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductSurcharge");
    private final static QName _ArrayOfVendorProductMapping_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfVendorProductMapping");
    private final static QName _Serial_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Serial");
    private final static QName _ProductGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductGroup");
    private final static QName _VendorProductMapping_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "VendorProductMapping");
    private final static QName _UserFields_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UserFields");
    private final static QName _ArrayOfPostTransactionItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPostTransactionItem");
    private final static QName _FulfillmentPlanSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FulfillmentPlanSurcharge");
    private final static QName _ArrayOfLoyaltyPrePrintedCards_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfLoyaltyPrePrintedCards");
    private final static QName _ArrayOfReplicationSendDump_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfReplicationSendDump");
    private final static QName _ArrayOfAccountsReceivable_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfAccountsReceivable");
    private final static QName _Coupon_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Coupon");
    private final static QName _ArrayOfInventoryCountDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfInventoryCountDetail");
    private final static QName _ArrayOfTransactionPayment_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfTransactionPayment");
    private final static QName _Product_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Product");
    private final static QName _GiftCertificateMaster_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GiftCertificateMaster");
    private final static QName _GoodsReceiptPOBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptPOBatchDetail");
    private final static QName _GoodsIssueSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsIssueSerialDetail");
    private final static QName _PriceUOMMatrix_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PriceUOMMatrix");
    private final static QName _PromotionGet_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PromotionGet");
    private final static QName _ArrayOfSaleAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfSaleAttribute");
    private final static QName _GiftCertificate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GiftCertificate");
    private final static QName _ArrayOfGoodsReceiptPODetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReceiptPODetail");
    private final static QName _ArrayOfPromotionDaysApplicability_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPromotionDaysApplicability");
    private final static QName _ArrayOfContact_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfContact");
    private final static QName _SpecialPricing_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SpecialPricing");
    private final static QName _ArrayOfPurchaseOrderSurchargeDTO_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPurchaseOrderSurchargeDTO");
    private final static QName _UOMGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UOMGroup");
    private final static QName _ArrayOfPriceList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPriceList");
    private final static QName _ArrayOfSpecialPricing_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfSpecialPricing");
    private final static QName _ArrayOfProductMerchandiseHierarchyDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfProductMerchandiseHierarchyDetail");
    private final static QName _ArrayOfUOMGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfUOMGroup");
    private final static QName _ArrayOfCurrencyDenomination_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfCurrencyDenomination");
    private final static QName _FulfillmentPlan_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FulfillmentPlan");
    private final static QName _InventoryCountSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryCountSerialDetail");
    private final static QName _GoodsIssueDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsIssueDetail");
    private final static QName _Vendor_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Vendor");
    private final static QName _ArrayOfTaxCode_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfTaxCode");
    private final static QName _VendorGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "VendorGroup");
    private final static QName _UpdateMaster_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UpdateMaster");
    private final static QName _StoreExpense_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StoreExpense");
    private final static QName _Contact_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Contact");
    private final static QName _CurrencyDenomination_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CurrencyDenomination");
    private final static QName _UserDefinedFieldsDetails_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UserDefinedFieldsDetails");
    private final static QName _ArrayOfLineAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfLineAttribute");
    private final static QName _StockTransferRequisition_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StockTransferRequisition");
    private final static QName _GoodsReceiptPOSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptPOSerialDetail");
    private final static QName _TransactionSalesPerson_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionSalesPerson");
    private final static QName _ArrayOfCoupon_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfCoupon");
    private final static QName _ArrayOfProductSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfProductSurcharge");
    private final static QName _ArrayOfGiftCertificateMaster_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGiftCertificateMaster");
    private final static QName _ArrayOfGoodsReturnDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReturnDetail");
    private final static QName _ArrayOfGoodsIssueDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsIssueDetail");
    private final static QName _Manufacturer_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Manufacturer");
    private final static QName _Batch_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Batch");
    private final static QName _SpecialPriceDiscountGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SpecialPriceDiscountGroup");
    private final static QName _ArrayOfPaymentTypeSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPaymentTypeSurcharge");
    private final static QName _LoyaltySetup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LoyaltySetup");
    private final static QName _GoodsReturnDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReturnDetail");
    private final static QName _SaleAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaleAttribute");
    private final static QName _DeliveryPackageAddress_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DeliveryPackageAddress");
    private final static QName _Warehouse_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Warehouse");
    private final static QName _ProductUpsell_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductUpsell");
    private final static QName _InventoryItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryItem");
    private final static QName _ArrayOfProductUpsell_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfProductUpsell");
    private final static QName _TransactionPrinting_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionPrinting");
    private final static QName _ArrayOfGoodsReceipt_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReceipt");
    private final static QName _ArrayOfBarCodeMask_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfBarCodeMask");
    private final static QName _Surcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Surcharge");
    private final static QName _PostTransactionItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PostTransactionItem");
    private final static QName _ArrayOfInventoryUpdateBatch_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfInventoryUpdateBatch");
    private final static QName _ArrayOfGoodsReceiptDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReceiptDetail");
    private final static QName _ArrayOfUPCTranslation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfUPCTranslation");
    private final static QName _PurchaseOrderSurchargeDTO_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PurchaseOrderSurchargeDTO");
    private final static QName _ArrayOfInventoryCountBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfInventoryCountBatchDetail");
    private final static QName _ArrayOfState_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfState");
    private final static QName _ArrayOfAlternateItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfAlternateItem");
    private final static QName _GoodsReceiptBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptBatchDetail");
    private final static QName _ArrayOfGoodsReceiptPO_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReceiptPO");
    private final static QName _ArrayOfTransactionSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfTransactionSurcharge");
    private final static QName _AccountsReceivable_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AccountsReceivable");
    private final static QName _ArrayOfCustomer_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfCustomer");
    private final static QName _ArrayOfSpecialPricingQuantity_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfSpecialPricingQuantity");
    private final static QName _ArrayOfInventoryCountSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfInventoryCountSerialDetail");
    private final static QName _ArrayOfTransactionItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfTransactionItem");
    private final static QName _POS_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "POS");
    private final static QName _ArrayOfInventoryUpdateSerial_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfInventoryUpdateSerial");
    private final static QName _ArrayOfManufacturer_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfManufacturer");
    private final static QName _ArrayOfProductGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfProductGroup");
    private final static QName _ArrayOfPaymentType_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPaymentType");
    private final static QName _Currency_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Currency");
    private final static QName _ArrayOfInventoryItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfInventoryItem");
    private final static QName _NumberSeriesMaster_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "NumberSeriesMaster");
    private final static QName _InventoryUpdate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryUpdate");
    private final static QName _ArrayOfTransactionSalesPerson_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfTransactionSalesPerson");
    private final static QName _Address_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Address");
    private final static QName _CustomTransactionInfoGrid_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomTransactionInfoGrid");
    private final static QName _ArrayOfGoodsReceiptPOSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfGoodsReceiptPOSerialDetail");
    private final static QName _ArrayOfPromotionBuy_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfPromotionBuy");
    private final static QName _PurchaseOrderDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PurchaseOrderDetail");
    private final static QName _AttributeValidValue_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AttributeValidValue");
    private final static QName _StockTransferRequisitionDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StockTransferRequisitionDetail");
    private final static QName _ArrayOfStockTransferSerialDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfStockTransferSerialDetail");
    private final static QName _ArrayOfStockTransfer_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfStockTransfer");
    private final static QName _GoodsIssue_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsIssue");
    private final static QName _PromotionBuy_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PromotionBuy");
    private final static QName _TaxPeriodDefination_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TaxPeriodDefination");
    private final static QName _ArrayOfProductGroupDiscount_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfProductGroupDiscount");
    private final static QName _TransactionItem_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionItem");
    private final static QName _AttributeMaster_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AttributeMaster");
    private final static QName _DeliveryPackage_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DeliveryPackage");
    private final static QName _ArrayOfVendorGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ArrayOfVendorGroup");
    private final static QName _BarcodeInformation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BarcodeInformation");
    private final static QName _LayawayPlan_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LayawayPlan");
    private final static QName _ManufacturerGroupDiscount_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ManufacturerGroupDiscount");
    private final static QName _StockTransferBatchDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StockTransferBatchDetail");
    private final static QName _PaymentTypeAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentTypeAttribute");
    private final static QName _CountryDescription_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Description");
    private final static QName _GetCurrencyId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Id");
    private final static QName _GoodsReturnReferenceNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ReferenceNumber");
    private final static QName _GoodsReturnComment_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Comment");
    private final static QName _UpdateMasterPropertyList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PropertyList");
    private final static QName _SaveSerialResponseSaveSerialResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveSerialResult");
    private final static QName _SaveEmployeeResponseSaveEmployeeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveEmployeeResult");
    private final static QName _DiscountGroupToDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ToDate");
    private final static QName _GetQueueByWarehouseResponseGetQueueByWarehouseResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetQueueByWarehouseResult");
    private final static QName _SaveGoodsReturnResponseSaveGoodsReturnResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveGoodsReturnResult");
    private final static QName _SaveVendorGroupListResponseSaveVendorGroupListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveVendorGroupListResult");
    private final static QName _RemoveAlternateUPCResponseRemoveAlternateUPCResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RemoveAlternateUPCResult");
    private final static QName _UPCTranslationUoM_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UoM");
    private final static QName _SaveProductGroupListResponseSaveProductGroupListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveProductGroupListResult");
    private final static QName _SerialManufacturerSerialNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ManufacturerSerialNumber");
    private final static QName _SerialAdmissionDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AdmissionDate");
    private final static QName _SerialSystemNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SystemNumber");
    private final static QName _SerialManufacturingDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ManufacturingDate");
    private final static QName _SerialExpirationDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ExpirationDate");
    private final static QName _GetProductResponseGetProductResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetProductResult");
    private final static QName _XSearchTransactionResponseXSearchTransactionResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_SearchTransactionResult");
    private final static QName _GetTaxCodeId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "id");
    private final static QName _SurchargePurchaseTaxCodeId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PurchaseTaxCodeId");
    private final static QName _SurchargeTaxCodeId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TaxCodeId");
    private final static QName _SaleAttributeValidValueItems_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ValidValueItems");
    private final static QName _SaleAttributeRegExPattern_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RegExPattern");
    private final static QName _SaleAttributeDefaultValue_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DefaultValue");
    private final static QName _SaveCustomerGroupResponseSaveCustomerGroupResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCustomerGroupResult");
    private final static QName _XGetTransactionApiToken_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "apiToken");
    private final static QName _XGetTransactionUdid_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "udid");
    private final static QName _GetMonthlyPointsSummaryLoyaltyId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "loyaltyId");
    private final static QName _XAuthorizePaymentResponseXAuthorizePaymentResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_AuthorizePaymentResult");
    private final static QName _WarehousePriceListId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PriceListId");
    private final static QName _WarehouseInTransitWarehouseId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InTransitWarehouseId");
    private final static QName _WarehouseSalesTaxCodeId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SalesTaxCodeId");
    private final static QName _GetQueueByWarehouseWithoutStatusUpdateWarehouseId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "warehouseId");
    private final static QName _GetMonthlyPointsSummaryResponseGetMonthlyPointsSummaryResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetMonthlyPointsSummaryResult");
    private final static QName _LayawayPlanLayawayPlanSurchargeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LayawayPlanSurchargeList");
    private final static QName _LayawayPlanSurchargeId2_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SurchargeId2");
    private final static QName _LayawayPlanSurchargeId1_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SurchargeId1");
    private final static QName _LayawayPlanSurchargeId3_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SurchargeId3");
    private final static QName _SaveInventoryItemsInventoryItemList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "inventoryItemList");
    private final static QName _XSaveTransactionResponseXSaveTransactionResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_SaveTransactionResult");
    private final static QName _XGetPointsSummaryResponseXGetPointsSummaryResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_GetPointsSummaryResult");
    private final static QName _GetStateCountryId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "countryId");
    private final static QName _GetInventoryOfProductResponseGetInventoryOfProductResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetInventoryOfProductResult");
    private final static QName _UpdateMasterObjectResponseUpdateMasterObjectResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UpdateMasterObjectResult");
    private final static QName _SaveCustomerListCustomerList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "customerList");
    private final static QName _GetUOMResponseGetUOMResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetUOMResult");
    private final static QName _TransactionServerParametersToBusinessDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ToBusinessDate");
    private final static QName _TransactionServerParametersCustomerId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomerId");
    private final static QName _TransactionServerParametersTransactionId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionId");
    private final static QName _TransactionServerParametersFromBusinessDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FromBusinessDate");
    private final static QName _SaveUOMGroupListUomGroupList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "uomGroupList");
    private final static QName _SaveInventoryCountingInventoryCountDTO_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "inventoryCountDTO");
    private final static QName _GetCurrencyResponseGetCurrencyResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetCurrencyResult");
    private final static QName _GetAttributeResponseGetAttributeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetAttributeResult");
    private final static QName _SaveEmployeeEmployee_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "employee");
    private final static QName _SaveWarehouseListWarehouseList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "warehouseList");
    private final static QName _SaveCountryCountry_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "country");
    private final static QName _GoodsReceiptPOHandheldDeviceId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "HandheldDeviceId");
    private final static QName _GoodsReceiptPOGoodsReceiptNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptNumber");
    private final static QName _SaveVendorGroupVendorGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "vendorGroup");
    private final static QName _GetTaxCodeResponseGetTaxCodeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetTaxCodeResult");
    private final static QName _SaveSurchargeSurcharge_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "surcharge");
    private final static QName _SaveSerialListResponseSaveSerialListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveSerialListResult");
    private final static QName _SaveGoodsIssueResponseSaveGoodsIssueResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveGoodsIssueResult");
    private final static QName _SaveGoodsIssueGoodsIssue_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "goodsIssue");
    private final static QName _PostTransactionGiftCertificateList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GiftCertificateList");
    private final static QName _PostTransactionCustomerRefNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomerRefNumber");
    private final static QName _PostTransactionSurchargeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SurchargeList");
    private final static QName _PostTransactionARPaymentsList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ARPaymentsList");
    private final static QName _PostTransactionLayawayPlanId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LayawayPlanId");
    private final static QName _PostTransactionCurrentNumberOfSeries_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CurrentNumberOfSeries");
    private final static QName _PostTransactionDeliveryItemList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DeliveryItemList");
    private final static QName _PostTransactionSaleItemList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaleItemList");
    private final static QName _PostTransactionSalesOrderList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SalesOrderList");
    private final static QName _PostTransactionContactId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ContactId");
    private final static QName _PostTransactionCouponSerialNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CouponSerialNumber");
    private final static QName _PostTransactionSalesPerson_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SalesPerson");
    private final static QName _PostTransactionRefundItemList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RefundItemList");
    private final static QName _PostTransactionQuotation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Quotation");
    private final static QName _PostTransactionCouponId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CouponId");
    private final static QName _PostTransactionExchangeItemList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ExchangeItemList");
    private final static QName _PostTransactionLoyaltyId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LoyaltyId");
    private final static QName _PostTransactionLayawayItemList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LayawayItemList");
    private final static QName _PostTransactionDeliveryLocation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DeliveryLocation");
    private final static QName _PostTransactionTransactionSaleAttributes_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionSaleAttributes");
    private final static QName _PostTransactionPayments_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Payments");
    private final static QName _PostTransactionCouponIssueList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CouponIssueList");
    private final static QName _SaveUOMGroupResponseSaveUOMGroupResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveUOMGroupResult");
    private final static QName _RemoveAlternateUPCAlternateUPCList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "alternateUPCList");
    private final static QName _ARPaymentItemSalesPersons_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SalesPersons");
    private final static QName _ARPaymentItemOriginalDocumentId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "OriginalDocumentId");
    private final static QName _SaveGoodsReceiptPOGoodsReceiptPO_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "goodsReceiptPO");
    private final static QName _PromotionGetUOMId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UOMId");
    private final static QName _SaveSerialListSerialList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SerialList");
    private final static QName _SaveProductGroupResponseSaveProductGroupResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveProductGroupResult");
    private final static QName _SaveInventoryUpdatesInventoryUpdateList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "inventoryUpdateList");
    private final static QName _TransactionQuotationItems_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "QuotationItems");
    private final static QName _TransactionDeliveryItems_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DeliveryItems");
    private final static QName _TransactionPOSId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "POSId");
    private final static QName _TransactionStoreId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StoreId");
    private final static QName _TransactionTillId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TillId");
    private final static QName _TransactionRefundItems_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RefundItems");
    private final static QName _TransactionSurcharges_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Surcharges");
    private final static QName _TransactionLayaways_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Layaways");
    private final static QName _TransactionOrderItems_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "OrderItems");
    private final static QName _TransactionWarehouseId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "WarehouseId");
    private final static QName _TransactionTransactionPrintingInformation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionPrintingInformation");
    private final static QName _TransactionKey_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Key");
    private final static QName _TransactionGiftCertificates_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GiftCertificates");
    private final static QName _TransactionARPaymentItems_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ARPaymentItems");
    private final static QName _TransactionLayawaysCancellation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LayawaysCancellation");
    private final static QName _TransactionSaleItems_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaleItems");
    private final static QName _TransactionSaleExchangeItems_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaleExchangeItems");
    private final static QName _TransactionUserId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UserId");
    private final static QName _ValidateLoyaltyPortalCustomerTransactionId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "transactionId");
    private final static QName _SaveGoodsReceiptGoodsReceipt_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "goodsReceipt");
    private final static QName _VendorFaxNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FaxNumber");
    private final static QName _VendorAlternatePhoneNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AlternatePhoneNumber");
    private final static QName _VendorEmail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Email");
    private final static QName _VendorVendorProductList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "VendorProductList");
    private final static QName _VendorTaxNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TaxNumber");
    private final static QName _VendorShippingAddresses_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ShippingAddresses");
    private final static QName _VendorMobilePhone_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "MobilePhone");
    private final static QName _VendorPhoneNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PhoneNumber");
    private final static QName _VendorBillingAddresses_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BillingAddresses");
    private final static QName _VendorWebPage_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "WebPage");
    private final static QName _GetNextNumberPassword_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Password");
    private final static QName _GetNextNumberTableName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TableName");
    private final static QName _XAuthorizePaymentData_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "data");
    private final static QName _SaveCurrencyListCurrencyList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "currencyList");
    private final static QName _LoyaltyCardInformationElectronicId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ElectronicId");
    private final static QName _LoyaltyCardInformationGender_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Gender");
    private final static QName _LoyaltyCardInformationMiddleName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "MiddleName");
    private final static QName _LoyaltyCardInformationLoyaltyCustomerCountry_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LoyaltyCustomerCountry");
    private final static QName _LoyaltyCardInformationAnniversaryDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AnniversaryDate");
    private final static QName _LoyaltyCardInformationTitle_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Title");
    private final static QName _LoyaltyCardInformationCity_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "City");
    private final static QName _LoyaltyCardInformationZipCode_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ZipCode");
    private final static QName _LoyaltyCardInformationBirthDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BirthDate");
    private final static QName _LoyaltyCardInformationCompanyName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CompanyName");
    private final static QName _LoyaltyCardInformationSalutation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Salutation");
    private final static QName _LoyaltyCardInformationAddress1_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Address1");
    private final static QName _LoyaltyCardInformationAddress3_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Address3");
    private final static QName _LoyaltyCardInformationAddress2_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Address2");
    private final static QName _LoyaltyCardInformationCustomerGroupId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomerGroupId");
    private final static QName _LoyaltyCardInformationFirstName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FirstName");
    private final static QName _LoyaltyCardInformationNickName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "NickName");
    private final static QName _LoyaltyCardInformationLoyaltyCustomerState_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LoyaltyCustomerState");
    private final static QName _LoyaltyCardInformationLastName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LastName");
    private final static QName _SaveShippingTypeListResponseSaveShippingTypeListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveShippingTypeListResult");
    private final static QName _SaveTaxCodeConditionTaxCodeCondition_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "taxCodeCondition");
    private final static QName _GetPrePrintedLoyaltyCardsResponseGetPrePrintedLoyaltyCardsResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetPrePrintedLoyaltyCardsResult");
    private final static QName _SaveUpsellItemsUpsellItemList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "upsellItemList");
    private final static QName _AuthorizePaymentRequestBankCode_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BankCode");
    private final static QName _AuthorizePaymentRequestCardName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CardName");
    private final static QName _AuthorizePaymentRequestTrack2Data_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Track2Data");
    private final static QName _AuthorizePaymentRequestOriginalReferenceNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "OriginalReferenceNumber");
    private final static QName _AuthorizePaymentRequestGiftCertificateNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GiftCertificateNumber");
    private final static QName _AuthorizePaymentRequestCardNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CardNumber");
    private final static QName _AuthorizePaymentRequestTrack1Data_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Track1Data");
    private final static QName _AuthorizePaymentRequestPaymentAttributes_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentAttributes");
    private final static QName _AuthorizePaymentRequestTrack3Data_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Track3Data");
    private final static QName _AuthorizePaymentRequestTrackInformation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TrackInformation");
    private final static QName _AuthorizePaymentRequestGiftCertificateId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GiftCertificateId");
    private final static QName _AuthorizePaymentRequestSecurityCode_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SecurityCode");
    private final static QName _GetTaxCodeConditionsResponseGetTaxCodeConditionsResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetTaxCodeConditionsResult");
    private final static QName _SaveTaxCodeResponseSaveTaxCodeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveTaxCodeResult");
    private final static QName _RemoveProductSurchargesResponseRemoveProductSurchargesResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RemoveProductSurchargesResult");
    private final static QName _GetAllDeliveryPackageResponseGetAllDeliveryPackageResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetAllDeliveryPackageResult");
    private final static QName _SaveTaxCodeListTaxCodeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "taxCodeList");
    private final static QName _SaveInventoryCountingResponseSaveInventoryCountingResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveInventoryCountingResult");
    private final static QName _SaveBarCodeMaskListBarcodeMaskList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "barcodeMaskList");
    private final static QName _EmployeeTeamId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TeamId");
    private final static QName _EmployeeJobCodeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "JobCodeList");
    private final static QName _EmployeeDepartmentId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DepartmentId");
    private final static QName _EmployeeJobTitle_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "JobTitle");
    private final static QName _EmployeeRetailProfileId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RetailProfileId");
    private final static QName _EmployeePositionId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PositionId");
    private final static QName _SaveCouponResponseSaveCouponResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCouponResult");
    private final static QName _GetBarCodeResolutionBarCode_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "barCode");
    private final static QName _SaveAttributeAttribute_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "attribute");
    private final static QName _GetInventoryOfWarehouseProductGroupId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "productGroupId");
    private final static QName _PaymentTypeAttributePaymentTypeKey_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentTypeKey");
    private final static QName _PaymentTypeAttributePaymentTypeAttributeKey_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentTypeAttributeKey");
    private final static QName _POSHardwareProfileId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "HardwareProfileId");
    private final static QName _POSCustomerPrefix_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomerPrefix");
    private final static QName _POSHardwareId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "HardwareId");
    private final static QName _POSPrintProfileId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PrintProfileId");
    private final static QName _TransactionPaymentAuthorizationCode_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AuthorizationCode");
    private final static QName _TransactionPaymentName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Name");
    private final static QName _TransactionPaymentSurchargeId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SurchargeId");
    private final static QName _TransactionPaymentPaymentReferenceNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentReferenceNumber");
    private final static QName _TransactionPaymentGiftCertificateType_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GiftCertificateType");
    private final static QName _TransactionPaymentAccountNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AccountNumber");
    private final static QName _TransactionPaymentCurrencyId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CurrencyId");
    private final static QName _TransactionPaymentSignature_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Signature");
    private final static QName _SavePriceListListPriceListList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "priceListList");
    private final static QName _GetCustomerGroupResponseGetCustomerGroupResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetCustomerGroupResult");
    private final static QName _SaveStateListResponseSaveStateListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveStateListResult");
    private final static QName _GiftCertificateMasterLongDescription_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LongDescription");
    private final static QName _GiftCertificateMasterShortDescription_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ShortDescription");
    private final static QName _GiftCertificateMasterUPC_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UPC");
    private final static QName _XGetPointsSummaryCustomerLoyaltyId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomerLoyaltyId");
    private final static QName _InventoryUpdateSerialIntrernalSerialNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "IntrernalSerialNumber");
    private final static QName _InventoryUpdateSerialProductionDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductionDate");
    private final static QName _InventoryUpdateSerialSupplierSerialNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SupplierSerialNumber");
    private final static QName _InventoryUpdateSerialExpiryDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ExpiryDate");
    private final static QName _InventoryUpdateSerialSystemSerial_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SystemSerial");
    private final static QName _InventoryUpdateSerialBaseType_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BaseType");
    private final static QName _InventoryUpdateSerialBatchId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BatchId");
    private final static QName _InventoryUpdateSerialInDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InDate");
    private final static QName _InventoryUpdateSerialBaseEntry_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BaseEntry");
    private final static QName _GetVendorGroupResponseGetVendorGroupResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetVendorGroupResult");
    private final static QName _SavePriceListListResponseSavePriceListListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SavePriceListListResult");
    private final static QName _GetAllStoresResponseGetAllStoresResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetAllStoresResult");
    private final static QName _SaveSpecialPriceListSpecialPriceList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "specialPriceList");
    private final static QName _SaveStoreResponseSaveStoreResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveStoreResult");
    private final static QName _SaveProductGroupDiscountListResponseSaveProductGroupDiscountListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveProductGroupDiscountListResult");
    private final static QName _DeleteExchangeRateByCurrencyAndDateCurrencyId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "currencyId");
    private final static QName _SavePaymentTypeListPaymentTypeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentTypeList");
    private final static QName _GetInventoryOfProductProductId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "productId");
    private final static QName _SaveSurchargeListResponseSaveSurchargeListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveSurchargeListResult");
    private final static QName _XSearchTransactionFilterParameter_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "filterParameter");
    private final static QName _PostTransactionLineItemAttributeItemAttributeName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ItemAttributeName");
    private final static QName _PostTransactionLineItemAttributeAttributeValue_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AttributeValue");
    private final static QName _GetProductImageResponseGetProductImageResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetProductImageResult");
    private final static QName _SaveCustomerGroupListResponseSaveCustomerGroupListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCustomerGroupListResult");
    private final static QName _SaveCustomerCatalogCustomerCatalog_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "customerCatalog");
    private final static QName _SaveProductCostResponseSaveProductCostResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveProductCostResult");
    private final static QName _XUpdateLoyaltyCustomerResponseXUpdateLoyaltyCustomerResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_UpdateLoyaltyCustomerResult");
    private final static QName _PriceMatrixProductDescription_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductDescription");
    private final static QName _PromotionProductDetailSerialNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SerialNumber");
    private final static QName _PromotionProductDetailStatus_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Status");
    private final static QName _PromotionProductDetailBatchNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BatchNumber");
    private final static QName _SaveCustomerGroupDiscountListSpecialPriceDiscountGroupList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "specialPriceDiscountGroupList");
    private final static QName _SaveBatchListResponseSaveBatchListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveBatchListResult");
    private final static QName _SaveProductGroupProductGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "productGroup");
    private final static QName _SaveCustomerCatalogResponseSaveCustomerCatalogResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCustomerCatalogResult");
    private final static QName _SaveManufacturerResponseSaveManufacturerResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveManufacturerResult");
    private final static QName _SaveGoodsReceiptListResponseSaveGoodsReceiptListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveGoodsReceiptListResult");
    private final static QName _RollBackRedeemedPointsLoyaltyCard_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "loyaltyCard");
    private final static QName _CustomTransactionInfoGridCustomTransactionInfoGridDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomTransactionInfoGridDetailList");
    private final static QName _CustomTransactionInfoGridCaption_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Caption");
    private final static QName _CustomTransactionInfoGridSequence_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Sequence");
    private final static QName _SaveStateState_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "state");
    private final static QName _SavePaymentTypeResponseSavePaymentTypeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SavePaymentTypeResult");
    private final static QName _SaveCustomerGroupDiscountListResponseSaveCustomerGroupDiscountListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCustomerGroupDiscountListResult");
    private final static QName _SetKitComponentsResponseSetKitComponentsResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SetKitComponentsResult");
    private final static QName _SaveVendorProductMappingResponseSaveVendorProductMappingResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveVendorProductMappingResult");
    private final static QName _PostTransactionSaleAttributeSaleAttributeName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaleAttributeName");
    private final static QName _SaveProductResponseSaveProductResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveProductResult");
    private final static QName _RetailProfilePOSSkinName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "POSSkinName");
    private final static QName _RetailProfilePoleDisplayStartTransactionMessageId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PoleDisplayStartTransactionMessageId");
    private final static QName _RetailProfileManagementConsoleSkinName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ManagementConsoleSkinName");
    private final static QName _RetailProfileChangeAmountPaymentCurrencyId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ChangeAmountPaymentCurrencyId");
    private final static QName _RetailProfilePoleDisplayIdleMessageId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PoleDisplayIdleMessageId");
    private final static QName _RetailProfilePoleDisplayCompleteSaleMessageId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PoleDisplayCompleteSaleMessageId");
    private final static QName _RetailProfileEventId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "EventId");
    private final static QName _GetAllLineAttributeResponseGetAllLineAttributeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetAllLineAttributeResult");
    private final static QName _ProductProductInventoryList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductInventoryList");
    private final static QName _ProductMerchandiseHierarchyDetailKey_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "MerchandiseHierarchyDetailKey");
    private final static QName _ProductExternalLink_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ExternalLink");
    private final static QName _ProductManufacturerId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ManufacturerId");
    private final static QName _ProductAlternateUPCCodes_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AlternateUPCCodes");
    private final static QName _ProductParentProductId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ParentProductId");
    private final static QName _ProductAssemblyComponents_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AssemblyComponents");
    private final static QName _ProductPackageGroupId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PackageGroupId");
    private final static QName _ProductAttributeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AttributeList");
    private final static QName _ProductBarCodeMaskId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BarCodeMaskId");
    private final static QName _ProductPreferedVendorId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PreferedVendorId");
    private final static QName _ProductProductClassId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductClassId");
    private final static QName _ProductProductMerchandiseHierarchyDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductMerchandiseHierarchyDetailList");
    private final static QName _ProductUOMGroupId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UOMGroupId");
    private final static QName _ProductKitComponents_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "KitComponents");
    private final static QName _ProductImageLocation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ImageLocation");
    private final static QName _GetInventoryOfWarehouseResponseGetInventoryOfWarehouseResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetInventoryOfWarehouseResult");
    private final static QName _SaveBatchListBatchList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BatchList");
    private final static QName _SaveVendorListVendorList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "vendorList");
    private final static QName _GetEmployeeResponseGetEmployeeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetEmployeeResult");
    private final static QName _SaveTaxCodeConditionResponseSaveTaxCodeConditionResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveTaxCodeConditionResult");
    private final static QName _SaveProductListResponseSaveProductListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveProductListResult");
    private final static QName _ReplicationSendDumpReceiver_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Receiver");
    private final static QName _ReplicationSendDumpInsertQuery_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InsertQuery");
    private final static QName _ReplicationSendDumpSender_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Sender");
    private final static QName _ReplicationSendDumpDeleteQuery_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DeleteQuery");
    private final static QName _ReplicationSendDumpTableType_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TableType");
    private final static QName _ReplicationSendDumpUpdateQuery_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UpdateQuery");
    private final static QName _ReplicationSendDumpReceivingSiteID_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ReceivingSiteID");
    private final static QName _ReplicationSendDumpTablePrimaryColumn_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TablePrimaryColumn");
    private final static QName _SaveExchangeRateListExchangeRateList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "exchangeRateList");
    private final static QName _NumberSeriesMasterSuffix_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Suffix");
    private final static QName _NumberSeriesMasterCurrentNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CurrentNumber");
    private final static QName _NumberSeriesMasterEndNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "EndNumber");
    private final static QName _NumberSeriesMasterPrefix_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Prefix");
    private final static QName _NumberSeriesMasterStartNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StartNumber");
    private final static QName _SaveReplicationSendDumpListReplicationSendDumpList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "replicationSendDumpList");
    private final static QName _GetReplicationStatusResponseGetReplicationStatusResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetReplicationStatusResult");
    private final static QName _StockTransferRequestNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RequestNumber");
    private final static QName _StockTransferReferenceNumber2_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ReferenceNumber2");
    private final static QName _StockTransferReferenceNumber1_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ReferenceNumber1");
    private final static QName _TaxCodeConditionToTime_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ToTime");
    private final static QName _TaxCodeConditionUDFCondition1_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UDFCondition1");
    private final static QName _TaxCodeConditionAttributeCondition1_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AttributeCondition1");
    private final static QName _TaxCodeConditionUDFCondition3_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UDFCondition3");
    private final static QName _TaxCodeConditionAttributeCondition2_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AttributeCondition2");
    private final static QName _TaxCodeConditionUDFCondition2_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UDFCondition2");
    private final static QName _TaxCodeConditionAttributeCondition3_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AttributeCondition3");
    private final static QName _TaxCodeConditionAttributeValue1_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AttributeValue1");
    private final static QName _TaxCodeConditionAttributeValue2_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AttributeValue2");
    private final static QName _TaxCodeConditionAttributeValue3_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AttributeValue3");
    private final static QName _TaxCodeConditionFromTime_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FromTime");
    private final static QName _TaxCodeConditionUDFValue1_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UDFValue1");
    private final static QName _TaxCodeConditionUDFValue3_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UDFValue3");
    private final static QName _TaxCodeConditionUDFValue2_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UDFValue2");
    private final static QName _TaxCodeConditionFromDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FromDate");
    private final static QName _SaveGoodsIssueListResponseSaveGoodsIssueListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveGoodsIssueListResult");
    private final static QName _GetPriceListResponseGetPriceListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetPriceListResult");
    private final static QName _GetProductCostResponseGetProductCostResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetProductCostResult");
    private final static QName _SaveVendorProductMappingObjectList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "objectList");
    private final static QName _GetBarCodeResolutionResponseGetBarCodeResolutionResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetBarCodeResolutionResult");
    private final static QName _GetRetailProfileResponseGetRetailProfileResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetRetailProfileResult");
    private final static QName _BaseWrapperUserFieldsList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UserFieldsList");
    private final static QName _BaseWrapperMessage_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Message");
    private final static QName _BaseWrapperEnterpriseName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "EnterpriseName");
    private final static QName _SaveTransactionTransaction_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "transaction");
    private final static QName _SaveProductSurchargesProductSurchargesList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "productSurchargesList");
    private final static QName _SaveUOMListResponseSaveUOMListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveUOMListResult");
    private final static QName _GetReplicationSendDumpResponseGetReplicationSendDumpResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetReplicationSendDumpResult");
    private final static QName _SaveSurchargeResponseSaveSurchargeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveSurchargeResult");
    private final static QName _XPostFulfillmentResponseXPostFulfillmentResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_PostFulfillmentResult");
    private final static QName _AuthorizePaymentDataObject_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "dataObject");
    private final static QName _GetDeliveryPackageByKeyResponseGetDeliveryPackageByKeyResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetDeliveryPackageByKeyResult");
    private final static QName _SaveAttributeResponseSaveAttributeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveAttributeResult");
    private final static QName _SavePurchaseOrderPurchaseOrder_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "purchaseOrder");
    private final static QName _SaveWarehouseListResponseSaveWarehouseListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveWarehouseListResult");
    private final static QName _SaveProductGroupListProductGroupList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "productGroupList");
    private final static QName _GetWarehouseResponseGetWarehouseResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetWarehouseResult");
    private final static QName _SaveAttributeListResponseSaveAttributeListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveAttributeListResult");
    private final static QName _SaveProductCostProductCostList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "productCostList");
    private final static QName _RemoveAlternateItemsAlternateItemList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "alternateItemList");
    private final static QName _StockTransferRequisitionToWarehouseId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ToWarehouseId");
    private final static QName _StockTransferRequisitionStockTransferRequestDetails_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StockTransferRequestDetails");
    private final static QName _StockTransferRequisitionFromWarehouseId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FromWarehouseId");
    private final static QName _XGetDeltaQueueResponseXGetDeltaQueueResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_GetDeltaQueueResult");
    private final static QName _SavePurchaseOrderResponseSavePurchaseOrderResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SavePurchaseOrderResult");
    private final static QName _SaveShippingTypeListShippingTypeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "shippingTypeList");
    private final static QName _CustomerLoyalityId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LoyalityId");
    private final static QName _CustomerPrimaryBillingAddresses_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PrimaryBillingAddresses");
    private final static QName _CustomerPrimaryShippingAddresses_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PrimaryShippingAddresses");
    private final static QName _CustomerShippingTypeId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ShippingTypeId");
    private final static QName _CustomerContacts_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Contacts");
    private final static QName _CustomerPrimaryContactId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PrimaryContactId");
    private final static QName _GetEnterpriseResponseGetEnterpriseResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetEnterpriseResult");
    private final static QName _StockTransferDetailStockTransferBatchDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StockTransferBatchDetailList");
    private final static QName _StockTransferDetailStockTransferSerialDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StockTransferSerialDetailList");
    private final static QName _SavePriceMatrixResponseSavePriceMatrixResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SavePriceMatrixResult");
    private final static QName _GetPrePrintedLoyaltyCardsBySiteIdResponseGetPrePrintedLoyaltyCardsBySiteIdResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetPrePrintedLoyaltyCardsBySiteIdResult");
    private final static QName _PaymentResponseAdditionalInformation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AdditionalInformation");
    private final static QName _GetLineAttributeResponseGetLineAttributeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetLineAttributeResult");
    private final static QName _SaveManufacturerDiscountListResponseSaveManufacturerDiscountListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveManufacturerDiscountListResult");
    private final static QName _SaveDumpResponseSaveDumpResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveDumpResult");
    private final static QName _GetDeliveryPackageByIdResponseGetDeliveryPackageByIdResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetDeliveryPackageByIdResult");
    private final static QName _SaveStockTransferResponseSaveStockTransferResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveStockTransferResult");
    private final static QName _GetManufacturerResponseGetManufacturerResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetManufacturerResult");
    private final static QName _SavePromotionalBonusBuysResponseSavePromotionalBonusBuysResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SavePromotionalBonusBuysResult");
    private final static QName _GetVendorResponseGetVendorResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetVendorResult");
    private final static QName _SetAssemblyComponentsProductList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "productList");
    private final static QName _SavePriceMatrixPriceMatrixList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "priceMatrixList");
    private final static QName _SavePriceListPriceList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "priceList");
    private final static QName _GetReplicationSendDumpSiteId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "siteId");
    private final static QName _PostFulfillmentResponsePostFulfillmentResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PostFulfillmentResult");
    private final static QName _DeliveryPackageAddressCountryName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CountryName");
    private final static QName _DeliveryPackageAddressCounty_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "County");
    private final static QName _DeliveryPackageAddressStateName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StateName");
    private final static QName _DeliveryPackageAddressFullAddress_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FullAddress");
    private final static QName _RemoveUpsellItemsResponseRemoveUpsellItemsResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RemoveUpsellItemsResult");
    private final static QName _AuthorizePaymentResponseAuthorizePaymentResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "AuthorizePaymentResult");
    private final static QName _SaveUOMGroupListResponseSaveUOMGroupListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveUOMGroupListResult");
    private final static QName _SaveUpsellItemsResponseSaveUpsellItemsResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveUpsellItemsResult");
    private final static QName _UpdateMasterObjectMasterRecord_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "masterRecord");
    private final static QName _SaveCurrencyListResponseSaveCurrencyListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCurrencyListResult");
    private final static QName _GetQueueResponseGetQueueResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetQueueResult");
    private final static QName _SaveGoodsReceiptPOListGoodsReceiptPOList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "goodsReceiptPOList");
    private final static QName _PaymentTypePaymentTypeSurchargeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentTypeSurchargeList");
    private final static QName _PaymentTypePaymentTypeAttributeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentTypeAttributeList");
    private final static QName _PaymentTypePaymentTypeDiscountList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PaymentTypeDiscountList");
    private final static QName _PurchaseOrderDetailItemSurcharges_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ItemSurcharges");
    private final static QName _SaveTaxCodeConditionListResponseSaveTaxCodeConditionListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveTaxCodeConditionListResult");
    private final static QName _ExecuteQueriesQueryList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "QueryList");
    private final static QName _GetQueryResultResponseGetQueryResultResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetQueryResultResult");
    private final static QName _SaveTransactionResponseSaveTransactionResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveTransactionResult");
    private final static QName _CancelSalesOrderTransactionKey_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "transactionKey");
    private final static QName _SetFinalInventoryResponseSetFinalInventoryResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SetFinalInventoryResult");
    private final static QName _ExecuteQueriesResponseExecuteQueriesResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ExecuteQueriesResult");
    private final static QName _RegisterLoyaltyCustomerResponseRegisterLoyaltyCustomerResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RegisterLoyaltyCustomerResult");
    private final static QName _SavePromotionalBonusBuysListPromotionBonusBuysList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PromotionBonusBuysList");
    private final static QName _SaveExchangeRateExchangeRate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "exchangeRate");
    private final static QName _XGetExchangeRateResponseXGetExchangeRateResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_GetExchangeRateResult");
    private final static QName _SaveCustomerCustomer_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "customer");
    private final static QName _SaveSpecialPriceSpecialPrice_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "specialPrice");
    private final static QName _SaveStoreListResponseSaveStoreListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveStoreListResult");
    private final static QName _TransactionItemSaleItemType_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaleItemType");
    private final static QName _TransactionItemTransactionLineItemAttributes_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionLineItemAttributes");
    private final static QName _TransactionItemBookingStoreId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BookingStoreId");
    private final static QName _TransactionItemProductDetailNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductDetailNumber");
    private final static QName _TransactionItemProductId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductId");
    private final static QName _TransactionItemDeliveryWarehouseId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DeliveryWarehouseId");
    private final static QName _TransactionItemProductUPC_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductUPC");
    private final static QName _TransactionItemBookingWarehouseId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BookingWarehouseId");
    private final static QName _SaveManufacturerListManufacturerList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "manufacturerList");
    private final static QName _UpdateLoyaltyCustomerResponseUpdateLoyaltyCustomerResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UpdateLoyaltyCustomerResult");
    private final static QName _SaveVendorGroupListVendorGroupList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "vendorGroupList");
    private final static QName _GetCouponResponseGetCouponResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetCouponResult");
    private final static QName _SaveCouponListCouponList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CouponList");
    private final static QName _SaveCustomerGroupCustomerGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "customerGroup");
    private final static QName _SavePriceListResponseSavePriceListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SavePriceListResult");
    private final static QName _AddressStateId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StateId");
    private final static QName _AddressCountryId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CountryId");
    private final static QName _SavePaymentTypeListResponseSavePaymentTypeListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SavePaymentTypeListResult");
    private final static QName _PostTransactionItemTransactionItemId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionItemId");
    private final static QName _PostTransactionItemProductReturnDetailNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductReturnDetailNumber");
    private final static QName _GoodsReceiptDetailGoodsReceiptSerialDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptSerialDetailList");
    private final static QName _GoodsReceiptDetailGoodsReceiptBatchDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptBatchDetailList");
    private final static QName _SaveTaxCodeListResponseSaveTaxCodeListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveTaxCodeListResult");
    private final static QName _TaxCodeTaxPeriodDefinitionList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TaxPeriodDefinitionList");
    private final static QName _GetPromotionBonusBuysResponseGetPromotionBonusBuysResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetPromotionBonusBuysResult");
    private final static QName _GetCountryResponseGetCountryResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetCountryResult");
    private final static QName _GetTransactionDataResponseGetTransactionDataResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetTransactionDataResult");
    private final static QName _SaveInventoryUpdatesResponseSaveInventoryUpdatesResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveInventoryUpdatesResult");
    private final static QName _GetUpgradeInformationResponseGetUpgradeInformationResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetUpgradeInformationResult");
    private final static QName _PriceListPriceUOMMatrixList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PriceUOMMatrixList");
    private final static QName _PriceListPriceMatrixList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PriceMatrixList");
    private final static QName _PriceListPriceListName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PriceListName");
    private final static QName _SetAssemblyComponentsResponseSetAssemblyComponentsResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SetAssemblyComponentsResult");
    private final static QName _XGetInventoryOfProductResponseXGetInventoryOfProductResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_GetInventoryOfProductResult");
    private final static QName _GetProductUpgradeInformationResponseGetProductUpgradeInformationResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetProductUpgradeInformationResult");
    private final static QName _SaveCurrencyResponseSaveCurrencyResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCurrencyResult");
    private final static QName _GetAllStatesResponseGetAllStatesResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetAllStatesResult");
    private final static QName _StoreCashCustomerId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CashCustomerId");
    private final static QName _StoreDefaultNumberSeriesId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DefaultNumberSeriesId");
    private final static QName _StoreCounrtyId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CounrtyId");
    private final static QName _StoreBankAccount_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BankAccount");
    private final static QName _StoreBank_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Bank");
    private final static QName _StorePricingStoreGroupId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PricingStoreGroupId");
    private final static QName _StoreSalesPersonId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SalesPersonId");
    private final static QName _StoreFulfillmentPlanId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FulfillmentPlanId");
    private final static QName _StoreLayawayFulfillmentPlanId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LayawayFulfillmentPlanId");
    private final static QName _SpecialPriceDiscountGroupProductGroupId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ProductGroupId");
    private final static QName _SaveUOMGroupUomGroup_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "uomGroup");
    private final static QName _SaveCountryResponseSaveCountryResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCountryResult");
    private final static QName _EnterpriseLoyaltyServiceEndPoint_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "LoyaltyServiceEndPoint");
    private final static QName _EnterpriseFederalTaxId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FederalTaxId");
    private final static QName _EnterpriseClubPassword_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ClubPassword");
    private final static QName _EnterpriseSellTaxCodeId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SellTaxCodeId");
    private final static QName _EnterpriseClubUserId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ClubUserId");
    private final static QName _EnterpriseClubServiceEndPoint_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ClubServiceEndPoint");
    private final static QName _EnterpriseUseTransactionConsolidationOriginal_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UseTransactionConsolidationOriginal");
    private final static QName _SaveUOMUom_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "uom");
    private final static QName _SaveStateListStateList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "stateList");
    private final static QName _UserDefinedFieldsDetailsRegularExpression_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RegularExpression");
    private final static QName _UserDefinedFieldsDetailsFieldName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FieldName");
    private final static QName _SaveUOMResponseSaveUOMResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveUOMResult");
    private final static QName _SaveStoreStore_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "store");
    private final static QName _CustomTransactionInfoGridDetailValueSource_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ValueSource");
    private final static QName _CustomTransactionInfoGridDetailHeaderId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "HeaderId");
    private final static QName _CustomTransactionInfoGridDetailCustomTransactionInfoGridDetailId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CustomTransactionInfoGridDetailId");
    private final static QName _CustomTransactionInfoGridDetailParentGridDetailId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ParentGridDetailId");
    private final static QName _SaveGoodsReturnListGoodsReturnList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "goodsReturnList");
    private final static QName _SaveGiftCertificateMasterListResponseSaveGiftCertificateMasterListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveGiftCertificateMasterListResult");
    private final static QName _InventoryCountDetailInventoryCountBatchDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryCountBatchDetailList");
    private final static QName _InventoryCountDetailInventoryCountSerialDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryCountSerialDetailList");
    private final static QName _SaveAccountsReceivableAccountsReceivable_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "accountsReceivable");
    private final static QName _SaveGoodsReturnGoodsReturn_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "goodsReturn");
    private final static QName _GetAllSaleAttributeResponseGetAllSaleAttributeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetAllSaleAttributeResult");
    private final static QName _GetProductGroupResponseGetProductGroupResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetProductGroupResult");
    private final static QName _SaveTransactionSignatureResponseSaveTransactionSignatureResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveTransactionSignatureResult");
    private final static QName _XSaveCustomerResponseXSaveCustomerResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_SaveCustomerResult");
    private final static QName _SaveCountryListResponseSaveCountryListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCountryListResult");
    private final static QName _GetPointsSummaryByTransactionKeyResponseGetPointsSummaryByTransactionKeyResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetPointsSummaryByTransactionKeyResult");
    private final static QName _SaveBarCodeMaskBarcodeMask_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "barcodeMask");
    private final static QName _SavePurchaseOrderListPurchaseOrderList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "purchaseOrderList");
    private final static QName _SaveSurchargeListSurchargeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "surchargeList");
    private final static QName _SaveWarehouseWarehouse_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "warehouse");
    private final static QName _SaveCouponListResponseSaveCouponListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCouponListResult");
    private final static QName _GetExchangeRateByDateResponseGetExchangeRateByDateResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetExchangeRateByDateResult");
    private final static QName _SaveStockTransferListStockTransferList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "stockTransferList");
    private final static QName _GetQueueOfEnterpriseWithoutStatusUpdateResponseGetQueueOfEnterpriseWithoutStatusUpdateResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetQueueOfEnterpriseWithoutStatusUpdateResult");
    private final static QName _XSyncInventoryResponseXSyncInventoryResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_SyncInventoryResult");
    private final static QName _ValidateUserWithDeviceIdDeviceName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DeviceName");
    private final static QName _SavePromotionalBonusBuysListResponseSavePromotionalBonusBuysListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SavePromotionalBonusBuysListResult");
    private final static QName _SaveAccountsReceivableListAccountsReceivableList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "accountsReceivableList");
    private final static QName _SaveUOMListUomList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "uomList");
    private final static QName _UpdateGiftCertificateBalanceResponseUpdateGiftCertificateBalanceResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UpdateGiftCertificateBalanceResult");
    private final static QName _SaveShippingTypeResponseSaveShippingTypeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveShippingTypeResult");
    private final static QName _SaveEmployeeListResponseSaveEmployeeListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveEmployeeListResult");
    private final static QName _XGetGiftCertificateBalanceGiftCertificateNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "giftCertificateNumber");
    private final static QName _XGetTransactionResponseXGetTransactionResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_GetTransactionResult");
    private final static QName _InventoryUpdateSerialDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SerialDetailList");
    private final static QName _InventoryUpdateBaseReference_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BaseReference");
    private final static QName _InventoryUpdateTransactionNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionNumber");
    private final static QName _InventoryUpdateTransactionType_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "TransactionType");
    private final static QName _InventoryUpdateBatchDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BatchDetailList");
    private final static QName _InventoryUpdateLocation_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Location");
    private final static QName _SaveStoreListCountryList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "countryList");
    private final static QName _InventoryItemInventoryCycleId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryCycleId");
    private final static QName _GetPointsSummaryResponseGetPointsSummaryResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetPointsSummaryResult");
    private final static QName _XRegisterLoyaltyCustomerResponseXRegisterLoyaltyCustomerResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "X_RegisterLoyaltyCustomerResult");
    private final static QName _GetPointsDetailsResponseGetPointsDetailsResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetPointsDetailsResult");
    private final static QName _InventoryCountInventoryCountDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryCountDetailList");
    private final static QName _APIExceptionExceptionType_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ExceptionType");
    private final static QName _APIExceptionSource_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Source");
    private final static QName _GetGiftCertificateMasterResponseGetGiftCertificateMasterResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetGiftCertificateMasterResult");
    private final static QName _GetShippingTypeResponseGetShippingTypeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetShippingTypeResult");
    private final static QName _SaveGoodsReceiptResponseSaveGoodsReceiptResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveGoodsReceiptResult");
    private final static QName _SaveBatchResponseSaveBatchResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveBatchResult");
    private final static QName _SaveAlternateUPCResponseSaveAlternateUPCResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveAlternateUPCResult");
    private final static QName _GetBarCodeMaskResponseGetBarCodeMaskResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetBarCodeMaskResult");
    private final static QName _ContactComment2_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Comment2");
    private final static QName _ContactComment1_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Comment1");
    private final static QName _ContactFax_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Fax");
    private final static QName _ContactPhone2_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Phone2");
    private final static QName _ContactPhone1_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Phone1");
    private final static QName _ContactPager_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Pager");
    private final static QName _SaveTaxCodeTaxCode_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "taxCode");
    private final static QName _SaveAccountsReceivableListResponseSaveAccountsReceivableListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveAccountsReceivableListResult");
    private final static QName _SavePurchaseOrderListResponseSavePurchaseOrderListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SavePurchaseOrderListResult");
    private final static QName _SaveAttributeListAttributeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "attributeList");
    private final static QName _SaveBarCodeMaskListResponseSaveBarCodeMaskListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveBarCodeMaskListResult");
    private final static QName _GetQueryResultQueryText_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "queryText");
    private final static QName _GetQueueWithoutStatusUpdateResponseGetQueueWithoutStatusUpdateResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetQueueWithoutStatusUpdateResult");
    private final static QName _CouponUPCCode_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "UPCCode");
    private final static QName _SpecialPricingSpecialPriceListDate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SpecialPriceListDate");
    private final static QName _SpecialPricingBasePriceListId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BasePriceListId");
    private final static QName _SaveAccountsReceivableResponseSaveAccountsReceivableResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveAccountsReceivableResult");
    private final static QName _FulfillmentPlanFulfillmentPlanSurchargeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "FulfillmentPlanSurchargeList");
    private final static QName _SaveStockTransferListResponseSaveStockTransferListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveStockTransferListResult");
    private final static QName _TransactionPrintingPrinterNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PrinterNumber");
    private final static QName _TransactionPrintingCompanyRegisterationId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CompanyRegisterationId");
    private final static QName _TransactionPrintingNCFNumberOfRefund_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "NCFNumberOfRefund");
    private final static QName _TransactionPrintingNCFNumberOfSale_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "NCFNumberOfSale");
    private final static QName _TransactionPrintingZReportNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ZReportNumber");
    private final static QName _TransactionPrintingReceiptNumber_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ReceiptNumber");
    private final static QName _SaveDumpListResponseSaveDumpListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveDumpListResult");
    private final static QName _UpdateRecordsStatusIntegrationKeysList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "IntegrationKeysList");
    private final static QName _SaveGoodsReturnListResponseSaveGoodsReturnListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveGoodsReturnListResult");
    private final static QName _GetStoreResponseGetStoreResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetStoreResult");
    private final static QName _SaveVendorResponseSaveVendorResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveVendorResult");
    private final static QName _GetCustomerResponseGetCustomerResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetCustomerResult");
    private final static QName _GetBatchResponseGetBatchResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetBatchResult");
    private final static QName _SaveCustomerListResponseSaveCustomerListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCustomerListResult");
    private final static QName _SaveProductSurchargesResponseSaveProductSurchargesResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveProductSurchargesResult");
    private final static QName _SaveVendorListResponseSaveVendorListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveVendorListResult");
    private final static QName _SaveManufacturerListResponseSaveManufacturerListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveManufacturerListResult");
    private final static QName _SaveShippingTypeShippingType_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "shippingType");
    private final static QName _GoodsReturnDetailGoodsReturnSerialDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReturnSerialDetailList");
    private final static QName _GoodsReturnDetailGoodsReturnBatchDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReturnBatchDetailList");
    private final static QName _GetVersionInformationResponseGetVersionInformationResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetVersionInformationResult");
    private final static QName _GetSaleAttributeResponseGetSaleAttributeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetSaleAttributeResult");
    private final static QName _SaveTaxCodeConditionListTaxCodeConditionList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "taxCodeConditionList");
    private final static QName _AccountsReceivableBankCountry_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BankCountry");
    private final static QName _AccountsReceivableBankBranch_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BankBranch");
    private final static QName _GetSurchargeResponseGetSurchargeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetSurchargeResult");
    private final static QName _SaveStateResponseSaveStateResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveStateResult");
    private final static QName _GetAllCountriesResponseGetAllCountriesResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetAllCountriesResult");
    private final static QName _GetQueueOfEnterpriseResponseGetQueueOfEnterpriseResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetQueueOfEnterpriseResult");
    private final static QName _GetSerialResponseGetSerialResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetSerialResult");
    private final static QName _SaveGoodsIssueListGoodsIssueList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "goodsIssueList");
    private final static QName _SaveSpecialPriceListResponseSaveSpecialPriceListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveSpecialPriceListResult");
    private final static QName _SaveAlternateItemsResponseSaveAlternateItemsResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveAlternateItemsResult");
    private final static QName _SaveGiftCertificateMasterListGiftCertificateMasterList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "giftCertificateMasterList");
    private final static QName _UpdateGiftCertificateBalanceGiftCertificate_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "giftCertificate");
    private final static QName _StoreExpenseReasonCodeId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ReasonCodeId");
    private final static QName _GetTransactionResponseGetTransactionResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetTransactionResult");
    private final static QName _SaveDumpListReplicationSendDumpList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "ReplicationSendDumpList");
    private final static QName _SaveGiftCertificateMasterResponseSaveGiftCertificateMasterResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveGiftCertificateMasterResult");
    private final static QName _SaveSpecialPriceResponseSaveSpecialPriceResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveSpecialPriceResult");
    private final static QName _RemoveAlternateItemsResponseRemoveAlternateItemsResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "RemoveAlternateItemsResult");
    private final static QName _GoodsIssueDetailGoodsIssueBatchDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsIssueBatchDetailList");
    private final static QName _GoodsIssueDetailGoodsIssueSerialDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsIssueSerialDetailList");
    private final static QName _SaveBarCodeMaskResponseSaveBarCodeMaskResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveBarCodeMaskResult");
    private final static QName _IntegrationQueuePriceUoMMatrix_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PriceUoMMatrix");
    private final static QName _IntegrationQueuePOSNumberSeriesMaster_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "POSNumberSeriesMaster");
    private final static QName _IntegrationQueueStockTransferRequest_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StockTransferRequest");
    private final static QName _SaveProductProduct_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "product");
    private final static QName _SaveGoodsReceiptListGoodsReceiptList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "goodsReceiptList");
    private final static QName _SaveGiftCertificateMasterGiftCertificateMaster_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "giftCertificateMaster");
    private final static QName _GetQueueByWarehouseWithoutStatusUpdateResponseGetQueueByWarehouseWithoutStatusUpdateResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetQueueByWarehouseWithoutStatusUpdateResult");
    private final static QName _GetAccountsReceivableResponseGetAccountsReceivableResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetAccountsReceivableResult");
    private final static QName _ProductMerchandiseHierarchyDetailHierarchyDetailId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "HierarchyDetailId");
    private final static QName _ProductMerchandiseHierarchyDetailHierarchyDetailKey_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "HierarchyDetailKey");
    private final static QName _SaveExchangeRateListResponseSaveExchangeRateListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveExchangeRateListResult");
    private final static QName _PurchaseOrderPurchaseOrderSurcharges_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PurchaseOrderSurcharges");
    private final static QName _PurchaseOrderPurchaseOrderDetails_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PurchaseOrderDetails");
    private final static QName _GetUOMGroupResponseGetUOMGroupResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetUOMGroupResult");
    private final static QName _SaveVendorGroupResponseSaveVendorGroupResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveVendorGroupResult");
    private final static QName _SaveGoodsReceiptPOResponseSaveGoodsReceiptPOResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveGoodsReceiptPOResult");
    private final static QName _PromotionDaysApplicabilityEndTime_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "EndTime");
    private final static QName _PromotionDaysApplicabilityStartTime_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "StartTime");
    private final static QName _SaveStockTransferStockTransfer_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "stockTransfer");
    private final static QName _GetPaymentTypeResponseGetPaymentTypeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetPaymentTypeResult");
    private final static QName _SaveCustomerGroupListCustomerGroupList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "customerGroupList");
    private final static QName _SaveGoodsReceiptPOListResponseSaveGoodsReceiptPOListResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveGoodsReceiptPOListResult");
    private final static QName _InitializeResponseInitializeResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InitializeResult");
    private final static QName _SaveSpecialPriceDiscountGroupResponseSaveSpecialPriceDiscountGroupResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveSpecialPriceDiscountGroupResult");
    private final static QName _GoodsIssueBusinessPartnerCode_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BusinessPartnerCode");
    private final static QName _SaveInventoryItemsResponseSaveInventoryItemsResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveInventoryItemsResult");
    private final static QName _GetStateResponseGetStateResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetStateResult");
    private final static QName _UpdateSynchronizationStatusLastErrorMessage_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "lastErrorMessage");
    private final static QName _CurrencyCultureInfo_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CultureInfo");
    private final static QName _CurrencyDenominationList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "DenominationList");
    private final static QName _SaveExchangeRateResponseSaveExchangeRateResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveExchangeRateResult");
    private final static QName _SaveWarehouseResponseSaveWarehouseResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveWarehouseResult");
    private final static QName _GetAccountsReceivableCustomerId_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "customerId");
    private final static QName _SaveCustomerResponseSaveCustomerResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SaveCustomerResult");
    private final static QName _SaveCurrencyCurrency_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "currency");
    private final static QName _SearchTransactionSearhQuery_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "searhQuery");
    private final static QName _SaveManufacturerManufacturer_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "manufacturer");
    private final static QName _GetLoyaltyLicenceDetailsResponseGetLoyaltyLicenceDetailsResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GetLoyaltyLicenceDetailsResult");
    private final static QName _SaveEmployeeListEmployeeList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "employeeList");
    private final static QName _SearchTransactionResponseSearchTransactionResult_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SearchTransactionResult");
    private final static QName _CustomerSummeryCurrentSlab_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "CurrentSlab");
    private final static QName _CustomerSummeryGroupName_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GroupName");
    private final static QName _SaveVendorVendor_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "vendor");
    private final static QName _SpecialPricingDateSpecialPriceListQuantityWrapper_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SpecialPriceListQuantityWrapper");
    private final static QName _PromotionBonusBuysPromotionExcludedItemDetail_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "PromotionExcludedItemDetail");
    private final static QName _GoodsReceiptPODetailGoodsReceiptPOSerialDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptPOSerialDetailList");
    private final static QName _GoodsReceiptPODetailGoodsReceiptPOBatchDetailList_QNAME = new QName("http://www.iVend.com/IIntegrationService/2010/12", "GoodsReceiptPOBatchDetailList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ivend.iintegrationservice._2010._12
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLoyaltyLicenceDetailsResponse }
     * 
     */
    public GetLoyaltyLicenceDetailsResponse createGetLoyaltyLicenceDetailsResponse() {
        return new GetLoyaltyLicenceDetailsResponse();
    }

    /**
     * Create an instance of {@link GetTransactionDataResponse }
     * 
     */
    public GetTransactionDataResponse createGetTransactionDataResponse() {
        return new GetTransactionDataResponse();
    }

    /**
     * Create an instance of {@link ExecuteQueriesResponse }
     * 
     */
    public ExecuteQueriesResponse createExecuteQueriesResponse() {
        return new ExecuteQueriesResponse();
    }

    /**
     * Create an instance of {@link SearchTransactionResponse }
     * 
     */
    public SearchTransactionResponse createSearchTransactionResponse() {
        return new SearchTransactionResponse();
    }

    /**
     * Create an instance of {@link GetProductUpgradeInformationResponse }
     * 
     */
    public GetProductUpgradeInformationResponse createGetProductUpgradeInformationResponse() {
        return new GetProductUpgradeInformationResponse();
    }

    /**
     * Create an instance of {@link GetQueryResultResponse }
     * 
     */
    public GetQueryResultResponse createGetQueryResultResponse() {
        return new GetQueryResultResponse();
    }

    /**
     * Create an instance of {@link GetPointsDetailsResponse }
     * 
     */
    public GetPointsDetailsResponse createGetPointsDetailsResponse() {
        return new GetPointsDetailsResponse();
    }

    /**
     * Create an instance of {@link XSearchTransactionResponse }
     * 
     */
    public XSearchTransactionResponse createXSearchTransactionResponse() {
        return new XSearchTransactionResponse();
    }

    /**
     * Create an instance of {@link GetUpgradeInformationResponse }
     * 
     */
    public GetUpgradeInformationResponse createGetUpgradeInformationResponse() {
        return new GetUpgradeInformationResponse();
    }

    /**
     * Create an instance of {@link GetMonthlyPointsSummaryResponse }
     * 
     */
    public GetMonthlyPointsSummaryResponse createGetMonthlyPointsSummaryResponse() {
        return new GetMonthlyPointsSummaryResponse();
    }

    /**
     * Create an instance of {@link PostDeliveryItem }
     * 
     */
    public PostDeliveryItem createPostDeliveryItem() {
        return new PostDeliveryItem();
    }

    /**
     * Create an instance of {@link TaxCode }
     * 
     */
    public TaxCode createTaxCode() {
        return new TaxCode();
    }

    /**
     * Create an instance of {@link ArrayOfIntegrationQueue }
     * 
     */
    public ArrayOfIntegrationQueue createArrayOfIntegrationQueue() {
        return new ArrayOfIntegrationQueue();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link DeleteTaxCode }
     * 
     */
    public DeleteTaxCode createDeleteTaxCode() {
        return new DeleteTaxCode();
    }

    /**
     * Create an instance of {@link SecurityUser }
     * 
     */
    public SecurityUser createSecurityUser() {
        return new SecurityUser();
    }

    /**
     * Create an instance of {@link GetCustomerGroupResponse }
     * 
     */
    public GetCustomerGroupResponse createGetCustomerGroupResponse() {
        return new GetCustomerGroupResponse();
    }

    /**
     * Create an instance of {@link CustomerGroup }
     * 
     */
    public CustomerGroup createCustomerGroup() {
        return new CustomerGroup();
    }

    /**
     * Create an instance of {@link GetAttribute }
     * 
     */
    public GetAttribute createGetAttribute() {
        return new GetAttribute();
    }

    /**
     * Create an instance of {@link GoodsReceiptPODetail }
     * 
     */
    public GoodsReceiptPODetail createGoodsReceiptPODetail() {
        return new GoodsReceiptPODetail();
    }

    /**
     * Create an instance of {@link ObjectProperty }
     * 
     */
    public ObjectProperty createObjectProperty() {
        return new ObjectProperty();
    }

    /**
     * Create an instance of {@link SpecialPricingDate }
     * 
     */
    public SpecialPricingDate createSpecialPricingDate() {
        return new SpecialPricingDate();
    }

    /**
     * Create an instance of {@link ArrayOfPostTransactionLineItemAttribute }
     * 
     */
    public ArrayOfPostTransactionLineItemAttribute createArrayOfPostTransactionLineItemAttribute() {
        return new ArrayOfPostTransactionLineItemAttribute();
    }

    /**
     * Create an instance of {@link ProductBOM }
     * 
     */
    public ProductBOM createProductBOM() {
        return new ProductBOM();
    }

    /**
     * Create an instance of {@link SaveManufacturer }
     * 
     */
    public SaveManufacturer createSaveManufacturer() {
        return new SaveManufacturer();
    }

    /**
     * Create an instance of {@link Manufacturer }
     * 
     */
    public Manufacturer createManufacturer() {
        return new Manufacturer();
    }

    /**
     * Create an instance of {@link SaveSurchargeListResponse }
     * 
     */
    public SaveSurchargeListResponse createSaveSurchargeListResponse() {
        return new SaveSurchargeListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSurcharge }
     * 
     */
    public ArrayOfSurcharge createArrayOfSurcharge() {
        return new ArrayOfSurcharge();
    }

    /**
     * Create an instance of {@link SaveProductList }
     * 
     */
    public SaveProductList createSaveProductList() {
        return new SaveProductList();
    }

    /**
     * Create an instance of {@link ArrayOfProduct }
     * 
     */
    public ArrayOfProduct createArrayOfProduct() {
        return new ArrayOfProduct();
    }

    /**
     * Create an instance of {@link GoodsReceiptPO }
     * 
     */
    public GoodsReceiptPO createGoodsReceiptPO() {
        return new GoodsReceiptPO();
    }

    /**
     * Create an instance of {@link ArrayOfCustomTransactionInfoGridDetail }
     * 
     */
    public ArrayOfCustomTransactionInfoGridDetail createArrayOfCustomTransactionInfoGridDetail() {
        return new ArrayOfCustomTransactionInfoGridDetail();
    }

    /**
     * Create an instance of {@link GetTransactionResponse }
     * 
     */
    public GetTransactionResponse createGetTransactionResponse() {
        return new GetTransactionResponse();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link GetLoyaltyLicenceDetailsResponse.GetLoyaltyLicenceDetailsResult }
     * 
     */
    public GetLoyaltyLicenceDetailsResponse.GetLoyaltyLicenceDetailsResult createGetLoyaltyLicenceDetailsResponseGetLoyaltyLicenceDetailsResult() {
        return new GetLoyaltyLicenceDetailsResponse.GetLoyaltyLicenceDetailsResult();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentTypeDiscount }
     * 
     */
    public ArrayOfPaymentTypeDiscount createArrayOfPaymentTypeDiscount() {
        return new ArrayOfPaymentTypeDiscount();
    }

    /**
     * Create an instance of {@link DeleteBarCodeMask }
     * 
     */
    public DeleteBarCodeMask createDeleteBarCodeMask() {
        return new DeleteBarCodeMask();
    }

    /**
     * Create an instance of {@link GetSaleAttribute }
     * 
     */
    public GetSaleAttribute createGetSaleAttribute() {
        return new GetSaleAttribute();
    }

    /**
     * Create an instance of {@link SaveAttributeList }
     * 
     */
    public SaveAttributeList createSaveAttributeList() {
        return new SaveAttributeList();
    }

    /**
     * Create an instance of {@link ArrayOfAttributeMaster }
     * 
     */
    public ArrayOfAttributeMaster createArrayOfAttributeMaster() {
        return new ArrayOfAttributeMaster();
    }

    /**
     * Create an instance of {@link AuthorizePaymentRequest }
     * 
     */
    public AuthorizePaymentRequest createAuthorizePaymentRequest() {
        return new AuthorizePaymentRequest();
    }

    /**
     * Create an instance of {@link GetSurchargeResponse }
     * 
     */
    public GetSurchargeResponse createGetSurchargeResponse() {
        return new GetSurchargeResponse();
    }

    /**
     * Create an instance of {@link Surcharge }
     * 
     */
    public Surcharge createSurcharge() {
        return new Surcharge();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReturnBatchDetail }
     * 
     */
    public ArrayOfGoodsReturnBatchDetail createArrayOfGoodsReturnBatchDetail() {
        return new ArrayOfGoodsReturnBatchDetail();
    }

    /**
     * Create an instance of {@link SaveEmployee }
     * 
     */
    public SaveEmployee createSaveEmployee() {
        return new SaveEmployee();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link DeleteCouponResponse }
     * 
     */
    public DeleteCouponResponse createDeleteCouponResponse() {
        return new DeleteCouponResponse();
    }

    /**
     * Create an instance of {@link DeleteTaxCodeConditionListResponse }
     * 
     */
    public DeleteTaxCodeConditionListResponse createDeleteTaxCodeConditionListResponse() {
        return new DeleteTaxCodeConditionListResponse();
    }

    /**
     * Create an instance of {@link DeleteUOMGroup }
     * 
     */
    public DeleteUOMGroup createDeleteUOMGroup() {
        return new DeleteUOMGroup();
    }

    /**
     * Create an instance of {@link SavePriceListResponse }
     * 
     */
    public SavePriceListResponse createSavePriceListResponse() {
        return new SavePriceListResponse();
    }

    /**
     * Create an instance of {@link PriceList }
     * 
     */
    public PriceList createPriceList() {
        return new PriceList();
    }

    /**
     * Create an instance of {@link SaveSurchargeList }
     * 
     */
    public SaveSurchargeList createSaveSurchargeList() {
        return new SaveSurchargeList();
    }

    /**
     * Create an instance of {@link SaveUOMList }
     * 
     */
    public SaveUOMList createSaveUOMList() {
        return new SaveUOMList();
    }

    /**
     * Create an instance of {@link ArrayOfUOM }
     * 
     */
    public ArrayOfUOM createArrayOfUOM() {
        return new ArrayOfUOM();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link GetAllSaleAttribute }
     * 
     */
    public GetAllSaleAttribute createGetAllSaleAttribute() {
        return new GetAllSaleAttribute();
    }

    /**
     * Create an instance of {@link PurchaseOrder }
     * 
     */
    public PurchaseOrder createPurchaseOrder() {
        return new PurchaseOrder();
    }

    /**
     * Create an instance of {@link GetPointsSummaryByTransactionKeyResponse }
     * 
     */
    public GetPointsSummaryByTransactionKeyResponse createGetPointsSummaryByTransactionKeyResponse() {
        return new GetPointsSummaryByTransactionKeyResponse();
    }

    /**
     * Create an instance of {@link CustomerSummery }
     * 
     */
    public CustomerSummery createCustomerSummery() {
        return new CustomerSummery();
    }

    /**
     * Create an instance of {@link SetFinalInventory }
     * 
     */
    public SetFinalInventory createSetFinalInventory() {
        return new SetFinalInventory();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryUpdate }
     * 
     */
    public ArrayOfInventoryUpdate createArrayOfInventoryUpdate() {
        return new ArrayOfInventoryUpdate();
    }

    /**
     * Create an instance of {@link GoodsReceiptSerialDetail }
     * 
     */
    public GoodsReceiptSerialDetail createGoodsReceiptSerialDetail() {
        return new GoodsReceiptSerialDetail();
    }

    /**
     * Create an instance of {@link GetUOMGroupResponse }
     * 
     */
    public GetUOMGroupResponse createGetUOMGroupResponse() {
        return new GetUOMGroupResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUOMGroup }
     * 
     */
    public ArrayOfUOMGroup createArrayOfUOMGroup() {
        return new ArrayOfUOMGroup();
    }

    /**
     * Create an instance of {@link SaveManufacturerListResponse }
     * 
     */
    public SaveManufacturerListResponse createSaveManufacturerListResponse() {
        return new SaveManufacturerListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfManufacturer }
     * 
     */
    public ArrayOfManufacturer createArrayOfManufacturer() {
        return new ArrayOfManufacturer();
    }

    /**
     * Create an instance of {@link DeletePriceList }
     * 
     */
    public DeletePriceList createDeletePriceList() {
        return new DeletePriceList();
    }

    /**
     * Create an instance of {@link AlternateItem }
     * 
     */
    public AlternateItem createAlternateItem() {
        return new AlternateItem();
    }

    /**
     * Create an instance of {@link ArrayOfBatch }
     * 
     */
    public ArrayOfBatch createArrayOfBatch() {
        return new ArrayOfBatch();
    }

    /**
     * Create an instance of {@link SavePromotionalBonusBuysList }
     * 
     */
    public SavePromotionalBonusBuysList createSavePromotionalBonusBuysList() {
        return new SavePromotionalBonusBuysList();
    }

    /**
     * Create an instance of {@link ArrayOfPromotionBonusBuys }
     * 
     */
    public ArrayOfPromotionBonusBuys createArrayOfPromotionBonusBuys() {
        return new ArrayOfPromotionBonusBuys();
    }

    /**
     * Create an instance of {@link SaveCustomerResponse }
     * 
     */
    public SaveCustomerResponse createSaveCustomerResponse() {
        return new SaveCustomerResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link SaveGoodsReturnListResponse }
     * 
     */
    public SaveGoodsReturnListResponse createSaveGoodsReturnListResponse() {
        return new SaveGoodsReturnListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReturn }
     * 
     */
    public ArrayOfGoodsReturn createArrayOfGoodsReturn() {
        return new ArrayOfGoodsReturn();
    }

    /**
     * Create an instance of {@link ArrayOfPromotionExcludedItem }
     * 
     */
    public ArrayOfPromotionExcludedItem createArrayOfPromotionExcludedItem() {
        return new ArrayOfPromotionExcludedItem();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ArrayOfTaxPeriodDefination }
     * 
     */
    public ArrayOfTaxPeriodDefination createArrayOfTaxPeriodDefination() {
        return new ArrayOfTaxPeriodDefination();
    }

    /**
     * Create an instance of {@link ArrayOfPriceUOMMatrix }
     * 
     */
    public ArrayOfPriceUOMMatrix createArrayOfPriceUOMMatrix() {
        return new ArrayOfPriceUOMMatrix();
    }

    /**
     * Create an instance of {@link SaveGoodsReceiptPOResponse }
     * 
     */
    public SaveGoodsReceiptPOResponse createSaveGoodsReceiptPOResponse() {
        return new SaveGoodsReceiptPOResponse();
    }

    /**
     * Create an instance of {@link SaveProductCostResponse }
     * 
     */
    public SaveProductCostResponse createSaveProductCostResponse() {
        return new SaveProductCostResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductCost }
     * 
     */
    public ArrayOfProductCost createArrayOfProductCost() {
        return new ArrayOfProductCost();
    }

    /**
     * Create an instance of {@link ArrayOfObjectProperty }
     * 
     */
    public ArrayOfObjectProperty createArrayOfObjectProperty() {
        return new ArrayOfObjectProperty();
    }

    /**
     * Create an instance of {@link SetAssemblyComponents }
     * 
     */
    public SetAssemblyComponents createSetAssemblyComponents() {
        return new SetAssemblyComponents();
    }

    /**
     * Create an instance of {@link ArrayOfProductBOM }
     * 
     */
    public ArrayOfProductBOM createArrayOfProductBOM() {
        return new ArrayOfProductBOM();
    }

    /**
     * Create an instance of {@link GetTransaction }
     * 
     */
    public GetTransaction createGetTransaction() {
        return new GetTransaction();
    }

    /**
     * Create an instance of {@link ArrayOfStockTransferBatchDetail }
     * 
     */
    public ArrayOfStockTransferBatchDetail createArrayOfStockTransferBatchDetail() {
        return new ArrayOfStockTransferBatchDetail();
    }

    /**
     * Create an instance of {@link ArrayOfStockTransferRequisitionDetail }
     * 
     */
    public ArrayOfStockTransferRequisitionDetail createArrayOfStockTransferRequisitionDetail() {
        return new ArrayOfStockTransferRequisitionDetail();
    }

    /**
     * Create an instance of {@link PostDelivery }
     * 
     */
    public PostDelivery createPostDelivery() {
        return new PostDelivery();
    }

    /**
     * Create an instance of {@link SaveGoodsReceiptListResponse }
     * 
     */
    public SaveGoodsReceiptListResponse createSaveGoodsReceiptListResponse() {
        return new SaveGoodsReceiptListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReceipt }
     * 
     */
    public ArrayOfGoodsReceipt createArrayOfGoodsReceipt() {
        return new ArrayOfGoodsReceipt();
    }

    /**
     * Create an instance of {@link CustomTransactionInfoGridDetail }
     * 
     */
    public CustomTransactionInfoGridDetail createCustomTransactionInfoGridDetail() {
        return new CustomTransactionInfoGridDetail();
    }

    /**
     * Create an instance of {@link SaveManufacturerList }
     * 
     */
    public SaveManufacturerList createSaveManufacturerList() {
        return new SaveManufacturerList();
    }

    /**
     * Create an instance of {@link SaveExchangeRate }
     * 
     */
    public SaveExchangeRate createSaveExchangeRate() {
        return new SaveExchangeRate();
    }

    /**
     * Create an instance of {@link ExchangeRate }
     * 
     */
    public ExchangeRate createExchangeRate() {
        return new ExchangeRate();
    }

    /**
     * Create an instance of {@link GetProductImage }
     * 
     */
    public GetProductImage createGetProductImage() {
        return new GetProductImage();
    }

    /**
     * Create an instance of {@link SaveGoodsReceiptResponse }
     * 
     */
    public SaveGoodsReceiptResponse createSaveGoodsReceiptResponse() {
        return new SaveGoodsReceiptResponse();
    }

    /**
     * Create an instance of {@link GoodsReceipt }
     * 
     */
    public GoodsReceipt createGoodsReceipt() {
        return new GoodsReceipt();
    }

    /**
     * Create an instance of {@link GetQueueResponse }
     * 
     */
    public GetQueueResponse createGetQueueResponse() {
        return new GetQueueResponse();
    }

    /**
     * Create an instance of {@link GetTaxCode }
     * 
     */
    public GetTaxCode createGetTaxCode() {
        return new GetTaxCode();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReceiptPOBatchDetail }
     * 
     */
    public ArrayOfGoodsReceiptPOBatchDetail createArrayOfGoodsReceiptPOBatchDetail() {
        return new ArrayOfGoodsReceiptPOBatchDetail();
    }

    /**
     * Create an instance of {@link ArrayOfPriceMatrix }
     * 
     */
    public ArrayOfPriceMatrix createArrayOfPriceMatrix() {
        return new ArrayOfPriceMatrix();
    }

    /**
     * Create an instance of {@link ArrayOfAttributes }
     * 
     */
    public ArrayOfAttributes createArrayOfAttributes() {
        return new ArrayOfAttributes();
    }

    /**
     * Create an instance of {@link ArrayOfShippingType }
     * 
     */
    public ArrayOfShippingType createArrayOfShippingType() {
        return new ArrayOfShippingType();
    }

    /**
     * Create an instance of {@link SaveGiftCertificateMasterListResponse }
     * 
     */
    public SaveGiftCertificateMasterListResponse createSaveGiftCertificateMasterListResponse() {
        return new SaveGiftCertificateMasterListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGiftCertificateMaster }
     * 
     */
    public ArrayOfGiftCertificateMaster createArrayOfGiftCertificateMaster() {
        return new ArrayOfGiftCertificateMaster();
    }

    /**
     * Create an instance of {@link PostTransactionSaleAttribute }
     * 
     */
    public PostTransactionSaleAttribute createPostTransactionSaleAttribute() {
        return new PostTransactionSaleAttribute();
    }

    /**
     * Create an instance of {@link GetPriceList }
     * 
     */
    public GetPriceList createGetPriceList() {
        return new GetPriceList();
    }

    /**
     * Create an instance of {@link ArrayOfEmployee }
     * 
     */
    public ArrayOfEmployee createArrayOfEmployee() {
        return new ArrayOfEmployee();
    }

    /**
     * Create an instance of {@link DeleteProductGroupResponse }
     * 
     */
    public DeleteProductGroupResponse createDeleteProductGroupResponse() {
        return new DeleteProductGroupResponse();
    }

    /**
     * Create an instance of {@link SaveProductGroupList }
     * 
     */
    public SaveProductGroupList createSaveProductGroupList() {
        return new SaveProductGroupList();
    }

    /**
     * Create an instance of {@link ArrayOfProductGroup }
     * 
     */
    public ArrayOfProductGroup createArrayOfProductGroup() {
        return new ArrayOfProductGroup();
    }

    /**
     * Create an instance of {@link DeleteExchangeRateByCurrencyAndDate }
     * 
     */
    public DeleteExchangeRateByCurrencyAndDate createDeleteExchangeRateByCurrencyAndDate() {
        return new DeleteExchangeRateByCurrencyAndDate();
    }

    /**
     * Create an instance of {@link PostFulfillmentResponse }
     * 
     */
    public PostFulfillmentResponse createPostFulfillmentResponse() {
        return new PostFulfillmentResponse();
    }

    /**
     * Create an instance of {@link CustomerCatalog }
     * 
     */
    public CustomerCatalog createCustomerCatalog() {
        return new CustomerCatalog();
    }

    /**
     * Create an instance of {@link DeleteTaxCodeResponse }
     * 
     */
    public DeleteTaxCodeResponse createDeleteTaxCodeResponse() {
        return new DeleteTaxCodeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAttributeValidValue }
     * 
     */
    public ArrayOfAttributeValidValue createArrayOfAttributeValidValue() {
        return new ArrayOfAttributeValidValue();
    }

    /**
     * Create an instance of {@link SaveProductGroupDiscountListResponse }
     * 
     */
    public SaveProductGroupDiscountListResponse createSaveProductGroupDiscountListResponse() {
        return new SaveProductGroupDiscountListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductGroupDiscount }
     * 
     */
    public ArrayOfProductGroupDiscount createArrayOfProductGroupDiscount() {
        return new ArrayOfProductGroupDiscount();
    }

    /**
     * Create an instance of {@link GetBatchResponse }
     * 
     */
    public GetBatchResponse createGetBatchResponse() {
        return new GetBatchResponse();
    }

    /**
     * Create an instance of {@link Batch }
     * 
     */
    public Batch createBatch() {
        return new Batch();
    }

    /**
     * Create an instance of {@link SaveUpsellItemsResponse }
     * 
     */
    public SaveUpsellItemsResponse createSaveUpsellItemsResponse() {
        return new SaveUpsellItemsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductUpsell }
     * 
     */
    public ArrayOfProductUpsell createArrayOfProductUpsell() {
        return new ArrayOfProductUpsell();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsIssue }
     * 
     */
    public ArrayOfGoodsIssue createArrayOfGoodsIssue() {
        return new ArrayOfGoodsIssue();
    }

    /**
     * Create an instance of {@link SaveReplicationSendDumpList }
     * 
     */
    public SaveReplicationSendDumpList createSaveReplicationSendDumpList() {
        return new SaveReplicationSendDumpList();
    }

    /**
     * Create an instance of {@link ArrayOfReplicationSendDump }
     * 
     */
    public ArrayOfReplicationSendDump createArrayOfReplicationSendDump() {
        return new ArrayOfReplicationSendDump();
    }

    /**
     * Create an instance of {@link PromotionBonusBuys }
     * 
     */
    public PromotionBonusBuys createPromotionBonusBuys() {
        return new PromotionBonusBuys();
    }

    /**
     * Create an instance of {@link PostTransaction }
     * 
     */
    public PostTransaction createPostTransaction() {
        return new PostTransaction();
    }

    /**
     * Create an instance of {@link StockTransfer }
     * 
     */
    public StockTransfer createStockTransfer() {
        return new StockTransfer();
    }

    /**
     * Create an instance of {@link SaveTaxCode }
     * 
     */
    public SaveTaxCode createSaveTaxCode() {
        return new SaveTaxCode();
    }

    /**
     * Create an instance of {@link SaveInventoryUpdatesResponse }
     * 
     */
    public SaveInventoryUpdatesResponse createSaveInventoryUpdatesResponse() {
        return new SaveInventoryUpdatesResponse();
    }

    /**
     * Create an instance of {@link RemoveUpsellItemsResponse }
     * 
     */
    public RemoveUpsellItemsResponse createRemoveUpsellItemsResponse() {
        return new RemoveUpsellItemsResponse();
    }

    /**
     * Create an instance of {@link SaveEmployeeList }
     * 
     */
    public SaveEmployeeList createSaveEmployeeList() {
        return new SaveEmployeeList();
    }

    /**
     * Create an instance of {@link GetPrePrintedLoyaltyCardsBySiteIdResponse }
     * 
     */
    public GetPrePrintedLoyaltyCardsBySiteIdResponse createGetPrePrintedLoyaltyCardsBySiteIdResponse() {
        return new GetPrePrintedLoyaltyCardsBySiteIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLoyaltyPrePrintedCards }
     * 
     */
    public ArrayOfLoyaltyPrePrintedCards createArrayOfLoyaltyPrePrintedCards() {
        return new ArrayOfLoyaltyPrePrintedCards();
    }

    /**
     * Create an instance of {@link GetQueueOfEnterpriseWithoutStatusUpdate }
     * 
     */
    public GetQueueOfEnterpriseWithoutStatusUpdate createGetQueueOfEnterpriseWithoutStatusUpdate() {
        return new GetQueueOfEnterpriseWithoutStatusUpdate();
    }

    /**
     * Create an instance of {@link LoyaltyCardInformation }
     * 
     */
    public LoyaltyCardInformation createLoyaltyCardInformation() {
        return new LoyaltyCardInformation();
    }

    /**
     * Create an instance of {@link DeleteCustomerGroupResponse }
     * 
     */
    public DeleteCustomerGroupResponse createDeleteCustomerGroupResponse() {
        return new DeleteCustomerGroupResponse();
    }

    /**
     * Create an instance of {@link SaveUpsellItems }
     * 
     */
    public SaveUpsellItems createSaveUpsellItems() {
        return new SaveUpsellItems();
    }

    /**
     * Create an instance of {@link GetStore }
     * 
     */
    public GetStore createGetStore() {
        return new GetStore();
    }

    /**
     * Create an instance of {@link XRegisterLoyaltyCustomerResponse }
     * 
     */
    public XRegisterLoyaltyCustomerResponse createXRegisterLoyaltyCustomerResponse() {
        return new XRegisterLoyaltyCustomerResponse();
    }

    /**
     * Create an instance of {@link UserDefinedFieldsValidValue }
     * 
     */
    public UserDefinedFieldsValidValue createUserDefinedFieldsValidValue() {
        return new UserDefinedFieldsValidValue();
    }

    /**
     * Create an instance of {@link TransactionServerParameters }
     * 
     */
    public TransactionServerParameters createTransactionServerParameters() {
        return new TransactionServerParameters();
    }

    /**
     * Create an instance of {@link SaveBatch }
     * 
     */
    public SaveBatch createSaveBatch() {
        return new SaveBatch();
    }

    /**
     * Create an instance of {@link SaveStoreResponse }
     * 
     */
    public SaveStoreResponse createSaveStoreResponse() {
        return new SaveStoreResponse();
    }

    /**
     * Create an instance of {@link Store }
     * 
     */
    public Store createStore() {
        return new Store();
    }

    /**
     * Create an instance of {@link GetQueueWithoutStatusUpdate }
     * 
     */
    public GetQueueWithoutStatusUpdate createGetQueueWithoutStatusUpdate() {
        return new GetQueueWithoutStatusUpdate();
    }

    /**
     * Create an instance of {@link SaveGiftCertificateMasterResponse }
     * 
     */
    public SaveGiftCertificateMasterResponse createSaveGiftCertificateMasterResponse() {
        return new SaveGiftCertificateMasterResponse();
    }

    /**
     * Create an instance of {@link GiftCertificateMaster }
     * 
     */
    public GiftCertificateMaster createGiftCertificateMaster() {
        return new GiftCertificateMaster();
    }

    /**
     * Create an instance of {@link XGetTransaction }
     * 
     */
    public XGetTransaction createXGetTransaction() {
        return new XGetTransaction();
    }

    /**
     * Create an instance of {@link SaveTransactionSignature }
     * 
     */
    public SaveTransactionSignature createSaveTransactionSignature() {
        return new SaveTransactionSignature();
    }

    /**
     * Create an instance of {@link ArrayOfARPaymentItem }
     * 
     */
    public ArrayOfARPaymentItem createArrayOfARPaymentItem() {
        return new ArrayOfARPaymentItem();
    }

    /**
     * Create an instance of {@link Initialize }
     * 
     */
    public Initialize createInitialize() {
        return new Initialize();
    }

    /**
     * Create an instance of {@link DiscountGroup }
     * 
     */
    public DiscountGroup createDiscountGroup() {
        return new DiscountGroup();
    }

    /**
     * Create an instance of {@link GetProductUpgradeInformation }
     * 
     */
    public GetProductUpgradeInformation createGetProductUpgradeInformation() {
        return new GetProductUpgradeInformation();
    }

    /**
     * Create an instance of {@link SaveProductSurchargesResponse }
     * 
     */
    public SaveProductSurchargesResponse createSaveProductSurchargesResponse() {
        return new SaveProductSurchargesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductSurcharge }
     * 
     */
    public ArrayOfProductSurcharge createArrayOfProductSurcharge() {
        return new ArrayOfProductSurcharge();
    }

    /**
     * Create an instance of {@link GoodsReceiptDetail }
     * 
     */
    public GoodsReceiptDetail createGoodsReceiptDetail() {
        return new GoodsReceiptDetail();
    }

    /**
     * Create an instance of {@link ValidateLicenseForIntegrationResponse }
     * 
     */
    public ValidateLicenseForIntegrationResponse createValidateLicenseForIntegrationResponse() {
        return new ValidateLicenseForIntegrationResponse();
    }

    /**
     * Create an instance of {@link XDeleteSuspendedTransaction }
     * 
     */
    public XDeleteSuspendedTransaction createXDeleteSuspendedTransaction() {
        return new XDeleteSuspendedTransaction();
    }

    /**
     * Create an instance of {@link GetQueryResult }
     * 
     */
    public GetQueryResult createGetQueryResult() {
        return new GetQueryResult();
    }

    /**
     * Create an instance of {@link ShippingType }
     * 
     */
    public ShippingType createShippingType() {
        return new ShippingType();
    }

    /**
     * Create an instance of {@link GetVendorGroupResponse }
     * 
     */
    public GetVendorGroupResponse createGetVendorGroupResponse() {
        return new GetVendorGroupResponse();
    }

    /**
     * Create an instance of {@link VendorGroup }
     * 
     */
    public VendorGroup createVendorGroup() {
        return new VendorGroup();
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link TransactionPayment }
     * 
     */
    public TransactionPayment createTransactionPayment() {
        return new TransactionPayment();
    }

    /**
     * Create an instance of {@link ArrayOfPostTransactionSaleAttribute }
     * 
     */
    public ArrayOfPostTransactionSaleAttribute createArrayOfPostTransactionSaleAttribute() {
        return new ArrayOfPostTransactionSaleAttribute();
    }

    /**
     * Create an instance of {@link SetAssemblyComponentsResponse }
     * 
     */
    public SetAssemblyComponentsResponse createSetAssemblyComponentsResponse() {
        return new SetAssemblyComponentsResponse();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link UpdateRecordsStatusResponse }
     * 
     */
    public UpdateRecordsStatusResponse createUpdateRecordsStatusResponse() {
        return new UpdateRecordsStatusResponse();
    }

    /**
     * Create an instance of {@link ProductGroupDiscount }
     * 
     */
    public ProductGroupDiscount createProductGroupDiscount() {
        return new ProductGroupDiscount();
    }

    /**
     * Create an instance of {@link GetQueueByWarehouseWithoutStatusUpdateResponse }
     * 
     */
    public GetQueueByWarehouseWithoutStatusUpdateResponse createGetQueueByWarehouseWithoutStatusUpdateResponse() {
        return new GetQueueByWarehouseWithoutStatusUpdateResponse();
    }

    /**
     * Create an instance of {@link RegisterLoyaltyCustomerResponse }
     * 
     */
    public RegisterLoyaltyCustomerResponse createRegisterLoyaltyCustomerResponse() {
        return new RegisterLoyaltyCustomerResponse();
    }

    /**
     * Create an instance of {@link SetKitComponentsResponse }
     * 
     */
    public SetKitComponentsResponse createSetKitComponentsResponse() {
        return new SetKitComponentsResponse();
    }

    /**
     * Create an instance of {@link SaveAlternateUPCResponse }
     * 
     */
    public SaveAlternateUPCResponse createSaveAlternateUPCResponse() {
        return new SaveAlternateUPCResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUPCTranslation }
     * 
     */
    public ArrayOfUPCTranslation createArrayOfUPCTranslation() {
        return new ArrayOfUPCTranslation();
    }

    /**
     * Create an instance of {@link SaveExchangeRateResponse }
     * 
     */
    public SaveExchangeRateResponse createSaveExchangeRateResponse() {
        return new SaveExchangeRateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStore }
     * 
     */
    public ArrayOfStore createArrayOfStore() {
        return new ArrayOfStore();
    }

    /**
     * Create an instance of {@link GetQueueByWarehouseWithoutStatusUpdate }
     * 
     */
    public GetQueueByWarehouseWithoutStatusUpdate createGetQueueByWarehouseWithoutStatusUpdate() {
        return new GetQueueByWarehouseWithoutStatusUpdate();
    }

    /**
     * Create an instance of {@link DeleteCustomerGroup }
     * 
     */
    public DeleteCustomerGroup createDeleteCustomerGroup() {
        return new DeleteCustomerGroup();
    }

    /**
     * Create an instance of {@link DeleteSerial }
     * 
     */
    public DeleteSerial createDeleteSerial() {
        return new DeleteSerial();
    }

    /**
     * Create an instance of {@link ArrayOfTaxCodeCondition }
     * 
     */
    public ArrayOfTaxCodeCondition createArrayOfTaxCodeCondition() {
        return new ArrayOfTaxCodeCondition();
    }

    /**
     * Create an instance of {@link LayawayPlanSurcharge }
     * 
     */
    public LayawayPlanSurcharge createLayawayPlanSurcharge() {
        return new LayawayPlanSurcharge();
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link GetQueueByWarehouse }
     * 
     */
    public GetQueueByWarehouse createGetQueueByWarehouse() {
        return new GetQueueByWarehouse();
    }

    /**
     * Create an instance of {@link SaveUOMGroupResponse }
     * 
     */
    public SaveUOMGroupResponse createSaveUOMGroupResponse() {
        return new SaveUOMGroupResponse();
    }

    /**
     * Create an instance of {@link UOMGroup }
     * 
     */
    public UOMGroup createUOMGroup() {
        return new UOMGroup();
    }

    /**
     * Create an instance of {@link GetPaymentTypeResponse }
     * 
     */
    public GetPaymentTypeResponse createGetPaymentTypeResponse() {
        return new GetPaymentTypeResponse();
    }

    /**
     * Create an instance of {@link XUpdateLoyaltyCustomer }
     * 
     */
    public XUpdateLoyaltyCustomer createXUpdateLoyaltyCustomer() {
        return new XUpdateLoyaltyCustomer();
    }

    /**
     * Create an instance of {@link GetTransactionDataResponse.GetTransactionDataResult }
     * 
     */
    public GetTransactionDataResponse.GetTransactionDataResult createGetTransactionDataResponseGetTransactionDataResult() {
        return new GetTransactionDataResponse.GetTransactionDataResult();
    }

    /**
     * Create an instance of {@link UpdateSynchronizationStatus }
     * 
     */
    public UpdateSynchronizationStatus createUpdateSynchronizationStatus() {
        return new UpdateSynchronizationStatus();
    }

    /**
     * Create an instance of {@link GetQueueOfEnterpriseWithoutStatusUpdateResponse }
     * 
     */
    public GetQueueOfEnterpriseWithoutStatusUpdateResponse createGetQueueOfEnterpriseWithoutStatusUpdateResponse() {
        return new GetQueueOfEnterpriseWithoutStatusUpdateResponse();
    }

    /**
     * Create an instance of {@link DeleteProductGroup }
     * 
     */
    public DeleteProductGroup createDeleteProductGroup() {
        return new DeleteProductGroup();
    }

    /**
     * Create an instance of {@link SaveShippingTypeList }
     * 
     */
    public SaveShippingTypeList createSaveShippingTypeList() {
        return new SaveShippingTypeList();
    }

    /**
     * Create an instance of {@link SavePaymentTypeListResponse }
     * 
     */
    public SavePaymentTypeListResponse createSavePaymentTypeListResponse() {
        return new SavePaymentTypeListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentType }
     * 
     */
    public ArrayOfPaymentType createArrayOfPaymentType() {
        return new ArrayOfPaymentType();
    }

    /**
     * Create an instance of {@link InventoryUpdateBatch }
     * 
     */
    public InventoryUpdateBatch createInventoryUpdateBatch() {
        return new InventoryUpdateBatch();
    }

    /**
     * Create an instance of {@link PaymentTypeDiscount }
     * 
     */
    public PaymentTypeDiscount createPaymentTypeDiscount() {
        return new PaymentTypeDiscount();
    }

    /**
     * Create an instance of {@link ArrayOfCountry }
     * 
     */
    public ArrayOfCountry createArrayOfCountry() {
        return new ArrayOfCountry();
    }

    /**
     * Create an instance of {@link SaveExchangeRateListResponse }
     * 
     */
    public SaveExchangeRateListResponse createSaveExchangeRateListResponse() {
        return new SaveExchangeRateListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfExchangeRate }
     * 
     */
    public ArrayOfExchangeRate createArrayOfExchangeRate() {
        return new ArrayOfExchangeRate();
    }

    /**
     * Create an instance of {@link GetVersionInformationResponse }
     * 
     */
    public GetVersionInformationResponse createGetVersionInformationResponse() {
        return new GetVersionInformationResponse();
    }

    /**
     * Create an instance of {@link DeleteVendorResponse }
     * 
     */
    public DeleteVendorResponse createDeleteVendorResponse() {
        return new DeleteVendorResponse();
    }

    /**
     * Create an instance of {@link SaveGoodsReturn }
     * 
     */
    public SaveGoodsReturn createSaveGoodsReturn() {
        return new SaveGoodsReturn();
    }

    /**
     * Create an instance of {@link GoodsReturn }
     * 
     */
    public GoodsReturn createGoodsReturn() {
        return new GoodsReturn();
    }

    /**
     * Create an instance of {@link SavePromotionalBonusBuysResponse }
     * 
     */
    public SavePromotionalBonusBuysResponse createSavePromotionalBonusBuysResponse() {
        return new SavePromotionalBonusBuysResponse();
    }

    /**
     * Create an instance of {@link XGetGiftCertificateBalanceResponse }
     * 
     */
    public XGetGiftCertificateBalanceResponse createXGetGiftCertificateBalanceResponse() {
        return new XGetGiftCertificateBalanceResponse();
    }

    /**
     * Create an instance of {@link GetAllLineAttributeResponse }
     * 
     */
    public GetAllLineAttributeResponse createGetAllLineAttributeResponse() {
        return new GetAllLineAttributeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLineAttribute }
     * 
     */
    public ArrayOfLineAttribute createArrayOfLineAttribute() {
        return new ArrayOfLineAttribute();
    }

    /**
     * Create an instance of {@link RemoveAlternateItems }
     * 
     */
    public RemoveAlternateItems createRemoveAlternateItems() {
        return new RemoveAlternateItems();
    }

    /**
     * Create an instance of {@link ArrayOfAlternateItem }
     * 
     */
    public ArrayOfAlternateItem createArrayOfAlternateItem() {
        return new ArrayOfAlternateItem();
    }

    /**
     * Create an instance of {@link SaveSpecialPriceDiscountGroup }
     * 
     */
    public SaveSpecialPriceDiscountGroup createSaveSpecialPriceDiscountGroup() {
        return new SaveSpecialPriceDiscountGroup();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialPriceDiscountGroup }
     * 
     */
    public ArrayOfSpecialPriceDiscountGroup createArrayOfSpecialPriceDiscountGroup() {
        return new ArrayOfSpecialPriceDiscountGroup();
    }

    /**
     * Create an instance of {@link SaveInventoryItemsResponse }
     * 
     */
    public SaveInventoryItemsResponse createSaveInventoryItemsResponse() {
        return new SaveInventoryItemsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryItem }
     * 
     */
    public ArrayOfInventoryItem createArrayOfInventoryItem() {
        return new ArrayOfInventoryItem();
    }

    /**
     * Create an instance of {@link GetNextNumber }
     * 
     */
    public GetNextNumber createGetNextNumber() {
        return new GetNextNumber();
    }

    /**
     * Create an instance of {@link SaveInventoryItems }
     * 
     */
    public SaveInventoryItems createSaveInventoryItems() {
        return new SaveInventoryItems();
    }

    /**
     * Create an instance of {@link ArrayOfCustomerGroup }
     * 
     */
    public ArrayOfCustomerGroup createArrayOfCustomerGroup() {
        return new ArrayOfCustomerGroup();
    }

    /**
     * Create an instance of {@link XSaveTransaction }
     * 
     */
    public XSaveTransaction createXSaveTransaction() {
        return new XSaveTransaction();
    }

    /**
     * Create an instance of {@link GetCountry }
     * 
     */
    public GetCountry createGetCountry() {
        return new GetCountry();
    }

    /**
     * Create an instance of {@link ArrayOfDeliveryPackage }
     * 
     */
    public ArrayOfDeliveryPackage createArrayOfDeliveryPackage() {
        return new ArrayOfDeliveryPackage();
    }

    /**
     * Create an instance of {@link SaveManufacturerDiscountList }
     * 
     */
    public SaveManufacturerDiscountList createSaveManufacturerDiscountList() {
        return new SaveManufacturerDiscountList();
    }

    /**
     * Create an instance of {@link ArrayOfManufacturerGroupDiscount }
     * 
     */
    public ArrayOfManufacturerGroupDiscount createArrayOfManufacturerGroupDiscount() {
        return new ArrayOfManufacturerGroupDiscount();
    }

    /**
     * Create an instance of {@link DeleteExchangeRateByDate }
     * 
     */
    public DeleteExchangeRateByDate createDeleteExchangeRateByDate() {
        return new DeleteExchangeRateByDate();
    }

    /**
     * Create an instance of {@link Enterprise }
     * 
     */
    public Enterprise createEnterprise() {
        return new Enterprise();
    }

    /**
     * Create an instance of {@link DeletePaymentTypeResponse }
     * 
     */
    public DeletePaymentTypeResponse createDeletePaymentTypeResponse() {
        return new DeletePaymentTypeResponse();
    }

    /**
     * Create an instance of {@link GetQueueOfEnterpriseResponse }
     * 
     */
    public GetQueueOfEnterpriseResponse createGetQueueOfEnterpriseResponse() {
        return new GetQueueOfEnterpriseResponse();
    }

    /**
     * Create an instance of {@link PaymentTypeSurcharge }
     * 
     */
    public PaymentTypeSurcharge createPaymentTypeSurcharge() {
        return new PaymentTypeSurcharge();
    }

    /**
     * Create an instance of {@link SaveProductCost }
     * 
     */
    public SaveProductCost createSaveProductCost() {
        return new SaveProductCost();
    }

    /**
     * Create an instance of {@link DeleteStateResponse }
     * 
     */
    public DeleteStateResponse createDeleteStateResponse() {
        return new DeleteStateResponse();
    }

    /**
     * Create an instance of {@link DeleteVendorGroupResponse }
     * 
     */
    public DeleteVendorGroupResponse createDeleteVendorGroupResponse() {
        return new DeleteVendorGroupResponse();
    }

    /**
     * Create an instance of {@link BarCodeMask }
     * 
     */
    public BarCodeMask createBarCodeMask() {
        return new BarCodeMask();
    }

    /**
     * Create an instance of {@link GetShippingTypeResponse }
     * 
     */
    public GetShippingTypeResponse createGetShippingTypeResponse() {
        return new GetShippingTypeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfVendor }
     * 
     */
    public ArrayOfVendor createArrayOfVendor() {
        return new ArrayOfVendor();
    }

    /**
     * Create an instance of {@link DeletePromotionalBonusBuysResponse }
     * 
     */
    public DeletePromotionalBonusBuysResponse createDeletePromotionalBonusBuysResponse() {
        return new DeletePromotionalBonusBuysResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBarCodeMaskDetail }
     * 
     */
    public ArrayOfBarCodeMaskDetail createArrayOfBarCodeMaskDetail() {
        return new ArrayOfBarCodeMaskDetail();
    }

    /**
     * Create an instance of {@link GetLineAttributeResponse }
     * 
     */
    public GetLineAttributeResponse createGetLineAttributeResponse() {
        return new GetLineAttributeResponse();
    }

    /**
     * Create an instance of {@link LineAttribute }
     * 
     */
    public LineAttribute createLineAttribute() {
        return new LineAttribute();
    }

    /**
     * Create an instance of {@link InventoryCount }
     * 
     */
    public InventoryCount createInventoryCount() {
        return new InventoryCount();
    }

    /**
     * Create an instance of {@link ArrayOfSerial }
     * 
     */
    public ArrayOfSerial createArrayOfSerial() {
        return new ArrayOfSerial();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link GetPrePrintedLoyaltyCardsBySiteId }
     * 
     */
    public GetPrePrintedLoyaltyCardsBySiteId createGetPrePrintedLoyaltyCardsBySiteId() {
        return new GetPrePrintedLoyaltyCardsBySiteId();
    }

    /**
     * Create an instance of {@link SaveExchangeRateList }
     * 
     */
    public SaveExchangeRateList createSaveExchangeRateList() {
        return new SaveExchangeRateList();
    }

    /**
     * Create an instance of {@link NumberSeriesMaster }
     * 
     */
    public NumberSeriesMaster createNumberSeriesMaster() {
        return new NumberSeriesMaster();
    }

    /**
     * Create an instance of {@link SaveCustomerGroup }
     * 
     */
    public SaveCustomerGroup createSaveCustomerGroup() {
        return new SaveCustomerGroup();
    }

    /**
     * Create an instance of {@link SaveCustomerGroupListResponse }
     * 
     */
    public SaveCustomerGroupListResponse createSaveCustomerGroupListResponse() {
        return new SaveCustomerGroupListResponse();
    }

    /**
     * Create an instance of {@link GetRedeemableAmount }
     * 
     */
    public GetRedeemableAmount createGetRedeemableAmount() {
        return new GetRedeemableAmount();
    }

    /**
     * Create an instance of {@link DeleteCountry }
     * 
     */
    public DeleteCountry createDeleteCountry() {
        return new DeleteCountry();
    }

    /**
     * Create an instance of {@link AuthorizePayment }
     * 
     */
    public AuthorizePayment createAuthorizePayment() {
        return new AuthorizePayment();
    }

    /**
     * Create an instance of {@link GetDeliveryPackageById }
     * 
     */
    public GetDeliveryPackageById createGetDeliveryPackageById() {
        return new GetDeliveryPackageById();
    }

    /**
     * Create an instance of {@link SaveAlternateUPC }
     * 
     */
    public SaveAlternateUPC createSaveAlternateUPC() {
        return new SaveAlternateUPC();
    }

    /**
     * Create an instance of {@link DeleteBatchResponse }
     * 
     */
    public DeleteBatchResponse createDeleteBatchResponse() {
        return new DeleteBatchResponse();
    }

    /**
     * Create an instance of {@link ExecuteQueriesResponse.ExecuteQueriesResult }
     * 
     */
    public ExecuteQueriesResponse.ExecuteQueriesResult createExecuteQueriesResponseExecuteQueriesResult() {
        return new ExecuteQueriesResponse.ExecuteQueriesResult();
    }

    /**
     * Create an instance of {@link GetAttributeResponse }
     * 
     */
    public GetAttributeResponse createGetAttributeResponse() {
        return new GetAttributeResponse();
    }

    /**
     * Create an instance of {@link AttributeMaster }
     * 
     */
    public AttributeMaster createAttributeMaster() {
        return new AttributeMaster();
    }

    /**
     * Create an instance of {@link SaveState }
     * 
     */
    public SaveState createSaveState() {
        return new SaveState();
    }

    /**
     * Create an instance of {@link State }
     * 
     */
    public State createState() {
        return new State();
    }

    /**
     * Create an instance of {@link GetEnterprise }
     * 
     */
    public GetEnterprise createGetEnterprise() {
        return new GetEnterprise();
    }

    /**
     * Create an instance of {@link SaveUOMGroupListResponse }
     * 
     */
    public SaveUOMGroupListResponse createSaveUOMGroupListResponse() {
        return new SaveUOMGroupListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialPricingQuantity }
     * 
     */
    public ArrayOfSpecialPricingQuantity createArrayOfSpecialPricingQuantity() {
        return new ArrayOfSpecialPricingQuantity();
    }

    /**
     * Create an instance of {@link AccountsReceivable }
     * 
     */
    public AccountsReceivable createAccountsReceivable() {
        return new AccountsReceivable();
    }

    /**
     * Create an instance of {@link SearchTransactionResponse.SearchTransactionResult }
     * 
     */
    public SearchTransactionResponse.SearchTransactionResult createSearchTransactionResponseSearchTransactionResult() {
        return new SearchTransactionResponse.SearchTransactionResult();
    }

    /**
     * Create an instance of {@link GoodsReceiptBatchDetail }
     * 
     */
    public GoodsReceiptBatchDetail createGoodsReceiptBatchDetail() {
        return new GoodsReceiptBatchDetail();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReceiptPO }
     * 
     */
    public ArrayOfGoodsReceiptPO createArrayOfGoodsReceiptPO() {
        return new ArrayOfGoodsReceiptPO();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryCountSerialDetail }
     * 
     */
    public ArrayOfInventoryCountSerialDetail createArrayOfInventoryCountSerialDetail() {
        return new ArrayOfInventoryCountSerialDetail();
    }

    /**
     * Create an instance of {@link XSaveCustomerResponse }
     * 
     */
    public XSaveCustomerResponse createXSaveCustomerResponse() {
        return new XSaveCustomerResponse();
    }

    /**
     * Create an instance of {@link SavePriceMatrixResponse }
     * 
     */
    public SavePriceMatrixResponse createSavePriceMatrixResponse() {
        return new SavePriceMatrixResponse();
    }

    /**
     * Create an instance of {@link SaveVendorResponse }
     * 
     */
    public SaveVendorResponse createSaveVendorResponse() {
        return new SaveVendorResponse();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
    }

    /**
     * Create an instance of {@link GetGiftCertificateMasterResponse }
     * 
     */
    public GetGiftCertificateMasterResponse createGetGiftCertificateMasterResponse() {
        return new GetGiftCertificateMasterResponse();
    }

    /**
     * Create an instance of {@link GetCoupon }
     * 
     */
    public GetCoupon createGetCoupon() {
        return new GetCoupon();
    }

    /**
     * Create an instance of {@link GetQueueByWarehouseResponse }
     * 
     */
    public GetQueueByWarehouseResponse createGetQueueByWarehouseResponse() {
        return new GetQueueByWarehouseResponse();
    }

    /**
     * Create an instance of {@link SaveSerialResponse }
     * 
     */
    public SaveSerialResponse createSaveSerialResponse() {
        return new SaveSerialResponse();
    }

    /**
     * Create an instance of {@link Serial }
     * 
     */
    public Serial createSerial() {
        return new Serial();
    }

    /**
     * Create an instance of {@link GetStoreResponse }
     * 
     */
    public GetStoreResponse createGetStoreResponse() {
        return new GetStoreResponse();
    }

    /**
     * Create an instance of {@link PostTransactionItem }
     * 
     */
    public PostTransactionItem createPostTransactionItem() {
        return new PostTransactionItem();
    }

    /**
     * Create an instance of {@link DeleteSurcharge }
     * 
     */
    public DeleteSurcharge createDeleteSurcharge() {
        return new DeleteSurcharge();
    }

    /**
     * Create an instance of {@link SaveCouponResponse }
     * 
     */
    public SaveCouponResponse createSaveCouponResponse() {
        return new SaveCouponResponse();
    }

    /**
     * Create an instance of {@link Coupon }
     * 
     */
    public Coupon createCoupon() {
        return new Coupon();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryCountBatchDetail }
     * 
     */
    public ArrayOfInventoryCountBatchDetail createArrayOfInventoryCountBatchDetail() {
        return new ArrayOfInventoryCountBatchDetail();
    }

    /**
     * Create an instance of {@link DeleteVendor }
     * 
     */
    public DeleteVendor createDeleteVendor() {
        return new DeleteVendor();
    }

    /**
     * Create an instance of {@link PurchaseOrderSurchargeDTO }
     * 
     */
    public PurchaseOrderSurchargeDTO createPurchaseOrderSurchargeDTO() {
        return new PurchaseOrderSurchargeDTO();
    }

    /**
     * Create an instance of {@link SavePriceList }
     * 
     */
    public SavePriceList createSavePriceList() {
        return new SavePriceList();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryUpdateBatch }
     * 
     */
    public ArrayOfInventoryUpdateBatch createArrayOfInventoryUpdateBatch() {
        return new ArrayOfInventoryUpdateBatch();
    }

    /**
     * Create an instance of {@link SaveBatchResponse }
     * 
     */
    public SaveBatchResponse createSaveBatchResponse() {
        return new SaveBatchResponse();
    }

    /**
     * Create an instance of {@link SaveUOM }
     * 
     */
    public SaveUOM createSaveUOM() {
        return new SaveUOM();
    }

    /**
     * Create an instance of {@link UOM }
     * 
     */
    public UOM createUOM() {
        return new UOM();
    }

    /**
     * Create an instance of {@link InitializeResponse }
     * 
     */
    public InitializeResponse createInitializeResponse() {
        return new InitializeResponse();
    }

    /**
     * Create an instance of {@link DeleteVendorGroup }
     * 
     */
    public DeleteVendorGroup createDeleteVendorGroup() {
        return new DeleteVendorGroup();
    }

    /**
     * Create an instance of {@link GetProductGroupResponse }
     * 
     */
    public GetProductGroupResponse createGetProductGroupResponse() {
        return new GetProductGroupResponse();
    }

    /**
     * Create an instance of {@link ProductGroup }
     * 
     */
    public ProductGroup createProductGroup() {
        return new ProductGroup();
    }

    /**
     * Create an instance of {@link GetAllLineAttribute }
     * 
     */
    public GetAllLineAttribute createGetAllLineAttribute() {
        return new GetAllLineAttribute();
    }

    /**
     * Create an instance of {@link XSyncInventoryResponse }
     * 
     */
    public XSyncInventoryResponse createXSyncInventoryResponse() {
        return new XSyncInventoryResponse();
    }

    /**
     * Create an instance of {@link StockTransferBatchDetail }
     * 
     */
    public StockTransferBatchDetail createStockTransferBatchDetail() {
        return new StockTransferBatchDetail();
    }

    /**
     * Create an instance of {@link SaveStore }
     * 
     */
    public SaveStore createSaveStore() {
        return new SaveStore();
    }

    /**
     * Create an instance of {@link UpdateMasterObjectResponse }
     * 
     */
    public UpdateMasterObjectResponse createUpdateMasterObjectResponse() {
        return new UpdateMasterObjectResponse();
    }

    /**
     * Create an instance of {@link UpdateMaster }
     * 
     */
    public UpdateMaster createUpdateMaster() {
        return new UpdateMaster();
    }

    /**
     * Create an instance of {@link SaveCountryResponse }
     * 
     */
    public SaveCountryResponse createSaveCountryResponse() {
        return new SaveCountryResponse();
    }

    /**
     * Create an instance of {@link DeleteUOM }
     * 
     */
    public DeleteUOM createDeleteUOM() {
        return new DeleteUOM();
    }

    /**
     * Create an instance of {@link BarcodeInformation }
     * 
     */
    public BarcodeInformation createBarcodeInformation() {
        return new BarcodeInformation();
    }

    /**
     * Create an instance of {@link SaveCustomerGroupResponse }
     * 
     */
    public SaveCustomerGroupResponse createSaveCustomerGroupResponse() {
        return new SaveCustomerGroupResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link SaveStockTransferResponse }
     * 
     */
    public SaveStockTransferResponse createSaveStockTransferResponse() {
        return new SaveStockTransferResponse();
    }

    /**
     * Create an instance of {@link PromotionBuy }
     * 
     */
    public PromotionBuy createPromotionBuy() {
        return new PromotionBuy();
    }

    /**
     * Create an instance of {@link GetTaxCodeConditionsResponse }
     * 
     */
    public GetTaxCodeConditionsResponse createGetTaxCodeConditionsResponse() {
        return new GetTaxCodeConditionsResponse();
    }

    /**
     * Create an instance of {@link SaveProduct }
     * 
     */
    public SaveProduct createSaveProduct() {
        return new SaveProduct();
    }

    /**
     * Create an instance of {@link GetReplicationSendDump }
     * 
     */
    public GetReplicationSendDump createGetReplicationSendDump() {
        return new GetReplicationSendDump();
    }

    /**
     * Create an instance of {@link ArrayOfStockTransfer }
     * 
     */
    public ArrayOfStockTransfer createArrayOfStockTransfer() {
        return new ArrayOfStockTransfer();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link SaveVendorGroupResponse }
     * 
     */
    public SaveVendorGroupResponse createSaveVendorGroupResponse() {
        return new SaveVendorGroupResponse();
    }

    /**
     * Create an instance of {@link SaveTaxCodeConditionListResponse }
     * 
     */
    public SaveTaxCodeConditionListResponse createSaveTaxCodeConditionListResponse() {
        return new SaveTaxCodeConditionListResponse();
    }

    /**
     * Create an instance of {@link DeleteExchangeRateByDateResponse }
     * 
     */
    public DeleteExchangeRateByDateResponse createDeleteExchangeRateByDateResponse() {
        return new DeleteExchangeRateByDateResponse();
    }

    /**
     * Create an instance of {@link SaveCustomerCatalogResponse }
     * 
     */
    public SaveCustomerCatalogResponse createSaveCustomerCatalogResponse() {
        return new SaveCustomerCatalogResponse();
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetCustomerGroup }
     * 
     */
    public GetCustomerGroup createGetCustomerGroup() {
        return new GetCustomerGroup();
    }

    /**
     * Create an instance of {@link GetAllCountries }
     * 
     */
    public GetAllCountries createGetAllCountries() {
        return new GetAllCountries();
    }

    /**
     * Create an instance of {@link PurchaseOrderDetail }
     * 
     */
    public PurchaseOrderDetail createPurchaseOrderDetail() {
        return new PurchaseOrderDetail();
    }

    /**
     * Create an instance of {@link SaveGoodsIssueList }
     * 
     */
    public SaveGoodsIssueList createSaveGoodsIssueList() {
        return new SaveGoodsIssueList();
    }

    /**
     * Create an instance of {@link GetRedeemableAmountResponse }
     * 
     */
    public GetRedeemableAmountResponse createGetRedeemableAmountResponse() {
        return new GetRedeemableAmountResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPromotionBuy }
     * 
     */
    public ArrayOfPromotionBuy createArrayOfPromotionBuy() {
        return new ArrayOfPromotionBuy();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReceiptPOSerialDetail }
     * 
     */
    public ArrayOfGoodsReceiptPOSerialDetail createArrayOfGoodsReceiptPOSerialDetail() {
        return new ArrayOfGoodsReceiptPOSerialDetail();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link SaveShippingType }
     * 
     */
    public SaveShippingType createSaveShippingType() {
        return new SaveShippingType();
    }

    /**
     * Create an instance of {@link SaveVendorList }
     * 
     */
    public SaveVendorList createSaveVendorList() {
        return new SaveVendorList();
    }

    /**
     * Create an instance of {@link SaveStockTransfer }
     * 
     */
    public SaveStockTransfer createSaveStockTransfer() {
        return new SaveStockTransfer();
    }

    /**
     * Create an instance of {@link GetExchangeRateByCurrencyAndDateResponse }
     * 
     */
    public GetExchangeRateByCurrencyAndDateResponse createGetExchangeRateByCurrencyAndDateResponse() {
        return new GetExchangeRateByCurrencyAndDateResponse();
    }

    /**
     * Create an instance of {@link GetQueue }
     * 
     */
    public GetQueue createGetQueue() {
        return new GetQueue();
    }

    /**
     * Create an instance of {@link AttributeValidValue }
     * 
     */
    public AttributeValidValue createAttributeValidValue() {
        return new AttributeValidValue();
    }

    /**
     * Create an instance of {@link CancelQuotationResponse }
     * 
     */
    public CancelQuotationResponse createCancelQuotationResponse() {
        return new CancelQuotationResponse();
    }

    /**
     * Create an instance of {@link GetAllDeliveryPackageResponse }
     * 
     */
    public GetAllDeliveryPackageResponse createGetAllDeliveryPackageResponse() {
        return new GetAllDeliveryPackageResponse();
    }

    /**
     * Create an instance of {@link DeletePriceListResponse }
     * 
     */
    public DeletePriceListResponse createDeletePriceListResponse() {
        return new DeletePriceListResponse();
    }

    /**
     * Create an instance of {@link XSaveTransactionResponse }
     * 
     */
    public XSaveTransactionResponse createXSaveTransactionResponse() {
        return new XSaveTransactionResponse();
    }

    /**
     * Create an instance of {@link RollBackRedeemedPointsResponse }
     * 
     */
    public RollBackRedeemedPointsResponse createRollBackRedeemedPointsResponse() {
        return new RollBackRedeemedPointsResponse();
    }

    /**
     * Create an instance of {@link GetProductUpgradeInformationResponse.GetProductUpgradeInformationResult }
     * 
     */
    public GetProductUpgradeInformationResponse.GetProductUpgradeInformationResult createGetProductUpgradeInformationResponseGetProductUpgradeInformationResult() {
        return new GetProductUpgradeInformationResponse.GetProductUpgradeInformationResult();
    }

    /**
     * Create an instance of {@link SaveVendorGroup }
     * 
     */
    public SaveVendorGroup createSaveVendorGroup() {
        return new SaveVendorGroup();
    }

    /**
     * Create an instance of {@link GetQueryResultResponse.GetQueryResultResult }
     * 
     */
    public GetQueryResultResponse.GetQueryResultResult createGetQueryResultResponseGetQueryResultResult() {
        return new GetQueryResultResponse.GetQueryResultResult();
    }

    /**
     * Create an instance of {@link SaveSurcharge }
     * 
     */
    public SaveSurcharge createSaveSurcharge() {
        return new SaveSurcharge();
    }

    /**
     * Create an instance of {@link DeleteExchangeRateByCurrencyAndDateResponse }
     * 
     */
    public DeleteExchangeRateByCurrencyAndDateResponse createDeleteExchangeRateByCurrencyAndDateResponse() {
        return new DeleteExchangeRateByCurrencyAndDateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCurrencyDenomination }
     * 
     */
    public ArrayOfCurrencyDenomination createArrayOfCurrencyDenomination() {
        return new ArrayOfCurrencyDenomination();
    }

    /**
     * Create an instance of {@link FulfillmentPlan }
     * 
     */
    public FulfillmentPlan createFulfillmentPlan() {
        return new FulfillmentPlan();
    }

    /**
     * Create an instance of {@link GoodsIssueDetail }
     * 
     */
    public GoodsIssueDetail createGoodsIssueDetail() {
        return new GoodsIssueDetail();
    }

    /**
     * Create an instance of {@link DeletePromotionalBonusBuys }
     * 
     */
    public DeletePromotionalBonusBuys createDeletePromotionalBonusBuys() {
        return new DeletePromotionalBonusBuys();
    }

    /**
     * Create an instance of {@link SavePaymentTypeResponse }
     * 
     */
    public SavePaymentTypeResponse createSavePaymentTypeResponse() {
        return new SavePaymentTypeResponse();
    }

    /**
     * Create an instance of {@link GetInventoryOfWarehouseResponse }
     * 
     */
    public GetInventoryOfWarehouseResponse createGetInventoryOfWarehouseResponse() {
        return new GetInventoryOfWarehouseResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPriceList }
     * 
     */
    public ArrayOfPriceList createArrayOfPriceList() {
        return new ArrayOfPriceList();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialPricing }
     * 
     */
    public ArrayOfSpecialPricing createArrayOfSpecialPricing() {
        return new ArrayOfSpecialPricing();
    }

    /**
     * Create an instance of {@link XGetPointsSummaryResponse }
     * 
     */
    public XGetPointsSummaryResponse createXGetPointsSummaryResponse() {
        return new XGetPointsSummaryResponse();
    }

    /**
     * Create an instance of {@link RemoveUpsellItems }
     * 
     */
    public RemoveUpsellItems createRemoveUpsellItems() {
        return new RemoveUpsellItems();
    }

    /**
     * Create an instance of {@link SaveCustomerGroupDiscountListResponse }
     * 
     */
    public SaveCustomerGroupDiscountListResponse createSaveCustomerGroupDiscountListResponse() {
        return new SaveCustomerGroupDiscountListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCustomerGroupDiscount }
     * 
     */
    public ArrayOfCustomerGroupDiscount createArrayOfCustomerGroupDiscount() {
        return new ArrayOfCustomerGroupDiscount();
    }

    /**
     * Create an instance of {@link GetCountryResponse }
     * 
     */
    public GetCountryResponse createGetCountryResponse() {
        return new GetCountryResponse();
    }

    /**
     * Create an instance of {@link GetPrePrintedLoyaltyCards }
     * 
     */
    public GetPrePrintedLoyaltyCards createGetPrePrintedLoyaltyCards() {
        return new GetPrePrintedLoyaltyCards();
    }

    /**
     * Create an instance of {@link SetKitComponents }
     * 
     */
    public SetKitComponents createSetKitComponents() {
        return new SetKitComponents();
    }

    /**
     * Create an instance of {@link GoodsReceiptPOBatchDetail }
     * 
     */
    public GoodsReceiptPOBatchDetail createGoodsReceiptPOBatchDetail() {
        return new GoodsReceiptPOBatchDetail();
    }

    /**
     * Create an instance of {@link SaveGoodsIssue }
     * 
     */
    public SaveGoodsIssue createSaveGoodsIssue() {
        return new SaveGoodsIssue();
    }

    /**
     * Create an instance of {@link GoodsIssue }
     * 
     */
    public GoodsIssue createGoodsIssue() {
        return new GoodsIssue();
    }

    /**
     * Create an instance of {@link GetShippingType }
     * 
     */
    public GetShippingType createGetShippingType() {
        return new GetShippingType();
    }

    /**
     * Create an instance of {@link XSyncInventory }
     * 
     */
    public XSyncInventory createXSyncInventory() {
        return new XSyncInventory();
    }

    /**
     * Create an instance of {@link ArrayOfSaleAttribute }
     * 
     */
    public ArrayOfSaleAttribute createArrayOfSaleAttribute() {
        return new ArrayOfSaleAttribute();
    }

    /**
     * Create an instance of {@link GiftCertificate }
     * 
     */
    public GiftCertificate createGiftCertificate() {
        return new GiftCertificate();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReceiptPODetail }
     * 
     */
    public ArrayOfGoodsReceiptPODetail createArrayOfGoodsReceiptPODetail() {
        return new ArrayOfGoodsReceiptPODetail();
    }

    /**
     * Create an instance of {@link GetManufacturer }
     * 
     */
    public GetManufacturer createGetManufacturer() {
        return new GetManufacturer();
    }

    /**
     * Create an instance of {@link PromotionGet }
     * 
     */
    public PromotionGet createPromotionGet() {
        return new PromotionGet();
    }

    /**
     * Create an instance of {@link ValidateLoyaltyPortalCustomer }
     * 
     */
    public ValidateLoyaltyPortalCustomer createValidateLoyaltyPortalCustomer() {
        return new ValidateLoyaltyPortalCustomer();
    }

    /**
     * Create an instance of {@link GoodsIssueSerialDetail }
     * 
     */
    public GoodsIssueSerialDetail createGoodsIssueSerialDetail() {
        return new GoodsIssueSerialDetail();
    }

    /**
     * Create an instance of {@link SaveAlternateItemsResponse }
     * 
     */
    public SaveAlternateItemsResponse createSaveAlternateItemsResponse() {
        return new SaveAlternateItemsResponse();
    }

    /**
     * Create an instance of {@link UpdateGiftCertificateBalance }
     * 
     */
    public UpdateGiftCertificateBalance createUpdateGiftCertificateBalance() {
        return new UpdateGiftCertificateBalance();
    }

    /**
     * Create an instance of {@link GetProductCost }
     * 
     */
    public GetProductCost createGetProductCost() {
        return new GetProductCost();
    }

    /**
     * Create an instance of {@link SaveEmployeeResponse }
     * 
     */
    public SaveEmployeeResponse createSaveEmployeeResponse() {
        return new SaveEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetPointsSummary }
     * 
     */
    public GetPointsSummary createGetPointsSummary() {
        return new GetPointsSummary();
    }

    /**
     * Create an instance of {@link ValidateLoyaltyCustomer }
     * 
     */
    public ValidateLoyaltyCustomer createValidateLoyaltyCustomer() {
        return new ValidateLoyaltyCustomer();
    }

    /**
     * Create an instance of {@link ArrayOfAccountsReceivable }
     * 
     */
    public ArrayOfAccountsReceivable createArrayOfAccountsReceivable() {
        return new ArrayOfAccountsReceivable();
    }

    /**
     * Create an instance of {@link RollBackRedeemedPoints }
     * 
     */
    public RollBackRedeemedPoints createRollBackRedeemedPoints() {
        return new RollBackRedeemedPoints();
    }

    /**
     * Create an instance of {@link RemoveProductSurcharges }
     * 
     */
    public RemoveProductSurcharges createRemoveProductSurcharges() {
        return new RemoveProductSurcharges();
    }

    /**
     * Create an instance of {@link ArrayOfPostTransactionItem }
     * 
     */
    public ArrayOfPostTransactionItem createArrayOfPostTransactionItem() {
        return new ArrayOfPostTransactionItem();
    }

    /**
     * Create an instance of {@link GetGiftCertificateMaster }
     * 
     */
    public GetGiftCertificateMaster createGetGiftCertificateMaster() {
        return new GetGiftCertificateMaster();
    }

    /**
     * Create an instance of {@link InventoryItem }
     * 
     */
    public InventoryItem createInventoryItem() {
        return new InventoryItem();
    }

    /**
     * Create an instance of {@link ProductUpsell }
     * 
     */
    public ProductUpsell createProductUpsell() {
        return new ProductUpsell();
    }

    /**
     * Create an instance of {@link UpdateLoyaltyCustomerResponse }
     * 
     */
    public UpdateLoyaltyCustomerResponse createUpdateLoyaltyCustomerResponse() {
        return new UpdateLoyaltyCustomerResponse();
    }

    /**
     * Create an instance of {@link GetBarCodeMask }
     * 
     */
    public GetBarCodeMask createGetBarCodeMask() {
        return new GetBarCodeMask();
    }

    /**
     * Create an instance of {@link DeliveryPackageAddress }
     * 
     */
    public DeliveryPackageAddress createDeliveryPackageAddress() {
        return new DeliveryPackageAddress();
    }

    /**
     * Create an instance of {@link GetExchangeRateByDate }
     * 
     */
    public GetExchangeRateByDate createGetExchangeRateByDate() {
        return new GetExchangeRateByDate();
    }

    /**
     * Create an instance of {@link GoodsReturnDetail }
     * 
     */
    public GoodsReturnDetail createGoodsReturnDetail() {
        return new GoodsReturnDetail();
    }

    /**
     * Create an instance of {@link GetEnterpriseResponse }
     * 
     */
    public GetEnterpriseResponse createGetEnterpriseResponse() {
        return new GetEnterpriseResponse();
    }

    /**
     * Create an instance of {@link SaveStockTransferListResponse }
     * 
     */
    public SaveStockTransferListResponse createSaveStockTransferListResponse() {
        return new SaveStockTransferListResponse();
    }

    /**
     * Create an instance of {@link SaveSpecialPriceResponse }
     * 
     */
    public SaveSpecialPriceResponse createSaveSpecialPriceResponse() {
        return new SaveSpecialPriceResponse();
    }

    /**
     * Create an instance of {@link SpecialPricing }
     * 
     */
    public SpecialPricing createSpecialPricing() {
        return new SpecialPricing();
    }

    /**
     * Create an instance of {@link ArrayOfBarCodeMask }
     * 
     */
    public ArrayOfBarCodeMask createArrayOfBarCodeMask() {
        return new ArrayOfBarCodeMask();
    }

    /**
     * Create an instance of {@link SaveCustomerGroupDiscountList }
     * 
     */
    public SaveCustomerGroupDiscountList createSaveCustomerGroupDiscountList() {
        return new SaveCustomerGroupDiscountList();
    }

    /**
     * Create an instance of {@link GetAllStatesResponse }
     * 
     */
    public GetAllStatesResponse createGetAllStatesResponse() {
        return new GetAllStatesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfState }
     * 
     */
    public ArrayOfState createArrayOfState() {
        return new ArrayOfState();
    }

    /**
     * Create an instance of {@link SaveTaxCodeResponse }
     * 
     */
    public SaveTaxCodeResponse createSaveTaxCodeResponse() {
        return new SaveTaxCodeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCoupon }
     * 
     */
    public ArrayOfCoupon createArrayOfCoupon() {
        return new ArrayOfCoupon();
    }

    /**
     * Create an instance of {@link RemoveAlternateItemsResponse }
     * 
     */
    public RemoveAlternateItemsResponse createRemoveAlternateItemsResponse() {
        return new RemoveAlternateItemsResponse();
    }

    /**
     * Create an instance of {@link LoyaltySetup }
     * 
     */
    public LoyaltySetup createLoyaltySetup() {
        return new LoyaltySetup();
    }

    /**
     * Create an instance of {@link SaveReplicationSendDumpListResponse }
     * 
     */
    public SaveReplicationSendDumpListResponse createSaveReplicationSendDumpListResponse() {
        return new SaveReplicationSendDumpListResponse();
    }

    /**
     * Create an instance of {@link GetRetailProfile }
     * 
     */
    public GetRetailProfile createGetRetailProfile() {
        return new GetRetailProfile();
    }

    /**
     * Create an instance of {@link GetPointsDetails }
     * 
     */
    public GetPointsDetails createGetPointsDetails() {
        return new GetPointsDetails();
    }

    /**
     * Create an instance of {@link GetPointsDetailsResponse.GetPointsDetailsResult }
     * 
     */
    public GetPointsDetailsResponse.GetPointsDetailsResult createGetPointsDetailsResponseGetPointsDetailsResult() {
        return new GetPointsDetailsResponse.GetPointsDetailsResult();
    }

    /**
     * Create an instance of {@link GetMonthlyPointsSummary }
     * 
     */
    public GetMonthlyPointsSummary createGetMonthlyPointsSummary() {
        return new GetMonthlyPointsSummary();
    }

    /**
     * Create an instance of {@link SaveTransactionSignatureResponse }
     * 
     */
    public SaveTransactionSignatureResponse createSaveTransactionSignatureResponse() {
        return new SaveTransactionSignatureResponse();
    }

    /**
     * Create an instance of {@link SavePromotionalBonusBuysListResponse }
     * 
     */
    public SavePromotionalBonusBuysListResponse createSavePromotionalBonusBuysListResponse() {
        return new SavePromotionalBonusBuysListResponse();
    }

    /**
     * Create an instance of {@link SaveCouponListResponse }
     * 
     */
    public SaveCouponListResponse createSaveCouponListResponse() {
        return new SaveCouponListResponse();
    }

    /**
     * Create an instance of {@link SaveCustomerListResponse }
     * 
     */
    public SaveCustomerListResponse createSaveCustomerListResponse() {
        return new SaveCustomerListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCustomer }
     * 
     */
    public ArrayOfCustomer createArrayOfCustomer() {
        return new ArrayOfCustomer();
    }

    /**
     * Create an instance of {@link GetDeliveryPackageByKeyResponse }
     * 
     */
    public GetDeliveryPackageByKeyResponse createGetDeliveryPackageByKeyResponse() {
        return new GetDeliveryPackageByKeyResponse();
    }

    /**
     * Create an instance of {@link DeliveryPackage }
     * 
     */
    public DeliveryPackage createDeliveryPackage() {
        return new DeliveryPackage();
    }

    /**
     * Create an instance of {@link SavePaymentTypeList }
     * 
     */
    public SavePaymentTypeList createSavePaymentTypeList() {
        return new SavePaymentTypeList();
    }

    /**
     * Create an instance of {@link XRegisterLoyaltyCustomer }
     * 
     */
    public XRegisterLoyaltyCustomer createXRegisterLoyaltyCustomer() {
        return new XRegisterLoyaltyCustomer();
    }

    /**
     * Create an instance of {@link TransactionSalesPerson }
     * 
     */
    public TransactionSalesPerson createTransactionSalesPerson() {
        return new TransactionSalesPerson();
    }

    /**
     * Create an instance of {@link SaveManufacturerDiscountListResponse }
     * 
     */
    public SaveManufacturerDiscountListResponse createSaveManufacturerDiscountListResponse() {
        return new SaveManufacturerDiscountListResponse();
    }

    /**
     * Create an instance of {@link SaveVendorListResponse }
     * 
     */
    public SaveVendorListResponse createSaveVendorListResponse() {
        return new SaveVendorListResponse();
    }

    /**
     * Create an instance of {@link DeletePaymentType }
     * 
     */
    public DeletePaymentType createDeletePaymentType() {
        return new DeletePaymentType();
    }

    /**
     * Create an instance of {@link SaveSpecialPriceDiscountGroupResponse }
     * 
     */
    public SaveSpecialPriceDiscountGroupResponse createSaveSpecialPriceDiscountGroupResponse() {
        return new SaveSpecialPriceDiscountGroupResponse();
    }

    /**
     * Create an instance of {@link StoreExpense }
     * 
     */
    public StoreExpense createStoreExpense() {
        return new StoreExpense();
    }

    /**
     * Create an instance of {@link ExecuteQueries }
     * 
     */
    public ExecuteQueries createExecuteQueries() {
        return new ExecuteQueries();
    }

    /**
     * Create an instance of {@link SaveDumpList }
     * 
     */
    public SaveDumpList createSaveDumpList() {
        return new SaveDumpList();
    }

    /**
     * Create an instance of {@link ValidateUserResponse }
     * 
     */
    public ValidateUserResponse createValidateUserResponse() {
        return new ValidateUserResponse();
    }

    /**
     * Create an instance of {@link GetPromotionBonusBuysResponse }
     * 
     */
    public GetPromotionBonusBuysResponse createGetPromotionBonusBuysResponse() {
        return new GetPromotionBonusBuysResponse();
    }

    /**
     * Create an instance of {@link ValidateLoyaltyCustomerResponse }
     * 
     */
    public ValidateLoyaltyCustomerResponse createValidateLoyaltyCustomerResponse() {
        return new ValidateLoyaltyCustomerResponse();
    }

    /**
     * Create an instance of {@link XSearchTransaction }
     * 
     */
    public XSearchTransaction createXSearchTransaction() {
        return new XSearchTransaction();
    }

    /**
     * Create an instance of {@link GetSurcharge }
     * 
     */
    public GetSurcharge createGetSurcharge() {
        return new GetSurcharge();
    }

    /**
     * Create an instance of {@link ArrayOfAddress }
     * 
     */
    public ArrayOfAddress createArrayOfAddress() {
        return new ArrayOfAddress();
    }

    /**
     * Create an instance of {@link InventoryCountBatchDetail }
     * 
     */
    public InventoryCountBatchDetail createInventoryCountBatchDetail() {
        return new InventoryCountBatchDetail();
    }

    /**
     * Create an instance of {@link GetRegistrationMethod }
     * 
     */
    public GetRegistrationMethod createGetRegistrationMethod() {
        return new GetRegistrationMethod();
    }

    /**
     * Create an instance of {@link GetInventoryOfProduct }
     * 
     */
    public GetInventoryOfProduct createGetInventoryOfProduct() {
        return new GetInventoryOfProduct();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentTypeAttribute }
     * 
     */
    public ArrayOfPaymentTypeAttribute createArrayOfPaymentTypeAttribute() {
        return new ArrayOfPaymentTypeAttribute();
    }

    /**
     * Create an instance of {@link SaveGoodsReceiptPOListResponse }
     * 
     */
    public SaveGoodsReceiptPOListResponse createSaveGoodsReceiptPOListResponse() {
        return new SaveGoodsReceiptPOListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPromotionProductDetail }
     * 
     */
    public ArrayOfPromotionProductDetail createArrayOfPromotionProductDetail() {
        return new ArrayOfPromotionProductDetail();
    }

    /**
     * Create an instance of {@link GetInventoryOfWarehouse }
     * 
     */
    public GetInventoryOfWarehouse createGetInventoryOfWarehouse() {
        return new GetInventoryOfWarehouse();
    }

    /**
     * Create an instance of {@link InventoryCountDetail }
     * 
     */
    public InventoryCountDetail createInventoryCountDetail() {
        return new InventoryCountDetail();
    }

    /**
     * Create an instance of {@link PostTransactionLineItemAttribute }
     * 
     */
    public PostTransactionLineItemAttribute createPostTransactionLineItemAttribute() {
        return new PostTransactionLineItemAttribute();
    }

    /**
     * Create an instance of {@link TransactionSurcharge }
     * 
     */
    public TransactionSurcharge createTransactionSurcharge() {
        return new TransactionSurcharge();
    }

    /**
     * Create an instance of {@link SaveSerialListResponse }
     * 
     */
    public SaveSerialListResponse createSaveSerialListResponse() {
        return new SaveSerialListResponse();
    }

    /**
     * Create an instance of {@link GetTaxCodeConditions }
     * 
     */
    public GetTaxCodeConditions createGetTaxCodeConditions() {
        return new GetTaxCodeConditions();
    }

    /**
     * Create an instance of {@link BaseWrapper }
     * 
     */
    public BaseWrapper createBaseWrapper() {
        return new BaseWrapper();
    }

    /**
     * Create an instance of {@link SaveGiftCertificateMaster }
     * 
     */
    public SaveGiftCertificateMaster createSaveGiftCertificateMaster() {
        return new SaveGiftCertificateMaster();
    }

    /**
     * Create an instance of {@link SaveEmployeeListResponse }
     * 
     */
    public SaveEmployeeListResponse createSaveEmployeeListResponse() {
        return new SaveEmployeeListResponse();
    }

    /**
     * Create an instance of {@link TransactionPaymentAttribute }
     * 
     */
    public TransactionPaymentAttribute createTransactionPaymentAttribute() {
        return new TransactionPaymentAttribute();
    }

    /**
     * Create an instance of {@link BarCodeMaskDetail }
     * 
     */
    public BarCodeMaskDetail createBarCodeMaskDetail() {
        return new BarCodeMaskDetail();
    }

    /**
     * Create an instance of {@link GoodsIssueBatchDetail }
     * 
     */
    public GoodsIssueBatchDetail createGoodsIssueBatchDetail() {
        return new GoodsIssueBatchDetail();
    }

    /**
     * Create an instance of {@link UpdateLoyaltyCustomer }
     * 
     */
    public UpdateLoyaltyCustomer createUpdateLoyaltyCustomer() {
        return new UpdateLoyaltyCustomer();
    }

    /**
     * Create an instance of {@link SaveStoreList }
     * 
     */
    public SaveStoreList createSaveStoreList() {
        return new SaveStoreList();
    }

    /**
     * Create an instance of {@link SecurityRights }
     * 
     */
    public SecurityRights createSecurityRights() {
        return new SecurityRights();
    }

    /**
     * Create an instance of {@link ValidateUserWithDeviceIdResponse }
     * 
     */
    public ValidateUserWithDeviceIdResponse createValidateUserWithDeviceIdResponse() {
        return new ValidateUserWithDeviceIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsIssueBatchDetail }
     * 
     */
    public ArrayOfGoodsIssueBatchDetail createArrayOfGoodsIssueBatchDetail() {
        return new ArrayOfGoodsIssueBatchDetail();
    }

    /**
     * Create an instance of {@link GetManufacturerResponse }
     * 
     */
    public GetManufacturerResponse createGetManufacturerResponse() {
        return new GetManufacturerResponse();
    }

    /**
     * Create an instance of {@link SaveCountryList }
     * 
     */
    public SaveCountryList createSaveCountryList() {
        return new SaveCountryList();
    }

    /**
     * Create an instance of {@link GetUpgradeInformation }
     * 
     */
    public GetUpgradeInformation createGetUpgradeInformation() {
        return new GetUpgradeInformation();
    }

    /**
     * Create an instance of {@link XSaveCustomer }
     * 
     */
    public XSaveCustomer createXSaveCustomer() {
        return new XSaveCustomer();
    }

    /**
     * Create an instance of {@link DeleteManufacturer }
     * 
     */
    public DeleteManufacturer createDeleteManufacturer() {
        return new DeleteManufacturer();
    }

    /**
     * Create an instance of {@link GetBatch }
     * 
     */
    public GetBatch createGetBatch() {
        return new GetBatch();
    }

    /**
     * Create an instance of {@link SavePurchaseOrderList }
     * 
     */
    public SavePurchaseOrderList createSavePurchaseOrderList() {
        return new SavePurchaseOrderList();
    }

    /**
     * Create an instance of {@link ArrayOfPurchaseOrder }
     * 
     */
    public ArrayOfPurchaseOrder createArrayOfPurchaseOrder() {
        return new ArrayOfPurchaseOrder();
    }

    /**
     * Create an instance of {@link SaveGoodsIssueResponse }
     * 
     */
    public SaveGoodsIssueResponse createSaveGoodsIssueResponse() {
        return new SaveGoodsIssueResponse();
    }

    /**
     * Create an instance of {@link SaveBarCodeMaskList }
     * 
     */
    public SaveBarCodeMaskList createSaveBarCodeMaskList() {
        return new SaveBarCodeMaskList();
    }

    /**
     * Create an instance of {@link GetPointsSummaryByTransactionKey }
     * 
     */
    public GetPointsSummaryByTransactionKey createGetPointsSummaryByTransactionKey() {
        return new GetPointsSummaryByTransactionKey();
    }

    /**
     * Create an instance of {@link SaveTaxCodeConditionList }
     * 
     */
    public SaveTaxCodeConditionList createSaveTaxCodeConditionList() {
        return new SaveTaxCodeConditionList();
    }

    /**
     * Create an instance of {@link ArrayOfWarehouse }
     * 
     */
    public ArrayOfWarehouse createArrayOfWarehouse() {
        return new ArrayOfWarehouse();
    }

    /**
     * Create an instance of {@link DeleteBatch }
     * 
     */
    public DeleteBatch createDeleteBatch() {
        return new DeleteBatch();
    }

    /**
     * Create an instance of {@link XDeleteSuspendedTransactionResponse }
     * 
     */
    public XDeleteSuspendedTransactionResponse createXDeleteSuspendedTransactionResponse() {
        return new XDeleteSuspendedTransactionResponse();
    }

    /**
     * Create an instance of {@link GetVersionInformation }
     * 
     */
    public GetVersionInformation createGetVersionInformation() {
        return new GetVersionInformation();
    }

    /**
     * Create an instance of {@link ArrayOfTransactionPaymentAttribute }
     * 
     */
    public ArrayOfTransactionPaymentAttribute createArrayOfTransactionPaymentAttribute() {
        return new ArrayOfTransactionPaymentAttribute();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link DeleteSurchargeResponse }
     * 
     */
    public DeleteSurchargeResponse createDeleteSurchargeResponse() {
        return new DeleteSurchargeResponse();
    }

    /**
     * Create an instance of {@link ValidateLicenseForIntegration }
     * 
     */
    public ValidateLicenseForIntegration createValidateLicenseForIntegration() {
        return new ValidateLicenseForIntegration();
    }

    /**
     * Create an instance of {@link UpdateReplicationSentStatus }
     * 
     */
    public UpdateReplicationSentStatus createUpdateReplicationSentStatus() {
        return new UpdateReplicationSentStatus();
    }

    /**
     * Create an instance of {@link ArrayOfPostDeliveryItem }
     * 
     */
    public ArrayOfPostDeliveryItem createArrayOfPostDeliveryItem() {
        return new ArrayOfPostDeliveryItem();
    }

    /**
     * Create an instance of {@link ArrayOfPurchaseOrderDetail }
     * 
     */
    public ArrayOfPurchaseOrderDetail createArrayOfPurchaseOrderDetail() {
        return new ArrayOfPurchaseOrderDetail();
    }

    /**
     * Create an instance of {@link GetBarCodeResolution }
     * 
     */
    public GetBarCodeResolution createGetBarCodeResolution() {
        return new GetBarCodeResolution();
    }

    /**
     * Create an instance of {@link SaveManufacturerResponse }
     * 
     */
    public SaveManufacturerResponse createSaveManufacturerResponse() {
        return new SaveManufacturerResponse();
    }

    /**
     * Create an instance of {@link GetReplicationStatusResponse }
     * 
     */
    public GetReplicationStatusResponse createGetReplicationStatusResponse() {
        return new GetReplicationStatusResponse();
    }

    /**
     * Create an instance of {@link ProductSurcharge }
     * 
     */
    public ProductSurcharge createProductSurcharge() {
        return new ProductSurcharge();
    }

    /**
     * Create an instance of {@link IntegrationQueue }
     * 
     */
    public IntegrationQueue createIntegrationQueue() {
        return new IntegrationQueue();
    }

    /**
     * Create an instance of {@link SaveVendorGroupListResponse }
     * 
     */
    public SaveVendorGroupListResponse createSaveVendorGroupListResponse() {
        return new SaveVendorGroupListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfVendorGroup }
     * 
     */
    public ArrayOfVendorGroup createArrayOfVendorGroup() {
        return new ArrayOfVendorGroup();
    }

    /**
     * Create an instance of {@link SaveAttributeResponse }
     * 
     */
    public SaveAttributeResponse createSaveAttributeResponse() {
        return new SaveAttributeResponse();
    }

    /**
     * Create an instance of {@link GetAccountsReceivable }
     * 
     */
    public GetAccountsReceivable createGetAccountsReceivable() {
        return new GetAccountsReceivable();
    }

    /**
     * Create an instance of {@link GetAllStates }
     * 
     */
    public GetAllStates createGetAllStates() {
        return new GetAllStates();
    }

    /**
     * Create an instance of {@link SaveAccountsReceivableList }
     * 
     */
    public SaveAccountsReceivableList createSaveAccountsReceivableList() {
        return new SaveAccountsReceivableList();
    }

    /**
     * Create an instance of {@link SaveUOMListResponse }
     * 
     */
    public SaveUOMListResponse createSaveUOMListResponse() {
        return new SaveUOMListResponse();
    }

    /**
     * Create an instance of {@link DeleteSerialResponse }
     * 
     */
    public DeleteSerialResponse createDeleteSerialResponse() {
        return new DeleteSerialResponse();
    }

    /**
     * Create an instance of {@link SaveStoreListResponse }
     * 
     */
    public SaveStoreListResponse createSaveStoreListResponse() {
        return new SaveStoreListResponse();
    }

    /**
     * Create an instance of {@link PromotionExcludedItem }
     * 
     */
    public PromotionExcludedItem createPromotionExcludedItem() {
        return new PromotionExcludedItem();
    }

    /**
     * Create an instance of {@link ArrayOfUserFields }
     * 
     */
    public ArrayOfUserFields createArrayOfUserFields() {
        return new ArrayOfUserFields();
    }

    /**
     * Create an instance of {@link SaveGoodsReceiptPO }
     * 
     */
    public SaveGoodsReceiptPO createSaveGoodsReceiptPO() {
        return new SaveGoodsReceiptPO();
    }

    /**
     * Create an instance of {@link CheckAPIConnectionResponse }
     * 
     */
    public CheckAPIConnectionResponse createCheckAPIConnectionResponse() {
        return new CheckAPIConnectionResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCustomerCatalogDetail }
     * 
     */
    public ArrayOfCustomerCatalogDetail createArrayOfCustomerCatalogDetail() {
        return new ArrayOfCustomerCatalogDetail();
    }

    /**
     * Create an instance of {@link GetState }
     * 
     */
    public GetState createGetState() {
        return new GetState();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialPricingDate }
     * 
     */
    public ArrayOfSpecialPricingDate createArrayOfSpecialPricingDate() {
        return new ArrayOfSpecialPricingDate();
    }

    /**
     * Create an instance of {@link RemoveAlternateUPC }
     * 
     */
    public RemoveAlternateUPC createRemoveAlternateUPC() {
        return new RemoveAlternateUPC();
    }

    /**
     * Create an instance of {@link DeleteBarCodeMaskResponse }
     * 
     */
    public DeleteBarCodeMaskResponse createDeleteBarCodeMaskResponse() {
        return new DeleteBarCodeMaskResponse();
    }

    /**
     * Create an instance of {@link SaveTransaction }
     * 
     */
    public SaveTransaction createSaveTransaction() {
        return new SaveTransaction();
    }

    /**
     * Create an instance of {@link XGetGiftCertificateBalance }
     * 
     */
    public XGetGiftCertificateBalance createXGetGiftCertificateBalance() {
        return new XGetGiftCertificateBalance();
    }

    /**
     * Create an instance of {@link PromotionApplicabilityDetail }
     * 
     */
    public PromotionApplicabilityDetail createPromotionApplicabilityDetail() {
        return new PromotionApplicabilityDetail();
    }

    /**
     * Create an instance of {@link UpdateReplicationSentStatusResponse }
     * 
     */
    public UpdateReplicationSentStatusResponse createUpdateReplicationSentStatusResponse() {
        return new UpdateReplicationSentStatusResponse();
    }

    /**
     * Create an instance of {@link LoyaltyPrePrintedCards }
     * 
     */
    public LoyaltyPrePrintedCards createLoyaltyPrePrintedCards() {
        return new LoyaltyPrePrintedCards();
    }

    /**
     * Create an instance of {@link SaveSpecialPriceListResponse }
     * 
     */
    public SaveSpecialPriceListResponse createSaveSpecialPriceListResponse() {
        return new SaveSpecialPriceListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFulfillmentPlanSurcharge }
     * 
     */
    public ArrayOfFulfillmentPlanSurcharge createArrayOfFulfillmentPlanSurcharge() {
        return new ArrayOfFulfillmentPlanSurcharge();
    }

    /**
     * Create an instance of {@link DeleteGiftCertificateMasterResponse }
     * 
     */
    public DeleteGiftCertificateMasterResponse createDeleteGiftCertificateMasterResponse() {
        return new DeleteGiftCertificateMasterResponse();
    }

    /**
     * Create an instance of {@link ReplicationSendDump }
     * 
     */
    public ReplicationSendDump createReplicationSendDump() {
        return new ReplicationSendDump();
    }

    /**
     * Create an instance of {@link DeleteAttribute }
     * 
     */
    public DeleteAttribute createDeleteAttribute() {
        return new DeleteAttribute();
    }

    /**
     * Create an instance of {@link GetTransactionData }
     * 
     */
    public GetTransactionData createGetTransactionData() {
        return new GetTransactionData();
    }

    /**
     * Create an instance of {@link GetAccountsReceivableResponse }
     * 
     */
    public GetAccountsReceivableResponse createGetAccountsReceivableResponse() {
        return new GetAccountsReceivableResponse();
    }

    /**
     * Create an instance of {@link GetSerial }
     * 
     */
    public GetSerial createGetSerial() {
        return new GetSerial();
    }

    /**
     * Create an instance of {@link SaveVendorGroupList }
     * 
     */
    public SaveVendorGroupList createSaveVendorGroupList() {
        return new SaveVendorGroupList();
    }

    /**
     * Create an instance of {@link GetPromotionBonusBuys }
     * 
     */
    public GetPromotionBonusBuys createGetPromotionBonusBuys() {
        return new GetPromotionBonusBuys();
    }

    /**
     * Create an instance of {@link SavePriceListListResponse }
     * 
     */
    public SavePriceListListResponse createSavePriceListListResponse() {
        return new SavePriceListListResponse();
    }

    /**
     * Create an instance of {@link SaveVendor }
     * 
     */
    public SaveVendor createSaveVendor() {
        return new SaveVendor();
    }

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link SaveProductSurcharges }
     * 
     */
    public SaveProductSurcharges createSaveProductSurcharges() {
        return new SaveProductSurcharges();
    }

    /**
     * Create an instance of {@link SaveTransactionResponse }
     * 
     */
    public SaveTransactionResponse createSaveTransactionResponse() {
        return new SaveTransactionResponse();
    }

    /**
     * Create an instance of {@link RetailProfile }
     * 
     */
    public RetailProfile createRetailProfile() {
        return new RetailProfile();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link PromotionProductDetail }
     * 
     */
    public PromotionProductDetail createPromotionProductDetail() {
        return new PromotionProductDetail();
    }

    /**
     * Create an instance of {@link GetNextNumberResponse }
     * 
     */
    public GetNextNumberResponse createGetNextNumberResponse() {
        return new GetNextNumberResponse();
    }

    /**
     * Create an instance of {@link GetQueueOfEnterprise }
     * 
     */
    public GetQueueOfEnterprise createGetQueueOfEnterprise() {
        return new GetQueueOfEnterprise();
    }

    /**
     * Create an instance of {@link XSearchTransactionResponse.XSearchTransactionResult }
     * 
     */
    public XSearchTransactionResponse.XSearchTransactionResult createXSearchTransactionResponseXSearchTransactionResult() {
        return new XSearchTransactionResponse.XSearchTransactionResult();
    }

    /**
     * Create an instance of {@link ArrayOfCurrency }
     * 
     */
    public ArrayOfCurrency createArrayOfCurrency() {
        return new ArrayOfCurrency();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsIssueSerialDetail }
     * 
     */
    public ArrayOfGoodsIssueSerialDetail createArrayOfGoodsIssueSerialDetail() {
        return new ArrayOfGoodsIssueSerialDetail();
    }

    /**
     * Create an instance of {@link CancelQuotation }
     * 
     */
    public CancelQuotation createCancelQuotation() {
        return new CancelQuotation();
    }

    /**
     * Create an instance of {@link SaveAlternateItems }
     * 
     */
    public SaveAlternateItems createSaveAlternateItems() {
        return new SaveAlternateItems();
    }

    /**
     * Create an instance of {@link XGetInventoryOfProductResponse }
     * 
     */
    public XGetInventoryOfProductResponse createXGetInventoryOfProductResponse() {
        return new XGetInventoryOfProductResponse();
    }

    /**
     * Create an instance of {@link CheckAPIConnection }
     * 
     */
    public CheckAPIConnection createCheckAPIConnection() {
        return new CheckAPIConnection();
    }

    /**
     * Create an instance of {@link ArrayOfStockTransferDetail }
     * 
     */
    public ArrayOfStockTransferDetail createArrayOfStockTransferDetail() {
        return new ArrayOfStockTransferDetail();
    }

    /**
     * Create an instance of {@link DeleteGiftCertificateMaster }
     * 
     */
    public DeleteGiftCertificateMaster createDeleteGiftCertificateMaster() {
        return new DeleteGiftCertificateMaster();
    }

    /**
     * Create an instance of {@link SaveCustomerGroupList }
     * 
     */
    public SaveCustomerGroupList createSaveCustomerGroupList() {
        return new SaveCustomerGroupList();
    }

    /**
     * Create an instance of {@link XGetInventoryOfProduct }
     * 
     */
    public XGetInventoryOfProduct createXGetInventoryOfProduct() {
        return new XGetInventoryOfProduct();
    }

    /**
     * Create an instance of {@link SetFinalInventoryResponse }
     * 
     */
    public SetFinalInventoryResponse createSetFinalInventoryResponse() {
        return new SetFinalInventoryResponse();
    }

    /**
     * Create an instance of {@link GetBarCodeMaskResponse }
     * 
     */
    public GetBarCodeMaskResponse createGetBarCodeMaskResponse() {
        return new GetBarCodeMaskResponse();
    }

    /**
     * Create an instance of {@link SavePriceListList }
     * 
     */
    public SavePriceListList createSavePriceListList() {
        return new SavePriceListList();
    }

    /**
     * Create an instance of {@link CustomerCatalogDetail }
     * 
     */
    public CustomerCatalogDetail createCustomerCatalogDetail() {
        return new CustomerCatalogDetail();
    }

    /**
     * Create an instance of {@link SaveTaxCodeConditionResponse }
     * 
     */
    public SaveTaxCodeConditionResponse createSaveTaxCodeConditionResponse() {
        return new SaveTaxCodeConditionResponse();
    }

    /**
     * Create an instance of {@link TaxCodeCondition }
     * 
     */
    public TaxCodeCondition createTaxCodeCondition() {
        return new TaxCodeCondition();
    }

    /**
     * Create an instance of {@link InventoryUpdateSerial }
     * 
     */
    public InventoryUpdateSerial createInventoryUpdateSerial() {
        return new InventoryUpdateSerial();
    }

    /**
     * Create an instance of {@link GetRegistrationMethodResponse }
     * 
     */
    public GetRegistrationMethodResponse createGetRegistrationMethodResponse() {
        return new GetRegistrationMethodResponse();
    }

    /**
     * Create an instance of {@link SaveGoodsReceipt }
     * 
     */
    public SaveGoodsReceipt createSaveGoodsReceipt() {
        return new SaveGoodsReceipt();
    }

    /**
     * Create an instance of {@link GetDeliveryPackageByKey }
     * 
     */
    public GetDeliveryPackageByKey createGetDeliveryPackageByKey() {
        return new GetDeliveryPackageByKey();
    }

    /**
     * Create an instance of {@link SaveShippingTypeResponse }
     * 
     */
    public SaveShippingTypeResponse createSaveShippingTypeResponse() {
        return new SaveShippingTypeResponse();
    }

    /**
     * Create an instance of {@link DeleteUOMGroupResponse }
     * 
     */
    public DeleteUOMGroupResponse createDeleteUOMGroupResponse() {
        return new DeleteUOMGroupResponse();
    }

    /**
     * Create an instance of {@link StockTransferSerialDetail }
     * 
     */
    public StockTransferSerialDetail createStockTransferSerialDetail() {
        return new StockTransferSerialDetail();
    }

    /**
     * Create an instance of {@link SaveProductGroupResponse }
     * 
     */
    public SaveProductGroupResponse createSaveProductGroupResponse() {
        return new SaveProductGroupResponse();
    }

    /**
     * Create an instance of {@link StockTransferDetail }
     * 
     */
    public StockTransferDetail createStockTransferDetail() {
        return new StockTransferDetail();
    }

    /**
     * Create an instance of {@link PriceMatrix }
     * 
     */
    public PriceMatrix createPriceMatrix() {
        return new PriceMatrix();
    }

    /**
     * Create an instance of {@link GetLineAttribute }
     * 
     */
    public GetLineAttribute createGetLineAttribute() {
        return new GetLineAttribute();
    }

    /**
     * Create an instance of {@link SaveCustomer }
     * 
     */
    public SaveCustomer createSaveCustomer() {
        return new SaveCustomer();
    }

    /**
     * Create an instance of {@link SaveCustomerCatalog }
     * 
     */
    public SaveCustomerCatalog createSaveCustomerCatalog() {
        return new SaveCustomerCatalog();
    }

    /**
     * Create an instance of {@link XGetDeltaQueue }
     * 
     */
    public XGetDeltaQueue createXGetDeltaQueue() {
        return new XGetDeltaQueue();
    }

    /**
     * Create an instance of {@link DeleteCoupon }
     * 
     */
    public DeleteCoupon createDeleteCoupon() {
        return new DeleteCoupon();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link DeleteTaxCodeConditionList }
     * 
     */
    public DeleteTaxCodeConditionList createDeleteTaxCodeConditionList() {
        return new DeleteTaxCodeConditionList();
    }

    /**
     * Create an instance of {@link ArrayOfPromotionGet }
     * 
     */
    public ArrayOfPromotionGet createArrayOfPromotionGet() {
        return new ArrayOfPromotionGet();
    }

    /**
     * Create an instance of {@link ProductCost }
     * 
     */
    public ProductCost createProductCost() {
        return new ProductCost();
    }

    /**
     * Create an instance of {@link SaveInventoryCounting }
     * 
     */
    public SaveInventoryCounting createSaveInventoryCounting() {
        return new SaveInventoryCounting();
    }

    /**
     * Create an instance of {@link SaveDumpListResponse }
     * 
     */
    public SaveDumpListResponse createSaveDumpListResponse() {
        return new SaveDumpListResponse();
    }

    /**
     * Create an instance of {@link RemoveProductSurchargesResponse }
     * 
     */
    public RemoveProductSurchargesResponse createRemoveProductSurchargesResponse() {
        return new RemoveProductSurchargesResponse();
    }

    /**
     * Create an instance of {@link GetCurrency }
     * 
     */
    public GetCurrency createGetCurrency() {
        return new GetCurrency();
    }

    /**
     * Create an instance of {@link GetAllStoresResponse }
     * 
     */
    public GetAllStoresResponse createGetAllStoresResponse() {
        return new GetAllStoresResponse();
    }

    /**
     * Create an instance of {@link GoodsReturnBatchDetail }
     * 
     */
    public GoodsReturnBatchDetail createGoodsReturnBatchDetail() {
        return new GoodsReturnBatchDetail();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReceiptBatchDetail }
     * 
     */
    public ArrayOfGoodsReceiptBatchDetail createArrayOfGoodsReceiptBatchDetail() {
        return new ArrayOfGoodsReceiptBatchDetail();
    }

    /**
     * Create an instance of {@link SaveBarCodeMaskListResponse }
     * 
     */
    public SaveBarCodeMaskListResponse createSaveBarCodeMaskListResponse() {
        return new SaveBarCodeMaskListResponse();
    }

    /**
     * Create an instance of {@link UPCTranslation }
     * 
     */
    public UPCTranslation createUPCTranslation() {
        return new UPCTranslation();
    }

    /**
     * Create an instance of {@link ProductCategory }
     * 
     */
    public ProductCategory createProductCategory() {
        return new ProductCategory();
    }

    /**
     * Create an instance of {@link SpecialPricingQuantity }
     * 
     */
    public SpecialPricingQuantity createSpecialPricingQuantity() {
        return new SpecialPricingQuantity();
    }

    /**
     * Create an instance of {@link SaveVendorProductMapping }
     * 
     */
    public SaveVendorProductMapping createSaveVendorProductMapping() {
        return new SaveVendorProductMapping();
    }

    /**
     * Create an instance of {@link ArrayOfVendorProductMapping }
     * 
     */
    public ArrayOfVendorProductMapping createArrayOfVendorProductMapping() {
        return new ArrayOfVendorProductMapping();
    }

    /**
     * Create an instance of {@link SaveInventoryUpdates }
     * 
     */
    public SaveInventoryUpdates createSaveInventoryUpdates() {
        return new SaveInventoryUpdates();
    }

    /**
     * Create an instance of {@link XGetExchangeRate }
     * 
     */
    public XGetExchangeRate createXGetExchangeRate() {
        return new XGetExchangeRate();
    }

    /**
     * Create an instance of {@link XGetPointsSummary }
     * 
     */
    public XGetPointsSummary createXGetPointsSummary() {
        return new XGetPointsSummary();
    }

    /**
     * Create an instance of {@link SaveCountry }
     * 
     */
    public SaveCountry createSaveCountry() {
        return new SaveCountry();
    }

    /**
     * Create an instance of {@link APIException }
     * 
     */
    public APIException createAPIException() {
        return new APIException();
    }

    /**
     * Create an instance of {@link PromotionDaysApplicability }
     * 
     */
    public PromotionDaysApplicability createPromotionDaysApplicability() {
        return new PromotionDaysApplicability();
    }

    /**
     * Create an instance of {@link SaveWarehouseListResponse }
     * 
     */
    public SaveWarehouseListResponse createSaveWarehouseListResponse() {
        return new SaveWarehouseListResponse();
    }

    /**
     * Create an instance of {@link SaveShippingTypeListResponse }
     * 
     */
    public SaveShippingTypeListResponse createSaveShippingTypeListResponse() {
        return new SaveShippingTypeListResponse();
    }

    /**
     * Create an instance of {@link ARPaymentItem }
     * 
     */
    public ARPaymentItem createARPaymentItem() {
        return new ARPaymentItem();
    }

    /**
     * Create an instance of {@link RegisterLoyaltyCustomer }
     * 
     */
    public RegisterLoyaltyCustomer createRegisterLoyaltyCustomer() {
        return new RegisterLoyaltyCustomer();
    }

    /**
     * Create an instance of {@link SaveGiftCertificateMasterList }
     * 
     */
    public SaveGiftCertificateMasterList createSaveGiftCertificateMasterList() {
        return new SaveGiftCertificateMasterList();
    }

    /**
     * Create an instance of {@link XGetExchangeRateResponse }
     * 
     */
    public XGetExchangeRateResponse createXGetExchangeRateResponse() {
        return new XGetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link GetVendorResponse }
     * 
     */
    public GetVendorResponse createGetVendorResponse() {
        return new GetVendorResponse();
    }

    /**
     * Create an instance of {@link ProductMerchandiseHierarchyDetail }
     * 
     */
    public ProductMerchandiseHierarchyDetail createProductMerchandiseHierarchyDetail() {
        return new ProductMerchandiseHierarchyDetail();
    }

    /**
     * Create an instance of {@link GoodsReturnSerialDetail }
     * 
     */
    public GoodsReturnSerialDetail createGoodsReturnSerialDetail() {
        return new GoodsReturnSerialDetail();
    }

    /**
     * Create an instance of {@link SaveGoodsIssueListResponse }
     * 
     */
    public SaveGoodsIssueListResponse createSaveGoodsIssueListResponse() {
        return new SaveGoodsIssueListResponse();
    }

    /**
     * Create an instance of {@link GetUOM }
     * 
     */
    public GetUOM createGetUOM() {
        return new GetUOM();
    }

    /**
     * Create an instance of {@link UpdateMasterObject }
     * 
     */
    public UpdateMasterObject createUpdateMasterObject() {
        return new UpdateMasterObject();
    }

    /**
     * Create an instance of {@link GetInventoryOfProductResponse }
     * 
     */
    public GetInventoryOfProductResponse createGetInventoryOfProductResponse() {
        return new GetInventoryOfProductResponse();
    }

    /**
     * Create an instance of {@link GetCouponResponse }
     * 
     */
    public GetCouponResponse createGetCouponResponse() {
        return new GetCouponResponse();
    }

    /**
     * Create an instance of {@link SaveWarehouseResponse }
     * 
     */
    public SaveWarehouseResponse createSaveWarehouseResponse() {
        return new SaveWarehouseResponse();
    }

    /**
     * Create an instance of {@link Warehouse }
     * 
     */
    public Warehouse createWarehouse() {
        return new Warehouse();
    }

    /**
     * Create an instance of {@link SaveGoodsReceiptPOList }
     * 
     */
    public SaveGoodsReceiptPOList createSaveGoodsReceiptPOList() {
        return new SaveGoodsReceiptPOList();
    }

    /**
     * Create an instance of {@link SaveStateResponse }
     * 
     */
    public SaveStateResponse createSaveStateResponse() {
        return new SaveStateResponse();
    }

    /**
     * Create an instance of {@link GetExchangeRateByCurrencyAndDate }
     * 
     */
    public GetExchangeRateByCurrencyAndDate createGetExchangeRateByCurrencyAndDate() {
        return new GetExchangeRateByCurrencyAndDate();
    }

    /**
     * Create an instance of {@link CustomerGroupDiscount }
     * 
     */
    public CustomerGroupDiscount createCustomerGroupDiscount() {
        return new CustomerGroupDiscount();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReceiptSerialDetail }
     * 
     */
    public ArrayOfGoodsReceiptSerialDetail createArrayOfGoodsReceiptSerialDetail() {
        return new ArrayOfGoodsReceiptSerialDetail();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReturnSerialDetail }
     * 
     */
    public ArrayOfGoodsReturnSerialDetail createArrayOfGoodsReturnSerialDetail() {
        return new ArrayOfGoodsReturnSerialDetail();
    }

    /**
     * Create an instance of {@link SaveUOMGroup }
     * 
     */
    public SaveUOMGroup createSaveUOMGroup() {
        return new SaveUOMGroup();
    }

    /**
     * Create an instance of {@link ProductImage }
     * 
     */
    public ProductImage createProductImage() {
        return new ProductImage();
    }

    /**
     * Create an instance of {@link PaymentResponse }
     * 
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }

    /**
     * Create an instance of {@link SaveAttribute }
     * 
     */
    public SaveAttribute createSaveAttribute() {
        return new SaveAttribute();
    }

    /**
     * Create an instance of {@link SaveProductResponse }
     * 
     */
    public SaveProductResponse createSaveProductResponse() {
        return new SaveProductResponse();
    }

    /**
     * Create an instance of {@link SaveCurrencyList }
     * 
     */
    public SaveCurrencyList createSaveCurrencyList() {
        return new SaveCurrencyList();
    }

    /**
     * Create an instance of {@link ArrayOfPromotionApplicabilityDetail }
     * 
     */
    public ArrayOfPromotionApplicabilityDetail createArrayOfPromotionApplicabilityDetail() {
        return new ArrayOfPromotionApplicabilityDetail();
    }

    /**
     * Create an instance of {@link SavePurchaseOrderResponse }
     * 
     */
    public SavePurchaseOrderResponse createSavePurchaseOrderResponse() {
        return new SavePurchaseOrderResponse();
    }

    /**
     * Create an instance of {@link SaveAttributeListResponse }
     * 
     */
    public SaveAttributeListResponse createSaveAttributeListResponse() {
        return new SaveAttributeListResponse();
    }

    /**
     * Create an instance of {@link DeleteShippingTypeResponse }
     * 
     */
    public DeleteShippingTypeResponse createDeleteShippingTypeResponse() {
        return new DeleteShippingTypeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLayawayPlanSurcharge }
     * 
     */
    public ArrayOfLayawayPlanSurcharge createArrayOfLayawayPlanSurcharge() {
        return new ArrayOfLayawayPlanSurcharge();
    }

    /**
     * Create an instance of {@link GetLoyaltyLicenceDetails }
     * 
     */
    public GetLoyaltyLicenceDetails createGetLoyaltyLicenceDetails() {
        return new GetLoyaltyLicenceDetails();
    }

    /**
     * Create an instance of {@link SaveProductGroupDiscountList }
     * 
     */
    public SaveProductGroupDiscountList createSaveProductGroupDiscountList() {
        return new SaveProductGroupDiscountList();
    }

    /**
     * Create an instance of {@link ClearAllInventory }
     * 
     */
    public ClearAllInventory createClearAllInventory() {
        return new ClearAllInventory();
    }

    /**
     * Create an instance of {@link ValidateUserWithDeviceId }
     * 
     */
    public ValidateUserWithDeviceId createValidateUserWithDeviceId() {
        return new ValidateUserWithDeviceId();
    }

    /**
     * Create an instance of {@link SaveTaxCodeListResponse }
     * 
     */
    public SaveTaxCodeListResponse createSaveTaxCodeListResponse() {
        return new SaveTaxCodeListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTaxCode }
     * 
     */
    public ArrayOfTaxCode createArrayOfTaxCode() {
        return new ArrayOfTaxCode();
    }

    /**
     * Create an instance of {@link SaveCoupon }
     * 
     */
    public SaveCoupon createSaveCoupon() {
        return new SaveCoupon();
    }

    /**
     * Create an instance of {@link XUpdateLoyaltyCustomerResponse }
     * 
     */
    public XUpdateLoyaltyCustomerResponse createXUpdateLoyaltyCustomerResponse() {
        return new XUpdateLoyaltyCustomerResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTransactionSalesPerson }
     * 
     */
    public ArrayOfTransactionSalesPerson createArrayOfTransactionSalesPerson() {
        return new ArrayOfTransactionSalesPerson();
    }

    /**
     * Create an instance of {@link InventoryUpdate }
     * 
     */
    public InventoryUpdate createInventoryUpdate() {
        return new InventoryUpdate();
    }

    /**
     * Create an instance of {@link SaveSerial }
     * 
     */
    public SaveSerial createSaveSerial() {
        return new SaveSerial();
    }

    /**
     * Create an instance of {@link GetExchangeRateByDateResponse }
     * 
     */
    public GetExchangeRateByDateResponse createGetExchangeRateByDateResponse() {
        return new GetExchangeRateByDateResponse();
    }

    /**
     * Create an instance of {@link SavePurchaseOrder }
     * 
     */
    public SavePurchaseOrder createSavePurchaseOrder() {
        return new SavePurchaseOrder();
    }

    /**
     * Create an instance of {@link SaveCountryListResponse }
     * 
     */
    public SaveCountryListResponse createSaveCountryListResponse() {
        return new SaveCountryListResponse();
    }

    /**
     * Create an instance of {@link GetPaymentType }
     * 
     */
    public GetPaymentType createGetPaymentType() {
        return new GetPaymentType();
    }

    /**
     * Create an instance of {@link ClearAllInventoryResponse }
     * 
     */
    public ClearAllInventoryResponse createClearAllInventoryResponse() {
        return new ClearAllInventoryResponse();
    }

    /**
     * Create an instance of {@link GetTaxCodeResponse }
     * 
     */
    public GetTaxCodeResponse createGetTaxCodeResponse() {
        return new GetTaxCodeResponse();
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link ArrayOfTransactionSurcharge }
     * 
     */
    public ArrayOfTransactionSurcharge createArrayOfTransactionSurcharge() {
        return new ArrayOfTransactionSurcharge();
    }

    /**
     * Create an instance of {@link SaveAccountsReceivableResponse }
     * 
     */
    public SaveAccountsReceivableResponse createSaveAccountsReceivableResponse() {
        return new SaveAccountsReceivableResponse();
    }

    /**
     * Create an instance of {@link SaveGoodsReturnResponse }
     * 
     */
    public SaveGoodsReturnResponse createSaveGoodsReturnResponse() {
        return new SaveGoodsReturnResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTransactionItem }
     * 
     */
    public ArrayOfTransactionItem createArrayOfTransactionItem() {
        return new ArrayOfTransactionItem();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryUpdateSerial }
     * 
     */
    public ArrayOfInventoryUpdateSerial createArrayOfInventoryUpdateSerial() {
        return new ArrayOfInventoryUpdateSerial();
    }

    /**
     * Create an instance of {@link POS }
     * 
     */
    public POS createPOS() {
        return new POS();
    }

    /**
     * Create an instance of {@link AwardPointsResponse }
     * 
     */
    public AwardPointsResponse createAwardPointsResponse() {
        return new AwardPointsResponse();
    }

    /**
     * Create an instance of {@link AwardPoints }
     * 
     */
    public AwardPoints createAwardPoints() {
        return new AwardPoints();
    }

    /**
     * Create an instance of {@link GetAllCountriesResponse }
     * 
     */
    public GetAllCountriesResponse createGetAllCountriesResponse() {
        return new GetAllCountriesResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link DeleteCurrencyResponse }
     * 
     */
    public DeleteCurrencyResponse createDeleteCurrencyResponse() {
        return new DeleteCurrencyResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReceiptDetail }
     * 
     */
    public ArrayOfGoodsReceiptDetail createArrayOfGoodsReceiptDetail() {
        return new ArrayOfGoodsReceiptDetail();
    }

    /**
     * Create an instance of {@link CancelSalesOrderResponse }
     * 
     */
    public CancelSalesOrderResponse createCancelSalesOrderResponse() {
        return new CancelSalesOrderResponse();
    }

    /**
     * Create an instance of {@link GetUpgradeInformationResponse.GetUpgradeInformationResult }
     * 
     */
    public GetUpgradeInformationResponse.GetUpgradeInformationResult createGetUpgradeInformationResponseGetUpgradeInformationResult() {
        return new GetUpgradeInformationResponse.GetUpgradeInformationResult();
    }

    /**
     * Create an instance of {@link SaveWarehouse }
     * 
     */
    public SaveWarehouse createSaveWarehouse() {
        return new SaveWarehouse();
    }

    /**
     * Create an instance of {@link GetSaleAttributeResponse }
     * 
     */
    public GetSaleAttributeResponse createGetSaleAttributeResponse() {
        return new GetSaleAttributeResponse();
    }

    /**
     * Create an instance of {@link SaleAttribute }
     * 
     */
    public SaleAttribute createSaleAttribute() {
        return new SaleAttribute();
    }

    /**
     * Create an instance of {@link DeleteCountryResponse }
     * 
     */
    public DeleteCountryResponse createDeleteCountryResponse() {
        return new DeleteCountryResponse();
    }

    /**
     * Create an instance of {@link PaymentTypeAttribute }
     * 
     */
    public PaymentTypeAttribute createPaymentTypeAttribute() {
        return new PaymentTypeAttribute();
    }

    /**
     * Create an instance of {@link ManufacturerGroupDiscount }
     * 
     */
    public ManufacturerGroupDiscount createManufacturerGroupDiscount() {
        return new ManufacturerGroupDiscount();
    }

    /**
     * Create an instance of {@link SaveCouponList }
     * 
     */
    public SaveCouponList createSaveCouponList() {
        return new SaveCouponList();
    }

    /**
     * Create an instance of {@link LayawayPlan }
     * 
     */
    public LayawayPlan createLayawayPlan() {
        return new LayawayPlan();
    }

    /**
     * Create an instance of {@link SaveCurrencyResponse }
     * 
     */
    public SaveCurrencyResponse createSaveCurrencyResponse() {
        return new SaveCurrencyResponse();
    }

    /**
     * Create an instance of {@link DeleteState }
     * 
     */
    public DeleteState createDeleteState() {
        return new DeleteState();
    }

    /**
     * Create an instance of {@link GetWarehouseResponse }
     * 
     */
    public GetWarehouseResponse createGetWarehouseResponse() {
        return new GetWarehouseResponse();
    }

    /**
     * Create an instance of {@link GetPointsSummaryResponse }
     * 
     */
    public GetPointsSummaryResponse createGetPointsSummaryResponse() {
        return new GetPointsSummaryResponse();
    }

    /**
     * Create an instance of {@link GetReplicationSendDumpResponse }
     * 
     */
    public GetReplicationSendDumpResponse createGetReplicationSendDumpResponse() {
        return new GetReplicationSendDumpResponse();
    }

    /**
     * Create an instance of {@link GetWarehouse }
     * 
     */
    public GetWarehouse createGetWarehouse() {
        return new GetWarehouse();
    }

    /**
     * Create an instance of {@link SaveAccountsReceivableListResponse }
     * 
     */
    public SaveAccountsReceivableListResponse createSaveAccountsReceivableListResponse() {
        return new SaveAccountsReceivableListResponse();
    }

    /**
     * Create an instance of {@link GetSerialResponse }
     * 
     */
    public GetSerialResponse createGetSerialResponse() {
        return new GetSerialResponse();
    }

    /**
     * Create an instance of {@link SaveStateList }
     * 
     */
    public SaveStateList createSaveStateList() {
        return new SaveStateList();
    }

    /**
     * Create an instance of {@link SaveAccountsReceivable }
     * 
     */
    public SaveAccountsReceivable createSaveAccountsReceivable() {
        return new SaveAccountsReceivable();
    }

    /**
     * Create an instance of {@link SaveUOMGroupList }
     * 
     */
    public SaveUOMGroupList createSaveUOMGroupList() {
        return new SaveUOMGroupList();
    }

    /**
     * Create an instance of {@link TransactionItem }
     * 
     */
    public TransactionItem createTransactionItem() {
        return new TransactionItem();
    }

    /**
     * Create an instance of {@link SavePriceMatrix }
     * 
     */
    public SavePriceMatrix createSavePriceMatrix() {
        return new SavePriceMatrix();
    }

    /**
     * Create an instance of {@link TaxPeriodDefination }
     * 
     */
    public TaxPeriodDefination createTaxPeriodDefination() {
        return new TaxPeriodDefination();
    }

    /**
     * Create an instance of {@link GetQueueWithoutStatusUpdateResponse }
     * 
     */
    public GetQueueWithoutStatusUpdateResponse createGetQueueWithoutStatusUpdateResponse() {
        return new GetQueueWithoutStatusUpdateResponse();
    }

    /**
     * Create an instance of {@link SaveCurrencyListResponse }
     * 
     */
    public SaveCurrencyListResponse createSaveCurrencyListResponse() {
        return new SaveCurrencyListResponse();
    }

    /**
     * Create an instance of {@link SaveDumpResponse }
     * 
     */
    public SaveDumpResponse createSaveDumpResponse() {
        return new SaveDumpResponse();
    }

    /**
     * Create an instance of {@link DeleteWarehouseResponse }
     * 
     */
    public DeleteWarehouseResponse createDeleteWarehouseResponse() {
        return new DeleteWarehouseResponse();
    }

    /**
     * Create an instance of {@link SaveTaxCodeCondition }
     * 
     */
    public SaveTaxCodeCondition createSaveTaxCodeCondition() {
        return new SaveTaxCodeCondition();
    }

    /**
     * Create an instance of {@link CustomTransactionInfoGrid }
     * 
     */
    public CustomTransactionInfoGrid createCustomTransactionInfoGrid() {
        return new CustomTransactionInfoGrid();
    }

    /**
     * Create an instance of {@link GetCardSetupMethod }
     * 
     */
    public GetCardSetupMethod createGetCardSetupMethod() {
        return new GetCardSetupMethod();
    }

    /**
     * Create an instance of {@link SaveBatchList }
     * 
     */
    public SaveBatchList createSaveBatchList() {
        return new SaveBatchList();
    }

    /**
     * Create an instance of {@link GetVendorGroup }
     * 
     */
    public GetVendorGroup createGetVendorGroup() {
        return new GetVendorGroup();
    }

    /**
     * Create an instance of {@link GetCurrencyResponse }
     * 
     */
    public GetCurrencyResponse createGetCurrencyResponse() {
        return new GetCurrencyResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStockTransferSerialDetail }
     * 
     */
    public ArrayOfStockTransferSerialDetail createArrayOfStockTransferSerialDetail() {
        return new ArrayOfStockTransferSerialDetail();
    }

    /**
     * Create an instance of {@link StockTransferRequisitionDetail }
     * 
     */
    public StockTransferRequisitionDetail createStockTransferRequisitionDetail() {
        return new StockTransferRequisitionDetail();
    }

    /**
     * Create an instance of {@link GetProductCostResponse }
     * 
     */
    public GetProductCostResponse createGetProductCostResponse() {
        return new GetProductCostResponse();
    }

    /**
     * Create an instance of {@link XGetTransactionResponse }
     * 
     */
    public XGetTransactionResponse createXGetTransactionResponse() {
        return new XGetTransactionResponse();
    }

    /**
     * Create an instance of {@link DeleteAttributeResponse }
     * 
     */
    public DeleteAttributeResponse createDeleteAttributeResponse() {
        return new DeleteAttributeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductMerchandiseHierarchyDetail }
     * 
     */
    public ArrayOfProductMerchandiseHierarchyDetail createArrayOfProductMerchandiseHierarchyDetail() {
        return new ArrayOfProductMerchandiseHierarchyDetail();
    }

    /**
     * Create an instance of {@link SaveInventoryCountingResponse }
     * 
     */
    public SaveInventoryCountingResponse createSaveInventoryCountingResponse() {
        return new SaveInventoryCountingResponse();
    }

    /**
     * Create an instance of {@link SaveCustomerList }
     * 
     */
    public SaveCustomerList createSaveCustomerList() {
        return new SaveCustomerList();
    }

    /**
     * Create an instance of {@link SaveProductListResponse }
     * 
     */
    public SaveProductListResponse createSaveProductListResponse() {
        return new SaveProductListResponse();
    }

    /**
     * Create an instance of {@link SaveVendorProductMappingResponse }
     * 
     */
    public SaveVendorProductMappingResponse createSaveVendorProductMappingResponse() {
        return new SaveVendorProductMappingResponse();
    }

    /**
     * Create an instance of {@link SaveUOMResponse }
     * 
     */
    public SaveUOMResponse createSaveUOMResponse() {
        return new SaveUOMResponse();
    }

    /**
     * Create an instance of {@link SearchTransaction }
     * 
     */
    public SearchTransaction createSearchTransaction() {
        return new SearchTransaction();
    }

    /**
     * Create an instance of {@link InventoryCountSerialDetail }
     * 
     */
    public InventoryCountSerialDetail createInventoryCountSerialDetail() {
        return new InventoryCountSerialDetail();
    }

    /**
     * Create an instance of {@link UpdateGiftCertificateBalanceResponse }
     * 
     */
    public UpdateGiftCertificateBalanceResponse createUpdateGiftCertificateBalanceResponse() {
        return new UpdateGiftCertificateBalanceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfContact }
     * 
     */
    public ArrayOfContact createArrayOfContact() {
        return new ArrayOfContact();
    }

    /**
     * Create an instance of {@link XAuthorizePaymentResponse }
     * 
     */
    public XAuthorizePaymentResponse createXAuthorizePaymentResponse() {
        return new XAuthorizePaymentResponse();
    }

    /**
     * Create an instance of {@link RemoveAlternateUPCResponse }
     * 
     */
    public RemoveAlternateUPCResponse createRemoveAlternateUPCResponse() {
        return new RemoveAlternateUPCResponse();
    }

    /**
     * Create an instance of {@link DeleteCurrency }
     * 
     */
    public DeleteCurrency createDeleteCurrency() {
        return new DeleteCurrency();
    }

    /**
     * Create an instance of {@link SaveSpecialPrice }
     * 
     */
    public SaveSpecialPrice createSaveSpecialPrice() {
        return new SaveSpecialPrice();
    }

    /**
     * Create an instance of {@link AuthorizePaymentResponse }
     * 
     */
    public AuthorizePaymentResponse createAuthorizePaymentResponse() {
        return new AuthorizePaymentResponse();
    }

    /**
     * Create an instance of {@link CancelSalesOrder }
     * 
     */
    public CancelSalesOrder createCancelSalesOrder() {
        return new CancelSalesOrder();
    }

    /**
     * Create an instance of {@link ArrayOfPurchaseOrderSurchargeDTO }
     * 
     */
    public ArrayOfPurchaseOrderSurchargeDTO createArrayOfPurchaseOrderSurchargeDTO() {
        return new ArrayOfPurchaseOrderSurchargeDTO();
    }

    /**
     * Create an instance of {@link DeleteWarehouse }
     * 
     */
    public DeleteWarehouse createDeleteWarehouse() {
        return new DeleteWarehouse();
    }

    /**
     * Create an instance of {@link SaveSerialList }
     * 
     */
    public SaveSerialList createSaveSerialList() {
        return new SaveSerialList();
    }

    /**
     * Create an instance of {@link ValidateLoyaltyPortalCustomerResponse }
     * 
     */
    public ValidateLoyaltyPortalCustomerResponse createValidateLoyaltyPortalCustomerResponse() {
        return new ValidateLoyaltyPortalCustomerResponse();
    }

    /**
     * Create an instance of {@link GetDeliveryPackageByIdResponse }
     * 
     */
    public GetDeliveryPackageByIdResponse createGetDeliveryPackageByIdResponse() {
        return new GetDeliveryPackageByIdResponse();
    }

    /**
     * Create an instance of {@link XPostFulfillment }
     * 
     */
    public XPostFulfillment createXPostFulfillment() {
        return new XPostFulfillment();
    }

    /**
     * Create an instance of {@link UpdateRecordsStatus }
     * 
     */
    public UpdateRecordsStatus createUpdateRecordsStatus() {
        return new UpdateRecordsStatus();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryCountDetail }
     * 
     */
    public ArrayOfInventoryCountDetail createArrayOfInventoryCountDetail() {
        return new ArrayOfInventoryCountDetail();
    }

    /**
     * Create an instance of {@link DeleteUOMResponse }
     * 
     */
    public DeleteUOMResponse createDeleteUOMResponse() {
        return new DeleteUOMResponse();
    }

    /**
     * Create an instance of {@link SaveBarCodeMaskResponse }
     * 
     */
    public SaveBarCodeMaskResponse createSaveBarCodeMaskResponse() {
        return new SaveBarCodeMaskResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTransactionPayment }
     * 
     */
    public ArrayOfTransactionPayment createArrayOfTransactionPayment() {
        return new ArrayOfTransactionPayment();
    }

    /**
     * Create an instance of {@link ArrayOfPromotionDaysApplicability }
     * 
     */
    public ArrayOfPromotionDaysApplicability createArrayOfPromotionDaysApplicability() {
        return new ArrayOfPromotionDaysApplicability();
    }

    /**
     * Create an instance of {@link GetBarCodeResolutionResponse }
     * 
     */
    public GetBarCodeResolutionResponse createGetBarCodeResolutionResponse() {
        return new GetBarCodeResolutionResponse();
    }

    /**
     * Create an instance of {@link PriceUOMMatrix }
     * 
     */
    public PriceUOMMatrix createPriceUOMMatrix() {
        return new PriceUOMMatrix();
    }

    /**
     * Create an instance of {@link SaveProductGroupListResponse }
     * 
     */
    public SaveProductGroupListResponse createSaveProductGroupListResponse() {
        return new SaveProductGroupListResponse();
    }

    /**
     * Create an instance of {@link XAuthorizePayment }
     * 
     */
    public XAuthorizePayment createXAuthorizePayment() {
        return new XAuthorizePayment();
    }

    /**
     * Create an instance of {@link GetMonthlyPointsSummaryResponse.GetMonthlyPointsSummaryResult }
     * 
     */
    public GetMonthlyPointsSummaryResponse.GetMonthlyPointsSummaryResult createGetMonthlyPointsSummaryResponseGetMonthlyPointsSummaryResult() {
        return new GetMonthlyPointsSummaryResponse.GetMonthlyPointsSummaryResult();
    }

    /**
     * Create an instance of {@link UserFields }
     * 
     */
    public UserFields createUserFields() {
        return new UserFields();
    }

    /**
     * Create an instance of {@link VendorProductMapping }
     * 
     */
    public VendorProductMapping createVendorProductMapping() {
        return new VendorProductMapping();
    }

    /**
     * Create an instance of {@link SaveWarehouseList }
     * 
     */
    public SaveWarehouseList createSaveWarehouseList() {
        return new SaveWarehouseList();
    }

    /**
     * Create an instance of {@link SaveDump }
     * 
     */
    public SaveDump createSaveDump() {
        return new SaveDump();
    }

    /**
     * Create an instance of {@link PostFulfillment }
     * 
     */
    public PostFulfillment createPostFulfillment() {
        return new PostFulfillment();
    }

    /**
     * Create an instance of {@link XPostFulfillmentResponse }
     * 
     */
    public XPostFulfillmentResponse createXPostFulfillmentResponse() {
        return new XPostFulfillmentResponse();
    }

    /**
     * Create an instance of {@link GetStateResponse }
     * 
     */
    public GetStateResponse createGetStateResponse() {
        return new GetStateResponse();
    }

    /**
     * Create an instance of {@link FulfillmentPlanSurcharge }
     * 
     */
    public FulfillmentPlanSurcharge createFulfillmentPlanSurcharge() {
        return new FulfillmentPlanSurcharge();
    }

    /**
     * Create an instance of {@link GetReplicationStatus }
     * 
     */
    public GetReplicationStatus createGetReplicationStatus() {
        return new GetReplicationStatus();
    }

    /**
     * Create an instance of {@link GetCardSetupMethodResponse }
     * 
     */
    public GetCardSetupMethodResponse createGetCardSetupMethodResponse() {
        return new GetCardSetupMethodResponse();
    }

    /**
     * Create an instance of {@link XGetDeltaQueueResponse }
     * 
     */
    public XGetDeltaQueueResponse createXGetDeltaQueueResponse() {
        return new XGetDeltaQueueResponse();
    }

    /**
     * Create an instance of {@link GetProductImageResponse }
     * 
     */
    public GetProductImageResponse createGetProductImageResponse() {
        return new GetProductImageResponse();
    }

    /**
     * Create an instance of {@link TransactionPrinting }
     * 
     */
    public TransactionPrinting createTransactionPrinting() {
        return new TransactionPrinting();
    }

    /**
     * Create an instance of {@link UpdateSynchronizationStatusResponse }
     * 
     */
    public UpdateSynchronizationStatusResponse createUpdateSynchronizationStatusResponse() {
        return new UpdateSynchronizationStatusResponse();
    }

    /**
     * Create an instance of {@link SaveStateListResponse }
     * 
     */
    public SaveStateListResponse createSaveStateListResponse() {
        return new SaveStateListResponse();
    }

    /**
     * Create an instance of {@link SaveTaxCodeList }
     * 
     */
    public SaveTaxCodeList createSaveTaxCodeList() {
        return new SaveTaxCodeList();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentTypeSurcharge }
     * 
     */
    public ArrayOfPaymentTypeSurcharge createArrayOfPaymentTypeSurcharge() {
        return new ArrayOfPaymentTypeSurcharge();
    }

    /**
     * Create an instance of {@link SavePromotionalBonusBuys }
     * 
     */
    public SavePromotionalBonusBuys createSavePromotionalBonusBuys() {
        return new SavePromotionalBonusBuys();
    }

    /**
     * Create an instance of {@link SavePurchaseOrderListResponse }
     * 
     */
    public SavePurchaseOrderListResponse createSavePurchaseOrderListResponse() {
        return new SavePurchaseOrderListResponse();
    }

    /**
     * Create an instance of {@link SaveProductGroup }
     * 
     */
    public SaveProductGroup createSaveProductGroup() {
        return new SaveProductGroup();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsIssueDetail }
     * 
     */
    public ArrayOfGoodsIssueDetail createArrayOfGoodsIssueDetail() {
        return new ArrayOfGoodsIssueDetail();
    }

    /**
     * Create an instance of {@link ArrayOfGoodsReturnDetail }
     * 
     */
    public ArrayOfGoodsReturnDetail createArrayOfGoodsReturnDetail() {
        return new ArrayOfGoodsReturnDetail();
    }

    /**
     * Create an instance of {@link SaveCurrency }
     * 
     */
    public SaveCurrency createSaveCurrency() {
        return new SaveCurrency();
    }

    /**
     * Create an instance of {@link SpecialPriceDiscountGroup }
     * 
     */
    public SpecialPriceDiscountGroup createSpecialPriceDiscountGroup() {
        return new SpecialPriceDiscountGroup();
    }

    /**
     * Create an instance of {@link GetAllDeliveryPackage }
     * 
     */
    public GetAllDeliveryPackage createGetAllDeliveryPackage() {
        return new GetAllDeliveryPackage();
    }

    /**
     * Create an instance of {@link GetPrePrintedLoyaltyCardsResponse }
     * 
     */
    public GetPrePrintedLoyaltyCardsResponse createGetPrePrintedLoyaltyCardsResponse() {
        return new GetPrePrintedLoyaltyCardsResponse();
    }

    /**
     * Create an instance of {@link GetRetailProfileResponse }
     * 
     */
    public GetRetailProfileResponse createGetRetailProfileResponse() {
        return new GetRetailProfileResponse();
    }

    /**
     * Create an instance of {@link GetProductGroup }
     * 
     */
    public GetProductGroup createGetProductGroup() {
        return new GetProductGroup();
    }

    /**
     * Create an instance of {@link ValidateUser }
     * 
     */
    public ValidateUser createValidateUser() {
        return new ValidateUser();
    }

    /**
     * Create an instance of {@link DeleteManufacturerResponse }
     * 
     */
    public DeleteManufacturerResponse createDeleteManufacturerResponse() {
        return new DeleteManufacturerResponse();
    }

    /**
     * Create an instance of {@link GetEmployee }
     * 
     */
    public GetEmployee createGetEmployee() {
        return new GetEmployee();
    }

    /**
     * Create an instance of {@link GetUOMGroup }
     * 
     */
    public GetUOMGroup createGetUOMGroup() {
        return new GetUOMGroup();
    }

    /**
     * Create an instance of {@link UserDefinedFieldsDetails }
     * 
     */
    public UserDefinedFieldsDetails createUserDefinedFieldsDetails() {
        return new UserDefinedFieldsDetails();
    }

    /**
     * Create an instance of {@link SaveGoodsReceiptList }
     * 
     */
    public SaveGoodsReceiptList createSaveGoodsReceiptList() {
        return new SaveGoodsReceiptList();
    }

    /**
     * Create an instance of {@link CurrencyDenomination }
     * 
     */
    public CurrencyDenomination createCurrencyDenomination() {
        return new CurrencyDenomination();
    }

    /**
     * Create an instance of {@link GetVendor }
     * 
     */
    public GetVendor createGetVendor() {
        return new GetVendor();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link GetAllSaleAttributeResponse }
     * 
     */
    public GetAllSaleAttributeResponse createGetAllSaleAttributeResponse() {
        return new GetAllSaleAttributeResponse();
    }

    /**
     * Create an instance of {@link GoodsReceiptPOSerialDetail }
     * 
     */
    public GoodsReceiptPOSerialDetail createGoodsReceiptPOSerialDetail() {
        return new GoodsReceiptPOSerialDetail();
    }

    /**
     * Create an instance of {@link GetUOMResponse }
     * 
     */
    public GetUOMResponse createGetUOMResponse() {
        return new GetUOMResponse();
    }

    /**
     * Create an instance of {@link GetPriceListResponse }
     * 
     */
    public GetPriceListResponse createGetPriceListResponse() {
        return new GetPriceListResponse();
    }

    /**
     * Create an instance of {@link SaveSurchargeResponse }
     * 
     */
    public SaveSurchargeResponse createSaveSurchargeResponse() {
        return new SaveSurchargeResponse();
    }

    /**
     * Create an instance of {@link SaveStockTransferList }
     * 
     */
    public SaveStockTransferList createSaveStockTransferList() {
        return new SaveStockTransferList();
    }

    /**
     * Create an instance of {@link StockTransferRequisition }
     * 
     */
    public StockTransferRequisition createStockTransferRequisition() {
        return new StockTransferRequisition();
    }

    /**
     * Create an instance of {@link SaveBarCodeMask }
     * 
     */
    public SaveBarCodeMask createSaveBarCodeMask() {
        return new SaveBarCodeMask();
    }

    /**
     * Create an instance of {@link GetAllStores }
     * 
     */
    public GetAllStores createGetAllStores() {
        return new GetAllStores();
    }

    /**
     * Create an instance of {@link SaveGoodsReturnList }
     * 
     */
    public SaveGoodsReturnList createSaveGoodsReturnList() {
        return new SaveGoodsReturnList();
    }

    /**
     * Create an instance of {@link SavePaymentType }
     * 
     */
    public SavePaymentType createSavePaymentType() {
        return new SavePaymentType();
    }

    /**
     * Create an instance of {@link DeleteShippingType }
     * 
     */
    public DeleteShippingType createDeleteShippingType() {
        return new DeleteShippingType();
    }

    /**
     * Create an instance of {@link SaveBatchListResponse }
     * 
     */
    public SaveBatchListResponse createSaveBatchListResponse() {
        return new SaveBatchListResponse();
    }

    /**
     * Create an instance of {@link SaveSpecialPriceList }
     * 
     */
    public SaveSpecialPriceList createSaveSpecialPriceList() {
        return new SaveSpecialPriceList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductGroupDiscount")
    public JAXBElement<ProductGroupDiscount> createProductGroupDiscount(ProductGroupDiscount value) {
        return new JAXBElement<ProductGroupDiscount>(_ProductGroupDiscount_QNAME, ProductGroupDiscount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExchangeRate")
    public JAXBElement<ExchangeRate> createExchangeRate(ExchangeRate value) {
        return new JAXBElement<ExchangeRate>(_ExchangeRate_QNAME, ExchangeRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfAttributeMaster")
    public JAXBElement<ArrayOfAttributeMaster> createArrayOfAttributeMaster(ArrayOfAttributeMaster value) {
        return new JAXBElement<ArrayOfAttributeMaster>(_ArrayOfAttributeMaster_QNAME, ArrayOfAttributeMaster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentType")
    public JAXBElement<PaymentType> createPaymentType(PaymentType value) {
        return new JAXBElement<PaymentType>(_PaymentType_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceMatrix")
    public JAXBElement<PriceMatrix> createPriceMatrix(PriceMatrix value) {
        return new JAXBElement<PriceMatrix>(_PriceMatrix_QNAME, PriceMatrix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductCost")
    public JAXBElement<ProductCost> createProductCost(ProductCost value) {
        return new JAXBElement<ProductCost>(_ProductCost_QNAME, ProductCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionGet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPromotionGet")
    public JAXBElement<ArrayOfPromotionGet> createArrayOfPromotionGet(ArrayOfPromotionGet value) {
        return new JAXBElement<ArrayOfPromotionGet>(_ArrayOfPromotionGet_QNAME, ArrayOfPromotionGet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCodeCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TaxCodeCondition")
    public JAXBElement<TaxCodeCondition> createTaxCodeCondition(TaxCodeCondition value) {
        return new JAXBElement<TaxCodeCondition>(_TaxCodeCondition_QNAME, TaxCodeCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerGroup")
    public JAXBElement<CustomerGroup> createCustomerGroup(CustomerGroup value) {
        return new JAXBElement<CustomerGroup>(_CustomerGroup_QNAME, CustomerGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceiptDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptDetail")
    public JAXBElement<GoodsReceiptDetail> createGoodsReceiptDetail(GoodsReceiptDetail value) {
        return new JAXBElement<GoodsReceiptDetail>(_GoodsReceiptDetail_QNAME, GoodsReceiptDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DiscountGroup")
    public JAXBElement<DiscountGroup> createDiscountGroup(DiscountGroup value) {
        return new JAXBElement<DiscountGroup>(_DiscountGroup_QNAME, DiscountGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryUpdateSerial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryUpdateSerial")
    public JAXBElement<InventoryUpdateSerial> createInventoryUpdateSerial(InventoryUpdateSerial value) {
        return new JAXBElement<InventoryUpdateSerial>(_InventoryUpdateSerial_QNAME, InventoryUpdateSerial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionSaleAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPostTransactionSaleAttribute")
    public JAXBElement<ArrayOfPostTransactionSaleAttribute> createArrayOfPostTransactionSaleAttribute(ArrayOfPostTransactionSaleAttribute value) {
        return new JAXBElement<ArrayOfPostTransactionSaleAttribute>(_ArrayOfPostTransactionSaleAttribute_QNAME, ArrayOfPostTransactionSaleAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTransferSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StockTransferSerialDetail")
    public JAXBElement<StockTransferSerialDetail> createStockTransferSerialDetail(StockTransferSerialDetail value) {
        return new JAXBElement<StockTransferSerialDetail>(_StockTransferSerialDetail_QNAME, StockTransferSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTransferDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StockTransferDetail")
    public JAXBElement<StockTransferDetail> createStockTransferDetail(StockTransferDetail value) {
        return new JAXBElement<StockTransferDetail>(_StockTransferDetail_QNAME, StockTransferDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionPayment")
    public JAXBElement<TransactionPayment> createTransactionPayment(TransactionPayment value) {
        return new JAXBElement<TransactionPayment>(_TransactionPayment_QNAME, TransactionPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ShippingType")
    public JAXBElement<ShippingType> createShippingType(ShippingType value) {
        return new JAXBElement<ShippingType>(_ShippingType_QNAME, ShippingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionServerParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionServerParameters")
    public JAXBElement<TransactionServerParameters> createTransactionServerParameters(TransactionServerParameters value) {
        return new JAXBElement<TransactionServerParameters>(_TransactionServerParameters_QNAME, TransactionServerParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockTransferDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfStockTransferDetail")
    public JAXBElement<ArrayOfStockTransferDetail> createArrayOfStockTransferDetail(ArrayOfStockTransferDetail value) {
        return new JAXBElement<ArrayOfStockTransferDetail>(_ArrayOfStockTransferDetail_QNAME, ArrayOfStockTransferDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedFieldsValidValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserDefinedFieldsValidValue")
    public JAXBElement<UserDefinedFieldsValidValue> createUserDefinedFieldsValidValue(UserDefinedFieldsValidValue value) {
        return new JAXBElement<UserDefinedFieldsValidValue>(_UserDefinedFieldsValidValue_QNAME, UserDefinedFieldsValidValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerCatalogDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerCatalogDetail")
    public JAXBElement<CustomerCatalogDetail> createCustomerCatalogDetail(CustomerCatalogDetail value) {
        return new JAXBElement<CustomerCatalogDetail>(_CustomerCatalogDetail_QNAME, CustomerCatalogDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfARPaymentItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfARPaymentItem")
    public JAXBElement<ArrayOfARPaymentItem> createArrayOfARPaymentItem(ArrayOfARPaymentItem value) {
        return new JAXBElement<ArrayOfARPaymentItem>(_ArrayOfARPaymentItem_QNAME, ArrayOfARPaymentItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfExchangeRate")
    public JAXBElement<ArrayOfExchangeRate> createArrayOfExchangeRate(ArrayOfExchangeRate value) {
        return new JAXBElement<ArrayOfExchangeRate>(_ArrayOfExchangeRate_QNAME, ArrayOfExchangeRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RetailProfile")
    public JAXBElement<RetailProfile> createRetailProfile(RetailProfile value) {
        return new JAXBElement<RetailProfile>(_RetailProfile_QNAME, RetailProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceipt")
    public JAXBElement<GoodsReceipt> createGoodsReceipt(GoodsReceipt value) {
        return new JAXBElement<GoodsReceipt>(_GoodsReceipt_QNAME, GoodsReceipt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoyaltyCardInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyCardInformation")
    public JAXBElement<LoyaltyCardInformation> createLoyaltyCardInformation(LoyaltyCardInformation value) {
        return new JAXBElement<LoyaltyCardInformation>(_LoyaltyCardInformation_QNAME, LoyaltyCardInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Attributes")
    public JAXBElement<Attributes> createAttributes(Attributes value) {
        return new JAXBElement<Attributes>(_Attributes_QNAME, Attributes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssueSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsIssueSerialDetail")
    public JAXBElement<ArrayOfGoodsIssueSerialDetail> createArrayOfGoodsIssueSerialDetail(ArrayOfGoodsIssueSerialDetail value) {
        return new JAXBElement<ArrayOfGoodsIssueSerialDetail>(_ArrayOfGoodsIssueSerialDetail_QNAME, ArrayOfGoodsIssueSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfCurrency")
    public JAXBElement<ArrayOfCurrency> createArrayOfCurrency(ArrayOfCurrency value) {
        return new JAXBElement<ArrayOfCurrency>(_ArrayOfCurrency_QNAME, ArrayOfCurrency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionProductDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionProductDetail")
    public JAXBElement<PromotionProductDetail> createPromotionProductDetail(PromotionProductDetail value) {
        return new JAXBElement<PromotionProductDetail>(_PromotionProductDetail_QNAME, PromotionProductDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "State")
    public JAXBElement<State> createState(State value) {
        return new JAXBElement<State>(_State_QNAME, State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentResponse")
    public JAXBElement<PaymentResponse> createPaymentResponse(PaymentResponse value) {
        return new JAXBElement<PaymentResponse>(_PaymentResponse_QNAME, PaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductImage")
    public JAXBElement<ProductImage> createProductImage(ProductImage value) {
        return new JAXBElement<ProductImage>(_ProductImage_QNAME, ProductImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTypeSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentTypeSurcharge")
    public JAXBElement<PaymentTypeSurcharge> createPaymentTypeSurcharge(PaymentTypeSurcharge value) {
        return new JAXBElement<PaymentTypeSurcharge>(_PaymentTypeSurcharge_QNAME, PaymentTypeSurcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Enterprise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Enterprise")
    public JAXBElement<Enterprise> createEnterprise(Enterprise value) {
        return new JAXBElement<Enterprise>(_Enterprise_QNAME, Enterprise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryCount")
    public JAXBElement<InventoryCount> createInventoryCount(InventoryCount value) {
        return new JAXBElement<InventoryCount>(_InventoryCount_QNAME, InventoryCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSerial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfSerial")
    public JAXBElement<ArrayOfSerial> createArrayOfSerial(ArrayOfSerial value) {
        return new JAXBElement<ArrayOfSerial>(_ArrayOfSerial_QNAME, ArrayOfSerial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBarCodeMaskDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfBarCodeMaskDetail")
    public JAXBElement<ArrayOfBarCodeMaskDetail> createArrayOfBarCodeMaskDetail(ArrayOfBarCodeMaskDetail value) {
        return new JAXBElement<ArrayOfBarCodeMaskDetail>(_ArrayOfBarCodeMaskDetail_QNAME, ArrayOfBarCodeMaskDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLayawayPlanSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfLayawayPlanSurcharge")
    public JAXBElement<ArrayOfLayawayPlanSurcharge> createArrayOfLayawayPlanSurcharge(ArrayOfLayawayPlanSurcharge value) {
        return new JAXBElement<ArrayOfLayawayPlanSurcharge>(_ArrayOfLayawayPlanSurcharge_QNAME, ArrayOfLayawayPlanSurcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfVendor")
    public JAXBElement<ArrayOfVendor> createArrayOfVendor(ArrayOfVendor value) {
        return new JAXBElement<ArrayOfVendor>(_ArrayOfVendor_QNAME, ArrayOfVendor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfProductCost")
    public JAXBElement<ArrayOfProductCost> createArrayOfProductCost(ArrayOfProductCost value) {
        return new JAXBElement<ArrayOfProductCost>(_ArrayOfProductCost_QNAME, ArrayOfProductCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOM")
    public JAXBElement<UOM> createUOM(UOM value) {
        return new JAXBElement<UOM>(_UOM_QNAME, UOM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionApplicabilityDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPromotionApplicabilityDetail")
    public JAXBElement<ArrayOfPromotionApplicabilityDetail> createArrayOfPromotionApplicabilityDetail(ArrayOfPromotionApplicabilityDetail value) {
        return new JAXBElement<ArrayOfPromotionApplicabilityDetail>(_ArrayOfPromotionApplicabilityDetail_QNAME, ArrayOfPromotionApplicabilityDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarCodeMask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BarCodeMask")
    public JAXBElement<BarCodeMask> createBarCodeMask(BarCodeMask value) {
        return new JAXBElement<BarCodeMask>(_BarCodeMask_QNAME, BarCodeMask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfCustomerGroup")
    public JAXBElement<ArrayOfCustomerGroup> createArrayOfCustomerGroup(ArrayOfCustomerGroup value) {
        return new JAXBElement<ArrayOfCustomerGroup>(_ArrayOfCustomerGroup_QNAME, ArrayOfCustomerGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Transaction")
    public JAXBElement<Transaction> createTransaction(Transaction value) {
        return new JAXBElement<Transaction>(_Transaction_QNAME, Transaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReturnSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReturnSerialDetail")
    public JAXBElement<GoodsReturnSerialDetail> createGoodsReturnSerialDetail(GoodsReturnSerialDetail value) {
        return new JAXBElement<GoodsReturnSerialDetail>(_GoodsReturnSerialDetail_QNAME, GoodsReturnSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMerchandiseHierarchyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductMerchandiseHierarchyDetail")
    public JAXBElement<ProductMerchandiseHierarchyDetail> createProductMerchandiseHierarchyDetail(ProductMerchandiseHierarchyDetail value) {
        return new JAXBElement<ProductMerchandiseHierarchyDetail>(_ProductMerchandiseHierarchyDetail_QNAME, ProductMerchandiseHierarchyDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeliveryPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfDeliveryPackage")
    public JAXBElement<ArrayOfDeliveryPackage> createArrayOfDeliveryPackage(ArrayOfDeliveryPackage value) {
        return new JAXBElement<ArrayOfDeliveryPackage>(_ArrayOfDeliveryPackage_QNAME, ArrayOfDeliveryPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerGroupDiscount")
    public JAXBElement<CustomerGroupDiscount> createCustomerGroupDiscount(CustomerGroupDiscount value) {
        return new JAXBElement<CustomerGroupDiscount>(_CustomerGroupDiscount_QNAME, CustomerGroupDiscount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturnSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReturnSerialDetail")
    public JAXBElement<ArrayOfGoodsReturnSerialDetail> createArrayOfGoodsReturnSerialDetail(ArrayOfGoodsReturnSerialDetail value) {
        return new JAXBElement<ArrayOfGoodsReturnSerialDetail>(_ArrayOfGoodsReturnSerialDetail_QNAME, ArrayOfGoodsReturnSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReceiptSerialDetail")
    public JAXBElement<ArrayOfGoodsReceiptSerialDetail> createArrayOfGoodsReceiptSerialDetail(ArrayOfGoodsReceiptSerialDetail value) {
        return new JAXBElement<ArrayOfGoodsReceiptSerialDetail>(_ArrayOfGoodsReceiptSerialDetail_QNAME, ArrayOfGoodsReceiptSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPriceDiscountGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfSpecialPriceDiscountGroup")
    public JAXBElement<ArrayOfSpecialPriceDiscountGroup> createArrayOfSpecialPriceDiscountGroup(ArrayOfSpecialPriceDiscountGroup value) {
        return new JAXBElement<ArrayOfSpecialPriceDiscountGroup>(_ArrayOfSpecialPriceDiscountGroup_QNAME, ArrayOfSpecialPriceDiscountGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ARPaymentItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ARPaymentItem")
    public JAXBElement<ARPaymentItem> createARPaymentItem(ARPaymentItem value) {
        return new JAXBElement<ARPaymentItem>(_ARPaymentItem_QNAME, ARPaymentItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReturn")
    public JAXBElement<GoodsReturn> createGoodsReturn(GoodsReturn value) {
        return new JAXBElement<GoodsReturn>(_GoodsReturn_QNAME, GoodsReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfCountry")
    public JAXBElement<ArrayOfCountry> createArrayOfCountry(ArrayOfCountry value) {
        return new JAXBElement<ArrayOfCountry>(_ArrayOfCountry_QNAME, ArrayOfCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "APIException")
    public JAXBElement<APIException> createAPIException(APIException value) {
        return new JAXBElement<APIException>(_APIException_QNAME, APIException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionDaysApplicability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionDaysApplicability")
    public JAXBElement<PromotionDaysApplicability> createPromotionDaysApplicability(PromotionDaysApplicability value) {
        return new JAXBElement<PromotionDaysApplicability>(_PromotionDaysApplicability_QNAME, PromotionDaysApplicability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTypeDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentTypeDiscount")
    public JAXBElement<PaymentTypeDiscount> createPaymentTypeDiscount(PaymentTypeDiscount value) {
        return new JAXBElement<PaymentTypeDiscount>(_PaymentTypeDiscount_QNAME, PaymentTypeDiscount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryUpdateBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryUpdateBatch")
    public JAXBElement<InventoryUpdateBatch> createInventoryUpdateBatch(InventoryUpdateBatch value) {
        return new JAXBElement<InventoryUpdateBatch>(_InventoryUpdateBatch_QNAME, InventoryUpdateBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPurchaseOrder")
    public JAXBElement<ArrayOfPurchaseOrder> createArrayOfPurchaseOrder(ArrayOfPurchaseOrder value) {
        return new JAXBElement<ArrayOfPurchaseOrder>(_ArrayOfPurchaseOrder_QNAME, ArrayOfPurchaseOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfCustomerGroupDiscount")
    public JAXBElement<ArrayOfCustomerGroupDiscount> createArrayOfCustomerGroupDiscount(ArrayOfCustomerGroupDiscount value) {
        return new JAXBElement<ArrayOfCustomerGroupDiscount>(_ArrayOfCustomerGroupDiscount_QNAME, ArrayOfCustomerGroupDiscount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UPCTranslation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UPCTranslation")
    public JAXBElement<UPCTranslation> createUPCTranslation(UPCTranslation value) {
        return new JAXBElement<UPCTranslation>(_UPCTranslation_QNAME, UPCTranslation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayawayPlanSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LayawayPlanSurcharge")
    public JAXBElement<LayawayPlanSurcharge> createLayawayPlanSurcharge(LayawayPlanSurcharge value) {
        return new JAXBElement<LayawayPlanSurcharge>(_LayawayPlanSurcharge_QNAME, LayawayPlanSurcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Store }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Store")
    public JAXBElement<Store> createStore(Store value) {
        return new JAXBElement<Store>(_Store_QNAME, Store.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxCodeCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfTaxCodeCondition")
    public JAXBElement<ArrayOfTaxCodeCondition> createArrayOfTaxCodeCondition(ArrayOfTaxCodeCondition value) {
        return new JAXBElement<ArrayOfTaxCodeCondition>(_ArrayOfTaxCodeCondition_QNAME, ArrayOfTaxCodeCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReturnBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReturnBatchDetail")
    public JAXBElement<GoodsReturnBatchDetail> createGoodsReturnBatchDetail(GoodsReturnBatchDetail value) {
        return new JAXBElement<GoodsReturnBatchDetail>(_GoodsReturnBatchDetail_QNAME, GoodsReturnBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfInventoryUpdate")
    public JAXBElement<ArrayOfInventoryUpdate> createArrayOfInventoryUpdate(ArrayOfInventoryUpdate value) {
        return new JAXBElement<ArrayOfInventoryUpdate>(_ArrayOfInventoryUpdate_QNAME, ArrayOfInventoryUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfStore")
    public JAXBElement<ArrayOfStore> createArrayOfStore(ArrayOfStore value) {
        return new JAXBElement<ArrayOfStore>(_ArrayOfStore_QNAME, ArrayOfStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReceiptBatchDetail")
    public JAXBElement<ArrayOfGoodsReceiptBatchDetail> createArrayOfGoodsReceiptBatchDetail(ArrayOfGoodsReceiptBatchDetail value) {
        return new JAXBElement<ArrayOfGoodsReceiptBatchDetail>(_ArrayOfGoodsReceiptBatchDetail_QNAME, ArrayOfGoodsReceiptBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceList")
    public JAXBElement<PriceList> createPriceList(PriceList value) {
        return new JAXBElement<PriceList>(_PriceList_QNAME, PriceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialPricingQuantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SpecialPricingQuantity")
    public JAXBElement<SpecialPricingQuantity> createSpecialPricingQuantity(SpecialPricingQuantity value) {
        return new JAXBElement<SpecialPricingQuantity>(_SpecialPricingQuantity_QNAME, SpecialPricingQuantity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductCategory")
    public JAXBElement<ProductCategory> createProductCategory(ProductCategory value) {
        return new JAXBElement<ProductCategory>(_ProductCategory_QNAME, ProductCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfBatch")
    public JAXBElement<ArrayOfBatch> createArrayOfBatch(ArrayOfBatch value) {
        return new JAXBElement<ArrayOfBatch>(_ArrayOfBatch_QNAME, ArrayOfBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AlternateItem")
    public JAXBElement<AlternateItem> createAlternateItem(AlternateItem value) {
        return new JAXBElement<AlternateItem>(_AlternateItem_QNAME, AlternateItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceiptSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptSerialDetail")
    public JAXBElement<GoodsReceiptSerialDetail> createGoodsReceiptSerialDetail(GoodsReceiptSerialDetail value) {
        return new JAXBElement<GoodsReceiptSerialDetail>(_GoodsReceiptSerialDetail_QNAME, GoodsReceiptSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionExcludedItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPromotionExcludedItem")
    public JAXBElement<ArrayOfPromotionExcludedItem> createArrayOfPromotionExcludedItem(ArrayOfPromotionExcludedItem value) {
        return new JAXBElement<ArrayOfPromotionExcludedItem>(_ArrayOfPromotionExcludedItem_QNAME, ArrayOfPromotionExcludedItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReturn")
    public JAXBElement<ArrayOfGoodsReturn> createArrayOfGoodsReturn(ArrayOfGoodsReturn value) {
        return new JAXBElement<ArrayOfGoodsReturn>(_ArrayOfGoodsReturn_QNAME, ArrayOfGoodsReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManufacturerGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfManufacturerGroupDiscount")
    public JAXBElement<ArrayOfManufacturerGroupDiscount> createArrayOfManufacturerGroupDiscount(ArrayOfManufacturerGroupDiscount value) {
        return new JAXBElement<ArrayOfManufacturerGroupDiscount>(_ArrayOfManufacturerGroupDiscount_QNAME, ArrayOfManufacturerGroupDiscount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionPaymentAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfTransactionPaymentAttribute")
    public JAXBElement<ArrayOfTransactionPaymentAttribute> createArrayOfTransactionPaymentAttribute(ArrayOfTransactionPaymentAttribute value) {
        return new JAXBElement<ArrayOfTransactionPaymentAttribute>(_ArrayOfTransactionPaymentAttribute_QNAME, ArrayOfTransactionPaymentAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWarehouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfWarehouse")
    public JAXBElement<ArrayOfWarehouse> createArrayOfWarehouse(ArrayOfWarehouse value) {
        return new JAXBElement<ArrayOfWarehouse>(_ArrayOfWarehouse_QNAME, ArrayOfWarehouse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfProduct")
    public JAXBElement<ArrayOfProduct> createArrayOfProduct(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_ArrayOfProduct_QNAME, ArrayOfProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturnBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReturnBatchDetail")
    public JAXBElement<ArrayOfGoodsReturnBatchDetail> createArrayOfGoodsReturnBatchDetail(ArrayOfGoodsReturnBatchDetail value) {
        return new JAXBElement<ArrayOfGoodsReturnBatchDetail>(_ArrayOfGoodsReturnBatchDetail_QNAME, ArrayOfGoodsReturnBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseOrder")
    public JAXBElement<PurchaseOrder> createPurchaseOrder(PurchaseOrder value) {
        return new JAXBElement<PurchaseOrder>(_PurchaseOrder_QNAME, PurchaseOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Country }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Country")
    public JAXBElement<Country> createCountry(Country value) {
        return new JAXBElement<Country>(_Country_QNAME, Country.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceiptPO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptPO")
    public JAXBElement<GoodsReceiptPO> createGoodsReceiptPO(GoodsReceiptPO value) {
        return new JAXBElement<GoodsReceiptPO>(_GoodsReceiptPO_QNAME, GoodsReceiptPO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomTransactionInfoGridDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfCustomTransactionInfoGridDetail")
    public JAXBElement<ArrayOfCustomTransactionInfoGridDetail> createArrayOfCustomTransactionInfoGridDetail(ArrayOfCustomTransactionInfoGridDetail value) {
        return new JAXBElement<ArrayOfCustomTransactionInfoGridDetail>(_ArrayOfCustomTransactionInfoGridDetail_QNAME, ArrayOfCustomTransactionInfoGridDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionPaymentAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionPaymentAttribute")
    public JAXBElement<TransactionPaymentAttribute> createTransactionPaymentAttribute(TransactionPaymentAttribute value) {
        return new JAXBElement<TransactionPaymentAttribute>(_TransactionPaymentAttribute_QNAME, TransactionPaymentAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarCodeMaskDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BarCodeMaskDetail")
    public JAXBElement<BarCodeMaskDetail> createBarCodeMaskDetail(BarCodeMaskDetail value) {
        return new JAXBElement<BarCodeMaskDetail>(_BarCodeMaskDetail_QNAME, BarCodeMaskDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsIssueBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsIssueBatchDetail")
    public JAXBElement<GoodsIssueBatchDetail> createGoodsIssueBatchDetail(GoodsIssueBatchDetail value) {
        return new JAXBElement<GoodsIssueBatchDetail>(_GoodsIssueBatchDetail_QNAME, GoodsIssueBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BaseWrapper")
    public JAXBElement<BaseWrapper> createBaseWrapper(BaseWrapper value) {
        return new JAXBElement<BaseWrapper>(_BaseWrapper_QNAME, BaseWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizePaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AuthorizePaymentRequest")
    public JAXBElement<AuthorizePaymentRequest> createAuthorizePaymentRequest(AuthorizePaymentRequest value) {
        return new JAXBElement<AuthorizePaymentRequest>(_AuthorizePaymentRequest_QNAME, AuthorizePaymentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPaymentTypeDiscount")
    public JAXBElement<ArrayOfPaymentTypeDiscount> createArrayOfPaymentTypeDiscount(ArrayOfPaymentTypeDiscount value) {
        return new JAXBElement<ArrayOfPaymentTypeDiscount>(_ArrayOfPaymentTypeDiscount_QNAME, ArrayOfPaymentTypeDiscount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssueBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsIssueBatchDetail")
    public JAXBElement<ArrayOfGoodsIssueBatchDetail> createArrayOfGoodsIssueBatchDetail(ArrayOfGoodsIssueBatchDetail value) {
        return new JAXBElement<ArrayOfGoodsIssueBatchDetail>(_ArrayOfGoodsIssueBatchDetail_QNAME, ArrayOfGoodsIssueBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityRights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SecurityRights")
    public JAXBElement<SecurityRights> createSecurityRights(SecurityRights value) {
        return new JAXBElement<SecurityRights>(_SecurityRights_QNAME, SecurityRights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SecurityUser")
    public JAXBElement<SecurityUser> createSecurityUser(SecurityUser value) {
        return new JAXBElement<SecurityUser>(_SecurityUser_QNAME, SecurityUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionProductDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPromotionProductDetail")
    public JAXBElement<ArrayOfPromotionProductDetail> createArrayOfPromotionProductDetail(ArrayOfPromotionProductDetail value) {
        return new JAXBElement<ArrayOfPromotionProductDetail>(_ArrayOfPromotionProductDetail_QNAME, ArrayOfPromotionProductDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPaymentTypeAttribute")
    public JAXBElement<ArrayOfPaymentTypeAttribute> createArrayOfPaymentTypeAttribute(ArrayOfPaymentTypeAttribute value) {
        return new JAXBElement<ArrayOfPaymentTypeAttribute>(_ArrayOfPaymentTypeAttribute_QNAME, ArrayOfPaymentTypeAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostDeliveryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PostDeliveryItem")
    public JAXBElement<PostDeliveryItem> createPostDeliveryItem(PostDeliveryItem value) {
        return new JAXBElement<PostDeliveryItem>(_PostDeliveryItem_QNAME, PostDeliveryItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TaxCode")
    public JAXBElement<TaxCode> createTaxCode(TaxCode value) {
        return new JAXBElement<TaxCode>(_TaxCode_QNAME, TaxCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfIntegrationQueue")
    public JAXBElement<ArrayOfIntegrationQueue> createArrayOfIntegrationQueue(ArrayOfIntegrationQueue value) {
        return new JAXBElement<ArrayOfIntegrationQueue>(_ArrayOfIntegrationQueue_QNAME, ArrayOfIntegrationQueue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSummery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerSummery")
    public JAXBElement<CustomerSummery> createCustomerSummery(CustomerSummery value) {
        return new JAXBElement<CustomerSummery>(_CustomerSummery_QNAME, CustomerSummery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfAddress")
    public JAXBElement<ArrayOfAddress> createArrayOfAddress(ArrayOfAddress value) {
        return new JAXBElement<ArrayOfAddress>(_ArrayOfAddress_QNAME, ArrayOfAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryCountBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryCountBatchDetail")
    public JAXBElement<InventoryCountBatchDetail> createInventoryCountBatchDetail(InventoryCountBatchDetail value) {
        return new JAXBElement<InventoryCountBatchDetail>(_InventoryCountBatchDetail_QNAME, InventoryCountBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductBOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductBOM")
    public JAXBElement<ProductBOM> createProductBOM(ProductBOM value) {
        return new JAXBElement<ProductBOM>(_ProductBOM_QNAME, ProductBOM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ObjectProperty")
    public JAXBElement<ObjectProperty> createObjectProperty(ObjectProperty value) {
        return new JAXBElement<ObjectProperty>(_ObjectProperty_QNAME, ObjectProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialPricingDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SpecialPricingDate")
    public JAXBElement<SpecialPricingDate> createSpecialPricingDate(SpecialPricingDate value) {
        return new JAXBElement<SpecialPricingDate>(_SpecialPricingDate_QNAME, SpecialPricingDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionLineItemAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPostTransactionLineItemAttribute")
    public JAXBElement<ArrayOfPostTransactionLineItemAttribute> createArrayOfPostTransactionLineItemAttribute(ArrayOfPostTransactionLineItemAttribute value) {
        return new JAXBElement<ArrayOfPostTransactionLineItemAttribute>(_ArrayOfPostTransactionLineItemAttribute_QNAME, ArrayOfPostTransactionLineItemAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionBonusBuys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPromotionBonusBuys")
    public JAXBElement<ArrayOfPromotionBonusBuys> createArrayOfPromotionBonusBuys(ArrayOfPromotionBonusBuys value) {
        return new JAXBElement<ArrayOfPromotionBonusBuys>(_ArrayOfPromotionBonusBuys_QNAME, ArrayOfPromotionBonusBuys.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceiptPODetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptPODetail")
    public JAXBElement<GoodsReceiptPODetail> createGoodsReceiptPODetail(GoodsReceiptPODetail value) {
        return new JAXBElement<GoodsReceiptPODetail>(_GoodsReceiptPODetail_QNAME, GoodsReceiptPODetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryCountDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryCountDetail")
    public JAXBElement<InventoryCountDetail> createInventoryCountDetail(InventoryCountDetail value) {
        return new JAXBElement<InventoryCountDetail>(_InventoryCountDetail_QNAME, InventoryCountDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTransactionLineItemAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PostTransactionLineItemAttribute")
    public JAXBElement<PostTransactionLineItemAttribute> createPostTransactionLineItemAttribute(PostTransactionLineItemAttribute value) {
        return new JAXBElement<PostTransactionLineItemAttribute>(_PostTransactionLineItemAttribute_QNAME, PostTransactionLineItemAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionSurcharge")
    public JAXBElement<TransactionSurcharge> createTransactionSurcharge(TransactionSurcharge value) {
        return new JAXBElement<TransactionSurcharge>(_TransactionSurcharge_QNAME, TransactionSurcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeValidValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfAttributeValidValue")
    public JAXBElement<ArrayOfAttributeValidValue> createArrayOfAttributeValidValue(ArrayOfAttributeValidValue value) {
        return new JAXBElement<ArrayOfAttributeValidValue>(_ArrayOfAttributeValidValue_QNAME, ArrayOfAttributeValidValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfSurcharge")
    public JAXBElement<ArrayOfSurcharge> createArrayOfSurcharge(ArrayOfSurcharge value) {
        return new JAXBElement<ArrayOfSurcharge>(_ArrayOfSurcharge_QNAME, ArrayOfSurcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerCatalog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerCatalog")
    public JAXBElement<CustomerCatalog> createCustomerCatalog(CustomerCatalog value) {
        return new JAXBElement<CustomerCatalog>(_CustomerCatalog_QNAME, CustomerCatalog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LineAttribute")
    public JAXBElement<LineAttribute> createLineAttribute(LineAttribute value) {
        return new JAXBElement<LineAttribute>(_LineAttribute_QNAME, LineAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfUOM")
    public JAXBElement<ArrayOfUOM> createArrayOfUOM(ArrayOfUOM value) {
        return new JAXBElement<ArrayOfUOM>(_ArrayOfUOM_QNAME, ArrayOfUOM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StockTransfer")
    public JAXBElement<StockTransfer> createStockTransfer(StockTransfer value) {
        return new JAXBElement<StockTransfer>(_StockTransfer_QNAME, StockTransfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PostTransaction")
    public JAXBElement<PostTransaction> createPostTransaction(PostTransaction value) {
        return new JAXBElement<PostTransaction>(_PostTransaction_QNAME, PostTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionBonusBuys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionBonusBuys")
    public JAXBElement<PromotionBonusBuys> createPromotionBonusBuys(PromotionBonusBuys value) {
        return new JAXBElement<PromotionBonusBuys>(_PromotionBonusBuys_QNAME, PromotionBonusBuys.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsIssue")
    public JAXBElement<ArrayOfGoodsIssue> createArrayOfGoodsIssue(ArrayOfGoodsIssue value) {
        return new JAXBElement<ArrayOfGoodsIssue>(_ArrayOfGoodsIssue_QNAME, ArrayOfGoodsIssue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionApplicabilityDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionApplicabilityDetail")
    public JAXBElement<PromotionApplicabilityDetail> createPromotionApplicabilityDetail(PromotionApplicabilityDetail value) {
        return new JAXBElement<PromotionApplicabilityDetail>(_PromotionApplicabilityDetail_QNAME, PromotionApplicabilityDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfAttributes")
    public JAXBElement<ArrayOfAttributes> createArrayOfAttributes(ArrayOfAttributes value) {
        return new JAXBElement<ArrayOfAttributes>(_ArrayOfAttributes_QNAME, ArrayOfAttributes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPriceMatrix")
    public JAXBElement<ArrayOfPriceMatrix> createArrayOfPriceMatrix(ArrayOfPriceMatrix value) {
        return new JAXBElement<ArrayOfPriceMatrix>(_ArrayOfPriceMatrix_QNAME, ArrayOfPriceMatrix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoyaltyPrePrintedCards }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyPrePrintedCards")
    public JAXBElement<LoyaltyPrePrintedCards> createLoyaltyPrePrintedCards(LoyaltyPrePrintedCards value) {
        return new JAXBElement<LoyaltyPrePrintedCards>(_LoyaltyPrePrintedCards_QNAME, LoyaltyPrePrintedCards.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductBOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfProductBOM")
    public JAXBElement<ArrayOfProductBOM> createArrayOfProductBOM(ArrayOfProductBOM value) {
        return new JAXBElement<ArrayOfProductBOM>(_ArrayOfProductBOM_QNAME, ArrayOfProductBOM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerCatalogDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfCustomerCatalogDetail")
    public JAXBElement<ArrayOfCustomerCatalogDetail> createArrayOfCustomerCatalogDetail(ArrayOfCustomerCatalogDetail value) {
        return new JAXBElement<ArrayOfCustomerCatalogDetail>(_ArrayOfCustomerCatalogDetail_QNAME, ArrayOfCustomerCatalogDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPOBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReceiptPOBatchDetail")
    public JAXBElement<ArrayOfGoodsReceiptPOBatchDetail> createArrayOfGoodsReceiptPOBatchDetail(ArrayOfGoodsReceiptPOBatchDetail value) {
        return new JAXBElement<ArrayOfGoodsReceiptPOBatchDetail>(_ArrayOfGoodsReceiptPOBatchDetail_QNAME, ArrayOfGoodsReceiptPOBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPricingDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfSpecialPricingDate")
    public JAXBElement<ArrayOfSpecialPricingDate> createArrayOfSpecialPricingDate(ArrayOfSpecialPricingDate value) {
        return new JAXBElement<ArrayOfSpecialPricingDate>(_ArrayOfSpecialPricingDate_QNAME, ArrayOfSpecialPricingDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplicationSendDump }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReplicationSendDump")
    public JAXBElement<ReplicationSendDump> createReplicationSendDump(ReplicationSendDump value) {
        return new JAXBElement<ReplicationSendDump>(_ReplicationSendDump_QNAME, ReplicationSendDump.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfEmployee")
    public JAXBElement<ArrayOfEmployee> createArrayOfEmployee(ArrayOfEmployee value) {
        return new JAXBElement<ArrayOfEmployee>(_ArrayOfEmployee_QNAME, ArrayOfEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTransactionSaleAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PostTransactionSaleAttribute")
    public JAXBElement<PostTransactionSaleAttribute> createPostTransactionSaleAttribute(PostTransactionSaleAttribute value) {
        return new JAXBElement<PostTransactionSaleAttribute>(_PostTransactionSaleAttribute_QNAME, PostTransactionSaleAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShippingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfShippingType")
    public JAXBElement<ArrayOfShippingType> createArrayOfShippingType(ArrayOfShippingType value) {
        return new JAXBElement<ArrayOfShippingType>(_ArrayOfShippingType_QNAME, ArrayOfShippingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFulfillmentPlanSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfFulfillmentPlanSurcharge")
    public JAXBElement<ArrayOfFulfillmentPlanSurcharge> createArrayOfFulfillmentPlanSurcharge(ArrayOfFulfillmentPlanSurcharge value) {
        return new JAXBElement<ArrayOfFulfillmentPlanSurcharge>(_ArrayOfFulfillmentPlanSurcharge_QNAME, ArrayOfFulfillmentPlanSurcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomTransactionInfoGridDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomTransactionInfoGridDetail")
    public JAXBElement<CustomTransactionInfoGridDetail> createCustomTransactionInfoGridDetail(CustomTransactionInfoGridDetail value) {
        return new JAXBElement<CustomTransactionInfoGridDetail>(_CustomTransactionInfoGridDetail_QNAME, CustomTransactionInfoGridDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "IntegrationQueue")
    public JAXBElement<IntegrationQueue> createIntegrationQueue(IntegrationQueue value) {
        return new JAXBElement<IntegrationQueue>(_IntegrationQueue_QNAME, IntegrationQueue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfUserFields")
    public JAXBElement<ArrayOfUserFields> createArrayOfUserFields(ArrayOfUserFields value) {
        return new JAXBElement<ArrayOfUserFields>(_ArrayOfUserFields_QNAME, ArrayOfUserFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionExcludedItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionExcludedItem")
    public JAXBElement<PromotionExcludedItem> createPromotionExcludedItem(PromotionExcludedItem value) {
        return new JAXBElement<PromotionExcludedItem>(_PromotionExcludedItem_QNAME, PromotionExcludedItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceUOMMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPriceUOMMatrix")
    public JAXBElement<ArrayOfPriceUOMMatrix> createArrayOfPriceUOMMatrix(ArrayOfPriceUOMMatrix value) {
        return new JAXBElement<ArrayOfPriceUOMMatrix>(_ArrayOfPriceUOMMatrix_QNAME, ArrayOfPriceUOMMatrix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostDeliveryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPostDeliveryItem")
    public JAXBElement<ArrayOfPostDeliveryItem> createArrayOfPostDeliveryItem(ArrayOfPostDeliveryItem value) {
        return new JAXBElement<ArrayOfPostDeliveryItem>(_ArrayOfPostDeliveryItem_QNAME, ArrayOfPostDeliveryItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrderDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPurchaseOrderDetail")
    public JAXBElement<ArrayOfPurchaseOrderDetail> createArrayOfPurchaseOrderDetail(ArrayOfPurchaseOrderDetail value) {
        return new JAXBElement<ArrayOfPurchaseOrderDetail>(_ArrayOfPurchaseOrderDetail_QNAME, ArrayOfPurchaseOrderDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxPeriodDefination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfTaxPeriodDefination")
    public JAXBElement<ArrayOfTaxPeriodDefination> createArrayOfTaxPeriodDefination(ArrayOfTaxPeriodDefination value) {
        return new JAXBElement<ArrayOfTaxPeriodDefination>(_ArrayOfTaxPeriodDefination_QNAME, ArrayOfTaxPeriodDefination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockTransferRequisitionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfStockTransferRequisitionDetail")
    public JAXBElement<ArrayOfStockTransferRequisitionDetail> createArrayOfStockTransferRequisitionDetail(ArrayOfStockTransferRequisitionDetail value) {
        return new JAXBElement<ArrayOfStockTransferRequisitionDetail>(_ArrayOfStockTransferRequisitionDetail_QNAME, ArrayOfStockTransferRequisitionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockTransferBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfStockTransferBatchDetail")
    public JAXBElement<ArrayOfStockTransferBatchDetail> createArrayOfStockTransferBatchDetail(ArrayOfStockTransferBatchDetail value) {
        return new JAXBElement<ArrayOfStockTransferBatchDetail>(_ArrayOfStockTransferBatchDetail_QNAME, ArrayOfStockTransferBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostDelivery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PostDelivery")
    public JAXBElement<PostDelivery> createPostDelivery(PostDelivery value) {
        return new JAXBElement<PostDelivery>(_PostDelivery_QNAME, PostDelivery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObjectProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfObjectProperty")
    public JAXBElement<ArrayOfObjectProperty> createArrayOfObjectProperty(ArrayOfObjectProperty value) {
        return new JAXBElement<ArrayOfObjectProperty>(_ArrayOfObjectProperty_QNAME, ArrayOfObjectProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductSurcharge")
    public JAXBElement<ProductSurcharge> createProductSurcharge(ProductSurcharge value) {
        return new JAXBElement<ProductSurcharge>(_ProductSurcharge_QNAME, ProductSurcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVendorProductMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfVendorProductMapping")
    public JAXBElement<ArrayOfVendorProductMapping> createArrayOfVendorProductMapping(ArrayOfVendorProductMapping value) {
        return new JAXBElement<ArrayOfVendorProductMapping>(_ArrayOfVendorProductMapping_QNAME, ArrayOfVendorProductMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Serial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Serial")
    public JAXBElement<Serial> createSerial(Serial value) {
        return new JAXBElement<Serial>(_Serial_QNAME, Serial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductGroup")
    public JAXBElement<ProductGroup> createProductGroup(ProductGroup value) {
        return new JAXBElement<ProductGroup>(_ProductGroup_QNAME, ProductGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorProductMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "VendorProductMapping")
    public JAXBElement<VendorProductMapping> createVendorProductMapping(VendorProductMapping value) {
        return new JAXBElement<VendorProductMapping>(_VendorProductMapping_QNAME, VendorProductMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserFields")
    public JAXBElement<UserFields> createUserFields(UserFields value) {
        return new JAXBElement<UserFields>(_UserFields_QNAME, UserFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPostTransactionItem")
    public JAXBElement<ArrayOfPostTransactionItem> createArrayOfPostTransactionItem(ArrayOfPostTransactionItem value) {
        return new JAXBElement<ArrayOfPostTransactionItem>(_ArrayOfPostTransactionItem_QNAME, ArrayOfPostTransactionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FulfillmentPlanSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FulfillmentPlanSurcharge")
    public JAXBElement<FulfillmentPlanSurcharge> createFulfillmentPlanSurcharge(FulfillmentPlanSurcharge value) {
        return new JAXBElement<FulfillmentPlanSurcharge>(_FulfillmentPlanSurcharge_QNAME, FulfillmentPlanSurcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLoyaltyPrePrintedCards }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfLoyaltyPrePrintedCards")
    public JAXBElement<ArrayOfLoyaltyPrePrintedCards> createArrayOfLoyaltyPrePrintedCards(ArrayOfLoyaltyPrePrintedCards value) {
        return new JAXBElement<ArrayOfLoyaltyPrePrintedCards>(_ArrayOfLoyaltyPrePrintedCards_QNAME, ArrayOfLoyaltyPrePrintedCards.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReplicationSendDump }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfReplicationSendDump")
    public JAXBElement<ArrayOfReplicationSendDump> createArrayOfReplicationSendDump(ArrayOfReplicationSendDump value) {
        return new JAXBElement<ArrayOfReplicationSendDump>(_ArrayOfReplicationSendDump_QNAME, ArrayOfReplicationSendDump.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountsReceivable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfAccountsReceivable")
    public JAXBElement<ArrayOfAccountsReceivable> createArrayOfAccountsReceivable(ArrayOfAccountsReceivable value) {
        return new JAXBElement<ArrayOfAccountsReceivable>(_ArrayOfAccountsReceivable_QNAME, ArrayOfAccountsReceivable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coupon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Coupon")
    public JAXBElement<Coupon> createCoupon(Coupon value) {
        return new JAXBElement<Coupon>(_Coupon_QNAME, Coupon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfInventoryCountDetail")
    public JAXBElement<ArrayOfInventoryCountDetail> createArrayOfInventoryCountDetail(ArrayOfInventoryCountDetail value) {
        return new JAXBElement<ArrayOfInventoryCountDetail>(_ArrayOfInventoryCountDetail_QNAME, ArrayOfInventoryCountDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfTransactionPayment")
    public JAXBElement<ArrayOfTransactionPayment> createArrayOfTransactionPayment(ArrayOfTransactionPayment value) {
        return new JAXBElement<ArrayOfTransactionPayment>(_ArrayOfTransactionPayment_QNAME, ArrayOfTransactionPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCertificateMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GiftCertificateMaster")
    public JAXBElement<GiftCertificateMaster> createGiftCertificateMaster(GiftCertificateMaster value) {
        return new JAXBElement<GiftCertificateMaster>(_GiftCertificateMaster_QNAME, GiftCertificateMaster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceiptPOBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptPOBatchDetail")
    public JAXBElement<GoodsReceiptPOBatchDetail> createGoodsReceiptPOBatchDetail(GoodsReceiptPOBatchDetail value) {
        return new JAXBElement<GoodsReceiptPOBatchDetail>(_GoodsReceiptPOBatchDetail_QNAME, GoodsReceiptPOBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsIssueSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsIssueSerialDetail")
    public JAXBElement<GoodsIssueSerialDetail> createGoodsIssueSerialDetail(GoodsIssueSerialDetail value) {
        return new JAXBElement<GoodsIssueSerialDetail>(_GoodsIssueSerialDetail_QNAME, GoodsIssueSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceUOMMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceUOMMatrix")
    public JAXBElement<PriceUOMMatrix> createPriceUOMMatrix(PriceUOMMatrix value) {
        return new JAXBElement<PriceUOMMatrix>(_PriceUOMMatrix_QNAME, PriceUOMMatrix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionGet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionGet")
    public JAXBElement<PromotionGet> createPromotionGet(PromotionGet value) {
        return new JAXBElement<PromotionGet>(_PromotionGet_QNAME, PromotionGet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaleAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfSaleAttribute")
    public JAXBElement<ArrayOfSaleAttribute> createArrayOfSaleAttribute(ArrayOfSaleAttribute value) {
        return new JAXBElement<ArrayOfSaleAttribute>(_ArrayOfSaleAttribute_QNAME, ArrayOfSaleAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCertificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GiftCertificate")
    public JAXBElement<GiftCertificate> createGiftCertificate(GiftCertificate value) {
        return new JAXBElement<GiftCertificate>(_GiftCertificate_QNAME, GiftCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPODetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReceiptPODetail")
    public JAXBElement<ArrayOfGoodsReceiptPODetail> createArrayOfGoodsReceiptPODetail(ArrayOfGoodsReceiptPODetail value) {
        return new JAXBElement<ArrayOfGoodsReceiptPODetail>(_ArrayOfGoodsReceiptPODetail_QNAME, ArrayOfGoodsReceiptPODetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionDaysApplicability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPromotionDaysApplicability")
    public JAXBElement<ArrayOfPromotionDaysApplicability> createArrayOfPromotionDaysApplicability(ArrayOfPromotionDaysApplicability value) {
        return new JAXBElement<ArrayOfPromotionDaysApplicability>(_ArrayOfPromotionDaysApplicability_QNAME, ArrayOfPromotionDaysApplicability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfContact")
    public JAXBElement<ArrayOfContact> createArrayOfContact(ArrayOfContact value) {
        return new JAXBElement<ArrayOfContact>(_ArrayOfContact_QNAME, ArrayOfContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialPricing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SpecialPricing")
    public JAXBElement<SpecialPricing> createSpecialPricing(SpecialPricing value) {
        return new JAXBElement<SpecialPricing>(_SpecialPricing_QNAME, SpecialPricing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrderSurchargeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPurchaseOrderSurchargeDTO")
    public JAXBElement<ArrayOfPurchaseOrderSurchargeDTO> createArrayOfPurchaseOrderSurchargeDTO(ArrayOfPurchaseOrderSurchargeDTO value) {
        return new JAXBElement<ArrayOfPurchaseOrderSurchargeDTO>(_ArrayOfPurchaseOrderSurchargeDTO_QNAME, ArrayOfPurchaseOrderSurchargeDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UOMGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMGroup")
    public JAXBElement<UOMGroup> createUOMGroup(UOMGroup value) {
        return new JAXBElement<UOMGroup>(_UOMGroup_QNAME, UOMGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPriceList")
    public JAXBElement<ArrayOfPriceList> createArrayOfPriceList(ArrayOfPriceList value) {
        return new JAXBElement<ArrayOfPriceList>(_ArrayOfPriceList_QNAME, ArrayOfPriceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPricing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfSpecialPricing")
    public JAXBElement<ArrayOfSpecialPricing> createArrayOfSpecialPricing(ArrayOfSpecialPricing value) {
        return new JAXBElement<ArrayOfSpecialPricing>(_ArrayOfSpecialPricing_QNAME, ArrayOfSpecialPricing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductMerchandiseHierarchyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfProductMerchandiseHierarchyDetail")
    public JAXBElement<ArrayOfProductMerchandiseHierarchyDetail> createArrayOfProductMerchandiseHierarchyDetail(ArrayOfProductMerchandiseHierarchyDetail value) {
        return new JAXBElement<ArrayOfProductMerchandiseHierarchyDetail>(_ArrayOfProductMerchandiseHierarchyDetail_QNAME, ArrayOfProductMerchandiseHierarchyDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUOMGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfUOMGroup")
    public JAXBElement<ArrayOfUOMGroup> createArrayOfUOMGroup(ArrayOfUOMGroup value) {
        return new JAXBElement<ArrayOfUOMGroup>(_ArrayOfUOMGroup_QNAME, ArrayOfUOMGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrencyDenomination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfCurrencyDenomination")
    public JAXBElement<ArrayOfCurrencyDenomination> createArrayOfCurrencyDenomination(ArrayOfCurrencyDenomination value) {
        return new JAXBElement<ArrayOfCurrencyDenomination>(_ArrayOfCurrencyDenomination_QNAME, ArrayOfCurrencyDenomination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FulfillmentPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FulfillmentPlan")
    public JAXBElement<FulfillmentPlan> createFulfillmentPlan(FulfillmentPlan value) {
        return new JAXBElement<FulfillmentPlan>(_FulfillmentPlan_QNAME, FulfillmentPlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryCountSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryCountSerialDetail")
    public JAXBElement<InventoryCountSerialDetail> createInventoryCountSerialDetail(InventoryCountSerialDetail value) {
        return new JAXBElement<InventoryCountSerialDetail>(_InventoryCountSerialDetail_QNAME, InventoryCountSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsIssueDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsIssueDetail")
    public JAXBElement<GoodsIssueDetail> createGoodsIssueDetail(GoodsIssueDetail value) {
        return new JAXBElement<GoodsIssueDetail>(_GoodsIssueDetail_QNAME, GoodsIssueDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Vendor")
    public JAXBElement<Vendor> createVendor(Vendor value) {
        return new JAXBElement<Vendor>(_Vendor_QNAME, Vendor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfTaxCode")
    public JAXBElement<ArrayOfTaxCode> createArrayOfTaxCode(ArrayOfTaxCode value) {
        return new JAXBElement<ArrayOfTaxCode>(_ArrayOfTaxCode_QNAME, ArrayOfTaxCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "VendorGroup")
    public JAXBElement<VendorGroup> createVendorGroup(VendorGroup value) {
        return new JAXBElement<VendorGroup>(_VendorGroup_QNAME, VendorGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UpdateMaster")
    public JAXBElement<UpdateMaster> createUpdateMaster(UpdateMaster value) {
        return new JAXBElement<UpdateMaster>(_UpdateMaster_QNAME, UpdateMaster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreExpense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StoreExpense")
    public JAXBElement<StoreExpense> createStoreExpense(StoreExpense value) {
        return new JAXBElement<StoreExpense>(_StoreExpense_QNAME, StoreExpense.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Contact")
    public JAXBElement<Contact> createContact(Contact value) {
        return new JAXBElement<Contact>(_Contact_QNAME, Contact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyDenomination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CurrencyDenomination")
    public JAXBElement<CurrencyDenomination> createCurrencyDenomination(CurrencyDenomination value) {
        return new JAXBElement<CurrencyDenomination>(_CurrencyDenomination_QNAME, CurrencyDenomination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedFieldsDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserDefinedFieldsDetails")
    public JAXBElement<UserDefinedFieldsDetails> createUserDefinedFieldsDetails(UserDefinedFieldsDetails value) {
        return new JAXBElement<UserDefinedFieldsDetails>(_UserDefinedFieldsDetails_QNAME, UserDefinedFieldsDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfLineAttribute")
    public JAXBElement<ArrayOfLineAttribute> createArrayOfLineAttribute(ArrayOfLineAttribute value) {
        return new JAXBElement<ArrayOfLineAttribute>(_ArrayOfLineAttribute_QNAME, ArrayOfLineAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTransferRequisition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StockTransferRequisition")
    public JAXBElement<StockTransferRequisition> createStockTransferRequisition(StockTransferRequisition value) {
        return new JAXBElement<StockTransferRequisition>(_StockTransferRequisition_QNAME, StockTransferRequisition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceiptPOSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptPOSerialDetail")
    public JAXBElement<GoodsReceiptPOSerialDetail> createGoodsReceiptPOSerialDetail(GoodsReceiptPOSerialDetail value) {
        return new JAXBElement<GoodsReceiptPOSerialDetail>(_GoodsReceiptPOSerialDetail_QNAME, GoodsReceiptPOSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionSalesPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionSalesPerson")
    public JAXBElement<TransactionSalesPerson> createTransactionSalesPerson(TransactionSalesPerson value) {
        return new JAXBElement<TransactionSalesPerson>(_TransactionSalesPerson_QNAME, TransactionSalesPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoupon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfCoupon")
    public JAXBElement<ArrayOfCoupon> createArrayOfCoupon(ArrayOfCoupon value) {
        return new JAXBElement<ArrayOfCoupon>(_ArrayOfCoupon_QNAME, ArrayOfCoupon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfProductSurcharge")
    public JAXBElement<ArrayOfProductSurcharge> createArrayOfProductSurcharge(ArrayOfProductSurcharge value) {
        return new JAXBElement<ArrayOfProductSurcharge>(_ArrayOfProductSurcharge_QNAME, ArrayOfProductSurcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftCertificateMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGiftCertificateMaster")
    public JAXBElement<ArrayOfGiftCertificateMaster> createArrayOfGiftCertificateMaster(ArrayOfGiftCertificateMaster value) {
        return new JAXBElement<ArrayOfGiftCertificateMaster>(_ArrayOfGiftCertificateMaster_QNAME, ArrayOfGiftCertificateMaster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturnDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReturnDetail")
    public JAXBElement<ArrayOfGoodsReturnDetail> createArrayOfGoodsReturnDetail(ArrayOfGoodsReturnDetail value) {
        return new JAXBElement<ArrayOfGoodsReturnDetail>(_ArrayOfGoodsReturnDetail_QNAME, ArrayOfGoodsReturnDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssueDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsIssueDetail")
    public JAXBElement<ArrayOfGoodsIssueDetail> createArrayOfGoodsIssueDetail(ArrayOfGoodsIssueDetail value) {
        return new JAXBElement<ArrayOfGoodsIssueDetail>(_ArrayOfGoodsIssueDetail_QNAME, ArrayOfGoodsIssueDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Manufacturer")
    public JAXBElement<Manufacturer> createManufacturer(Manufacturer value) {
        return new JAXBElement<Manufacturer>(_Manufacturer_QNAME, Manufacturer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Batch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Batch")
    public JAXBElement<Batch> createBatch(Batch value) {
        return new JAXBElement<Batch>(_Batch_QNAME, Batch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialPriceDiscountGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SpecialPriceDiscountGroup")
    public JAXBElement<SpecialPriceDiscountGroup> createSpecialPriceDiscountGroup(SpecialPriceDiscountGroup value) {
        return new JAXBElement<SpecialPriceDiscountGroup>(_SpecialPriceDiscountGroup_QNAME, SpecialPriceDiscountGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPaymentTypeSurcharge")
    public JAXBElement<ArrayOfPaymentTypeSurcharge> createArrayOfPaymentTypeSurcharge(ArrayOfPaymentTypeSurcharge value) {
        return new JAXBElement<ArrayOfPaymentTypeSurcharge>(_ArrayOfPaymentTypeSurcharge_QNAME, ArrayOfPaymentTypeSurcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoyaltySetup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltySetup")
    public JAXBElement<LoyaltySetup> createLoyaltySetup(LoyaltySetup value) {
        return new JAXBElement<LoyaltySetup>(_LoyaltySetup_QNAME, LoyaltySetup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReturnDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReturnDetail")
    public JAXBElement<GoodsReturnDetail> createGoodsReturnDetail(GoodsReturnDetail value) {
        return new JAXBElement<GoodsReturnDetail>(_GoodsReturnDetail_QNAME, GoodsReturnDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaleAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaleAttribute")
    public JAXBElement<SaleAttribute> createSaleAttribute(SaleAttribute value) {
        return new JAXBElement<SaleAttribute>(_SaleAttribute_QNAME, SaleAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryPackageAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DeliveryPackageAddress")
    public JAXBElement<DeliveryPackageAddress> createDeliveryPackageAddress(DeliveryPackageAddress value) {
        return new JAXBElement<DeliveryPackageAddress>(_DeliveryPackageAddress_QNAME, DeliveryPackageAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Warehouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Warehouse")
    public JAXBElement<Warehouse> createWarehouse(Warehouse value) {
        return new JAXBElement<Warehouse>(_Warehouse_QNAME, Warehouse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductUpsell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductUpsell")
    public JAXBElement<ProductUpsell> createProductUpsell(ProductUpsell value) {
        return new JAXBElement<ProductUpsell>(_ProductUpsell_QNAME, ProductUpsell.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryItem")
    public JAXBElement<InventoryItem> createInventoryItem(InventoryItem value) {
        return new JAXBElement<InventoryItem>(_InventoryItem_QNAME, InventoryItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductUpsell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfProductUpsell")
    public JAXBElement<ArrayOfProductUpsell> createArrayOfProductUpsell(ArrayOfProductUpsell value) {
        return new JAXBElement<ArrayOfProductUpsell>(_ArrayOfProductUpsell_QNAME, ArrayOfProductUpsell.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionPrinting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionPrinting")
    public JAXBElement<TransactionPrinting> createTransactionPrinting(TransactionPrinting value) {
        return new JAXBElement<TransactionPrinting>(_TransactionPrinting_QNAME, TransactionPrinting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReceipt")
    public JAXBElement<ArrayOfGoodsReceipt> createArrayOfGoodsReceipt(ArrayOfGoodsReceipt value) {
        return new JAXBElement<ArrayOfGoodsReceipt>(_ArrayOfGoodsReceipt_QNAME, ArrayOfGoodsReceipt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBarCodeMask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfBarCodeMask")
    public JAXBElement<ArrayOfBarCodeMask> createArrayOfBarCodeMask(ArrayOfBarCodeMask value) {
        return new JAXBElement<ArrayOfBarCodeMask>(_ArrayOfBarCodeMask_QNAME, ArrayOfBarCodeMask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Surcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Surcharge")
    public JAXBElement<Surcharge> createSurcharge(Surcharge value) {
        return new JAXBElement<Surcharge>(_Surcharge_QNAME, Surcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PostTransactionItem")
    public JAXBElement<PostTransactionItem> createPostTransactionItem(PostTransactionItem value) {
        return new JAXBElement<PostTransactionItem>(_PostTransactionItem_QNAME, PostTransactionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdateBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfInventoryUpdateBatch")
    public JAXBElement<ArrayOfInventoryUpdateBatch> createArrayOfInventoryUpdateBatch(ArrayOfInventoryUpdateBatch value) {
        return new JAXBElement<ArrayOfInventoryUpdateBatch>(_ArrayOfInventoryUpdateBatch_QNAME, ArrayOfInventoryUpdateBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReceiptDetail")
    public JAXBElement<ArrayOfGoodsReceiptDetail> createArrayOfGoodsReceiptDetail(ArrayOfGoodsReceiptDetail value) {
        return new JAXBElement<ArrayOfGoodsReceiptDetail>(_ArrayOfGoodsReceiptDetail_QNAME, ArrayOfGoodsReceiptDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUPCTranslation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfUPCTranslation")
    public JAXBElement<ArrayOfUPCTranslation> createArrayOfUPCTranslation(ArrayOfUPCTranslation value) {
        return new JAXBElement<ArrayOfUPCTranslation>(_ArrayOfUPCTranslation_QNAME, ArrayOfUPCTranslation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderSurchargeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseOrderSurchargeDTO")
    public JAXBElement<PurchaseOrderSurchargeDTO> createPurchaseOrderSurchargeDTO(PurchaseOrderSurchargeDTO value) {
        return new JAXBElement<PurchaseOrderSurchargeDTO>(_PurchaseOrderSurchargeDTO_QNAME, PurchaseOrderSurchargeDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfInventoryCountBatchDetail")
    public JAXBElement<ArrayOfInventoryCountBatchDetail> createArrayOfInventoryCountBatchDetail(ArrayOfInventoryCountBatchDetail value) {
        return new JAXBElement<ArrayOfInventoryCountBatchDetail>(_ArrayOfInventoryCountBatchDetail_QNAME, ArrayOfInventoryCountBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfState")
    public JAXBElement<ArrayOfState> createArrayOfState(ArrayOfState value) {
        return new JAXBElement<ArrayOfState>(_ArrayOfState_QNAME, ArrayOfState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlternateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfAlternateItem")
    public JAXBElement<ArrayOfAlternateItem> createArrayOfAlternateItem(ArrayOfAlternateItem value) {
        return new JAXBElement<ArrayOfAlternateItem>(_ArrayOfAlternateItem_QNAME, ArrayOfAlternateItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceiptBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptBatchDetail")
    public JAXBElement<GoodsReceiptBatchDetail> createGoodsReceiptBatchDetail(GoodsReceiptBatchDetail value) {
        return new JAXBElement<GoodsReceiptBatchDetail>(_GoodsReceiptBatchDetail_QNAME, GoodsReceiptBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReceiptPO")
    public JAXBElement<ArrayOfGoodsReceiptPO> createArrayOfGoodsReceiptPO(ArrayOfGoodsReceiptPO value) {
        return new JAXBElement<ArrayOfGoodsReceiptPO>(_ArrayOfGoodsReceiptPO_QNAME, ArrayOfGoodsReceiptPO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfTransactionSurcharge")
    public JAXBElement<ArrayOfTransactionSurcharge> createArrayOfTransactionSurcharge(ArrayOfTransactionSurcharge value) {
        return new JAXBElement<ArrayOfTransactionSurcharge>(_ArrayOfTransactionSurcharge_QNAME, ArrayOfTransactionSurcharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsReceivable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AccountsReceivable")
    public JAXBElement<AccountsReceivable> createAccountsReceivable(AccountsReceivable value) {
        return new JAXBElement<AccountsReceivable>(_AccountsReceivable_QNAME, AccountsReceivable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfCustomer")
    public JAXBElement<ArrayOfCustomer> createArrayOfCustomer(ArrayOfCustomer value) {
        return new JAXBElement<ArrayOfCustomer>(_ArrayOfCustomer_QNAME, ArrayOfCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPricingQuantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfSpecialPricingQuantity")
    public JAXBElement<ArrayOfSpecialPricingQuantity> createArrayOfSpecialPricingQuantity(ArrayOfSpecialPricingQuantity value) {
        return new JAXBElement<ArrayOfSpecialPricingQuantity>(_ArrayOfSpecialPricingQuantity_QNAME, ArrayOfSpecialPricingQuantity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfInventoryCountSerialDetail")
    public JAXBElement<ArrayOfInventoryCountSerialDetail> createArrayOfInventoryCountSerialDetail(ArrayOfInventoryCountSerialDetail value) {
        return new JAXBElement<ArrayOfInventoryCountSerialDetail>(_ArrayOfInventoryCountSerialDetail_QNAME, ArrayOfInventoryCountSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfTransactionItem")
    public JAXBElement<ArrayOfTransactionItem> createArrayOfTransactionItem(ArrayOfTransactionItem value) {
        return new JAXBElement<ArrayOfTransactionItem>(_ArrayOfTransactionItem_QNAME, ArrayOfTransactionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "POS")
    public JAXBElement<POS> createPOS(POS value) {
        return new JAXBElement<POS>(_POS_QNAME, POS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdateSerial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfInventoryUpdateSerial")
    public JAXBElement<ArrayOfInventoryUpdateSerial> createArrayOfInventoryUpdateSerial(ArrayOfInventoryUpdateSerial value) {
        return new JAXBElement<ArrayOfInventoryUpdateSerial>(_ArrayOfInventoryUpdateSerial_QNAME, ArrayOfInventoryUpdateSerial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfManufacturer")
    public JAXBElement<ArrayOfManufacturer> createArrayOfManufacturer(ArrayOfManufacturer value) {
        return new JAXBElement<ArrayOfManufacturer>(_ArrayOfManufacturer_QNAME, ArrayOfManufacturer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfProductGroup")
    public JAXBElement<ArrayOfProductGroup> createArrayOfProductGroup(ArrayOfProductGroup value) {
        return new JAXBElement<ArrayOfProductGroup>(_ArrayOfProductGroup_QNAME, ArrayOfProductGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPaymentType")
    public JAXBElement<ArrayOfPaymentType> createArrayOfPaymentType(ArrayOfPaymentType value) {
        return new JAXBElement<ArrayOfPaymentType>(_ArrayOfPaymentType_QNAME, ArrayOfPaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Currency")
    public JAXBElement<Currency> createCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfInventoryItem")
    public JAXBElement<ArrayOfInventoryItem> createArrayOfInventoryItem(ArrayOfInventoryItem value) {
        return new JAXBElement<ArrayOfInventoryItem>(_ArrayOfInventoryItem_QNAME, ArrayOfInventoryItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberSeriesMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "NumberSeriesMaster")
    public JAXBElement<NumberSeriesMaster> createNumberSeriesMaster(NumberSeriesMaster value) {
        return new JAXBElement<NumberSeriesMaster>(_NumberSeriesMaster_QNAME, NumberSeriesMaster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryUpdate")
    public JAXBElement<InventoryUpdate> createInventoryUpdate(InventoryUpdate value) {
        return new JAXBElement<InventoryUpdate>(_InventoryUpdate_QNAME, InventoryUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionSalesPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfTransactionSalesPerson")
    public JAXBElement<ArrayOfTransactionSalesPerson> createArrayOfTransactionSalesPerson(ArrayOfTransactionSalesPerson value) {
        return new JAXBElement<ArrayOfTransactionSalesPerson>(_ArrayOfTransactionSalesPerson_QNAME, ArrayOfTransactionSalesPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomTransactionInfoGrid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomTransactionInfoGrid")
    public JAXBElement<CustomTransactionInfoGrid> createCustomTransactionInfoGrid(CustomTransactionInfoGrid value) {
        return new JAXBElement<CustomTransactionInfoGrid>(_CustomTransactionInfoGrid_QNAME, CustomTransactionInfoGrid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPOSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfGoodsReceiptPOSerialDetail")
    public JAXBElement<ArrayOfGoodsReceiptPOSerialDetail> createArrayOfGoodsReceiptPOSerialDetail(ArrayOfGoodsReceiptPOSerialDetail value) {
        return new JAXBElement<ArrayOfGoodsReceiptPOSerialDetail>(_ArrayOfGoodsReceiptPOSerialDetail_QNAME, ArrayOfGoodsReceiptPOSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionBuy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfPromotionBuy")
    public JAXBElement<ArrayOfPromotionBuy> createArrayOfPromotionBuy(ArrayOfPromotionBuy value) {
        return new JAXBElement<ArrayOfPromotionBuy>(_ArrayOfPromotionBuy_QNAME, ArrayOfPromotionBuy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseOrderDetail")
    public JAXBElement<PurchaseOrderDetail> createPurchaseOrderDetail(PurchaseOrderDetail value) {
        return new JAXBElement<PurchaseOrderDetail>(_PurchaseOrderDetail_QNAME, PurchaseOrderDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeValidValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AttributeValidValue")
    public JAXBElement<AttributeValidValue> createAttributeValidValue(AttributeValidValue value) {
        return new JAXBElement<AttributeValidValue>(_AttributeValidValue_QNAME, AttributeValidValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTransferRequisitionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StockTransferRequisitionDetail")
    public JAXBElement<StockTransferRequisitionDetail> createStockTransferRequisitionDetail(StockTransferRequisitionDetail value) {
        return new JAXBElement<StockTransferRequisitionDetail>(_StockTransferRequisitionDetail_QNAME, StockTransferRequisitionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockTransferSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfStockTransferSerialDetail")
    public JAXBElement<ArrayOfStockTransferSerialDetail> createArrayOfStockTransferSerialDetail(ArrayOfStockTransferSerialDetail value) {
        return new JAXBElement<ArrayOfStockTransferSerialDetail>(_ArrayOfStockTransferSerialDetail_QNAME, ArrayOfStockTransferSerialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfStockTransfer")
    public JAXBElement<ArrayOfStockTransfer> createArrayOfStockTransfer(ArrayOfStockTransfer value) {
        return new JAXBElement<ArrayOfStockTransfer>(_ArrayOfStockTransfer_QNAME, ArrayOfStockTransfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsIssue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsIssue")
    public JAXBElement<GoodsIssue> createGoodsIssue(GoodsIssue value) {
        return new JAXBElement<GoodsIssue>(_GoodsIssue_QNAME, GoodsIssue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionBuy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionBuy")
    public JAXBElement<PromotionBuy> createPromotionBuy(PromotionBuy value) {
        return new JAXBElement<PromotionBuy>(_PromotionBuy_QNAME, PromotionBuy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxPeriodDefination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TaxPeriodDefination")
    public JAXBElement<TaxPeriodDefination> createTaxPeriodDefination(TaxPeriodDefination value) {
        return new JAXBElement<TaxPeriodDefination>(_TaxPeriodDefination_QNAME, TaxPeriodDefination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfProductGroupDiscount")
    public JAXBElement<ArrayOfProductGroupDiscount> createArrayOfProductGroupDiscount(ArrayOfProductGroupDiscount value) {
        return new JAXBElement<ArrayOfProductGroupDiscount>(_ArrayOfProductGroupDiscount_QNAME, ArrayOfProductGroupDiscount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionItem")
    public JAXBElement<TransactionItem> createTransactionItem(TransactionItem value) {
        return new JAXBElement<TransactionItem>(_TransactionItem_QNAME, TransactionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AttributeMaster")
    public JAXBElement<AttributeMaster> createAttributeMaster(AttributeMaster value) {
        return new JAXBElement<AttributeMaster>(_AttributeMaster_QNAME, AttributeMaster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DeliveryPackage")
    public JAXBElement<DeliveryPackage> createDeliveryPackage(DeliveryPackage value) {
        return new JAXBElement<DeliveryPackage>(_DeliveryPackage_QNAME, DeliveryPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVendorGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ArrayOfVendorGroup")
    public JAXBElement<ArrayOfVendorGroup> createArrayOfVendorGroup(ArrayOfVendorGroup value) {
        return new JAXBElement<ArrayOfVendorGroup>(_ArrayOfVendorGroup_QNAME, ArrayOfVendorGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarcodeInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BarcodeInformation")
    public JAXBElement<BarcodeInformation> createBarcodeInformation(BarcodeInformation value) {
        return new JAXBElement<BarcodeInformation>(_BarcodeInformation_QNAME, BarcodeInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayawayPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LayawayPlan")
    public JAXBElement<LayawayPlan> createLayawayPlan(LayawayPlan value) {
        return new JAXBElement<LayawayPlan>(_LayawayPlan_QNAME, LayawayPlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufacturerGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ManufacturerGroupDiscount")
    public JAXBElement<ManufacturerGroupDiscount> createManufacturerGroupDiscount(ManufacturerGroupDiscount value) {
        return new JAXBElement<ManufacturerGroupDiscount>(_ManufacturerGroupDiscount_QNAME, ManufacturerGroupDiscount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTransferBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StockTransferBatchDetail")
    public JAXBElement<StockTransferBatchDetail> createStockTransferBatchDetail(StockTransferBatchDetail value) {
        return new JAXBElement<StockTransferBatchDetail>(_StockTransferBatchDetail_QNAME, StockTransferBatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTypeAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentTypeAttribute")
    public JAXBElement<PaymentTypeAttribute> createPaymentTypeAttribute(PaymentTypeAttribute value) {
        return new JAXBElement<PaymentTypeAttribute>(_PaymentTypeAttribute_QNAME, PaymentTypeAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = Country.class)
    public JAXBElement<String> createCountryDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, Country.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetCurrency.class)
    public JAXBElement<String> createGetCurrencyId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetCurrency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReferenceNumber", scope = GoodsReturn.class)
    public JAXBElement<String> createGoodsReturnReferenceNumber(String value) {
        return new JAXBElement<String>(_GoodsReturnReferenceNumber_QNAME, String.class, GoodsReturn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = GoodsReturn.class)
    public JAXBElement<String> createGoodsReturnComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, GoodsReturn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObjectProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PropertyList", scope = UpdateMaster.class)
    public JAXBElement<ArrayOfObjectProperty> createUpdateMasterPropertyList(ArrayOfObjectProperty value) {
        return new JAXBElement<ArrayOfObjectProperty>(_UpdateMasterPropertyList_QNAME, ArrayOfObjectProperty.class, UpdateMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Serial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveSerialResult", scope = SaveSerialResponse.class)
    public JAXBElement<Serial> createSaveSerialResponseSaveSerialResult(Serial value) {
        return new JAXBElement<Serial>(_SaveSerialResponseSaveSerialResult_QNAME, Serial.class, SaveSerialResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveEmployeeResult", scope = SaveEmployeeResponse.class)
    public JAXBElement<Employee> createSaveEmployeeResponseSaveEmployeeResult(Employee value) {
        return new JAXBElement<Employee>(_SaveEmployeeResponseSaveEmployeeResult_QNAME, Employee.class, SaveEmployeeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ToDate", scope = DiscountGroup.class)
    public JAXBElement<XMLGregorianCalendar> createDiscountGroupToDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DiscountGroupToDate_QNAME, XMLGregorianCalendar.class, DiscountGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetQueueByWarehouseResult", scope = GetQueueByWarehouseResponse.class)
    public JAXBElement<ArrayOfIntegrationQueue> createGetQueueByWarehouseResponseGetQueueByWarehouseResult(ArrayOfIntegrationQueue value) {
        return new JAXBElement<ArrayOfIntegrationQueue>(_GetQueueByWarehouseResponseGetQueueByWarehouseResult_QNAME, ArrayOfIntegrationQueue.class, GetQueueByWarehouseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveGoodsReturnResult", scope = SaveGoodsReturnResponse.class)
    public JAXBElement<GoodsReturn> createSaveGoodsReturnResponseSaveGoodsReturnResult(GoodsReturn value) {
        return new JAXBElement<GoodsReturn>(_SaveGoodsReturnResponseSaveGoodsReturnResult_QNAME, GoodsReturn.class, SaveGoodsReturnResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVendorGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveVendorGroupListResult", scope = SaveVendorGroupListResponse.class)
    public JAXBElement<ArrayOfVendorGroup> createSaveVendorGroupListResponseSaveVendorGroupListResult(ArrayOfVendorGroup value) {
        return new JAXBElement<ArrayOfVendorGroup>(_SaveVendorGroupListResponseSaveVendorGroupListResult_QNAME, ArrayOfVendorGroup.class, SaveVendorGroupListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUPCTranslation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RemoveAlternateUPCResult", scope = RemoveAlternateUPCResponse.class)
    public JAXBElement<ArrayOfUPCTranslation> createRemoveAlternateUPCResponseRemoveAlternateUPCResult(ArrayOfUPCTranslation value) {
        return new JAXBElement<ArrayOfUPCTranslation>(_RemoveAlternateUPCResponseRemoveAlternateUPCResult_QNAME, ArrayOfUPCTranslation.class, RemoveAlternateUPCResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UoM", scope = UPCTranslation.class)
    public JAXBElement<String> createUPCTranslationUoM(String value) {
        return new JAXBElement<String>(_UPCTranslationUoM_QNAME, String.class, UPCTranslation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveProductGroupListResult", scope = SaveProductGroupListResponse.class)
    public JAXBElement<ArrayOfProductGroup> createSaveProductGroupListResponseSaveProductGroupListResult(ArrayOfProductGroup value) {
        return new JAXBElement<ArrayOfProductGroup>(_SaveProductGroupListResponseSaveProductGroupListResult_QNAME, ArrayOfProductGroup.class, SaveProductGroupListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ManufacturerSerialNumber", scope = Serial.class)
    public JAXBElement<String> createSerialManufacturerSerialNumber(String value) {
        return new JAXBElement<String>(_SerialManufacturerSerialNumber_QNAME, String.class, Serial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AdmissionDate", scope = Serial.class)
    public JAXBElement<XMLGregorianCalendar> createSerialAdmissionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialAdmissionDate_QNAME, XMLGregorianCalendar.class, Serial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = Serial.class)
    public JAXBElement<String> createSerialDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, Serial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SystemNumber", scope = Serial.class)
    public JAXBElement<Integer> createSerialSystemNumber(Integer value) {
        return new JAXBElement<Integer>(_SerialSystemNumber_QNAME, Integer.class, Serial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ManufacturingDate", scope = Serial.class)
    public JAXBElement<XMLGregorianCalendar> createSerialManufacturingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialManufacturingDate_QNAME, XMLGregorianCalendar.class, Serial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExpirationDate", scope = Serial.class)
    public JAXBElement<XMLGregorianCalendar> createSerialExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialExpirationDate_QNAME, XMLGregorianCalendar.class, Serial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetCustomer.class)
    public JAXBElement<String> createGetCustomerId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetProductResult", scope = GetProductResponse.class)
    public JAXBElement<Product> createGetProductResponseGetProductResult(Product value) {
        return new JAXBElement<Product>(_GetProductResponseGetProductResult_QNAME, Product.class, GetProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XSearchTransactionResponse.XSearchTransactionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_SearchTransactionResult", scope = XSearchTransactionResponse.class)
    public JAXBElement<XSearchTransactionResponse.XSearchTransactionResult> createXSearchTransactionResponseXSearchTransactionResult(XSearchTransactionResponse.XSearchTransactionResult value) {
        return new JAXBElement<XSearchTransactionResponse.XSearchTransactionResult>(_XSearchTransactionResponseXSearchTransactionResult_QNAME, XSearchTransactionResponse.XSearchTransactionResult.class, XSearchTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetTaxCode.class)
    public JAXBElement<String> createGetTaxCodeId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetTaxCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseTaxCodeId", scope = Surcharge.class)
    public JAXBElement<String> createSurchargePurchaseTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargePurchaseTaxCodeId_QNAME, String.class, Surcharge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TaxCodeId", scope = Surcharge.class)
    public JAXBElement<String> createSurchargeTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargeTaxCodeId_QNAME, String.class, Surcharge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeValidValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ValidValueItems", scope = SaleAttribute.class)
    public JAXBElement<ArrayOfAttributeValidValue> createSaleAttributeValidValueItems(ArrayOfAttributeValidValue value) {
        return new JAXBElement<ArrayOfAttributeValidValue>(_SaleAttributeValidValueItems_QNAME, ArrayOfAttributeValidValue.class, SaleAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RegExPattern", scope = SaleAttribute.class)
    public JAXBElement<String> createSaleAttributeRegExPattern(String value) {
        return new JAXBElement<String>(_SaleAttributeRegExPattern_QNAME, String.class, SaleAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DefaultValue", scope = SaleAttribute.class)
    public JAXBElement<String> createSaleAttributeDefaultValue(String value) {
        return new JAXBElement<String>(_SaleAttributeDefaultValue_QNAME, String.class, SaleAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCustomerGroupResult", scope = SaveCustomerGroupResponse.class)
    public JAXBElement<CustomerGroup> createSaveCustomerGroupResponseSaveCustomerGroupResult(CustomerGroup value) {
        return new JAXBElement<CustomerGroup>(_SaveCustomerGroupResponseSaveCustomerGroupResult_QNAME, CustomerGroup.class, SaveCustomerGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XGetTransaction.class)
    public JAXBElement<String> createXGetTransactionApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XGetTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XGetTransaction.class)
    public JAXBElement<String> createXGetTransactionUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XGetTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "loyaltyId", scope = GetMonthlyPointsSummary.class)
    public JAXBElement<String> createGetMonthlyPointsSummaryLoyaltyId(String value) {
        return new JAXBElement<String>(_GetMonthlyPointsSummaryLoyaltyId_QNAME, String.class, GetMonthlyPointsSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_AuthorizePaymentResult", scope = XAuthorizePaymentResponse.class)
    public JAXBElement<PaymentResponse> createXAuthorizePaymentResponseXAuthorizePaymentResult(PaymentResponse value) {
        return new JAXBElement<PaymentResponse>(_XAuthorizePaymentResponseXAuthorizePaymentResult_QNAME, PaymentResponse.class, XAuthorizePaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address", scope = Warehouse.class)
    public JAXBElement<Address> createWarehouseAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, Warehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceListId", scope = Warehouse.class)
    public JAXBElement<String> createWarehousePriceListId(String value) {
        return new JAXBElement<String>(_WarehousePriceListId_QNAME, String.class, Warehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = Warehouse.class)
    public JAXBElement<String> createWarehouseDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, Warehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InTransitWarehouseId", scope = Warehouse.class)
    public JAXBElement<String> createWarehouseInTransitWarehouseId(String value) {
        return new JAXBElement<String>(_WarehouseInTransitWarehouseId_QNAME, String.class, Warehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseTaxCodeId", scope = Warehouse.class)
    public JAXBElement<String> createWarehousePurchaseTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargePurchaseTaxCodeId_QNAME, String.class, Warehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesTaxCodeId", scope = Warehouse.class)
    public JAXBElement<String> createWarehouseSalesTaxCodeId(String value) {
        return new JAXBElement<String>(_WarehouseSalesTaxCodeId_QNAME, String.class, Warehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "warehouseId", scope = GetQueueByWarehouseWithoutStatusUpdate.class)
    public JAXBElement<String> createGetQueueByWarehouseWithoutStatusUpdateWarehouseId(String value) {
        return new JAXBElement<String>(_GetQueueByWarehouseWithoutStatusUpdateWarehouseId_QNAME, String.class, GetQueueByWarehouseWithoutStatusUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMonthlyPointsSummaryResponse.GetMonthlyPointsSummaryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetMonthlyPointsSummaryResult", scope = GetMonthlyPointsSummaryResponse.class)
    public JAXBElement<GetMonthlyPointsSummaryResponse.GetMonthlyPointsSummaryResult> createGetMonthlyPointsSummaryResponseGetMonthlyPointsSummaryResult(GetMonthlyPointsSummaryResponse.GetMonthlyPointsSummaryResult value) {
        return new JAXBElement<GetMonthlyPointsSummaryResponse.GetMonthlyPointsSummaryResult>(_GetMonthlyPointsSummaryResponseGetMonthlyPointsSummaryResult_QNAME, GetMonthlyPointsSummaryResponse.GetMonthlyPointsSummaryResult.class, GetMonthlyPointsSummaryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLayawayPlanSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LayawayPlanSurchargeList", scope = LayawayPlan.class)
    public JAXBElement<ArrayOfLayawayPlanSurcharge> createLayawayPlanLayawayPlanSurchargeList(ArrayOfLayawayPlanSurcharge value) {
        return new JAXBElement<ArrayOfLayawayPlanSurcharge>(_LayawayPlanLayawayPlanSurchargeList_QNAME, ArrayOfLayawayPlanSurcharge.class, LayawayPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = LayawayPlan.class)
    public JAXBElement<String> createLayawayPlanDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, LayawayPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SurchargeId2", scope = LayawayPlan.class)
    public JAXBElement<String> createLayawayPlanSurchargeId2(String value) {
        return new JAXBElement<String>(_LayawayPlanSurchargeId2_QNAME, String.class, LayawayPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SurchargeId1", scope = LayawayPlan.class)
    public JAXBElement<String> createLayawayPlanSurchargeId1(String value) {
        return new JAXBElement<String>(_LayawayPlanSurchargeId1_QNAME, String.class, LayawayPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = LayawayPlan.class)
    public JAXBElement<String> createLayawayPlanId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, LayawayPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SurchargeId3", scope = LayawayPlan.class)
    public JAXBElement<String> createLayawayPlanSurchargeId3(String value) {
        return new JAXBElement<String>(_LayawayPlanSurchargeId3_QNAME, String.class, LayawayPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "inventoryItemList", scope = SaveInventoryItems.class)
    public JAXBElement<ArrayOfInventoryItem> createSaveInventoryItemsInventoryItemList(ArrayOfInventoryItem value) {
        return new JAXBElement<ArrayOfInventoryItem>(_SaveInventoryItemsInventoryItemList_QNAME, ArrayOfInventoryItem.class, SaveInventoryItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_SaveTransactionResult", scope = XSaveTransactionResponse.class)
    public JAXBElement<PostTransaction> createXSaveTransactionResponseXSaveTransactionResult(PostTransaction value) {
        return new JAXBElement<PostTransaction>(_XSaveTransactionResponseXSaveTransactionResult_QNAME, PostTransaction.class, XSaveTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSummery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_GetPointsSummaryResult", scope = XGetPointsSummaryResponse.class)
    public JAXBElement<CustomerSummery> createXGetPointsSummaryResponseXGetPointsSummaryResult(CustomerSummery value) {
        return new JAXBElement<CustomerSummery>(_XGetPointsSummaryResponseXGetPointsSummaryResult_QNAME, CustomerSummery.class, XGetPointsSummaryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "countryId", scope = GetState.class)
    public JAXBElement<String> createGetStateCountryId(String value) {
        return new JAXBElement<String>(_GetStateCountryId_QNAME, String.class, GetState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetState.class)
    public JAXBElement<String> createGetStateId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "countryId", scope = DeleteState.class)
    public JAXBElement<String> createDeleteStateCountryId(String value) {
        return new JAXBElement<String>(_GetStateCountryId_QNAME, String.class, DeleteState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteState.class)
    public JAXBElement<String> createDeleteStateId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetInventoryOfProductResult", scope = GetInventoryOfProductResponse.class)
    public JAXBElement<ArrayOfInventoryItem> createGetInventoryOfProductResponseGetInventoryOfProductResult(ArrayOfInventoryItem value) {
        return new JAXBElement<ArrayOfInventoryItem>(_GetInventoryOfProductResponseGetInventoryOfProductResult_QNAME, ArrayOfInventoryItem.class, GetInventoryOfProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UpdateMasterObjectResult", scope = UpdateMasterObjectResponse.class)
    public JAXBElement<UpdateMaster> createUpdateMasterObjectResponseUpdateMasterObjectResult(UpdateMaster value) {
        return new JAXBElement<UpdateMaster>(_UpdateMasterObjectResponseUpdateMasterObjectResult_QNAME, UpdateMaster.class, UpdateMasterObjectResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "customerList", scope = SaveCustomerList.class)
    public JAXBElement<ArrayOfCustomer> createSaveCustomerListCustomerList(ArrayOfCustomer value) {
        return new JAXBElement<ArrayOfCustomer>(_SaveCustomerListCustomerList_QNAME, ArrayOfCustomer.class, SaveCustomerList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetUOMResult", scope = GetUOMResponse.class)
    public JAXBElement<UOM> createGetUOMResponseGetUOMResult(UOM value) {
        return new JAXBElement<UOM>(_GetUOMResponseGetUOMResult_QNAME, UOM.class, GetUOMResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetVendor.class)
    public JAXBElement<String> createGetVendorId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetVendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ToBusinessDate", scope = TransactionServerParameters.class)
    public JAXBElement<String> createTransactionServerParametersToBusinessDate(String value) {
        return new JAXBElement<String>(_TransactionServerParametersToBusinessDate_QNAME, String.class, TransactionServerParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerId", scope = TransactionServerParameters.class)
    public JAXBElement<String> createTransactionServerParametersCustomerId(String value) {
        return new JAXBElement<String>(_TransactionServerParametersCustomerId_QNAME, String.class, TransactionServerParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionId", scope = TransactionServerParameters.class)
    public JAXBElement<String> createTransactionServerParametersTransactionId(String value) {
        return new JAXBElement<String>(_TransactionServerParametersTransactionId_QNAME, String.class, TransactionServerParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FromBusinessDate", scope = TransactionServerParameters.class)
    public JAXBElement<String> createTransactionServerParametersFromBusinessDate(String value) {
        return new JAXBElement<String>(_TransactionServerParametersFromBusinessDate_QNAME, String.class, TransactionServerParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUOMGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "uomGroupList", scope = SaveUOMGroupList.class)
    public JAXBElement<ArrayOfUOMGroup> createSaveUOMGroupListUomGroupList(ArrayOfUOMGroup value) {
        return new JAXBElement<ArrayOfUOMGroup>(_SaveUOMGroupListUomGroupList_QNAME, ArrayOfUOMGroup.class, SaveUOMGroupList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "inventoryCountDTO", scope = SaveInventoryCounting.class)
    public JAXBElement<InventoryCount> createSaveInventoryCountingInventoryCountDTO(InventoryCount value) {
        return new JAXBElement<InventoryCount>(_SaveInventoryCountingInventoryCountDTO_QNAME, InventoryCount.class, SaveInventoryCounting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetCurrencyResult", scope = GetCurrencyResponse.class)
    public JAXBElement<Currency> createGetCurrencyResponseGetCurrencyResult(Currency value) {
        return new JAXBElement<Currency>(_GetCurrencyResponseGetCurrencyResult_QNAME, Currency.class, GetCurrencyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetAttributeResult", scope = GetAttributeResponse.class)
    public JAXBElement<AttributeMaster> createGetAttributeResponseGetAttributeResult(AttributeMaster value) {
        return new JAXBElement<AttributeMaster>(_GetAttributeResponseGetAttributeResult_QNAME, AttributeMaster.class, GetAttributeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "employee", scope = SaveEmployee.class)
    public JAXBElement<Employee> createSaveEmployeeEmployee(Employee value) {
        return new JAXBElement<Employee>(_SaveEmployeeEmployee_QNAME, Employee.class, SaveEmployee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetSaleAttribute.class)
    public JAXBElement<String> createGetSaleAttributeId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetSaleAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "warehouseId", scope = ClearAllInventory.class)
    public JAXBElement<String> createClearAllInventoryWarehouseId(String value) {
        return new JAXBElement<String>(_GetQueueByWarehouseWithoutStatusUpdateWarehouseId_QNAME, String.class, ClearAllInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWarehouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "warehouseList", scope = SaveWarehouseList.class)
    public JAXBElement<ArrayOfWarehouse> createSaveWarehouseListWarehouseList(ArrayOfWarehouse value) {
        return new JAXBElement<ArrayOfWarehouse>(_SaveWarehouseListWarehouseList_QNAME, ArrayOfWarehouse.class, SaveWarehouseList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Country }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "country", scope = SaveCountry.class)
    public JAXBElement<Country> createSaveCountryCountry(Country value) {
        return new JAXBElement<Country>(_SaveCountryCountry_QNAME, Country.class, SaveCountry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "HandheldDeviceId", scope = GoodsReceiptPO.class)
    public JAXBElement<String> createGoodsReceiptPOHandheldDeviceId(String value) {
        return new JAXBElement<String>(_GoodsReceiptPOHandheldDeviceId_QNAME, String.class, GoodsReceiptPO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptNumber", scope = GoodsReceiptPO.class)
    public JAXBElement<String> createGoodsReceiptPOGoodsReceiptNumber(String value) {
        return new JAXBElement<String>(_GoodsReceiptPOGoodsReceiptNumber_QNAME, String.class, GoodsReceiptPO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = GoodsReceiptPO.class)
    public JAXBElement<String> createGoodsReceiptPOComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, GoodsReceiptPO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "vendorGroup", scope = SaveVendorGroup.class)
    public JAXBElement<VendorGroup> createSaveVendorGroupVendorGroup(VendorGroup value) {
        return new JAXBElement<VendorGroup>(_SaveVendorGroupVendorGroup_QNAME, VendorGroup.class, SaveVendorGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetTaxCodeResult", scope = GetTaxCodeResponse.class)
    public JAXBElement<TaxCode> createGetTaxCodeResponseGetTaxCodeResult(TaxCode value) {
        return new JAXBElement<TaxCode>(_GetTaxCodeResponseGetTaxCodeResult_QNAME, TaxCode.class, GetTaxCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Surcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "surcharge", scope = SaveSurcharge.class)
    public JAXBElement<Surcharge> createSaveSurchargeSurcharge(Surcharge value) {
        return new JAXBElement<Surcharge>(_SaveSurchargeSurcharge_QNAME, Surcharge.class, SaveSurcharge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSerial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveSerialListResult", scope = SaveSerialListResponse.class)
    public JAXBElement<ArrayOfSerial> createSaveSerialListResponseSaveSerialListResult(ArrayOfSerial value) {
        return new JAXBElement<ArrayOfSerial>(_SaveSerialListResponseSaveSerialListResult_QNAME, ArrayOfSerial.class, SaveSerialListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsIssue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveGoodsIssueResult", scope = SaveGoodsIssueResponse.class)
    public JAXBElement<GoodsIssue> createSaveGoodsIssueResponseSaveGoodsIssueResult(GoodsIssue value) {
        return new JAXBElement<GoodsIssue>(_SaveGoodsIssueResponseSaveGoodsIssueResult_QNAME, GoodsIssue.class, SaveGoodsIssueResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsIssue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "goodsIssue", scope = SaveGoodsIssue.class)
    public JAXBElement<GoodsIssue> createSaveGoodsIssueGoodsIssue(GoodsIssue value) {
        return new JAXBElement<GoodsIssue>(_SaveGoodsIssueGoodsIssue_QNAME, GoodsIssue.class, SaveGoodsIssue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GiftCertificateList", scope = PostTransaction.class)
    public JAXBElement<ArrayOfPostTransactionItem> createPostTransactionGiftCertificateList(ArrayOfPostTransactionItem value) {
        return new JAXBElement<ArrayOfPostTransactionItem>(_PostTransactionGiftCertificateList_QNAME, ArrayOfPostTransactionItem.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerRefNumber", scope = PostTransaction.class)
    public JAXBElement<String> createPostTransactionCustomerRefNumber(String value) {
        return new JAXBElement<String>(_PostTransactionCustomerRefNumber_QNAME, String.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SurchargeList", scope = PostTransaction.class)
    public JAXBElement<ArrayOfTransactionSurcharge> createPostTransactionSurchargeList(ArrayOfTransactionSurcharge value) {
        return new JAXBElement<ArrayOfTransactionSurcharge>(_PostTransactionSurchargeList_QNAME, ArrayOfTransactionSurcharge.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfARPaymentItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ARPaymentsList", scope = PostTransaction.class)
    public JAXBElement<ArrayOfARPaymentItem> createPostTransactionARPaymentsList(ArrayOfARPaymentItem value) {
        return new JAXBElement<ArrayOfARPaymentItem>(_PostTransactionARPaymentsList_QNAME, ArrayOfARPaymentItem.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionId", scope = PostTransaction.class)
    public JAXBElement<String> createPostTransactionTransactionId(String value) {
        return new JAXBElement<String>(_TransactionServerParametersTransactionId_QNAME, String.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LayawayPlanId", scope = PostTransaction.class)
    public JAXBElement<String> createPostTransactionLayawayPlanId(String value) {
        return new JAXBElement<String>(_PostTransactionLayawayPlanId_QNAME, String.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CurrentNumberOfSeries", scope = PostTransaction.class)
    public JAXBElement<String> createPostTransactionCurrentNumberOfSeries(String value) {
        return new JAXBElement<String>(_PostTransactionCurrentNumberOfSeries_QNAME, String.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DeliveryItemList", scope = PostTransaction.class)
    public JAXBElement<ArrayOfPostTransactionItem> createPostTransactionDeliveryItemList(ArrayOfPostTransactionItem value) {
        return new JAXBElement<ArrayOfPostTransactionItem>(_PostTransactionDeliveryItemList_QNAME, ArrayOfPostTransactionItem.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaleItemList", scope = PostTransaction.class)
    public JAXBElement<ArrayOfPostTransactionItem> createPostTransactionSaleItemList(ArrayOfPostTransactionItem value) {
        return new JAXBElement<ArrayOfPostTransactionItem>(_PostTransactionSaleItemList_QNAME, ArrayOfPostTransactionItem.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesOrderList", scope = PostTransaction.class)
    public JAXBElement<ArrayOfPostTransactionItem> createPostTransactionSalesOrderList(ArrayOfPostTransactionItem value) {
        return new JAXBElement<ArrayOfPostTransactionItem>(_PostTransactionSalesOrderList_QNAME, ArrayOfPostTransactionItem.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ContactId", scope = PostTransaction.class)
    public JAXBElement<String> createPostTransactionContactId(String value) {
        return new JAXBElement<String>(_PostTransactionContactId_QNAME, String.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CouponSerialNumber", scope = PostTransaction.class)
    public JAXBElement<String> createPostTransactionCouponSerialNumber(String value) {
        return new JAXBElement<String>(_PostTransactionCouponSerialNumber_QNAME, String.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionSalesPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesPerson", scope = PostTransaction.class)
    public JAXBElement<TransactionSalesPerson> createPostTransactionSalesPerson(TransactionSalesPerson value) {
        return new JAXBElement<TransactionSalesPerson>(_PostTransactionSalesPerson_QNAME, TransactionSalesPerson.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RefundItemList", scope = PostTransaction.class)
    public JAXBElement<ArrayOfPostTransactionItem> createPostTransactionRefundItemList(ArrayOfPostTransactionItem value) {
        return new JAXBElement<ArrayOfPostTransactionItem>(_PostTransactionRefundItemList_QNAME, ArrayOfPostTransactionItem.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Quotation", scope = PostTransaction.class)
    public JAXBElement<ArrayOfPostTransactionItem> createPostTransactionQuotation(ArrayOfPostTransactionItem value) {
        return new JAXBElement<ArrayOfPostTransactionItem>(_PostTransactionQuotation_QNAME, ArrayOfPostTransactionItem.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CouponId", scope = PostTransaction.class)
    public JAXBElement<String> createPostTransactionCouponId(String value) {
        return new JAXBElement<String>(_PostTransactionCouponId_QNAME, String.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExchangeItemList", scope = PostTransaction.class)
    public JAXBElement<ArrayOfPostTransactionItem> createPostTransactionExchangeItemList(ArrayOfPostTransactionItem value) {
        return new JAXBElement<ArrayOfPostTransactionItem>(_PostTransactionExchangeItemList_QNAME, ArrayOfPostTransactionItem.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyId", scope = PostTransaction.class)
    public JAXBElement<String> createPostTransactionLoyaltyId(String value) {
        return new JAXBElement<String>(_PostTransactionLoyaltyId_QNAME, String.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LayawayItemList", scope = PostTransaction.class)
    public JAXBElement<ArrayOfPostTransactionItem> createPostTransactionLayawayItemList(ArrayOfPostTransactionItem value) {
        return new JAXBElement<ArrayOfPostTransactionItem>(_PostTransactionLayawayItemList_QNAME, ArrayOfPostTransactionItem.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DeliveryLocation", scope = PostTransaction.class)
    public JAXBElement<String> createPostTransactionDeliveryLocation(String value) {
        return new JAXBElement<String>(_PostTransactionDeliveryLocation_QNAME, String.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionSaleAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionSaleAttributes", scope = PostTransaction.class)
    public JAXBElement<ArrayOfPostTransactionSaleAttribute> createPostTransactionTransactionSaleAttributes(ArrayOfPostTransactionSaleAttribute value) {
        return new JAXBElement<ArrayOfPostTransactionSaleAttribute>(_PostTransactionTransactionSaleAttributes_QNAME, ArrayOfPostTransactionSaleAttribute.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Payments", scope = PostTransaction.class)
    public JAXBElement<ArrayOfTransactionPayment> createPostTransactionPayments(ArrayOfTransactionPayment value) {
        return new JAXBElement<ArrayOfTransactionPayment>(_PostTransactionPayments_QNAME, ArrayOfTransactionPayment.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CouponIssueList", scope = PostTransaction.class)
    public JAXBElement<ArrayOfPostTransactionItem> createPostTransactionCouponIssueList(ArrayOfPostTransactionItem value) {
        return new JAXBElement<ArrayOfPostTransactionItem>(_PostTransactionCouponIssueList_QNAME, ArrayOfPostTransactionItem.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = PostTransaction.class)
    public JAXBElement<String> createPostTransactionComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, PostTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UOMGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveUOMGroupResult", scope = SaveUOMGroupResponse.class)
    public JAXBElement<UOMGroup> createSaveUOMGroupResponseSaveUOMGroupResult(UOMGroup value) {
        return new JAXBElement<UOMGroup>(_SaveUOMGroupResponseSaveUOMGroupResult_QNAME, UOMGroup.class, SaveUOMGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUPCTranslation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "alternateUPCList", scope = RemoveAlternateUPC.class)
    public JAXBElement<ArrayOfUPCTranslation> createRemoveAlternateUPCAlternateUPCList(ArrayOfUPCTranslation value) {
        return new JAXBElement<ArrayOfUPCTranslation>(_RemoveAlternateUPCAlternateUPCList_QNAME, ArrayOfUPCTranslation.class, RemoveAlternateUPC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteVendor.class)
    public JAXBElement<String> createDeleteVendorId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteVendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionSalesPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesPersons", scope = ARPaymentItem.class)
    public JAXBElement<ArrayOfTransactionSalesPerson> createARPaymentItemSalesPersons(ArrayOfTransactionSalesPerson value) {
        return new JAXBElement<ArrayOfTransactionSalesPerson>(_ARPaymentItemSalesPersons_QNAME, ArrayOfTransactionSalesPerson.class, ARPaymentItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "OriginalDocumentId", scope = ARPaymentItem.class)
    public JAXBElement<String> createARPaymentItemOriginalDocumentId(String value) {
        return new JAXBElement<String>(_ARPaymentItemOriginalDocumentId_QNAME, String.class, ARPaymentItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceiptPO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "goodsReceiptPO", scope = SaveGoodsReceiptPO.class)
    public JAXBElement<GoodsReceiptPO> createSaveGoodsReceiptPOGoodsReceiptPO(GoodsReceiptPO value) {
        return new JAXBElement<GoodsReceiptPO>(_SaveGoodsReceiptPOGoodsReceiptPO_QNAME, GoodsReceiptPO.class, SaveGoodsReceiptPO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMId", scope = PromotionGet.class)
    public JAXBElement<String> createPromotionGetUOMId(String value) {
        return new JAXBElement<String>(_PromotionGetUOMId_QNAME, String.class, PromotionGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSerial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SerialList", scope = SaveSerialList.class)
    public JAXBElement<ArrayOfSerial> createSaveSerialListSerialList(ArrayOfSerial value) {
        return new JAXBElement<ArrayOfSerial>(_SaveSerialListSerialList_QNAME, ArrayOfSerial.class, SaveSerialList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveProductGroupResult", scope = SaveProductGroupResponse.class)
    public JAXBElement<ProductGroup> createSaveProductGroupResponseSaveProductGroupResult(ProductGroup value) {
        return new JAXBElement<ProductGroup>(_SaveProductGroupResponseSaveProductGroupResult_QNAME, ProductGroup.class, SaveProductGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "inventoryUpdateList", scope = SaveInventoryUpdates.class)
    public JAXBElement<ArrayOfInventoryUpdate> createSaveInventoryUpdatesInventoryUpdateList(ArrayOfInventoryUpdate value) {
        return new JAXBElement<ArrayOfInventoryUpdate>(_SaveInventoryUpdatesInventoryUpdateList_QNAME, ArrayOfInventoryUpdate.class, SaveInventoryUpdates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionSalesPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesPersons", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionSalesPerson> createTransactionSalesPersons(ArrayOfTransactionSalesPerson value) {
        return new JAXBElement<ArrayOfTransactionSalesPerson>(_ARPaymentItemSalesPersons_QNAME, ArrayOfTransactionSalesPerson.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "QuotationItems", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionItem> createTransactionQuotationItems(ArrayOfTransactionItem value) {
        return new JAXBElement<ArrayOfTransactionItem>(_TransactionQuotationItems_QNAME, ArrayOfTransactionItem.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerRefNumber", scope = Transaction.class)
    public JAXBElement<String> createTransactionCustomerRefNumber(String value) {
        return new JAXBElement<String>(_PostTransactionCustomerRefNumber_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DeliveryItems", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionItem> createTransactionDeliveryItems(ArrayOfTransactionItem value) {
        return new JAXBElement<ArrayOfTransactionItem>(_TransactionDeliveryItems_QNAME, ArrayOfTransactionItem.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "POSId", scope = Transaction.class)
    public JAXBElement<String> createTransactionPOSId(String value) {
        return new JAXBElement<String>(_TransactionPOSId_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StoreId", scope = Transaction.class)
    public JAXBElement<String> createTransactionStoreId(String value) {
        return new JAXBElement<String>(_TransactionStoreId_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerId", scope = Transaction.class)
    public JAXBElement<String> createTransactionCustomerId(String value) {
        return new JAXBElement<String>(_TransactionServerParametersCustomerId_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionId", scope = Transaction.class)
    public JAXBElement<String> createTransactionTransactionId(String value) {
        return new JAXBElement<String>(_TransactionServerParametersTransactionId_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TillId", scope = Transaction.class)
    public JAXBElement<String> createTransactionTillId(String value) {
        return new JAXBElement<String>(_TransactionTillId_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RefundItems", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionItem> createTransactionRefundItems(ArrayOfTransactionItem value) {
        return new JAXBElement<ArrayOfTransactionItem>(_TransactionRefundItems_QNAME, ArrayOfTransactionItem.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Surcharges", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionSurcharge> createTransactionSurcharges(ArrayOfTransactionSurcharge value) {
        return new JAXBElement<ArrayOfTransactionSurcharge>(_TransactionSurcharges_QNAME, ArrayOfTransactionSurcharge.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ContactId", scope = Transaction.class)
    public JAXBElement<String> createTransactionContactId(String value) {
        return new JAXBElement<String>(_PostTransactionContactId_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Layaways", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionItem> createTransactionLayaways(ArrayOfTransactionItem value) {
        return new JAXBElement<ArrayOfTransactionItem>(_TransactionLayaways_QNAME, ArrayOfTransactionItem.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "OrderItems", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionItem> createTransactionOrderItems(ArrayOfTransactionItem value) {
        return new JAXBElement<ArrayOfTransactionItem>(_TransactionOrderItems_QNAME, ArrayOfTransactionItem.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "WarehouseId", scope = Transaction.class)
    public JAXBElement<String> createTransactionWarehouseId(String value) {
        return new JAXBElement<String>(_TransactionWarehouseId_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionPrinting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionPrintingInformation", scope = Transaction.class)
    public JAXBElement<TransactionPrinting> createTransactionTransactionPrintingInformation(TransactionPrinting value) {
        return new JAXBElement<TransactionPrinting>(_TransactionTransactionPrintingInformation_QNAME, TransactionPrinting.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Key", scope = Transaction.class)
    public JAXBElement<String> createTransactionKey(String value) {
        return new JAXBElement<String>(_TransactionKey_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GiftCertificates", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionItem> createTransactionGiftCertificates(ArrayOfTransactionItem value) {
        return new JAXBElement<ArrayOfTransactionItem>(_TransactionGiftCertificates_QNAME, ArrayOfTransactionItem.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfARPaymentItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ARPaymentItems", scope = Transaction.class)
    public JAXBElement<ArrayOfARPaymentItem> createTransactionARPaymentItems(ArrayOfARPaymentItem value) {
        return new JAXBElement<ArrayOfARPaymentItem>(_TransactionARPaymentItems_QNAME, ArrayOfARPaymentItem.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LayawaysCancellation", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionItem> createTransactionLayawaysCancellation(ArrayOfTransactionItem value) {
        return new JAXBElement<ArrayOfTransactionItem>(_TransactionLayawaysCancellation_QNAME, ArrayOfTransactionItem.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionSaleAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionSaleAttributes", scope = Transaction.class)
    public JAXBElement<ArrayOfPostTransactionSaleAttribute> createTransactionTransactionSaleAttributes(ArrayOfPostTransactionSaleAttribute value) {
        return new JAXBElement<ArrayOfPostTransactionSaleAttribute>(_PostTransactionTransactionSaleAttributes_QNAME, ArrayOfPostTransactionSaleAttribute.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Payments", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionPayment> createTransactionPayments(ArrayOfTransactionPayment value) {
        return new JAXBElement<ArrayOfTransactionPayment>(_PostTransactionPayments_QNAME, ArrayOfTransactionPayment.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaleItems", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionItem> createTransactionSaleItems(ArrayOfTransactionItem value) {
        return new JAXBElement<ArrayOfTransactionItem>(_TransactionSaleItems_QNAME, ArrayOfTransactionItem.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaleExchangeItems", scope = Transaction.class)
    public JAXBElement<ArrayOfTransactionItem> createTransactionSaleExchangeItems(ArrayOfTransactionItem value) {
        return new JAXBElement<ArrayOfTransactionItem>(_TransactionSaleExchangeItems_QNAME, ArrayOfTransactionItem.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserId", scope = Transaction.class)
    public JAXBElement<String> createTransactionUserId(String value) {
        return new JAXBElement<String>(_TransactionUserId_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = Transaction.class)
    public JAXBElement<String> createTransactionComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, Transaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "transactionId", scope = ValidateLoyaltyPortalCustomer.class)
    public JAXBElement<String> createValidateLoyaltyPortalCustomerTransactionId(String value) {
        return new JAXBElement<String>(_ValidateLoyaltyPortalCustomerTransactionId_QNAME, String.class, ValidateLoyaltyPortalCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "loyaltyId", scope = ValidateLoyaltyPortalCustomer.class)
    public JAXBElement<String> createValidateLoyaltyPortalCustomerLoyaltyId(String value) {
        return new JAXBElement<String>(_GetMonthlyPointsSummaryLoyaltyId_QNAME, String.class, ValidateLoyaltyPortalCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = SecurityRights.class)
    public JAXBElement<String> createSecurityRightsDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, SecurityRights.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "goodsReceipt", scope = SaveGoodsReceipt.class)
    public JAXBElement<GoodsReceipt> createSaveGoodsReceiptGoodsReceipt(GoodsReceipt value) {
        return new JAXBElement<GoodsReceipt>(_SaveGoodsReceiptGoodsReceipt_QNAME, GoodsReceipt.class, SaveGoodsReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUPCTranslation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "alternateUPCList", scope = SaveAlternateUPC.class)
    public JAXBElement<ArrayOfUPCTranslation> createSaveAlternateUPCAlternateUPCList(ArrayOfUPCTranslation value) {
        return new JAXBElement<ArrayOfUPCTranslation>(_RemoveAlternateUPCAlternateUPCList_QNAME, ArrayOfUPCTranslation.class, SaveAlternateUPC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FaxNumber", scope = Vendor.class)
    public JAXBElement<String> createVendorFaxNumber(String value) {
        return new JAXBElement<String>(_VendorFaxNumber_QNAME, String.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AlternatePhoneNumber", scope = Vendor.class)
    public JAXBElement<String> createVendorAlternatePhoneNumber(String value) {
        return new JAXBElement<String>(_VendorAlternatePhoneNumber_QNAME, String.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address", scope = Vendor.class)
    public JAXBElement<Address> createVendorAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Email", scope = Vendor.class)
    public JAXBElement<String> createVendorEmail(String value) {
        return new JAXBElement<String>(_VendorEmail_QNAME, String.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceListId", scope = Vendor.class)
    public JAXBElement<String> createVendorPriceListId(String value) {
        return new JAXBElement<String>(_WarehousePriceListId_QNAME, String.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVendorProductMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "VendorProductList", scope = Vendor.class)
    public JAXBElement<ArrayOfVendorProductMapping> createVendorVendorProductList(ArrayOfVendorProductMapping value) {
        return new JAXBElement<ArrayOfVendorProductMapping>(_VendorVendorProductList_QNAME, ArrayOfVendorProductMapping.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TaxNumber", scope = Vendor.class)
    public JAXBElement<String> createVendorTaxNumber(String value) {
        return new JAXBElement<String>(_VendorTaxNumber_QNAME, String.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseTaxCodeId", scope = Vendor.class)
    public JAXBElement<String> createVendorPurchaseTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargePurchaseTaxCodeId_QNAME, String.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ShippingAddresses", scope = Vendor.class)
    public JAXBElement<ArrayOfAddress> createVendorShippingAddresses(ArrayOfAddress value) {
        return new JAXBElement<ArrayOfAddress>(_VendorShippingAddresses_QNAME, ArrayOfAddress.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "MobilePhone", scope = Vendor.class)
    public JAXBElement<String> createVendorMobilePhone(String value) {
        return new JAXBElement<String>(_VendorMobilePhone_QNAME, String.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PhoneNumber", scope = Vendor.class)
    public JAXBElement<String> createVendorPhoneNumber(String value) {
        return new JAXBElement<String>(_VendorPhoneNumber_QNAME, String.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BillingAddresses", scope = Vendor.class)
    public JAXBElement<ArrayOfAddress> createVendorBillingAddresses(ArrayOfAddress value) {
        return new JAXBElement<ArrayOfAddress>(_VendorBillingAddresses_QNAME, ArrayOfAddress.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "WebPage", scope = Vendor.class)
    public JAXBElement<String> createVendorWebPage(String value) {
        return new JAXBElement<String>(_VendorWebPage_QNAME, String.class, Vendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Password", scope = GetNextNumber.class)
    public JAXBElement<String> createGetNextNumberPassword(String value) {
        return new JAXBElement<String>(_GetNextNumberPassword_QNAME, String.class, GetNextNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TableName", scope = GetNextNumber.class)
    public JAXBElement<String> createGetNextNumberTableName(String value) {
        return new JAXBElement<String>(_GetNextNumberTableName_QNAME, String.class, GetNextNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserId", scope = GetNextNumber.class)
    public JAXBElement<String> createGetNextNumberUserId(String value) {
        return new JAXBElement<String>(_TransactionUserId_QNAME, String.class, GetNextNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XAuthorizePayment.class)
    public JAXBElement<String> createXAuthorizePaymentApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XAuthorizePayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XAuthorizePayment.class)
    public JAXBElement<String> createXAuthorizePaymentUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XAuthorizePayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizePaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "data", scope = XAuthorizePayment.class)
    public JAXBElement<AuthorizePaymentRequest> createXAuthorizePaymentData(AuthorizePaymentRequest value) {
        return new JAXBElement<AuthorizePaymentRequest>(_XAuthorizePaymentData_QNAME, AuthorizePaymentRequest.class, XAuthorizePayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "currencyList", scope = SaveCurrencyList.class)
    public JAXBElement<ArrayOfCurrency> createSaveCurrencyListCurrencyList(ArrayOfCurrency value) {
        return new JAXBElement<ArrayOfCurrency>(_SaveCurrencyListCurrencyList_QNAME, ArrayOfCurrency.class, SaveCurrencyList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ElectronicId", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationElectronicId(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationElectronicId_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Gender", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationGender(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationGender_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Email", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationEmail(String value) {
        return new JAXBElement<String>(_VendorEmail_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "MiddleName", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationMiddleName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationMiddleName_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyCustomerCountry", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationLoyaltyCustomerCountry(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationLoyaltyCustomerCountry_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "WebPage", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationWebPage(String value) {
        return new JAXBElement<String>(_VendorWebPage_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AnniversaryDate", scope = LoyaltyCardInformation.class)
    public JAXBElement<XMLGregorianCalendar> createLoyaltyCardInformationAnniversaryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LoyaltyCardInformationAnniversaryDate_QNAME, XMLGregorianCalendar.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Title", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationTitle(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationTitle_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "City", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationCity(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationCity_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ZipCode", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationZipCode(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationZipCode_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BirthDate", scope = LoyaltyCardInformation.class)
    public JAXBElement<XMLGregorianCalendar> createLoyaltyCardInformationBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LoyaltyCardInformationBirthDate_QNAME, XMLGregorianCalendar.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PhoneNumber", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationPhoneNumber(String value) {
        return new JAXBElement<String>(_VendorPhoneNumber_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CompanyName", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationCompanyName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationCompanyName_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Salutation", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationSalutation(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationSalutation_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FaxNumber", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationFaxNumber(String value) {
        return new JAXBElement<String>(_VendorFaxNumber_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address1", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationAddress1(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress1_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address3", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationAddress3(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress3_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address2", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationAddress2(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress2_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "MobilePhone", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationMobilePhone(String value) {
        return new JAXBElement<String>(_VendorMobilePhone_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerGroupId", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationCustomerGroupId(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationCustomerGroupId_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FirstName", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationFirstName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationFirstName_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "NickName", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationNickName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationNickName_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AlternatePhoneNumber", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationAlternatePhoneNumber(String value) {
        return new JAXBElement<String>(_VendorAlternatePhoneNumber_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyCustomerState", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationLoyaltyCustomerState(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationLoyaltyCustomerState_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyId", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationLoyaltyId(String value) {
        return new JAXBElement<String>(_PostTransactionLoyaltyId_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LastName", scope = LoyaltyCardInformation.class)
    public JAXBElement<String> createLoyaltyCardInformationLastName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationLastName_QNAME, String.class, LoyaltyCardInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteAttribute.class)
    public JAXBElement<String> createDeleteAttributeId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XSyncInventory.class)
    public JAXBElement<String> createXSyncInventoryApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XSyncInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XSyncInventory.class)
    public JAXBElement<String> createXSyncInventoryUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XSyncInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XRegisterLoyaltyCustomer.class)
    public JAXBElement<String> createXRegisterLoyaltyCustomerApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XRegisterLoyaltyCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XRegisterLoyaltyCustomer.class)
    public JAXBElement<String> createXRegisterLoyaltyCustomerUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XRegisterLoyaltyCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "data", scope = XRegisterLoyaltyCustomer.class)
    public JAXBElement<Customer> createXRegisterLoyaltyCustomerData(Customer value) {
        return new JAXBElement<Customer>(_XAuthorizePaymentData_QNAME, Customer.class, XRegisterLoyaltyCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShippingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveShippingTypeListResult", scope = SaveShippingTypeListResponse.class)
    public JAXBElement<ArrayOfShippingType> createSaveShippingTypeListResponseSaveShippingTypeListResult(ArrayOfShippingType value) {
        return new JAXBElement<ArrayOfShippingType>(_SaveShippingTypeListResponseSaveShippingTypeListResult_QNAME, ArrayOfShippingType.class, SaveShippingTypeListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCodeCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "taxCodeCondition", scope = SaveTaxCodeCondition.class)
    public JAXBElement<TaxCodeCondition> createSaveTaxCodeConditionTaxCodeCondition(TaxCodeCondition value) {
        return new JAXBElement<TaxCodeCondition>(_SaveTaxCodeConditionTaxCodeCondition_QNAME, TaxCodeCondition.class, SaveTaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = State.class)
    public JAXBElement<String> createStateDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, State.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLoyaltyPrePrintedCards }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetPrePrintedLoyaltyCardsResult", scope = GetPrePrintedLoyaltyCardsResponse.class)
    public JAXBElement<ArrayOfLoyaltyPrePrintedCards> createGetPrePrintedLoyaltyCardsResponseGetPrePrintedLoyaltyCardsResult(ArrayOfLoyaltyPrePrintedCards value) {
        return new JAXBElement<ArrayOfLoyaltyPrePrintedCards>(_GetPrePrintedLoyaltyCardsResponseGetPrePrintedLoyaltyCardsResult_QNAME, ArrayOfLoyaltyPrePrintedCards.class, GetPrePrintedLoyaltyCardsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplicationSendDump }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReplicationSendDump", scope = SaveDump.class)
    public JAXBElement<ReplicationSendDump> createSaveDumpReplicationSendDump(ReplicationSendDump value) {
        return new JAXBElement<ReplicationSendDump>(_ReplicationSendDump_QNAME, ReplicationSendDump.class, SaveDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductUpsell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "upsellItemList", scope = SaveUpsellItems.class)
    public JAXBElement<ArrayOfProductUpsell> createSaveUpsellItemsUpsellItemList(ArrayOfProductUpsell value) {
        return new JAXBElement<ArrayOfProductUpsell>(_SaveUpsellItemsUpsellItemList_QNAME, ArrayOfProductUpsell.class, SaveUpsellItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BankCode", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestBankCode(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestBankCode_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "POSId", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestPOSId(String value) {
        return new JAXBElement<String>(_TransactionPOSId_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "State", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CardName", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestCardName(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestCardName_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Track2Data", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestTrack2Data(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestTrack2Data_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "OriginalReferenceNumber", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestOriginalReferenceNumber(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestOriginalReferenceNumber_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GiftCertificateNumber", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestGiftCertificateNumber(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestGiftCertificateNumber_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CardNumber", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestCardNumber(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestCardNumber_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Track1Data", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestTrack1Data(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestTrack1Data_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyId", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestLoyaltyId(String value) {
        return new JAXBElement<String>(_PostTransactionLoyaltyId_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionPaymentAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentAttributes", scope = AuthorizePaymentRequest.class)
    public JAXBElement<ArrayOfTransactionPaymentAttribute> createAuthorizePaymentRequestPaymentAttributes(ArrayOfTransactionPaymentAttribute value) {
        return new JAXBElement<ArrayOfTransactionPaymentAttribute>(_AuthorizePaymentRequestPaymentAttributes_QNAME, ArrayOfTransactionPaymentAttribute.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "City", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestCity(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationCity_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Track3Data", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestTrack3Data(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestTrack3Data_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TrackInformation", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestTrackInformation(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestTrackInformation_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ZipCode", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestZipCode(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationZipCode_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GiftCertificateId", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestGiftCertificateId(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestGiftCertificateId_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SecurityCode", scope = AuthorizePaymentRequest.class)
    public JAXBElement<String> createAuthorizePaymentRequestSecurityCode(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestSecurityCode_QNAME, String.class, AuthorizePaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxCodeCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetTaxCodeConditionsResult", scope = GetTaxCodeConditionsResponse.class)
    public JAXBElement<ArrayOfTaxCodeCondition> createGetTaxCodeConditionsResponseGetTaxCodeConditionsResult(ArrayOfTaxCodeCondition value) {
        return new JAXBElement<ArrayOfTaxCodeCondition>(_GetTaxCodeConditionsResponseGetTaxCodeConditionsResult_QNAME, ArrayOfTaxCodeCondition.class, GetTaxCodeConditionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveTaxCodeResult", scope = SaveTaxCodeResponse.class)
    public JAXBElement<TaxCode> createSaveTaxCodeResponseSaveTaxCodeResult(TaxCode value) {
        return new JAXBElement<TaxCode>(_SaveTaxCodeResponseSaveTaxCodeResult_QNAME, TaxCode.class, SaveTaxCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = DeleteCurrency.class)
    public JAXBElement<String> createDeleteCurrencyId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, DeleteCurrency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RemoveProductSurchargesResult", scope = RemoveProductSurchargesResponse.class)
    public JAXBElement<ArrayOfProductSurcharge> createRemoveProductSurchargesResponseRemoveProductSurchargesResult(ArrayOfProductSurcharge value) {
        return new JAXBElement<ArrayOfProductSurcharge>(_RemoveProductSurchargesResponseRemoveProductSurchargesResult_QNAME, ArrayOfProductSurcharge.class, RemoveProductSurchargesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeliveryPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetAllDeliveryPackageResult", scope = GetAllDeliveryPackageResponse.class)
    public JAXBElement<ArrayOfDeliveryPackage> createGetAllDeliveryPackageResponseGetAllDeliveryPackageResult(ArrayOfDeliveryPackage value) {
        return new JAXBElement<ArrayOfDeliveryPackage>(_GetAllDeliveryPackageResponseGetAllDeliveryPackageResult_QNAME, ArrayOfDeliveryPackage.class, GetAllDeliveryPackageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "taxCodeList", scope = SaveTaxCodeList.class)
    public JAXBElement<ArrayOfTaxCode> createSaveTaxCodeListTaxCodeList(ArrayOfTaxCode value) {
        return new JAXBElement<ArrayOfTaxCode>(_SaveTaxCodeListTaxCodeList_QNAME, ArrayOfTaxCode.class, SaveTaxCodeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeletePaymentType.class)
    public JAXBElement<String> createDeletePaymentTypeId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeletePaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveInventoryCountingResult", scope = SaveInventoryCountingResponse.class)
    public JAXBElement<InventoryCount> createSaveInventoryCountingResponseSaveInventoryCountingResult(InventoryCount value) {
        return new JAXBElement<InventoryCount>(_SaveInventoryCountingResponseSaveInventoryCountingResult_QNAME, InventoryCount.class, SaveInventoryCountingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetStore.class)
    public JAXBElement<String> createGetStoreId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetStore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBarCodeMask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "barcodeMaskList", scope = SaveBarCodeMaskList.class)
    public JAXBElement<ArrayOfBarCodeMask> createSaveBarCodeMaskListBarcodeMaskList(ArrayOfBarCodeMask value) {
        return new JAXBElement<ArrayOfBarCodeMask>(_SaveBarCodeMaskListBarcodeMaskList_QNAME, ArrayOfBarCodeMask.class, SaveBarCodeMaskList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TeamId", scope = Employee.class)
    public JAXBElement<String> createEmployeeTeamId(String value) {
        return new JAXBElement<String>(_EmployeeTeamId_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Email", scope = Employee.class)
    public JAXBElement<String> createEmployeeEmail(String value) {
        return new JAXBElement<String>(_VendorEmail_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "JobCodeList", scope = Employee.class)
    public JAXBElement<ArrayOfstring> createEmployeeJobCodeList(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_EmployeeJobCodeList_QNAME, ArrayOfstring.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StoreId", scope = Employee.class)
    public JAXBElement<String> createEmployeeStoreId(String value) {
        return new JAXBElement<String>(_TransactionStoreId_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "MiddleName", scope = Employee.class)
    public JAXBElement<String> createEmployeeMiddleName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationMiddleName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DepartmentId", scope = Employee.class)
    public JAXBElement<String> createEmployeeDepartmentId(String value) {
        return new JAXBElement<String>(_EmployeeDepartmentId_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "JobTitle", scope = Employee.class)
    public JAXBElement<String> createEmployeeJobTitle(String value) {
        return new JAXBElement<String>(_EmployeeJobTitle_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LastName", scope = Employee.class)
    public JAXBElement<String> createEmployeeLastName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationLastName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RetailProfileId", scope = Employee.class)
    public JAXBElement<String> createEmployeeRetailProfileId(String value) {
        return new JAXBElement<String>(_EmployeeRetailProfileId_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PositionId", scope = Employee.class)
    public JAXBElement<String> createEmployeePositionId(String value) {
        return new JAXBElement<String>(_EmployeePositionId_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coupon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCouponResult", scope = SaveCouponResponse.class)
    public JAXBElement<Coupon> createSaveCouponResponseSaveCouponResult(Coupon value) {
        return new JAXBElement<Coupon>(_SaveCouponResponseSaveCouponResult_QNAME, Coupon.class, SaveCouponResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "barCode", scope = GetBarCodeResolution.class)
    public JAXBElement<String> createGetBarCodeResolutionBarCode(String value) {
        return new JAXBElement<String>(_GetBarCodeResolutionBarCode_QNAME, String.class, GetBarCodeResolution.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "attribute", scope = SaveAttribute.class)
    public JAXBElement<AttributeMaster> createSaveAttributeAttribute(AttributeMaster value) {
        return new JAXBElement<AttributeMaster>(_SaveAttributeAttribute_QNAME, AttributeMaster.class, SaveAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "warehouseId", scope = GetInventoryOfWarehouse.class)
    public JAXBElement<String> createGetInventoryOfWarehouseWarehouseId(String value) {
        return new JAXBElement<String>(_GetQueueByWarehouseWithoutStatusUpdateWarehouseId_QNAME, String.class, GetInventoryOfWarehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productGroupId", scope = GetInventoryOfWarehouse.class)
    public JAXBElement<String> createGetInventoryOfWarehouseProductGroupId(String value) {
        return new JAXBElement<String>(_GetInventoryOfWarehouseProductGroupId_QNAME, String.class, GetInventoryOfWarehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = VendorGroup.class)
    public JAXBElement<String> createVendorGroupDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, VendorGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentTypeKey", scope = PaymentTypeAttribute.class)
    public JAXBElement<String> createPaymentTypeAttributePaymentTypeKey(String value) {
        return new JAXBElement<String>(_PaymentTypeAttributePaymentTypeKey_QNAME, String.class, PaymentTypeAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentTypeAttributeKey", scope = PaymentTypeAttribute.class)
    public JAXBElement<String> createPaymentTypeAttributePaymentTypeAttributeKey(String value) {
        return new JAXBElement<String>(_PaymentTypeAttributePaymentTypeAttributeKey_QNAME, String.class, PaymentTypeAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = PaymentTypeAttribute.class)
    public JAXBElement<String> createPaymentTypeAttributeDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, PaymentTypeAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = POS.class)
    public JAXBElement<String> createPOSDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, POS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "HardwareProfileId", scope = POS.class)
    public JAXBElement<String> createPOSHardwareProfileId(String value) {
        return new JAXBElement<String>(_POSHardwareProfileId_QNAME, String.class, POS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DepartmentId", scope = POS.class)
    public JAXBElement<String> createPOSDepartmentId(String value) {
        return new JAXBElement<String>(_EmployeeDepartmentId_QNAME, String.class, POS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerPrefix", scope = POS.class)
    public JAXBElement<String> createPOSCustomerPrefix(String value) {
        return new JAXBElement<String>(_POSCustomerPrefix_QNAME, String.class, POS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RetailProfileId", scope = POS.class)
    public JAXBElement<String> createPOSRetailProfileId(String value) {
        return new JAXBElement<String>(_EmployeeRetailProfileId_QNAME, String.class, POS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "HardwareId", scope = POS.class)
    public JAXBElement<String> createPOSHardwareId(String value) {
        return new JAXBElement<String>(_POSHardwareId_QNAME, String.class, POS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PrintProfileId", scope = POS.class)
    public JAXBElement<String> createPOSPrintProfileId(String value) {
        return new JAXBElement<String>(_POSPrintProfileId_QNAME, String.class, POS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "State", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AuthorizationCode", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentAuthorizationCode(String value) {
        return new JAXBElement<String>(_TransactionPaymentAuthorizationCode_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Name", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentName(String value) {
        return new JAXBElement<String>(_TransactionPaymentName_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SurchargeId", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentSurchargeId(String value) {
        return new JAXBElement<String>(_TransactionPaymentSurchargeId_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "OriginalReferenceNumber", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentOriginalReferenceNumber(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestOriginalReferenceNumber_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentReferenceNumber", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentPaymentReferenceNumber(String value) {
        return new JAXBElement<String>(_TransactionPaymentPaymentReferenceNumber_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GiftCertificateType", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentGiftCertificateType(String value) {
        return new JAXBElement<String>(_TransactionPaymentGiftCertificateType_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AccountNumber", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentAccountNumber(String value) {
        return new JAXBElement<String>(_TransactionPaymentAccountNumber_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CurrencyId", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentCurrencyId(String value) {
        return new JAXBElement<String>(_TransactionPaymentCurrencyId_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CardNumber", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentCardNumber(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestCardNumber_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionPaymentAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentAttributes", scope = TransactionPayment.class)
    public JAXBElement<ArrayOfTransactionPaymentAttribute> createTransactionPaymentPaymentAttributes(ArrayOfTransactionPaymentAttribute value) {
        return new JAXBElement<ArrayOfTransactionPaymentAttribute>(_AuthorizePaymentRequestPaymentAttributes_QNAME, ArrayOfTransactionPaymentAttribute.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stream }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Signature", scope = TransactionPayment.class)
    public JAXBElement<Stream> createTransactionPaymentSignature(Stream value) {
        return new JAXBElement<Stream>(_TransactionPaymentSignature_QNAME, Stream.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "City", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentCity(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationCity_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExpirationDate", scope = TransactionPayment.class)
    public JAXBElement<XMLGregorianCalendar> createTransactionPaymentExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialExpirationDate_QNAME, XMLGregorianCalendar.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ZipCode", scope = TransactionPayment.class)
    public JAXBElement<String> createTransactionPaymentZipCode(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationZipCode_QNAME, String.class, TransactionPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "priceListList", scope = SavePriceListList.class)
    public JAXBElement<ArrayOfPriceList> createSavePriceListListPriceListList(ArrayOfPriceList value) {
        return new JAXBElement<ArrayOfPriceList>(_SavePriceListListPriceListList_QNAME, ArrayOfPriceList.class, SavePriceListList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyId", scope = AwardPoints.class)
    public JAXBElement<String> createAwardPointsLoyaltyId(String value) {
        return new JAXBElement<String>(_PostTransactionLoyaltyId_QNAME, String.class, AwardPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetCustomerGroupResult", scope = GetCustomerGroupResponse.class)
    public JAXBElement<CustomerGroup> createGetCustomerGroupResponseGetCustomerGroupResult(CustomerGroup value) {
        return new JAXBElement<CustomerGroup>(_GetCustomerGroupResponseGetCustomerGroupResult_QNAME, CustomerGroup.class, GetCustomerGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveStateListResult", scope = SaveStateListResponse.class)
    public JAXBElement<ArrayOfState> createSaveStateListResponseSaveStateListResult(ArrayOfState value) {
        return new JAXBElement<ArrayOfState>(_SaveStateListResponseSaveStateListResult_QNAME, ArrayOfState.class, SaveStateListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteVendorGroup.class)
    public JAXBElement<String> createDeleteVendorGroupId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteVendorGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LongDescription", scope = GiftCertificateMaster.class)
    public JAXBElement<String> createGiftCertificateMasterLongDescription(String value) {
        return new JAXBElement<String>(_GiftCertificateMasterLongDescription_QNAME, String.class, GiftCertificateMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ShortDescription", scope = GiftCertificateMaster.class)
    public JAXBElement<String> createGiftCertificateMasterShortDescription(String value) {
        return new JAXBElement<String>(_GiftCertificateMasterShortDescription_QNAME, String.class, GiftCertificateMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UPC", scope = GiftCertificateMaster.class)
    public JAXBElement<String> createGiftCertificateMasterUPC(String value) {
        return new JAXBElement<String>(_GiftCertificateMasterUPC_QNAME, String.class, GiftCertificateMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteEmployee.class)
    public JAXBElement<String> createDeleteEmployeeId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteEmployee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XGetPointsSummary.class)
    public JAXBElement<String> createXGetPointsSummaryApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XGetPointsSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XGetPointsSummary.class)
    public JAXBElement<String> createXGetPointsSummaryUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XGetPointsSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerLoyaltyId", scope = XGetPointsSummary.class)
    public JAXBElement<String> createXGetPointsSummaryCustomerLoyaltyId(String value) {
        return new JAXBElement<String>(_XGetPointsSummaryCustomerLoyaltyId_QNAME, String.class, XGetPointsSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "IntrernalSerialNumber", scope = InventoryUpdateSerial.class)
    public JAXBElement<String> createInventoryUpdateSerialIntrernalSerialNumber(String value) {
        return new JAXBElement<String>(_InventoryUpdateSerialIntrernalSerialNumber_QNAME, String.class, InventoryUpdateSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductionDate", scope = InventoryUpdateSerial.class)
    public JAXBElement<XMLGregorianCalendar> createInventoryUpdateSerialProductionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InventoryUpdateSerialProductionDate_QNAME, XMLGregorianCalendar.class, InventoryUpdateSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SupplierSerialNumber", scope = InventoryUpdateSerial.class)
    public JAXBElement<String> createInventoryUpdateSerialSupplierSerialNumber(String value) {
        return new JAXBElement<String>(_InventoryUpdateSerialSupplierSerialNumber_QNAME, String.class, InventoryUpdateSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExpiryDate", scope = InventoryUpdateSerial.class)
    public JAXBElement<XMLGregorianCalendar> createInventoryUpdateSerialExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InventoryUpdateSerialExpiryDate_QNAME, XMLGregorianCalendar.class, InventoryUpdateSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SystemSerial", scope = InventoryUpdateSerial.class)
    public JAXBElement<String> createInventoryUpdateSerialSystemSerial(String value) {
        return new JAXBElement<String>(_InventoryUpdateSerialSystemSerial_QNAME, String.class, InventoryUpdateSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BaseType", scope = InventoryUpdateSerial.class)
    public JAXBElement<String> createInventoryUpdateSerialBaseType(String value) {
        return new JAXBElement<String>(_InventoryUpdateSerialBaseType_QNAME, String.class, InventoryUpdateSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BatchId", scope = InventoryUpdateSerial.class)
    public JAXBElement<String> createInventoryUpdateSerialBatchId(String value) {
        return new JAXBElement<String>(_InventoryUpdateSerialBatchId_QNAME, String.class, InventoryUpdateSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InDate", scope = InventoryUpdateSerial.class)
    public JAXBElement<XMLGregorianCalendar> createInventoryUpdateSerialInDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InventoryUpdateSerialInDate_QNAME, XMLGregorianCalendar.class, InventoryUpdateSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BaseEntry", scope = InventoryUpdateSerial.class)
    public JAXBElement<String> createInventoryUpdateSerialBaseEntry(String value) {
        return new JAXBElement<String>(_InventoryUpdateSerialBaseEntry_QNAME, String.class, InventoryUpdateSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetVendorGroupResult", scope = GetVendorGroupResponse.class)
    public JAXBElement<VendorGroup> createGetVendorGroupResponseGetVendorGroupResult(VendorGroup value) {
        return new JAXBElement<VendorGroup>(_GetVendorGroupResponseGetVendorGroupResult_QNAME, VendorGroup.class, GetVendorGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetCountry.class)
    public JAXBElement<String> createGetCountryId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetCountry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SavePriceListListResult", scope = SavePriceListListResponse.class)
    public JAXBElement<ArrayOfPriceList> createSavePriceListListResponseSavePriceListListResult(ArrayOfPriceList value) {
        return new JAXBElement<ArrayOfPriceList>(_SavePriceListListResponseSavePriceListListResult_QNAME, ArrayOfPriceList.class, SavePriceListListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetAllStoresResult", scope = GetAllStoresResponse.class)
    public JAXBElement<ArrayOfStore> createGetAllStoresResponseGetAllStoresResult(ArrayOfStore value) {
        return new JAXBElement<ArrayOfStore>(_GetAllStoresResponseGetAllStoresResult_QNAME, ArrayOfStore.class, GetAllStoresResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetPromotionBonusBuys.class)
    public JAXBElement<String> createGetPromotionBonusBuysId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetPromotionBonusBuys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPricing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "specialPriceList", scope = SaveSpecialPriceList.class)
    public JAXBElement<ArrayOfSpecialPricing> createSaveSpecialPriceListSpecialPriceList(ArrayOfSpecialPricing value) {
        return new JAXBElement<ArrayOfSpecialPricing>(_SaveSpecialPriceListSpecialPriceList_QNAME, ArrayOfSpecialPricing.class, SaveSpecialPriceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Store }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveStoreResult", scope = SaveStoreResponse.class)
    public JAXBElement<Store> createSaveStoreResponseSaveStoreResult(Store value) {
        return new JAXBElement<Store>(_SaveStoreResponseSaveStoreResult_QNAME, Store.class, SaveStoreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveProductGroupDiscountListResult", scope = SaveProductGroupDiscountListResponse.class)
    public JAXBElement<ArrayOfProductGroupDiscount> createSaveProductGroupDiscountListResponseSaveProductGroupDiscountListResult(ArrayOfProductGroupDiscount value) {
        return new JAXBElement<ArrayOfProductGroupDiscount>(_SaveProductGroupDiscountListResponseSaveProductGroupDiscountListResult_QNAME, ArrayOfProductGroupDiscount.class, SaveProductGroupDiscountListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "currencyId", scope = DeleteExchangeRateByCurrencyAndDate.class)
    public JAXBElement<String> createDeleteExchangeRateByCurrencyAndDateCurrencyId(String value) {
        return new JAXBElement<String>(_DeleteExchangeRateByCurrencyAndDateCurrencyId_QNAME, String.class, DeleteExchangeRateByCurrencyAndDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AdmissionDate", scope = GoodsReceiptSerialDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptSerialDetailAdmissionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialAdmissionDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptSerialDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ManufacturingDate", scope = GoodsReceiptSerialDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptSerialDetailManufacturingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialManufacturingDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptSerialDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExpirationDate", scope = GoodsReceiptSerialDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptSerialDetailExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialExpirationDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptSerialDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentTypeList", scope = SavePaymentTypeList.class)
    public JAXBElement<ArrayOfPaymentType> createSavePaymentTypeListPaymentTypeList(ArrayOfPaymentType value) {
        return new JAXBElement<ArrayOfPaymentType>(_SavePaymentTypeListPaymentTypeList_QNAME, ArrayOfPaymentType.class, SavePaymentTypeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productId", scope = GetInventoryOfProduct.class)
    public JAXBElement<String> createGetInventoryOfProductProductId(String value) {
        return new JAXBElement<String>(_GetInventoryOfProductProductId_QNAME, String.class, GetInventoryOfProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteCustomerGroup.class)
    public JAXBElement<String> createDeleteCustomerGroupId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteCustomerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveSurchargeListResult", scope = SaveSurchargeListResponse.class)
    public JAXBElement<ArrayOfSurcharge> createSaveSurchargeListResponseSaveSurchargeListResult(ArrayOfSurcharge value) {
        return new JAXBElement<ArrayOfSurcharge>(_SaveSurchargeListResponseSaveSurchargeListResult_QNAME, ArrayOfSurcharge.class, SaveSurchargeListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XSearchTransaction.class)
    public JAXBElement<String> createXSearchTransactionApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XSearchTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionServerParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "filterParameter", scope = XSearchTransaction.class)
    public JAXBElement<TransactionServerParameters> createXSearchTransactionFilterParameter(TransactionServerParameters value) {
        return new JAXBElement<TransactionServerParameters>(_XSearchTransactionFilterParameter_QNAME, TransactionServerParameters.class, XSearchTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XSearchTransaction.class)
    public JAXBElement<String> createXSearchTransactionUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XSearchTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = UOM.class)
    public JAXBElement<String> createUOMDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, UOM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = CustomerGroup.class)
    public JAXBElement<String> createCustomerGroupDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, CustomerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesTaxCodeId", scope = CustomerGroup.class)
    public JAXBElement<String> createCustomerGroupSalesTaxCodeId(String value) {
        return new JAXBElement<String>(_WarehouseSalesTaxCodeId_QNAME, String.class, CustomerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "currencyId", scope = GetExchangeRateByCurrencyAndDate.class)
    public JAXBElement<String> createGetExchangeRateByCurrencyAndDateCurrencyId(String value) {
        return new JAXBElement<String>(_DeleteExchangeRateByCurrencyAndDateCurrencyId_QNAME, String.class, GetExchangeRateByCurrencyAndDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AdmissionDate", scope = GoodsReceiptPOSerialDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptPOSerialDetailAdmissionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialAdmissionDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptPOSerialDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ManufacturingDate", scope = GoodsReceiptPOSerialDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptPOSerialDetailManufacturingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialManufacturingDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptPOSerialDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExpirationDate", scope = GoodsReceiptPOSerialDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptPOSerialDetailExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialExpirationDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptPOSerialDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ItemAttributeName", scope = PostTransactionLineItemAttribute.class)
    public JAXBElement<String> createPostTransactionLineItemAttributeItemAttributeName(String value) {
        return new JAXBElement<String>(_PostTransactionLineItemAttributeItemAttributeName_QNAME, String.class, PostTransactionLineItemAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AttributeValue", scope = PostTransactionLineItemAttribute.class)
    public JAXBElement<String> createPostTransactionLineItemAttributeAttributeValue(String value) {
        return new JAXBElement<String>(_PostTransactionLineItemAttributeAttributeValue_QNAME, String.class, PostTransactionLineItemAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetBatch.class)
    public JAXBElement<String> createGetBatchId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteProductGroup.class)
    public JAXBElement<String> createDeleteProductGroupId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteProductGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetProductImageResult", scope = GetProductImageResponse.class)
    public JAXBElement<ProductImage> createGetProductImageResponseGetProductImageResult(ProductImage value) {
        return new JAXBElement<ProductImage>(_GetProductImageResponseGetProductImageResult_QNAME, ProductImage.class, GetProductImageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetLineAttribute.class)
    public JAXBElement<String> createGetLineAttributeId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetLineAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = Initialize.class)
    public JAXBElement<String> createInitializeApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, Initialize.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = Initialize.class)
    public JAXBElement<String> createInitializeUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, Initialize.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coupon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Coupon", scope = SaveCoupon.class)
    public JAXBElement<Coupon> createSaveCouponCoupon(Coupon value) {
        return new JAXBElement<Coupon>(_Coupon_QNAME, Coupon.class, SaveCoupon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCustomerGroupListResult", scope = SaveCustomerGroupListResponse.class)
    public JAXBElement<ArrayOfCustomerGroup> createSaveCustomerGroupListResponseSaveCustomerGroupListResult(ArrayOfCustomerGroup value) {
        return new JAXBElement<ArrayOfCustomerGroup>(_SaveCustomerGroupListResponseSaveCustomerGroupListResult_QNAME, ArrayOfCustomerGroup.class, SaveCustomerGroupListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerCatalog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "customerCatalog", scope = SaveCustomerCatalog.class)
    public JAXBElement<CustomerCatalog> createSaveCustomerCatalogCustomerCatalog(CustomerCatalog value) {
        return new JAXBElement<CustomerCatalog>(_SaveCustomerCatalogCustomerCatalog_QNAME, CustomerCatalog.class, SaveCustomerCatalog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SurchargeId", scope = TransactionSurcharge.class)
    public JAXBElement<String> createTransactionSurchargeSurchargeId(String value) {
        return new JAXBElement<String>(_TransactionPaymentSurchargeId_QNAME, String.class, TransactionSurcharge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TaxCodeId", scope = TransactionSurcharge.class)
    public JAXBElement<String> createTransactionSurchargeTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargeTaxCodeId_QNAME, String.class, TransactionSurcharge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = TransactionSurcharge.class)
    public JAXBElement<String> createTransactionSurchargeComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, TransactionSurcharge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveProductCostResult", scope = SaveProductCostResponse.class)
    public JAXBElement<ArrayOfProductCost> createSaveProductCostResponseSaveProductCostResult(ArrayOfProductCost value) {
        return new JAXBElement<ArrayOfProductCost>(_SaveProductCostResponseSaveProductCostResult_QNAME, ArrayOfProductCost.class, SaveProductCostResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_UpdateLoyaltyCustomerResult", scope = XUpdateLoyaltyCustomerResponse.class)
    public JAXBElement<Customer> createXUpdateLoyaltyCustomerResponseXUpdateLoyaltyCustomerResult(Customer value) {
        return new JAXBElement<Customer>(_XUpdateLoyaltyCustomerResponseXUpdateLoyaltyCustomerResult_QNAME, Customer.class, XUpdateLoyaltyCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductDescription", scope = PriceMatrix.class)
    public JAXBElement<String> createPriceMatrixProductDescription(String value) {
        return new JAXBElement<String>(_PriceMatrixProductDescription_QNAME, String.class, PriceMatrix.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SerialNumber", scope = PromotionProductDetail.class)
    public JAXBElement<String> createPromotionProductDetailSerialNumber(String value) {
        return new JAXBElement<String>(_PromotionProductDetailSerialNumber_QNAME, String.class, PromotionProductDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Status", scope = PromotionProductDetail.class)
    public JAXBElement<String> createPromotionProductDetailStatus(String value) {
        return new JAXBElement<String>(_PromotionProductDetailStatus_QNAME, String.class, PromotionProductDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BatchNumber", scope = PromotionProductDetail.class)
    public JAXBElement<String> createPromotionProductDetailBatchNumber(String value) {
        return new JAXBElement<String>(_PromotionProductDetailBatchNumber_QNAME, String.class, PromotionProductDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "specialPriceDiscountGroupList", scope = SaveCustomerGroupDiscountList.class)
    public JAXBElement<ArrayOfCustomerGroupDiscount> createSaveCustomerGroupDiscountListSpecialPriceDiscountGroupList(ArrayOfCustomerGroupDiscount value) {
        return new JAXBElement<ArrayOfCustomerGroupDiscount>(_SaveCustomerGroupDiscountListSpecialPriceDiscountGroupList_QNAME, ArrayOfCustomerGroupDiscount.class, SaveCustomerGroupDiscountList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveBatchListResult", scope = SaveBatchListResponse.class)
    public JAXBElement<ArrayOfBatch> createSaveBatchListResponseSaveBatchListResult(ArrayOfBatch value) {
        return new JAXBElement<ArrayOfBatch>(_SaveBatchListResponseSaveBatchListResult_QNAME, ArrayOfBatch.class, SaveBatchListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productGroup", scope = SaveProductGroup.class)
    public JAXBElement<ProductGroup> createSaveProductGroupProductGroup(ProductGroup value) {
        return new JAXBElement<ProductGroup>(_SaveProductGroupProductGroup_QNAME, ProductGroup.class, SaveProductGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetBarCodeMask.class)
    public JAXBElement<String> createGetBarCodeMaskId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetBarCodeMask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerCatalog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCustomerCatalogResult", scope = SaveCustomerCatalogResponse.class)
    public JAXBElement<CustomerCatalog> createSaveCustomerCatalogResponseSaveCustomerCatalogResult(CustomerCatalog value) {
        return new JAXBElement<CustomerCatalog>(_SaveCustomerCatalogResponseSaveCustomerCatalogResult_QNAME, CustomerCatalog.class, SaveCustomerCatalogResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveManufacturerResult", scope = SaveManufacturerResponse.class)
    public JAXBElement<Manufacturer> createSaveManufacturerResponseSaveManufacturerResult(Manufacturer value) {
        return new JAXBElement<Manufacturer>(_SaveManufacturerResponseSaveManufacturerResult_QNAME, Manufacturer.class, SaveManufacturerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveGoodsReceiptListResult", scope = SaveGoodsReceiptListResponse.class)
    public JAXBElement<ArrayOfGoodsReceipt> createSaveGoodsReceiptListResponseSaveGoodsReceiptListResult(ArrayOfGoodsReceipt value) {
        return new JAXBElement<ArrayOfGoodsReceipt>(_SaveGoodsReceiptListResponseSaveGoodsReceiptListResult_QNAME, ArrayOfGoodsReceipt.class, SaveGoodsReceiptListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "loyaltyCard", scope = RollBackRedeemedPoints.class)
    public JAXBElement<String> createRollBackRedeemedPointsLoyaltyCard(String value) {
        return new JAXBElement<String>(_RollBackRedeemedPointsLoyaltyCard_QNAME, String.class, RollBackRedeemedPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomTransactionInfoGridDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomTransactionInfoGridDetailList", scope = CustomTransactionInfoGrid.class)
    public JAXBElement<ArrayOfCustomTransactionInfoGridDetail> createCustomTransactionInfoGridCustomTransactionInfoGridDetailList(ArrayOfCustomTransactionInfoGridDetail value) {
        return new JAXBElement<ArrayOfCustomTransactionInfoGridDetail>(_CustomTransactionInfoGridCustomTransactionInfoGridDetailList_QNAME, ArrayOfCustomTransactionInfoGridDetail.class, CustomTransactionInfoGrid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = CustomTransactionInfoGrid.class)
    public JAXBElement<String> createCustomTransactionInfoGridDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, CustomTransactionInfoGrid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Caption", scope = CustomTransactionInfoGrid.class)
    public JAXBElement<String> createCustomTransactionInfoGridCaption(String value) {
        return new JAXBElement<String>(_CustomTransactionInfoGridCaption_QNAME, String.class, CustomTransactionInfoGrid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Sequence", scope = CustomTransactionInfoGrid.class)
    public JAXBElement<String> createCustomTransactionInfoGridSequence(String value) {
        return new JAXBElement<String>(_CustomTransactionInfoGridSequence_QNAME, String.class, CustomTransactionInfoGrid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = CustomTransactionInfoGrid.class)
    public JAXBElement<String> createCustomTransactionInfoGridId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, CustomTransactionInfoGrid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "state", scope = SaveState.class)
    public JAXBElement<State> createSaveStateState(State value) {
        return new JAXBElement<State>(_SaveStateState_QNAME, State.class, SaveState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SavePaymentTypeResult", scope = SavePaymentTypeResponse.class)
    public JAXBElement<PaymentType> createSavePaymentTypeResponseSavePaymentTypeResult(PaymentType value) {
        return new JAXBElement<PaymentType>(_SavePaymentTypeResponseSavePaymentTypeResult_QNAME, PaymentType.class, SavePaymentTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentType", scope = SavePaymentType.class)
    public JAXBElement<PaymentType> createSavePaymentTypePaymentType(PaymentType value) {
        return new JAXBElement<PaymentType>(_PaymentType_QNAME, PaymentType.class, SavePaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCustomerGroupDiscountListResult", scope = SaveCustomerGroupDiscountListResponse.class)
    public JAXBElement<ArrayOfCustomerGroupDiscount> createSaveCustomerGroupDiscountListResponseSaveCustomerGroupDiscountListResult(ArrayOfCustomerGroupDiscount value) {
        return new JAXBElement<ArrayOfCustomerGroupDiscount>(_SaveCustomerGroupDiscountListResponseSaveCustomerGroupDiscountListResult_QNAME, ArrayOfCustomerGroupDiscount.class, SaveCustomerGroupDiscountListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductBOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SetKitComponentsResult", scope = SetKitComponentsResponse.class)
    public JAXBElement<ArrayOfProductBOM> createSetKitComponentsResponseSetKitComponentsResult(ArrayOfProductBOM value) {
        return new JAXBElement<ArrayOfProductBOM>(_SetKitComponentsResponseSetKitComponentsResult_QNAME, ArrayOfProductBOM.class, SetKitComponentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVendorProductMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveVendorProductMappingResult", scope = SaveVendorProductMappingResponse.class)
    public JAXBElement<ArrayOfVendorProductMapping> createSaveVendorProductMappingResponseSaveVendorProductMappingResult(ArrayOfVendorProductMapping value) {
        return new JAXBElement<ArrayOfVendorProductMapping>(_SaveVendorProductMappingResponseSaveVendorProductMappingResult_QNAME, ArrayOfVendorProductMapping.class, SaveVendorProductMappingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AttributeValue", scope = PostTransactionSaleAttribute.class)
    public JAXBElement<String> createPostTransactionSaleAttributeAttributeValue(String value) {
        return new JAXBElement<String>(_PostTransactionLineItemAttributeAttributeValue_QNAME, String.class, PostTransactionSaleAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaleAttributeName", scope = PostTransactionSaleAttribute.class)
    public JAXBElement<String> createPostTransactionSaleAttributeSaleAttributeName(String value) {
        return new JAXBElement<String>(_PostTransactionSaleAttributeSaleAttributeName_QNAME, String.class, PostTransactionSaleAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveProductResult", scope = SaveProductResponse.class)
    public JAXBElement<Product> createSaveProductResponseSaveProductResult(Product value) {
        return new JAXBElement<Product>(_SaveProductResponseSaveProductResult_QNAME, Product.class, SaveProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "POSSkinName", scope = RetailProfile.class)
    public JAXBElement<String> createRetailProfilePOSSkinName(String value) {
        return new JAXBElement<String>(_RetailProfilePOSSkinName_QNAME, String.class, RetailProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = RetailProfile.class)
    public JAXBElement<String> createRetailProfileDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, RetailProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PoleDisplayStartTransactionMessageId", scope = RetailProfile.class)
    public JAXBElement<String> createRetailProfilePoleDisplayStartTransactionMessageId(String value) {
        return new JAXBElement<String>(_RetailProfilePoleDisplayStartTransactionMessageId_QNAME, String.class, RetailProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ManagementConsoleSkinName", scope = RetailProfile.class)
    public JAXBElement<String> createRetailProfileManagementConsoleSkinName(String value) {
        return new JAXBElement<String>(_RetailProfileManagementConsoleSkinName_QNAME, String.class, RetailProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DepartmentId", scope = RetailProfile.class)
    public JAXBElement<String> createRetailProfileDepartmentId(String value) {
        return new JAXBElement<String>(_EmployeeDepartmentId_QNAME, String.class, RetailProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ChangeAmountPaymentCurrencyId", scope = RetailProfile.class)
    public JAXBElement<String> createRetailProfileChangeAmountPaymentCurrencyId(String value) {
        return new JAXBElement<String>(_RetailProfileChangeAmountPaymentCurrencyId_QNAME, String.class, RetailProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PoleDisplayIdleMessageId", scope = RetailProfile.class)
    public JAXBElement<String> createRetailProfilePoleDisplayIdleMessageId(String value) {
        return new JAXBElement<String>(_RetailProfilePoleDisplayIdleMessageId_QNAME, String.class, RetailProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = RetailProfile.class)
    public JAXBElement<String> createRetailProfileId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, RetailProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PoleDisplayCompleteSaleMessageId", scope = RetailProfile.class)
    public JAXBElement<String> createRetailProfilePoleDisplayCompleteSaleMessageId(String value) {
        return new JAXBElement<String>(_RetailProfilePoleDisplayCompleteSaleMessageId_QNAME, String.class, RetailProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "EventId", scope = RetailProfile.class)
    public JAXBElement<String> createRetailProfileEventId(String value) {
        return new JAXBElement<String>(_RetailProfileEventId_QNAME, String.class, RetailProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetAllLineAttributeResult", scope = GetAllLineAttributeResponse.class)
    public JAXBElement<ArrayOfLineAttribute> createGetAllLineAttributeResponseGetAllLineAttributeResult(ArrayOfLineAttribute value) {
        return new JAXBElement<ArrayOfLineAttribute>(_GetAllLineAttributeResponseGetAllLineAttributeResult_QNAME, ArrayOfLineAttribute.class, GetAllLineAttributeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductInventoryList", scope = Product.class)
    public JAXBElement<ArrayOfInventoryItem> createProductProductInventoryList(ArrayOfInventoryItem value) {
        return new JAXBElement<ArrayOfInventoryItem>(_ProductProductInventoryList_QNAME, ArrayOfInventoryItem.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "MerchandiseHierarchyDetailKey", scope = Product.class)
    public JAXBElement<String> createProductMerchandiseHierarchyDetailKey(String value) {
        return new JAXBElement<String>(_ProductMerchandiseHierarchyDetailKey_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExternalLink", scope = Product.class)
    public JAXBElement<String> createProductExternalLink(String value) {
        return new JAXBElement<String>(_ProductExternalLink_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LongDescription", scope = Product.class)
    public JAXBElement<String> createProductLongDescription(String value) {
        return new JAXBElement<String>(_GiftCertificateMasterLongDescription_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ManufacturerId", scope = Product.class)
    public JAXBElement<String> createProductManufacturerId(String value) {
        return new JAXBElement<String>(_ProductManufacturerId_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AlternateUPCCodes", scope = Product.class)
    public JAXBElement<String> createProductAlternateUPCCodes(String value) {
        return new JAXBElement<String>(_ProductAlternateUPCCodes_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ShortDescription", scope = Product.class)
    public JAXBElement<String> createProductShortDescription(String value) {
        return new JAXBElement<String>(_GiftCertificateMasterShortDescription_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesTaxCodeId", scope = Product.class)
    public JAXBElement<String> createProductSalesTaxCodeId(String value) {
        return new JAXBElement<String>(_WarehouseSalesTaxCodeId_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseTaxCodeId", scope = Product.class)
    public JAXBElement<String> createProductPurchaseTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargePurchaseTaxCodeId_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UPC", scope = Product.class)
    public JAXBElement<String> createProductUPC(String value) {
        return new JAXBElement<String>(_GiftCertificateMasterUPC_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ParentProductId", scope = Product.class)
    public JAXBElement<String> createProductParentProductId(String value) {
        return new JAXBElement<String>(_ProductParentProductId_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductBOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AssemblyComponents", scope = Product.class)
    public JAXBElement<ArrayOfProductBOM> createProductAssemblyComponents(ArrayOfProductBOM value) {
        return new JAXBElement<ArrayOfProductBOM>(_ProductAssemblyComponents_QNAME, ArrayOfProductBOM.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PackageGroupId", scope = Product.class)
    public JAXBElement<String> createProductPackageGroupId(String value) {
        return new JAXBElement<String>(_ProductPackageGroupId_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AttributeList", scope = Product.class)
    public JAXBElement<ArrayOfAttributes> createProductAttributeList(ArrayOfAttributes value) {
        return new JAXBElement<ArrayOfAttributes>(_ProductAttributeList_QNAME, ArrayOfAttributes.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BarCodeMaskId", scope = Product.class)
    public JAXBElement<String> createProductBarCodeMaskId(String value) {
        return new JAXBElement<String>(_ProductBarCodeMaskId_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PreferedVendorId", scope = Product.class)
    public JAXBElement<String> createProductPreferedVendorId(String value) {
        return new JAXBElement<String>(_ProductPreferedVendorId_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Attributes", scope = Product.class)
    public JAXBElement<String> createProductAttributes(String value) {
        return new JAXBElement<String>(_Attributes_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductClassId", scope = Product.class)
    public JAXBElement<String> createProductProductClassId(String value) {
        return new JAXBElement<String>(_ProductProductClassId_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductMerchandiseHierarchyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductMerchandiseHierarchyDetailList", scope = Product.class)
    public JAXBElement<ArrayOfProductMerchandiseHierarchyDetail> createProductProductMerchandiseHierarchyDetailList(ArrayOfProductMerchandiseHierarchyDetail value) {
        return new JAXBElement<ArrayOfProductMerchandiseHierarchyDetail>(_ProductProductMerchandiseHierarchyDetailList_QNAME, ArrayOfProductMerchandiseHierarchyDetail.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMGroupId", scope = Product.class)
    public JAXBElement<String> createProductUOMGroupId(String value) {
        return new JAXBElement<String>(_ProductUOMGroupId_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductBOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "KitComponents", scope = Product.class)
    public JAXBElement<ArrayOfProductBOM> createProductKitComponents(ArrayOfProductBOM value) {
        return new JAXBElement<ArrayOfProductBOM>(_ProductKitComponents_QNAME, ArrayOfProductBOM.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ImageLocation", scope = Product.class)
    public JAXBElement<String> createProductImageLocation(String value) {
        return new JAXBElement<String>(_ProductImageLocation_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = Product.class)
    public JAXBElement<String> createProductComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetInventoryOfWarehouseResult", scope = GetInventoryOfWarehouseResponse.class)
    public JAXBElement<ArrayOfInventoryItem> createGetInventoryOfWarehouseResponseGetInventoryOfWarehouseResult(ArrayOfInventoryItem value) {
        return new JAXBElement<ArrayOfInventoryItem>(_GetInventoryOfWarehouseResponseGetInventoryOfWarehouseResult_QNAME, ArrayOfInventoryItem.class, GetInventoryOfWarehouseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BatchList", scope = SaveBatchList.class)
    public JAXBElement<ArrayOfBatch> createSaveBatchListBatchList(ArrayOfBatch value) {
        return new JAXBElement<ArrayOfBatch>(_SaveBatchListBatchList_QNAME, ArrayOfBatch.class, SaveBatchList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "vendorList", scope = SaveVendorList.class)
    public JAXBElement<ArrayOfVendor> createSaveVendorListVendorList(ArrayOfVendor value) {
        return new JAXBElement<ArrayOfVendor>(_SaveVendorListVendorList_QNAME, ArrayOfVendor.class, SaveVendorList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetEmployeeResult", scope = GetEmployeeResponse.class)
    public JAXBElement<Employee> createGetEmployeeResponseGetEmployeeResult(Employee value) {
        return new JAXBElement<Employee>(_GetEmployeeResponseGetEmployeeResult_QNAME, Employee.class, GetEmployeeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductionDate", scope = InventoryUpdateBatch.class)
    public JAXBElement<XMLGregorianCalendar> createInventoryUpdateBatchProductionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InventoryUpdateSerialProductionDate_QNAME, XMLGregorianCalendar.class, InventoryUpdateBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExpiryDate", scope = InventoryUpdateBatch.class)
    public JAXBElement<XMLGregorianCalendar> createInventoryUpdateBatchExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InventoryUpdateSerialExpiryDate_QNAME, XMLGregorianCalendar.class, InventoryUpdateBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BaseType", scope = InventoryUpdateBatch.class)
    public JAXBElement<String> createInventoryUpdateBatchBaseType(String value) {
        return new JAXBElement<String>(_InventoryUpdateSerialBaseType_QNAME, String.class, InventoryUpdateBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InDate", scope = InventoryUpdateBatch.class)
    public JAXBElement<XMLGregorianCalendar> createInventoryUpdateBatchInDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InventoryUpdateSerialInDate_QNAME, XMLGregorianCalendar.class, InventoryUpdateBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BaseEntry", scope = InventoryUpdateBatch.class)
    public JAXBElement<String> createInventoryUpdateBatchBaseEntry(String value) {
        return new JAXBElement<String>(_InventoryUpdateSerialBaseEntry_QNAME, String.class, InventoryUpdateBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCodeCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveTaxCodeConditionResult", scope = SaveTaxCodeConditionResponse.class)
    public JAXBElement<TaxCodeCondition> createSaveTaxCodeConditionResponseSaveTaxCodeConditionResult(TaxCodeCondition value) {
        return new JAXBElement<TaxCodeCondition>(_SaveTaxCodeConditionResponseSaveTaxCodeConditionResult_QNAME, TaxCodeCondition.class, SaveTaxCodeConditionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveProductListResult", scope = SaveProductListResponse.class)
    public JAXBElement<ArrayOfProduct> createSaveProductListResponseSaveProductListResult(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_SaveProductListResponseSaveProductListResult_QNAME, ArrayOfProduct.class, SaveProductListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Receiver", scope = ReplicationSendDump.class)
    public JAXBElement<String> createReplicationSendDumpReceiver(String value) {
        return new JAXBElement<String>(_ReplicationSendDumpReceiver_QNAME, String.class, ReplicationSendDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InsertQuery", scope = ReplicationSendDump.class)
    public JAXBElement<String> createReplicationSendDumpInsertQuery(String value) {
        return new JAXBElement<String>(_ReplicationSendDumpInsertQuery_QNAME, String.class, ReplicationSendDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StoreId", scope = ReplicationSendDump.class)
    public JAXBElement<String> createReplicationSendDumpStoreId(String value) {
        return new JAXBElement<String>(_TransactionStoreId_QNAME, String.class, ReplicationSendDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Sender", scope = ReplicationSendDump.class)
    public JAXBElement<String> createReplicationSendDumpSender(String value) {
        return new JAXBElement<String>(_ReplicationSendDumpSender_QNAME, String.class, ReplicationSendDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DeleteQuery", scope = ReplicationSendDump.class)
    public JAXBElement<String> createReplicationSendDumpDeleteQuery(String value) {
        return new JAXBElement<String>(_ReplicationSendDumpDeleteQuery_QNAME, String.class, ReplicationSendDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TableType", scope = ReplicationSendDump.class)
    public JAXBElement<String> createReplicationSendDumpTableType(String value) {
        return new JAXBElement<String>(_ReplicationSendDumpTableType_QNAME, String.class, ReplicationSendDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UpdateQuery", scope = ReplicationSendDump.class)
    public JAXBElement<String> createReplicationSendDumpUpdateQuery(String value) {
        return new JAXBElement<String>(_ReplicationSendDumpUpdateQuery_QNAME, String.class, ReplicationSendDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TableName", scope = ReplicationSendDump.class)
    public JAXBElement<String> createReplicationSendDumpTableName(String value) {
        return new JAXBElement<String>(_GetNextNumberTableName_QNAME, String.class, ReplicationSendDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReceivingSiteID", scope = ReplicationSendDump.class)
    public JAXBElement<String> createReplicationSendDumpReceivingSiteID(String value) {
        return new JAXBElement<String>(_ReplicationSendDumpReceivingSiteID_QNAME, String.class, ReplicationSendDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TablePrimaryColumn", scope = ReplicationSendDump.class)
    public JAXBElement<String> createReplicationSendDumpTablePrimaryColumn(String value) {
        return new JAXBElement<String>(_ReplicationSendDumpTablePrimaryColumn_QNAME, String.class, ReplicationSendDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "exchangeRateList", scope = SaveExchangeRateList.class)
    public JAXBElement<ArrayOfExchangeRate> createSaveExchangeRateListExchangeRateList(ArrayOfExchangeRate value) {
        return new JAXBElement<ArrayOfExchangeRate>(_SaveExchangeRateListExchangeRateList_QNAME, ArrayOfExchangeRate.class, SaveExchangeRateList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Suffix", scope = NumberSeriesMaster.class)
    public JAXBElement<String> createNumberSeriesMasterSuffix(String value) {
        return new JAXBElement<String>(_NumberSeriesMasterSuffix_QNAME, String.class, NumberSeriesMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CurrentNumber", scope = NumberSeriesMaster.class)
    public JAXBElement<String> createNumberSeriesMasterCurrentNumber(String value) {
        return new JAXBElement<String>(_NumberSeriesMasterCurrentNumber_QNAME, String.class, NumberSeriesMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "POSId", scope = NumberSeriesMaster.class)
    public JAXBElement<String> createNumberSeriesMasterPOSId(String value) {
        return new JAXBElement<String>(_TransactionPOSId_QNAME, String.class, NumberSeriesMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AuthorizationCode", scope = NumberSeriesMaster.class)
    public JAXBElement<String> createNumberSeriesMasterAuthorizationCode(String value) {
        return new JAXBElement<String>(_TransactionPaymentAuthorizationCode_QNAME, String.class, NumberSeriesMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StoreId", scope = NumberSeriesMaster.class)
    public JAXBElement<String> createNumberSeriesMasterStoreId(String value) {
        return new JAXBElement<String>(_TransactionStoreId_QNAME, String.class, NumberSeriesMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = NumberSeriesMaster.class)
    public JAXBElement<String> createNumberSeriesMasterDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, NumberSeriesMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "EndNumber", scope = NumberSeriesMaster.class)
    public JAXBElement<String> createNumberSeriesMasterEndNumber(String value) {
        return new JAXBElement<String>(_NumberSeriesMasterEndNumber_QNAME, String.class, NumberSeriesMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Prefix", scope = NumberSeriesMaster.class)
    public JAXBElement<String> createNumberSeriesMasterPrefix(String value) {
        return new JAXBElement<String>(_NumberSeriesMasterPrefix_QNAME, String.class, NumberSeriesMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StartNumber", scope = NumberSeriesMaster.class)
    public JAXBElement<String> createNumberSeriesMasterStartNumber(String value) {
        return new JAXBElement<String>(_NumberSeriesMasterStartNumber_QNAME, String.class, NumberSeriesMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReplicationSendDump }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "replicationSendDumpList", scope = SaveReplicationSendDumpList.class)
    public JAXBElement<ArrayOfReplicationSendDump> createSaveReplicationSendDumpListReplicationSendDumpList(ArrayOfReplicationSendDump value) {
        return new JAXBElement<ArrayOfReplicationSendDump>(_SaveReplicationSendDumpListReplicationSendDumpList_QNAME, ArrayOfReplicationSendDump.class, SaveReplicationSendDumpList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetReplicationStatusResult", scope = GetReplicationStatusResponse.class)
    public JAXBElement<String> createGetReplicationStatusResponseGetReplicationStatusResult(String value) {
        return new JAXBElement<String>(_GetReplicationStatusResponseGetReplicationStatusResult_QNAME, String.class, GetReplicationStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteUOMGroup.class)
    public JAXBElement<String> createDeleteUOMGroupId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteUOMGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RequestNumber", scope = StockTransfer.class)
    public JAXBElement<String> createStockTransferRequestNumber(String value) {
        return new JAXBElement<String>(_StockTransferRequestNumber_QNAME, String.class, StockTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReferenceNumber2", scope = StockTransfer.class)
    public JAXBElement<String> createStockTransferReferenceNumber2(String value) {
        return new JAXBElement<String>(_StockTransferReferenceNumber2_QNAME, String.class, StockTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = StockTransfer.class)
    public JAXBElement<String> createStockTransferComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, StockTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReferenceNumber1", scope = StockTransfer.class)
    public JAXBElement<String> createStockTransferReferenceNumber1(String value) {
        return new JAXBElement<String>(_StockTransferReferenceNumber1_QNAME, String.class, StockTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ToTime", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionToTime(String value) {
        return new JAXBElement<String>(_TaxCodeConditionToTime_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UDFCondition1", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionUDFCondition1(String value) {
        return new JAXBElement<String>(_TaxCodeConditionUDFCondition1_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AttributeCondition1", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionAttributeCondition1(String value) {
        return new JAXBElement<String>(_TaxCodeConditionAttributeCondition1_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UDFCondition3", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionUDFCondition3(String value) {
        return new JAXBElement<String>(_TaxCodeConditionUDFCondition3_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AttributeCondition2", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionAttributeCondition2(String value) {
        return new JAXBElement<String>(_TaxCodeConditionAttributeCondition2_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UDFCondition2", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionUDFCondition2(String value) {
        return new JAXBElement<String>(_TaxCodeConditionUDFCondition2_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AttributeCondition3", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionAttributeCondition3(String value) {
        return new JAXBElement<String>(_TaxCodeConditionAttributeCondition3_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ToDate", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionToDate(String value) {
        return new JAXBElement<String>(_DiscountGroupToDate_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AttributeValue1", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionAttributeValue1(String value) {
        return new JAXBElement<String>(_TaxCodeConditionAttributeValue1_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AttributeValue2", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionAttributeValue2(String value) {
        return new JAXBElement<String>(_TaxCodeConditionAttributeValue2_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AttributeValue3", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionAttributeValue3(String value) {
        return new JAXBElement<String>(_TaxCodeConditionAttributeValue3_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FromTime", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionFromTime(String value) {
        return new JAXBElement<String>(_TaxCodeConditionFromTime_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UDFValue1", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionUDFValue1(String value) {
        return new JAXBElement<String>(_TaxCodeConditionUDFValue1_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UDFValue3", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionUDFValue3(String value) {
        return new JAXBElement<String>(_TaxCodeConditionUDFValue3_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UDFValue2", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionUDFValue2(String value) {
        return new JAXBElement<String>(_TaxCodeConditionUDFValue2_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FromDate", scope = TaxCodeCondition.class)
    public JAXBElement<String> createTaxCodeConditionFromDate(String value) {
        return new JAXBElement<String>(_TaxCodeConditionFromDate_QNAME, String.class, TaxCodeCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveGoodsIssueListResult", scope = SaveGoodsIssueListResponse.class)
    public JAXBElement<ArrayOfGoodsIssue> createSaveGoodsIssueListResponseSaveGoodsIssueListResult(ArrayOfGoodsIssue value) {
        return new JAXBElement<ArrayOfGoodsIssue>(_SaveGoodsIssueListResponseSaveGoodsIssueListResult_QNAME, ArrayOfGoodsIssue.class, SaveGoodsIssueListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetPriceListResult", scope = GetPriceListResponse.class)
    public JAXBElement<PriceList> createGetPriceListResponseGetPriceListResult(PriceList value) {
        return new JAXBElement<PriceList>(_GetPriceListResponseGetPriceListResult_QNAME, PriceList.class, GetPriceListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetProductCostResult", scope = GetProductCostResponse.class)
    public JAXBElement<ArrayOfProductCost> createGetProductCostResponseGetProductCostResult(ArrayOfProductCost value) {
        return new JAXBElement<ArrayOfProductCost>(_GetProductCostResponseGetProductCostResult_QNAME, ArrayOfProductCost.class, GetProductCostResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVendorProductMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "objectList", scope = SaveVendorProductMapping.class)
    public JAXBElement<ArrayOfVendorProductMapping> createSaveVendorProductMappingObjectList(ArrayOfVendorProductMapping value) {
        return new JAXBElement<ArrayOfVendorProductMapping>(_SaveVendorProductMappingObjectList_QNAME, ArrayOfVendorProductMapping.class, SaveVendorProductMapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarcodeInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetBarCodeResolutionResult", scope = GetBarCodeResolutionResponse.class)
    public JAXBElement<BarcodeInformation> createGetBarCodeResolutionResponseGetBarCodeResolutionResult(BarcodeInformation value) {
        return new JAXBElement<BarcodeInformation>(_GetBarCodeResolutionResponseGetBarCodeResolutionResult_QNAME, BarcodeInformation.class, GetBarCodeResolutionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetRetailProfileResult", scope = GetRetailProfileResponse.class)
    public JAXBElement<RetailProfile> createGetRetailProfileResponseGetRetailProfileResult(RetailProfile value) {
        return new JAXBElement<RetailProfile>(_GetRetailProfileResponseGetRetailProfileResult_QNAME, RetailProfile.class, GetRetailProfileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserFieldsList", scope = BaseWrapper.class)
    public JAXBElement<ArrayOfUserFields> createBaseWrapperUserFieldsList(ArrayOfUserFields value) {
        return new JAXBElement<ArrayOfUserFields>(_BaseWrapperUserFieldsList_QNAME, ArrayOfUserFields.class, BaseWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Message", scope = BaseWrapper.class)
    public JAXBElement<String> createBaseWrapperMessage(String value) {
        return new JAXBElement<String>(_BaseWrapperMessage_QNAME, String.class, BaseWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "EnterpriseName", scope = BaseWrapper.class)
    public JAXBElement<String> createBaseWrapperEnterpriseName(String value) {
        return new JAXBElement<String>(_BaseWrapperEnterpriseName_QNAME, String.class, BaseWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "transaction", scope = SaveTransaction.class)
    public JAXBElement<PostTransaction> createSaveTransactionTransaction(PostTransaction value) {
        return new JAXBElement<PostTransaction>(_SaveTransactionTransaction_QNAME, PostTransaction.class, SaveTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productSurchargesList", scope = SaveProductSurcharges.class)
    public JAXBElement<ArrayOfProductSurcharge> createSaveProductSurchargesProductSurchargesList(ArrayOfProductSurcharge value) {
        return new JAXBElement<ArrayOfProductSurcharge>(_SaveProductSurchargesProductSurchargesList_QNAME, ArrayOfProductSurcharge.class, SaveProductSurcharges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XGetDeltaQueue.class)
    public JAXBElement<String> createXGetDeltaQueueApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XGetDeltaQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XGetDeltaQueue.class)
    public JAXBElement<String> createXGetDeltaQueueUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XGetDeltaQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveUOMListResult", scope = SaveUOMListResponse.class)
    public JAXBElement<ArrayOfUOM> createSaveUOMListResponseSaveUOMListResult(ArrayOfUOM value) {
        return new JAXBElement<ArrayOfUOM>(_SaveUOMListResponseSaveUOMListResult_QNAME, ArrayOfUOM.class, SaveUOMListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReplicationSendDump }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetReplicationSendDumpResult", scope = GetReplicationSendDumpResponse.class)
    public JAXBElement<ArrayOfReplicationSendDump> createGetReplicationSendDumpResponseGetReplicationSendDumpResult(ArrayOfReplicationSendDump value) {
        return new JAXBElement<ArrayOfReplicationSendDump>(_GetReplicationSendDumpResponseGetReplicationSendDumpResult_QNAME, ArrayOfReplicationSendDump.class, GetReplicationSendDumpResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Surcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveSurchargeResult", scope = SaveSurchargeResponse.class)
    public JAXBElement<Surcharge> createSaveSurchargeResponseSaveSurchargeResult(Surcharge value) {
        return new JAXBElement<Surcharge>(_SaveSurchargeResponseSaveSurchargeResult_QNAME, Surcharge.class, SaveSurchargeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostDelivery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_PostFulfillmentResult", scope = XPostFulfillmentResponse.class)
    public JAXBElement<PostDelivery> createXPostFulfillmentResponseXPostFulfillmentResult(PostDelivery value) {
        return new JAXBElement<PostDelivery>(_XPostFulfillmentResponseXPostFulfillmentResult_QNAME, PostDelivery.class, XPostFulfillmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizePaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "dataObject", scope = AuthorizePayment.class)
    public JAXBElement<AuthorizePaymentRequest> createAuthorizePaymentDataObject(AuthorizePaymentRequest value) {
        return new JAXBElement<AuthorizePaymentRequest>(_AuthorizePaymentDataObject_QNAME, AuthorizePaymentRequest.class, AuthorizePayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetDeliveryPackageByKeyResult", scope = GetDeliveryPackageByKeyResponse.class)
    public JAXBElement<DeliveryPackage> createGetDeliveryPackageByKeyResponseGetDeliveryPackageByKeyResult(DeliveryPackage value) {
        return new JAXBElement<DeliveryPackage>(_GetDeliveryPackageByKeyResponseGetDeliveryPackageByKeyResult_QNAME, DeliveryPackage.class, GetDeliveryPackageByKeyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = CurrencyDenomination.class)
    public JAXBElement<String> createCurrencyDenominationDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, CurrencyDenomination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveAttributeResult", scope = SaveAttributeResponse.class)
    public JAXBElement<AttributeMaster> createSaveAttributeResponseSaveAttributeResult(AttributeMaster value) {
        return new JAXBElement<AttributeMaster>(_SaveAttributeResponseSaveAttributeResult_QNAME, AttributeMaster.class, SaveAttributeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "purchaseOrder", scope = SavePurchaseOrder.class)
    public JAXBElement<PurchaseOrder> createSavePurchaseOrderPurchaseOrder(PurchaseOrder value) {
        return new JAXBElement<PurchaseOrder>(_SavePurchaseOrderPurchaseOrder_QNAME, PurchaseOrder.class, SavePurchaseOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteProduct.class)
    public JAXBElement<String> createDeleteProductId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWarehouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveWarehouseListResult", scope = SaveWarehouseListResponse.class)
    public JAXBElement<ArrayOfWarehouse> createSaveWarehouseListResponseSaveWarehouseListResult(ArrayOfWarehouse value) {
        return new JAXBElement<ArrayOfWarehouse>(_SaveWarehouseListResponseSaveWarehouseListResult_QNAME, ArrayOfWarehouse.class, SaveWarehouseListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productGroupList", scope = SaveProductGroupList.class)
    public JAXBElement<ArrayOfProductGroup> createSaveProductGroupListProductGroupList(ArrayOfProductGroup value) {
        return new JAXBElement<ArrayOfProductGroup>(_SaveProductGroupListProductGroupList_QNAME, ArrayOfProductGroup.class, SaveProductGroupList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Warehouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetWarehouseResult", scope = GetWarehouseResponse.class)
    public JAXBElement<Warehouse> createGetWarehouseResponseGetWarehouseResult(Warehouse value) {
        return new JAXBElement<Warehouse>(_GetWarehouseResponseGetWarehouseResult_QNAME, Warehouse.class, GetWarehouseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteCoupon.class)
    public JAXBElement<String> createDeleteCouponId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteCoupon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveAttributeListResult", scope = SaveAttributeListResponse.class)
    public JAXBElement<ArrayOfAttributeMaster> createSaveAttributeListResponseSaveAttributeListResult(ArrayOfAttributeMaster value) {
        return new JAXBElement<ArrayOfAttributeMaster>(_SaveAttributeListResponseSaveAttributeListResult_QNAME, ArrayOfAttributeMaster.class, SaveAttributeListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productCostList", scope = SaveProductCost.class)
    public JAXBElement<ArrayOfProductCost> createSaveProductCostProductCostList(ArrayOfProductCost value) {
        return new JAXBElement<ArrayOfProductCost>(_SaveProductCostProductCostList_QNAME, ArrayOfProductCost.class, SaveProductCost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteCustomer.class)
    public JAXBElement<String> createDeleteCustomerId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlternateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "alternateItemList", scope = RemoveAlternateItems.class)
    public JAXBElement<ArrayOfAlternateItem> createRemoveAlternateItemsAlternateItemList(ArrayOfAlternateItem value) {
        return new JAXBElement<ArrayOfAlternateItem>(_RemoveAlternateItemsAlternateItemList_QNAME, ArrayOfAlternateItem.class, RemoveAlternateItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ToWarehouseId", scope = StockTransferRequisition.class)
    public JAXBElement<String> createStockTransferRequisitionToWarehouseId(String value) {
        return new JAXBElement<String>(_StockTransferRequisitionToWarehouseId_QNAME, String.class, StockTransferRequisition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RequestNumber", scope = StockTransferRequisition.class)
    public JAXBElement<String> createStockTransferRequisitionRequestNumber(String value) {
        return new JAXBElement<String>(_StockTransferRequestNumber_QNAME, String.class, StockTransferRequisition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockTransferRequisitionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StockTransferRequestDetails", scope = StockTransferRequisition.class)
    public JAXBElement<ArrayOfStockTransferRequisitionDetail> createStockTransferRequisitionStockTransferRequestDetails(ArrayOfStockTransferRequisitionDetail value) {
        return new JAXBElement<ArrayOfStockTransferRequisitionDetail>(_StockTransferRequisitionStockTransferRequestDetails_QNAME, ArrayOfStockTransferRequisitionDetail.class, StockTransferRequisition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReferenceNumber2", scope = StockTransferRequisition.class)
    public JAXBElement<String> createStockTransferRequisitionReferenceNumber2(String value) {
        return new JAXBElement<String>(_StockTransferReferenceNumber2_QNAME, String.class, StockTransferRequisition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FromWarehouseId", scope = StockTransferRequisition.class)
    public JAXBElement<String> createStockTransferRequisitionFromWarehouseId(String value) {
        return new JAXBElement<String>(_StockTransferRequisitionFromWarehouseId_QNAME, String.class, StockTransferRequisition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReferenceNumber1", scope = StockTransferRequisition.class)
    public JAXBElement<String> createStockTransferRequisitionReferenceNumber1(String value) {
        return new JAXBElement<String>(_StockTransferReferenceNumber1_QNAME, String.class, StockTransferRequisition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = StockTransferRequisition.class)
    public JAXBElement<String> createStockTransferRequisitionComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, StockTransferRequisition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteUOM.class)
    public JAXBElement<String> createDeleteUOMId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteUOM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_GetDeltaQueueResult", scope = XGetDeltaQueueResponse.class)
    public JAXBElement<ArrayOfIntegrationQueue> createXGetDeltaQueueResponseXGetDeltaQueueResult(ArrayOfIntegrationQueue value) {
        return new JAXBElement<ArrayOfIntegrationQueue>(_XGetDeltaQueueResponseXGetDeltaQueueResult_QNAME, ArrayOfIntegrationQueue.class, XGetDeltaQueueResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SavePurchaseOrderResult", scope = SavePurchaseOrderResponse.class)
    public JAXBElement<PurchaseOrder> createSavePurchaseOrderResponseSavePurchaseOrderResult(PurchaseOrder value) {
        return new JAXBElement<PurchaseOrder>(_SavePurchaseOrderResponseSavePurchaseOrderResult_QNAME, PurchaseOrder.class, SavePurchaseOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShippingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "shippingTypeList", scope = SaveShippingTypeList.class)
    public JAXBElement<ArrayOfShippingType> createSaveShippingTypeListShippingTypeList(ArrayOfShippingType value) {
        return new JAXBElement<ArrayOfShippingType>(_SaveShippingTypeListShippingTypeList_QNAME, ArrayOfShippingType.class, SaveShippingTypeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ElectronicId", scope = Customer.class)
    public JAXBElement<String> createCustomerElectronicId(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationElectronicId_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Gender", scope = Customer.class)
    public JAXBElement<String> createCustomerGender(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationGender_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address", scope = Customer.class)
    public JAXBElement<Address> createCustomerAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Email", scope = Customer.class)
    public JAXBElement<String> createCustomerEmail(String value) {
        return new JAXBElement<String>(_VendorEmail_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "MiddleName", scope = Customer.class)
    public JAXBElement<String> createCustomerMiddleName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationMiddleName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesTaxCodeId", scope = Customer.class)
    public JAXBElement<String> createCustomerSalesTaxCodeId(String value) {
        return new JAXBElement<String>(_WarehouseSalesTaxCodeId_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ShippingAddresses", scope = Customer.class)
    public JAXBElement<ArrayOfAddress> createCustomerShippingAddresses(ArrayOfAddress value) {
        return new JAXBElement<ArrayOfAddress>(_VendorShippingAddresses_QNAME, ArrayOfAddress.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BillingAddresses", scope = Customer.class)
    public JAXBElement<ArrayOfAddress> createCustomerBillingAddresses(ArrayOfAddress value) {
        return new JAXBElement<ArrayOfAddress>(_VendorBillingAddresses_QNAME, ArrayOfAddress.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "WebPage", scope = Customer.class)
    public JAXBElement<String> createCustomerWebPage(String value) {
        return new JAXBElement<String>(_VendorWebPage_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AnniversaryDate", scope = Customer.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerAnniversaryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LoyaltyCardInformationAnniversaryDate_QNAME, XMLGregorianCalendar.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyalityId", scope = Customer.class)
    public JAXBElement<String> createCustomerLoyalityId(String value) {
        return new JAXBElement<String>(_CustomerLoyalityId_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PrimaryBillingAddresses", scope = Customer.class)
    public JAXBElement<String> createCustomerPrimaryBillingAddresses(String value) {
        return new JAXBElement<String>(_CustomerPrimaryBillingAddresses_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Title", scope = Customer.class)
    public JAXBElement<String> createCustomerTitle(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationTitle_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BirthDate", scope = Customer.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LoyaltyCardInformationBirthDate_QNAME, XMLGregorianCalendar.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PhoneNumber", scope = Customer.class)
    public JAXBElement<String> createCustomerPhoneNumber(String value) {
        return new JAXBElement<String>(_VendorPhoneNumber_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CompanyName", scope = Customer.class)
    public JAXBElement<String> createCustomerCompanyName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationCompanyName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Salutation", scope = Customer.class)
    public JAXBElement<String> createCustomerSalutation(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationSalutation_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FaxNumber", scope = Customer.class)
    public JAXBElement<String> createCustomerFaxNumber(String value) {
        return new JAXBElement<String>(_VendorFaxNumber_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PrimaryShippingAddresses", scope = Customer.class)
    public JAXBElement<String> createCustomerPrimaryShippingAddresses(String value) {
        return new JAXBElement<String>(_CustomerPrimaryShippingAddresses_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceListId", scope = Customer.class)
    public JAXBElement<String> createCustomerPriceListId(String value) {
        return new JAXBElement<String>(_WarehousePriceListId_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ShippingTypeId", scope = Customer.class)
    public JAXBElement<String> createCustomerShippingTypeId(String value) {
        return new JAXBElement<String>(_CustomerShippingTypeId_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "MobilePhone", scope = Customer.class)
    public JAXBElement<String> createCustomerMobilePhone(String value) {
        return new JAXBElement<String>(_VendorMobilePhone_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Contacts", scope = Customer.class)
    public JAXBElement<ArrayOfContact> createCustomerContacts(ArrayOfContact value) {
        return new JAXBElement<ArrayOfContact>(_CustomerContacts_QNAME, ArrayOfContact.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "NickName", scope = Customer.class)
    public JAXBElement<String> createCustomerNickName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationNickName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AlternatePhoneNumber", scope = Customer.class)
    public JAXBElement<String> createCustomerAlternatePhoneNumber(String value) {
        return new JAXBElement<String>(_VendorAlternatePhoneNumber_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PrimaryContactId", scope = Customer.class)
    public JAXBElement<String> createCustomerPrimaryContactId(String value) {
        return new JAXBElement<String>(_CustomerPrimaryContactId_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TaxNumber", scope = Customer.class)
    public JAXBElement<String> createCustomerTaxNumber(String value) {
        return new JAXBElement<String>(_VendorTaxNumber_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LastName", scope = Customer.class)
    public JAXBElement<String> createCustomerLastName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationLastName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Enterprise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetEnterpriseResult", scope = GetEnterpriseResponse.class)
    public JAXBElement<Enterprise> createGetEnterpriseResponseGetEnterpriseResult(Enterprise value) {
        return new JAXBElement<Enterprise>(_GetEnterpriseResponseGetEnterpriseResult_QNAME, Enterprise.class, GetEnterpriseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockTransferBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StockTransferBatchDetailList", scope = StockTransferDetail.class)
    public JAXBElement<ArrayOfStockTransferBatchDetail> createStockTransferDetailStockTransferBatchDetailList(ArrayOfStockTransferBatchDetail value) {
        return new JAXBElement<ArrayOfStockTransferBatchDetail>(_StockTransferDetailStockTransferBatchDetailList_QNAME, ArrayOfStockTransferBatchDetail.class, StockTransferDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockTransferSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StockTransferSerialDetailList", scope = StockTransferDetail.class)
    public JAXBElement<ArrayOfStockTransferSerialDetail> createStockTransferDetailStockTransferSerialDetailList(ArrayOfStockTransferSerialDetail value) {
        return new JAXBElement<ArrayOfStockTransferSerialDetail>(_StockTransferDetailStockTransferSerialDetailList_QNAME, ArrayOfStockTransferSerialDetail.class, StockTransferDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMId", scope = StockTransferDetail.class)
    public JAXBElement<String> createStockTransferDetailUOMId(String value) {
        return new JAXBElement<String>(_PromotionGetUOMId_QNAME, String.class, StockTransferDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = StockTransferDetail.class)
    public JAXBElement<String> createStockTransferDetailDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, StockTransferDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionSalesPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesPerson", scope = PostDelivery.class)
    public JAXBElement<TransactionSalesPerson> createPostDeliverySalesPerson(TransactionSalesPerson value) {
        return new JAXBElement<TransactionSalesPerson>(_PostTransactionSalesPerson_QNAME, TransactionSalesPerson.class, PostDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CouponId", scope = PostDelivery.class)
    public JAXBElement<String> createPostDeliveryCouponId(String value) {
        return new JAXBElement<String>(_PostTransactionCouponId_QNAME, String.class, PostDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SurchargeList", scope = PostDelivery.class)
    public JAXBElement<ArrayOfTransactionSurcharge> createPostDeliverySurchargeList(ArrayOfTransactionSurcharge value) {
        return new JAXBElement<ArrayOfTransactionSurcharge>(_PostTransactionSurchargeList_QNAME, ArrayOfTransactionSurcharge.class, PostDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerRefNumber", scope = PostDelivery.class)
    public JAXBElement<String> createPostDeliveryCustomerRefNumber(String value) {
        return new JAXBElement<String>(_PostTransactionCustomerRefNumber_QNAME, String.class, PostDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionId", scope = PostDelivery.class)
    public JAXBElement<String> createPostDeliveryTransactionId(String value) {
        return new JAXBElement<String>(_TransactionServerParametersTransactionId_QNAME, String.class, PostDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyId", scope = PostDelivery.class)
    public JAXBElement<String> createPostDeliveryLoyaltyId(String value) {
        return new JAXBElement<String>(_PostTransactionLoyaltyId_QNAME, String.class, PostDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CurrentNumberOfSeries", scope = PostDelivery.class)
    public JAXBElement<String> createPostDeliveryCurrentNumberOfSeries(String value) {
        return new JAXBElement<String>(_PostTransactionCurrentNumberOfSeries_QNAME, String.class, PostDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Payments", scope = PostDelivery.class)
    public JAXBElement<ArrayOfTransactionPayment> createPostDeliveryPayments(ArrayOfTransactionPayment value) {
        return new JAXBElement<ArrayOfTransactionPayment>(_PostTransactionPayments_QNAME, ArrayOfTransactionPayment.class, PostDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostDeliveryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DeliveryItemList", scope = PostDelivery.class)
    public JAXBElement<ArrayOfPostDeliveryItem> createPostDeliveryDeliveryItemList(ArrayOfPostDeliveryItem value) {
        return new JAXBElement<ArrayOfPostDeliveryItem>(_PostTransactionDeliveryItemList_QNAME, ArrayOfPostDeliveryItem.class, PostDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SavePriceMatrixResult", scope = SavePriceMatrixResponse.class)
    public JAXBElement<ArrayOfPriceMatrix> createSavePriceMatrixResponseSavePriceMatrixResult(ArrayOfPriceMatrix value) {
        return new JAXBElement<ArrayOfPriceMatrix>(_SavePriceMatrixResponseSavePriceMatrixResult_QNAME, ArrayOfPriceMatrix.class, SavePriceMatrixResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetUOMGroup.class)
    public JAXBElement<String> createGetUOMGroupId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetUOMGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLoyaltyPrePrintedCards }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetPrePrintedLoyaltyCardsBySiteIdResult", scope = GetPrePrintedLoyaltyCardsBySiteIdResponse.class)
    public JAXBElement<ArrayOfLoyaltyPrePrintedCards> createGetPrePrintedLoyaltyCardsBySiteIdResponseGetPrePrintedLoyaltyCardsBySiteIdResult(ArrayOfLoyaltyPrePrintedCards value) {
        return new JAXBElement<ArrayOfLoyaltyPrePrintedCards>(_GetPrePrintedLoyaltyCardsBySiteIdResponseGetPrePrintedLoyaltyCardsBySiteIdResult_QNAME, ArrayOfLoyaltyPrePrintedCards.class, GetPrePrintedLoyaltyCardsBySiteIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BankCode", scope = PaymentResponse.class)
    public JAXBElement<String> createPaymentResponseBankCode(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestBankCode_QNAME, String.class, PaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AdditionalInformation", scope = PaymentResponse.class)
    public JAXBElement<String> createPaymentResponseAdditionalInformation(String value) {
        return new JAXBElement<String>(_PaymentResponseAdditionalInformation_QNAME, String.class, PaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AuthorizationCode", scope = PaymentResponse.class)
    public JAXBElement<String> createPaymentResponseAuthorizationCode(String value) {
        return new JAXBElement<String>(_TransactionPaymentAuthorizationCode_QNAME, String.class, PaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CardName", scope = PaymentResponse.class)
    public JAXBElement<String> createPaymentResponseCardName(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestCardName_QNAME, String.class, PaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CardNumber", scope = PaymentResponse.class)
    public JAXBElement<String> createPaymentResponseCardNumber(String value) {
        return new JAXBElement<String>(_AuthorizePaymentRequestCardNumber_QNAME, String.class, PaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentReferenceNumber", scope = PaymentResponse.class)
    public JAXBElement<String> createPaymentResponsePaymentReferenceNumber(String value) {
        return new JAXBElement<String>(_TransactionPaymentPaymentReferenceNumber_QNAME, String.class, PaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetLineAttributeResult", scope = GetLineAttributeResponse.class)
    public JAXBElement<LineAttribute> createGetLineAttributeResponseGetLineAttributeResult(LineAttribute value) {
        return new JAXBElement<LineAttribute>(_GetLineAttributeResponseGetLineAttributeResult_QNAME, LineAttribute.class, GetLineAttributeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManufacturerGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveManufacturerDiscountListResult", scope = SaveManufacturerDiscountListResponse.class)
    public JAXBElement<ArrayOfManufacturerGroupDiscount> createSaveManufacturerDiscountListResponseSaveManufacturerDiscountListResult(ArrayOfManufacturerGroupDiscount value) {
        return new JAXBElement<ArrayOfManufacturerGroupDiscount>(_SaveManufacturerDiscountListResponseSaveManufacturerDiscountListResult_QNAME, ArrayOfManufacturerGroupDiscount.class, SaveManufacturerDiscountListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "dataObject", scope = RegisterLoyaltyCustomer.class)
    public JAXBElement<Customer> createRegisterLoyaltyCustomerDataObject(Customer value) {
        return new JAXBElement<Customer>(_AuthorizePaymentDataObject_QNAME, Customer.class, RegisterLoyaltyCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplicationSendDump }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveDumpResult", scope = SaveDumpResponse.class)
    public JAXBElement<ReplicationSendDump> createSaveDumpResponseSaveDumpResult(ReplicationSendDump value) {
        return new JAXBElement<ReplicationSendDump>(_SaveDumpResponseSaveDumpResult_QNAME, ReplicationSendDump.class, SaveDumpResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetDeliveryPackageByIdResult", scope = GetDeliveryPackageByIdResponse.class)
    public JAXBElement<DeliveryPackage> createGetDeliveryPackageByIdResponseGetDeliveryPackageByIdResult(DeliveryPackage value) {
        return new JAXBElement<DeliveryPackage>(_GetDeliveryPackageByIdResponseGetDeliveryPackageByIdResult_QNAME, DeliveryPackage.class, GetDeliveryPackageByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveStockTransferResult", scope = SaveStockTransferResponse.class)
    public JAXBElement<StockTransfer> createSaveStockTransferResponseSaveStockTransferResult(StockTransfer value) {
        return new JAXBElement<StockTransfer>(_SaveStockTransferResponseSaveStockTransferResult_QNAME, StockTransfer.class, SaveStockTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetManufacturerResult", scope = GetManufacturerResponse.class)
    public JAXBElement<Manufacturer> createGetManufacturerResponseGetManufacturerResult(Manufacturer value) {
        return new JAXBElement<Manufacturer>(_GetManufacturerResponseGetManufacturerResult_QNAME, Manufacturer.class, GetManufacturerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionBonusBuys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SavePromotionalBonusBuysResult", scope = SavePromotionalBonusBuysResponse.class)
    public JAXBElement<PromotionBonusBuys> createSavePromotionalBonusBuysResponseSavePromotionalBonusBuysResult(PromotionBonusBuys value) {
        return new JAXBElement<PromotionBonusBuys>(_SavePromotionalBonusBuysResponseSavePromotionalBonusBuysResult_QNAME, PromotionBonusBuys.class, SavePromotionalBonusBuysResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetPriceList.class)
    public JAXBElement<String> createGetPriceListId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetPriceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetVendorResult", scope = GetVendorResponse.class)
    public JAXBElement<Vendor> createGetVendorResponseGetVendorResult(Vendor value) {
        return new JAXBElement<Vendor>(_GetVendorResponseGetVendorResult_QNAME, Vendor.class, GetVendorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductBOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productList", scope = SetAssemblyComponents.class)
    public JAXBElement<ArrayOfProductBOM> createSetAssemblyComponentsProductList(ArrayOfProductBOM value) {
        return new JAXBElement<ArrayOfProductBOM>(_SetAssemblyComponentsProductList_QNAME, ArrayOfProductBOM.class, SetAssemblyComponents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "priceMatrixList", scope = SavePriceMatrix.class)
    public JAXBElement<ArrayOfPriceMatrix> createSavePriceMatrixPriceMatrixList(ArrayOfPriceMatrix value) {
        return new JAXBElement<ArrayOfPriceMatrix>(_SavePriceMatrixPriceMatrixList_QNAME, ArrayOfPriceMatrix.class, SavePriceMatrix.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "priceList", scope = SavePriceList.class)
    public JAXBElement<PriceList> createSavePriceListPriceList(PriceList value) {
        return new JAXBElement<PriceList>(_SavePriceListPriceList_QNAME, PriceList.class, SavePriceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "siteId", scope = GetReplicationSendDump.class)
    public JAXBElement<String> createGetReplicationSendDumpSiteId(String value) {
        return new JAXBElement<String>(_GetReplicationSendDumpSiteId_QNAME, String.class, GetReplicationSendDump.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostDelivery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PostFulfillmentResult", scope = PostFulfillmentResponse.class)
    public JAXBElement<PostDelivery> createPostFulfillmentResponsePostFulfillmentResult(PostDelivery value) {
        return new JAXBElement<PostDelivery>(_PostFulfillmentResponsePostFulfillmentResult_QNAME, PostDelivery.class, PostFulfillmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FaxNumber", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressFaxNumber(String value) {
        return new JAXBElement<String>(_VendorFaxNumber_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AlternatePhoneNumber", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressAlternatePhoneNumber(String value) {
        return new JAXBElement<String>(_VendorAlternatePhoneNumber_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address1", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressAddress1(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress1_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address3", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressAddress3(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress3_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address2", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressAddress2(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress2_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CountryName", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressCountryName(String value) {
        return new JAXBElement<String>(_DeliveryPackageAddressCountryName_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "County", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressCounty(String value) {
        return new JAXBElement<String>(_DeliveryPackageAddressCounty_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "City", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressCity(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationCity_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StateName", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressStateName(String value) {
        return new JAXBElement<String>(_DeliveryPackageAddressStateName_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FullAddress", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressFullAddress(String value) {
        return new JAXBElement<String>(_DeliveryPackageAddressFullAddress_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ZipCode", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressZipCode(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationZipCode_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PhoneNumber", scope = DeliveryPackageAddress.class)
    public JAXBElement<String> createDeliveryPackageAddressPhoneNumber(String value) {
        return new JAXBElement<String>(_VendorPhoneNumber_QNAME, String.class, DeliveryPackageAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "loyaltyId", scope = GetPointsSummary.class)
    public JAXBElement<String> createGetPointsSummaryLoyaltyId(String value) {
        return new JAXBElement<String>(_GetMonthlyPointsSummaryLoyaltyId_QNAME, String.class, GetPointsSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductUpsell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RemoveUpsellItemsResult", scope = RemoveUpsellItemsResponse.class)
    public JAXBElement<ArrayOfProductUpsell> createRemoveUpsellItemsResponseRemoveUpsellItemsResult(ArrayOfProductUpsell value) {
        return new JAXBElement<ArrayOfProductUpsell>(_RemoveUpsellItemsResponseRemoveUpsellItemsResult_QNAME, ArrayOfProductUpsell.class, RemoveUpsellItemsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AuthorizePaymentResult", scope = AuthorizePaymentResponse.class)
    public JAXBElement<PaymentResponse> createAuthorizePaymentResponseAuthorizePaymentResult(PaymentResponse value) {
        return new JAXBElement<PaymentResponse>(_AuthorizePaymentResponseAuthorizePaymentResult_QNAME, PaymentResponse.class, AuthorizePaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUOMGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveUOMGroupListResult", scope = SaveUOMGroupListResponse.class)
    public JAXBElement<ArrayOfUOMGroup> createSaveUOMGroupListResponseSaveUOMGroupListResult(ArrayOfUOMGroup value) {
        return new JAXBElement<ArrayOfUOMGroup>(_SaveUOMGroupListResponseSaveUOMGroupListResult_QNAME, ArrayOfUOMGroup.class, SaveUOMGroupListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductUpsell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveUpsellItemsResult", scope = SaveUpsellItemsResponse.class)
    public JAXBElement<ArrayOfProductUpsell> createSaveUpsellItemsResponseSaveUpsellItemsResult(ArrayOfProductUpsell value) {
        return new JAXBElement<ArrayOfProductUpsell>(_SaveUpsellItemsResponseSaveUpsellItemsResult_QNAME, ArrayOfProductUpsell.class, SaveUpsellItemsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "masterRecord", scope = UpdateMasterObject.class)
    public JAXBElement<UpdateMaster> createUpdateMasterObjectMasterRecord(UpdateMaster value) {
        return new JAXBElement<UpdateMaster>(_UpdateMasterObjectMasterRecord_QNAME, UpdateMaster.class, UpdateMasterObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetCoupon.class)
    public JAXBElement<String> createGetCouponId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetCoupon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductBOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productList", scope = SetKitComponents.class)
    public JAXBElement<ArrayOfProductBOM> createSetKitComponentsProductList(ArrayOfProductBOM value) {
        return new JAXBElement<ArrayOfProductBOM>(_SetAssemblyComponentsProductList_QNAME, ArrayOfProductBOM.class, SetKitComponents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = UserDefinedFieldsValidValue.class)
    public JAXBElement<String> createUserDefinedFieldsValidValueDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, UserDefinedFieldsValidValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserId", scope = TransactionSalesPerson.class)
    public JAXBElement<String> createTransactionSalesPersonUserId(String value) {
        return new JAXBElement<String>(_TransactionUserId_QNAME, String.class, TransactionSalesPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCurrencyListResult", scope = SaveCurrencyListResponse.class)
    public JAXBElement<ArrayOfCurrency> createSaveCurrencyListResponseSaveCurrencyListResult(ArrayOfCurrency value) {
        return new JAXBElement<ArrayOfCurrency>(_SaveCurrencyListResponseSaveCurrencyListResult_QNAME, ArrayOfCurrency.class, SaveCurrencyListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetQueueResult", scope = GetQueueResponse.class)
    public JAXBElement<ArrayOfIntegrationQueue> createGetQueueResponseGetQueueResult(ArrayOfIntegrationQueue value) {
        return new JAXBElement<ArrayOfIntegrationQueue>(_GetQueueResponseGetQueueResult_QNAME, ArrayOfIntegrationQueue.class, GetQueueResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "goodsReceiptPOList", scope = SaveGoodsReceiptPOList.class)
    public JAXBElement<ArrayOfGoodsReceiptPO> createSaveGoodsReceiptPOListGoodsReceiptPOList(ArrayOfGoodsReceiptPO value) {
        return new JAXBElement<ArrayOfGoodsReceiptPO>(_SaveGoodsReceiptPOListGoodsReceiptPOList_QNAME, ArrayOfGoodsReceiptPO.class, SaveGoodsReceiptPOList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Password", scope = ValidateLicenseForIntegration.class)
    public JAXBElement<String> createValidateLicenseForIntegrationPassword(String value) {
        return new JAXBElement<String>(_GetNextNumberPassword_QNAME, String.class, ValidateLicenseForIntegration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserId", scope = ValidateLicenseForIntegration.class)
    public JAXBElement<String> createValidateLicenseForIntegrationUserId(String value) {
        return new JAXBElement<String>(_TransactionUserId_QNAME, String.class, ValidateLicenseForIntegration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentTypeSurchargeList", scope = PaymentType.class)
    public JAXBElement<ArrayOfPaymentTypeSurcharge> createPaymentTypePaymentTypeSurchargeList(ArrayOfPaymentTypeSurcharge value) {
        return new JAXBElement<ArrayOfPaymentTypeSurcharge>(_PaymentTypePaymentTypeSurchargeList_QNAME, ArrayOfPaymentTypeSurcharge.class, PaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentTypeAttributeList", scope = PaymentType.class)
    public JAXBElement<ArrayOfPaymentTypeAttribute> createPaymentTypePaymentTypeAttributeList(ArrayOfPaymentTypeAttribute value) {
        return new JAXBElement<ArrayOfPaymentTypeAttribute>(_PaymentTypePaymentTypeAttributeList_QNAME, ArrayOfPaymentTypeAttribute.class, PaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentTypeDiscountList", scope = PaymentType.class)
    public JAXBElement<ArrayOfPaymentTypeDiscount> createPaymentTypePaymentTypeDiscountList(ArrayOfPaymentTypeDiscount value) {
        return new JAXBElement<ArrayOfPaymentTypeDiscount>(_PaymentTypePaymentTypeDiscountList_QNAME, ArrayOfPaymentTypeDiscount.class, PaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = PaymentType.class)
    public JAXBElement<String> createPaymentTypeDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, PaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMId", scope = PurchaseOrderDetail.class)
    public JAXBElement<String> createPurchaseOrderDetailUOMId(String value) {
        return new JAXBElement<String>(_PromotionGetUOMId_QNAME, String.class, PurchaseOrderDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = PurchaseOrderDetail.class)
    public JAXBElement<String> createPurchaseOrderDetailDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, PurchaseOrderDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrderSurchargeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ItemSurcharges", scope = PurchaseOrderDetail.class)
    public JAXBElement<ArrayOfPurchaseOrderSurchargeDTO> createPurchaseOrderDetailItemSurcharges(ArrayOfPurchaseOrderSurchargeDTO value) {
        return new JAXBElement<ArrayOfPurchaseOrderSurchargeDTO>(_PurchaseOrderDetailItemSurcharges_QNAME, ArrayOfPurchaseOrderSurchargeDTO.class, PurchaseOrderDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = PurchaseOrderDetail.class)
    public JAXBElement<String> createPurchaseOrderDetailComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, PurchaseOrderDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxCodeCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveTaxCodeConditionListResult", scope = SaveTaxCodeConditionListResponse.class)
    public JAXBElement<ArrayOfTaxCodeCondition> createSaveTaxCodeConditionListResponseSaveTaxCodeConditionListResult(ArrayOfTaxCodeCondition value) {
        return new JAXBElement<ArrayOfTaxCodeCondition>(_SaveTaxCodeConditionListResponseSaveTaxCodeConditionListResult_QNAME, ArrayOfTaxCodeCondition.class, SaveTaxCodeConditionListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetSurcharge.class)
    public JAXBElement<String> createGetSurchargeId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetSurcharge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Password", scope = ExecuteQueries.class)
    public JAXBElement<String> createExecuteQueriesPassword(String value) {
        return new JAXBElement<String>(_GetNextNumberPassword_QNAME, String.class, ExecuteQueries.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "QueryList", scope = ExecuteQueries.class)
    public JAXBElement<ArrayOfstring> createExecuteQueriesQueryList(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ExecuteQueriesQueryList_QNAME, ArrayOfstring.class, ExecuteQueries.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserId", scope = ExecuteQueries.class)
    public JAXBElement<String> createExecuteQueriesUserId(String value) {
        return new JAXBElement<String>(_TransactionUserId_QNAME, String.class, ExecuteQueries.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XDeleteSuspendedTransaction.class)
    public JAXBElement<String> createXDeleteSuspendedTransactionApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XDeleteSuspendedTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XDeleteSuspendedTransaction.class)
    public JAXBElement<String> createXDeleteSuspendedTransactionUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XDeleteSuspendedTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetWarehouse.class)
    public JAXBElement<String> createGetWarehouseId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetWarehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AdmissionDate", scope = Batch.class)
    public JAXBElement<XMLGregorianCalendar> createBatchAdmissionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialAdmissionDate_QNAME, XMLGregorianCalendar.class, Batch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = Batch.class)
    public JAXBElement<String> createBatchDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, Batch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ManufacturingDate", scope = Batch.class)
    public JAXBElement<XMLGregorianCalendar> createBatchManufacturingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialManufacturingDate_QNAME, XMLGregorianCalendar.class, Batch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExpirationDate", scope = Batch.class)
    public JAXBElement<XMLGregorianCalendar> createBatchExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialExpirationDate_QNAME, XMLGregorianCalendar.class, Batch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQueryResultResponse.GetQueryResultResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetQueryResultResult", scope = GetQueryResultResponse.class)
    public JAXBElement<GetQueryResultResponse.GetQueryResultResult> createGetQueryResultResponseGetQueryResultResult(GetQueryResultResponse.GetQueryResultResult value) {
        return new JAXBElement<GetQueryResultResponse.GetQueryResultResult>(_GetQueryResultResponseGetQueryResultResult_QNAME, GetQueryResultResponse.GetQueryResultResult.class, GetQueryResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveTransactionResult", scope = SaveTransactionResponse.class)
    public JAXBElement<PostTransaction> createSaveTransactionResponseSaveTransactionResult(PostTransaction value) {
        return new JAXBElement<PostTransaction>(_SaveTransactionResponseSaveTransactionResult_QNAME, PostTransaction.class, SaveTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = CancelSalesOrder.class)
    public JAXBElement<String> createCancelSalesOrderApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, CancelSalesOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "transactionKey", scope = CancelSalesOrder.class)
    public JAXBElement<String> createCancelSalesOrderTransactionKey(String value) {
        return new JAXBElement<String>(_CancelSalesOrderTransactionKey_QNAME, String.class, CancelSalesOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = CancelSalesOrder.class)
    public JAXBElement<String> createCancelSalesOrderUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, CancelSalesOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SetFinalInventoryResult", scope = SetFinalInventoryResponse.class)
    public JAXBElement<ArrayOfInventoryUpdate> createSetFinalInventoryResponseSetFinalInventoryResult(ArrayOfInventoryUpdate value) {
        return new JAXBElement<ArrayOfInventoryUpdate>(_SetFinalInventoryResponseSetFinalInventoryResult_QNAME, ArrayOfInventoryUpdate.class, SetFinalInventoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetVendorGroup.class)
    public JAXBElement<String> createGetVendorGroupId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetVendorGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteQueriesResponse.ExecuteQueriesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExecuteQueriesResult", scope = ExecuteQueriesResponse.class)
    public JAXBElement<ExecuteQueriesResponse.ExecuteQueriesResult> createExecuteQueriesResponseExecuteQueriesResult(ExecuteQueriesResponse.ExecuteQueriesResult value) {
        return new JAXBElement<ExecuteQueriesResponse.ExecuteQueriesResult>(_ExecuteQueriesResponseExecuteQueriesResult_QNAME, ExecuteQueriesResponse.ExecuteQueriesResult.class, ExecuteQueriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RegisterLoyaltyCustomerResult", scope = RegisterLoyaltyCustomerResponse.class)
    public JAXBElement<Customer> createRegisterLoyaltyCustomerResponseRegisterLoyaltyCustomerResult(Customer value) {
        return new JAXBElement<Customer>(_RegisterLoyaltyCustomerResponseRegisterLoyaltyCustomerResult_QNAME, Customer.class, RegisterLoyaltyCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionBonusBuys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionBonusBuysList", scope = SavePromotionalBonusBuysList.class)
    public JAXBElement<ArrayOfPromotionBonusBuys> createSavePromotionalBonusBuysListPromotionBonusBuysList(ArrayOfPromotionBonusBuys value) {
        return new JAXBElement<ArrayOfPromotionBonusBuys>(_SavePromotionalBonusBuysListPromotionBonusBuysList_QNAME, ArrayOfPromotionBonusBuys.class, SavePromotionalBonusBuysList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "exchangeRate", scope = SaveExchangeRate.class)
    public JAXBElement<ExchangeRate> createSaveExchangeRateExchangeRate(ExchangeRate value) {
        return new JAXBElement<ExchangeRate>(_SaveExchangeRateExchangeRate_QNAME, ExchangeRate.class, SaveExchangeRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_GetExchangeRateResult", scope = XGetExchangeRateResponse.class)
    public JAXBElement<ExchangeRate> createXGetExchangeRateResponseXGetExchangeRateResult(ExchangeRate value) {
        return new JAXBElement<ExchangeRate>(_XGetExchangeRateResponseXGetExchangeRateResult_QNAME, ExchangeRate.class, XGetExchangeRateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "customer", scope = SaveCustomer.class)
    public JAXBElement<Customer> createSaveCustomerCustomer(Customer value) {
        return new JAXBElement<Customer>(_SaveCustomerCustomer_QNAME, Customer.class, SaveCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialPricing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "specialPrice", scope = SaveSpecialPrice.class)
    public JAXBElement<SpecialPricing> createSaveSpecialPriceSpecialPrice(SpecialPricing value) {
        return new JAXBElement<SpecialPricing>(_SaveSpecialPriceSpecialPrice_QNAME, SpecialPricing.class, SaveSpecialPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveStoreListResult", scope = SaveStoreListResponse.class)
    public JAXBElement<ArrayOfStore> createSaveStoreListResponseSaveStoreListResult(ArrayOfStore value) {
        return new JAXBElement<ArrayOfStore>(_SaveStoreListResponseSaveStoreListResult_QNAME, ArrayOfStore.class, SaveStoreListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionSalesPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesPersons", scope = TransactionItem.class)
    public JAXBElement<ArrayOfTransactionSalesPerson> createTransactionItemSalesPersons(ArrayOfTransactionSalesPerson value) {
        return new JAXBElement<ArrayOfTransactionSalesPerson>(_ARPaymentItemSalesPersons_QNAME, ArrayOfTransactionSalesPerson.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMId", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemUOMId(String value) {
        return new JAXBElement<String>(_PromotionGetUOMId_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaleItemType", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemSaleItemType(String value) {
        return new JAXBElement<String>(_TransactionItemSaleItemType_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionLineItemAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionLineItemAttributes", scope = TransactionItem.class)
    public JAXBElement<ArrayOfPostTransactionLineItemAttribute> createTransactionItemTransactionLineItemAttributes(ArrayOfPostTransactionLineItemAttribute value) {
        return new JAXBElement<ArrayOfPostTransactionLineItemAttribute>(_TransactionItemTransactionLineItemAttributes_QNAME, ArrayOfPostTransactionLineItemAttribute.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Surcharges", scope = TransactionItem.class)
    public JAXBElement<ArrayOfTransactionSurcharge> createTransactionItemSurcharges(ArrayOfTransactionSurcharge value) {
        return new JAXBElement<ArrayOfTransactionSurcharge>(_TransactionSurcharges_QNAME, ArrayOfTransactionSurcharge.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TaxCodeId", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargeTaxCodeId_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BookingStoreId", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemBookingStoreId(String value) {
        return new JAXBElement<String>(_TransactionItemBookingStoreId_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "WarehouseId", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemWarehouseId(String value) {
        return new JAXBElement<String>(_TransactionWarehouseId_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductDetailNumber", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemProductDetailNumber(String value) {
        return new JAXBElement<String>(_TransactionItemProductDetailNumber_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "OriginalDocumentId", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemOriginalDocumentId(String value) {
        return new JAXBElement<String>(_ARPaymentItemOriginalDocumentId_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Key", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemKey(String value) {
        return new JAXBElement<String>(_TransactionKey_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductId", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemProductId(String value) {
        return new JAXBElement<String>(_TransactionItemProductId_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DeliveryWarehouseId", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemDeliveryWarehouseId(String value) {
        return new JAXBElement<String>(_TransactionItemDeliveryWarehouseId_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductUPC", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemProductUPC(String value) {
        return new JAXBElement<String>(_TransactionItemProductUPC_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BookingWarehouseId", scope = TransactionItem.class)
    public JAXBElement<String> createTransactionItemBookingWarehouseId(String value) {
        return new JAXBElement<String>(_TransactionItemBookingWarehouseId_QNAME, String.class, TransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "warehouseId", scope = GetQueueByWarehouse.class)
    public JAXBElement<String> createGetQueueByWarehouseWarehouseId(String value) {
        return new JAXBElement<String>(_GetQueueByWarehouseWithoutStatusUpdateWarehouseId_QNAME, String.class, GetQueueByWarehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "manufacturerList", scope = SaveManufacturerList.class)
    public JAXBElement<ArrayOfManufacturer> createSaveManufacturerListManufacturerList(ArrayOfManufacturer value) {
        return new JAXBElement<ArrayOfManufacturer>(_SaveManufacturerListManufacturerList_QNAME, ArrayOfManufacturer.class, SaveManufacturerList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UpdateLoyaltyCustomerResult", scope = UpdateLoyaltyCustomerResponse.class)
    public JAXBElement<Customer> createUpdateLoyaltyCustomerResponseUpdateLoyaltyCustomerResult(Customer value) {
        return new JAXBElement<Customer>(_UpdateLoyaltyCustomerResponseUpdateLoyaltyCustomerResult_QNAME, Customer.class, UpdateLoyaltyCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteSerial.class)
    public JAXBElement<String> createDeleteSerialId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetDeliveryPackageById.class)
    public JAXBElement<String> createGetDeliveryPackageByIdId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetDeliveryPackageById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVendorGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "vendorGroupList", scope = SaveVendorGroupList.class)
    public JAXBElement<ArrayOfVendorGroup> createSaveVendorGroupListVendorGroupList(ArrayOfVendorGroup value) {
        return new JAXBElement<ArrayOfVendorGroup>(_SaveVendorGroupListVendorGroupList_QNAME, ArrayOfVendorGroup.class, SaveVendorGroupList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetAttribute.class)
    public JAXBElement<String> createGetAttributeId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coupon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetCouponResult", scope = GetCouponResponse.class)
    public JAXBElement<Coupon> createGetCouponResponseGetCouponResult(Coupon value) {
        return new JAXBElement<Coupon>(_GetCouponResponseGetCouponResult_QNAME, Coupon.class, GetCouponResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoupon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CouponList", scope = SaveCouponList.class)
    public JAXBElement<ArrayOfCoupon> createSaveCouponListCouponList(ArrayOfCoupon value) {
        return new JAXBElement<ArrayOfCoupon>(_SaveCouponListCouponList_QNAME, ArrayOfCoupon.class, SaveCouponList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "customerGroup", scope = SaveCustomerGroup.class)
    public JAXBElement<CustomerGroup> createSaveCustomerGroupCustomerGroup(CustomerGroup value) {
        return new JAXBElement<CustomerGroup>(_SaveCustomerGroupCustomerGroup_QNAME, CustomerGroup.class, SaveCustomerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SavePriceListResult", scope = SavePriceListResponse.class)
    public JAXBElement<PriceList> createSavePriceListResponseSavePriceListResult(PriceList value) {
        return new JAXBElement<PriceList>(_SavePriceListResponseSavePriceListResult_QNAME, PriceList.class, SavePriceListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FaxNumber", scope = Address.class)
    public JAXBElement<String> createAddressFaxNumber(String value) {
        return new JAXBElement<String>(_VendorFaxNumber_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AlternatePhoneNumber", scope = Address.class)
    public JAXBElement<String> createAddressAlternatePhoneNumber(String value) {
        return new JAXBElement<String>(_VendorAlternatePhoneNumber_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StateId", scope = Address.class)
    public JAXBElement<String> createAddressStateId(String value) {
        return new JAXBElement<String>(_AddressStateId_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address3", scope = Address.class)
    public JAXBElement<String> createAddressAddress3(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress3_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address2", scope = Address.class)
    public JAXBElement<String> createAddressAddress2(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress2_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "County", scope = Address.class)
    public JAXBElement<String> createAddressCounty(String value) {
        return new JAXBElement<String>(_DeliveryPackageAddressCounty_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseTaxCodeId", scope = Address.class)
    public JAXBElement<String> createAddressPurchaseTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargePurchaseTaxCodeId_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesTaxCodeId", scope = Address.class)
    public JAXBElement<String> createAddressSalesTaxCodeId(String value) {
        return new JAXBElement<String>(_WarehouseSalesTaxCodeId_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "City", scope = Address.class)
    public JAXBElement<String> createAddressCity(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationCity_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ZipCode", scope = Address.class)
    public JAXBElement<String> createAddressZipCode(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationZipCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PhoneNumber", scope = Address.class)
    public JAXBElement<String> createAddressPhoneNumber(String value) {
        return new JAXBElement<String>(_VendorPhoneNumber_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CountryId", scope = Address.class)
    public JAXBElement<String> createAddressCountryId(String value) {
        return new JAXBElement<String>(_AddressCountryId_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SavePaymentTypeListResult", scope = SavePaymentTypeListResponse.class)
    public JAXBElement<ArrayOfPaymentType> createSavePaymentTypeListResponseSavePaymentTypeListResult(ArrayOfPaymentType value) {
        return new JAXBElement<ArrayOfPaymentType>(_SavePaymentTypeListResponseSavePaymentTypeListResult_QNAME, ArrayOfPaymentType.class, SavePaymentTypeListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMId", scope = PromotionBuy.class)
    public JAXBElement<String> createPromotionBuyUOMId(String value) {
        return new JAXBElement<String>(_PromotionGetUOMId_QNAME, String.class, PromotionBuy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetEmployee.class)
    public JAXBElement<String> createGetEmployeeId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetEmployee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CouponSerialNumber", scope = PostTransactionItem.class)
    public JAXBElement<String> createPostTransactionItemCouponSerialNumber(String value) {
        return new JAXBElement<String>(_PostTransactionCouponSerialNumber_QNAME, String.class, PostTransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionSalesPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesPerson", scope = PostTransactionItem.class)
    public JAXBElement<TransactionSalesPerson> createPostTransactionItemSalesPerson(TransactionSalesPerson value) {
        return new JAXBElement<TransactionSalesPerson>(_PostTransactionSalesPerson_QNAME, TransactionSalesPerson.class, PostTransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CouponId", scope = PostTransactionItem.class)
    public JAXBElement<String> createPostTransactionItemCouponId(String value) {
        return new JAXBElement<String>(_PostTransactionCouponId_QNAME, String.class, PostTransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SurchargeList", scope = PostTransactionItem.class)
    public JAXBElement<ArrayOfTransactionSurcharge> createPostTransactionItemSurchargeList(ArrayOfTransactionSurcharge value) {
        return new JAXBElement<ArrayOfTransactionSurcharge>(_PostTransactionSurchargeList_QNAME, ArrayOfTransactionSurcharge.class, PostTransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMId", scope = PostTransactionItem.class)
    public JAXBElement<String> createPostTransactionItemUOMId(String value) {
        return new JAXBElement<String>(_PromotionGetUOMId_QNAME, String.class, PostTransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "OriginalDocumentId", scope = PostTransactionItem.class)
    public JAXBElement<String> createPostTransactionItemOriginalDocumentId(String value) {
        return new JAXBElement<String>(_ARPaymentItemOriginalDocumentId_QNAME, String.class, PostTransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostTransactionLineItemAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionLineItemAttributes", scope = PostTransactionItem.class)
    public JAXBElement<ArrayOfPostTransactionLineItemAttribute> createPostTransactionItemTransactionLineItemAttributes(ArrayOfPostTransactionLineItemAttribute value) {
        return new JAXBElement<ArrayOfPostTransactionLineItemAttribute>(_TransactionItemTransactionLineItemAttributes_QNAME, ArrayOfPostTransactionLineItemAttribute.class, PostTransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionItemId", scope = PostTransactionItem.class)
    public JAXBElement<String> createPostTransactionItemTransactionItemId(String value) {
        return new JAXBElement<String>(_PostTransactionItemTransactionItemId_QNAME, String.class, PostTransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductReturnDetailNumber", scope = PostTransactionItem.class)
    public JAXBElement<String> createPostTransactionItemProductReturnDetailNumber(String value) {
        return new JAXBElement<String>(_PostTransactionItemProductReturnDetailNumber_QNAME, String.class, PostTransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductDetailNumber", scope = PostTransactionItem.class)
    public JAXBElement<String> createPostTransactionItemProductDetailNumber(String value) {
        return new JAXBElement<String>(_TransactionItemProductDetailNumber_QNAME, String.class, PostTransactionItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XSaveTransaction.class)
    public JAXBElement<String> createXSaveTransactionApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XSaveTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XSaveTransaction.class)
    public JAXBElement<String> createXSaveTransactionUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XSaveTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "data", scope = XSaveTransaction.class)
    public JAXBElement<PostTransaction> createXSaveTransactionData(PostTransaction value) {
        return new JAXBElement<PostTransaction>(_XAuthorizePaymentData_QNAME, PostTransaction.class, XSaveTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMId", scope = GoodsReceiptDetail.class)
    public JAXBElement<String> createGoodsReceiptDetailUOMId(String value) {
        return new JAXBElement<String>(_PromotionGetUOMId_QNAME, String.class, GoodsReceiptDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptSerialDetailList", scope = GoodsReceiptDetail.class)
    public JAXBElement<ArrayOfGoodsReceiptSerialDetail> createGoodsReceiptDetailGoodsReceiptSerialDetailList(ArrayOfGoodsReceiptSerialDetail value) {
        return new JAXBElement<ArrayOfGoodsReceiptSerialDetail>(_GoodsReceiptDetailGoodsReceiptSerialDetailList_QNAME, ArrayOfGoodsReceiptSerialDetail.class, GoodsReceiptDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptBatchDetailList", scope = GoodsReceiptDetail.class)
    public JAXBElement<ArrayOfGoodsReceiptBatchDetail> createGoodsReceiptDetailGoodsReceiptBatchDetailList(ArrayOfGoodsReceiptBatchDetail value) {
        return new JAXBElement<ArrayOfGoodsReceiptBatchDetail>(_GoodsReceiptDetailGoodsReceiptBatchDetailList_QNAME, ArrayOfGoodsReceiptBatchDetail.class, GoodsReceiptDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductDescription", scope = GoodsReceiptDetail.class)
    public JAXBElement<String> createGoodsReceiptDetailProductDescription(String value) {
        return new JAXBElement<String>(_PriceMatrixProductDescription_QNAME, String.class, GoodsReceiptDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveTaxCodeListResult", scope = SaveTaxCodeListResponse.class)
    public JAXBElement<ArrayOfTaxCode> createSaveTaxCodeListResponseSaveTaxCodeListResult(ArrayOfTaxCode value) {
        return new JAXBElement<ArrayOfTaxCode>(_SaveTaxCodeListResponseSaveTaxCodeListResult_QNAME, ArrayOfTaxCode.class, SaveTaxCodeListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = TaxCode.class)
    public JAXBElement<String> createTaxCodeDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, TaxCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxPeriodDefination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TaxPeriodDefinitionList", scope = TaxCode.class)
    public JAXBElement<ArrayOfTaxPeriodDefination> createTaxCodeTaxPeriodDefinitionList(ArrayOfTaxPeriodDefination value) {
        return new JAXBElement<ArrayOfTaxPeriodDefination>(_TaxCodeTaxPeriodDefinitionList_QNAME, ArrayOfTaxPeriodDefination.class, TaxCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionBonusBuys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetPromotionBonusBuysResult", scope = GetPromotionBonusBuysResponse.class)
    public JAXBElement<PromotionBonusBuys> createGetPromotionBonusBuysResponseGetPromotionBonusBuysResult(PromotionBonusBuys value) {
        return new JAXBElement<PromotionBonusBuys>(_GetPromotionBonusBuysResponseGetPromotionBonusBuysResult_QNAME, PromotionBonusBuys.class, GetPromotionBonusBuysResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Country }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetCountryResult", scope = GetCountryResponse.class)
    public JAXBElement<Country> createGetCountryResponseGetCountryResult(Country value) {
        return new JAXBElement<Country>(_GetCountryResponseGetCountryResult_QNAME, Country.class, GetCountryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productSurchargesList", scope = RemoveProductSurcharges.class)
    public JAXBElement<ArrayOfProductSurcharge> createRemoveProductSurchargesProductSurchargesList(ArrayOfProductSurcharge value) {
        return new JAXBElement<ArrayOfProductSurcharge>(_SaveProductSurchargesProductSurchargesList_QNAME, ArrayOfProductSurcharge.class, RemoveProductSurcharges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionDataResponse.GetTransactionDataResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetTransactionDataResult", scope = GetTransactionDataResponse.class)
    public JAXBElement<GetTransactionDataResponse.GetTransactionDataResult> createGetTransactionDataResponseGetTransactionDataResult(GetTransactionDataResponse.GetTransactionDataResult value) {
        return new JAXBElement<GetTransactionDataResponse.GetTransactionDataResult>(_GetTransactionDataResponseGetTransactionDataResult_QNAME, GetTransactionDataResponse.GetTransactionDataResult.class, GetTransactionDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveInventoryUpdatesResult", scope = SaveInventoryUpdatesResponse.class)
    public JAXBElement<ArrayOfInventoryUpdate> createSaveInventoryUpdatesResponseSaveInventoryUpdatesResult(ArrayOfInventoryUpdate value) {
        return new JAXBElement<ArrayOfInventoryUpdate>(_SaveInventoryUpdatesResponseSaveInventoryUpdatesResult_QNAME, ArrayOfInventoryUpdate.class, SaveInventoryUpdatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUpgradeInformationResponse.GetUpgradeInformationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetUpgradeInformationResult", scope = GetUpgradeInformationResponse.class)
    public JAXBElement<GetUpgradeInformationResponse.GetUpgradeInformationResult> createGetUpgradeInformationResponseGetUpgradeInformationResult(GetUpgradeInformationResponse.GetUpgradeInformationResult value) {
        return new JAXBElement<GetUpgradeInformationResponse.GetUpgradeInformationResult>(_GetUpgradeInformationResponseGetUpgradeInformationResult_QNAME, GetUpgradeInformationResponse.GetUpgradeInformationResult.class, GetUpgradeInformationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceUOMMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceUOMMatrixList", scope = PriceList.class)
    public JAXBElement<ArrayOfPriceUOMMatrix> createPriceListPriceUOMMatrixList(ArrayOfPriceUOMMatrix value) {
        return new JAXBElement<ArrayOfPriceUOMMatrix>(_PriceListPriceUOMMatrixList_QNAME, ArrayOfPriceUOMMatrix.class, PriceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceMatrixList", scope = PriceList.class)
    public JAXBElement<ArrayOfPriceMatrix> createPriceListPriceMatrixList(ArrayOfPriceMatrix value) {
        return new JAXBElement<ArrayOfPriceMatrix>(_PriceListPriceMatrixList_QNAME, ArrayOfPriceMatrix.class, PriceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceListName", scope = PriceList.class)
    public JAXBElement<String> createPriceListPriceListName(String value) {
        return new JAXBElement<String>(_PriceListPriceListName_QNAME, String.class, PriceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyId", scope = LoyaltyPrePrintedCards.class)
    public JAXBElement<String> createLoyaltyPrePrintedCardsLoyaltyId(String value) {
        return new JAXBElement<String>(_PostTransactionLoyaltyId_QNAME, String.class, LoyaltyPrePrintedCards.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostDelivery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "dataObject", scope = PostFulfillment.class)
    public JAXBElement<PostDelivery> createPostFulfillmentDataObject(PostDelivery value) {
        return new JAXBElement<PostDelivery>(_AuthorizePaymentDataObject_QNAME, PostDelivery.class, PostFulfillment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductBOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SetAssemblyComponentsResult", scope = SetAssemblyComponentsResponse.class)
    public JAXBElement<ArrayOfProductBOM> createSetAssemblyComponentsResponseSetAssemblyComponentsResult(ArrayOfProductBOM value) {
        return new JAXBElement<ArrayOfProductBOM>(_SetAssemblyComponentsResponseSetAssemblyComponentsResult_QNAME, ArrayOfProductBOM.class, SetAssemblyComponentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_GetInventoryOfProductResult", scope = XGetInventoryOfProductResponse.class)
    public JAXBElement<ArrayOfInventoryItem> createXGetInventoryOfProductResponseXGetInventoryOfProductResult(ArrayOfInventoryItem value) {
        return new JAXBElement<ArrayOfInventoryItem>(_XGetInventoryOfProductResponseXGetInventoryOfProductResult_QNAME, ArrayOfInventoryItem.class, XGetInventoryOfProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XPostFulfillment.class)
    public JAXBElement<String> createXPostFulfillmentApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XPostFulfillment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XPostFulfillment.class)
    public JAXBElement<String> createXPostFulfillmentUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XPostFulfillment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostDelivery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "data", scope = XPostFulfillment.class)
    public JAXBElement<PostDelivery> createXPostFulfillmentData(PostDelivery value) {
        return new JAXBElement<PostDelivery>(_XAuthorizePaymentData_QNAME, PostDelivery.class, XPostFulfillment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionBonusBuys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionBonusBuys", scope = SavePromotionalBonusBuys.class)
    public JAXBElement<PromotionBonusBuys> createSavePromotionalBonusBuysPromotionBonusBuys(PromotionBonusBuys value) {
        return new JAXBElement<PromotionBonusBuys>(_PromotionBonusBuys_QNAME, PromotionBonusBuys.class, SavePromotionalBonusBuys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductUpgradeInformationResponse.GetProductUpgradeInformationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetProductUpgradeInformationResult", scope = GetProductUpgradeInformationResponse.class)
    public JAXBElement<GetProductUpgradeInformationResponse.GetProductUpgradeInformationResult> createGetProductUpgradeInformationResponseGetProductUpgradeInformationResult(GetProductUpgradeInformationResponse.GetProductUpgradeInformationResult value) {
        return new JAXBElement<GetProductUpgradeInformationResponse.GetProductUpgradeInformationResult>(_GetProductUpgradeInformationResponseGetProductUpgradeInformationResult_QNAME, GetProductUpgradeInformationResponse.GetProductUpgradeInformationResult.class, GetProductUpgradeInformationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = ShippingType.class)
    public JAXBElement<String> createShippingTypeDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, ShippingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "WebPage", scope = ShippingType.class)
    public JAXBElement<String> createShippingTypeWebPage(String value) {
        return new JAXBElement<String>(_VendorWebPage_QNAME, String.class, ShippingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCurrencyResult", scope = SaveCurrencyResponse.class)
    public JAXBElement<Currency> createSaveCurrencyResponseSaveCurrencyResult(Currency value) {
        return new JAXBElement<Currency>(_SaveCurrencyResponseSaveCurrencyResult_QNAME, Currency.class, SaveCurrencyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productId", scope = GetProductCost.class)
    public JAXBElement<String> createGetProductCostProductId(String value) {
        return new JAXBElement<String>(_GetInventoryOfProductProductId_QNAME, String.class, GetProductCost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "warehouseId", scope = GetProductCost.class)
    public JAXBElement<String> createGetProductCostWarehouseId(String value) {
        return new JAXBElement<String>(_GetQueueByWarehouseWithoutStatusUpdateWarehouseId_QNAME, String.class, GetProductCost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "loyaltyId", scope = ValidateLoyaltyCustomer.class)
    public JAXBElement<String> createValidateLoyaltyCustomerLoyaltyId(String value) {
        return new JAXBElement<String>(_GetMonthlyPointsSummaryLoyaltyId_QNAME, String.class, ValidateLoyaltyCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetAllStatesResult", scope = GetAllStatesResponse.class)
    public JAXBElement<ArrayOfState> createGetAllStatesResponseGetAllStatesResult(ArrayOfState value) {
        return new JAXBElement<ArrayOfState>(_GetAllStatesResponseGetAllStatesResult_QNAME, ArrayOfState.class, GetAllStatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeletePromotionalBonusBuys.class)
    public JAXBElement<String> createDeletePromotionalBonusBuysId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeletePromotionalBonusBuys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "currencyId", scope = XGetExchangeRate.class)
    public JAXBElement<String> createXGetExchangeRateCurrencyId(String value) {
        return new JAXBElement<String>(_DeleteExchangeRateByCurrencyAndDateCurrencyId_QNAME, String.class, XGetExchangeRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XGetExchangeRate.class)
    public JAXBElement<String> createXGetExchangeRateApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XGetExchangeRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XGetExchangeRate.class)
    public JAXBElement<String> createXGetExchangeRateUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XGetExchangeRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StateId", scope = Store.class)
    public JAXBElement<String> createStoreStateId(String value) {
        return new JAXBElement<String>(_AddressStateId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CashCustomerId", scope = Store.class)
    public JAXBElement<String> createStoreCashCustomerId(String value) {
        return new JAXBElement<String>(_StoreCashCustomerId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address1", scope = Store.class)
    public JAXBElement<String> createStoreAddress1(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress1_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DefaultNumberSeriesId", scope = Store.class)
    public JAXBElement<String> createStoreDefaultNumberSeriesId(String value) {
        return new JAXBElement<String>(_StoreDefaultNumberSeriesId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Email", scope = Store.class)
    public JAXBElement<String> createStoreEmail(String value) {
        return new JAXBElement<String>(_VendorEmail_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address3", scope = Store.class)
    public JAXBElement<String> createStoreAddress3(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress3_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address2", scope = Store.class)
    public JAXBElement<String> createStoreAddress2(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress2_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LayawayPlanId", scope = Store.class)
    public JAXBElement<String> createStoreLayawayPlanId(String value) {
        return new JAXBElement<String>(_PostTransactionLayawayPlanId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseTaxCodeId", scope = Store.class)
    public JAXBElement<String> createStorePurchaseTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargePurchaseTaxCodeId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesTaxCodeId", scope = Store.class)
    public JAXBElement<String> createStoreSalesTaxCodeId(String value) {
        return new JAXBElement<String>(_WarehouseSalesTaxCodeId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RetailProfileId", scope = Store.class)
    public JAXBElement<String> createStoreRetailProfileId(String value) {
        return new JAXBElement<String>(_EmployeeRetailProfileId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CounrtyId", scope = Store.class)
    public JAXBElement<String> createStoreCounrtyId(String value) {
        return new JAXBElement<String>(_StoreCounrtyId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BankAccount", scope = Store.class)
    public JAXBElement<String> createStoreBankAccount(String value) {
        return new JAXBElement<String>(_StoreBankAccount_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Bank", scope = Store.class)
    public JAXBElement<String> createStoreBank(String value) {
        return new JAXBElement<String>(_StoreBank_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PricingStoreGroupId", scope = Store.class)
    public JAXBElement<String> createStorePricingStoreGroupId(String value) {
        return new JAXBElement<String>(_StorePricingStoreGroupId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = Store.class)
    public JAXBElement<String> createStoreDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesPersonId", scope = Store.class)
    public JAXBElement<String> createStoreSalesPersonId(String value) {
        return new JAXBElement<String>(_StoreSalesPersonId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FulfillmentPlanId", scope = Store.class)
    public JAXBElement<String> createStoreFulfillmentPlanId(String value) {
        return new JAXBElement<String>(_StoreFulfillmentPlanId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "City", scope = Store.class)
    public JAXBElement<String> createStoreCity(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationCity_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ZipCode", scope = Store.class)
    public JAXBElement<String> createStoreZipCode(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationZipCode_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PhoneNumber", scope = Store.class)
    public JAXBElement<String> createStorePhoneNumber(String value) {
        return new JAXBElement<String>(_VendorPhoneNumber_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LayawayFulfillmentPlanId", scope = Store.class)
    public JAXBElement<String> createStoreLayawayFulfillmentPlanId(String value) {
        return new JAXBElement<String>(_StoreLayawayFulfillmentPlanId_QNAME, String.class, Store.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductGroupId", scope = SpecialPriceDiscountGroup.class)
    public JAXBElement<String> createSpecialPriceDiscountGroupProductGroupId(String value) {
        return new JAXBElement<String>(_SpecialPriceDiscountGroupProductGroupId_QNAME, String.class, SpecialPriceDiscountGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ManufacturerId", scope = SpecialPriceDiscountGroup.class)
    public JAXBElement<String> createSpecialPriceDiscountGroupManufacturerId(String value) {
        return new JAXBElement<String>(_ProductManufacturerId_QNAME, String.class, SpecialPriceDiscountGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UOMGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "uomGroup", scope = SaveUOMGroup.class)
    public JAXBElement<UOMGroup> createSaveUOMGroupUomGroup(UOMGroup value) {
        return new JAXBElement<UOMGroup>(_SaveUOMGroupUomGroup_QNAME, UOMGroup.class, SaveUOMGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Country }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCountryResult", scope = SaveCountryResponse.class)
    public JAXBElement<Country> createSaveCountryResponseSaveCountryResult(Country value) {
        return new JAXBElement<Country>(_SaveCountryResponseSaveCountryResult_QNAME, Country.class, SaveCountryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyServiceEndPoint", scope = Enterprise.class)
    public JAXBElement<String> createEnterpriseLoyaltyServiceEndPoint(String value) {
        return new JAXBElement<String>(_EnterpriseLoyaltyServiceEndPoint_QNAME, String.class, Enterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FederalTaxId", scope = Enterprise.class)
    public JAXBElement<String> createEnterpriseFederalTaxId(String value) {
        return new JAXBElement<String>(_EnterpriseFederalTaxId_QNAME, String.class, Enterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ClubPassword", scope = Enterprise.class)
    public JAXBElement<String> createEnterpriseClubPassword(String value) {
        return new JAXBElement<String>(_EnterpriseClubPassword_QNAME, String.class, Enterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SellTaxCodeId", scope = Enterprise.class)
    public JAXBElement<String> createEnterpriseSellTaxCodeId(String value) {
        return new JAXBElement<String>(_EnterpriseSellTaxCodeId_QNAME, String.class, Enterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ClubUserId", scope = Enterprise.class)
    public JAXBElement<String> createEnterpriseClubUserId(String value) {
        return new JAXBElement<String>(_EnterpriseClubUserId_QNAME, String.class, Enterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ClubServiceEndPoint", scope = Enterprise.class)
    public JAXBElement<String> createEnterpriseClubServiceEndPoint(String value) {
        return new JAXBElement<String>(_EnterpriseClubServiceEndPoint_QNAME, String.class, Enterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseTaxCodeId", scope = Enterprise.class)
    public JAXBElement<String> createEnterprisePurchaseTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargePurchaseTaxCodeId_QNAME, String.class, Enterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RetailProfileId", scope = Enterprise.class)
    public JAXBElement<String> createEnterpriseRetailProfileId(String value) {
        return new JAXBElement<String>(_EmployeeRetailProfileId_QNAME, String.class, Enterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CompanyName", scope = Enterprise.class)
    public JAXBElement<String> createEnterpriseCompanyName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationCompanyName_QNAME, String.class, Enterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UseTransactionConsolidationOriginal", scope = Enterprise.class)
    public JAXBElement<Boolean> createEnterpriseUseTransactionConsolidationOriginal(Boolean value) {
        return new JAXBElement<Boolean>(_EnterpriseUseTransactionConsolidationOriginal_QNAME, Boolean.class, Enterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "uom", scope = SaveUOM.class)
    public JAXBElement<UOM> createSaveUOMUom(UOM value) {
        return new JAXBElement<UOM>(_SaveUOMUom_QNAME, UOM.class, SaveUOM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "stateList", scope = SaveStateList.class)
    public JAXBElement<ArrayOfState> createSaveStateListStateList(ArrayOfState value) {
        return new JAXBElement<ArrayOfState>(_SaveStateListStateList_QNAME, ArrayOfState.class, SaveStateList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RegularExpression", scope = UserDefinedFieldsDetails.class)
    public JAXBElement<String> createUserDefinedFieldsDetailsRegularExpression(String value) {
        return new JAXBElement<String>(_UserDefinedFieldsDetailsRegularExpression_QNAME, String.class, UserDefinedFieldsDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FieldName", scope = UserDefinedFieldsDetails.class)
    public JAXBElement<String> createUserDefinedFieldsDetailsFieldName(String value) {
        return new JAXBElement<String>(_UserDefinedFieldsDetailsFieldName_QNAME, String.class, UserDefinedFieldsDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = UserDefinedFieldsDetails.class)
    public JAXBElement<String> createUserDefinedFieldsDetailsDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, UserDefinedFieldsDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveUOMResult", scope = SaveUOMResponse.class)
    public JAXBElement<UOM> createSaveUOMResponseSaveUOMResult(UOM value) {
        return new JAXBElement<UOM>(_SaveUOMResponseSaveUOMResult_QNAME, UOM.class, SaveUOMResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetRetailProfile.class)
    public JAXBElement<String> createGetRetailProfileId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetRetailProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Store }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "store", scope = SaveStore.class)
    public JAXBElement<Store> createSaveStoreStore(Store value) {
        return new JAXBElement<Store>(_SaveStoreStore_QNAME, Store.class, SaveStore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productList", scope = SaveProductList.class)
    public JAXBElement<ArrayOfProduct> createSaveProductListProductList(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_SetAssemblyComponentsProductList_QNAME, ArrayOfProduct.class, SaveProductList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ValueSource", scope = CustomTransactionInfoGridDetail.class)
    public JAXBElement<String> createCustomTransactionInfoGridDetailValueSource(String value) {
        return new JAXBElement<String>(_CustomTransactionInfoGridDetailValueSource_QNAME, String.class, CustomTransactionInfoGridDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Caption", scope = CustomTransactionInfoGridDetail.class)
    public JAXBElement<String> createCustomTransactionInfoGridDetailCaption(String value) {
        return new JAXBElement<String>(_CustomTransactionInfoGridCaption_QNAME, String.class, CustomTransactionInfoGridDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "HeaderId", scope = CustomTransactionInfoGridDetail.class)
    public JAXBElement<String> createCustomTransactionInfoGridDetailHeaderId(String value) {
        return new JAXBElement<String>(_CustomTransactionInfoGridDetailHeaderId_QNAME, String.class, CustomTransactionInfoGridDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductId", scope = CustomTransactionInfoGridDetail.class)
    public JAXBElement<String> createCustomTransactionInfoGridDetailProductId(String value) {
        return new JAXBElement<String>(_TransactionItemProductId_QNAME, String.class, CustomTransactionInfoGridDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomTransactionInfoGridDetailId", scope = CustomTransactionInfoGridDetail.class)
    public JAXBElement<String> createCustomTransactionInfoGridDetailCustomTransactionInfoGridDetailId(String value) {
        return new JAXBElement<String>(_CustomTransactionInfoGridDetailCustomTransactionInfoGridDetailId_QNAME, String.class, CustomTransactionInfoGridDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ParentGridDetailId", scope = CustomTransactionInfoGridDetail.class)
    public JAXBElement<String> createCustomTransactionInfoGridDetailParentGridDetailId(String value) {
        return new JAXBElement<String>(_CustomTransactionInfoGridDetailParentGridDetailId_QNAME, String.class, CustomTransactionInfoGridDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "goodsReturnList", scope = SaveGoodsReturnList.class)
    public JAXBElement<ArrayOfGoodsReturn> createSaveGoodsReturnListGoodsReturnList(ArrayOfGoodsReturn value) {
        return new JAXBElement<ArrayOfGoodsReturn>(_SaveGoodsReturnListGoodsReturnList_QNAME, ArrayOfGoodsReturn.class, SaveGoodsReturnList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = CancelQuotation.class)
    public JAXBElement<String> createCancelQuotationApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, CancelQuotation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "transactionKey", scope = CancelQuotation.class)
    public JAXBElement<String> createCancelQuotationTransactionKey(String value) {
        return new JAXBElement<String>(_CancelSalesOrderTransactionKey_QNAME, String.class, CancelQuotation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = CancelQuotation.class)
    public JAXBElement<String> createCancelQuotationUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, CancelQuotation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftCertificateMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveGiftCertificateMasterListResult", scope = SaveGiftCertificateMasterListResponse.class)
    public JAXBElement<ArrayOfGiftCertificateMaster> createSaveGiftCertificateMasterListResponseSaveGiftCertificateMasterListResult(ArrayOfGiftCertificateMaster value) {
        return new JAXBElement<ArrayOfGiftCertificateMaster>(_SaveGiftCertificateMasterListResponseSaveGiftCertificateMasterListResult_QNAME, ArrayOfGiftCertificateMaster.class, SaveGiftCertificateMasterListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeValidValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ValidValueItems", scope = LineAttribute.class)
    public JAXBElement<ArrayOfAttributeValidValue> createLineAttributeValidValueItems(ArrayOfAttributeValidValue value) {
        return new JAXBElement<ArrayOfAttributeValidValue>(_SaleAttributeValidValueItems_QNAME, ArrayOfAttributeValidValue.class, LineAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RegExPattern", scope = LineAttribute.class)
    public JAXBElement<String> createLineAttributeRegExPattern(String value) {
        return new JAXBElement<String>(_SaleAttributeRegExPattern_QNAME, String.class, LineAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DefaultValue", scope = LineAttribute.class)
    public JAXBElement<String> createLineAttributeDefaultValue(String value) {
        return new JAXBElement<String>(_SaleAttributeDefaultValue_QNAME, String.class, LineAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetGiftCertificateMaster.class)
    public JAXBElement<String> createGetGiftCertificateMasterId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetGiftCertificateMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryCountBatchDetailList", scope = InventoryCountDetail.class)
    public JAXBElement<ArrayOfInventoryCountBatchDetail> createInventoryCountDetailInventoryCountBatchDetailList(ArrayOfInventoryCountBatchDetail value) {
        return new JAXBElement<ArrayOfInventoryCountBatchDetail>(_InventoryCountDetailInventoryCountBatchDetailList_QNAME, ArrayOfInventoryCountBatchDetail.class, InventoryCountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryCountSerialDetailList", scope = InventoryCountDetail.class)
    public JAXBElement<ArrayOfInventoryCountSerialDetail> createInventoryCountDetailInventoryCountSerialDetailList(ArrayOfInventoryCountSerialDetail value) {
        return new JAXBElement<ArrayOfInventoryCountSerialDetail>(_InventoryCountDetailInventoryCountSerialDetailList_QNAME, ArrayOfInventoryCountSerialDetail.class, InventoryCountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AdmissionDate", scope = GoodsReceiptBatchDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptBatchDetailAdmissionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialAdmissionDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptBatchDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ManufacturingDate", scope = GoodsReceiptBatchDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptBatchDetailManufacturingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialManufacturingDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptBatchDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExpirationDate", scope = GoodsReceiptBatchDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptBatchDetailExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialExpirationDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptBatchDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "inventoryUpdateList", scope = SetFinalInventory.class)
    public JAXBElement<ArrayOfInventoryUpdate> createSetFinalInventoryInventoryUpdateList(ArrayOfInventoryUpdate value) {
        return new JAXBElement<ArrayOfInventoryUpdate>(_SaveInventoryUpdatesInventoryUpdateList_QNAME, ArrayOfInventoryUpdate.class, SetFinalInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsReceivable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "accountsReceivable", scope = SaveAccountsReceivable.class)
    public JAXBElement<AccountsReceivable> createSaveAccountsReceivableAccountsReceivable(AccountsReceivable value) {
        return new JAXBElement<AccountsReceivable>(_SaveAccountsReceivableAccountsReceivable_QNAME, AccountsReceivable.class, SaveAccountsReceivable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = DeleteWarehouse.class)
    public JAXBElement<String> createDeleteWarehouseId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, DeleteWarehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "goodsReturn", scope = SaveGoodsReturn.class)
    public JAXBElement<GoodsReturn> createSaveGoodsReturnGoodsReturn(GoodsReturn value) {
        return new JAXBElement<GoodsReturn>(_SaveGoodsReturnGoodsReturn_QNAME, GoodsReturn.class, SaveGoodsReturn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaleAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetAllSaleAttributeResult", scope = GetAllSaleAttributeResponse.class)
    public JAXBElement<ArrayOfSaleAttribute> createGetAllSaleAttributeResponseGetAllSaleAttributeResult(ArrayOfSaleAttribute value) {
        return new JAXBElement<ArrayOfSaleAttribute>(_GetAllSaleAttributeResponseGetAllSaleAttributeResult_QNAME, ArrayOfSaleAttribute.class, GetAllSaleAttributeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteBarCodeMask.class)
    public JAXBElement<String> createDeleteBarCodeMaskId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteBarCodeMask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetProductGroupResult", scope = GetProductGroupResponse.class)
    public JAXBElement<ProductGroup> createGetProductGroupResponseGetProductGroupResult(ProductGroup value) {
        return new JAXBElement<ProductGroup>(_GetProductGroupResponseGetProductGroupResult_QNAME, ProductGroup.class, GetProductGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Serial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Serial", scope = SaveSerial.class)
    public JAXBElement<Serial> createSaveSerialSerial(Serial value) {
        return new JAXBElement<Serial>(_Serial_QNAME, Serial.class, SaveSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveTransactionSignatureResult", scope = SaveTransactionSignatureResponse.class)
    public JAXBElement<String> createSaveTransactionSignatureResponseSaveTransactionSignatureResult(String value) {
        return new JAXBElement<String>(_SaveTransactionSignatureResponseSaveTransactionSignatureResult_QNAME, String.class, SaveTransactionSignatureResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_SaveCustomerResult", scope = XSaveCustomerResponse.class)
    public JAXBElement<Customer> createXSaveCustomerResponseXSaveCustomerResult(Customer value) {
        return new JAXBElement<Customer>(_XSaveCustomerResponseXSaveCustomerResult_QNAME, Customer.class, XSaveCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCountryListResult", scope = SaveCountryListResponse.class)
    public JAXBElement<ArrayOfCountry> createSaveCountryListResponseSaveCountryListResult(ArrayOfCountry value) {
        return new JAXBElement<ArrayOfCountry>(_SaveCountryListResponseSaveCountryListResult_QNAME, ArrayOfCountry.class, SaveCountryListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSummery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetPointsSummaryByTransactionKeyResult", scope = GetPointsSummaryByTransactionKeyResponse.class)
    public JAXBElement<CustomerSummery> createGetPointsSummaryByTransactionKeyResponseGetPointsSummaryByTransactionKeyResult(CustomerSummery value) {
        return new JAXBElement<CustomerSummery>(_GetPointsSummaryByTransactionKeyResponseGetPointsSummaryByTransactionKeyResult_QNAME, CustomerSummery.class, GetPointsSummaryByTransactionKeyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarCodeMask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "barcodeMask", scope = SaveBarCodeMask.class)
    public JAXBElement<BarCodeMask> createSaveBarCodeMaskBarcodeMask(BarCodeMask value) {
        return new JAXBElement<BarCodeMask>(_SaveBarCodeMaskBarcodeMask_QNAME, BarCodeMask.class, SaveBarCodeMask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "purchaseOrderList", scope = SavePurchaseOrderList.class)
    public JAXBElement<ArrayOfPurchaseOrder> createSavePurchaseOrderListPurchaseOrderList(ArrayOfPurchaseOrder value) {
        return new JAXBElement<ArrayOfPurchaseOrder>(_SavePurchaseOrderListPurchaseOrderList_QNAME, ArrayOfPurchaseOrder.class, SavePurchaseOrderList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "surchargeList", scope = SaveSurchargeList.class)
    public JAXBElement<ArrayOfSurcharge> createSaveSurchargeListSurchargeList(ArrayOfSurcharge value) {
        return new JAXBElement<ArrayOfSurcharge>(_SaveSurchargeListSurchargeList_QNAME, ArrayOfSurcharge.class, SaveSurchargeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Warehouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "warehouse", scope = SaveWarehouse.class)
    public JAXBElement<Warehouse> createSaveWarehouseWarehouse(Warehouse value) {
        return new JAXBElement<Warehouse>(_SaveWarehouseWarehouse_QNAME, Warehouse.class, SaveWarehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoupon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCouponListResult", scope = SaveCouponListResponse.class)
    public JAXBElement<ArrayOfCoupon> createSaveCouponListResponseSaveCouponListResult(ArrayOfCoupon value) {
        return new JAXBElement<ArrayOfCoupon>(_SaveCouponListResponseSaveCouponListResult_QNAME, ArrayOfCoupon.class, SaveCouponListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetShippingType.class)
    public JAXBElement<String> createGetShippingTypeId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetShippingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetExchangeRateByDateResult", scope = GetExchangeRateByDateResponse.class)
    public JAXBElement<ArrayOfExchangeRate> createGetExchangeRateByDateResponseGetExchangeRateByDateResult(ArrayOfExchangeRate value) {
        return new JAXBElement<ArrayOfExchangeRate>(_GetExchangeRateByDateResponseGetExchangeRateByDateResult_QNAME, ArrayOfExchangeRate.class, GetExchangeRateByDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "stockTransferList", scope = SaveStockTransferList.class)
    public JAXBElement<ArrayOfStockTransfer> createSaveStockTransferListStockTransferList(ArrayOfStockTransfer value) {
        return new JAXBElement<ArrayOfStockTransfer>(_SaveStockTransferListStockTransferList_QNAME, ArrayOfStockTransfer.class, SaveStockTransferList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeletePriceList.class)
    public JAXBElement<String> createDeletePriceListId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeletePriceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetQueueOfEnterpriseWithoutStatusUpdateResult", scope = GetQueueOfEnterpriseWithoutStatusUpdateResponse.class)
    public JAXBElement<ArrayOfIntegrationQueue> createGetQueueOfEnterpriseWithoutStatusUpdateResponseGetQueueOfEnterpriseWithoutStatusUpdateResult(ArrayOfIntegrationQueue value) {
        return new JAXBElement<ArrayOfIntegrationQueue>(_GetQueueOfEnterpriseWithoutStatusUpdateResponseGetQueueOfEnterpriseWithoutStatusUpdateResult_QNAME, ArrayOfIntegrationQueue.class, GetQueueOfEnterpriseWithoutStatusUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_SyncInventoryResult", scope = XSyncInventoryResponse.class)
    public JAXBElement<ArrayOfIntegrationQueue> createXSyncInventoryResponseXSyncInventoryResult(ArrayOfIntegrationQueue value) {
        return new JAXBElement<ArrayOfIntegrationQueue>(_XSyncInventoryResponseXSyncInventoryResult_QNAME, ArrayOfIntegrationQueue.class, XSyncInventoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "dataObject", scope = UpdateLoyaltyCustomer.class)
    public JAXBElement<Customer> createUpdateLoyaltyCustomerDataObject(Customer value) {
        return new JAXBElement<Customer>(_AuthorizePaymentDataObject_QNAME, Customer.class, UpdateLoyaltyCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Password", scope = ValidateUserWithDeviceId.class)
    public JAXBElement<String> createValidateUserWithDeviceIdPassword(String value) {
        return new JAXBElement<String>(_GetNextNumberPassword_QNAME, String.class, ValidateUserWithDeviceId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DeviceName", scope = ValidateUserWithDeviceId.class)
    public JAXBElement<String> createValidateUserWithDeviceIdDeviceName(String value) {
        return new JAXBElement<String>(_ValidateUserWithDeviceIdDeviceName_QNAME, String.class, ValidateUserWithDeviceId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "HardwareId", scope = ValidateUserWithDeviceId.class)
    public JAXBElement<String> createValidateUserWithDeviceIdHardwareId(String value) {
        return new JAXBElement<String>(_POSHardwareId_QNAME, String.class, ValidateUserWithDeviceId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserId", scope = ValidateUserWithDeviceId.class)
    public JAXBElement<String> createValidateUserWithDeviceIdUserId(String value) {
        return new JAXBElement<String>(_TransactionUserId_QNAME, String.class, ValidateUserWithDeviceId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionBonusBuys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SavePromotionalBonusBuysListResult", scope = SavePromotionalBonusBuysListResponse.class)
    public JAXBElement<ArrayOfPromotionBonusBuys> createSavePromotionalBonusBuysListResponseSavePromotionalBonusBuysListResult(ArrayOfPromotionBonusBuys value) {
        return new JAXBElement<ArrayOfPromotionBonusBuys>(_SavePromotionalBonusBuysListResponseSavePromotionalBonusBuysListResult_QNAME, ArrayOfPromotionBonusBuys.class, SavePromotionalBonusBuysListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPriceDiscountGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "specialPriceDiscountGroupList", scope = SaveSpecialPriceDiscountGroup.class)
    public JAXBElement<ArrayOfSpecialPriceDiscountGroup> createSaveSpecialPriceDiscountGroupSpecialPriceDiscountGroupList(ArrayOfSpecialPriceDiscountGroup value) {
        return new JAXBElement<ArrayOfSpecialPriceDiscountGroup>(_SaveCustomerGroupDiscountListSpecialPriceDiscountGroupList_QNAME, ArrayOfSpecialPriceDiscountGroup.class, SaveSpecialPriceDiscountGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteBatch.class)
    public JAXBElement<String> createDeleteBatchId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountsReceivable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "accountsReceivableList", scope = SaveAccountsReceivableList.class)
    public JAXBElement<ArrayOfAccountsReceivable> createSaveAccountsReceivableListAccountsReceivableList(ArrayOfAccountsReceivable value) {
        return new JAXBElement<ArrayOfAccountsReceivable>(_SaveAccountsReceivableListAccountsReceivableList_QNAME, ArrayOfAccountsReceivable.class, SaveAccountsReceivableList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetPaymentType.class)
    public JAXBElement<String> createGetPaymentTypeId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetPaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "uomList", scope = SaveUOMList.class)
    public JAXBElement<ArrayOfUOM> createSaveUOMListUomList(ArrayOfUOM value) {
        return new JAXBElement<ArrayOfUOM>(_SaveUOMListUomList_QNAME, ArrayOfUOM.class, SaveUOMList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCertificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UpdateGiftCertificateBalanceResult", scope = UpdateGiftCertificateBalanceResponse.class)
    public JAXBElement<GiftCertificate> createUpdateGiftCertificateBalanceResponseUpdateGiftCertificateBalanceResult(GiftCertificate value) {
        return new JAXBElement<GiftCertificate>(_UpdateGiftCertificateBalanceResponseUpdateGiftCertificateBalanceResult_QNAME, GiftCertificate.class, UpdateGiftCertificateBalanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveShippingTypeResult", scope = SaveShippingTypeResponse.class)
    public JAXBElement<ShippingType> createSaveShippingTypeResponseSaveShippingTypeResult(ShippingType value) {
        return new JAXBElement<ShippingType>(_SaveShippingTypeResponseSaveShippingTypeResult_QNAME, ShippingType.class, SaveShippingTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveEmployeeListResult", scope = SaveEmployeeListResponse.class)
    public JAXBElement<ArrayOfEmployee> createSaveEmployeeListResponseSaveEmployeeListResult(ArrayOfEmployee value) {
        return new JAXBElement<ArrayOfEmployee>(_SaveEmployeeListResponseSaveEmployeeListResult_QNAME, ArrayOfEmployee.class, SaveEmployeeListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XGetGiftCertificateBalance.class)
    public JAXBElement<String> createXGetGiftCertificateBalanceApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XGetGiftCertificateBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "giftCertificateNumber", scope = XGetGiftCertificateBalance.class)
    public JAXBElement<String> createXGetGiftCertificateBalanceGiftCertificateNumber(String value) {
        return new JAXBElement<String>(_XGetGiftCertificateBalanceGiftCertificateNumber_QNAME, String.class, XGetGiftCertificateBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productId", scope = XGetGiftCertificateBalance.class)
    public JAXBElement<String> createXGetGiftCertificateBalanceProductId(String value) {
        return new JAXBElement<String>(_GetInventoryOfProductProductId_QNAME, String.class, XGetGiftCertificateBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XGetGiftCertificateBalance.class)
    public JAXBElement<String> createXGetGiftCertificateBalanceUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XGetGiftCertificateBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_GetTransactionResult", scope = XGetTransactionResponse.class)
    public JAXBElement<Transaction> createXGetTransactionResponseXGetTransactionResult(Transaction value) {
        return new JAXBElement<Transaction>(_XGetTransactionResponseXGetTransactionResult_QNAME, Transaction.class, XGetTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteSurcharge.class)
    public JAXBElement<String> createDeleteSurchargeId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteSurcharge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdateSerial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SerialDetailList", scope = InventoryUpdate.class)
    public JAXBElement<ArrayOfInventoryUpdateSerial> createInventoryUpdateSerialDetailList(ArrayOfInventoryUpdateSerial value) {
        return new JAXBElement<ArrayOfInventoryUpdateSerial>(_InventoryUpdateSerialDetailList_QNAME, ArrayOfInventoryUpdateSerial.class, InventoryUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BaseReference", scope = InventoryUpdate.class)
    public JAXBElement<String> createInventoryUpdateBaseReference(String value) {
        return new JAXBElement<String>(_InventoryUpdateBaseReference_QNAME, String.class, InventoryUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionNumber", scope = InventoryUpdate.class)
    public JAXBElement<String> createInventoryUpdateTransactionNumber(String value) {
        return new JAXBElement<String>(_InventoryUpdateTransactionNumber_QNAME, String.class, InventoryUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TransactionType", scope = InventoryUpdate.class)
    public JAXBElement<String> createInventoryUpdateTransactionType(String value) {
        return new JAXBElement<String>(_InventoryUpdateTransactionType_QNAME, String.class, InventoryUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryUpdateBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BatchDetailList", scope = InventoryUpdate.class)
    public JAXBElement<ArrayOfInventoryUpdateBatch> createInventoryUpdateBatchDetailList(ArrayOfInventoryUpdateBatch value) {
        return new JAXBElement<ArrayOfInventoryUpdateBatch>(_InventoryUpdateBatchDetailList_QNAME, ArrayOfInventoryUpdateBatch.class, InventoryUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Location", scope = InventoryUpdate.class)
    public JAXBElement<String> createInventoryUpdateLocation(String value) {
        return new JAXBElement<String>(_InventoryUpdateLocation_QNAME, String.class, InventoryUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "countryList", scope = SaveStoreList.class)
    public JAXBElement<ArrayOfStore> createSaveStoreListCountryList(ArrayOfStore value) {
        return new JAXBElement<ArrayOfStore>(_SaveStoreListCountryList_QNAME, ArrayOfStore.class, SaveStoreList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryCycleId", scope = InventoryItem.class)
    public JAXBElement<String> createInventoryItemInventoryCycleId(String value) {
        return new JAXBElement<String>(_InventoryItemInventoryCycleId_QNAME, String.class, InventoryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesTaxCodeId", scope = InventoryItem.class)
    public JAXBElement<String> createInventoryItemSalesTaxCodeId(String value) {
        return new JAXBElement<String>(_WarehouseSalesTaxCodeId_QNAME, String.class, InventoryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseTaxCodeId", scope = InventoryItem.class)
    public JAXBElement<String> createInventoryItemPurchaseTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargePurchaseTaxCodeId_QNAME, String.class, InventoryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSummery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetPointsSummaryResult", scope = GetPointsSummaryResponse.class)
    public JAXBElement<CustomerSummery> createGetPointsSummaryResponseGetPointsSummaryResult(CustomerSummery value) {
        return new JAXBElement<CustomerSummery>(_GetPointsSummaryResponseGetPointsSummaryResult_QNAME, CustomerSummery.class, GetPointsSummaryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "X_RegisterLoyaltyCustomerResult", scope = XRegisterLoyaltyCustomerResponse.class)
    public JAXBElement<Customer> createXRegisterLoyaltyCustomerResponseXRegisterLoyaltyCustomerResult(Customer value) {
        return new JAXBElement<Customer>(_XRegisterLoyaltyCustomerResponseXRegisterLoyaltyCustomerResult_QNAME, Customer.class, XRegisterLoyaltyCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPointsDetailsResponse.GetPointsDetailsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetPointsDetailsResult", scope = GetPointsDetailsResponse.class)
    public JAXBElement<GetPointsDetailsResponse.GetPointsDetailsResult> createGetPointsDetailsResponseGetPointsDetailsResult(GetPointsDetailsResponse.GetPointsDetailsResult value) {
        return new JAXBElement<GetPointsDetailsResponse.GetPointsDetailsResult>(_GetPointsDetailsResponseGetPointsDetailsResult_QNAME, GetPointsDetailsResponse.GetPointsDetailsResult.class, GetPointsDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryCountDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryCountDetailList", scope = InventoryCount.class)
    public JAXBElement<ArrayOfInventoryCountDetail> createInventoryCountInventoryCountDetailList(ArrayOfInventoryCountDetail value) {
        return new JAXBElement<ArrayOfInventoryCountDetail>(_InventoryCountInventoryCountDetailList_QNAME, ArrayOfInventoryCountDetail.class, InventoryCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExceptionType", scope = APIException.class)
    public JAXBElement<String> createAPIExceptionExceptionType(String value) {
        return new JAXBElement<String>(_APIExceptionExceptionType_QNAME, String.class, APIException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Message", scope = APIException.class)
    public JAXBElement<String> createAPIExceptionMessage(String value) {
        return new JAXBElement<String>(_BaseWrapperMessage_QNAME, String.class, APIException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = APIException.class)
    public JAXBElement<String> createAPIExceptionDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, APIException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Source", scope = APIException.class)
    public JAXBElement<String> createAPIExceptionSource(String value) {
        return new JAXBElement<String>(_APIExceptionSource_QNAME, String.class, APIException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCertificateMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetGiftCertificateMasterResult", scope = GetGiftCertificateMasterResponse.class)
    public JAXBElement<GiftCertificateMaster> createGetGiftCertificateMasterResponseGetGiftCertificateMasterResult(GiftCertificateMaster value) {
        return new JAXBElement<GiftCertificateMaster>(_GetGiftCertificateMasterResponseGetGiftCertificateMasterResult_QNAME, GiftCertificateMaster.class, GetGiftCertificateMasterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetShippingTypeResult", scope = GetShippingTypeResponse.class)
    public JAXBElement<ShippingType> createGetShippingTypeResponseGetShippingTypeResult(ShippingType value) {
        return new JAXBElement<ShippingType>(_GetShippingTypeResponseGetShippingTypeResult_QNAME, ShippingType.class, GetShippingTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveGoodsReceiptResult", scope = SaveGoodsReceiptResponse.class)
    public JAXBElement<GoodsReceipt> createSaveGoodsReceiptResponseSaveGoodsReceiptResult(GoodsReceipt value) {
        return new JAXBElement<GoodsReceipt>(_SaveGoodsReceiptResponseSaveGoodsReceiptResult_QNAME, GoodsReceipt.class, SaveGoodsReceiptResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlternateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "alternateItemList", scope = SaveAlternateItems.class)
    public JAXBElement<ArrayOfAlternateItem> createSaveAlternateItemsAlternateItemList(ArrayOfAlternateItem value) {
        return new JAXBElement<ArrayOfAlternateItem>(_RemoveAlternateItemsAlternateItemList_QNAME, ArrayOfAlternateItem.class, SaveAlternateItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetProduct.class)
    public JAXBElement<String> createGetProductId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Batch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveBatchResult", scope = SaveBatchResponse.class)
    public JAXBElement<Batch> createSaveBatchResponseSaveBatchResult(Batch value) {
        return new JAXBElement<Batch>(_SaveBatchResponseSaveBatchResult_QNAME, Batch.class, SaveBatchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUPCTranslation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveAlternateUPCResult", scope = SaveAlternateUPCResponse.class)
    public JAXBElement<ArrayOfUPCTranslation> createSaveAlternateUPCResponseSaveAlternateUPCResult(ArrayOfUPCTranslation value) {
        return new JAXBElement<ArrayOfUPCTranslation>(_SaveAlternateUPCResponseSaveAlternateUPCResult_QNAME, ArrayOfUPCTranslation.class, SaveAlternateUPCResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarCodeMask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetBarCodeMaskResult", scope = GetBarCodeMaskResponse.class)
    public JAXBElement<BarCodeMask> createGetBarCodeMaskResponseGetBarCodeMaskResult(BarCodeMask value) {
        return new JAXBElement<BarCodeMask>(_GetBarCodeMaskResponseGetBarCodeMaskResult_QNAME, BarCodeMask.class, GetBarCodeMaskResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Email", scope = Contact.class)
    public JAXBElement<String> createContactEmail(String value) {
        return new JAXBElement<String>(_VendorEmail_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "MiddleName", scope = Contact.class)
    public JAXBElement<String> createContactMiddleName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationMiddleName_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SalesTaxCodeId", scope = Contact.class)
    public JAXBElement<String> createContactSalesTaxCodeId(String value) {
        return new JAXBElement<String>(_WarehouseSalesTaxCodeId_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment2", scope = Contact.class)
    public JAXBElement<String> createContactComment2(String value) {
        return new JAXBElement<String>(_ContactComment2_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment1", scope = Contact.class)
    public JAXBElement<String> createContactComment1(String value) {
        return new JAXBElement<String>(_ContactComment1_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "MobilePhone", scope = Contact.class)
    public JAXBElement<String> createContactMobilePhone(String value) {
        return new JAXBElement<String>(_VendorMobilePhone_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "NickName", scope = Contact.class)
    public JAXBElement<String> createContactNickName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationNickName_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Fax", scope = Contact.class)
    public JAXBElement<String> createContactFax(String value) {
        return new JAXBElement<String>(_ContactFax_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Phone2", scope = Contact.class)
    public JAXBElement<String> createContactPhone2(String value) {
        return new JAXBElement<String>(_ContactPhone2_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Phone1", scope = Contact.class)
    public JAXBElement<String> createContactPhone1(String value) {
        return new JAXBElement<String>(_ContactPhone1_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Pager", scope = Contact.class)
    public JAXBElement<String> createContactPager(String value) {
        return new JAXBElement<String>(_ContactPager_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Title", scope = Contact.class)
    public JAXBElement<String> createContactTitle(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationTitle_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LastName", scope = Contact.class)
    public JAXBElement<String> createContactLastName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationLastName_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Salutation", scope = Contact.class)
    public JAXBElement<String> createContactSalutation(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationSalutation_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "taxCode", scope = SaveTaxCode.class)
    public JAXBElement<TaxCode> createSaveTaxCodeTaxCode(TaxCode value) {
        return new JAXBElement<TaxCode>(_SaveTaxCodeTaxCode_QNAME, TaxCode.class, SaveTaxCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountsReceivable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveAccountsReceivableListResult", scope = SaveAccountsReceivableListResponse.class)
    public JAXBElement<ArrayOfAccountsReceivable> createSaveAccountsReceivableListResponseSaveAccountsReceivableListResult(ArrayOfAccountsReceivable value) {
        return new JAXBElement<ArrayOfAccountsReceivable>(_SaveAccountsReceivableListResponseSaveAccountsReceivableListResult_QNAME, ArrayOfAccountsReceivable.class, SaveAccountsReceivableListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SavePurchaseOrderListResult", scope = SavePurchaseOrderListResponse.class)
    public JAXBElement<ArrayOfPurchaseOrder> createSavePurchaseOrderListResponseSavePurchaseOrderListResult(ArrayOfPurchaseOrder value) {
        return new JAXBElement<ArrayOfPurchaseOrder>(_SavePurchaseOrderListResponseSavePurchaseOrderListResult_QNAME, ArrayOfPurchaseOrder.class, SavePurchaseOrderListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "attributeList", scope = SaveAttributeList.class)
    public JAXBElement<ArrayOfAttributeMaster> createSaveAttributeListAttributeList(ArrayOfAttributeMaster value) {
        return new JAXBElement<ArrayOfAttributeMaster>(_SaveAttributeListAttributeList_QNAME, ArrayOfAttributeMaster.class, SaveAttributeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBarCodeMask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveBarCodeMaskListResult", scope = SaveBarCodeMaskListResponse.class)
    public JAXBElement<ArrayOfBarCodeMask> createSaveBarCodeMaskListResponseSaveBarCodeMaskListResult(ArrayOfBarCodeMask value) {
        return new JAXBElement<ArrayOfBarCodeMask>(_SaveBarCodeMaskListResponseSaveBarCodeMaskListResult_QNAME, ArrayOfBarCodeMask.class, SaveBarCodeMaskListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductUpsell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "upsellItemList", scope = RemoveUpsellItems.class)
    public JAXBElement<ArrayOfProductUpsell> createRemoveUpsellItemsUpsellItemList(ArrayOfProductUpsell value) {
        return new JAXBElement<ArrayOfProductUpsell>(_SaveUpsellItemsUpsellItemList_QNAME, ArrayOfProductUpsell.class, RemoveUpsellItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "queryText", scope = GetQueryResult.class)
    public JAXBElement<String> createGetQueryResultQueryText(String value) {
        return new JAXBElement<String>(_GetQueryResultQueryText_QNAME, String.class, GetQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "specialPriceDiscountGroupList", scope = SaveProductGroupDiscountList.class)
    public JAXBElement<ArrayOfProductGroupDiscount> createSaveProductGroupDiscountListSpecialPriceDiscountGroupList(ArrayOfProductGroupDiscount value) {
        return new JAXBElement<ArrayOfProductGroupDiscount>(_SaveCustomerGroupDiscountListSpecialPriceDiscountGroupList_QNAME, ArrayOfProductGroupDiscount.class, SaveProductGroupDiscountList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetQueueWithoutStatusUpdateResult", scope = GetQueueWithoutStatusUpdateResponse.class)
    public JAXBElement<ArrayOfIntegrationQueue> createGetQueueWithoutStatusUpdateResponseGetQueueWithoutStatusUpdateResult(ArrayOfIntegrationQueue value) {
        return new JAXBElement<ArrayOfIntegrationQueue>(_GetQueueWithoutStatusUpdateResponseGetQueueWithoutStatusUpdateResult_QNAME, ArrayOfIntegrationQueue.class, GetQueueWithoutStatusUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = Coupon.class)
    public JAXBElement<String> createCouponDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, Coupon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UPCCode", scope = Coupon.class)
    public JAXBElement<String> createCouponUPCCode(String value) {
        return new JAXBElement<String>(_CouponUPCCode_QNAME, String.class, Coupon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XGetInventoryOfProduct.class)
    public JAXBElement<String> createXGetInventoryOfProductApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XGetInventoryOfProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "productId", scope = XGetInventoryOfProduct.class)
    public JAXBElement<String> createXGetInventoryOfProductProductId(String value) {
        return new JAXBElement<String>(_GetInventoryOfProductProductId_QNAME, String.class, XGetInventoryOfProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XGetInventoryOfProduct.class)
    public JAXBElement<String> createXGetInventoryOfProductUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XGetInventoryOfProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPricingDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SpecialPriceListDate", scope = SpecialPricing.class)
    public JAXBElement<ArrayOfSpecialPricingDate> createSpecialPricingSpecialPriceListDate(ArrayOfSpecialPricingDate value) {
        return new JAXBElement<ArrayOfSpecialPricingDate>(_SpecialPricingSpecialPriceListDate_QNAME, ArrayOfSpecialPricingDate.class, SpecialPricing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BasePriceListId", scope = SpecialPricing.class)
    public JAXBElement<String> createSpecialPricingBasePriceListId(String value) {
        return new JAXBElement<String>(_SpecialPricingBasePriceListId_QNAME, String.class, SpecialPricing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsReceivable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveAccountsReceivableResult", scope = SaveAccountsReceivableResponse.class)
    public JAXBElement<AccountsReceivable> createSaveAccountsReceivableResponseSaveAccountsReceivableResult(AccountsReceivable value) {
        return new JAXBElement<AccountsReceivable>(_SaveAccountsReceivableResponseSaveAccountsReceivableResult_QNAME, AccountsReceivable.class, SaveAccountsReceivableResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = FulfillmentPlan.class)
    public JAXBElement<String> createFulfillmentPlanDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, FulfillmentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFulfillmentPlanSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FulfillmentPlanSurchargeList", scope = FulfillmentPlan.class)
    public JAXBElement<ArrayOfFulfillmentPlanSurcharge> createFulfillmentPlanFulfillmentPlanSurchargeList(ArrayOfFulfillmentPlanSurcharge value) {
        return new JAXBElement<ArrayOfFulfillmentPlanSurcharge>(_FulfillmentPlanFulfillmentPlanSurchargeList_QNAME, ArrayOfFulfillmentPlanSurcharge.class, FulfillmentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SurchargeId", scope = FulfillmentPlan.class)
    public JAXBElement<String> createFulfillmentPlanSurchargeId(String value) {
        return new JAXBElement<String>(_TransactionPaymentSurchargeId_QNAME, String.class, FulfillmentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteManufacturer.class)
    public JAXBElement<String> createDeleteManufacturerId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteManufacturer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetProductGroup.class)
    public JAXBElement<String> createGetProductGroupId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetProductGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveStockTransferListResult", scope = SaveStockTransferListResponse.class)
    public JAXBElement<ArrayOfStockTransfer> createSaveStockTransferListResponseSaveStockTransferListResult(ArrayOfStockTransfer value) {
        return new JAXBElement<ArrayOfStockTransfer>(_SaveStockTransferListResponseSaveStockTransferListResult_QNAME, ArrayOfStockTransfer.class, SaveStockTransferListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PrinterNumber", scope = TransactionPrinting.class)
    public JAXBElement<String> createTransactionPrintingPrinterNumber(String value) {
        return new JAXBElement<String>(_TransactionPrintingPrinterNumber_QNAME, String.class, TransactionPrinting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CompanyRegisterationId", scope = TransactionPrinting.class)
    public JAXBElement<String> createTransactionPrintingCompanyRegisterationId(String value) {
        return new JAXBElement<String>(_TransactionPrintingCompanyRegisterationId_QNAME, String.class, TransactionPrinting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "NCFNumberOfRefund", scope = TransactionPrinting.class)
    public JAXBElement<String> createTransactionPrintingNCFNumberOfRefund(String value) {
        return new JAXBElement<String>(_TransactionPrintingNCFNumberOfRefund_QNAME, String.class, TransactionPrinting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "NCFNumberOfSale", scope = TransactionPrinting.class)
    public JAXBElement<String> createTransactionPrintingNCFNumberOfSale(String value) {
        return new JAXBElement<String>(_TransactionPrintingNCFNumberOfSale_QNAME, String.class, TransactionPrinting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ZReportNumber", scope = TransactionPrinting.class)
    public JAXBElement<String> createTransactionPrintingZReportNumber(String value) {
        return new JAXBElement<String>(_TransactionPrintingZReportNumber_QNAME, String.class, TransactionPrinting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReceiptNumber", scope = TransactionPrinting.class)
    public JAXBElement<String> createTransactionPrintingReceiptNumber(String value) {
        return new JAXBElement<String>(_TransactionPrintingReceiptNumber_QNAME, String.class, TransactionPrinting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Password", scope = ValidateUser.class)
    public JAXBElement<String> createValidateUserPassword(String value) {
        return new JAXBElement<String>(_GetNextNumberPassword_QNAME, String.class, ValidateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserId", scope = ValidateUser.class)
    public JAXBElement<String> createValidateUserUserId(String value) {
        return new JAXBElement<String>(_TransactionUserId_QNAME, String.class, ValidateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = Authenticate.class)
    public JAXBElement<String> createAuthenticateApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, Authenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = Authenticate.class)
    public JAXBElement<String> createAuthenticateUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, Authenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReplicationSendDump }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveDumpListResult", scope = SaveDumpListResponse.class)
    public JAXBElement<ArrayOfReplicationSendDump> createSaveDumpListResponseSaveDumpListResult(ArrayOfReplicationSendDump value) {
        return new JAXBElement<ArrayOfReplicationSendDump>(_SaveDumpListResponseSaveDumpListResult_QNAME, ArrayOfReplicationSendDump.class, SaveDumpListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "IntegrationKeysList", scope = UpdateRecordsStatus.class)
    public JAXBElement<ArrayOflong> createUpdateRecordsStatusIntegrationKeysList(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_UpdateRecordsStatusIntegrationKeysList_QNAME, ArrayOflong.class, UpdateRecordsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveGoodsReturnListResult", scope = SaveGoodsReturnListResponse.class)
    public JAXBElement<ArrayOfGoodsReturn> createSaveGoodsReturnListResponseSaveGoodsReturnListResult(ArrayOfGoodsReturn value) {
        return new JAXBElement<ArrayOfGoodsReturn>(_SaveGoodsReturnListResponseSaveGoodsReturnListResult_QNAME, ArrayOfGoodsReturn.class, SaveGoodsReturnListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Store }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetStoreResult", scope = GetStoreResponse.class)
    public JAXBElement<Store> createGetStoreResponseGetStoreResult(Store value) {
        return new JAXBElement<Store>(_GetStoreResponseGetStoreResult_QNAME, Store.class, GetStoreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = Register.class)
    public JAXBElement<String> createRegisterApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, Register.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = Register.class)
    public JAXBElement<String> createRegisterUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, Register.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveVendorResult", scope = SaveVendorResponse.class)
    public JAXBElement<Vendor> createSaveVendorResponseSaveVendorResult(Vendor value) {
        return new JAXBElement<Vendor>(_SaveVendorResponseSaveVendorResult_QNAME, Vendor.class, SaveVendorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetCustomerResult", scope = GetCustomerResponse.class)
    public JAXBElement<Customer> createGetCustomerResponseGetCustomerResult(Customer value) {
        return new JAXBElement<Customer>(_GetCustomerResponseGetCustomerResult_QNAME, Customer.class, GetCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManufacturerGroupDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "specialPriceDiscountGroupList", scope = SaveManufacturerDiscountList.class)
    public JAXBElement<ArrayOfManufacturerGroupDiscount> createSaveManufacturerDiscountListSpecialPriceDiscountGroupList(ArrayOfManufacturerGroupDiscount value) {
        return new JAXBElement<ArrayOfManufacturerGroupDiscount>(_SaveCustomerGroupDiscountListSpecialPriceDiscountGroupList_QNAME, ArrayOfManufacturerGroupDiscount.class, SaveManufacturerDiscountList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Batch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetBatchResult", scope = GetBatchResponse.class)
    public JAXBElement<Batch> createGetBatchResponseGetBatchResult(Batch value) {
        return new JAXBElement<Batch>(_GetBatchResponseGetBatchResult_QNAME, Batch.class, GetBatchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCustomerListResult", scope = SaveCustomerListResponse.class)
    public JAXBElement<ArrayOfCustomer> createSaveCustomerListResponseSaveCustomerListResult(ArrayOfCustomer value) {
        return new JAXBElement<ArrayOfCustomer>(_SaveCustomerListResponseSaveCustomerListResult_QNAME, ArrayOfCustomer.class, SaveCustomerListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductSurcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveProductSurchargesResult", scope = SaveProductSurchargesResponse.class)
    public JAXBElement<ArrayOfProductSurcharge> createSaveProductSurchargesResponseSaveProductSurchargesResult(ArrayOfProductSurcharge value) {
        return new JAXBElement<ArrayOfProductSurcharge>(_SaveProductSurchargesResponseSaveProductSurchargesResult_QNAME, ArrayOfProductSurcharge.class, SaveProductSurchargesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveVendorListResult", scope = SaveVendorListResponse.class)
    public JAXBElement<ArrayOfVendor> createSaveVendorListResponseSaveVendorListResult(ArrayOfVendor value) {
        return new JAXBElement<ArrayOfVendor>(_SaveVendorListResponseSaveVendorListResult_QNAME, ArrayOfVendor.class, SaveVendorListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveManufacturerListResult", scope = SaveManufacturerListResponse.class)
    public JAXBElement<ArrayOfManufacturer> createSaveManufacturerListResponseSaveManufacturerListResult(ArrayOfManufacturer value) {
        return new JAXBElement<ArrayOfManufacturer>(_SaveManufacturerListResponseSaveManufacturerListResult_QNAME, ArrayOfManufacturer.class, SaveManufacturerListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AdmissionDate", scope = GoodsReceiptPOBatchDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptPOBatchDetailAdmissionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialAdmissionDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptPOBatchDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ManufacturingDate", scope = GoodsReceiptPOBatchDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptPOBatchDetailManufacturingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialManufacturingDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptPOBatchDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExpirationDate", scope = GoodsReceiptPOBatchDetail.class)
    public JAXBElement<XMLGregorianCalendar> createGoodsReceiptPOBatchDetailExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SerialExpirationDate_QNAME, XMLGregorianCalendar.class, GoodsReceiptPOBatchDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "shippingType", scope = SaveShippingType.class)
    public JAXBElement<ShippingType> createSaveShippingTypeShippingType(ShippingType value) {
        return new JAXBElement<ShippingType>(_SaveShippingTypeShippingType_QNAME, ShippingType.class, SaveShippingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMId", scope = GoodsReturnDetail.class)
    public JAXBElement<String> createGoodsReturnDetailUOMId(String value) {
        return new JAXBElement<String>(_PromotionGetUOMId_QNAME, String.class, GoodsReturnDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturnSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReturnSerialDetailList", scope = GoodsReturnDetail.class)
    public JAXBElement<ArrayOfGoodsReturnSerialDetail> createGoodsReturnDetailGoodsReturnSerialDetailList(ArrayOfGoodsReturnSerialDetail value) {
        return new JAXBElement<ArrayOfGoodsReturnSerialDetail>(_GoodsReturnDetailGoodsReturnSerialDetailList_QNAME, ArrayOfGoodsReturnSerialDetail.class, GoodsReturnDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = GoodsReturnDetail.class)
    public JAXBElement<String> createGoodsReturnDetailDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, GoodsReturnDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturnBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReturnBatchDetailList", scope = GoodsReturnDetail.class)
    public JAXBElement<ArrayOfGoodsReturnBatchDetail> createGoodsReturnDetailGoodsReturnBatchDetailList(ArrayOfGoodsReturnBatchDetail value) {
        return new JAXBElement<ArrayOfGoodsReturnBatchDetail>(_GoodsReturnDetailGoodsReturnBatchDetailList_QNAME, ArrayOfGoodsReturnBatchDetail.class, GoodsReturnDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetVersionInformationResult", scope = GetVersionInformationResponse.class)
    public JAXBElement<String> createGetVersionInformationResponseGetVersionInformationResult(String value) {
        return new JAXBElement<String>(_GetVersionInformationResponseGetVersionInformationResult_QNAME, String.class, GetVersionInformationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaleAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetSaleAttributeResult", scope = GetSaleAttributeResponse.class)
    public JAXBElement<SaleAttribute> createGetSaleAttributeResponseGetSaleAttributeResult(SaleAttribute value) {
        return new JAXBElement<SaleAttribute>(_GetSaleAttributeResponseGetSaleAttributeResult_QNAME, SaleAttribute.class, GetSaleAttributeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxCodeCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "taxCodeConditionList", scope = SaveTaxCodeConditionList.class)
    public JAXBElement<ArrayOfTaxCodeCondition> createSaveTaxCodeConditionListTaxCodeConditionList(ArrayOfTaxCodeCondition value) {
        return new JAXBElement<ArrayOfTaxCodeCondition>(_SaveTaxCodeConditionListTaxCodeConditionList_QNAME, ArrayOfTaxCodeCondition.class, SaveTaxCodeConditionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Bank", scope = AccountsReceivable.class)
    public JAXBElement<String> createAccountsReceivableBank(String value) {
        return new JAXBElement<String>(_StoreBank_QNAME, String.class, AccountsReceivable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BankCountry", scope = AccountsReceivable.class)
    public JAXBElement<String> createAccountsReceivableBankCountry(String value) {
        return new JAXBElement<String>(_AccountsReceivableBankCountry_QNAME, String.class, AccountsReceivable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BankBranch", scope = AccountsReceivable.class)
    public JAXBElement<String> createAccountsReceivableBankBranch(String value) {
        return new JAXBElement<String>(_AccountsReceivableBankBranch_QNAME, String.class, AccountsReceivable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BankAccount", scope = AccountsReceivable.class)
    public JAXBElement<String> createAccountsReceivableBankAccount(String value) {
        return new JAXBElement<String>(_StoreBankAccount_QNAME, String.class, AccountsReceivable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Surcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetSurchargeResult", scope = GetSurchargeResponse.class)
    public JAXBElement<Surcharge> createGetSurchargeResponseGetSurchargeResult(Surcharge value) {
        return new JAXBElement<Surcharge>(_GetSurchargeResponseGetSurchargeResult_QNAME, Surcharge.class, GetSurchargeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveStateResult", scope = SaveStateResponse.class)
    public JAXBElement<State> createSaveStateResponseSaveStateResult(State value) {
        return new JAXBElement<State>(_SaveStateResponseSaveStateResult_QNAME, State.class, SaveStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SerialNumber", scope = BarcodeInformation.class)
    public JAXBElement<String> createBarcodeInformationSerialNumber(String value) {
        return new JAXBElement<String>(_PromotionProductDetailSerialNumber_QNAME, String.class, BarcodeInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductId", scope = BarcodeInformation.class)
    public JAXBElement<String> createBarcodeInformationProductId(String value) {
        return new JAXBElement<String>(_TransactionItemProductId_QNAME, String.class, BarcodeInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BatchNumber", scope = BarcodeInformation.class)
    public JAXBElement<String> createBarcodeInformationBatchNumber(String value) {
        return new JAXBElement<String>(_PromotionProductDetailBatchNumber_QNAME, String.class, BarcodeInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetAllCountriesResult", scope = GetAllCountriesResponse.class)
    public JAXBElement<ArrayOfCountry> createGetAllCountriesResponseGetAllCountriesResult(ArrayOfCountry value) {
        return new JAXBElement<ArrayOfCountry>(_GetAllCountriesResponseGetAllCountriesResult_QNAME, ArrayOfCountry.class, GetAllCountriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetQueueOfEnterpriseResult", scope = GetQueueOfEnterpriseResponse.class)
    public JAXBElement<ArrayOfIntegrationQueue> createGetQueueOfEnterpriseResponseGetQueueOfEnterpriseResult(ArrayOfIntegrationQueue value) {
        return new JAXBElement<ArrayOfIntegrationQueue>(_GetQueueOfEnterpriseResponseGetQueueOfEnterpriseResult_QNAME, ArrayOfIntegrationQueue.class, GetQueueOfEnterpriseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Serial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetSerialResult", scope = GetSerialResponse.class)
    public JAXBElement<Serial> createGetSerialResponseGetSerialResult(Serial value) {
        return new JAXBElement<Serial>(_GetSerialResponseGetSerialResult_QNAME, Serial.class, GetSerialResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "goodsIssueList", scope = SaveGoodsIssueList.class)
    public JAXBElement<ArrayOfGoodsIssue> createSaveGoodsIssueListGoodsIssueList(ArrayOfGoodsIssue value) {
        return new JAXBElement<ArrayOfGoodsIssue>(_SaveGoodsIssueListGoodsIssueList_QNAME, ArrayOfGoodsIssue.class, SaveGoodsIssueList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetManufacturer.class)
    public JAXBElement<String> createGetManufacturerId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetManufacturer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Batch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Batch", scope = SaveBatch.class)
    public JAXBElement<Batch> createSaveBatchBatch(Batch value) {
        return new JAXBElement<Batch>(_Batch_QNAME, Batch.class, SaveBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPricing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveSpecialPriceListResult", scope = SaveSpecialPriceListResponse.class)
    public JAXBElement<ArrayOfSpecialPricing> createSaveSpecialPriceListResponseSaveSpecialPriceListResult(ArrayOfSpecialPricing value) {
        return new JAXBElement<ArrayOfSpecialPricing>(_SaveSpecialPriceListResponseSaveSpecialPriceListResult_QNAME, ArrayOfSpecialPricing.class, SaveSpecialPriceListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlternateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveAlternateItemsResult", scope = SaveAlternateItemsResponse.class)
    public JAXBElement<ArrayOfAlternateItem> createSaveAlternateItemsResponseSaveAlternateItemsResult(ArrayOfAlternateItem value) {
        return new JAXBElement<ArrayOfAlternateItem>(_SaveAlternateItemsResponseSaveAlternateItemsResult_QNAME, ArrayOfAlternateItem.class, SaveAlternateItemsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGiftCertificateMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "giftCertificateMasterList", scope = SaveGiftCertificateMasterList.class)
    public JAXBElement<ArrayOfGiftCertificateMaster> createSaveGiftCertificateMasterListGiftCertificateMasterList(ArrayOfGiftCertificateMaster value) {
        return new JAXBElement<ArrayOfGiftCertificateMaster>(_SaveGiftCertificateMasterListGiftCertificateMasterList_QNAME, ArrayOfGiftCertificateMaster.class, SaveGiftCertificateMasterList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCertificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "giftCertificate", scope = UpdateGiftCertificateBalance.class)
    public JAXBElement<GiftCertificate> createUpdateGiftCertificateBalanceGiftCertificate(GiftCertificate value) {
        return new JAXBElement<GiftCertificate>(_UpdateGiftCertificateBalanceGiftCertificate_QNAME, GiftCertificate.class, UpdateGiftCertificateBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "POSId", scope = StoreExpense.class)
    public JAXBElement<String> createStoreExpensePOSId(String value) {
        return new JAXBElement<String>(_TransactionPOSId_QNAME, String.class, StoreExpense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StoreId", scope = StoreExpense.class)
    public JAXBElement<String> createStoreExpenseStoreId(String value) {
        return new JAXBElement<String>(_TransactionStoreId_QNAME, String.class, StoreExpense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReasonCodeId", scope = StoreExpense.class)
    public JAXBElement<String> createStoreExpenseReasonCodeId(String value) {
        return new JAXBElement<String>(_StoreExpenseReasonCodeId_QNAME, String.class, StoreExpense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserId", scope = StoreExpense.class)
    public JAXBElement<String> createStoreExpenseUserId(String value) {
        return new JAXBElement<String>(_TransactionUserId_QNAME, String.class, StoreExpense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetTransactionResult", scope = GetTransactionResponse.class)
    public JAXBElement<Transaction> createGetTransactionResponseGetTransactionResult(Transaction value) {
        return new JAXBElement<Transaction>(_GetTransactionResponseGetTransactionResult_QNAME, Transaction.class, GetTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReplicationSendDump }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReplicationSendDumpList", scope = SaveDumpList.class)
    public JAXBElement<ArrayOfReplicationSendDump> createSaveDumpListReplicationSendDumpList(ArrayOfReplicationSendDump value) {
        return new JAXBElement<ArrayOfReplicationSendDump>(_SaveDumpListReplicationSendDumpList_QNAME, ArrayOfReplicationSendDump.class, SaveDumpList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCertificateMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveGiftCertificateMasterResult", scope = SaveGiftCertificateMasterResponse.class)
    public JAXBElement<GiftCertificateMaster> createSaveGiftCertificateMasterResponseSaveGiftCertificateMasterResult(GiftCertificateMaster value) {
        return new JAXBElement<GiftCertificateMaster>(_SaveGiftCertificateMasterResponseSaveGiftCertificateMasterResult_QNAME, GiftCertificateMaster.class, SaveGiftCertificateMasterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialPricing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveSpecialPriceResult", scope = SaveSpecialPriceResponse.class)
    public JAXBElement<SpecialPricing> createSaveSpecialPriceResponseSaveSpecialPriceResult(SpecialPricing value) {
        return new JAXBElement<SpecialPricing>(_SaveSpecialPriceResponseSaveSpecialPriceResult_QNAME, SpecialPricing.class, SaveSpecialPriceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "loyaltyId", scope = GetRedeemableAmount.class)
    public JAXBElement<String> createGetRedeemableAmountLoyaltyId(String value) {
        return new JAXBElement<String>(_GetMonthlyPointsSummaryLoyaltyId_QNAME, String.class, GetRedeemableAmount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteShippingType.class)
    public JAXBElement<String> createDeleteShippingTypeId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteShippingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlternateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RemoveAlternateItemsResult", scope = RemoveAlternateItemsResponse.class)
    public JAXBElement<ArrayOfAlternateItem> createRemoveAlternateItemsResponseRemoveAlternateItemsResult(ArrayOfAlternateItem value) {
        return new JAXBElement<ArrayOfAlternateItem>(_RemoveAlternateItemsResponseRemoveAlternateItemsResult_QNAME, ArrayOfAlternateItem.class, RemoveAlternateItemsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMId", scope = GoodsIssueDetail.class)
    public JAXBElement<String> createGoodsIssueDetailUOMId(String value) {
        return new JAXBElement<String>(_PromotionGetUOMId_QNAME, String.class, GoodsIssueDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = GoodsIssueDetail.class)
    public JAXBElement<String> createGoodsIssueDetailDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, GoodsIssueDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssueBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsIssueBatchDetailList", scope = GoodsIssueDetail.class)
    public JAXBElement<ArrayOfGoodsIssueBatchDetail> createGoodsIssueDetailGoodsIssueBatchDetailList(ArrayOfGoodsIssueBatchDetail value) {
        return new JAXBElement<ArrayOfGoodsIssueBatchDetail>(_GoodsIssueDetailGoodsIssueBatchDetailList_QNAME, ArrayOfGoodsIssueBatchDetail.class, GoodsIssueDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssueSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsIssueSerialDetailList", scope = GoodsIssueDetail.class)
    public JAXBElement<ArrayOfGoodsIssueSerialDetail> createGoodsIssueDetailGoodsIssueSerialDetailList(ArrayOfGoodsIssueSerialDetail value) {
        return new JAXBElement<ArrayOfGoodsIssueSerialDetail>(_GoodsIssueDetailGoodsIssueSerialDetailList_QNAME, ArrayOfGoodsIssueSerialDetail.class, GoodsIssueDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarCodeMask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveBarCodeMaskResult", scope = SaveBarCodeMaskResponse.class)
    public JAXBElement<BarCodeMask> createSaveBarCodeMaskResponseSaveBarCodeMaskResult(BarCodeMask value) {
        return new JAXBElement<BarCodeMask>(_SaveBarCodeMaskResponseSaveBarCodeMaskResult_QNAME, BarCodeMask.class, SaveBarCodeMaskResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ExchangeRate", scope = IntegrationQueue.class)
    public JAXBElement<ExchangeRate> createIntegrationQueueExchangeRate(ExchangeRate value) {
        return new JAXBElement<ExchangeRate>(_ExchangeRate_QNAME, ExchangeRate.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AlternateItem", scope = IntegrationQueue.class)
    public JAXBElement<AlternateItem> createIntegrationQueueAlternateItem(AlternateItem value) {
        return new JAXBElement<AlternateItem>(_AlternateItem_QNAME, AlternateItem.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PaymentType", scope = IntegrationQueue.class)
    public JAXBElement<PaymentType> createIntegrationQueuePaymentType(PaymentType value) {
        return new JAXBElement<PaymentType>(_PaymentType_QNAME, PaymentType.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductGroup", scope = IntegrationQueue.class)
    public JAXBElement<ProductGroup> createIntegrationQueueProductGroup(ProductGroup value) {
        return new JAXBElement<ProductGroup>(_ProductGroup_QNAME, ProductGroup.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Serial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Serial", scope = IntegrationQueue.class)
    public JAXBElement<Serial> createIntegrationQueueSerial(Serial value) {
        return new JAXBElement<Serial>(_Serial_QNAME, Serial.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceMatrix", scope = IntegrationQueue.class)
    public JAXBElement<PriceMatrix> createIntegrationQueuePriceMatrix(PriceMatrix value) {
        return new JAXBElement<PriceMatrix>(_PriceMatrix_QNAME, PriceMatrix.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomerGroup", scope = IntegrationQueue.class)
    public JAXBElement<CustomerGroup> createIntegrationQueueCustomerGroup(CustomerGroup value) {
        return new JAXBElement<CustomerGroup>(_CustomerGroup_QNAME, CustomerGroup.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coupon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Coupon", scope = IntegrationQueue.class)
    public JAXBElement<Coupon> createIntegrationQueueCoupon(Coupon value) {
        return new JAXBElement<Coupon>(_Coupon_QNAME, Coupon.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Product", scope = IntegrationQueue.class)
    public JAXBElement<Product> createIntegrationQueueProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseOrder", scope = IntegrationQueue.class)
    public JAXBElement<PurchaseOrder> createIntegrationQueuePurchaseOrder(PurchaseOrder value) {
        return new JAXBElement<PurchaseOrder>(_PurchaseOrder_QNAME, PurchaseOrder.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Country }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Country", scope = IntegrationQueue.class)
    public JAXBElement<Country> createIntegrationQueueCountry(Country value) {
        return new JAXBElement<Country>(_Country_QNAME, Country.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ShippingType", scope = IntegrationQueue.class)
    public JAXBElement<ShippingType> createIntegrationQueueShippingType(ShippingType value) {
        return new JAXBElement<ShippingType>(_ShippingType_QNAME, ShippingType.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "POS", scope = IntegrationQueue.class)
    public JAXBElement<POS> createIntegrationQueuePOS(POS value) {
        return new JAXBElement<POS>(_POS_QNAME, POS.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedFieldsValidValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserDefinedFieldsValidValue", scope = IntegrationQueue.class)
    public JAXBElement<UserDefinedFieldsValidValue> createIntegrationQueueUserDefinedFieldsValidValue(UserDefinedFieldsValidValue value) {
        return new JAXBElement<UserDefinedFieldsValidValue>(_UserDefinedFieldsValidValue_QNAME, UserDefinedFieldsValidValue.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Currency", scope = IntegrationQueue.class)
    public JAXBElement<Currency> createIntegrationQueueCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UOMGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMGroup", scope = IntegrationQueue.class)
    public JAXBElement<UOMGroup> createIntegrationQueueUOMGroup(UOMGroup value) {
        return new JAXBElement<UOMGroup>(_UOMGroup_QNAME, UOMGroup.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityRights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SecurityRights", scope = IntegrationQueue.class)
    public JAXBElement<SecurityRights> createIntegrationQueueSecurityRights(SecurityRights value) {
        return new JAXBElement<SecurityRights>(_SecurityRights_QNAME, SecurityRights.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "RetailProfile", scope = IntegrationQueue.class)
    public JAXBElement<RetailProfile> createIntegrationQueueRetailProfile(RetailProfile value) {
        return new JAXBElement<RetailProfile>(_RetailProfile_QNAME, RetailProfile.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SecurityUser", scope = IntegrationQueue.class)
    public JAXBElement<SecurityUser> createIntegrationQueueSecurityUser(SecurityUser value) {
        return new JAXBElement<SecurityUser>(_SecurityUser_QNAME, SecurityUser.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoyaltyCardInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyCardInformation", scope = IntegrationQueue.class)
    public JAXBElement<LoyaltyCardInformation> createIntegrationQueueLoyaltyCardInformation(LoyaltyCardInformation value) {
        return new JAXBElement<LoyaltyCardInformation>(_LoyaltyCardInformation_QNAME, LoyaltyCardInformation.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceipt", scope = IntegrationQueue.class)
    public JAXBElement<GoodsReceipt> createIntegrationQueueGoodsReceipt(GoodsReceipt value) {
        return new JAXBElement<GoodsReceipt>(_GoodsReceipt_QNAME, GoodsReceipt.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TaxCode", scope = IntegrationQueue.class)
    public JAXBElement<TaxCode> createIntegrationQueueTaxCode(TaxCode value) {
        return new JAXBElement<TaxCode>(_TaxCode_QNAME, TaxCode.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FulfillmentPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FulfillmentPlan", scope = IntegrationQueue.class)
    public JAXBElement<FulfillmentPlan> createIntegrationQueueFulfillmentPlan(FulfillmentPlan value) {
        return new JAXBElement<FulfillmentPlan>(_FulfillmentPlan_QNAME, FulfillmentPlan.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceUOMMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceUoMMatrix", scope = IntegrationQueue.class)
    public JAXBElement<PriceUOMMatrix> createIntegrationQueuePriceUoMMatrix(PriceUOMMatrix value) {
        return new JAXBElement<PriceUOMMatrix>(_IntegrationQueuePriceUoMMatrix_QNAME, PriceUOMMatrix.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomTransactionInfoGrid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CustomTransactionInfoGrid", scope = IntegrationQueue.class)
    public JAXBElement<CustomTransactionInfoGrid> createIntegrationQueueCustomTransactionInfoGrid(CustomTransactionInfoGrid value) {
        return new JAXBElement<CustomTransactionInfoGrid>(_CustomTransactionInfoGrid_QNAME, CustomTransactionInfoGrid.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "State", scope = IntegrationQueue.class)
    public JAXBElement<State> createIntegrationQueueState(State value) {
        return new JAXBElement<State>(_State_QNAME, State.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Vendor", scope = IntegrationQueue.class)
    public JAXBElement<Vendor> createIntegrationQueueVendor(Vendor value) {
        return new JAXBElement<Vendor>(_Vendor_QNAME, Vendor.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberSeriesMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "POSNumberSeriesMaster", scope = IntegrationQueue.class)
    public JAXBElement<NumberSeriesMaster> createIntegrationQueuePOSNumberSeriesMaster(NumberSeriesMaster value) {
        return new JAXBElement<NumberSeriesMaster>(_IntegrationQueuePOSNumberSeriesMaster_QNAME, NumberSeriesMaster.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductImage", scope = IntegrationQueue.class)
    public JAXBElement<ProductImage> createIntegrationQueueProductImage(ProductImage value) {
        return new JAXBElement<ProductImage>(_ProductImage_QNAME, ProductImage.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Enterprise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Enterprise", scope = IntegrationQueue.class)
    public JAXBElement<Enterprise> createIntegrationQueueEnterprise(Enterprise value) {
        return new JAXBElement<Enterprise>(_Enterprise_QNAME, Enterprise.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LineAttribute", scope = IntegrationQueue.class)
    public JAXBElement<LineAttribute> createIntegrationQueueLineAttribute(LineAttribute value) {
        return new JAXBElement<LineAttribute>(_LineAttribute_QNAME, LineAttribute.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StockTransfer", scope = IntegrationQueue.class)
    public JAXBElement<StockTransfer> createIntegrationQueueStockTransfer(StockTransfer value) {
        return new JAXBElement<StockTransfer>(_StockTransfer_QNAME, StockTransfer.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UOM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOM", scope = IntegrationQueue.class)
    public JAXBElement<UOM> createIntegrationQueueUOM(UOM value) {
        return new JAXBElement<UOM>(_UOM_QNAME, UOM.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreExpense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StoreExpense", scope = IntegrationQueue.class)
    public JAXBElement<StoreExpense> createIntegrationQueueStoreExpense(StoreExpense value) {
        return new JAXBElement<StoreExpense>(_StoreExpense_QNAME, StoreExpense.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarCodeMask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BarCodeMask", scope = IntegrationQueue.class)
    public JAXBElement<BarCodeMask> createIntegrationQueueBarCodeMask(BarCodeMask value) {
        return new JAXBElement<BarCodeMask>(_BarCodeMask_QNAME, BarCodeMask.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsIssue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsIssue", scope = IntegrationQueue.class)
    public JAXBElement<GoodsIssue> createIntegrationQueueGoodsIssue(GoodsIssue value) {
        return new JAXBElement<GoodsIssue>(_GoodsIssue_QNAME, GoodsIssue.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Transaction", scope = IntegrationQueue.class)
    public JAXBElement<Transaction> createIntegrationQueueTransaction(Transaction value) {
        return new JAXBElement<Transaction>(_Transaction_QNAME, Transaction.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedFieldsDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UserDefinedFieldsDetails", scope = IntegrationQueue.class)
    public JAXBElement<UserDefinedFieldsDetails> createIntegrationQueueUserDefinedFieldsDetails(UserDefinedFieldsDetails value) {
        return new JAXBElement<UserDefinedFieldsDetails>(_UserDefinedFieldsDetails_QNAME, UserDefinedFieldsDetails.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Customer", scope = IntegrationQueue.class)
    public JAXBElement<Customer> createIntegrationQueueCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Employee", scope = IntegrationQueue.class)
    public JAXBElement<Employee> createIntegrationQueueEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReturn", scope = IntegrationQueue.class)
    public JAXBElement<GoodsReturn> createIntegrationQueueGoodsReturn(GoodsReturn value) {
        return new JAXBElement<GoodsReturn>(_GoodsReturn_QNAME, GoodsReturn.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Manufacturer", scope = IntegrationQueue.class)
    public JAXBElement<Manufacturer> createIntegrationQueueManufacturer(Manufacturer value) {
        return new JAXBElement<Manufacturer>(_Manufacturer_QNAME, Manufacturer.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Batch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Batch", scope = IntegrationQueue.class)
    public JAXBElement<Batch> createIntegrationQueueBatch(Batch value) {
        return new JAXBElement<Batch>(_Batch_QNAME, Batch.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DeliveryPackage", scope = IntegrationQueue.class)
    public JAXBElement<DeliveryPackage> createIntegrationQueueDeliveryPackage(DeliveryPackage value) {
        return new JAXBElement<DeliveryPackage>(_DeliveryPackage_QNAME, DeliveryPackage.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoyaltySetup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltySetup", scope = IntegrationQueue.class)
    public JAXBElement<LoyaltySetup> createIntegrationQueueLoyaltySetup(LoyaltySetup value) {
        return new JAXBElement<LoyaltySetup>(_LoyaltySetup_QNAME, LoyaltySetup.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayawayPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LayawayPlan", scope = IntegrationQueue.class)
    public JAXBElement<LayawayPlan> createIntegrationQueueLayawayPlan(LayawayPlan value) {
        return new JAXBElement<LayawayPlan>(_LayawayPlan_QNAME, LayawayPlan.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UPCTranslation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UPCTranslation", scope = IntegrationQueue.class)
    public JAXBElement<UPCTranslation> createIntegrationQueueUPCTranslation(UPCTranslation value) {
        return new JAXBElement<UPCTranslation>(_UPCTranslation_QNAME, UPCTranslation.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaleAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaleAttribute", scope = IntegrationQueue.class)
    public JAXBElement<SaleAttribute> createIntegrationQueueSaleAttribute(SaleAttribute value) {
        return new JAXBElement<SaleAttribute>(_SaleAttribute_QNAME, SaleAttribute.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Store }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Store", scope = IntegrationQueue.class)
    public JAXBElement<Store> createIntegrationQueueStore(Store value) {
        return new JAXBElement<Store>(_Store_QNAME, Store.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Warehouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Warehouse", scope = IntegrationQueue.class)
    public JAXBElement<Warehouse> createIntegrationQueueWarehouse(Warehouse value) {
        return new JAXBElement<Warehouse>(_Warehouse_QNAME, Warehouse.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InventoryItem", scope = IntegrationQueue.class)
    public JAXBElement<InventoryItem> createIntegrationQueueInventoryItem(InventoryItem value) {
        return new JAXBElement<InventoryItem>(_InventoryItem_QNAME, InventoryItem.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PriceList", scope = IntegrationQueue.class)
    public JAXBElement<PriceList> createIntegrationQueuePriceList(PriceList value) {
        return new JAXBElement<PriceList>(_PriceList_QNAME, PriceList.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Surcharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Surcharge", scope = IntegrationQueue.class)
    public JAXBElement<Surcharge> createIntegrationQueueSurcharge(Surcharge value) {
        return new JAXBElement<Surcharge>(_Surcharge_QNAME, Surcharge.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductCategory", scope = IntegrationQueue.class)
    public JAXBElement<ProductCategory> createIntegrationQueueProductCategory(ProductCategory value) {
        return new JAXBElement<ProductCategory>(_ProductCategory_QNAME, ProductCategory.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTransferRequisition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StockTransferRequest", scope = IntegrationQueue.class)
    public JAXBElement<StockTransferRequisition> createIntegrationQueueStockTransferRequest(StockTransferRequisition value) {
        return new JAXBElement<StockTransferRequisition>(_IntegrationQueueStockTransferRequest_QNAME, StockTransferRequisition.class, IntegrationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "product", scope = SaveProduct.class)
    public JAXBElement<Product> createSaveProductProduct(Product value) {
        return new JAXBElement<Product>(_SaveProductProduct_QNAME, Product.class, SaveProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XUpdateLoyaltyCustomer.class)
    public JAXBElement<String> createXUpdateLoyaltyCustomerApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XUpdateLoyaltyCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XUpdateLoyaltyCustomer.class)
    public JAXBElement<String> createXUpdateLoyaltyCustomerUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XUpdateLoyaltyCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "data", scope = XUpdateLoyaltyCustomer.class)
    public JAXBElement<Customer> createXUpdateLoyaltyCustomerData(Customer value) {
        return new JAXBElement<Customer>(_XAuthorizePaymentData_QNAME, Customer.class, XUpdateLoyaltyCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "goodsReceiptList", scope = SaveGoodsReceiptList.class)
    public JAXBElement<ArrayOfGoodsReceipt> createSaveGoodsReceiptListGoodsReceiptList(ArrayOfGoodsReceipt value) {
        return new JAXBElement<ArrayOfGoodsReceipt>(_SaveGoodsReceiptListGoodsReceiptList_QNAME, ArrayOfGoodsReceipt.class, SaveGoodsReceiptList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCertificateMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "giftCertificateMaster", scope = SaveGiftCertificateMaster.class)
    public JAXBElement<GiftCertificateMaster> createSaveGiftCertificateMasterGiftCertificateMaster(GiftCertificateMaster value) {
        return new JAXBElement<GiftCertificateMaster>(_SaveGiftCertificateMasterGiftCertificateMaster_QNAME, GiftCertificateMaster.class, SaveGiftCertificateMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetQueueByWarehouseWithoutStatusUpdateResult", scope = GetQueueByWarehouseWithoutStatusUpdateResponse.class)
    public JAXBElement<ArrayOfIntegrationQueue> createGetQueueByWarehouseWithoutStatusUpdateResponseGetQueueByWarehouseWithoutStatusUpdateResult(ArrayOfIntegrationQueue value) {
        return new JAXBElement<ArrayOfIntegrationQueue>(_GetQueueByWarehouseWithoutStatusUpdateResponseGetQueueByWarehouseWithoutStatusUpdateResult_QNAME, ArrayOfIntegrationQueue.class, GetQueueByWarehouseWithoutStatusUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsReceivable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetAccountsReceivableResult", scope = GetAccountsReceivableResponse.class)
    public JAXBElement<AccountsReceivable> createGetAccountsReceivableResponseGetAccountsReceivableResult(AccountsReceivable value) {
        return new JAXBElement<AccountsReceivable>(_GetAccountsReceivableResponseGetAccountsReceivableResult_QNAME, AccountsReceivable.class, GetAccountsReceivableResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "HierarchyDetailId", scope = ProductMerchandiseHierarchyDetail.class)
    public JAXBElement<String> createProductMerchandiseHierarchyDetailHierarchyDetailId(String value) {
        return new JAXBElement<String>(_ProductMerchandiseHierarchyDetailHierarchyDetailId_QNAME, String.class, ProductMerchandiseHierarchyDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "HierarchyDetailKey", scope = ProductMerchandiseHierarchyDetail.class)
    public JAXBElement<String> createProductMerchandiseHierarchyDetailHierarchyDetailKey(String value) {
        return new JAXBElement<String>(_ProductMerchandiseHierarchyDetailHierarchyDetailKey_QNAME, String.class, ProductMerchandiseHierarchyDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveExchangeRateListResult", scope = SaveExchangeRateListResponse.class)
    public JAXBElement<ArrayOfExchangeRate> createSaveExchangeRateListResponseSaveExchangeRateListResult(ArrayOfExchangeRate value) {
        return new JAXBElement<ArrayOfExchangeRate>(_SaveExchangeRateListResponseSaveExchangeRateListResult_QNAME, ArrayOfExchangeRate.class, SaveExchangeRateListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrderSurchargeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseOrderSurcharges", scope = PurchaseOrder.class)
    public JAXBElement<ArrayOfPurchaseOrderSurchargeDTO> createPurchaseOrderPurchaseOrderSurcharges(ArrayOfPurchaseOrderSurchargeDTO value) {
        return new JAXBElement<ArrayOfPurchaseOrderSurchargeDTO>(_PurchaseOrderPurchaseOrderSurcharges_QNAME, ArrayOfPurchaseOrderSurchargeDTO.class, PurchaseOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Vendor", scope = PurchaseOrder.class)
    public JAXBElement<Vendor> createPurchaseOrderVendor(Vendor value) {
        return new JAXBElement<Vendor>(_Vendor_QNAME, Vendor.class, PurchaseOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrderDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PurchaseOrderDetails", scope = PurchaseOrder.class)
    public JAXBElement<ArrayOfPurchaseOrderDetail> createPurchaseOrderPurchaseOrderDetails(ArrayOfPurchaseOrderDetail value) {
        return new JAXBElement<ArrayOfPurchaseOrderDetail>(_PurchaseOrderPurchaseOrderDetails_QNAME, ArrayOfPurchaseOrderDetail.class, PurchaseOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = PurchaseOrder.class)
    public JAXBElement<String> createPurchaseOrderComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, PurchaseOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUOMGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetUOMGroupResult", scope = GetUOMGroupResponse.class)
    public JAXBElement<ArrayOfUOMGroup> createGetUOMGroupResponseGetUOMGroupResult(ArrayOfUOMGroup value) {
        return new JAXBElement<ArrayOfUOMGroup>(_GetUOMGroupResponseGetUOMGroupResult_QNAME, ArrayOfUOMGroup.class, GetUOMGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetUOM.class)
    public JAXBElement<String> createGetUOMId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetUOM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveVendorGroupResult", scope = SaveVendorGroupResponse.class)
    public JAXBElement<VendorGroup> createSaveVendorGroupResponseSaveVendorGroupResult(VendorGroup value) {
        return new JAXBElement<VendorGroup>(_SaveVendorGroupResponseSaveVendorGroupResult_QNAME, VendorGroup.class, SaveVendorGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReceiptPO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveGoodsReceiptPOResult", scope = SaveGoodsReceiptPOResponse.class)
    public JAXBElement<GoodsReceiptPO> createSaveGoodsReceiptPOResponseSaveGoodsReceiptPOResult(GoodsReceiptPO value) {
        return new JAXBElement<GoodsReceiptPO>(_SaveGoodsReceiptPOResponseSaveGoodsReceiptPOResult_QNAME, GoodsReceiptPO.class, SaveGoodsReceiptPOResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "EndTime", scope = PromotionDaysApplicability.class)
    public JAXBElement<XMLGregorianCalendar> createPromotionDaysApplicabilityEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PromotionDaysApplicabilityEndTime_QNAME, XMLGregorianCalendar.class, PromotionDaysApplicability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "StartTime", scope = PromotionDaysApplicability.class)
    public JAXBElement<XMLGregorianCalendar> createPromotionDaysApplicabilityStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PromotionDaysApplicabilityStartTime_QNAME, XMLGregorianCalendar.class, PromotionDaysApplicability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "TaxCodeId", scope = PurchaseOrderSurchargeDTO.class)
    public JAXBElement<String> createPurchaseOrderSurchargeDTOTaxCodeId(String value) {
        return new JAXBElement<String>(_SurchargeTaxCodeId_QNAME, String.class, PurchaseOrderSurchargeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = PurchaseOrderSurchargeDTO.class)
    public JAXBElement<String> createPurchaseOrderSurchargeDTOComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, PurchaseOrderSurchargeDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "stockTransfer", scope = SaveStockTransfer.class)
    public JAXBElement<StockTransfer> createSaveStockTransferStockTransfer(StockTransfer value) {
        return new JAXBElement<StockTransfer>(_SaveStockTransferStockTransfer_QNAME, StockTransfer.class, SaveStockTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "countryList", scope = SaveCountryList.class)
    public JAXBElement<ArrayOfCountry> createSaveCountryListCountryList(ArrayOfCountry value) {
        return new JAXBElement<ArrayOfCountry>(_SaveStoreListCountryList_QNAME, ArrayOfCountry.class, SaveCountryList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = GetPrePrintedLoyaltyCards.class)
    public JAXBElement<String> createGetPrePrintedLoyaltyCardsApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, GetPrePrintedLoyaltyCards.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = GetPrePrintedLoyaltyCards.class)
    public JAXBElement<String> createGetPrePrintedLoyaltyCardsUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, GetPrePrintedLoyaltyCards.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetPaymentTypeResult", scope = GetPaymentTypeResponse.class)
    public JAXBElement<PaymentType> createGetPaymentTypeResponseGetPaymentTypeResult(PaymentType value) {
        return new JAXBElement<PaymentType>(_GetPaymentTypeResponseGetPaymentTypeResult_QNAME, PaymentType.class, GetPaymentTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "customerGroupList", scope = SaveCustomerGroupList.class)
    public JAXBElement<ArrayOfCustomerGroup> createSaveCustomerGroupListCustomerGroupList(ArrayOfCustomerGroup value) {
        return new JAXBElement<ArrayOfCustomerGroup>(_SaveCustomerGroupListCustomerGroupList_QNAME, ArrayOfCustomerGroup.class, SaveCustomerGroupList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = ProductCategory.class)
    public JAXBElement<String> createProductCategoryDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, ProductCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductId", scope = ProductCategory.class)
    public JAXBElement<String> createProductCategoryProductId(String value) {
        return new JAXBElement<String>(_TransactionItemProductId_QNAME, String.class, ProductCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveGoodsReceiptPOListResult", scope = SaveGoodsReceiptPOListResponse.class)
    public JAXBElement<ArrayOfGoodsReceiptPO> createSaveGoodsReceiptPOListResponseSaveGoodsReceiptPOListResult(ArrayOfGoodsReceiptPO value) {
        return new JAXBElement<ArrayOfGoodsReceiptPO>(_SaveGoodsReceiptPOListResponseSaveGoodsReceiptPOListResult_QNAME, ArrayOfGoodsReceiptPO.class, SaveGoodsReceiptPOListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "InitializeResult", scope = InitializeResponse.class)
    public JAXBElement<String> createInitializeResponseInitializeResult(String value) {
        return new JAXBElement<String>(_InitializeResponseInitializeResult_QNAME, String.class, InitializeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPriceDiscountGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveSpecialPriceDiscountGroupResult", scope = SaveSpecialPriceDiscountGroupResponse.class)
    public JAXBElement<ArrayOfSpecialPriceDiscountGroup> createSaveSpecialPriceDiscountGroupResponseSaveSpecialPriceDiscountGroupResult(ArrayOfSpecialPriceDiscountGroup value) {
        return new JAXBElement<ArrayOfSpecialPriceDiscountGroup>(_SaveSpecialPriceDiscountGroupResponseSaveSpecialPriceDiscountGroupResult_QNAME, ArrayOfSpecialPriceDiscountGroup.class, SaveSpecialPriceDiscountGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReferenceNumber", scope = GoodsIssue.class)
    public JAXBElement<String> createGoodsIssueReferenceNumber(String value) {
        return new JAXBElement<String>(_GoodsReturnReferenceNumber_QNAME, String.class, GoodsIssue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BusinessPartnerCode", scope = GoodsIssue.class)
    public JAXBElement<String> createGoodsIssueBusinessPartnerCode(String value) {
        return new JAXBElement<String>(_GoodsIssueBusinessPartnerCode_QNAME, String.class, GoodsIssue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = GoodsIssue.class)
    public JAXBElement<String> createGoodsIssueComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, GoodsIssue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveInventoryItemsResult", scope = SaveInventoryItemsResponse.class)
    public JAXBElement<ArrayOfInventoryItem> createSaveInventoryItemsResponseSaveInventoryItemsResult(ArrayOfInventoryItem value) {
        return new JAXBElement<ArrayOfInventoryItem>(_SaveInventoryItemsResponseSaveInventoryItemsResult_QNAME, ArrayOfInventoryItem.class, SaveInventoryItemsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetSerial.class)
    public JAXBElement<String> createGetSerialId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteGiftCertificateMaster.class)
    public JAXBElement<String> createDeleteGiftCertificateMasterId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteGiftCertificateMaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetStateResult", scope = GetStateResponse.class)
    public JAXBElement<State> createGetStateResponseGetStateResult(State value) {
        return new JAXBElement<State>(_GetStateResponseGetStateResult_QNAME, State.class, GetStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = UpdateSynchronizationStatus.class)
    public JAXBElement<String> createUpdateSynchronizationStatusApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, UpdateSynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "lastErrorMessage", scope = UpdateSynchronizationStatus.class)
    public JAXBElement<String> createUpdateSynchronizationStatusLastErrorMessage(String value) {
        return new JAXBElement<String>(_UpdateSynchronizationStatusLastErrorMessage_QNAME, String.class, UpdateSynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = UpdateSynchronizationStatus.class)
    public JAXBElement<String> createUpdateSynchronizationStatusUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, UpdateSynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CultureInfo", scope = Currency.class)
    public JAXBElement<String> createCurrencyCultureInfo(String value) {
        return new JAXBElement<String>(_CurrencyCultureInfo_QNAME, String.class, Currency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = Currency.class)
    public JAXBElement<String> createCurrencyDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, Currency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrencyDenomination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "DenominationList", scope = Currency.class)
    public JAXBElement<ArrayOfCurrencyDenomination> createCurrencyDenominationList(ArrayOfCurrencyDenomination value) {
        return new JAXBElement<ArrayOfCurrencyDenomination>(_CurrencyDenominationList_QNAME, ArrayOfCurrencyDenomination.class, Currency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Id", scope = GetProductImage.class)
    public JAXBElement<String> createGetProductImageId(String value) {
        return new JAXBElement<String>(_GetCurrencyId_QNAME, String.class, GetProductImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "apiToken", scope = XSaveCustomer.class)
    public JAXBElement<String> createXSaveCustomerApiToken(String value) {
        return new JAXBElement<String>(_XGetTransactionApiToken_QNAME, String.class, XSaveCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "udid", scope = XSaveCustomer.class)
    public JAXBElement<String> createXSaveCustomerUdid(String value) {
        return new JAXBElement<String>(_XGetTransactionUdid_QNAME, String.class, XSaveCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "data", scope = XSaveCustomer.class)
    public JAXBElement<Customer> createXSaveCustomerData(Customer value) {
        return new JAXBElement<Customer>(_XAuthorizePaymentData_QNAME, Customer.class, XSaveCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = ProductGroup.class)
    public JAXBElement<String> createProductGroupDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, ProductGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveExchangeRateResult", scope = SaveExchangeRateResponse.class)
    public JAXBElement<ExchangeRate> createSaveExchangeRateResponseSaveExchangeRateResult(ExchangeRate value) {
        return new JAXBElement<ExchangeRate>(_SaveExchangeRateResponseSaveExchangeRateResult_QNAME, ExchangeRate.class, SaveExchangeRateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMId", scope = StockTransferRequisitionDetail.class)
    public JAXBElement<String> createStockTransferRequisitionDetailUOMId(String value) {
        return new JAXBElement<String>(_PromotionGetUOMId_QNAME, String.class, StockTransferRequisitionDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = StockTransferRequisitionDetail.class)
    public JAXBElement<String> createStockTransferRequisitionDetailDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, StockTransferRequisitionDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductId", scope = StockTransferRequisitionDetail.class)
    public JAXBElement<String> createStockTransferRequisitionDetailProductId(String value) {
        return new JAXBElement<String>(_TransactionItemProductId_QNAME, String.class, StockTransferRequisitionDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Warehouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveWarehouseResult", scope = SaveWarehouseResponse.class)
    public JAXBElement<Warehouse> createSaveWarehouseResponseSaveWarehouseResult(Warehouse value) {
        return new JAXBElement<Warehouse>(_SaveWarehouseResponseSaveWarehouseResult_QNAME, Warehouse.class, SaveWarehouseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = GetCustomerGroup.class)
    public JAXBElement<String> createGetCustomerGroupId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, GetCustomerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteCountry.class)
    public JAXBElement<String> createDeleteCountryId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteCountry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "customerId", scope = GetAccountsReceivable.class)
    public JAXBElement<String> createGetAccountsReceivableCustomerId(String value) {
        return new JAXBElement<String>(_GetAccountsReceivableCustomerId_QNAME, String.class, GetAccountsReceivable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SaveCustomerResult", scope = SaveCustomerResponse.class)
    public JAXBElement<Customer> createSaveCustomerResponseSaveCustomerResult(Customer value) {
        return new JAXBElement<Customer>(_SaveCustomerResponseSaveCustomerResult_QNAME, Customer.class, SaveCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "currency", scope = SaveCurrency.class)
    public JAXBElement<Currency> createSaveCurrencyCurrency(Currency value) {
        return new JAXBElement<Currency>(_SaveCurrencyCurrency_QNAME, Currency.class, SaveCurrency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "searhQuery", scope = SearchTransaction.class)
    public JAXBElement<String> createSearchTransactionSearhQuery(String value) {
        return new JAXBElement<String>(_SearchTransactionSearhQuery_QNAME, String.class, SearchTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "loyaltyId", scope = GetPointsDetails.class)
    public JAXBElement<String> createGetPointsDetailsLoyaltyId(String value) {
        return new JAXBElement<String>(_GetMonthlyPointsSummaryLoyaltyId_QNAME, String.class, GetPointsDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "manufacturer", scope = SaveManufacturer.class)
    public JAXBElement<Manufacturer> createSaveManufacturerManufacturer(Manufacturer value) {
        return new JAXBElement<Manufacturer>(_SaveManufacturerManufacturer_QNAME, Manufacturer.class, SaveManufacturer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoyaltyLicenceDetailsResponse.GetLoyaltyLicenceDetailsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GetLoyaltyLicenceDetailsResult", scope = GetLoyaltyLicenceDetailsResponse.class)
    public JAXBElement<GetLoyaltyLicenceDetailsResponse.GetLoyaltyLicenceDetailsResult> createGetLoyaltyLicenceDetailsResponseGetLoyaltyLicenceDetailsResult(GetLoyaltyLicenceDetailsResponse.GetLoyaltyLicenceDetailsResult value) {
        return new JAXBElement<GetLoyaltyLicenceDetailsResponse.GetLoyaltyLicenceDetailsResult>(_GetLoyaltyLicenceDetailsResponseGetLoyaltyLicenceDetailsResult_QNAME, GetLoyaltyLicenceDetailsResponse.GetLoyaltyLicenceDetailsResult.class, GetLoyaltyLicenceDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "employeeList", scope = SaveEmployeeList.class)
    public JAXBElement<ArrayOfEmployee> createSaveEmployeeListEmployeeList(ArrayOfEmployee value) {
        return new JAXBElement<ArrayOfEmployee>(_SaveEmployeeListEmployeeList_QNAME, ArrayOfEmployee.class, SaveEmployeeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "HandheldDeviceId", scope = GoodsReceipt.class)
    public JAXBElement<String> createGoodsReceiptHandheldDeviceId(String value) {
        return new JAXBElement<String>(_GoodsReceiptPOHandheldDeviceId_QNAME, String.class, GoodsReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BusinessPartnerCode", scope = GoodsReceipt.class)
    public JAXBElement<String> createGoodsReceiptBusinessPartnerCode(String value) {
        return new JAXBElement<String>(_GoodsIssueBusinessPartnerCode_QNAME, String.class, GoodsReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReferenceNumber2", scope = GoodsReceipt.class)
    public JAXBElement<String> createGoodsReceiptReferenceNumber2(String value) {
        return new JAXBElement<String>(_StockTransferReferenceNumber2_QNAME, String.class, GoodsReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptNumber", scope = GoodsReceipt.class)
    public JAXBElement<String> createGoodsReceiptGoodsReceiptNumber(String value) {
        return new JAXBElement<String>(_GoodsReceiptPOGoodsReceiptNumber_QNAME, String.class, GoodsReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ReferenceNumber1", scope = GoodsReceipt.class)
    public JAXBElement<String> createGoodsReceiptReferenceNumber1(String value) {
        return new JAXBElement<String>(_StockTransferReferenceNumber1_QNAME, String.class, GoodsReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Comment", scope = GoodsReceipt.class)
    public JAXBElement<String> createGoodsReceiptComment(String value) {
        return new JAXBElement<String>(_GoodsReturnComment_QNAME, String.class, GoodsReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTransactionResponse.SearchTransactionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SearchTransactionResult", scope = SearchTransactionResponse.class)
    public JAXBElement<SearchTransactionResponse.SearchTransactionResult> createSearchTransactionResponseSearchTransactionResult(SearchTransactionResponse.SearchTransactionResult value) {
        return new JAXBElement<SearchTransactionResponse.SearchTransactionResult>(_SearchTransactionResponseSearchTransactionResult_QNAME, SearchTransactionResponse.SearchTransactionResult.class, SearchTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address1", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryAddress1(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress1_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Gender", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryGender(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationGender_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "State", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Email", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryEmail(String value) {
        return new JAXBElement<String>(_VendorEmail_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Address2", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryAddress2(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationAddress2_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "CurrentSlab", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryCurrentSlab(String value) {
        return new JAXBElement<String>(_CustomerSummeryCurrentSlab_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "MobilePhone", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryMobilePhone(String value) {
        return new JAXBElement<String>(_VendorMobilePhone_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "FirstName", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryFirstName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationFirstName_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GroupName", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryGroupName(String value) {
        return new JAXBElement<String>(_CustomerSummeryGroupName_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "AnniversaryDate", scope = CustomerSummery.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerSummeryAnniversaryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LoyaltyCardInformationAnniversaryDate_QNAME, XMLGregorianCalendar.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LoyaltyId", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryLoyaltyId(String value) {
        return new JAXBElement<String>(_PostTransactionLoyaltyId_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "City", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryCity(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationCity_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Country", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "LastName", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryLastName(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationLastName_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ZipCode", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryZipCode(String value) {
        return new JAXBElement<String>(_LoyaltyCardInformationZipCode_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "BirthDate", scope = CustomerSummery.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerSummeryBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LoyaltyCardInformationBirthDate_QNAME, XMLGregorianCalendar.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PhoneNumber", scope = CustomerSummery.class)
    public JAXBElement<String> createCustomerSummeryPhoneNumber(String value) {
        return new JAXBElement<String>(_VendorPhoneNumber_QNAME, String.class, CustomerSummery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "vendor", scope = SaveVendor.class)
    public JAXBElement<Vendor> createSaveVendorVendor(Vendor value) {
        return new JAXBElement<Vendor>(_SaveVendorVendor_QNAME, Vendor.class, SaveVendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPricingQuantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "SpecialPriceListQuantityWrapper", scope = SpecialPricingDate.class)
    public JAXBElement<ArrayOfSpecialPricingQuantity> createSpecialPricingDateSpecialPriceListQuantityWrapper(ArrayOfSpecialPricingQuantity value) {
        return new JAXBElement<ArrayOfSpecialPricingQuantity>(_SpecialPricingDateSpecialPriceListQuantityWrapper_QNAME, ArrayOfSpecialPricingQuantity.class, SpecialPricingDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionApplicabilityDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionApplicabilityDetail", scope = PromotionBonusBuys.class)
    public JAXBElement<ArrayOfPromotionApplicabilityDetail> createPromotionBonusBuysPromotionApplicabilityDetail(ArrayOfPromotionApplicabilityDetail value) {
        return new JAXBElement<ArrayOfPromotionApplicabilityDetail>(_PromotionApplicabilityDetail_QNAME, ArrayOfPromotionApplicabilityDetail.class, PromotionBonusBuys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionDaysApplicability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionDaysApplicability", scope = PromotionBonusBuys.class)
    public JAXBElement<ArrayOfPromotionDaysApplicability> createPromotionBonusBuysPromotionDaysApplicability(ArrayOfPromotionDaysApplicability value) {
        return new JAXBElement<ArrayOfPromotionDaysApplicability>(_PromotionDaysApplicability_QNAME, ArrayOfPromotionDaysApplicability.class, PromotionBonusBuys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "Description", scope = PromotionBonusBuys.class)
    public JAXBElement<String> createPromotionBonusBuysDescription(String value) {
        return new JAXBElement<String>(_CountryDescription_QNAME, String.class, PromotionBonusBuys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionExcludedItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionExcludedItemDetail", scope = PromotionBonusBuys.class)
    public JAXBElement<ArrayOfPromotionExcludedItem> createPromotionBonusBuysPromotionExcludedItemDetail(ArrayOfPromotionExcludedItem value) {
        return new JAXBElement<ArrayOfPromotionExcludedItem>(_PromotionBonusBuysPromotionExcludedItemDetail_QNAME, ArrayOfPromotionExcludedItem.class, PromotionBonusBuys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionProductDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "PromotionProductDetail", scope = PromotionBonusBuys.class)
    public JAXBElement<ArrayOfPromotionProductDetail> createPromotionBonusBuysPromotionProductDetail(ArrayOfPromotionProductDetail value) {
        return new JAXBElement<ArrayOfPromotionProductDetail>(_PromotionProductDetail_QNAME, ArrayOfPromotionProductDetail.class, PromotionBonusBuys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "id", scope = DeleteTaxCode.class)
    public JAXBElement<String> createDeleteTaxCodeId(String value) {
        return new JAXBElement<String>(_GetTaxCodeId_QNAME, String.class, DeleteTaxCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "UOMId", scope = GoodsReceiptPODetail.class)
    public JAXBElement<String> createGoodsReceiptPODetailUOMId(String value) {
        return new JAXBElement<String>(_PromotionGetUOMId_QNAME, String.class, GoodsReceiptPODetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPOSerialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptPOSerialDetailList", scope = GoodsReceiptPODetail.class)
    public JAXBElement<ArrayOfGoodsReceiptPOSerialDetail> createGoodsReceiptPODetailGoodsReceiptPOSerialDetailList(ArrayOfGoodsReceiptPOSerialDetail value) {
        return new JAXBElement<ArrayOfGoodsReceiptPOSerialDetail>(_GoodsReceiptPODetailGoodsReceiptPOSerialDetailList_QNAME, ArrayOfGoodsReceiptPOSerialDetail.class, GoodsReceiptPODetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPOBatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "GoodsReceiptPOBatchDetailList", scope = GoodsReceiptPODetail.class)
    public JAXBElement<ArrayOfGoodsReceiptPOBatchDetail> createGoodsReceiptPODetailGoodsReceiptPOBatchDetailList(ArrayOfGoodsReceiptPOBatchDetail value) {
        return new JAXBElement<ArrayOfGoodsReceiptPOBatchDetail>(_GoodsReceiptPODetailGoodsReceiptPOBatchDetailList_QNAME, ArrayOfGoodsReceiptPOBatchDetail.class, GoodsReceiptPODetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iVend.com/IIntegrationService/2010/12", name = "ProductDescription", scope = GoodsReceiptPODetail.class)
    public JAXBElement<String> createGoodsReceiptPODetailProductDescription(String value) {
        return new JAXBElement<String>(_PriceMatrixProductDescription_QNAME, String.class, GoodsReceiptPODetail.class, value);
    }

}
