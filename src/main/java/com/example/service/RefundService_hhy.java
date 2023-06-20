package com.example.service;

import com.example.entity.Refund_hhy;

import java.util.List;

public interface RefundService_hhy {
    List<Refund_hhy> findAllRefund();
    void deleteRefundById(int id);
    void updateRefund(Refund_hhy refundHhy);

    Refund_hhy findRefundById(int id);

}
