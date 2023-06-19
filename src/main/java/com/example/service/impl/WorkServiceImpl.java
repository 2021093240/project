package com.example.service.impl;

import com.example.entity.Work;
import com.example.mapper.WorkMapper;
import com.example.service.WorkService;
import com.example.service.ex.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkMapper workMapper;


    @Override
    public void addWork(Work work) {

        int i = workMapper.addWork(work);

        if (i != 1){

            throw  new InsertException("添加数据时，产生未知的异常，请联系后端人员");
        }

    }
}
