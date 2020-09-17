package com.hjs.springcloud;

import com.hjs.loadbalanced.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "payment", configuration = MyRule.class)
public class OrderApplication9006 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication9006.class, args);
    }

}
