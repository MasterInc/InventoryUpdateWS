
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventSelection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventSelection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StartUp"/>
 *     &lt;enumeration value="EveryTransaction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventSelection", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum EventSelection {

    @XmlEnumValue("StartUp")
    START_UP("StartUp"),
    @XmlEnumValue("EveryTransaction")
    EVERY_TRANSACTION("EveryTransaction");
    private final String value;

    EventSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventSelection fromValue(String v) {
        for (EventSelection c: EventSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
