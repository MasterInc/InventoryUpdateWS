
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Private"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanyType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core")
@XmlEnum
public enum CompanyType {

    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Private")
    PRIVATE("Private");
    private final String value;

    CompanyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyType fromValue(String v) {
        for (CompanyType c: CompanyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
