package com.project.controller;

import com.project.entity.FollowUp;
import com.project.service.FollowUpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (FollowUp)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@RestController
@RequestMapping("followUp")
public class FollowUpController {
  
    @Resource
    private FollowUpService followUpService;

   
}

