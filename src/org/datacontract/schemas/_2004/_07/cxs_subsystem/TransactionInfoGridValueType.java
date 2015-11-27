
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionInfoGridValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionInfoGridValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Exchange"/>
 *     &lt;enumeration value="Order"/>
 *     &lt;enumeration value="Layaway"/>
 *     &lt;enumeration value="Quotation"/>
 *     &lt;enumeration value="OnAccount"/>
 *     &lt;enumeration value="LostSale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionInfoGridValueType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum TransactionInfoGridValueType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Sale")
    SALE("Sale"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("Layaway")
    LAYAWAY("Layaway"),
    @XmlEnumValue("Quotation")
    QUOTATION("Quotation"),
    @XmlEnumValue("OnAccount")
    ON_ACCOUNT("OnAccount"),
    @XmlEnumValue("LostSale")
    LOST_SALE("LostSale");
    private final String value;

    TransactionInfoGridValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionInfoGridValueType fromValue(String v) {
        for (TransactionInfoGridValueType c: TransactionInfoGridValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
