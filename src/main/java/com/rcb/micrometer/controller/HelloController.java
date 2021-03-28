package com.rcb.micrometer.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Timed (
            value = "prom.micrometer.hello.request",
            histogram = true,
            percentiles = { 0.95, 0.99},
            extraTags = { "version", "1.0" }
    )
    @GetMapping("/hello")
    public String hello() {
        return "Hello Friend!";
    }

    @Timed (
            value = "prom.micrometer.welcome.request",
            histogram = true,
            percentiles = { 0.95, 0.99},
            extraTags = { "version", "1.0" }
    )
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome my friend!";
    }
}
