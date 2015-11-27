
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurchargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurchargeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Freight"/>
 *     &lt;enumeration value="Deposit"/>
 *     &lt;enumeration value="LateFees"/>
 *     &lt;enumeration value="Cancellation"/>
 *     &lt;enumeration value="Reschedule"/>
 *     &lt;enumeration value="Others"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurchargeType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core")
@XmlEnum
public enum SurchargeType {

    @XmlEnumValue("Freight")
    FREIGHT("Freight"),
    @XmlEnumValue("Deposit")
    DEPOSIT("Deposit"),
    @XmlEnumValue("LateFees")
    LATE_FEES("LateFees"),
    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("Reschedule")
    RESCHEDULE("Reschedule"),
    @XmlEnumValue("Others")
    OTHERS("Others");
    private final String value;

    SurchargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurchargeType fromValue(String v) {
        for (SurchargeType c: SurchargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
