package project.controller;

import project.entity.CourseTeacherClass;
import project.service.CourseTeacherClassService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CourseTeacherClass)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@RestController
@RequestMapping("courseTeacherClass")
public class CourseTeacherClassController {
  
    @Resource
    private CourseTeacherClassService courseTeacherClassService;

   
}

