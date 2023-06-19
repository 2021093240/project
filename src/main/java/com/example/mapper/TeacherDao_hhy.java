package com.example.mapper;

import com.example.entity.Teacher_hhy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface TeacherDao_hhy {
    List<Teacher_hhy> findTeacherByCtid(int ctid);
}
