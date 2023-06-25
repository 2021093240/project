package com.example.service.impl;

import com.example.entity.HistoryTableHw2;
import com.example.entity.RefundHw3;
import com.example.entity.ReturnHw1;
import com.example.mapper.ClassManagementHw;
import com.example.service.ClassManagementHwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ClassManagementServiceImplHw implements ClassManagementHwService {
    @Autowired
    private ClassManagementHw classManagement;
    @Override
    public List<HistoryTableHw2> getClassAll() {
        return classManagement.getClassAll();
    }

    @Override
    public List<RefundHw3> getRefundAll() {
        return classManagement.getRefundAll();
    }

    @Override
    public List<ReturnHw1> getLikeId(String id) {
        id = "%"+id+"%";
        return classManagement.getLikeId(id);
    }

    @Override
    public int addrefund(Integer id, Integer state, Date stime, String reason, Integer sqrid) {
        return classManagement.addrefund(id,state,stime,reason,sqrid);
    }
}
