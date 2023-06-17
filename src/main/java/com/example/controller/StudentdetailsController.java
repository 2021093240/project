package com.example.controller;

import com.example.entity.Studentdetails;
import com.example.service.StudentdetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Studentdetails)表控制层
 *
 * @author makejava
 * @since 2023-06-17 17:52:25
 */
@RestController
@RequestMapping("studentdetails")
public class StudentdetailsController {
  
    @Resource
    private StudentdetailsService studentdetailsService;

   
}

