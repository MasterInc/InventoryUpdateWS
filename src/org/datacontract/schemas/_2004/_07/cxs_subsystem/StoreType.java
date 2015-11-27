
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RetailStore"/>
 *     &lt;enumeration value="eCommerceStore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StoreType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core")
@XmlEnum
public enum StoreType {

    @XmlEnumValue("RetailStore")
    RETAIL_STORE("RetailStore"),
    @XmlEnumValue("eCommerceStore")
    E_COMMERCE_STORE("eCommerceStore");
    private final String value;

    StoreType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreType fromValue(String v) {
        for (StoreType c: StoreType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
