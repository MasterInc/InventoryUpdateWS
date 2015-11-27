
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxCustomerConditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxCustomerConditionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Customer"/>
 *     &lt;enumeration value="CustomerGroup"/>
 *     &lt;enumeration value="Vendor"/>
 *     &lt;enumeration value="VendorGroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxCustomerConditionType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum TaxCustomerConditionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("CustomerGroup")
    CUSTOMER_GROUP("CustomerGroup"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),
    @XmlEnumValue("VendorGroup")
    VENDOR_GROUP("VendorGroup");
    private final String value;

    TaxCustomerConditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxCustomerConditionType fromValue(String v) {
        for (TaxCustomerConditionType c: TaxCustomerConditionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
