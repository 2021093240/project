package com.example.mapper;

import com.example.entity.Student_hhy;

import java.util.List;

public interface StudentDao_hhy {
    List<Student_hhy> findStudentByCtid(int ctid);
}
