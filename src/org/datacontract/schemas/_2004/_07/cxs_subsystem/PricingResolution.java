
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingResolution.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingResolution">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ResolvedToLowest"/>
 *     &lt;enumeration value="ResolvedToHighest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PricingResolution", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum PricingResolution {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ResolvedToLowest")
    RESOLVED_TO_LOWEST("ResolvedToLowest"),
    @XmlEnumValue("ResolvedToHighest")
    RESOLVED_TO_HIGHEST("ResolvedToHighest");
    private final String value;

    PricingResolution(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingResolution fromValue(String v) {
        for (PricingResolution c: PricingResolution.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
