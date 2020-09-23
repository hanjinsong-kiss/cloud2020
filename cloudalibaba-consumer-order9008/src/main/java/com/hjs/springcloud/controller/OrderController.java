package com.hjs.springcloud.controller;

import com.hjs.springcloud.feign.PaymentAlibabaRemoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final PaymentAlibabaRemoteService paymentAlibabaRemoteService;

    @GetMapping("/order/getport")
    public String getPort() {
        return paymentAlibabaRemoteService.getPort();
    }

}
