package com.jiangchao.springcloud.controller;

import com.jiangchao.springcloud.pojo.entity.PaymentEntity;
import com.jiangchao.springcloud.pojo.response.CommonResult;
import com.jiangchao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/add")
    public CommonResult<Integer> addPayment(@RequestBody PaymentEntity pa) {
        Integer add = paymentService.add(pa);
        log.info("插入payment对象：{}", pa);
        return new CommonResult<>(add);
    }


    @GetMapping("/query/{id}")
    public CommonResult<PaymentEntity> queryPayment(@PathVariable("id") Long id) {
        return new CommonResult<>(paymentService.selectPaymentById(id));
    }
}
