package com.project.controller;

import com.project.entity.User;
import com.project.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:16:00
 */
@RestController
@RequestMapping("user")
public class UserController {
  
    @Resource
    private UserService userService;

   
}

