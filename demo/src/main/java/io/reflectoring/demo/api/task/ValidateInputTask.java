package io.reflectoring.demo.api.task;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ValidateInputTask implements ComponentTask{
    @Override
    public Map<String, Object> go(Map<String, Object> context) {
        return null;
    }
}
