package com.hjs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication9006 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication9006.class, args);
    }

}
