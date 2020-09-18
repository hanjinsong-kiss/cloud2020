package com.hjs.springcloud.controller;

import com.hjs.springcloud.feign.paymentHystrixRemoteService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderController {

    private final paymentHystrixRemoteService paymentRemoteService;

    @GetMapping("/order/get/{id}")
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    @HystrixCommand
    public String getOrder(@PathVariable("id") Long id) {
        return paymentRemoteService.getById(id);
    }

    public String paymentTimeOutFallbackMethod(Long id) {
        return "调用order失败，请稍后再试";
    }

    /**
     * 全局fallback
     *
     * @return
     */
    public String payment_Global_FallbackMethod() {
        return "Global异常处理信息,请稍后重试.o(╥﹏╥)o";
    }

}
