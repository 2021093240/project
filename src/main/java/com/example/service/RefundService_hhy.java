package com.example.service;

import com.example.entity.Page_hhy;
import com.example.entity.Refund_hhy;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface RefundService_hhy {
    List<Refund_hhy> findAllRefund();
    void deleteRefundById(int id);
    void updateRefund(Refund_hhy refundHhy);

    Refund_hhy findRefundById(int id);
    Refund_hhy  findAllRefundNew();
    PageInfo<Refund_hhy> findRefundByPage(Page_hhy page);

    List<Refund_hhy> findRefundBysdName(Refund_hhy refundHhy);
    List<Refund_hhy> findRefundByteacherName(Refund_hhy refundHhy);
}
