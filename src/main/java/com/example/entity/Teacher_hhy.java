package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher_hhy implements Serializable {
  private Integer teacherId;
  private String teacherName;
  private String education;
  private String contactWay;
  private String percentage;
  private List<Course_hhy> courses;
}
