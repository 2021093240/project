package com.example.controller;

import com.example.entity.Refund_hhy;
import com.example.service.RefundService_hhy;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("refunds")
public class RefundsController_hhy {
    @Autowired
    private RefundService_hhy rsh;
    @RequestMapping("findAllRefunds")
    public ResponseResult<List<Refund_hhy>> findAllRefunds(){
        List<Refund_hhy> allRefund = rsh.findAllRefund();

        return ResponseResult.getResponseResult(allRefund);
    }
    @RequestMapping("deleteRefundById/{id}")
    public ResponseResult<Void> deleteRefundById(@PathVariable int id){
        rsh.deleteRefundById(id);
        return ResponseResult.getResponseResult("删除成功");
    }
    @RequestMapping("updateRefund/{id}")
    public ResponseResult<Refund_hhy> updateRefund(Refund_hhy refundHhy,@PathVariable int id){
       refundHhy.setId(id);
        refundHhy.setState(1);
        refundHhy.setAgreeTime(new Date());
        rsh.updateRefund(refundHhy);
        return ResponseResult.getResponseResult("已同意",refundHhy);
    }
}
