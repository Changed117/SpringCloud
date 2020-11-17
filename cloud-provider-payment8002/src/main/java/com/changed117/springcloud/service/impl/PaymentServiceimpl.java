package com.changed117.springcloud.service.impl;

import com.changed117.springcloud.entities.Payment;
import com.changed117.springcloud.mapper.PaymentMapper;
import com.changed117.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceimpl implements PaymentService {
    @Resource
    PaymentMapper paymentMapper;

    @Override
    public int add(Payment payment) {
        return paymentMapper.add(payment);
    }

    @Override
    public Payment queryPaymentById(Long id) {
        return paymentMapper.queryPaymentById(id);
    }
}
