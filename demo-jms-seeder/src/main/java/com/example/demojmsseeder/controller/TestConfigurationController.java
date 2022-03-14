package com.example.demojmsseeder.controller;

import com.example.demojmsseeder.config.MyConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigurationController {
    @Autowired
    private MyConfig myConfig;

    // pemanggilan cara 1
    @GetMapping("/testconfig2")
    private String testConfig2() {
        return myConfig.getFoo() + " " + myConfig.getBar();
    }

    // pemanggilan cara kedua

    @Value("${myconfig.foo}") // -> PEMANGGILAN PROPERTIES
    private String foo;

    @Value("${myconfig.bar}")
    private String bar;

    @GetMapping("/testconfig")
    private String testConfig() {
        return foo + " " + bar;
    }
}
