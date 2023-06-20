package com.example.Mapper;

import com.example.entity.Work;
import com.example.entity.WorkVO;
import com.example.mapper.WorkMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class WorkMapperTests {


    @Autowired
    private WorkMapper workMapper;


    @Test
    public void addWork(){

        Work work = new Work();

        work.setWorkName("zzx");

        int i = workMapper.addWork(work);

        System.out.println("i = " + i);

    }

    @Test
    public void queryWork(){


        List<Work> works = workMapper.queryWork( );

        for (Work work1 : works) {
            System.out.println("work1 = " + work1);
        }

    }

    @Test
    public void findByWorkAll(){

        List<WorkVO> byWorkAll = workMapper.findByWorkAll();

        byWorkAll.forEach(System.out::println);
    }
}
