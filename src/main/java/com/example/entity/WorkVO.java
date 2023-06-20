package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class WorkVO implements Serializable {

    private int id;
    private Date time ;
    private String workName;
    private String sdName ;
    private Integer sdId ;
    private String teacherName ;
    private String warn ;
    private String type ;
    private String states;

}
