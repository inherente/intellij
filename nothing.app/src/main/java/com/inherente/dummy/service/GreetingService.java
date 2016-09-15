package com.inherente.dummy.service;

import com.inherente.dummy.util.SimpleBroadcaster;

import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 12/09/2016.
 */
public class GreetingService {
    private static final String DEFAULT_GREETING_MESSAGE = "Hello all in the World";
    private static final String GREETING_METHOD_NAME = "greetEverybody";
    private final static Logger log = Logger.getLogger(GreetingService.class.getName());
    public static String greetEverybody() {
        SimpleBroadcaster broadcasterSingleton = SimpleBroadcaster.getInstance();
        log.info(GREETING_METHOD_NAME);
        broadcasterSingleton.addListener(".");

        return DEFAULT_GREETING_MESSAGE;
    }
}
