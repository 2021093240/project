package com.example.service.impl;

import com.example.mapper.CompetentTeacherDao;
import com.example.service.CompetentTeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (CompetentTeacher)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class CompetentTeacherServiceImpl implements CompetentTeacherService {
     @Resource
    private CompetentTeacherDao competentTeacherDao;

   
}
