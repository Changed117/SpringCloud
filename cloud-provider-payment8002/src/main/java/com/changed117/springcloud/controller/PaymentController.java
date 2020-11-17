package com.changed117.springcloud.controller;

import com.changed117.springcloud.entities.CommonResult;
import com.changed117.springcloud.entities.Payment;
import com.changed117.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @Value("${server.port}")
    String serverPort;

    @PostMapping("/add")
    public CommonResult add(@RequestBody Payment payment){
        int result = paymentService.add(payment);

        if (result > 0){
            return new CommonResult(200, "插入数据库成功,port="+serverPort, result);
        }else {
            return new CommonResult(500, "插入数据库失败", null);
        }
    }

    @GetMapping("/query/get/{id}")
    public CommonResult queryPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.queryPaymentById(id);
        if (result != null){
            return new CommonResult(200, "查询成功,port="+serverPort, result);
        }else {
            return new CommonResult(500, "查询失败", null);
        }

    }
}
