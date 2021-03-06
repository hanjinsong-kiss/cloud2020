package com.hjs.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8007 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8007.class, args);
    }

}
