
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs.OperationType;


/**
 * <p>Java class for IntegrationQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrationQueue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="AlternateItem" type="{http://www.iVend.com/IIntegrationService/2010/12}AlternateItem" minOccurs="0"/>
 *         &lt;element name="BarCodeMask" type="{http://www.iVend.com/IIntegrationService/2010/12}BarCodeMask" minOccurs="0"/>
 *         &lt;element name="Batch" type="{http://www.iVend.com/IIntegrationService/2010/12}Batch" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.iVend.com/IIntegrationService/2010/12}Country" minOccurs="0"/>
 *         &lt;element name="Coupon" type="{http://www.iVend.com/IIntegrationService/2010/12}Coupon" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.iVend.com/IIntegrationService/2010/12}Currency" minOccurs="0"/>
 *         &lt;element name="CustomTransactionInfoGrid" type="{http://www.iVend.com/IIntegrationService/2010/12}CustomTransactionInfoGrid" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://www.iVend.com/IIntegrationService/2010/12}Customer" minOccurs="0"/>
 *         &lt;element name="CustomerGroup" type="{http://www.iVend.com/IIntegrationService/2010/12}CustomerGroup" minOccurs="0"/>
 *         &lt;element name="DeliveryPackage" type="{http://www.iVend.com/IIntegrationService/2010/12}DeliveryPackage" minOccurs="0"/>
 *         &lt;element name="Employee" type="{http://www.iVend.com/IIntegrationService/2010/12}Employee" minOccurs="0"/>
 *         &lt;element name="Enterprise" type="{http://www.iVend.com/IIntegrationService/2010/12}Enterprise" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.iVend.com/IIntegrationService/2010/12}ExchangeRate" minOccurs="0"/>
 *         &lt;element name="FulfillmentPlan" type="{http://www.iVend.com/IIntegrationService/2010/12}FulfillmentPlan" minOccurs="0"/>
 *         &lt;element name="GoodsIssue" type="{http://www.iVend.com/IIntegrationService/2010/12}GoodsIssue" minOccurs="0"/>
 *         &lt;element name="GoodsReceipt" type="{http://www.iVend.com/IIntegrationService/2010/12}GoodsReceipt" minOccurs="0"/>
 *         &lt;element name="GoodsReturn" type="{http://www.iVend.com/IIntegrationService/2010/12}GoodsReturn" minOccurs="0"/>
 *         &lt;element name="IntegrationKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InventoryItem" type="{http://www.iVend.com/IIntegrationService/2010/12}InventoryItem" minOccurs="0"/>
 *         &lt;element name="LayawayPlan" type="{http://www.iVend.com/IIntegrationService/2010/12}LayawayPlan" minOccurs="0"/>
 *         &lt;element name="LineAttribute" type="{http://www.iVend.com/IIntegrationService/2010/12}LineAttribute" minOccurs="0"/>
 *         &lt;element name="LogDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LoyaltyCardInformation" type="{http://www.iVend.com/IIntegrationService/2010/12}LoyaltyCardInformation" minOccurs="0"/>
 *         &lt;element name="LoyaltySetup" type="{http://www.iVend.com/IIntegrationService/2010/12}LoyaltySetup" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.iVend.com/IIntegrationService/2010/12}Manufacturer" minOccurs="0"/>
 *         &lt;element name="OperationType" type="{http://schemas.datacontract.org/2004/07/CXS.Retail}OperationType" minOccurs="0"/>
 *         &lt;element name="POS" type="{http://www.iVend.com/IIntegrationService/2010/12}POS" minOccurs="0"/>
 *         &lt;element name="POSNumberSeriesMaster" type="{http://www.iVend.com/IIntegrationService/2010/12}NumberSeriesMaster" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://www.iVend.com/IIntegrationService/2010/12}PaymentType" minOccurs="0"/>
 *         &lt;element name="PriceList" type="{http://www.iVend.com/IIntegrationService/2010/12}PriceList" minOccurs="0"/>
 *         &lt;element name="PriceMatrix" type="{http://www.iVend.com/IIntegrationService/2010/12}PriceMatrix" minOccurs="0"/>
 *         &lt;element name="PriceUoMMatrix" type="{http://www.iVend.com/IIntegrationService/2010/12}PriceUOMMatrix" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://www.iVend.com/IIntegrationService/2010/12}Product" minOccurs="0"/>
 *         &lt;element name="ProductCategory" type="{http://www.iVend.com/IIntegrationService/2010/12}ProductCategory" minOccurs="0"/>
 *         &lt;element name="ProductGroup" type="{http://www.iVend.com/IIntegrationService/2010/12}ProductGroup" minOccurs="0"/>
 *         &lt;element name="ProductImage" type="{http://www.iVend.com/IIntegrationService/2010/12}ProductImage" minOccurs="0"/>
 *         &lt;element name="PurchaseOrder" type="{http://www.iVend.com/IIntegrationService/2010/12}PurchaseOrder" minOccurs="0"/>
 *         &lt;element name="RetailProfile" type="{http://www.iVend.com/IIntegrationService/2010/12}RetailProfile" minOccurs="0"/>
 *         &lt;element name="SaleAttribute" type="{http://www.iVend.com/IIntegrationService/2010/12}SaleAttribute" minOccurs="0"/>
 *         &lt;element name="SecurityRights" type="{http://www.iVend.com/IIntegrationService/2010/12}SecurityRights" minOccurs="0"/>
 *         &lt;element name="SecurityUser" type="{http://www.iVend.com/IIntegrationService/2010/12}SecurityUser" minOccurs="0"/>
 *         &lt;element name="Serial" type="{http://www.iVend.com/IIntegrationService/2010/12}Serial" minOccurs="0"/>
 *         &lt;element name="ShippingType" type="{http://www.iVend.com/IIntegrationService/2010/12}ShippingType" minOccurs="0"/>
 *         &lt;element name="SourceKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceType" type="{http://schemas.datacontract.org/2004/07/CXS.Retail}RetailObjectId" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.iVend.com/IIntegrationService/2010/12}State" minOccurs="0"/>
 *         &lt;element name="StockTransfer" type="{http://www.iVend.com/IIntegrationService/2010/12}StockTransfer" minOccurs="0"/>
 *         &lt;element name="StockTransferRequest" type="{http://www.iVend.com/IIntegrationService/2010/12}StockTransferRequisition" minOccurs="0"/>
 *         &lt;element name="Store" type="{http://www.iVend.com/IIntegrationService/2010/12}Store" minOccurs="0"/>
 *         &lt;element name="StoreExpense" type="{http://www.iVend.com/IIntegrationService/2010/12}StoreExpense" minOccurs="0"/>
 *         &lt;element name="Surcharge" type="{http://www.iVend.com/IIntegrationService/2010/12}Surcharge" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.iVend.com/IIntegrationService/2010/12}TaxCode" minOccurs="0"/>
 *         &lt;element name="TotalRecordCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Transaction" type="{http://www.iVend.com/IIntegrationService/2010/12}Transaction" minOccurs="0"/>
 *         &lt;element name="UOM" type="{http://www.iVend.com/IIntegrationService/2010/12}UOM" minOccurs="0"/>
 *         &lt;element name="UOMGroup" type="{http://www.iVend.com/IIntegrationService/2010/12}UOMGroup" minOccurs="0"/>
 *         &lt;element name="UPCTranslation" type="{http://www.iVend.com/IIntegrationService/2010/12}UPCTranslation" minOccurs="0"/>
 *         &lt;element name="UserDefinedFieldsDetails" type="{http://www.iVend.com/IIntegrationService/2010/12}UserDefinedFieldsDetails" minOccurs="0"/>
 *         &lt;element name="UserDefinedFieldsValidValue" type="{http://www.iVend.com/IIntegrationService/2010/12}UserDefinedFieldsValidValue" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://www.iVend.com/IIntegrationService/2010/12}Vendor" minOccurs="0"/>
 *         &lt;element name="Warehouse" type="{http://www.iVend.com/IIntegrationService/2010/12}Warehouse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationQueue", propOrder = {
    "alternateItem",
    "barCodeMask",
    "batch",
    "country",
    "coupon",
    "currency",
    "customTransactionInfoGrid",
    "customer",
    "customerGroup",
    "deliveryPackage",
    "employee",
    "enterprise",
    "exchangeRate",
    "fulfillmentPlan",
    "goodsIssue",
    "goodsReceipt",
    "goodsReturn",
    "integrationKey",
    "inventoryItem",
    "layawayPlan",
    "lineAttribute",
    "logDatetime",
    "loyaltyCardInformation",
    "loyaltySetup",
    "manufacturer",
    "operationType",
    "pos",
    "posNumberSeriesMaster",
    "paymentType",
    "priceList",
    "priceMatrix",
    "priceUoMMatrix",
    "product",
    "productCategory",
    "productGroup",
    "productImage",
    "purchaseOrder",
    "retailProfile",
    "saleAttribute",
    "securityRights",
    "securityUser",
    "serial",
    "shippingType",
    "sourceKey",
    "sourceType",
    "state",
    "stockTransfer",
    "stockTransferRequest",
    "store",
    "storeExpense",
    "surcharge",
    "taxCode",
    "totalRecordCount",
    "transaction",
    "uom",
    "uomGroup",
    "upcTranslation",
    "userDefinedFieldsDetails",
    "userDefinedFieldsValidValue",
    "vendor",
    "warehouse"
})
public class IntegrationQueue
    extends BaseWrapper
{

    @XmlElementRef(name = "AlternateItem", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<AlternateItem> alternateItem;
    @XmlElementRef(name = "BarCodeMask", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<BarCodeMask> barCodeMask;
    @XmlElementRef(name = "Batch", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Batch> batch;
    @XmlElementRef(name = "Country", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Country> country;
    @XmlElementRef(name = "Coupon", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Coupon> coupon;
    @XmlElementRef(name = "Currency", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Currency> currency;
    @XmlElementRef(name = "CustomTransactionInfoGrid", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomTransactionInfoGrid> customTransactionInfoGrid;
    @XmlElementRef(name = "Customer", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Customer> customer;
    @XmlElementRef(name = "CustomerGroup", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerGroup> customerGroup;
    @XmlElementRef(name = "DeliveryPackage", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<DeliveryPackage> deliveryPackage;
    @XmlElementRef(name = "Employee", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Employee> employee;
    @XmlElementRef(name = "Enterprise", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Enterprise> enterprise;
    @XmlElementRef(name = "ExchangeRate", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ExchangeRate> exchangeRate;
    @XmlElementRef(name = "FulfillmentPlan", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<FulfillmentPlan> fulfillmentPlan;
    @XmlElementRef(name = "GoodsIssue", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<GoodsIssue> goodsIssue;
    @XmlElementRef(name = "GoodsReceipt", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<GoodsReceipt> goodsReceipt;
    @XmlElementRef(name = "GoodsReturn", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<GoodsReturn> goodsReturn;
    @XmlElement(name = "IntegrationKey")
    protected Long integrationKey;
    @XmlElementRef(name = "InventoryItem", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<InventoryItem> inventoryItem;
    @XmlElementRef(name = "LayawayPlan", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<LayawayPlan> layawayPlan;
    @XmlElementRef(name = "LineAttribute", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<LineAttribute> lineAttribute;
    @XmlElement(name = "LogDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar logDatetime;
    @XmlElementRef(name = "LoyaltyCardInformation", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<LoyaltyCardInformation> loyaltyCardInformation;
    @XmlElementRef(name = "LoyaltySetup", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<LoyaltySetup> loyaltySetup;
    @XmlElementRef(name = "Manufacturer", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Manufacturer> manufacturer;
    @XmlElement(name = "OperationType")
    protected OperationType operationType;
    @XmlElementRef(name = "POS", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<POS> pos;
    @XmlElementRef(name = "POSNumberSeriesMaster", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<NumberSeriesMaster> posNumberSeriesMaster;
    @XmlElementRef(name = "PaymentType", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<PaymentType> paymentType;
    @XmlElementRef(name = "PriceList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<PriceList> priceList;
    @XmlElementRef(name = "PriceMatrix", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<PriceMatrix> priceMatrix;
    @XmlElementRef(name = "PriceUoMMatrix", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<PriceUOMMatrix> priceUoMMatrix;
    @XmlElementRef(name = "Product", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Product> product;
    @XmlElementRef(name = "ProductCategory", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductCategory> productCategory;
    @XmlElementRef(name = "ProductGroup", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductGroup> productGroup;
    @XmlElementRef(name = "ProductImage", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductImage> productImage;
    @XmlElementRef(name = "PurchaseOrder", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<PurchaseOrder> purchaseOrder;
    @XmlElementRef(name = "RetailProfile", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<RetailProfile> retailProfile;
    @XmlElementRef(name = "SaleAttribute", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<SaleAttribute> saleAttribute;
    @XmlElementRef(name = "SecurityRights", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<SecurityRights> securityRights;
    @XmlElementRef(name = "SecurityUser", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<SecurityUser> securityUser;
    @XmlElementRef(name = "Serial", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Serial> serial;
    @XmlElementRef(name = "ShippingType", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ShippingType> shippingType;
    @XmlElement(name = "SourceKey")
    protected Long sourceKey;
    @XmlElement(name = "SourceType")
    protected String sourceType;
    @XmlElementRef(name = "State", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<State> state;
    @XmlElementRef(name = "StockTransfer", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<StockTransfer> stockTransfer;
    @XmlElementRef(name = "StockTransferRequest", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<StockTransferRequisition> stockTransferRequest;
    @XmlElementRef(name = "Store", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Store> store;
    @XmlElementRef(name = "StoreExpense", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<StoreExpense> storeExpense;
    @XmlElementRef(name = "Surcharge", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Surcharge> surcharge;
    @XmlElementRef(name = "TaxCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxCode> taxCode;
    @XmlElement(name = "TotalRecordCount")
    protected Integer totalRecordCount;
    @XmlElementRef(name = "Transaction", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Transaction> transaction;
    @XmlElementRef(name = "UOM", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<UOM> uom;
    @XmlElementRef(name = "UOMGroup", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<UOMGroup> uomGroup;
    @XmlElementRef(name = "UPCTranslation", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<UPCTranslation> upcTranslation;
    @XmlElementRef(name = "UserDefinedFieldsDetails", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDefinedFieldsDetails> userDefinedFieldsDetails;
    @XmlElementRef(name = "UserDefinedFieldsValidValue", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDefinedFieldsValidValue> userDefinedFieldsValidValue;
    @XmlElementRef(name = "Vendor", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Vendor> vendor;
    @XmlElementRef(name = "Warehouse", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Warehouse> warehouse;

    /**
     * Gets the value of the alternateItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlternateItem }{@code >}
     *     
     */
    public JAXBElement<AlternateItem> getAlternateItem() {
        return alternateItem;
    }

    /**
     * Sets the value of the alternateItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlternateItem }{@code >}
     *     
     */
    public void setAlternateItem(JAXBElement<AlternateItem> value) {
        this.alternateItem = value;
    }

    /**
     * Gets the value of the barCodeMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BarCodeMask }{@code >}
     *     
     */
    public JAXBElement<BarCodeMask> getBarCodeMask() {
        return barCodeMask;
    }

    /**
     * Sets the value of the barCodeMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BarCodeMask }{@code >}
     *     
     */
    public void setBarCodeMask(JAXBElement<BarCodeMask> value) {
        this.barCodeMask = value;
    }

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Batch }{@code >}
     *     
     */
    public JAXBElement<Batch> getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Batch }{@code >}
     *     
     */
    public void setBatch(JAXBElement<Batch> value) {
        this.batch = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Country }{@code >}
     *     
     */
    public JAXBElement<Country> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Country }{@code >}
     *     
     */
    public void setCountry(JAXBElement<Country> value) {
        this.country = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coupon }{@code >}
     *     
     */
    public JAXBElement<Coupon> getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coupon }{@code >}
     *     
     */
    public void setCoupon(JAXBElement<Coupon> value) {
        this.coupon = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Currency }{@code >}
     *     
     */
    public JAXBElement<Currency> getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Currency }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<Currency> value) {
        this.currency = value;
    }

    /**
     * Gets the value of the customTransactionInfoGrid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomTransactionInfoGrid }{@code >}
     *     
     */
    public JAXBElement<CustomTransactionInfoGrid> getCustomTransactionInfoGrid() {
        return customTransactionInfoGrid;
    }

    /**
     * Sets the value of the customTransactionInfoGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomTransactionInfoGrid }{@code >}
     *     
     */
    public void setCustomTransactionInfoGrid(JAXBElement<CustomTransactionInfoGrid> value) {
        this.customTransactionInfoGrid = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public JAXBElement<Customer> getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public void setCustomer(JAXBElement<Customer> value) {
        this.customer = value;
    }

    /**
     * Gets the value of the customerGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerGroup }{@code >}
     *     
     */
    public JAXBElement<CustomerGroup> getCustomerGroup() {
        return customerGroup;
    }

    /**
     * Sets the value of the customerGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerGroup }{@code >}
     *     
     */
    public void setCustomerGroup(JAXBElement<CustomerGroup> value) {
        this.customerGroup = value;
    }

    /**
     * Gets the value of the deliveryPackage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeliveryPackage }{@code >}
     *     
     */
    public JAXBElement<DeliveryPackage> getDeliveryPackage() {
        return deliveryPackage;
    }

    /**
     * Sets the value of the deliveryPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeliveryPackage }{@code >}
     *     
     */
    public void setDeliveryPackage(JAXBElement<DeliveryPackage> value) {
        this.deliveryPackage = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Employee }{@code >}
     *     
     */
    public JAXBElement<Employee> getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Employee }{@code >}
     *     
     */
    public void setEmployee(JAXBElement<Employee> value) {
        this.employee = value;
    }

    /**
     * Gets the value of the enterprise property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Enterprise }{@code >}
     *     
     */
    public JAXBElement<Enterprise> getEnterprise() {
        return enterprise;
    }

    /**
     * Sets the value of the enterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Enterprise }{@code >}
     *     
     */
    public void setEnterprise(JAXBElement<Enterprise> value) {
        this.enterprise = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     *     
     */
    public JAXBElement<ExchangeRate> getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     *     
     */
    public void setExchangeRate(JAXBElement<ExchangeRate> value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the fulfillmentPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FulfillmentPlan }{@code >}
     *     
     */
    public JAXBElement<FulfillmentPlan> getFulfillmentPlan() {
        return fulfillmentPlan;
    }

    /**
     * Sets the value of the fulfillmentPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FulfillmentPlan }{@code >}
     *     
     */
    public void setFulfillmentPlan(JAXBElement<FulfillmentPlan> value) {
        this.fulfillmentPlan = value;
    }

    /**
     * Gets the value of the goodsIssue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GoodsIssue }{@code >}
     *     
     */
    public JAXBElement<GoodsIssue> getGoodsIssue() {
        return goodsIssue;
    }

    /**
     * Sets the value of the goodsIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GoodsIssue }{@code >}
     *     
     */
    public void setGoodsIssue(JAXBElement<GoodsIssue> value) {
        this.goodsIssue = value;
    }

    /**
     * Gets the value of the goodsReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GoodsReceipt }{@code >}
     *     
     */
    public JAXBElement<GoodsReceipt> getGoodsReceipt() {
        return goodsReceipt;
    }

    /**
     * Sets the value of the goodsReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GoodsReceipt }{@code >}
     *     
     */
    public void setGoodsReceipt(JAXBElement<GoodsReceipt> value) {
        this.goodsReceipt = value;
    }

    /**
     * Gets the value of the goodsReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GoodsReturn }{@code >}
     *     
     */
    public JAXBElement<GoodsReturn> getGoodsReturn() {
        return goodsReturn;
    }

    /**
     * Sets the value of the goodsReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GoodsReturn }{@code >}
     *     
     */
    public void setGoodsReturn(JAXBElement<GoodsReturn> value) {
        this.goodsReturn = value;
    }

    /**
     * Gets the value of the integrationKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntegrationKey() {
        return integrationKey;
    }

    /**
     * Sets the value of the integrationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntegrationKey(Long value) {
        this.integrationKey = value;
    }

    /**
     * Gets the value of the inventoryItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InventoryItem }{@code >}
     *     
     */
    public JAXBElement<InventoryItem> getInventoryItem() {
        return inventoryItem;
    }

    /**
     * Sets the value of the inventoryItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InventoryItem }{@code >}
     *     
     */
    public void setInventoryItem(JAXBElement<InventoryItem> value) {
        this.inventoryItem = value;
    }

    /**
     * Gets the value of the layawayPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LayawayPlan }{@code >}
     *     
     */
    public JAXBElement<LayawayPlan> getLayawayPlan() {
        return layawayPlan;
    }

    /**
     * Sets the value of the layawayPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LayawayPlan }{@code >}
     *     
     */
    public void setLayawayPlan(JAXBElement<LayawayPlan> value) {
        this.layawayPlan = value;
    }

    /**
     * Gets the value of the lineAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineAttribute }{@code >}
     *     
     */
    public JAXBElement<LineAttribute> getLineAttribute() {
        return lineAttribute;
    }

    /**
     * Sets the value of the lineAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineAttribute }{@code >}
     *     
     */
    public void setLineAttribute(JAXBElement<LineAttribute> value) {
        this.lineAttribute = value;
    }

    /**
     * Gets the value of the logDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLogDatetime() {
        return logDatetime;
    }

    /**
     * Sets the value of the logDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLogDatetime(XMLGregorianCalendar value) {
        this.logDatetime = value;
    }

    /**
     * Gets the value of the loyaltyCardInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoyaltyCardInformation }{@code >}
     *     
     */
    public JAXBElement<LoyaltyCardInformation> getLoyaltyCardInformation() {
        return loyaltyCardInformation;
    }

    /**
     * Sets the value of the loyaltyCardInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoyaltyCardInformation }{@code >}
     *     
     */
    public void setLoyaltyCardInformation(JAXBElement<LoyaltyCardInformation> value) {
        this.loyaltyCardInformation = value;
    }

    /**
     * Gets the value of the loyaltySetup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoyaltySetup }{@code >}
     *     
     */
    public JAXBElement<LoyaltySetup> getLoyaltySetup() {
        return loyaltySetup;
    }

    /**
     * Sets the value of the loyaltySetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoyaltySetup }{@code >}
     *     
     */
    public void setLoyaltySetup(JAXBElement<LoyaltySetup> value) {
        this.loyaltySetup = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}
     *     
     */
    public JAXBElement<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}
     *     
     */
    public void setManufacturer(JAXBElement<Manufacturer> value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setOperationType(OperationType value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POS }{@code >}
     *     
     */
    public JAXBElement<POS> getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POS }{@code >}
     *     
     */
    public void setPOS(JAXBElement<POS> value) {
        this.pos = value;
    }

    /**
     * Gets the value of the posNumberSeriesMaster property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumberSeriesMaster }{@code >}
     *     
     */
    public JAXBElement<NumberSeriesMaster> getPOSNumberSeriesMaster() {
        return posNumberSeriesMaster;
    }

    /**
     * Sets the value of the posNumberSeriesMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumberSeriesMaster }{@code >}
     *     
     */
    public void setPOSNumberSeriesMaster(JAXBElement<NumberSeriesMaster> value) {
        this.posNumberSeriesMaster = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaymentType }{@code >}
     *     
     */
    public JAXBElement<PaymentType> getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaymentType }{@code >}
     *     
     */
    public void setPaymentType(JAXBElement<PaymentType> value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriceList }{@code >}
     *     
     */
    public JAXBElement<PriceList> getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriceList }{@code >}
     *     
     */
    public void setPriceList(JAXBElement<PriceList> value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the priceMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriceMatrix }{@code >}
     *     
     */
    public JAXBElement<PriceMatrix> getPriceMatrix() {
        return priceMatrix;
    }

    /**
     * Sets the value of the priceMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriceMatrix }{@code >}
     *     
     */
    public void setPriceMatrix(JAXBElement<PriceMatrix> value) {
        this.priceMatrix = value;
    }

    /**
     * Gets the value of the priceUoMMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriceUOMMatrix }{@code >}
     *     
     */
    public JAXBElement<PriceUOMMatrix> getPriceUoMMatrix() {
        return priceUoMMatrix;
    }

    /**
     * Sets the value of the priceUoMMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriceUOMMatrix }{@code >}
     *     
     */
    public void setPriceUoMMatrix(JAXBElement<PriceUOMMatrix> value) {
        this.priceUoMMatrix = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     
     */
    public JAXBElement<Product> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     
     */
    public void setProduct(JAXBElement<Product> value) {
        this.product = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductCategory }{@code >}
     *     
     */
    public JAXBElement<ProductCategory> getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductCategory }{@code >}
     *     
     */
    public void setProductCategory(JAXBElement<ProductCategory> value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the productGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductGroup }{@code >}
     *     
     */
    public JAXBElement<ProductGroup> getProductGroup() {
        return productGroup;
    }

    /**
     * Sets the value of the productGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductGroup }{@code >}
     *     
     */
    public void setProductGroup(JAXBElement<ProductGroup> value) {
        this.productGroup = value;
    }

    /**
     * Gets the value of the productImage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductImage }{@code >}
     *     
     */
    public JAXBElement<ProductImage> getProductImage() {
        return productImage;
    }

    /**
     * Sets the value of the productImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductImage }{@code >}
     *     
     */
    public void setProductImage(JAXBElement<ProductImage> value) {
        this.productImage = value;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     *     
     */
    public JAXBElement<PurchaseOrder> getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Sets the value of the purchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     *     
     */
    public void setPurchaseOrder(JAXBElement<PurchaseOrder> value) {
        this.purchaseOrder = value;
    }

    /**
     * Gets the value of the retailProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetailProfile }{@code >}
     *     
     */
    public JAXBElement<RetailProfile> getRetailProfile() {
        return retailProfile;
    }

    /**
     * Sets the value of the retailProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetailProfile }{@code >}
     *     
     */
    public void setRetailProfile(JAXBElement<RetailProfile> value) {
        this.retailProfile = value;
    }

    /**
     * Gets the value of the saleAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaleAttribute }{@code >}
     *     
     */
    public JAXBElement<SaleAttribute> getSaleAttribute() {
        return saleAttribute;
    }

    /**
     * Sets the value of the saleAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaleAttribute }{@code >}
     *     
     */
    public void setSaleAttribute(JAXBElement<SaleAttribute> value) {
        this.saleAttribute = value;
    }

    /**
     * Gets the value of the securityRights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecurityRights }{@code >}
     *     
     */
    public JAXBElement<SecurityRights> getSecurityRights() {
        return securityRights;
    }

    /**
     * Sets the value of the securityRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecurityRights }{@code >}
     *     
     */
    public void setSecurityRights(JAXBElement<SecurityRights> value) {
        this.securityRights = value;
    }

    /**
     * Gets the value of the securityUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecurityUser }{@code >}
     *     
     */
    public JAXBElement<SecurityUser> getSecurityUser() {
        return securityUser;
    }

    /**
     * Sets the value of the securityUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecurityUser }{@code >}
     *     
     */
    public void setSecurityUser(JAXBElement<SecurityUser> value) {
        this.securityUser = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Serial }{@code >}
     *     
     */
    public JAXBElement<Serial> getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Serial }{@code >}
     *     
     */
    public void setSerial(JAXBElement<Serial> value) {
        this.serial = value;
    }

    /**
     * Gets the value of the shippingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShippingType }{@code >}
     *     
     */
    public JAXBElement<ShippingType> getShippingType() {
        return shippingType;
    }

    /**
     * Sets the value of the shippingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShippingType }{@code >}
     *     
     */
    public void setShippingType(JAXBElement<ShippingType> value) {
        this.shippingType = value;
    }

    /**
     * Gets the value of the sourceKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceKey() {
        return sourceKey;
    }

    /**
     * Sets the value of the sourceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceKey(Long value) {
        this.sourceKey = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link State }{@code >}
     *     
     */
    public JAXBElement<State> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link State }{@code >}
     *     
     */
    public void setState(JAXBElement<State> value) {
        this.state = value;
    }

    /**
     * Gets the value of the stockTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StockTransfer }{@code >}
     *     
     */
    public JAXBElement<StockTransfer> getStockTransfer() {
        return stockTransfer;
    }

    /**
     * Sets the value of the stockTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StockTransfer }{@code >}
     *     
     */
    public void setStockTransfer(JAXBElement<StockTransfer> value) {
        this.stockTransfer = value;
    }

    /**
     * Gets the value of the stockTransferRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StockTransferRequisition }{@code >}
     *     
     */
    public JAXBElement<StockTransferRequisition> getStockTransferRequest() {
        return stockTransferRequest;
    }

    /**
     * Sets the value of the stockTransferRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StockTransferRequisition }{@code >}
     *     
     */
    public void setStockTransferRequest(JAXBElement<StockTransferRequisition> value) {
        this.stockTransferRequest = value;
    }

    /**
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Store }{@code >}
     *     
     */
    public JAXBElement<Store> getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Store }{@code >}
     *     
     */
    public void setStore(JAXBElement<Store> value) {
        this.store = value;
    }

    /**
     * Gets the value of the storeExpense property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StoreExpense }{@code >}
     *     
     */
    public JAXBElement<StoreExpense> getStoreExpense() {
        return storeExpense;
    }

    /**
     * Sets the value of the storeExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StoreExpense }{@code >}
     *     
     */
    public void setStoreExpense(JAXBElement<StoreExpense> value) {
        this.storeExpense = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Surcharge }{@code >}
     *     
     */
    public JAXBElement<Surcharge> getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Surcharge }{@code >}
     *     
     */
    public void setSurcharge(JAXBElement<Surcharge> value) {
        this.surcharge = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     *     
     */
    public JAXBElement<TaxCode> getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     *     
     */
    public void setTaxCode(JAXBElement<TaxCode> value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the totalRecordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRecordCount() {
        return totalRecordCount;
    }

    /**
     * Sets the value of the totalRecordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRecordCount(Integer value) {
        this.totalRecordCount = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Transaction }{@code >}
     *     
     */
    public JAXBElement<Transaction> getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Transaction }{@code >}
     *     
     */
    public void setTransaction(JAXBElement<Transaction> value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UOM }{@code >}
     *     
     */
    public JAXBElement<UOM> getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UOM }{@code >}
     *     
     */
    public void setUOM(JAXBElement<UOM> value) {
        this.uom = value;
    }

    /**
     * Gets the value of the uomGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UOMGroup }{@code >}
     *     
     */
    public JAXBElement<UOMGroup> getUOMGroup() {
        return uomGroup;
    }

    /**
     * Sets the value of the uomGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UOMGroup }{@code >}
     *     
     */
    public void setUOMGroup(JAXBElement<UOMGroup> value) {
        this.uomGroup = value;
    }

    /**
     * Gets the value of the upcTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UPCTranslation }{@code >}
     *     
     */
    public JAXBElement<UPCTranslation> getUPCTranslation() {
        return upcTranslation;
    }

    /**
     * Sets the value of the upcTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UPCTranslation }{@code >}
     *     
     */
    public void setUPCTranslation(JAXBElement<UPCTranslation> value) {
        this.upcTranslation = value;
    }

    /**
     * Gets the value of the userDefinedFieldsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefinedFieldsDetails }{@code >}
     *     
     */
    public JAXBElement<UserDefinedFieldsDetails> getUserDefinedFieldsDetails() {
        return userDefinedFieldsDetails;
    }

    /**
     * Sets the value of the userDefinedFieldsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefinedFieldsDetails }{@code >}
     *     
     */
    public void setUserDefinedFieldsDetails(JAXBElement<UserDefinedFieldsDetails> value) {
        this.userDefinedFieldsDetails = value;
    }

    /**
     * Gets the value of the userDefinedFieldsValidValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefinedFieldsValidValue }{@code >}
     *     
     */
    public JAXBElement<UserDefinedFieldsValidValue> getUserDefinedFieldsValidValue() {
        return userDefinedFieldsValidValue;
    }

    /**
     * Sets the value of the userDefinedFieldsValidValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefinedFieldsValidValue }{@code >}
     *     
     */
    public void setUserDefinedFieldsValidValue(JAXBElement<UserDefinedFieldsValidValue> value) {
        this.userDefinedFieldsValidValue = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     
     */
    public JAXBElement<Vendor> getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     
     */
    public void setVendor(JAXBElement<Vendor> value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the warehouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Warehouse }{@code >}
     *     
     */
    public JAXBElement<Warehouse> getWarehouse() {
        return warehouse;
    }

    /**
     * Sets the value of the warehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Warehouse }{@code >}
     *     
     */
    public void setWarehouse(JAXBElement<Warehouse> value) {
        this.warehouse = value;
    }

}
