
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionEntryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionEntryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="SaleRefund"/>
 *     &lt;enumeration value="SaleExchange"/>
 *     &lt;enumeration value="SpecialOrder"/>
 *     &lt;enumeration value="Layaway"/>
 *     &lt;enumeration value="OnAccountPayment"/>
 *     &lt;enumeration value="SpecialOrderEdit"/>
 *     &lt;enumeration value="DeliveryAgainstSpecialOrder"/>
 *     &lt;enumeration value="DeliveryAgainstSale"/>
 *     &lt;enumeration value="DeliveryAgainstLayaway"/>
 *     &lt;enumeration value="LayawayCancellation"/>
 *     &lt;enumeration value="Quotation"/>
 *     &lt;enumeration value="GiftCertificate"/>
 *     &lt;enumeration value="Coupon"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionEntryType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig")
@XmlEnum
public enum TransactionEntryType {

    @XmlEnumValue("Sale")
    SALE("Sale"),
    @XmlEnumValue("SaleRefund")
    SALE_REFUND("SaleRefund"),
    @XmlEnumValue("SaleExchange")
    SALE_EXCHANGE("SaleExchange"),
    @XmlEnumValue("SpecialOrder")
    SPECIAL_ORDER("SpecialOrder"),
    @XmlEnumValue("Layaway")
    LAYAWAY("Layaway"),
    @XmlEnumValue("OnAccountPayment")
    ON_ACCOUNT_PAYMENT("OnAccountPayment"),
    @XmlEnumValue("SpecialOrderEdit")
    SPECIAL_ORDER_EDIT("SpecialOrderEdit"),
    @XmlEnumValue("DeliveryAgainstSpecialOrder")
    DELIVERY_AGAINST_SPECIAL_ORDER("DeliveryAgainstSpecialOrder"),
    @XmlEnumValue("DeliveryAgainstSale")
    DELIVERY_AGAINST_SALE("DeliveryAgainstSale"),
    @XmlEnumValue("DeliveryAgainstLayaway")
    DELIVERY_AGAINST_LAYAWAY("DeliveryAgainstLayaway"),
    @XmlEnumValue("LayawayCancellation")
    LAYAWAY_CANCELLATION("LayawayCancellation"),
    @XmlEnumValue("Quotation")
    QUOTATION("Quotation"),
    @XmlEnumValue("GiftCertificate")
    GIFT_CERTIFICATE("GiftCertificate"),
    @XmlEnumValue("Coupon")
    COUPON("Coupon");
    private final String value;

    TransactionEntryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionEntryType fromValue(String v) {
        for (TransactionEntryType c: TransactionEntryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
