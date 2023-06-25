package com.example.service;

import com.example.entity.Studentdetails_hhy;

import java.util.List;

public interface StudentdetailsService_hhy {
    List<Studentdetails_hhy> findStudentdetailsByCtid(int tid);
    List<Studentdetails_hhy> findStudentdetailsByStuId(int stuId);


}
