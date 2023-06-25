package com.example.service.impl;

import com.example.entity.Page_hhy;
import com.example.entity.Refund_hhy;
import com.example.mapper.RefundDao_hhy;
import com.example.service.RefundService_hhy;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public Refund_hhy findAllRefundNew() {
        return rdh.findAllRefundNew();
    }

    @Override
    public PageInfo<Refund_hhy> findRefundByPage(Page_hhy page) {
        int Page=page.getPage();
        int Size=page.getSize();
        PageHelper.startPage(Page,Size);
        List<Refund_hhy> allRefund = rdh.findAllRefund();
        PageInfo<Refund_hhy> refundHhyPageInfo = new PageInfo<>();
        return refundHhyPageInfo;
    }

    @Override
    public List<Refund_hhy> findRefundBysdName(Refund_hhy refundHhy) {
        return rdh.findRefundBysdName(refundHhy);
    }

    @Override
    public List<Refund_hhy> findRefundByteacherName(Refund_hhy refundHhy) {
        return rdh.findRefundByteacherName(refundHhy);
    }



}
