
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Input"/>
 *     &lt;enumeration value="Output"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Tax")
@XmlEnum
public enum TaxType {

    @XmlEnumValue("Input")
    INPUT("Input"),
    @XmlEnumValue("Output")
    OUTPUT("Output"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TaxType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxType fromValue(String v) {
        for (TaxType c: TaxType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
