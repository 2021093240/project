package com.example.controller;

import com.example.entity.CompetentTeacher_hhy;
import com.example.entity.Course_hhy;
import com.example.entity.Student_hhy;
import com.example.entity.Teacher_hhy;
import com.example.service.CompetentTeacherService_hhy;
import com.example.service.TeacherService_hhy;
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
    @Autowired
    private TeacherService_hhy tsh;
    int num = 0;
    List<Student_hhy>    students;
    List<Course_hhy> courses;
    @RequestMapping("findAllCompetentTeacher")
    public ResponseResult<List> findAllCompetentTeacher() {
        List<CompetentTeacher_hhy> datas = ctsh.findAllCompetentTeacher();
        for (CompetentTeacher_hhy data : datas) {
            List<Teacher_hhy> teachers = data.getTeachers();
            for (Teacher_hhy teacher : teachers) {
                 courses = teacher.getCourses();
                for (Course_hhy course : courses) {
                      students = course.getStudents();
                    for (Student_hhy studentHhy : students) {
                        Integer status = studentHhy.getStatus();
                        num=0;
                        if (status ==1){
                            num++;
                            System.out.println(students.size());
                            course.setPercentage(String.valueOf((double) num / students.size()*100)+"%");

                        }
                    }

                }

            }

        }
        return ResponseResult.getResponseResult("200", datas);
    }
}
