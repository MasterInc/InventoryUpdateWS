
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionInfoGridSectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionInfoGridSectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Customer"/>
 *     &lt;enumeration value="LineItem"/>
 *     &lt;enumeration value="QuickButtonPanel"/>
 *     &lt;enumeration value="MatrixItem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionInfoGridSectionType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum TransactionInfoGridSectionType {

    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("LineItem")
    LINE_ITEM("LineItem"),
    @XmlEnumValue("QuickButtonPanel")
    QUICK_BUTTON_PANEL("QuickButtonPanel"),
    @XmlEnumValue("MatrixItem")
    MATRIX_ITEM("MatrixItem");
    private final String value;

    TransactionInfoGridSectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionInfoGridSectionType fromValue(String v) {
        for (TransactionInfoGridSectionType c: TransactionInfoGridSectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
