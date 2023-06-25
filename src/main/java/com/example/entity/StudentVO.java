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
    private Integer classId ;
    private Integer courseId ;
    private Integer tid ;
    private Date date;
    private String datetime ;
    private String sdName;
    private Integer sdAge;
    private Integer sdSex ;
    private String sSex ;
    private String sdPhone;
    private String sdAddress;
    private String className ;
    private String sdHeadimg ;
    private Integer status;
    private String teacherId ;
    private String teacherName;

    private Integer id ;
    private String parentName ;
    private String relation ;
    private String phonenum;
    private List<StuParent> relationship ;

}
