package io.reflectoring.demo.api.task;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.logging.Logger;

@Service
public class ValidateInputTask implements ComponentTask {
    Logger logger = Logger.getLogger(ValidateInputTask.class.getName());
    @Override
    public Map<String, Object> go(Map<String, Object> context) {
        logger.info("go");
        return context;
    }
}
