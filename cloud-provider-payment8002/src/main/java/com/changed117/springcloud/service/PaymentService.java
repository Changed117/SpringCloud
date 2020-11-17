package com.changed117.springcloud.service;

import com.changed117.springcloud.entities.Payment;

public interface PaymentService {
    public int add(Payment payment);

    public Payment queryPaymentById(Long id);
}
