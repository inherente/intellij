package com.inherente.dummy.test;

import com.inherente.dummy.dto.NothingElementEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 14/09/2016.
 */
public class AddTester {
    final static String PERSISTENCE_UNIT_NAME = "LocalPersistenceUnit";
    private static Logger log = Logger.getLogger(AddTester.class.getName());
    public static void main (String[] argument){
        log.info("main");
        AddTester.addElement("main");
    }

    public static NothingElementEntity addElement (String name) {
        EntityManagerFactory emf= null;
        EntityManager em= null;
        log.info("init");
        NothingElementEntity nee = null;
        nee= NothingElementEntity.getDummyElement(name);

        emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        log.info("factory created");
        em= emf.createEntityManager();
        log.info("Entity Manager created");
        em.getTransaction().begin();
        em.persist(nee);
        em.getTransaction().commit();
        em.close();

        log.info("test done");
        return nee;
    }
}
