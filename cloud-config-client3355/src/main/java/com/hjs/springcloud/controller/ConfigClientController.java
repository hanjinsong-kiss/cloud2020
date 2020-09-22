package com.hjs.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${info.profile}")
    private String configInfo;

    @GetMapping("/config")
    public String getConfigInfo(){
        return configInfo;
    }

}
