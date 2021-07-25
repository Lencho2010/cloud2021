package com.lencho.springcloud.service.impl;

import com.lencho.springcloud.dao.PaymentDao;
import com.lencho.springcloud.entities.Payment;
import com.lencho.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lencho
 * @create 2021-07-25 16:37
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
