package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentVO {

    private Integer stuId;
    private Date date;
    private String datetime ;
    private String sdName;
    private Integer sdAge;
    private Integer sdSex ;
    private String sSex ;
    private String sdPhone;
    private String sdAddress;
    private String sdHeadimg ;
    private String status;
    private String teacherName;
    private List<StuParent> teachers ;

}
