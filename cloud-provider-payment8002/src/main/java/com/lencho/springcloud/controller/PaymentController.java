package com.lencho.springcloud.controller;

import com.lencho.springcloud.entities.CommonResult;
import com.lencho.springcloud.entities.Payment;
import com.lencho.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Lencho
 * @create 2021-07-25 16:39
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*******插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功,serverPort:" + serverPort, result);
        } else {
            return new CommonResult(444, "插入失败", null);
        }
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("*******插入结果：" + result);
        if (result != null) {
            return new CommonResult(200, "查询成功,serverPort:" + serverPort, result);
        } else {
            return new CommonResult(444, "没有对应记录，查询ID：" + id, null);
        }
    }
}
