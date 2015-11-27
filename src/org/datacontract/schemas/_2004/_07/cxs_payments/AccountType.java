
package org.datacontract.schemas._2004._07.cxs_payments;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Others"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="Amex"/>
 *     &lt;enumeration value="DinersClub"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="JCB"/>
 *     &lt;enumeration value="CartBlance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountType", namespace = "http://schemas.datacontract.org/2004/07/CXS.Payments.Core")
@XmlEnum
public enum AccountType {

    @XmlEnumValue("Others")
    OTHERS("Others"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("Visa")
    VISA("Visa"),
    @XmlEnumValue("Amex")
    AMEX("Amex"),
    @XmlEnumValue("DinersClub")
    DINERS_CLUB("DinersClub"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    JCB("JCB"),
    @XmlEnumValue("CartBlance")
    CART_BLANCE("CartBlance");
    private final String value;

    AccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountType fromValue(String v) {
        for (AccountType c: AccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
