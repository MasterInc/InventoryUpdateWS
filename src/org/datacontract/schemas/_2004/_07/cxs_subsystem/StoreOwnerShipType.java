
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreOwnerShipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreOwnerShipType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CompanyOwnedCompanyOperated"/>
 *     &lt;enumeration value="CompanyOwnedDistributorOperated"/>
 *     &lt;enumeration value="DistributorOwnedDistributorOperated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StoreOwnerShipType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Security")
@XmlEnum
public enum StoreOwnerShipType {

    @XmlEnumValue("CompanyOwnedCompanyOperated")
    COMPANY_OWNED_COMPANY_OPERATED("CompanyOwnedCompanyOperated"),
    @XmlEnumValue("CompanyOwnedDistributorOperated")
    COMPANY_OWNED_DISTRIBUTOR_OPERATED("CompanyOwnedDistributorOperated"),
    @XmlEnumValue("DistributorOwnedDistributorOperated")
    DISTRIBUTOR_OWNED_DISTRIBUTOR_OPERATED("DistributorOwnedDistributorOperated");
    private final String value;

    StoreOwnerShipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreOwnerShipType fromValue(String v) {
        for (StoreOwnerShipType c: StoreOwnerShipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
