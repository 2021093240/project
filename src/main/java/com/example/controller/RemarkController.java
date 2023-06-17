package com.example.controller;

import com.example.entity.Remark;
import com.example.service.RemarkService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Remark)表控制层
 *
 * @author makejava
 * @since 2023-06-17 17:52:24
 */
@RestController
@RequestMapping("remark")
public class RemarkController {
  
    @Resource
    private RemarkService remarkService;

   
}

