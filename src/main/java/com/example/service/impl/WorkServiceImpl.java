package com.example.service.impl;

import com.example.entity.Work;
import com.example.mapper.WorkMapper;
import com.example.service.WorkService;
import com.example.service.ex.InsertException;
import com.example.service.ex.QueryException;
import com.example.service.ex.UpdateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkMapper workMapper;

    @Override
    public int addWork(Work work) {

        Date date = new Date();
        work.setTime(date);
        work.setStates("待处理");

        int i = workMapper.addWork(work);

        if (i != 1){

            throw new InsertException("添加数据时，产生未知的异常，请联系后端人员");
        }

        return i;

    }

    @Override
    public List<Work> queryWork() {

        List<Work> works = workMapper.queryWork();

        if (works == null){

            throw new QueryException("查询数据时，产生未知的异常，请联系后端人员");

        }

        return works;

    }

    @Override
    public int updateByIdWord(Work work) {

        work.setId(work.getId());
        work.setDetails("同意");

        int i = workMapper.updateByIdWord(work);


        if (i !=1){
            throw  new UpdateException("状态产生未知的异常，请联系后端人员");
        }
        return i;

    }

    @Override
    public int updateByIdWord2(Work work) {
        work.setId(work.getId());
        work.setDetails("未同意");

        int i = workMapper.updateByIdWord2(work);

        if (i !=1){
            throw  new UpdateException("状态产生未知的异常，请联系后端人员");
        }
        return i;
    }
}
