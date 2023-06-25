package com.example.controller;

import com.example.entity.Remind_hhy;
import com.example.service.RemindService_hhy;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("reminds")
public class RemindController_hhy {
    @Autowired
    private RemindService_hhy rsh;

    @RequestMapping("findAllRemind")
    public ResponseResult<List<List<Remind_hhy>>> findAllRemind(){
        List<Remind_hhy> allRemind = rsh.findAllRemind();
//        for (Remind_hhy remindHhy : allRemind) {
//            if(remindHhy.getState()==1){
//                return ResponseResult.getResponseResult("【"+remindHhy.getRemind()+"】 您有新的退费提醒，员工："+remindHhy.getTeacherName()+"提交了退费提醒");
//            }else if (remindHhy.getState()==0){
//                return ResponseResult.getResponseResult("【"+remindHhy.getRemind()+"】 您有新的退费提醒，学生："+remindHhy.getSdName()+"("+remindHhy.getStuId()+")"+"的退费申请已通过并完成退费,退费金额:"+remindHhy.getCourseMoney()+"元");
//            }
//        }
        List<Remind_hhy> allRemindByGO = rsh.findAllRemindByGO();
        List<List<Remind_hhy>> lists = new ArrayList<>();
        lists.add(allRemindByGO);
        lists.add(allRemind);
        return ResponseResult.getResponseResult(lists);
    }
    @RequestMapping("deleteRemind")
    public ResponseResult<Void> deleteRemind(int rid){
        Remind_hhy remindByRid = rsh.findRemindByRid(rid);
        if (remindByRid==null){
            return ResponseResult.getResponseResult("没有该退费信息");
        }
        rsh.deleteRemind(rid);
        return ResponseResult.getResponseResult("忽略成功");
    }
}
