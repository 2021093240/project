package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Work implements Serializable {


    private int id;
    private String workName;
    private String studentName;
    private int studentId;
    private int teacherId;
    private int state;
    private String type;
    private String details;


}
