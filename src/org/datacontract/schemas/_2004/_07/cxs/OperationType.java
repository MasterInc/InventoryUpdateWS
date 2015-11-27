
package org.datacontract.schemas._2004._07.cxs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="SoftDelete"/>
 *     &lt;enumeration value="HardDelete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationType", namespace = "http://schemas.datacontract.org/2004/07/CXS.Retail")
@XmlEnum
public enum OperationType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("SoftDelete")
    SOFT_DELETE("SoftDelete"),
    @XmlEnumValue("HardDelete")
    HARD_DELETE("HardDelete");
    private final String value;

    OperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationType fromValue(String v) {
        for (OperationType c: OperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
