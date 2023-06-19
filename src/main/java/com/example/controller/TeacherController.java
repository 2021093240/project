package com.example.controller;

import com.example.entity.Teacher;
import com.example.service.ITeacherService;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:44:57
 */
@RestController
@RequestMapping("yyp")
public class TeacherController {
    @Autowired
    private ITeacherService iTeacherService;

    @RequestMapping("findAll")
    public ResponseResult<List<Teacher>> findTeaAll(){
        List<Teacher> all = iTeacherService.findAll();
       return ResponseResult.getResponseResult(all);
    }
}

