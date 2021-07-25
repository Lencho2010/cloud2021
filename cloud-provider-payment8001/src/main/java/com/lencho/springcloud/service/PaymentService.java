package com.lencho.springcloud.service;

import com.lencho.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Lencho
 * @create 2021-07-25 16:36
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
