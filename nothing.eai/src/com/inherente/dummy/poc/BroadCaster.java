package com.inherente.dummy.poc;

import com.inherente.dummy.test.ClientPoolSingleton;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 15/09/2016.
 */
public class BroadCaster {
    private static Logger log = Logger.getLogger(BroadCaster.class.getName());

    public static boolean broadcast (String name) {
        boolean b = false;
        List<String> client;
        client = ClientPoolSingleton.getInstance().getClientList();
        if (client== null) {
            b= false;
        }
        for (String currentClient : client) {
            log.info(currentClient);
            if (currentClient.equalsIgnoreCase( name)) {
                b= true;
                break;
            }
        }
        return b;
    }
}
