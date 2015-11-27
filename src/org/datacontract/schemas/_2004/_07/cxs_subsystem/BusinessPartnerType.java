
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessPartnerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessPartnerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Customer"/>
 *     &lt;enumeration value="Vendor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessPartnerType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum BusinessPartnerType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor");
    private final String value;

    BusinessPartnerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessPartnerType fromValue(String v) {
        for (BusinessPartnerType c: BusinessPartnerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
