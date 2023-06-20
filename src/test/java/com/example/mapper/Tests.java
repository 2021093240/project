package com.example.mapper;

import com.example.entity.CompetentTeacher_hhy;
import com.example.entity.Refund_hhy;
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
    @Autowired
    private RefundDao_hhy refundDaoHhy;

    @Test
    public void findAllCompetentTeacher(){
        List<CompetentTeacher_hhy> allCompetentTeacher = ctdh.findAllCompetentTeacher();
        System.err.println(allCompetentTeacher);
    }
    @Test
    public void findTeacher(){
        List<Teacher_hhy> teacherByTeacherId = teacherDaoHhy.findTeacherByCtid(1);
        System.out.println(teacherByTeacherId);
    }
    @Test
    public void findAllRefund(){
        List<Refund_hhy> allRefund = refundDaoHhy.findAllRefund();
        System.out.println("allRefund = " + allRefund);
    }


}
