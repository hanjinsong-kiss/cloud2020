package com.hjs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentAlibabaMain8009 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentAlibabaMain8009.class, args);
    }
}
