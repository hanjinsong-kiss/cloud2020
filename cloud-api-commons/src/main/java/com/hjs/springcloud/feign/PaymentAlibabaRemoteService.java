package com.hjs.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("payment")
public interface PaymentAlibabaRemoteService {

    @GetMapping("/payment/getport")
    public String getPort();

}
