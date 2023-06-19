package com.example.controller;

import com.example.entity.Payment;
import com.example.service.PaymentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Payment)表控制层
 *
 * @author makejava
 * @since 2023-06-17 17:52:24
 */
@RestController
@RequestMapping("payment")
public class PaymentController {
  
    @Resource
    private PaymentService paymentService;

   
}

