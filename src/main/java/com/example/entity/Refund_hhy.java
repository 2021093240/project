package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
    private List<Studentdetails_hhy> students;

}
