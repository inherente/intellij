package com.inherente.dummy.test;

import com.inherente.dummy.dto.NothingElementEntity;
import com.inherente.dummy.dto.util.EntityManagerHelper;
import com.inherente.dummy.poc.Blocker;
import com.inherente.dummy.poc.WorkSimulator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 14/09/2016.
 */
public class AddTester {
    final static String PERSISTENCE_UNIT_NAME = "LocalPersistenceUnit";
    private final static String AUXILIARY_NAME = "load";
    private static Logger log = Logger.getLogger(AddTester.class.getName());
    public static void main (String[] argument){
        log.info("main");
        AddTester.addElement("main");
    }

    public static NothingElementEntity addElement (String name) {

        log.info("init");
        NothingElementEntity nee = null;

        if (AUXILIARY_NAME.equalsIgnoreCase(name)) WorkSimulator.work();
        nee= NothingElementEntity.getDummyElement(name);

        EntityManagerHelper.getEntityManager().persist(nee);

        log.info("test done");
        return nee;
    }

}
