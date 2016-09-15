package com.inherente.dummy.poc;

import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 15/09/2016.
 */
public class Blocker {
    public static final int MAX_WAIT_IN_SECONDS = 60;
    private static Logger log = Logger.getLogger(Blocker.class.getName());

    public static void waitForIt(String name) {
        int loop= 0;
        log.info(name);
        while (true) {
            try { Thread.currentThread().sleep(1000);} catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (BroadCaster.broadcast(name)){
                log.info("found&break");
                break;
            }
            if(loop++ >= MAX_WAIT_IN_SECONDS){
                log.info("expired&break");
                break;
            }
        }
    }
}
