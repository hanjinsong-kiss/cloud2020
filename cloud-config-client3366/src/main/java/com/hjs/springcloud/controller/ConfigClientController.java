package com.hjs.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
/**
 * 要发送http请求
 * curl -X POST "http://localhost:3355/actuator/refresh"
 * 才能刷新配置
 */
public class ConfigClientController {

    @Value("${info.profile}")
    private String configInfo;

    @GetMapping("/config")
    public String getConfigInfo(){
        return configInfo;
    }

}
