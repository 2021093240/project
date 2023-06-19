package com.example.service;

import com.example.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class TeacherServiceTests {
    @Autowired
    private ITeacherService iTeacherService;
    @Test
    public void test(){
        List<Teacher> all = iTeacherService.findAll();
//        System.out.println(all);
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        for (Teacher teacher : all) {
            Date entryTime = teacher.getEntryTime();
            String format = s.format(entryTime);
            System.out.println(format);
        }
    }
}
