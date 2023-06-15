package com.project.controller;

import com.project.entity.Patriarch;
import com.project.service.PatriarchService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Patriarch)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@RestController
@RequestMapping("patriarch")
public class PatriarchController {
  
    @Resource
    private PatriarchService patriarchService;

   
}

