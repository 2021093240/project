package com.example.controller;

import com.example.service.CompetentTeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CompetentTeacher)表控制层
 *
 * @author makejava
 * @since 2023-06-17 17:52:24
 */
@RestController
@RequestMapping("competentTeacher")
public class CompetentTeacherController {
  
    @Resource
    private CompetentTeacherService competentTeacherService;

   
}

