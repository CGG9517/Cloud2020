package com.jiangchao.springcloud.dao;

import com.jiangchao.springcloud.pojo.entity.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    int add(PaymentEntity entity);

    PaymentEntity selectByPrimaryId(@Param("id") Long id);


}
