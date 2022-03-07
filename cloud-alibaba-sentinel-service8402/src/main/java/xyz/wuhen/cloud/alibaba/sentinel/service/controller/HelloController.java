package xyz.wuhen.cloud.alibaba.sentinel.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController

public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello" + UUID.randomUUID();
    }
}
