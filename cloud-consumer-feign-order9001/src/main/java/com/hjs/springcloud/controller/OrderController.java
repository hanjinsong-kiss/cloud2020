package com.hjs.springcloud.controller;

import com.hjs.springcloud.entities.CommonResult;
import com.hjs.springcloud.entities.Payment;
import com.hjs.springcloud.feign.PaymentRemoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final PaymentRemoteService paymentRemoteService;

    @GetMapping("/order/get/{id}")
    public CommonResult<Payment> getOrder(@PathVariable("id") Long id) {
        return paymentRemoteService.getById(id);
    }

}
