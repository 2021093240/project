package com.example.service;

import com.example.entity.Employee;

import java.util.List;
import java.util.Map;


/**
 * (Teacher)表服务接口
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
 
public interface TeacherService {

    void updateTeacher(Employee teacher,String username);

}
