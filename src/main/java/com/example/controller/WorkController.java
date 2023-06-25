package com.example.controller;

import com.example.entity.RemindWork;
import com.example.entity.Work;
import com.example.entity.WorkVO;
import com.example.service.RemindWorkService;
import com.example.service.WorkService;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work")
public class WorkController extends BaseController{

    @Autowired
    private WorkService workService;

    @Autowired
    private RemindWorkService remindWorkService;

    @PostMapping("/addWork")
    public ResponseResult<Void> addWork(Work work){
        workService.addWork(work);
        RemindWork remindWork = new RemindWork();
        remindWork.setRemind("工单提醒");
        remindWork.setTId(work.getTId());
        remindWorkService.addRemindWork(remindWork);
        return ResponseResult.getResponseResult("提交工单成功");

    }


    @GetMapping("/queryWork")
    public ResponseResult<List<Work>> queryWork(){

        List<Work> works = workService.queryWork();

        return ResponseResult.getResponseResult("查询工单列表成功",works);

    }


    @GetMapping("/findByWorkAll")
    public ResponseResult<List<WorkVO>> findByWorkAll(){

        List<WorkVO> byWorkAll = workService.findByWorkAll();

        return ResponseResult.getResponseResult("查询工单列表成功",byWorkAll);

    }


    @PutMapping ("/updateByIdWord")
    public ResponseResult<Void> updateByIdWord(Work work){

        workService.updateByIdWord(work);

        return ResponseResult.getResponseResult("状态修改成功");

    }


    @PutMapping("/updateByIdWord2")
    public ResponseResult<Void> updateByIdWord2(Work work){

        workService.updateByIdWord2(work);

        return ResponseResult.getResponseResult("状态修改成功");

    }

    @GetMapping("/findStudentNameWork")
    public ResponseResult<List<Work>> findStudentNameWork(String sdName){

        List<Work> studentNameWork = workService.findStudentNameWork(sdName);

        return ResponseResult.getResponseResult("查询工单列表成功",studentNameWork);

    }

    @GetMapping("/findTeacherNameWork")
    public ResponseResult<List<Work>> findTeacherNameWork(String teacherName){

        List<Work> teacherNameWork = workService.findTeacherNameWork(teacherName);

        return ResponseResult.getResponseResult("查询工单列表成功",teacherNameWork);

    }

}

