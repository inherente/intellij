package com.inherente.dummy.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis.gutierrez.ext on 15/09/2016.
 */
public class ClientPoolSingleton {
    private List<String> client;

    public List<String> getClientList() {
        return client;
    }

    public int addClient(String value){
        int amount;
        if (client == null) client= new ArrayList<String>();
        client.add(value);
        amount = client.size();
        return amount;
    }

    public static ClientPoolSingleton getInstance() {
        return ClientPoolSingletonHolder.INSTANCE;
    }

    private static class ClientPoolSingletonHolder {
        private final static ClientPoolSingleton INSTANCE= new ClientPoolSingleton();
    }
}
