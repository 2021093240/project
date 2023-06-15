package com.project.controller;

import com.project.entity.Clazz;
import com.project.service.ClazzService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Clazz)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@RestController
@RequestMapping("clazz")
public class ClazzController {
  
    @Resource
    private ClazzService clazzService;

   
}

