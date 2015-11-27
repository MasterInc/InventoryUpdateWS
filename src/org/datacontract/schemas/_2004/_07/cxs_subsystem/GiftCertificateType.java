
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftCertificateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GiftCertificateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="PrePrinted"/>
 *     &lt;enumeration value="SystemGenerated"/>
 *     &lt;enumeration value="UserDefined"/>
 *     &lt;enumeration value="Email"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GiftCertificateType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum GiftCertificateType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("PrePrinted")
    PRE_PRINTED("PrePrinted"),
    @XmlEnumValue("SystemGenerated")
    SYSTEM_GENERATED("SystemGenerated"),
    @XmlEnumValue("UserDefined")
    USER_DEFINED("UserDefined"),
    @XmlEnumValue("Email")
    EMAIL("Email");
    private final String value;

    GiftCertificateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GiftCertificateType fromValue(String v) {
        for (GiftCertificateType c: GiftCertificateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
