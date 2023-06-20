package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Account;

import java.math.BigInteger;

public interface IAccountMapper extends BaseMapper<Account> {
    BigInteger insertAccountId();
}
