
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodReceiptSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GoodReceiptSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="PurchaseOrder"/>
 *     &lt;enumeration value="StockTransfer"/>
 *     &lt;enumeration value="GiftCertificateReceipt"/>
 *     &lt;enumeration value="GiftCertificateStockTransfer"/>
 *     &lt;enumeration value="InventoryReconciliation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GoodReceiptSourceType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum GoodReceiptSourceType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("PurchaseOrder")
    PURCHASE_ORDER("PurchaseOrder"),
    @XmlEnumValue("StockTransfer")
    STOCK_TRANSFER("StockTransfer"),
    @XmlEnumValue("GiftCertificateReceipt")
    GIFT_CERTIFICATE_RECEIPT("GiftCertificateReceipt"),
    @XmlEnumValue("GiftCertificateStockTransfer")
    GIFT_CERTIFICATE_STOCK_TRANSFER("GiftCertificateStockTransfer"),
    @XmlEnumValue("InventoryReconciliation")
    INVENTORY_RECONCILIATION("InventoryReconciliation");
    private final String value;

    GoodReceiptSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GoodReceiptSourceType fromValue(String v) {
        for (GoodReceiptSourceType c: GoodReceiptSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
