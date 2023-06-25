package com.example.controller;

import com.example.entity.*;

import com.example.service.TeacherService;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:44:57
 */
@RestController
@RequestMapping("teacher")
public class TeachersController {
    @Autowired
    private TeacherService iTeacherService;
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("findAll")
    public ResponseResult<List<Teacher>> findTeaAll() {
        List<Teacher> all = iTeacherService.findAll();
        return ResponseResult.getResponseResult(all);
    }
    @RequestMapping("findById/{tid}")
    public ResponseResult<Teacher> findById(@PathVariable int tid){
        Teacher byId = iTeacherService.findById(tid);
        if (byId==null){
            return ResponseResult.getResponseResult("查无此人");
        }else {
            return ResponseResult.getResponseResult(byId);
        }
    }
    @RequestMapping("del/{id}")
    public ResponseResult<Void> del(@PathVariable int id){
        iTeacherService.deleteTea(id);
        return ResponseResult.getResponseResult("删除成功");
    }
    @RequestMapping("add")
    public ResponseResult<Void> add(@RequestBody Employee employee){
        Teacher teacher=new Teacher();
        Account account=new Account();
        account.setUsername(employee.getName());
        System.out.println(employee);
        account.setPassword(employee.getPassword());
        account.setPowerId(2);
        iTeacherService.insertAccount(account);
        int aid = iTeacherService.insertAccountId();
        teacher.setTeacherName(employee.getName());
        teacher.setCtid(1);
        teacher.setAccountId(String.valueOf(aid));
        teacher.setContactWay(employee.getContactWay());
        teacher.setEducation(employee.getEducation());
        iTeacherService.add(teacher);
        int tid = iTeacherService.insertTeacherId();
        List<Integer> nav = employee.getNav();
        for (Integer nid : nav) {
            Teacher_nav_mid teacherNavMid=new Teacher_nav_mid(tid,nid);
            iTeacherService.addTeacher_nav(teacherNavMid);
        }
        return ResponseResult.getResponseResult("新增成功");
    }
    @RequestMapping("like/{name}")
    public ResponseResult<List<Teacher>> like(@PathVariable String name){
        List<Teacher> teachers = iTeacherService.findlikeName(name);
        return ResponseResult.getResponseResult(teachers);
    }

    @RequestMapping("update_power")
    public ResponseResult<Void> updatePower(Employee employee, HttpSession session){

        System.out.println(employee);

        String username = (String) session.getAttribute("username");

        teacherService.updateTeacher(employee,username);

        return ResponseResult.getResponseResult("修改成功");

    }

}