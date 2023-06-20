package com.example.controller;

import com.example.service.ex.DeleteException;
import com.example.service.ex.InsertException;
import com.example.service.ex.ServiceException;
import com.example.utils.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {
    @ExceptionHandler(ServiceException.class)
    public ResponseResult<Void> handleException(Throwable e){
        ResponseResult<Void> responseResult=null;
        if (e instanceof InsertException){
            responseResult=ResponseResult.getResponseResult(5000,"插入数据产生未知的异常");
        }else if (e instanceof DeleteException){
            responseResult=ResponseResult.getResponseResult(5001,"删除数据时，产生未知异常");
        }
        return responseResult;
    }
}
