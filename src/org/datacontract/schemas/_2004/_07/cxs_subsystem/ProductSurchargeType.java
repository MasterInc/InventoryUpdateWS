
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSurchargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductSurchargeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="Return"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductSurchargeType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum ProductSurchargeType {

    @XmlEnumValue("Sale")
    SALE("Sale"),
    @XmlEnumValue("Return")
    RETURN("Return");
    private final String value;

    ProductSurchargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductSurchargeType fromValue(String v) {
        for (ProductSurchargeType c: ProductSurchargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
