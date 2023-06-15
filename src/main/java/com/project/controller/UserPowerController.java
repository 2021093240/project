package com.project.controller;

import com.project.entity.UserPower;
import com.project.service.UserPowerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (UserPower)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:16:00
 */
@RestController
@RequestMapping("userPower")
public class UserPowerController {
  
    @Resource
    private UserPowerService userPowerService;

   
}

