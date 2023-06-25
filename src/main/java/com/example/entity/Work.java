package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Work implements Serializable {

    private int id;
    private String workName;
    private String sdName;
    private int stuId;
    private boolean warn;
    private String type;
    private String details;
    private Date time;
    private String states;
    private int ctid;
    private String teacherName;
    private int sdId;
    private int tId;

}

