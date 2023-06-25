package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.HistoryTableHw2;
import com.example.entity.RefundHw3;
import com.example.entity.ReturnHw1;

import java.util.Date;
import java.util.List;

public interface ClassManagementHw extends BaseMapper {
    List<HistoryTableHw2> getClassAll();//查询班级管理全部
    List<RefundHw3> getRefundAll();//查询退费全部记录

    List<ReturnHw1> getLikeId(String id);//查询未退费的学生

    int addrefund(Integer id, Integer state, Date stime, String reason, Integer sqrid);
}
