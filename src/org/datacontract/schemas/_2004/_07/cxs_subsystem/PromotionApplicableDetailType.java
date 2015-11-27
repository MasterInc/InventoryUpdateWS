
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionApplicableDetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionApplicableDetailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Store"/>
 *     &lt;enumeration value="StoreGroup"/>
 *     &lt;enumeration value="LoyaltySlab"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionApplicableDetailType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Promotion")
@XmlEnum
public enum PromotionApplicableDetailType {

    @XmlEnumValue("Store")
    STORE("Store"),
    @XmlEnumValue("StoreGroup")
    STORE_GROUP("StoreGroup"),
    @XmlEnumValue("LoyaltySlab")
    LOYALTY_SLAB("LoyaltySlab");
    private final String value;

    PromotionApplicableDetailType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionApplicableDetailType fromValue(String v) {
        for (PromotionApplicableDetailType c: PromotionApplicableDetailType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
