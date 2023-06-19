package com.example.Service;

import com.example.entity.Work;
import com.example.mapper.WorkMapper;
import com.example.service.WorkService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WorkServiceTests {


    @Autowired
    private WorkService workService;


    @Test
    public void addWork(){

        Work work = new Work();
        work.setWorkName("zzx");
        workService.addWork(work);

    }
}
