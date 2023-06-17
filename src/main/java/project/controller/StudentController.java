package project.controller;

import project.entity.Student;
import project.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
@RestController
@RequestMapping("student")
public class StudentController {
  
    @Resource
    private StudentService studentService;

   
}

