package com.hjs.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {

    @GetMapping("/geta")
    public String getFunA(){
        return "sentinel A";
    }

    @GetMapping("/getb")
    public String getFunB(){
        return "sentinel B";
    }


}
