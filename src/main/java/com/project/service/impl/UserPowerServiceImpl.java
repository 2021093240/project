package com.project.service.impl;

import com.project.entity.UserPower;
import com.project.dao.UserPowerDao;
import com.project.service.UserPowerService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (UserPower)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:17:37
 */
@Service
public class UserPowerServiceImpl implements UserPowerService {
     @Resource
    private UserPowerDao userPowerDao;

   
}
