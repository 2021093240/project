package com.example.controller;

import com.example.entity.Work;
import com.example.service.WorkService;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work")
public class WorkController {

    @Autowired
    private WorkService workService;


    @PostMapping("/addWork")
    public ResponseResult<Void> addWork(Work work){

        workService.addWork(work);
        return ResponseResult.getResponseResult("提交工单成功");

    }
}




