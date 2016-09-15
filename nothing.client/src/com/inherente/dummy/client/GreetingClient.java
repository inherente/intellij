package com.inherente.dummy.client;

import javax.xml.namespace.QName;
import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 12/09/2016.
 */
public class GreetingClient {
    private static final Logger log= Logger.getLogger(GreetingClient.class.getName());
    public static void main(String[] argv) {
        log.info("main");
        GreetingClient.greet();

    }

    public static void greet (){
        String message = null;
        com.inherente.dummy.client.HostService service = new HostServiceManagerService().getPort(new QName("http://localhost:7001/nothing/HostService", "HostServicePort"),HostService.class);
        // invoke business method
        log.info("init");
        message= service.getGreeting(null);
        log.info(message);
    }
}
