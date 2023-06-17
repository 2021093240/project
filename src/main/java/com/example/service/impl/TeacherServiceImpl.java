package com.example.service.impl;

import com.example.entity.Teacher;
import com.example.mapper.TeacherDao;
import com.example.service.TeacherService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class TeacherServiceImpl implements TeacherService {
     @Resource
    private TeacherDao teacherDao;

   
}
