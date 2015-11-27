
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoSelectSerialBatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoSelectSerialBatchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="ExpiryDate"/>
 *     &lt;enumeration value="LowestPriceFirst"/>
 *     &lt;enumeration value="HighestPriceFirst"/>
 *     &lt;enumeration value="CreationDate"/>
 *     &lt;enumeration value="OnlyIfOneAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AutoSelectSerialBatchType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum AutoSelectSerialBatchType {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("ExpiryDate")
    EXPIRY_DATE("ExpiryDate"),
    @XmlEnumValue("LowestPriceFirst")
    LOWEST_PRICE_FIRST("LowestPriceFirst"),
    @XmlEnumValue("HighestPriceFirst")
    HIGHEST_PRICE_FIRST("HighestPriceFirst"),
    @XmlEnumValue("CreationDate")
    CREATION_DATE("CreationDate"),
    @XmlEnumValue("OnlyIfOneAvailable")
    ONLY_IF_ONE_AVAILABLE("OnlyIfOneAvailable");
    private final String value;

    AutoSelectSerialBatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoSelectSerialBatchType fromValue(String v) {
        for (AutoSelectSerialBatchType c: AutoSelectSerialBatchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
