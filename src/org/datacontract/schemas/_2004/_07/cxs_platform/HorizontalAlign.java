
package org.datacontract.schemas._2004._07.cxs_platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HorizontalAlign.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HorizontalAlign">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Left"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="Right"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HorizontalAlign", namespace = "http://schemas.datacontract.org/2004/07/CXS.Platform.Core")
@XmlEnum
public enum HorizontalAlign {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("Right")
    RIGHT("Right");
    private final String value;

    HorizontalAlign(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HorizontalAlign fromValue(String v) {
        for (HorizontalAlign c: HorizontalAlign.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
