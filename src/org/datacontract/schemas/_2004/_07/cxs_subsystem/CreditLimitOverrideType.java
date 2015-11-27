
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditLimitOverrideType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditLimitOverrideType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Allow"/>
 *     &lt;enumeration value="AllowWithManagerOverride"/>
 *     &lt;enumeration value="DontAllow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditLimitOverrideType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum CreditLimitOverrideType {

    @XmlEnumValue("Allow")
    ALLOW("Allow"),
    @XmlEnumValue("AllowWithManagerOverride")
    ALLOW_WITH_MANAGER_OVERRIDE("AllowWithManagerOverride"),
    @XmlEnumValue("DontAllow")
    DONT_ALLOW("DontAllow");
    private final String value;

    CreditLimitOverrideType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditLimitOverrideType fromValue(String v) {
        for (CreditLimitOverrideType c: CreditLimitOverrideType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
