package com.inherente.dummy.poc;

/**
 * Created by luis.gutierrez.ext on 19/09/2016.
 */
public class WorkSimulator {
    private static final int MAX_WAIT_TIME_IN_SECONDS= 30;
    public static int work(){
        int currentSecond= 0;
        while(true){
            if (currentSecond++ > MAX_WAIT_TIME_IN_SECONDS) {
                break;
            }
            try { Thread.currentThread().sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }
        return currentSecond;
    }
}
