package com.example.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Account;
import com.example.entity.Nav;
import com.example.entity.StudentVO;
import org.apache.tomcat.jni.User;

import java.util.List;

public interface AccountService {




    //注册
    void reg(Account account);

    Account login(String username ,String password);

    List<Nav> findNavAll();

    List<Nav> findNavListTeacher(Integer id);


}
