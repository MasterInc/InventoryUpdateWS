
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentDetailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="GiftCertificate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentDetailType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core")
@XmlEnum
public enum PaymentDetailType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("GiftCertificate")
    GIFT_CERTIFICATE("GiftCertificate");
    private final String value;

    PaymentDetailType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentDetailType fromValue(String v) {
        for (PaymentDetailType c: PaymentDetailType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
