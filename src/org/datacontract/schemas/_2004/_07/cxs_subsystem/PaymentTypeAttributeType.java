
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTypeAttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Numeric"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="Boolean"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentTypeAttributeType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Payment")
@XmlEnum
public enum PaymentTypeAttributeType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean");
    private final String value;

    PaymentTypeAttributeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTypeAttributeType fromValue(String v) {
        for (PaymentTypeAttributeType c: PaymentTypeAttributeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
