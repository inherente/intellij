package com.inherente.dummy.controller;


import com.inherente.dummy.poc.Blocker;
import com.inherente.dummy.poc.BroadCaster;
import com.inherente.dummy.test.AddTester;// import com.inherente.dummy.service.GreetingService;//
import com.inherente.dummy.test.ClientPoolSingleton;

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
    public static final String DEFAULT_GREETING= "Hello (default ) World -";
    public static final String GET_GREETING_METHOD_NAME= "getGreeting";
    public static final String ADD_CLIENT_METHOD_NAME= "addClient";
    Logger log= Logger.getLogger(HostServiceManager.class.getName());

    @WebMethod
    public String getGreeting(String name) {
        String greeting= DEFAULT_GREETING;
        boolean flag= false;
        log.info(GET_GREETING_METHOD_NAME);
     // EquipmentService.saveEquipment(null);
     // AddTester.addElement(name);
     // flag= BroadCaster.broadcast(name);
        Blocker.waitForIt(name);
        greeting= DEFAULT_GREETING+ " {" + flag + "}";// GreetingService.greetEverybody();
        return greeting;
    }

    @WebMethod
    public String addClient(String name) {
        String greeting= DEFAULT_GREETING;
        int i;
        log.info(ADD_CLIENT_METHOD_NAME);
        i= ClientPoolSingleton.getInstance().addClient(name);

        greeting= DEFAULT_GREETING + i;// GreetingService.greetEverybody();
        return greeting;
    }
}

