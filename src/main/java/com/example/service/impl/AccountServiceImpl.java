package com.example.service.impl;

import com.example.mapper.AccountDao;
import com.example.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Account)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class AccountServiceImpl implements AccountService {
     @Resource
    private AccountDao accountDao;

   
}
