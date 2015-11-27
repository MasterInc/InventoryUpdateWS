
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayawayPlanDurationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LayawayPlanDurationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Weekly"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Quarterly"/>
 *     &lt;enumeration value="Halfyearly"/>
 *     &lt;enumeration value="Yearly"/>
 *     &lt;enumeration value="Duration"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LayawayPlanDurationType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Payment")
@XmlEnum
public enum LayawayPlanDurationType {

    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Quarterly")
    QUARTERLY("Quarterly"),
    @XmlEnumValue("Halfyearly")
    HALFYEARLY("Halfyearly"),
    @XmlEnumValue("Yearly")
    YEARLY("Yearly"),
    @XmlEnumValue("Duration")
    DURATION("Duration");
    private final String value;

    LayawayPlanDurationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LayawayPlanDurationType fromValue(String v) {
        for (LayawayPlanDurationType c: LayawayPlanDurationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
