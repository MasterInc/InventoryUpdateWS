
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryAllocationMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryAllocationMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="Delivery"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryAllocationMethod", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core")
@XmlEnum
public enum InventoryAllocationMethod {

    @XmlEnumValue("Sale")
    SALE("Sale"),
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery");
    private final String value;

    InventoryAllocationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryAllocationMethod fromValue(String v) {
        for (InventoryAllocationMethod c: InventoryAllocationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
