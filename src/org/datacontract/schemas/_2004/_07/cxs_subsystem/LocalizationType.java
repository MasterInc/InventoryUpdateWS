
package org.datacontract.schemas._2004._07.cxs_subsystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="AUSTRALIA"/>
 *     &lt;enumeration value="AUSTRIA"/>
 *     &lt;enumeration value="BELGIUM"/>
 *     &lt;enumeration value="BRAZIL"/>
 *     &lt;enumeration value="CANADA"/>
 *     &lt;enumeration value="CHILE"/>
 *     &lt;enumeration value="CHINA"/>
 *     &lt;enumeration value="COSTARICA"/>
 *     &lt;enumeration value="CYPRUS"/>
 *     &lt;enumeration value="CZECHREPUBLIC"/>
 *     &lt;enumeration value="DENMARK"/>
 *     &lt;enumeration value="DOMINICAN_REPUBLIC"/>
 *     &lt;enumeration value="ECUADOR"/>
 *     &lt;enumeration value="FINLAND"/>
 *     &lt;enumeration value="FRANCE"/>
 *     &lt;enumeration value="GERMANY"/>
 *     &lt;enumeration value="GUATEMALA"/>
 *     &lt;enumeration value="HUNGARY"/>
 *     &lt;enumeration value="INDIA"/>
 *     &lt;enumeration value="ISRAEL"/>
 *     &lt;enumeration value="ITALY"/>
 *     &lt;enumeration value="JAPAN"/>
 *     &lt;enumeration value="KOREA"/>
 *     &lt;enumeration value="MEXICO"/>
 *     &lt;enumeration value="NETHERLANDS"/>
 *     &lt;enumeration value="NEWZEALAND"/>
 *     &lt;enumeration value="NORWAY"/>
 *     &lt;enumeration value="PANAMA"/>
 *     &lt;enumeration value="POLAND"/>
 *     &lt;enumeration value="RUSSIA"/>
 *     &lt;enumeration value="SINGAPORE"/>
 *     &lt;enumeration value="SLOVAKIA"/>
 *     &lt;enumeration value="SOUTHAFRICA"/>
 *     &lt;enumeration value="SPAIN"/>
 *     &lt;enumeration value="SWEDEN"/>
 *     &lt;enumeration value="SWITZERLAND"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="USA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocalizationType", namespace = "http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core")
@XmlEnum
public enum LocalizationType {

    @XmlEnumValue("None")
    NONE("None"),
    AUSTRALIA("AUSTRALIA"),
    AUSTRIA("AUSTRIA"),
    BELGIUM("BELGIUM"),
    BRAZIL("BRAZIL"),
    CANADA("CANADA"),
    CHILE("CHILE"),
    CHINA("CHINA"),
    COSTARICA("COSTARICA"),
    CYPRUS("CYPRUS"),
    CZECHREPUBLIC("CZECHREPUBLIC"),
    DENMARK("DENMARK"),
    DOMINICAN_REPUBLIC("DOMINICAN_REPUBLIC"),
    ECUADOR("ECUADOR"),
    FINLAND("FINLAND"),
    FRANCE("FRANCE"),
    GERMANY("GERMANY"),
    GUATEMALA("GUATEMALA"),
    HUNGARY("HUNGARY"),
    INDIA("INDIA"),
    ISRAEL("ISRAEL"),
    ITALY("ITALY"),
    JAPAN("JAPAN"),
    KOREA("KOREA"),
    MEXICO("MEXICO"),
    NETHERLANDS("NETHERLANDS"),
    NEWZEALAND("NEWZEALAND"),
    NORWAY("NORWAY"),
    PANAMA("PANAMA"),
    POLAND("POLAND"),
    RUSSIA("RUSSIA"),
    SINGAPORE("SINGAPORE"),
    SLOVAKIA("SLOVAKIA"),
    SOUTHAFRICA("SOUTHAFRICA"),
    SPAIN("SPAIN"),
    SWEDEN("SWEDEN"),
    SWITZERLAND("SWITZERLAND"),
    UK("UK"),
    USA("USA");
    private final String value;

    LocalizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalizationType fromValue(String v) {
        for (LocalizationType c: LocalizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
