package com.jiangchao.springcloud.service.impl;

import com.jiangchao.springcloud.dao.PaymentDao;
import com.jiangchao.springcloud.pojo.entity.PaymentEntity;
import com.jiangchao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public Integer add(PaymentEntity paymentEntity) {
        return paymentDao.add(paymentEntity);
    }

    public PaymentEntity selectPaymentById(Long id) {
        return paymentDao.selectByPrimaryId(id);
    }
}
