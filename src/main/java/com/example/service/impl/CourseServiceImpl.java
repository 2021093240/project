package com.example.service.impl;

import com.example.entity.Course;
import com.example.mapper.CourseDao;
import com.example.service.CourseService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Course)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class CourseServiceImpl implements CourseService {
     @Resource
    private CourseDao courseDao;

   
}
