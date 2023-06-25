package com.example.service;

import com.example.entity.CompetentTeacher_hhy;
import com.example.entity.Page_hhy;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CompetentTeacherService_hhy {
    List<CompetentTeacher_hhy> findAllCompetentTeacher(int ctid);
    PageInfo<CompetentTeacher_hhy> findCompetentTeacherByPage(Page_hhy pageHhy);

}
