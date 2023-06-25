package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RemindWork implements Serializable {

    private int id;
    private String remind;
    private int tId;
    private String teacherName;

}
