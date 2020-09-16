package com.hjs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuerkaMain7003 {

    public static void main(String[] args) {
        SpringApplication.run(EuerkaMain7003.class, args);
    }

}
