package com.example.mapper;

import com.example.entity.CompetentTeacher_hhy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CompetentTeacherDao_hhy {
//    @Select("select * from competent_teacher")
    List<CompetentTeacher_hhy> findAllCompetentTeacher();
}
