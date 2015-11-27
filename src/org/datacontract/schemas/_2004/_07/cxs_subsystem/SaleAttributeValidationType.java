
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleAttributeValidationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SaleAttributeValidationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Table"/>
 *     &lt;enumeration value="ValidValues"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SaleAttributeValidationType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core")
@XmlEnum
public enum SaleAttributeValidationType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Table")
    TABLE("Table"),
    @XmlEnumValue("ValidValues")
    VALID_VALUES("ValidValues");
    private final String value;

    SaleAttributeValidationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SaleAttributeValidationType fromValue(String v) {
        for (SaleAttributeValidationType c: SaleAttributeValidationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
