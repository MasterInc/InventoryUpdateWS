
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="BillingAddress"/>
 *     &lt;enumeration value="ShippingAddress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core")
@XmlEnum
public enum AddressType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("BillingAddress")
    BILLING_ADDRESS("BillingAddress"),
    @XmlEnumValue("ShippingAddress")
    SHIPPING_ADDRESS("ShippingAddress");
    private final String value;

    AddressType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressType fromValue(String v) {
        for (AddressType c: AddressType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
