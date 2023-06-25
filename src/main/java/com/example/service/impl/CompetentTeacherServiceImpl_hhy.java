package com.example.service.impl;

import com.example.entity.CompetentTeacher_hhy;
import com.example.entity.Page_hhy;
import com.example.mapper.CompetentTeacherDao_hhy;
import com.example.service.CompetentTeacherService_hhy;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompetentTeacherServiceImpl_hhy implements CompetentTeacherService_hhy {
    @Autowired
    private CompetentTeacherDao_hhy ctdh;
    @Override
    public List<CompetentTeacher_hhy> findAllCompetentTeacher(int ctid) {
        return ctdh.findAllCompetentTeacher(ctid);
    }

    @Override
    public PageInfo<CompetentTeacher_hhy> findCompetentTeacherByPage(Page_hhy pageHhy) {
        int Page=pageHhy.getPage();
        int Size=pageHhy.getSize();
        PageHelper.startPage(Page,Size);
        PageInfo<CompetentTeacher_hhy> competentTeacherHhyPageInfo = new PageInfo<>();
        return competentTeacherHhyPageInfo;
    }
}
