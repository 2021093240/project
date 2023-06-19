package com.example.service.impl;

import com.example.entity.Student_hhy;
import com.example.mapper.StudentDao_hhy;
import com.example.service.StudentService_hhy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl_hhy implements StudentService_hhy {
    @Autowired
    private StudentDao_hhy tdh;
    @Override
    public List<Student_hhy> findStudentByCtid(int ctid) {
        return tdh.findStudentByCtid(ctid);
    }

}
