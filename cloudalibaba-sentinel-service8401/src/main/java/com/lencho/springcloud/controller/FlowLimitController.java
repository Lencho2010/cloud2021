package com.lencho.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lencho
 * @create 2021-07-31 16:42
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "----------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "----------testB";
    }
}
