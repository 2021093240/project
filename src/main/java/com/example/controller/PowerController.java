package com.example.controller;

import com.example.entity.Power;
import com.example.service.PowerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Power)表控制层
 *
 * @author makejava
 * @since 2023-06-17 17:52:24
 */
@RestController
@RequestMapping("power")
public class PowerController {
  
    @Resource
    private PowerService powerService;

   
}

