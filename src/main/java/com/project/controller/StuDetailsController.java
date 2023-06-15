package com.project.controller;

import com.project.entity.StuDetails;
import com.project.service.StuDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (StuDetails)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@RestController
@RequestMapping("stuDetails")
public class StuDetailsController {
  
    @Resource
    private StuDetailsService stuDetailsService;

   
}

