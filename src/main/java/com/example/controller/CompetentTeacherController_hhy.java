package com.example.controller;

import com.example.entity.CompetentTeacher_hhy;
import com.example.service.CompetentTeacherService_hhy;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("competentTeacher")
public class CompetentTeacherController_hhy {
@Autowired
private CompetentTeacherService_hhy ctsh;
    @RequestMapping("findAllCompetentTeacher")
    public ResponseResult<CompetentTeacher_hhy> findAllCompetentTeacher(){
        List<CompetentTeacher_hhy> data = ctsh.findAllCompetentTeacher();
        System.out.println(data);
        return ResponseResult.getResponseResult("查询主管下的老师成功", (CompetentTeacher_hhy) data);
    }
}
