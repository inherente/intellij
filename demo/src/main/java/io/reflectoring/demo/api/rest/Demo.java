package io.reflectoring.demo.api.rest;

import io.reflectoring.demo.api.controller.Orchestrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import io.reflectoring.demo.api.controller.ComponentRegistry;

import java.util.List;

@RestController
public class Demo {
    @Autowired
    ComponentRegistry componentRegistry;
    @Autowired
    Orchestrator orchestrator;
    record Content(List<String> component, String message, int code) {
    }
    record FullContent(Content content) {
    }
    @GetMapping("/temporal/endpoint")
    public FullContent getDummyResponse() {
        FullContent response = new FullContent(new Content(null,"Ni Hao", 200));
        return response;
    }
    @GetMapping("/temporal/config/endpoint")
    public FullContent getComponentMap() {
        List<String> componentName = componentRegistry.getBeanNameCollection();
        FullContent response = new FullContent(new Content(componentName,"Ni Hao", 200));
        return response;
    }
    @PutMapping("/temporal/init/endpoint")
    public FullContent init() {
        componentRegistry.init();
        FullContent response = new FullContent(new Content(null,"Ni Hao", 200));
        return response;
    }
    @PutMapping("/temporal/try/endpoint")
    public FullContent tryout() {
        orchestrator.executeEveryComponent();
        FullContent response = new FullContent(new Content(null,"Ni Hao", 200));
        return response;
    }
}
