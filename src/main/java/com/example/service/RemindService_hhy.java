package com.example.service;

import com.example.entity.Remind_hhy;

import java.util.List;

public interface RemindService_hhy {
    List<Remind_hhy> findAllRemind();
    List<Remind_hhy> findAllRemindByGO();
    void addRemind(String remind,Integer stuId);
void deleteRemind(int rid);
    Remind_hhy findRemindByRid(int rid);
}
