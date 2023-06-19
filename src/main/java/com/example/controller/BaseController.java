package com.example.controller;

import com.example.service.ex.ServiceException;
import com.example.service.ex.*;
import com.example.utils.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

/**
 * 控制层的父类
 * 完成统一异常处理
 */

public class BaseController {

    //获取Session中的uid
    protected final Integer getUidFromSession(HttpSession session){

        return Integer.valueOf(session.getAttribute("uid").toString());

    }

    //获取session中的username
    protected final String getUserNameFromSession(HttpSession session){

        return session.getAttribute("username").toString();

    }

    /*
        ExceptionHandler：监控当前类是否产生异常，并指定监控哪一种异常
     */

    @ExceptionHandler(ServiceException.class)
    public ResponseResult<Void> handlerException(Throwable e){

        ResponseResult<Void> responseResult = null;

        if(e instanceof TeacherNotFound){
            responseResult = ResponseResult.getResponseResult(4090,"老师信息找不到");
        }else if(e instanceof NavPointNotNull){
            responseResult = ResponseResult.getResponseResult(4091,"权限不为空");
        }else if(e instanceof InsertTeacherNavMidException){
            responseResult = ResponseResult.getResponseResult(4092,"新增数据时服务器发生错误");
        } else if (e instanceof UpdateTeacherException) {
            responseResult = ResponseResult.getResponseResult(4093,"修改老师信息发生服务器错误");
        } else if (e instanceof UserNotFountException) {
            responseResult = ResponseResult.getResponseResult(4094,"用户找不到");
        }

        return responseResult;

    }

}
