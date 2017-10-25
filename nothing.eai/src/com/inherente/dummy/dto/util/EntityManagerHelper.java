package com.inherente.dummy.dto.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 19/09/2016.
 */
public class EntityManagerHelper {
    final static String PERSISTENCE_UNIT_NAME = "LocalPersistenceUnit";
    private static final EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    private static final ThreadLocal<EntityManager> blindThreadLocal= new ThreadLocal<EntityManager>();
    private static final InheritableThreadLocal<EntityManager> threadLocal = new InheritableThreadLocal<EntityManager>();

    private static final Logger log = Logger.getLogger(EntityManagerHelper.class.getName());

    public static EntityManager getEntityManager() {
        if (threadLocal.get() == null) {
            threadLocal.set(entityManagerFactory.createEntityManager());
        }
        return threadLocal.get();
    }

    public static void beginTransaction() {
        getEntityManager().getTransaction().begin();
    }

    public static void commit() {
        final EntityManager entityManager = threadLocal.get();
        final EntityTransaction transaction = entityManager.getTransaction();
        transaction.commit();
    }

    public static void closeEntityManager() {
        final EntityManager entityManager = threadLocal.get();
        if (entityManager != null && entityManager.isOpen() ) {

            entityManager.close();
        }
        threadLocal.set(null);
        threadLocal.remove();
    }

}
