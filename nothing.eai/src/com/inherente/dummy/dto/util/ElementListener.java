package com.inherente.dummy.dto.util;

import com.inherente.dummy.dto.NothingElementEntity;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import java.util.logging.Logger;

/**
 * Created by luis.gutierrez.ext on 15/09/2016.
 */
public class ElementListener {
    private static final Logger log = (Logger) Logger.getLogger(ElementListener.class.getName());
    final static String AFTER_PERSIST_METHOD_NAME= "afterPersist () ";
    final static String AFTER_UPDATE_METHOD_NAME= "afterUpdate () ";
    final static String PRE_UPDATE_METHOD_NAME= "preUpdate () ";

    @PostPersist
    public void afterPersist(Object any) {
        NothingElementEntity finalObject= null;
        if (any instanceof NothingElementEntity)finalObject= (NothingElementEntity)any;
        if (finalObject== null){
            log.info(AFTER_UPDATE_METHOD_NAME);
        } else {
            log.info(AFTER_UPDATE_METHOD_NAME + finalObject.getDescription());
        }
    }

    @PostUpdate
    public void afterUpdate(Object any) {
        NothingElementEntity finalObject= null;
        if (any instanceof NothingElementEntity)finalObject= (NothingElementEntity)any;
        if (finalObject== null){
            log.info(AFTER_UPDATE_METHOD_NAME);
        } else {
            log.info(AFTER_UPDATE_METHOD_NAME + finalObject.getDescription());
        }
        // BroadcasterUtil.broadcast(BroadcasterUtil.getInstance(), any.getOntSerialNumber());
    }

}
