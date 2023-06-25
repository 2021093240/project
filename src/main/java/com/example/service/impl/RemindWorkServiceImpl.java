package com.example.service.impl;

import com.example.entity.RemindWork;
import com.example.mapper.RemindWorkMapper;
import com.example.service.RemindWorkService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemindWorkServiceImpl implements RemindWorkService {

    @Autowired
    private RemindWorkMapper remindWorkMapper;


    @Override
    public int addRemindWork(RemindWork remindWork) {


        return remindWorkMapper.addRemindWork(remindWork);
    }
}
