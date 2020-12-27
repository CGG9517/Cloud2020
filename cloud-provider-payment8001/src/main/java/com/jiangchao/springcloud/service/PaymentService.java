package com.jiangchao.springcloud.service;

import com.jiangchao.springcloud.pojo.entity.PaymentEntity;

public interface PaymentService {

    Integer add(PaymentEntity paymentEntity);


    PaymentEntity selectPaymentById(Long id);



}
