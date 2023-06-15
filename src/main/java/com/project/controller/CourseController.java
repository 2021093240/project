package com.project.controller;

import com.project.entity.Course;
import com.project.service.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Course)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@RestController
@RequestMapping("course")
public class CourseController {
  
    @Resource
    private CourseService courseService;

   
}

