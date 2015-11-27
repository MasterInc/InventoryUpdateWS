
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="POSType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PCBased"/>
 *     &lt;enumeration value="Mobile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "POSType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum POSType {

    @XmlEnumValue("PCBased")
    PC_BASED("PCBased"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile");
    private final String value;

    POSType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static POSType fromValue(String v) {
        for (POSType c: POSType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
