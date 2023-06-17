package com.example.service.impl;

import com.example.mapper.StudentDao;
import com.example.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class StudentServiceImpl implements StudentService {
     @Resource
    private StudentDao studentDao;

   
}
