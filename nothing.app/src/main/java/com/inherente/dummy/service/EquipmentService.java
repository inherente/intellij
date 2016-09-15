package com.inherente.dummy.service;

import com.inherente.dummy.businessobject.EquipmentBO;
import com.inherente.dummy.dto.GponEquipmentEntity;

import javax.persistence.EntityManager;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
public class EquipmentService {
    public static boolean saveEquipment (GponEquipmentEntity equipment){
        return EquipmentBO.saveEquipment(equipment);
    }
}
