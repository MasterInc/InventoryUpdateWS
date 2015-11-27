
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionBuySource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionBuySource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="ProductGroup"/>
 *     &lt;enumeration value="ProductCategory"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionBuySource", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Promotion")
@XmlEnum
public enum PromotionBuySource {

    @XmlEnumValue("Product")
    PRODUCT("Product"),
    @XmlEnumValue("ProductGroup")
    PRODUCT_GROUP("ProductGroup"),
    @XmlEnumValue("ProductCategory")
    PRODUCT_CATEGORY("ProductCategory"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    PromotionBuySource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionBuySource fromValue(String v) {
        for (PromotionBuySource c: PromotionBuySource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
