package io.reflectoring.demo.api.task;

import io.reflectoring.demo.api.controller.ComponentRegistry;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.logging.Logger;

@Service
public class LogoutTask implements ComponentTask {
    Logger logger = Logger.getLogger(LogoutTask.class.getName());

    @Override
    public Map<String, Object> go(Map<String, Object> context) {
        logger.info("go");
        return context;
    }
}
