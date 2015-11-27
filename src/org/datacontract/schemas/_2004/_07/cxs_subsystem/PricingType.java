
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BasedOnCustomer"/>
 *     &lt;enumeration value="BasedOnPriceList"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PricingType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Pricing")
@XmlEnum
public enum PricingType {

    @XmlEnumValue("BasedOnCustomer")
    BASED_ON_CUSTOMER("BasedOnCustomer"),
    @XmlEnumValue("BasedOnPriceList")
    BASED_ON_PRICE_LIST("BasedOnPriceList");
    private final String value;

    PricingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingType fromValue(String v) {
        for (PricingType c: PricingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
