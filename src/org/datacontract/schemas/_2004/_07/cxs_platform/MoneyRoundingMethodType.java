
package org.datacontract.schemas._2004._07.cxs_platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Money.RoundingMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Money.RoundingMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoRounding"/>
 *     &lt;enumeration value="RoundToFiveHundredth"/>
 *     &lt;enumeration value="RoundToTenHundredth"/>
 *     &lt;enumeration value="RoundToOne"/>
 *     &lt;enumeration value="RoundToTen"/>
 *     &lt;enumeration value="RoundToFifty"/>
 *     &lt;enumeration value="RoundToHundred"/>
 *     &lt;enumeration value="RoundToThousand"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Money.RoundingMethodType", namespace = "http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects")
@XmlEnum
public enum MoneyRoundingMethodType {

    @XmlEnumValue("NoRounding")
    NO_ROUNDING("NoRounding"),
    @XmlEnumValue("RoundToFiveHundredth")
    ROUND_TO_FIVE_HUNDREDTH("RoundToFiveHundredth"),
    @XmlEnumValue("RoundToTenHundredth")
    ROUND_TO_TEN_HUNDREDTH("RoundToTenHundredth"),
    @XmlEnumValue("RoundToOne")
    ROUND_TO_ONE("RoundToOne"),
    @XmlEnumValue("RoundToTen")
    ROUND_TO_TEN("RoundToTen"),
    @XmlEnumValue("RoundToFifty")
    ROUND_TO_FIFTY("RoundToFifty"),
    @XmlEnumValue("RoundToHundred")
    ROUND_TO_HUNDRED("RoundToHundred"),
    @XmlEnumValue("RoundToThousand")
    ROUND_TO_THOUSAND("RoundToThousand");
    private final String value;

    MoneyRoundingMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MoneyRoundingMethodType fromValue(String v) {
        for (MoneyRoundingMethodType c: MoneyRoundingMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
