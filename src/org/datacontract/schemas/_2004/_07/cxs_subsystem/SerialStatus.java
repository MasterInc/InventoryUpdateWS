
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SerialStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SerialStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotAvailable"/>
 *     &lt;enumeration value="InStore"/>
 *     &lt;enumeration value="Sold"/>
 *     &lt;enumeration value="OnRent"/>
 *     &lt;enumeration value="OnLayaway"/>
 *     &lt;enumeration value="Lost"/>
 *     &lt;enumeration value="Reserved"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SerialStatus", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum SerialStatus {

    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    @XmlEnumValue("InStore")
    IN_STORE("InStore"),
    @XmlEnumValue("Sold")
    SOLD("Sold"),
    @XmlEnumValue("OnRent")
    ON_RENT("OnRent"),
    @XmlEnumValue("OnLayaway")
    ON_LAYAWAY("OnLayaway"),
    @XmlEnumValue("Lost")
    LOST("Lost"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved");
    private final String value;

    SerialStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SerialStatus fromValue(String v) {
        for (SerialStatus c: SerialStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
