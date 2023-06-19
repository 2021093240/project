package com.example.service.impl;

import com.example.entity.Teacher_hhy;
import com.example.mapper.TeacherDao_hhy;
import com.example.service.TeacherService_hhy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl_hhy implements TeacherService_hhy {
    @Autowired
    private TeacherDao_hhy tdh;
    @Override
    public Teacher_hhy findTeacherByTeacherId(int teacherId) {
        return tdh.findTeacherByTeacherId(teacherId);
    }
}
