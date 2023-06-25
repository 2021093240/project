package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.TeacherHw;
import com.example.mapper.TeacherHwDao;
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
    private TeacherHwDao teacherDao;

    @Override
    public List<TeacherHw> getTeacherAll(Integer id) {
        QueryWrapper<TeacherHw> qw = new QueryWrapper<>();
        qw.like("teacher_id",id);
        return teacherDao.selectList(qw);
    }

    @Override
    public TeacherHw getTeacherByid(Integer id) {
        return teacherDao.selectById(id);
    }
}
