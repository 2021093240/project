package com.example.service.impl;

import com.example.entity.Payment;
import com.example.mapper.PaymentDao;
import com.example.service.PaymentService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Payment)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class PaymentServiceImpl implements PaymentService {
     @Resource
    private PaymentDao paymentDao;

   
}
