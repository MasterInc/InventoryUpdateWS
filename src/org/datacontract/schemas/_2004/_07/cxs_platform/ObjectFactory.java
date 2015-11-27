
package org.datacontract.schemas._2004._07.cxs_platform;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.cxs_platform package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RoundingType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects", "RoundingType");
    private final static QName _DiscountType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects", "DiscountType");
    private final static QName _AmountType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects", "AmountType");
    private final static QName _KeyBoardMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects", "KeyBoardMode");
    private final static QName _MoneyRoundingMethodType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects", "Money.RoundingMethodType");
    private final static QName _HorizontalAlign_QNAME = new QName("http://schemas.datacontract.org/2004/07/CXS.Platform.Core", "HorizontalAlign");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.cxs_platform
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoundingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects", name = "RoundingType")
    public JAXBElement<RoundingType> createRoundingType(RoundingType value) {
        return new JAXBElement<RoundingType>(_RoundingType_QNAME, RoundingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects", name = "DiscountType")
    public JAXBElement<DiscountType> createDiscountType(DiscountType value) {
        return new JAXBElement<DiscountType>(_DiscountType_QNAME, DiscountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects", name = "AmountType")
    public JAXBElement<AmountType> createAmountType(AmountType value) {
        return new JAXBElement<AmountType>(_AmountType_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyBoardMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects", name = "KeyBoardMode")
    public JAXBElement<KeyBoardMode> createKeyBoardMode(KeyBoardMode value) {
        return new JAXBElement<KeyBoardMode>(_KeyBoardMode_QNAME, KeyBoardMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyRoundingMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects", name = "Money.RoundingMethodType")
    public JAXBElement<MoneyRoundingMethodType> createMoneyRoundingMethodType(MoneyRoundingMethodType value) {
        return new JAXBElement<MoneyRoundingMethodType>(_MoneyRoundingMethodType_QNAME, MoneyRoundingMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HorizontalAlign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CXS.Platform.Core", name = "HorizontalAlign")
    public JAXBElement<HorizontalAlign> createHorizontalAlign(HorizontalAlign value) {
        return new JAXBElement<HorizontalAlign>(_HorizontalAlign_QNAME, HorizontalAlign.class, null, value);
    }

}
