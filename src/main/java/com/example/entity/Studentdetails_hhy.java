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
    private  String adName;
    private String sdSex;
    private Integer sdAge;
    private String sdAddress;
    private String sdHeadimg;
    private Integer classId;

}
