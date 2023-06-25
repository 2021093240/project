package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.Account;
import com.example.entity.Nav;
import com.example.entity.StudentVO;
import com.example.mapper.AccountMapper;
import com.example.service.AccountService;
import com.example.service.ex.InsertException;
import com.example.service.ex.PasswordNotFoundException;
import com.example.service.ex.UserNotFoundException;
import com.example.service.ex.UsernameDuplicateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Service
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountMapper accountDao ;



    @Override
    public void reg(Account account) {

        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        String username = account.getUsername();
        wrapper.eq("username" , username);
        Account uname = accountDao.selectOne(wrapper);

        if(uname!= null){

            throw new UsernameDuplicateException("用户名已被注册");
        }

        String salt = UUID.randomUUID().toString();
        account.setSalt(salt);
        Date date = new Date();

        String md5Password = getMd5Password(account.getPassword(), salt);
        account.setPassword(md5Password);
        account.setCreatedUser(username);

        account.setCreatedTime(date);
        account.setModifiedUser(username);
        account.setModifiedTime(date);

        int insert = accountDao.insert(account);

        if(insert != 1){

            throw new InsertException("添加数据时,产生的异常,请联系管理员");
        }
    }

    @Override
    public Account login(String username, String password) {

        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        Account account = accountDao.selectOne(wrapper);

        System.out.println("account = " + account);
        if(account == null){

            throw new UserNotFoundException("用户数据不存在");
        }

        String salt = account.getSalt();

        String pwd = account.getPassword();

        String md5Password = getMd5Password(password, salt);

        if(!md5Password.equals(pwd)){

            throw new PasswordNotFoundException("密码验证失败的错误");
        }

        List<Nav> navAll = accountDao.findNavAll();

        Account acc = new Account();

        acc.setId(account.getId());
        acc.setUsername(account.getUsername());
        acc.setPowerId(account.getPowerId());

        return acc;
    }

    @Override
    public List<Nav> findNavAll() {
        return accountDao.findNavAll();
    }

    @Override
    public List<Nav> findNavListTeacher(Integer id) {
        return accountDao.findNavListTeacher(id);
    }




    private String getMd5Password(String password , String salt){

        //md5 算法加密处理
        for (int i = 0; i < 3; i++) {

            password = DigestUtils.md5DigestAsHex((salt+password+salt).getBytes()).toUpperCase();

        }
        return password ;
    }
}
