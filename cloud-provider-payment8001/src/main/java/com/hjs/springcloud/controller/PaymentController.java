package com.hjs.springcloud.controller;

import com.hjs.springcloud.entities.CommonResult;
import com.hjs.springcloud.entities.Payment;
import com.hjs.springcloud.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        log.info("创建payment start，request param：{}", payment);
        int i = paymentService.create(payment);
        if (i > 0) {
            return new CommonResult<>(200, "创建payment成功", i);
        } else {
            return new CommonResult<>(500, "创建payment失败", i);
        }
    }


    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        log.info("获取payment start，request param：{}", id);
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommonResult<>(200, "查询payment成功", payment);
        } else {
            return new CommonResult<>(500, "查询payment失败", payment);
        }
    }

}
