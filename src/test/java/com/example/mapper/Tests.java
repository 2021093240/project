package com.example.mapper;

import com.example.entity.CompetentTeacher_hhy;
import com.example.entity.Teacher_hhy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Tests {
    @Autowired
    private CompetentTeacherDao_hhy ctdh;
    @Autowired
    private TeacherDao_hhy teacherDaoHhy;

    @Test
    public void findAllCompetentTeacher(){
        List<CompetentTeacher_hhy> allCompetentTeacher = ctdh.findAllCompetentTeacher();
        System.out.println(allCompetentTeacher);
    }
    @Test
    public void findTeacher(){
        Teacher_hhy teacherByTeacherId = teacherDaoHhy.findTeacherByTeacherId(1);
        System.out.println(teacherByTeacherId);
    }
}
