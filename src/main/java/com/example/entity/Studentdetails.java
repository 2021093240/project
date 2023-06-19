package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Studentdetails implements Serializable {

    private Integer sdId;
    private Integer ctid;
    private String adName;
    private int sdSex;
    private Integer sdAge;
    private String sdAddress;
    private String sdPhone;
    private String sdHeadimg;
    private int stuId;
    private Integer classId;

}
