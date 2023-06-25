package com.example.controller;

import com.example.entity.Page_hhy;
import com.example.entity.Refund_hhy;
import com.example.service.RefundService_hhy;
import com.example.service.RemindService_hhy;
import com.example.utils.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("refunds")
public class RefundsController_hhy {
    @Autowired
    private RefundService_hhy rsh;
    @Autowired
    private RemindService_hhy remindServiceHhy;
    @RequestMapping("findAllRefunds")
    public ResponseResult<List<Refund_hhy>> findAllRefunds(){
        List<Refund_hhy> allRefund = rsh.findAllRefund();

        return ResponseResult.getResponseResult(allRefund);
    }
    @RequestMapping("findRefundByPage")
    public ResponseResult<List<Refund_hhy>> findRefundByPage(Page_hhy page){
        PageInfo<Refund_hhy> refundByPage = rsh.findRefundByPage(page);
        List<Refund_hhy> list = refundByPage.getList();
        System.out.println(list);
        return ResponseResult.getResponseResult(list);
    }
    @RequestMapping("findRefundBysdName")
    public ResponseResult<List<Refund_hhy>> findRefundByName(Refund_hhy refundHhy){
        List<Refund_hhy> refundByName = rsh.findRefundBysdName(refundHhy);
        return ResponseResult.getResponseResult(refundByName);
    }
    @RequestMapping("findRefundByteacherName")
    public ResponseResult<List<Refund_hhy>> findRefundByteacherName(Refund_hhy refundHhy){
        List<Refund_hhy> refundByName = rsh.findRefundByteacherName(refundHhy);
        return ResponseResult.getResponseResult(refundByName);
    }
    @RequestMapping("findAllRefundNew")
    public ResponseResult<Refund_hhy> findAllRefundNew(){
        Refund_hhy allRefundNew = rsh.findAllRefundNew();
        allRefundNew.setRemind("退费提醒");
        return ResponseResult.getResponseResult("200",allRefundNew);
    }
    @RequestMapping("deleteRefundById")
    public ResponseResult<Void> deleteRefundById(int id){
        rsh.deleteRefundById(id);
        return ResponseResult.getResponseResult("删除成功");
    }
    @RequestMapping("updateRefund")
    public ResponseResult<Refund_hhy> updateRefund(Refund_hhy refundHhy,int stuId){
       refundHhy.setId(stuId);
        refundHhy.setState(0);
        refundHhy.setAgreeTime(new Date());
        rsh.updateRefund(refundHhy);
        remindServiceHhy.addRemind("退费提醒",stuId);
        return ResponseResult.getResponseResult("已同意",refundHhy);
    }
}
