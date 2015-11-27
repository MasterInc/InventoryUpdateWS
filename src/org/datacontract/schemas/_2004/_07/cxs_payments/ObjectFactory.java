
package org.datacontract.schemas._2004._07.cxs_payments;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.cxs_payments package. 
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

    private final static QName _AccountType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CXS.Payments.Core", "AccountType");
    private final static QName _AuthorizationResultType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CXS.Payments.Core", "AuthorizationResultType");
    private final static QName _AuthorizationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CXS.Payments.Core", "AuthorizationType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.cxs_payments
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CXS.Payments.Core", name = "AccountType")
    public JAXBElement<AccountType> createAccountType(AccountType value) {
        return new JAXBElement<AccountType>(_AccountType_QNAME, AccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CXS.Payments.Core", name = "AuthorizationResultType")
    public JAXBElement<AuthorizationResultType> createAuthorizationResultType(AuthorizationResultType value) {
        return new JAXBElement<AuthorizationResultType>(_AuthorizationResultType_QNAME, AuthorizationResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CXS.Payments.Core", name = "AuthorizationType")
    public JAXBElement<AuthorizationType> createAuthorizationType(AuthorizationType value) {
        return new JAXBElement<AuthorizationType>(_AuthorizationType_QNAME, AuthorizationType.class, null, value);
    }

}
