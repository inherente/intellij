package com.inherente.dummy.controller;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 09/09/2016.
 */
@WebService( name = "HostService", targetNamespace = "http://localhost:7001/nothing/HostService")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class HostServiceManager {
    public static final String DEFAULT_GREETING= "Hello World";
    public static final String GET_GREETING_METHOD_NAME= "getGreeting";
    Logger log= Logger.getLogger(HostServiceManager.class.getName());

    @WebMethod
    public String getGreeting(String name) {
        String greeting= DEFAULT_GREETING;
        log.info(GET_GREETING_METHOD_NAME);
        return greeting;
    }
}

