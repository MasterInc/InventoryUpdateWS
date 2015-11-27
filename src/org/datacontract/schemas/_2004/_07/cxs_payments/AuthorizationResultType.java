
package org.datacontract.schemas._2004._07.cxs_payments;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizationResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorizationResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Offline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthorizationResultType", namespace = "http://schemas.datacontract.org/2004/07/CXS.Payments.Core")
@XmlEnum
public enum AuthorizationResultType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Offline")
    OFFLINE("Offline");
    private final String value;

    AuthorizationResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorizationResultType fromValue(String v) {
        for (AuthorizationResultType c: AuthorizationResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
