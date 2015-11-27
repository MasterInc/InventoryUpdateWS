
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryTransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryTransactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GoodsIssue"/>
 *     &lt;enumeration value="InventoryReconciliation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryTransactionType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum InventoryTransactionType {

    @XmlEnumValue("GoodsIssue")
    GOODS_ISSUE("GoodsIssue"),
    @XmlEnumValue("InventoryReconciliation")
    INVENTORY_RECONCILIATION("InventoryReconciliation");
    private final String value;

    InventoryTransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryTransactionType fromValue(String v) {
        for (InventoryTransactionType c: InventoryTransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
