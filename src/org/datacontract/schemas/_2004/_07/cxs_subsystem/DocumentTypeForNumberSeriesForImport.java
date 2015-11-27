
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTypeForNumberSeriesForImport.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentTypeForNumberSeriesForImport">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PurchaseOrder"/>
 *     &lt;enumeration value="StockTransfer"/>
 *     &lt;enumeration value="GoodsReceipt"/>
 *     &lt;enumeration value="GoodsIssue"/>
 *     &lt;enumeration value="StockRequisition"/>
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Exchange"/>
 *     &lt;enumeration value="SpecialOrder"/>
 *     &lt;enumeration value="Quotation"/>
 *     &lt;enumeration value="ARPayment"/>
 *     &lt;enumeration value="Layaway"/>
 *     &lt;enumeration value="Delivery"/>
 *     &lt;enumeration value="GoodsReceiptPO"/>
 *     &lt;enumeration value="GoodsReceiptST"/>
 *     &lt;enumeration value="DefaultSeries"/>
 *     &lt;enumeration value="ARBill"/>
 *     &lt;enumeration value="GiftCertificate"/>
 *     &lt;enumeration value="LoyaltyCard"/>
 *     &lt;enumeration value="LoyaltyAdjustmentJournal"/>
 *     &lt;enumeration value="LoyaltyCardTransfer"/>
 *     &lt;enumeration value="DeliveryPackage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypeForNumberSeriesForImport", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum DocumentTypeForNumberSeriesForImport {

    @XmlEnumValue("PurchaseOrder")
    PURCHASE_ORDER("PurchaseOrder"),
    @XmlEnumValue("StockTransfer")
    STOCK_TRANSFER("StockTransfer"),
    @XmlEnumValue("GoodsReceipt")
    GOODS_RECEIPT("GoodsReceipt"),
    @XmlEnumValue("GoodsIssue")
    GOODS_ISSUE("GoodsIssue"),
    @XmlEnumValue("StockRequisition")
    STOCK_REQUISITION("StockRequisition"),
    @XmlEnumValue("Sale")
    SALE("Sale"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),
    @XmlEnumValue("SpecialOrder")
    SPECIAL_ORDER("SpecialOrder"),
    @XmlEnumValue("Quotation")
    QUOTATION("Quotation"),
    @XmlEnumValue("ARPayment")
    AR_PAYMENT("ARPayment"),
    @XmlEnumValue("Layaway")
    LAYAWAY("Layaway"),
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery"),
    @XmlEnumValue("GoodsReceiptPO")
    GOODS_RECEIPT_PO("GoodsReceiptPO"),
    @XmlEnumValue("GoodsReceiptST")
    GOODS_RECEIPT_ST("GoodsReceiptST"),
    @XmlEnumValue("DefaultSeries")
    DEFAULT_SERIES("DefaultSeries"),
    @XmlEnumValue("ARBill")
    AR_BILL("ARBill"),
    @XmlEnumValue("GiftCertificate")
    GIFT_CERTIFICATE("GiftCertificate"),
    @XmlEnumValue("LoyaltyCard")
    LOYALTY_CARD("LoyaltyCard"),
    @XmlEnumValue("LoyaltyAdjustmentJournal")
    LOYALTY_ADJUSTMENT_JOURNAL("LoyaltyAdjustmentJournal"),
    @XmlEnumValue("LoyaltyCardTransfer")
    LOYALTY_CARD_TRANSFER("LoyaltyCardTransfer"),
    @XmlEnumValue("DeliveryPackage")
    DELIVERY_PACKAGE("DeliveryPackage");
    private final String value;

    DocumentTypeForNumberSeriesForImport(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentTypeForNumberSeriesForImport fromValue(String v) {
        for (DocumentTypeForNumberSeriesForImport c: DocumentTypeForNumberSeriesForImport.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
