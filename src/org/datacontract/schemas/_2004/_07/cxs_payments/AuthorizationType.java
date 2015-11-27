
package org.datacontract.schemas._2004._07.cxs_payments;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Authorize"/>
 *     &lt;enumeration value="Refund"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthorizationType", namespace = "http://schemas.datacontract.org/2004/07/CXS.Payments.Core")
@XmlEnum
public enum AuthorizationType {

    @XmlEnumValue("Authorize")
    AUTHORIZE("Authorize"),
    @XmlEnumValue("Refund")
    REFUND("Refund");
    private final String value;

    AuthorizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorizationType fromValue(String v) {
        for (AuthorizationType c: AuthorizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
