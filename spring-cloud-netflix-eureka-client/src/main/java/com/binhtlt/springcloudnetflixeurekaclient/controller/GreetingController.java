package com.binhtlt.springcloudnetflixeurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(){
        return "Hello world from Spring cloud Netflix Eureka demo.";
    }
}
