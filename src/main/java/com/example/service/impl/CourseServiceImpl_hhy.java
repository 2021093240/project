package com.example.service.impl;


import com.example.entity.Course_hhy;
import com.example.mapper.CourseDao_hhy;
import com.example.service.CourseService_hhy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl_hhy implements CourseService_hhy {
    @Autowired
    private CourseDao_hhy cdh;
    @Override
    public List<Course_hhy> findCourseByCtid(int teacherId) {
        return cdh.findCourseByCtid(teacherId);
    }

}
