package com.example.controller;

import com.example.service.ex.*;
import com.example.utils.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

public class BaseController {


    protected final Integer getUidFromSession(HttpSession session){
        return Integer.valueOf( session.getAttribute("uid").toString());
    }
    //获取Session中的username
    protected final String getUsernameFromSession(HttpSession session){
        return session.getAttribute("username").toString();
    }

    //统一异常处理
    @ExceptionHandler(ServiceException.class) // 监控当前类是否产生异常，并监控哪一种类型的异常
    public ResponseResult<Void> handleException(Throwable e){

        ResponseResult<Void> responseResult = null;

        if (e instanceof InsertException){
            responseResult = ResponseResult.getResponseResult(1000,"插入数据产生未知的异常");
        }else if (e instanceof QueryException){
            responseResult = ResponseResult.getResponseResult(1001,"查询数据产生未知的异常");
        }else if(e instanceof WorkByNameException){
            responseResult = ResponseResult.getResponseResult(1002,"没有该学生或老师");
        }else if(e instanceof NameException){
            responseResult = ResponseResult.getResponseResult(1003,"请输入正确的姓名");
        }
        return responseResult;
    }
}