package com.example.mapper;

import com.example.entity.Course_hhy;

import java.util.List;

public interface CourseDao_hhy {
    List<Course_hhy> findCourseByCtid(int teacherId);
}
