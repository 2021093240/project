package com.example.controller;

import com.example.entity.CompetentTeacher_hhy;
import com.example.entity.Course_hhy;
import com.example.entity.Studentdetails_hhy;
import com.example.entity.Teacher_hhy;
import com.example.service.CompetentTeacherService_hhy;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("competentTeacher")
public class CompetentTeacherController_hhy {
    @Autowired
    private CompetentTeacherService_hhy ctsh;


    List<Studentdetails_hhy> studentdetails;

    @RequestMapping("findAllCompetentTeacher")
    public ResponseResult<List<CompetentTeacher_hhy>> findAllCompetentTeacher(int ctid) {
        int num = 0;
        List<CompetentTeacher_hhy> datas = ctsh.findAllCompetentTeacher(ctid);
        for (CompetentTeacher_hhy data : datas) {

            List<Teacher_hhy> teachers = data.getTeachers();
            for (Teacher_hhy teacher : teachers) {

                List<Course_hhy> courses = teacher.getCourses();
                for (Course_hhy course : courses) {
//                      students = course.getStudents();
                    studentdetails = course.getStudentdetails();
                    num = 0;
                    for (Studentdetails_hhy studentdetail : studentdetails) {
                        Integer status = studentdetail.getStatus();
                            if (status == 1) {
                                num++;
                                double v = (double) num / studentdetails.size() * 100;
                                teacher.setPercentage(String.valueOf(v).substring(0,4) + "%");
                            }
                        }
                }
            }
        }
        System.out.println("datas = " + datas);
        return ResponseResult.getResponseResult("200", datas);
    }

}
