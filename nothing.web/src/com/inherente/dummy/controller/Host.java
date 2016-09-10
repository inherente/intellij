package com.inherente.dummy.controller;

import javax.faces.bean.ManagedBean;

/**
 * Created by luis.gutierrez.ext on 09/09/2016.
 */
@ManagedBean
public class Host {
    private static final String DEFAULT_GREETING_MESSAGE = "Hello World";
    final String greeting= DEFAULT_GREETING_MESSAGE;
    public String getGreeting () {
        return DEFAULT_GREETING_MESSAGE;

    }
}
