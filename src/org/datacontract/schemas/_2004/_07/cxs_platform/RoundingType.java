
package org.datacontract.schemas._2004._07.cxs_platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoundingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RoundUp"/>
 *     &lt;enumeration value="RoundDown"/>
 *     &lt;enumeration value="RoundToNearest"/>
 *     &lt;enumeration value="ToEven"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoundingType", namespace = "http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects")
@XmlEnum
public enum RoundingType {

    @XmlEnumValue("RoundUp")
    ROUND_UP("RoundUp"),
    @XmlEnumValue("RoundDown")
    ROUND_DOWN("RoundDown"),
    @XmlEnumValue("RoundToNearest")
    ROUND_TO_NEAREST("RoundToNearest"),
    @XmlEnumValue("ToEven")
    TO_EVEN("ToEven"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    RoundingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoundingType fromValue(String v) {
        for (RoundingType c: RoundingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
