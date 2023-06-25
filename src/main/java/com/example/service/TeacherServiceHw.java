package com.example.service;

import com.example.entity.TeacherHw;
import java.util.List;


/**
 * (Teacher)表服务接口
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
 
public interface TeacherServiceHw {

    List<TeacherHw> getTeacherAll(Integer id);
    TeacherHw getTeacherByid(Integer id);
}
