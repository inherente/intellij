package io.reflectoring.demo.api.controller;

import io.reflectoring.demo.api.task.ComponentTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Component
public class Orchestrator {
    Logger logger = Logger.getLogger(Orchestrator.class.getName());

    @Autowired
    ComponentRegistry componentRegistry;
    Map<String, Object> go(Map<String, Object> context) {
        return null;
    }
    public void executeEveryComponent() {
        Map<String, Object> context = new HashMap<>();
        Map<String, Object> componentMap = componentRegistry.getComponentMap();
        for (Object currentTask : componentMap.values()) {
            if(currentTask instanceof ComponentTask) {
                context=((ComponentTask) currentTask).go(context);
            } else {
                logger.warning(String.format("Ignoring task: Not instance of ComponentTask: %s", currentTask));
            }
        }
    }
}
