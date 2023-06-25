package com.example.controller;

import com.example.service.ex.*;
import com.example.utils.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

public class BaseController {


    protected final Integer getAidFromAidSession(HttpSession session){

        Integer aid = Integer.valueOf(session.getAttribute("aid").toString());

        return aid ;
    }

    protected final String getUsernameFromSession(HttpSession session){


        String username = session.getAttribute("username").toString();

        return username ;
    }

    //统一异常的处理
    @ExceptionHandler(ServiceException.class)
    public ResponseResult<Void> handleException(Throwable e){

        ResponseResult<Void> responseResult = null ;

        if(e instanceof UsernameDuplicateException){

            responseResult = ResponseResult.getResponseResult(4000,"用户名被占用") ;
        }else if(e instanceof UserNotFoundException){

            responseResult = ResponseResult.getResponseResult(4001,"用户数据不存在");

        }else if(e instanceof PasswordNotFoundException){

            responseResult = ResponseResult.getResponseResult(4002 , "密码验证失败");
        }else if(e instanceof InsertException){

            responseResult = ResponseResult.getResponseResult(5000 , "插入数据产生未知异常");

        }else if(e instanceof ListNotFoundException){

            responseResult = ResponseResult.getResponseResult(5001 , "数据为空的异常");
        }else if(e instanceof DataNullException){

            responseResult = ResponseResult.getResponseResult(5002 , "数据为空的异常");
        }else if(e instanceof DeleteDataException){

            responseResult = ResponseResult.getResponseResult(4003 , "删除数据异常");

        }else if(e instanceof UpdateStudentException){

            responseResult = ResponseResult.getResponseResult(4004 , "修改学生时的异常");
        }

        return responseResult ;
    }
}
