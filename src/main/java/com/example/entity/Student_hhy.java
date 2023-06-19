package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student_hhy implements Serializable {
    private Integer stuId;
    private String date;
    private Integer status;
    private List<Studentdetails_hhy> studentdetails;

}
