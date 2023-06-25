package com.example.service.impl;

import com.example.entity.Studentdetails_hhy;
import com.example.mapper.StudentdetailsDao_hhy;
import com.example.service.StudentdetailsService_hhy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentdetailsServiceImpl implements StudentdetailsService_hhy {
    @Autowired
    private StudentdetailsDao_hhy sdh;
    @Override
    public List<Studentdetails_hhy> findStudentdetailsByCtid(int tid) {
        return sdh.findStudentdetailsByCtid(tid);
    }

    @Override
    public List<Studentdetails_hhy> findStudentdetailsByStuId(int stuId) {
        return sdh.findStudentdetailsByStuId(stuId);
    }
}
