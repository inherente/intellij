package com.inherente.dummy.dao.impl;

import com.inherente.dummy.dao.etc.EntityManagerHelper;
import com.inherente.dummy.dto.GponDataEntity;
import com.inherente.dummy.dto.GponEquipmentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.logging.Logger;

import static com.inherente.dummy.dao.etc.EntityManagerHelper.createEntityManager;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
public class EquipmentDAO {
    private static Logger log = Logger.getLogger(EquipmentDAO.class.getName());
    public static boolean saveEquipment(GponEquipmentEntity equipment){
        boolean created= false;
        EntityManager em = null;
        log.info("init");

        if (equipment== null){
            created= true;
            equipment= new GponEquipmentEntity();
            equipment.setOntSerialNumber("QWERTY");
            equipment.setIp("10.14.0.2");
            equipment.setSystemName("MA_TA5000");
            equipment.setShelf((byte) 1);
            equipment.setSlotOlt((byte)3);
        }

        try{
            em= EntityManagerHelper.createEntityManager();
            log.info("Entity Manager created");
            em.getTransaction().begin();
            log.info("Transaction begins");
            em.persist(equipment);
            log.info("Equipment persisted");
            em.getTransaction().commit();
            log.info("Transaction commit");
        } catch (RuntimeException rte) {
            log.info("Fucked up:");
            log.info(rte.toString());
            if (em== null) {
                log.info("Entity Manager Null");
            } else {
                log.info("trying rollback");
                em.getTransaction().rollback();
            }
        } finally {
            if (em== null){
                log.info("Entity Manager Null");
            } else {
                em.close();
                log.info("Entity Manager closed");
            }
        }

        return created;

    }
}

