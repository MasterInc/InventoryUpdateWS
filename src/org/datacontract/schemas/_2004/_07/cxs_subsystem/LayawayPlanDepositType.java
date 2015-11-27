
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayawayPlanDepositType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LayawayPlanDepositType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Amount"/>
 *     &lt;enumeration value="Percentage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LayawayPlanDepositType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Payment")
@XmlEnum
public enum LayawayPlanDepositType {

    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("Percentage")
    PERCENTAGE("Percentage");
    private final String value;

    LayawayPlanDepositType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LayawayPlanDepositType fromValue(String v) {
        for (LayawayPlanDepositType c: LayawayPlanDepositType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
