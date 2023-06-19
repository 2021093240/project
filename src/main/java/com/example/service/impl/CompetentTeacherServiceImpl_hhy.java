package com.example.service.impl;

import com.example.entity.CompetentTeacher_hhy;
import com.example.entity.Teacher_hhy;
import com.example.mapper.CompetentTeacherDao_hhy;
import com.example.service.CompetentTeacherService_hhy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompetentTeacherServiceImpl_hhy implements CompetentTeacherService_hhy {
    @Autowired
    private CompetentTeacherDao_hhy ctdh;
    @Override
    public List<CompetentTeacher_hhy> findAllCompetentTeacher() {
        return ctdh.findAllCompetentTeacher();
    }
}
