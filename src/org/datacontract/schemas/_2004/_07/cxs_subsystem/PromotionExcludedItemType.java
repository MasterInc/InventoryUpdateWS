
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionExcludedItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionExcludedItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="ProductGroup"/>
 *     &lt;enumeration value="ProductCategory"/>
 *     &lt;enumeration value="CustomerGroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionExcludedItemType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Promotion")
@XmlEnum
public enum PromotionExcludedItemType {

    @XmlEnumValue("Product")
    PRODUCT("Product"),
    @XmlEnumValue("ProductGroup")
    PRODUCT_GROUP("ProductGroup"),
    @XmlEnumValue("ProductCategory")
    PRODUCT_CATEGORY("ProductCategory"),
    @XmlEnumValue("CustomerGroup")
    CUSTOMER_GROUP("CustomerGroup");
    private final String value;

    PromotionExcludedItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionExcludedItemType fromValue(String v) {
        for (PromotionExcludedItemType c: PromotionExcludedItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
