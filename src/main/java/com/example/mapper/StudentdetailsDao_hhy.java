package com.example.mapper;

import com.example.entity.Studentdetails_hhy;

import java.util.List;

public interface StudentdetailsDao_hhy {
    List<Studentdetails_hhy> findStudentdetailsByCtid(int ctid);
    List<Studentdetails_hhy> findStudentdetailsByStuId(int stuId);
}
