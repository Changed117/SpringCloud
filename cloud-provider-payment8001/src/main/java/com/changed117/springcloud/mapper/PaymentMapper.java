package com.changed117.springcloud.mapper;

import com.changed117.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    public int add(Payment payment);

    public Payment queryPaymentById(@Param("id")Long id);
}
