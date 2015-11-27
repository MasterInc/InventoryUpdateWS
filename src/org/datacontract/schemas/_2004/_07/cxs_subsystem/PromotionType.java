
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BonusBuys"/>
 *     &lt;enumeration value="FixedPrice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Promotion")
@XmlEnum
public enum PromotionType {

    @XmlEnumValue("BonusBuys")
    BONUS_BUYS("BonusBuys"),
    @XmlEnumValue("FixedPrice")
    FIXED_PRICE("FixedPrice");
    private final String value;

    PromotionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionType fromValue(String v) {
        for (PromotionType c: PromotionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
