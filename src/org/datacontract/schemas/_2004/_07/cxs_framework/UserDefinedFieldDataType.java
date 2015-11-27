
package org.datacontract.schemas._2004._07.cxs_framework;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDefinedFieldDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserDefinedFieldDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Numeric"/>
 *     &lt;enumeration value="Currency"/>
 *     &lt;enumeration value="Decimal"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="ValidValues"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserDefinedFieldDataType", namespace = "http://schemas.datacontract.org/2004/07/CXS.Framework.Core")
@XmlEnum
public enum UserDefinedFieldDataType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("ValidValues")
    VALID_VALUES("ValidValues");
    private final String value;

    UserDefinedFieldDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserDefinedFieldDataType fromValue(String v) {
        for (UserDefinedFieldDataType c: UserDefinedFieldDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
