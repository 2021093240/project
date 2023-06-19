package com.example.service.impl;

import com.example.entity.Refund;
import com.example.mapper.RefundDao;
import com.example.service.RefundService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Refund)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class RefundServiceImpl implements RefundService {
     @Resource
    private RefundDao refundDao;

   
}
