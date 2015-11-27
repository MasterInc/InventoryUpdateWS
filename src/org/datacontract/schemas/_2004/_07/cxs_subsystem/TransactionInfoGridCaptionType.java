
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionInfoGridCaptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionInfoGridCaptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Code"/>
 *     &lt;enumeration value="Description"/>
 *     &lt;enumeration value="ShortDescription"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionInfoGridCaptionType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum TransactionInfoGridCaptionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Code")
    CODE("Code"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("ShortDescription")
    SHORT_DESCRIPTION("ShortDescription");
    private final String value;

    TransactionInfoGridCaptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionInfoGridCaptionType fromValue(String v) {
        for (TransactionInfoGridCaptionType c: TransactionInfoGridCaptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
