package com.inherente.dummy.businessobject;

import com.inherente.dummy.dao.impl.EquipmentDAO;
import com.inherente.dummy.dto.GponEquipmentEntity;//
import com.inherente.dummy.test.AddTester;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
public class EquipmentBO {
    public static boolean saveEquipment(GponEquipmentEntity equipment){
        AddTester.addElement("One");
        return true;// EquipmentDAO.saveEquipment(equipment);

    }
}

