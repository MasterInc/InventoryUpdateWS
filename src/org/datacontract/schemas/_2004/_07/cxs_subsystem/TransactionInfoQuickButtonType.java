
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionInfoQuickButtonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionInfoQuickButtonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="ProductGroup"/>
 *     &lt;enumeration value="ProductCategory"/>
 *     &lt;enumeration value="Custom"/>
 *     &lt;enumeration value="Blank"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionInfoQuickButtonType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum TransactionInfoQuickButtonType {

    @XmlEnumValue("Product")
    PRODUCT("Product"),
    @XmlEnumValue("ProductGroup")
    PRODUCT_GROUP("ProductGroup"),
    @XmlEnumValue("ProductCategory")
    PRODUCT_CATEGORY("ProductCategory"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom"),
    @XmlEnumValue("Blank")
    BLANK("Blank");
    private final String value;

    TransactionInfoQuickButtonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionInfoQuickButtonType fromValue(String v) {
        for (TransactionInfoQuickButtonType c: TransactionInfoQuickButtonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
