
package org.datacontract.schemas._2004._07.cxs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.cxs package. 
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

    private final static QName _RetailObjectId_QNAME = new QName("http://schemas.datacontract.org/2004/07/CXS.Retail", "RetailObjectId");
    private final static QName _OperationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CXS.Retail", "OperationType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.cxs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CXS.Retail", name = "RetailObjectId")
    public JAXBElement<String> createRetailObjectId(String value) {
        return new JAXBElement<String>(_RetailObjectId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CXS.Retail", name = "OperationType")
    public JAXBElement<OperationType> createOperationType(OperationType value) {
        return new JAXBElement<OperationType>(_OperationType_QNAME, OperationType.class, null, value);
    }

}
