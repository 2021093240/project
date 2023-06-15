package com.project.service.impl;

import com.project.entity.Course;
import com.project.dao.CourseDao;
import com.project.service.CourseService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Course)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:17:37
 */
@Service
public class CourseServiceImpl implements CourseService {
     @Resource
    private CourseDao courseDao;

   
}
