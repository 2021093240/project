package com.example.service.impl;

import com.example.entity.Remind_hww;
import com.example.mapper.RemindMapperHW;
import com.example.service.RemindServiceHW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemindServiceImplHw implements RemindServiceHW {
    @Autowired
    private RemindMapperHW remindMapperHW;


    @Override
    public int insertRemind(String txt, Integer stuid) {
        Remind_hww remindHww = new Remind_hww();
        remindHww.setRemind(txt);
        remindHww.setStuId(stuid);
        return remindMapperHW.insert(remindHww);
    }
}
