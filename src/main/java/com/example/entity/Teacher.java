package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Serializable {


    private Integer teacherId;
    private String teacherName;
    private String accountId;
    private String education;
    private String contactWay;
    private Date entry_time;
    private int ctid;




}
