package com.example.service;

import com.example.entity.ClassTable;
import com.example.entity.StudentVO;

import java.util.HashMap;

import com.example.entity.StudentVO;
import com.example.entity.Studentdetails;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface StudentService {

    List<StudentVO> selectStatus();

    HashMap findStudentAll_not_pay(int limitNum , int  count);


    List<StudentVO> findStudentAll_like_name(String name);

    int del(Integer id);

    int update_stu(StudentVO studentVO);

    int insert_stu(StudentVO studentVO);

    int query_tid(int tid);

    StudentVO query_stuSelfById(int id);


    int update_pay(Integer id);
    List<StudentVO> findStudentsAll(Integer current,Integer pageSize) ;

    Studentdetails findByStudentOne(String sdName);

    void insertStudents(StudentVO studentVO);


    void deleteStudents(Integer stuId);

    void updateStudents(Integer stuId , StudentVO studentVO);

    List<StudentVO> findStuNameAll(String sdName);

    Integer findAllStudent();

    StudentVO updateByAllOne(Integer stuId);

    List<ClassTable> findByClassNameAll();
}
