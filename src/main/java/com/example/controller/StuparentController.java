package com.example.controller;

import com.example.entity.Stuparent;
import com.example.service.StuparentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Stuparent)表控制层
 *
 * @author makejava
 * @since 2023-06-17 17:52:25
 */
@RestController
@RequestMapping("stuparent")
public class StuparentController {
  
    @Resource
    private StuparentService stuparentService;

   
}

