
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RollupIntervalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RollupIntervalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="RollupEveryDayAt"/>
 *     &lt;enumeration value="RollupAfterHours"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RollupIntervalType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum RollupIntervalType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("RollupEveryDayAt")
    ROLLUP_EVERY_DAY_AT("RollupEveryDayAt"),
    @XmlEnumValue("RollupAfterHours")
    ROLLUP_AFTER_HOURS("RollupAfterHours");
    private final String value;

    RollupIntervalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RollupIntervalType fromValue(String v) {
        for (RollupIntervalType c: RollupIntervalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
