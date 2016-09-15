package com.inherente.dummy.util;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 12/09/2016.
 */
public class SimpleBroadcaster {
    List listenerCollection;
    int listenerAmount=0 ;
    private final static Logger log= Logger.getLogger(SimpleBroadcaster.class.getName()) ;
    public boolean addListener(String name) {
        log.info("adding one more ("+ (++listenerAmount) + ") total.");
        return true;
    }

    public static SimpleBroadcaster getInstance() {
        return SimpleBroadcasterHolder.INSTANCE;
    }

    private static class SimpleBroadcasterHolder {
        private static final SimpleBroadcaster INSTANCE = new SimpleBroadcaster();
    }
}
