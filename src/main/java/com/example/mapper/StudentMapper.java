package com.example.mapper;

import com.example.entity.StudentVO;

import java.util.List;

public interface StudentMapper {

    List<StudentVO> findStudentAll();
    List<StudentVO> findStudentAll_not_pay();
    List<StudentVO> findStudentAll_like_name(String name);
    StudentVO quert_detail(Integer id);
}
