package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Studentdetails_hhy implements Serializable {
    private Integer sdId;
    private  String sdName;
    private String sdSex;
    private Integer sdAge;
    private String sdAddress;
    private String sdPhone;
    private String sdHeadimg;
    private Integer status;
    private String className;
    private String teacherName;
    private String cause;
    private Integer stuId;
}
