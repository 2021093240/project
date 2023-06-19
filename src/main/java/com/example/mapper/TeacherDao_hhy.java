package com.example.mapper;

import com.example.entity.Teacher_hhy;
import org.apache.ibatis.annotations.Mapper;

public interface TeacherDao_hhy {
    Teacher_hhy findTeacherByTeacherId(int teacherId);
}
