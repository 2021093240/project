package com.project.controller;

import com.project.entity.FollowUpSign;
import com.project.service.FollowUpSignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (FollowUpSign)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@RestController
@RequestMapping("followUpSign")
public class FollowUpSignController {
  
    @Resource
    private FollowUpSignService followUpSignService;

   
}

