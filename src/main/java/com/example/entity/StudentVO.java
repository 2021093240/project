package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentVO {

    private Integer stuId;
    private String status;
    private String sdName;
    private Integer sdAge;
    private String sdPhone;
    private String sdAddress;
    private String sdHeadimg;
    private Date createdTime;

}
