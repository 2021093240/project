package com.example.service;

import com.example.entity.HistoryTableHw2;
import com.example.entity.RefundHw3;
import com.example.entity.ReturnHw1;

import java.util.Date;
import java.util.List;

public interface ClassManagementHwService {
    List<HistoryTableHw2> getClassAll();
    List<RefundHw3> getRefundAll();

    List<ReturnHw1> getLikeId(String id);

    int addrefund(Integer id, Integer state, Date stime, String reason, Integer sqrid);

}
