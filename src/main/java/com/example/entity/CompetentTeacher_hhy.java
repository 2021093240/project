package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompetentTeacher_hhy implements Serializable {
    private Integer ctid;
    private String name;
    List<Teacher_hhy> teachers;

}
