package com.example.mapper;

import com.example.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Nav;
import com.example.entity.StudentVO;

import java.util.List;

/**
 * (Account)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-17 17:29:48
 */

public interface AccountMapper extends BaseMapper<Account>{

    List<Nav> findNavAll();

    List<Nav> findNavListTeacher(Integer id);



}
