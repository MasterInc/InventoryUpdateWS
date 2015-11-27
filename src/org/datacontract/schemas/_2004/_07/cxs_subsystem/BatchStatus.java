
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotAvailable"/>
 *     &lt;enumeration value="Available"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchStatus", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum BatchStatus {

    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    @XmlEnumValue("Available")
    AVAILABLE("Available");
    private final String value;

    BatchStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatchStatus fromValue(String v) {
        for (BatchStatus c: BatchStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
