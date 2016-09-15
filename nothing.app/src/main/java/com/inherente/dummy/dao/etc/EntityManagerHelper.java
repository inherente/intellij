package com.inherente.dummy.dao.etc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
public class EntityManagerHelper {
    final static String PERSISTENCE_UNIT_NAME = "PersistenceUnit";
    private static Logger log= Logger.getLogger(EntityManagerHelper.class.getName());

    public static EntityManager createEntityManager () {

        EntityManagerFactory emf= null;
        EntityManager em= null;
        log.info(PERSISTENCE_UNIT_NAME);
        emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        log.info("Entity Manager Factory created");
        em= emf.createEntityManager();
        log.info("Entity Manager created");
        return em;
    }
}
