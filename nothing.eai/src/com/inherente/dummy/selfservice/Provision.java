package com.inherente.dummy.selfservice;

import com.inherente.dummy.dto.util.EntityManagerHelper;
import com.inherente.dummy.poc.WorkSimulator;
import com.inherente.dummy.task.IndependentTask;

/**
 * Created by luis.gutierrez.ext on 19/09/2016.
 */
public class Provision {
    public static boolean serve(String name) {
        EntityManagerHelper.beginTransaction();
        new IndependentTask(name).process();
     // This task above was executed in a separated Thread
     // Let's hold a minute so the task is finished.
        WorkSimulator.work();
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        return true;
    }
}
