package com.lencho.springcloud.dao;

import com.lencho.springcloud.PaymentMain8001;
import com.lencho.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Lencho
 * @create 2021-07-25 16:13
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
