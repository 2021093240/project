package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Work implements Serializable {

    private int id;
    private String workName;
    private String studentName;
    private int studentId;
    private String teacherName;
    private boolean warn;
    private String type;
    private String details;
    private Date time;
    private String states;


}

