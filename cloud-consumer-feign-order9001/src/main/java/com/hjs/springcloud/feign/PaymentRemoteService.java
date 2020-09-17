//package com.hjs.springcloud.feign;
//
//import com.hjs.springcloud.entities.CommonResult;
//import com.hjs.springcloud.entities.Payment;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@FeignClient("cloud-payment-service")
//public interface PaymentRemoteService {
//
//    @GetMapping("/payment/get/{id}")
//    public CommonResult<Payment> getById(@PathVariable("id") Long id);
//
//}
