package com.hjs.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient("payment")
//@Component
public interface paymentHystrixRemoteService {


    @GetMapping("/payment/get/{id}")
    public String getById(@PathVariable("id") Long id);

}
