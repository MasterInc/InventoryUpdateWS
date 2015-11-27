
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxWarehouseConditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxWarehouseConditionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Warehouse"/>
 *     &lt;enumeration value="StoreGroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxWarehouseConditionType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum TaxWarehouseConditionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Warehouse")
    WAREHOUSE("Warehouse"),
    @XmlEnumValue("StoreGroup")
    STORE_GROUP("StoreGroup");
    private final String value;

    TaxWarehouseConditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxWarehouseConditionType fromValue(String v) {
        for (TaxWarehouseConditionType c: TaxWarehouseConditionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
