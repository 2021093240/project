package com.project.service.impl;

import com.project.entity.ClassStudent;
import com.project.dao.ClassStudentDao;
import com.project.service.ClassStudentService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (ClassStudent)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:17:37
 */
@Service
public class ClassStudentServiceImpl implements ClassStudentService {
     @Resource
    private ClassStudentDao classStudentDao;

   
}
