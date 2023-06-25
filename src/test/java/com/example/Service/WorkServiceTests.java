package com.example.Service;

import com.example.entity.RemindWork;
import com.example.entity.Work;
import com.example.mapper.WorkMapper;
import com.example.service.RemindWorkService;
import com.example.service.WorkService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class WorkServiceTests {


    @Autowired
    private WorkService workService;

    @Autowired
    private RemindWorkService remindWorkService;

    @Test
    public void addWork(){

        Work work = new Work();
        work.setWorkName("zzx");
        workService.addWork(work);

    }

    @Test
    public void queryWork(){


        List<Work> works = workService.queryWork();

        for (Work work : works) {
            System.out.println("work = " + work);
        }
    }

    @Test
    public void addRemindWork(){


        RemindWork remindWork = new RemindWork();
        remindWork.setRemind("545");
        remindWork.setTId(4);
        remindWork.setTeacherName("老师");

        int i = remindWorkService.addRemindWork(remindWork);

        System.out.println("i = " + i);


    }

    @Test
    public void findStudentNameWork(){




        List<Work> studentNameWork = workService.findStudentNameWork("吕");

        for (Work work : studentNameWork) {

            System.out.println("work = " + work);
        }


    }
}

