
package com.inherente.dummy.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inherente.dummy.client package. 
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

    private final static QName _GetGreeting_QNAME = new QName("http://localhost:7001/nothing/HostService", "getGreeting");
    private final static QName _GetGreetingResponse_QNAME = new QName("http://localhost:7001/nothing/HostService", "getGreetingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inherente.dummy.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:7001/nothing/HostService", name = "getGreeting")
    public JAXBElement<String> createGetGreeting(String value) {
        return new JAXBElement<String>(_GetGreeting_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:7001/nothing/HostService", name = "getGreetingResponse")
    public JAXBElement<String> createGetGreetingResponse(String value) {
        return new JAXBElement<String>(_GetGreetingResponse_QNAME, String.class, null, value);
    }

}
