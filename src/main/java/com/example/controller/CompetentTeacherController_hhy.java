package com.example.controller;

import com.example.entity.*;
import com.example.service.CompetentTeacherService_hhy;
import com.example.service.RefundService_hhy;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("competentTeacher")
public class CompetentTeacherController_hhy {
    @Autowired
    private CompetentTeacherService_hhy ctsh;

    int num = 0;
    List<Studentdetails_hhy> studentdetails;

    @RequestMapping("findAllCompetentTeacher")
    public ResponseResult<List<CompetentTeacher_hhy>> findAllCompetentTeacher() {
        List<CompetentTeacher_hhy> datas = ctsh.findAllCompetentTeacher();
        for (CompetentTeacher_hhy data : datas) {
            List<Teacher_hhy> teachers = data.getTeachers();
            for (Teacher_hhy teacher : teachers) {
                List<Course_hhy> courses = teacher.getCourses();
                for (Course_hhy course : courses) {
//                      students = course.getStudents();
                    studentdetails = course.getStudentdetails();
                    for (Studentdetails_hhy studentdetail : studentdetails) {
                        Integer status = studentdetail.getStatus();

                            num = 0;
                            if (status == 1) {
                                num++;
                                double v = (double) num / studentdetails.size() * 100;

                                teacher.setPercentage(String.valueOf(v).substring(0,4) + "%");
                            } else if (status == 0) {
                                teacher.setPercentage("0%");
                            }
                        }

//                    for (Student_hhy studentHhy : students) {
//
//                        num=0;
//                        if (status ==1){
//                            num++;
//                            teacher.setPercentage(String.valueOf((double) num / students.size()*100)+"%");
//
//                        }else if (status== 0){
//                            teacher.setPercentage("0%");
//                        }
//
//                    }
                }
            }
        }
        System.out.println("datas = " + datas);
        return ResponseResult.getResponseResult("200", datas);
    }

}
