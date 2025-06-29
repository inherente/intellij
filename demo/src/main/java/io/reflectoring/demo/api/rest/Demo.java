package io.reflectoring.demo.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    record Content(String message,int code) {
    }
    record FullContent(Content content) {
    }
    @GetMapping("/temporal/endpoint")
    public FullContent getMyResponse() {
        FullContent response = new FullContent(new Content("Ni Hao", 200));
        return response;
    }
}
