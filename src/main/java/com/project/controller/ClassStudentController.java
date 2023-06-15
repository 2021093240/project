package com.project.controller;

import com.project.entity.ClassStudent;
import com.project.service.ClassStudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ClassStudent)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@RestController
@RequestMapping("classStudent")
public class ClassStudentController {
  
    @Resource
    private ClassStudentService classStudentService;

   
}

