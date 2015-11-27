
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ERPSystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ERPSystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="iVendUnplugged"/>
 *     &lt;enumeration value="SAPBusinessOne"/>
 *     &lt;enumeration value="OthersWithAPI"/>
 *     &lt;enumeration value="SAPBusinessOneStartPack"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ERPSystemType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core")
@XmlEnum
public enum ERPSystemType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("iVendUnplugged")
    I_VEND_UNPLUGGED("iVendUnplugged"),
    @XmlEnumValue("SAPBusinessOne")
    SAP_BUSINESS_ONE("SAPBusinessOne"),
    @XmlEnumValue("OthersWithAPI")
    OTHERS_WITH_API("OthersWithAPI"),
    @XmlEnumValue("SAPBusinessOneStartPack")
    SAP_BUSINESS_ONE_START_PACK("SAPBusinessOneStartPack");
    private final String value;

    ERPSystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ERPSystemType fromValue(String v) {
        for (ERPSystemType c: ERPSystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
