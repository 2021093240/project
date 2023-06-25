package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course_hhy implements Serializable {
    private Integer courseId;
    private String courseName;
    private Integer courseMoney;
//    private List<Student_hhy> students;
private List<Studentdetails_hhy> studentdetails;

}
