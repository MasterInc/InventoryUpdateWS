
package org.datacontract.schemas._2004._07.system;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.system package. 
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

    private final static QName _ApplicationException_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "ApplicationException");
    private final static QName _DataTable_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Data", "DataTable");
    private final static QName _Stream_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.IO", "Stream");
    private final static QName _Exception_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "Exception");
    private final static QName _MarshalByRefObject_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "MarshalByRefObject");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.system
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataTable }
     * 
     */
    public DataTable createDataTable() {
        return new DataTable();
    }

    /**
     * Create an instance of {@link MarshalByRefObject }
     * 
     */
    public MarshalByRefObject createMarshalByRefObject() {
        return new MarshalByRefObject();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ApplicationException }
     * 
     */
    public ApplicationException createApplicationException() {
        return new ApplicationException();
    }

    /**
     * Create an instance of {@link Stream }
     * 
     */
    public Stream createStream() {
        return new Stream();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "ApplicationException")
    public JAXBElement<ApplicationException> createApplicationException(ApplicationException value) {
        return new JAXBElement<ApplicationException>(_ApplicationException_QNAME, ApplicationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Data", name = "DataTable")
    public JAXBElement<DataTable> createDataTable(DataTable value) {
        return new JAXBElement<DataTable>(_DataTable_QNAME, DataTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stream }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.IO", name = "Stream")
    public JAXBElement<Stream> createStream(Stream value) {
        return new JAXBElement<Stream>(_Stream_QNAME, Stream.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarshalByRefObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "MarshalByRefObject")
    public JAXBElement<MarshalByRefObject> createMarshalByRefObject(MarshalByRefObject value) {
        return new JAXBElement<MarshalByRefObject>(_MarshalByRefObject_QNAME, MarshalByRefObject.class, null, value);
    }

}
