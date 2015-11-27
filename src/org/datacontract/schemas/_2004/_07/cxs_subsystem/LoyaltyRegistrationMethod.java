
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyRegistrationMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoyaltyRegistrationMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CustomerCode"/>
 *     &lt;enumeration value="LoyaltyCard"/>
 *     &lt;enumeration value="LoyaltyCardAttachedToCustomerCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoyaltyRegistrationMethod", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Loyalty")
@XmlEnum
public enum LoyaltyRegistrationMethod {

    @XmlEnumValue("CustomerCode")
    CUSTOMER_CODE("CustomerCode"),
    @XmlEnumValue("LoyaltyCard")
    LOYALTY_CARD("LoyaltyCard"),
    @XmlEnumValue("LoyaltyCardAttachedToCustomerCode")
    LOYALTY_CARD_ATTACHED_TO_CUSTOMER_CODE("LoyaltyCardAttachedToCustomerCode");
    private final String value;

    LoyaltyRegistrationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoyaltyRegistrationMethod fromValue(String v) {
        for (LoyaltyRegistrationMethod c: LoyaltyRegistrationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
