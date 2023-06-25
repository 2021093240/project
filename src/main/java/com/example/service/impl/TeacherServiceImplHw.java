package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.Teacher;
import com.example.mapper.TeacherDao;
import com.example.service.TeacherServiceHw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class TeacherServiceImplHw implements TeacherServiceHw {
     @Autowired
    private TeacherDao teacherDao;

    @Override
    public List<Teacher> getTeacherAll(Integer id) {
        QueryWrapper<Teacher> qw = new QueryWrapper<>();
        qw.like("teacher_id",id);
        return teacherDao.selectList(qw);
    }

    @Override
    public Teacher getTeacherByid(Integer id) {
        return teacherDao.selectById(id);
    }
}
