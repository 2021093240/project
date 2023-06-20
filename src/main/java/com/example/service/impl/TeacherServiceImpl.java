package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.Account;
import com.example.entity.Teacher;
import com.example.entity.Teacher_nav_mid;
import com.example.mapper.IAccountMapper;
import com.example.mapper.TeacherDao;
import com.example.mapper.Teacher_nav_midMapper;
import com.example.service.TeacherService;
import com.example.service.ex.DeleteException;
import com.example.service.ex.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao mapper;
    @Autowired
    private IAccountMapper iAccountMapper;
    @Autowired
    private Teacher_nav_midMapper teacherNavMidMapper;
    @Override
    public List<Teacher> findAll() {//查询老师所有信息
        QueryWrapper<Teacher> wrapper=new QueryWrapper<>();
        List<Teacher> teachers = mapper.selectList(wrapper);
        return teachers;
    }

    @Override
    public void deleteTea(int id) {
        Teacher teacher = mapper.selectById(id);
        int accountId = iAccountMapper.deleteById(teacher.getAccountId());
        int navId = teacherNavMidMapper.deleteByid(id);
        int Teaid = mapper.deleteById(id);
        if (Teaid!=1 && accountId!=1 && navId!=1){
            throw new DeleteException("删除数据时，产生未知异常!");
        }
    }

    @Override
    public void add(Teacher teacher) {
        Date date=new Date();
        teacher.setEntryTime(date);
        int insert = mapper.insert(teacher);
        if (insert!=1){
            throw new InsertException("添加数据时,产生未知异常!");
        }
    }

    @Override
    public void insertAccount(Account account) {
        Date date=new Date();
        String upperCase = UUID.randomUUID().toString().toUpperCase();
        String md5Password = getMd5Password(account.getPassword(), upperCase);
        account.setPassword(md5Password);
        account.setSalt(upperCase);
        account.setCreatedUser(account.getUsername());
        account.setCreatedTime(date);
        account.setModifiedUser(account.getUsername());
        account.setModifiedTime(date);
        int insert = iAccountMapper.insert(account);
        if (insert!=1){
            throw new InsertException("添加数据时,产生未知异常！");
        }
    }
    @Override
    public void addTeacher_nav(Teacher_nav_mid teacherNavMid) {
        int insert = teacherNavMidMapper.insert(teacherNavMid);
        if (insert!=1){
            throw new InsertException("添加数据时,产生未知异常！");
        }
    }
    @Override
    public int insertAccountId() {
        BigInteger bigInteger = iAccountMapper.insertAccountId();
        int i = bigInteger.intValue();
        return i;
    }

    @Override
    public int insertTeacherId() {
        BigInteger bigInteger = mapper.insertTeacherId();
        int i = bigInteger.intValue();
        return i;
    }

    @Override
    public List<Teacher> findlikeName(String name) {
        QueryWrapper<Teacher> wrapper=new QueryWrapper<Teacher>();
        wrapper.like("teacher_name",name);
        List<Teacher> teachers = mapper.selectList(wrapper);
        return teachers;
    }

    private String getMd5Password(String password,String salt){
        for (int i = 0; i < 3; i++) {
            password = DigestUtils.md5DigestAsHex((salt + password + salt).getBytes()).toUpperCase();
        }
        return password;
    }
}
