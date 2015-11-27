
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostingSubMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostingSubMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="PerProduct"/>
 *     &lt;enumeration value="PerProductWarehouse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CostingSubMethod", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory")
@XmlEnum
public enum CostingSubMethod {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("PerProduct")
    PER_PRODUCT("PerProduct"),
    @XmlEnumValue("PerProductWarehouse")
    PER_PRODUCT_WAREHOUSE("PerProductWarehouse");
    private final String value;

    CostingSubMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CostingSubMethod fromValue(String v) {
        for (CostingSubMethod c: CostingSubMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
