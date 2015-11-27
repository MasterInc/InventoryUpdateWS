
package org.datacontract.schemas._2004._07.cxs_platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyBoardMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyBoardMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USBlockKeyBoard"/>
 *     &lt;enumeration value="USQwertyKeyBoard"/>
 *     &lt;enumeration value="AzertyKeyBoard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KeyBoardMode", namespace = "http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects")
@XmlEnum
public enum KeyBoardMode {

    @XmlEnumValue("USBlockKeyBoard")
    US_BLOCK_KEY_BOARD("USBlockKeyBoard"),
    @XmlEnumValue("USQwertyKeyBoard")
    US_QWERTY_KEY_BOARD("USQwertyKeyBoard"),
    @XmlEnumValue("AzertyKeyBoard")
    AZERTY_KEY_BOARD("AzertyKeyBoard");
    private final String value;

    KeyBoardMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyBoardMode fromValue(String v) {
        for (KeyBoardMode c: KeyBoardMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
