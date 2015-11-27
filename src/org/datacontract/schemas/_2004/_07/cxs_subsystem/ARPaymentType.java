
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARPaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ARPaymentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARPayment"/>
 *     &lt;enumeration value="SpecialOrder"/>
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="Layaway"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ARPaymentType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core")
@XmlEnum
public enum ARPaymentType {

    @XmlEnumValue("ARPayment")
    AR_PAYMENT("ARPayment"),
    @XmlEnumValue("SpecialOrder")
    SPECIAL_ORDER("SpecialOrder"),
    @XmlEnumValue("Sale")
    SALE("Sale"),
    @XmlEnumValue("Layaway")
    LAYAWAY("Layaway");
    private final String value;

    ARPaymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ARPaymentType fromValue(String v) {
        for (ARPaymentType c: ARPaymentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
