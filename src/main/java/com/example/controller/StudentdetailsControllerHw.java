package com.example.controller;

import com.example.service.StudentdetailsHwService;
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
public class StudentdetailsControllerHw {
  
    @Resource
    private StudentdetailsHwService studentdetailsService;

   
}

