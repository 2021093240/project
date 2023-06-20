package com.example.service.impl;

import com.example.entity.Refund_hhy;
import com.example.mapper.RefundDao_hhy;
import com.example.service.RefundService_hhy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class RefundServiceImpl implements RefundService_hhy {
    @Autowired
    private RefundDao_hhy rdh;
    @Override
    public List<Refund_hhy> findAllRefund( ) {
        return rdh.findAllRefund();
    }

    @Override
    public void deleteRefundById(int id) {
        rdh.deleteRefundById(id);
    }

    @Override
    public void updateRefund(Refund_hhy refundHhy) {
        rdh.updateRefund(refundHhy);
    }

    @Override
    public Refund_hhy findRefundById(int id) {
        return rdh.findRefundById(id);
    }
}
