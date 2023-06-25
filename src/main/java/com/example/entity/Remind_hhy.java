package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Remind_hhy implements Serializable {
    private Integer rid;
    private String remind;
    private Integer stuId;
    private Integer tId;
    private String teacherName;
    private String courseName;
    private Integer courseMoney;
    private String sdName;
    private String back01;
    private Integer state;
}
