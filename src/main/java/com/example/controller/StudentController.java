package com.example.controller;

import com.example.entity.Student;
import com.example.entity.StudentVO;
import com.example.service.StudentService;
import com.example.utils.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2023-06-17 17:52:25
 */
@RestController
@RequestMapping("student")
public class StudentController {
  
    @Resource
    private StudentService studentService;

    @RequestMapping("select_status")
    public ResponseResult<List> getSelectStatus(){

        List<StudentVO> studentVOS = studentService.selectStatus();

        if(studentVOS == null){
            return ResponseResult.getResponseResult("无未付款的学生!");
        }

        return ResponseResult.getResponseResult("查询成功",studentVOS);

    }

   
}

