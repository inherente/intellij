package com.inherente.dummy.task;

import com.inherente.dummy.test.AddTester;

import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 19/09/2016.
 */
public class IndependentTask implements Runnable{
    private String name = null;
    public static Logger log = Logger.getLogger(IndependentTask.class.getName());
    public IndependentTask(String name){
        setName(name);
    }

    private boolean doSomething(String name) {
        log.info("independent");
        AddTester.addElement(name);
        return true;
    }

    public void process() {
        InheritableThreadLocal inheritable= null;
        log.info("About to Start");
        new Thread(this).start();
     // inheritable.start();
    }

    @Override
    public void run() {
        log.info("running");
        doSomething(getName());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
