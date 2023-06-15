package com.project.service.impl;

import com.project.entity.User;
import com.project.dao.UserDao;
import com.project.service.UserService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:17:37
 */
@Service
public class UserServiceImpl implements UserService {
     @Resource
    private UserDao userDao;

   
}
