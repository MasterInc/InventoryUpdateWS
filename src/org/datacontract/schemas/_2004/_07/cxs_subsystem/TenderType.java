
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TenderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TenderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="DebitCard"/>
 *     &lt;enumeration value="GiftCertificate"/>
 *     &lt;enumeration value="OnAccount"/>
 *     &lt;enumeration value="Check"/>
 *     &lt;enumeration value="TravellersCheck"/>
 *     &lt;enumeration value="ForeignCurrency"/>
 *     &lt;enumeration value="Voucher"/>
 *     &lt;enumeration value="Loyalty"/>
 *     &lt;enumeration value="Custom"/>
 *     &lt;enumeration value="StoreCredit"/>
 *     &lt;enumeration value="ClubMembershipPayment"/>
 *     &lt;enumeration value="ClubMembershipRedeem"/>
 *     &lt;enumeration value="EBT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TenderType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Payment")
@XmlEnum
public enum TenderType {

    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("GiftCertificate")
    GIFT_CERTIFICATE("GiftCertificate"),
    @XmlEnumValue("OnAccount")
    ON_ACCOUNT("OnAccount"),
    @XmlEnumValue("Check")
    CHECK("Check"),
    @XmlEnumValue("TravellersCheck")
    TRAVELLERS_CHECK("TravellersCheck"),
    @XmlEnumValue("ForeignCurrency")
    FOREIGN_CURRENCY("ForeignCurrency"),
    @XmlEnumValue("Voucher")
    VOUCHER("Voucher"),
    @XmlEnumValue("Loyalty")
    LOYALTY("Loyalty"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom"),
    @XmlEnumValue("StoreCredit")
    STORE_CREDIT("StoreCredit"),
    @XmlEnumValue("ClubMembershipPayment")
    CLUB_MEMBERSHIP_PAYMENT("ClubMembershipPayment"),
    @XmlEnumValue("ClubMembershipRedeem")
    CLUB_MEMBERSHIP_REDEEM("ClubMembershipRedeem"),
    EBT("EBT");
    private final String value;

    TenderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TenderType fromValue(String v) {
        for (TenderType c: TenderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
