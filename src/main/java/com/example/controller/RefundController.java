package com.example.controller;

import com.example.entity.Refund;
import com.example.service.RefundService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Refund)表控制层
 *
 * @author makejava
 * @since 2023-06-17 17:52:24
 */
@RestController
@RequestMapping("refund")
public class RefundController {
  
    @Resource
    private RefundService refundService;

   
}

