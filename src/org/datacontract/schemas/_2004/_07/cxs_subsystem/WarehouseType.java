
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarehouseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarehouseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Retail"/>
 *     &lt;enumeration value="InTransit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WarehouseType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum WarehouseType {

    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Retail")
    RETAIL("Retail"),
    @XmlEnumValue("InTransit")
    IN_TRANSIT("InTransit");
    private final String value;

    WarehouseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarehouseType fromValue(String v) {
        for (WarehouseType c: WarehouseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
