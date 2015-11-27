
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="AverageCost"/>
 *     &lt;enumeration value="StandardCost"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CostingMethod", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum CostingMethod {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("AverageCost")
    AVERAGE_COST("AverageCost"),
    @XmlEnumValue("StandardCost")
    STANDARD_COST("StandardCost");
    private final String value;

    CostingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CostingMethod fromValue(String v) {
        for (CostingMethod c: CostingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
