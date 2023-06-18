package com.example.service.impl;

import com.example.entity.CourseTeacherClass;
import com.example.mapper.CourseTeacherClassDao;
import com.example.service.CourseTeacherClassService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (CourseTeacherClass)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class CourseTeacherClassServiceImpl implements CourseTeacherClassService {
     @Resource
    private CourseTeacherClassDao courseTeacherClassDao;

   
}

