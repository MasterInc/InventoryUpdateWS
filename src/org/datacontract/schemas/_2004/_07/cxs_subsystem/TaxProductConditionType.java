
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxProductConditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxProductConditionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="ProductClass"/>
 *     &lt;enumeration value="ProductGroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxProductConditionType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum TaxProductConditionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Product")
    PRODUCT("Product"),
    @XmlEnumValue("ProductClass")
    PRODUCT_CLASS("ProductClass"),
    @XmlEnumValue("ProductGroup")
    PRODUCT_GROUP("ProductGroup");
    private final String value;

    TaxProductConditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxProductConditionType fromValue(String v) {
        for (TaxProductConditionType c: TaxProductConditionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
