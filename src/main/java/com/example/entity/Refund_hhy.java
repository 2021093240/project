package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Refund_hhy implements Serializable {
    private Integer id;
    private Integer stuId;
    private Integer state;
    private Date refundTime;
    private Date agreeTime;
    private String back01;
    private String sdName;
    private String teacherName;
    private String className;
    private String courseName;
    private String courseMoney;
    private String remind;
//    private List<Studentdetails_hhy> students;

}
