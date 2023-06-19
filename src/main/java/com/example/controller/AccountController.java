package com.example.controller;

import com.example.entity.Account;
import com.example.entity.Nav;
import com.example.entity.StudentVO;
import com.example.service.AccountService;
import com.example.utils.JwtUtil;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:44:57
 */
@RestController
@RequestMapping("/account")
public class AccountController extends BaseController{


    @Autowired
    private AccountService accountService ;

    @RequestMapping("/reg")
    public ResponseResult<Void> reg(Account account){

        accountService.reg(account);

        return ResponseResult.getResponseResult(200,"注册成功");
    }

    @RequestMapping("/login")
    public Map<String , Object> login(String username , String password, HttpSession session){

        Map<String , Object> objectMap = new HashMap<>();
        Account login = accountService.login(username, password);
        ResponseResult<Account> result = ResponseResult.getResponseResult("登录成功",login);

        List<Nav> navAll = null ;
        if(login.getPowerId() == 1){
            navAll = accountService.findNavAll();
        }else{

            navAll = accountService.findNavListTeacher(login.getId());
        }


        String token = JwtUtil.createToken(username,login.getPowerId());
        objectMap.put("data",result);
        objectMap.put("token" , token);
        objectMap.put("checkedkeys",navAll);

        session.setAttribute("uid" , login.getId());
        session.setAttribute("username" , login.getUsername());

        return objectMap ;
    }


}

