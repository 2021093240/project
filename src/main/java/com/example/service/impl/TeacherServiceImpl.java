package com.example.service.impl;

import com.example.entity.Teacher;
import com.example.mapper.ITeacherMapper;
import com.example.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private ITeacherMapper mapper;
    @Override
    public List<Teacher> findAll() {
        return mapper.findAll();
    }
}
