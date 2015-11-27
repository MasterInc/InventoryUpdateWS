
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockTransferRequestSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StockTransferRequestSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="MRP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StockTransferRequestSourceType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum StockTransferRequestSourceType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    MRP("MRP");
    private final String value;

    StockTransferRequestSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StockTransferRequestSourceType fromValue(String v) {
        for (StockTransferRequestSourceType c: StockTransferRequestSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
