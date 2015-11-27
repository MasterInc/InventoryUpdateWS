
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="TransactionItem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributeType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core")
@XmlEnum
public enum AttributeType {

    @XmlEnumValue("Sale")
    SALE("Sale"),
    @XmlEnumValue("TransactionItem")
    TRANSACTION_ITEM("TransactionItem");
    private final String value;

    AttributeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttributeType fromValue(String v) {
        for (AttributeType c: AttributeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
