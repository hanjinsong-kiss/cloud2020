package com.hjs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain9000 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain9000.class, args);
    }

}
