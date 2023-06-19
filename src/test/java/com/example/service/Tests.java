package com.example.service;

import com.example.entity.CompetentTeacher_hhy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Tests {
    @Autowired
    private CompetentTeacherService_hhy ctsh;
    @Test
    public void  findAllCompetentTeacherService(){
        List<CompetentTeacher_hhy> allCompetentTeacher = ctsh.findAllCompetentTeacher();
        System.out.println("allCompetentTeacher = " + allCompetentTeacher);
    }
}
