package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.HistoryTableHw;
import com.example.mapper.HistoryTableDaoHw;
import com.example.service.HistoryTableServiceHw;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (HistoryTable)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class HistoryTableServiceImplhw implements HistoryTableServiceHw {

    @Autowired
    private HistoryTableDaoHw historyTableDao;

    @Override
    public int setHistoryTable(HistoryTableHw historyTable) {
        return historyTableDao.insert(historyTable);
    }

    @Override
    public List<HistoryTableHw> getHistoryTableAll() {

        return historyTableDao.selectList(null);
    }

    @Override
    public int uphistory1(Integer id) {//同意
        QueryWrapper<HistoryTableHw> qw = new QueryWrapper<>();
        HistoryTableHw st = new HistoryTableHw();
        Date date = new Date();
        st.setAgreeTime(date);
        st.setState(0);
        qw.eq("id",id);
        return historyTableDao.update(st,qw);
    }

    @Override
    public int uphistory2(Integer id) {//拒绝
        QueryWrapper<HistoryTableHw> qw = new QueryWrapper<>();
        HistoryTableHw st = new HistoryTableHw();
        Date date = new Date();
        st.setAgreeTime(date);
        st.setState(3);
        qw.eq("id",id);
        return historyTableDao.update(st,qw);
    }

    @Override
    public int delhistory(Integer id) {
        return historyTableDao.deleteById(id);
    }

    @Override
    public HistoryTableHw getHistoryTableByid(Integer id) {
        return historyTableDao.selectById(id);
    }


}
