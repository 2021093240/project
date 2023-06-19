package com.example.controller;

import com.example.entity.Employee;
import com.example.service.TeacherService;
import com.example.utils.ResponseResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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

    @RequestMapping("update_power")
    public ResponseResult<Void> updatePower(@RequestBody Employee employee, HttpSession session){

        System.err.println(employee);

        String username = (String) session.getAttribute("username");

        teacherService.updateTeacher(employee,username);

        return ResponseResult.getResponseResult(200,"老师信息修改成功");

    }

   
}

