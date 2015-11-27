
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxConditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxConditionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ShipTo_Zip"/>
 *     &lt;enumeration value="ShipTo_City"/>
 *     &lt;enumeration value="ShipTo_County"/>
 *     &lt;enumeration value="ShipTo_State"/>
 *     &lt;enumeration value="ShipTo_Country"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxConditionType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum TaxConditionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ShipTo_Zip")
    SHIP_TO_ZIP("ShipTo_Zip"),
    @XmlEnumValue("ShipTo_City")
    SHIP_TO_CITY("ShipTo_City"),
    @XmlEnumValue("ShipTo_County")
    SHIP_TO_COUNTY("ShipTo_County"),
    @XmlEnumValue("ShipTo_State")
    SHIP_TO_STATE("ShipTo_State"),
    @XmlEnumValue("ShipTo_Country")
    SHIP_TO_COUNTRY("ShipTo_Country");
    private final String value;

    TaxConditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxConditionType fromValue(String v) {
        for (TaxConditionType c: TaxConditionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
