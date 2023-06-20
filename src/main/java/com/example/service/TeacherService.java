package com.example.service;

import com.example.entity.Account;
import com.example.entity.Teacher;
import com.example.entity.Teacher_nav_mid;
import com.example.mapper.Teacher_nav_midMapper;

import java.math.BigInteger;
import java.util.List;


/**
 * (Teacher)表服务接口
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
 
public interface TeacherService {
    List<Teacher> findAll();
    void deleteTea(int id);
    void add(Teacher teacher);
    void insertAccount(Account account);
    void addTeacher_nav(Teacher_nav_mid teacherNavMid);
    int insertAccountId();
    int insertTeacherId();
    List<Teacher> findlikeName(String name);
}
