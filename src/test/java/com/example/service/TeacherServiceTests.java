package com.example.service;

import com.example.entity.Teacher;
import com.example.mapper.TeacherDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class TeacherServiceTests {
    @Autowired
    private TeacherService teacherService;
    @Test
    public void test(){
        List<Teacher> all = teacherService.findAll();
        System.out.println(all);
    }
}
