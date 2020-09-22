package com.hjs.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
/**
 * curl -X POST "http://localhost:3344/actuator/bus-refresh"全局通知
 * curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355"定点通知
 */
public class ConfigMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3344.class, args);
    }

}
