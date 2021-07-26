package com.lencho.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author Lencho
 * @create 2021-07-26 21:31
 */
@RestController
@Slf4j
public class PaymentController {

    public static final String INVOME_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentConsul() {
        return restTemplate.getForObject(INVOME_URL + "/payment/consul", String.class);
    }

}
