package com.example.controller;

import com.example.entity.Work;
import com.example.service.WorkService;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


    @GetMapping("/queryWork")
    public ResponseResult<List<Work>> queryWork(){

        List<Work> works = workService.queryWork();

        return ResponseResult.getResponseResult("查询工单列表成功",works);

    }
    @GetMapping("/updateByIdWord")
    public ResponseResult<Void> updateByIdWord(Work work){

        work.setId(work.getId());
        work.setStates(work.getStates());
        workService.updateByIdWord(work);

        return ResponseResult.getResponseResult("状态修改成功");

    }


    @GetMapping("/updateByIdWord2")
    public ResponseResult<Void> updateByIdWord2(Work work){

        workService.updateByIdWord2(work);

        return ResponseResult.getResponseResult("状态修改成功");

    }
}

