
package com.inherente.dummy.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HostServiceManagerService", targetNamespace = "http://localhost:7001/nothing/HostService", wsdlLocation = "http://localhost:7001/nothing/HostServiceManagerService?WSDL")
public class HostServiceManagerService
    extends Service
{

    private final static URL HOSTSERVICEMANAGERSERVICE_WSDL_LOCATION;
    private final static WebServiceException HOSTSERVICEMANAGERSERVICE_EXCEPTION;
    private final static QName HOSTSERVICEMANAGERSERVICE_QNAME = new QName("http://localhost:7001/nothing/HostService", "HostServiceManagerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7001/nothing/HostServiceManagerService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOSTSERVICEMANAGERSERVICE_WSDL_LOCATION = url;
        HOSTSERVICEMANAGERSERVICE_EXCEPTION = e;
    }

    public HostServiceManagerService() {
        super(__getWsdlLocation(), HOSTSERVICEMANAGERSERVICE_QNAME);
    }

    public HostServiceManagerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOSTSERVICEMANAGERSERVICE_QNAME);
    }

    public HostServiceManagerService(URL wsdlLocation) {
        super(wsdlLocation, HOSTSERVICEMANAGERSERVICE_QNAME);
    }

    public HostServiceManagerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOSTSERVICEMANAGERSERVICE_QNAME);
    }

    public HostServiceManagerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HostServiceManagerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns HostService
     */
    @WebEndpoint(name = "HostServicePort")
    public HostService getHostServicePort() {
        return super.getPort(new QName("http://localhost:7001/nothing/HostService", "HostServicePort"), HostService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HostService
     */
    @WebEndpoint(name = "HostServicePort")
    public HostService getHostServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost:7001/nothing/HostService", "HostServicePort"), HostService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOSTSERVICEMANAGERSERVICE_EXCEPTION!= null) {
            throw HOSTSERVICEMANAGERSERVICE_EXCEPTION;
        }
        return HOSTSERVICEMANAGERSERVICE_WSDL_LOCATION;
    }

}