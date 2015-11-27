
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionGetSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionGetSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="ProductGroup"/>
 *     &lt;enumeration value="ProductCategory"/>
 *     &lt;enumeration value="GiftCard"/>
 *     &lt;enumeration value="Coupon"/>
 *     &lt;enumeration value="LoyaltyPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionGetSource", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Promotion")
@XmlEnum
public enum PromotionGetSource {

    @XmlEnumValue("Product")
    PRODUCT("Product"),
    @XmlEnumValue("ProductGroup")
    PRODUCT_GROUP("ProductGroup"),
    @XmlEnumValue("ProductCategory")
    PRODUCT_CATEGORY("ProductCategory"),
    @XmlEnumValue("GiftCard")
    GIFT_CARD("GiftCard"),
    @XmlEnumValue("Coupon")
    COUPON("Coupon"),
    @XmlEnumValue("LoyaltyPoint")
    LOYALTY_POINT("LoyaltyPoint");
    private final String value;

    PromotionGetSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionGetSource fromValue(String v) {
        for (PromotionGetSource c: PromotionGetSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
