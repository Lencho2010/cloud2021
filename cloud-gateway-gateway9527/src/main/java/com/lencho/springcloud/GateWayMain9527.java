package com.lencho.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Package: com.lencho.springcloud
 * @ClassName: GateWayMain9527
 * @Author: Lencho
 * @CreateTime: 2021/7/28 12:35
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class, args);
    }
}
