
package org.datacontract.schemas._2004._07.cxs_retail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="Customer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectType", namespace = "http://schemas.datacontract.org/2004/07/CXS.Retail.DTO")
@XmlEnum
public enum ObjectType {

    @XmlEnumValue("Product")
    PRODUCT("Product"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer");
    private final String value;

    ObjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectType fromValue(String v) {
        for (ObjectType c: ObjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
