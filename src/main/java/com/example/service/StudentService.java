package com.example.service;

import com.example.entity.StudentVO;

import java.util.HashMap;
import java.util.List;

public interface StudentService {

    List<StudentVO> selectStatus();


    List<StudentVO> findStudentAll() ;

    HashMap findStudentAll_not_pay(int limitNum , int  count);


    List<StudentVO> findStudentAll_like_name(String name);

    int del(Integer id);

    int update_stu(StudentVO studentVO);

    int insert_stu(StudentVO studentVO);

    int query_tid(int tid);

    StudentVO query_stuSelfById(int id);


    int update_pay(Integer id);
}
