package com.example.service.impl;

import com.example.entity.Remind_hhy;
import com.example.mapper.RemindDao_hhy;
import com.example.service.RemindService_hhy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RemindServiceImpl_hhy implements RemindService_hhy {
    @Autowired
    private RemindDao_hhy rdh;
    @Override
    public List<Remind_hhy> findAllRemind() {
        return rdh.findAllRemind();
    }

    @Override
    public List<Remind_hhy> findAllRemindByGO() {
        return rdh.findAllRemindByGO();
    }

    @Override
    public void addRemind(String remind, Integer stuId) {
        rdh.addRemind(remind,stuId);
    }

    @Override
    public void deleteRemind(int rid) {
        rdh.deleteRemind(rid);
    }

    @Override
    public Remind_hhy findRemindByRid(int rid) {
        return rdh.findRemindByRid(rid);
    }


}
