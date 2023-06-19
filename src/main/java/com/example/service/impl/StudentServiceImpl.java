package com.example.service.impl;

import com.example.entity.StudentVO;
import com.example.mapper.StudentDao;
import com.example.mapper.StudentMapper;
import com.example.entity.StudentVO;

import com.example.service.StudentService;
import com.example.service.ex.ListNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper ;

    @Autowired
    private StudentDao studentDao ;

    @Override
    public List<StudentVO> findStudentAll() {

        List<StudentVO> studentAll = studentMapper.findStudentAll();

        if(studentAll == null){

            throw new ListNotFoundException("数据为空！");
        }

        return studentAll ;
    }

    @Override
    public List<StudentVO> selectStatus() {

        List<StudentVO> studentVOS = studentDao.selectStatus();

        return studentVOS;
    }
}
