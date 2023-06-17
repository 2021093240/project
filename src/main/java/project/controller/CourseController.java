package project.controller;

import project.entity.Course;
import project.service.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Course)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@RestController
@RequestMapping("course")
public class CourseController {
  
    @Resource
    private CourseService courseService;

   
}

