
package org.datacontract.schemas._2004._07.cxs_platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Amount"/>
 *     &lt;enumeration value="Percent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmountType", namespace = "http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects")
@XmlEnum
public enum AmountType {

    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("Percent")
    PERCENT("Percent");
    private final String value;

    AmountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountType fromValue(String v) {
        for (AmountType c: AmountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
