package com.hjs.springcloud.controller;


import com.hjs.springcloud.entities.CommonResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private static final String PAYMENT_URL = "http://localhost:8001";

    private final RestTemplate restTemplate;

    @GetMapping("/order/get/{id}")
    public ResponseEntity<CommonResult> getOrder(@PathVariable("id") Long id) {
        return restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

}
