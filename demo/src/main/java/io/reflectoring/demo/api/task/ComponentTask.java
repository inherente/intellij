package io.reflectoring.demo.api.task;

import java.util.Map;

public interface ComponentTask {
    Map<String,Object> go(Map<String,Object> context);
}
