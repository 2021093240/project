package com.example.controller;

import com.example.entity.Teacher;
import com.example.service.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Teacher)表控制层
 *
 * @author makejava
 * @since 2023-06-17 17:52:25
 */
@RestController
@RequestMapping("teacher")
public class TeacherController {
  
    @Resource
    private TeacherService teacherService;

   
}
